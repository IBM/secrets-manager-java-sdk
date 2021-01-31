#!/bin/bash
set -e

print_usage () {
    echo "
usage:
   ./prepare_project.sh -d <project-description> -g <git-repo-url> -s <service-category-description> -c <service-category-name> [-a <parent-artifact-id>]
where:
   -d: specify project description string (e.g. \"IBM Cloud Platform Services Java SDK\")
   -g: specify the git url (e.g. https://github.com/IBM/platform-services-java-sdk)
   -s: specify sdk name string (e.g. \"Platform Services\")
   -c: specify the service category (e.g. platform-services)
   -a: (optional) specify the parent artifact ID (e.g. platform-services). If not provided, the service category will be used.
   -h: view usage instructions
"
}

# Parse flags and arguments
while getopts 'p:d:g:s:c:a:h' flag; do
  case "${flag}" in
    d) PROJECT_DESCRIPTION=${OPTARG} ;;
    g) PROJECT_GIT_URL=${OPTARG} ;;
    s) SDK_NAME=${OPTARG} ;;
    c) SERVICE_CATEGORY=${OPTARG} ;;
    a) PARENT_ARTIFACT_ID=${OPTARG} ;;
    *) print_usage
        exit 1 ;;
  esac
done

if [[ -z "$PROJECT_DESCRIPTION" || -z "$PROJECT_GIT_URL" || -z "$SDK_NAME" || -z "$SERVICE_CATEGORY" ]]; then
    printf "Please provide all required inputs.\n\n"
    print_usage

else
    DIRECTORY_NAME="$( sed 's~-~_~g' <<< "$SERVICE_CATEGORY" )"
    GH_SLUG="$( sed 's~.*.com/~~' <<< "$PROJECT_GIT_URL" )"
    REPO_NAME="$( sed 's~.*/~~' <<< "$GH_SLUG" )"

    if [[ -z "$PARENT_ARTIFACT_ID" ]]; then
        PARENT_ARTIFACT_ID="$SERVICE_CATEGORY"
    fi

    COMMON_ARTIFACT_ID="$PARENT_ARTIFACT_ID-common"

    printf "\n>>>>> Project Initialization In Progress...\n\t PROJECT_DESCRIPTION: ${PROJECT_DESCRIPTION}\n\t PROJECT_GIT_URL: ${PROJECT_GIT_URL}\n\t SDK_NAME: ${SDK_NAME}\n\t SERVICE_CATEGORY: ${SERVICE_CATEGORY}\n\t PARENT_ARTIFACT_ID: ${PARENT_ARTIFACT_ID}\n\t COMMON_ARTIFACT_ID: ${COMMON_ARTIFACT_ID}\n"
    # Remove sample files
    rm -r modules/example-service
    if [ -d modules/examples/src ]; then
        rm -rf modules/examples/src
    fi
    sed -i.bak 's~<module>modules/example-service</module>~<!-- i.e. <module>modules/example-service</module> -->~' pom.xml
    printf "\n>>>>> Example Service files removed."

    # Update pom.xml
    sed -i.bak "s/IBM Cloud My Services Java SDK/${PROJECT_DESCRIPTION}/" pom.xml
    sed -i.bak "s/Java Client Library to access the IBM Cloud My Services/Java Client Library to access the IBM Cloud ${SDK_NAME}/" pom.xml

    sed -i.bak 's~https://github.ibm.com/CloudEngineering/java-sdk-template~'${PROJECT_GIT_URL}'~' pom.xml
    sed -i.bak "s~YOUR BINTRAY REPOSITORY NAME~${REPO_NAME}~" pom.xml
    sed -i.bak "s~YOUR PROJECT'S GITHUB.COM URL~${PROJECT_GIT_URL}~" pom.xml
    sed -i.bak 's~my-services-java-sdk~'${REPO_NAME}'~' pom.xml
    sed -i.bak 's~CloudEngineering/java-sdk-template~'${GH_SLUG}'~' pom.xml

    sed -i.bak 's/my-services-common/'${COMMON_ARTIFACT_ID}'/' pom.xml
    sed -i.bak 's/my-services/'${PARENT_ARTIFACT_ID}'/' pom.xml
    rm pom.xml.bak
    printf "\n>>>>> pom.xml updated."

    # Update service-pom.xml
    sed -i.bak 's/PARENT-ARTIFACTID/'${PARENT_ARTIFACT_ID}'/' service-pom.xml
    sed -i.bak 's/COMMON-ARTIFACTID/'${COMMON_ARTIFACT_ID}'/' service-pom.xml
    rm service-pom.xml.bak
    printf "\n>>>>> service-pom.xml updated."

    # Update modules/common/pom.xml
    sed -i.bak 's/my-services-common/'${COMMON_ARTIFACT_ID}'/' modules/common/pom.xml
    sed -i.bak 's/my-services/'${PARENT_ARTIFACT_ID}'/' modules/common/pom.xml
    sed -i.bak "s/My Services/${SDK_NAME}/" modules/common/pom.xml
    rm modules/common/pom.xml.bak

    # Update & rename modules/common/src/ files
    sed -i.bak 's/my_services/'${DIRECTORY_NAME}'/' modules/common/src/main/java/com/ibm/cloud/my_services/common/SdkCommon.java
    sed -i.bak 's/my-services/'${SERVICE_CATEGORY}'/' modules/common/src/main/java/com/ibm/cloud/my_services/common/SdkCommon.java
    rm modules/common/src/main/java/com/ibm/cloud/my_services/common/SdkCommon.java.bak

    sed -i.bak 's/my_services/'${DIRECTORY_NAME}'/' modules/common/src/test/java/com/ibm/cloud/my_services/test/SdkCommonTest.java
    rm modules/common/src/test/java/com/ibm/cloud/my_services/test/SdkCommonTest.java.bak
    sed -i.bak 's/my_services/'${DIRECTORY_NAME}'/' modules/common/src/test/java/com/ibm/cloud/my_services/test/SdkIntegrationTestBase.java
    rm modules/common/src/test/java/com/ibm/cloud/my_services/test/SdkIntegrationTestBase.java.bak

    printf "\n>>>>> modules/common/src/ files updated."

    if [[ $DIRECTORY_NAME != "my_services" ]]; then
      mv modules/common/src/main/java/com/ibm/cloud/my_services modules/common/src/main/java/com/ibm/cloud/$DIRECTORY_NAME
      mv modules/common/src/test/java/com/ibm/cloud/my_services modules/common/src/test/java/com/ibm/cloud/$DIRECTORY_NAME
      mv modules/common/src/main/resources/my-services.properties modules/common/src/main/resources/$SERVICE_CATEGORY.properties
      printf "\n>>>>> Directory structure updated."
    fi

    # modules/coverage-reports/pom.xml
    sed -i.bak 's/my-services-common/'${COMMON_ARTIFACT_ID}'/' modules/coverage-reports/pom.xml
    sed -i.bak 's/my-services/'${PARENT_ARTIFACT_ID}'/' modules/coverage-reports/pom.xml
    sed -i.bak "s/My Services/${SDK_NAME}/" modules/coverage-reports/pom.xml
    sed -i.bak "/<!-- Copy and update/a\\
<!--" modules/coverage-reports/pom.xml
    sed -i.bak "/<\/dependencies>/i\\
-->" modules/coverage-reports/pom.xml

    rm modules/coverage-reports/pom.xml.bak
    printf "\n>>>>> modules/coverage-reports/pom.xml updated."

    # Update .travis.yml
    sed -i.bak '/# After creating the/,/setup_and_generate.sh/d' .travis.yml
    rm .travis.yml.bak
    printf "\n>>>>> .travis.yml updated."

    # Update documentation
    sed -i.bak "s/^# .*/# ${PROJECT_DESCRIPTION} Version 0.0.1/" README.md
    sed -i.bak "s/travis.ibm.com/travis-ci.com/g" README.md
    sed -i.bak "s/My Services/${SDK_NAME}/" README.md
    sed -i.bak "s/MySDK/${SDK_NAME}/" README.md
    sed -i.bak "s~github.ibm.com/CloudEngineering/java-sdk-template~${PROJECT_GIT_URL}~" README.md
    sed -i.bak "s~<github-repo-url>~${PROJECT_GIT_URL}~" README.md
    sed -i.bak "s/<service-category>/${SERVICE_CATEGORY}/" README.md
    sed -i.bak "s~CloudEngineering/java-sdk-template~${GH_SLUG}~g" README.md
    sed -i.bak "s~^\[Example Service\].*~<!-- [Example Service](https://cloud.ibm.com/apidocs/example-service) | com.ibm.cloud:example-service:0.0.1 -->~" README.md

    rm README.md.bak
    printf "\n>>>>> README.md updated."

    sed -i.bak "s~<github-repo-url>~${PROJECT_GIT_URL}~" CONTRIBUTING.md
    rm CONTRIBUTING.md.bak
    printf "\n>>>>> CONTRIBUTING.md updated."

    printf "\n>>>>> Project Initialized Successfully!\n"
fi
