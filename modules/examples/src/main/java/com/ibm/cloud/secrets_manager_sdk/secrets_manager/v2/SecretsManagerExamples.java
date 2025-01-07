/*
 * (C) Copyright IBM Corp. 2025.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.GsonSingleton;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.Configuration;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationsPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateConfigurationActionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateSecretActionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateSecretLocksBulkOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateSecretVersionActionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateSecretVersionLocksBulkOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretLocksBulkOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretVersionDataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretVersionLocksBulkOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetNotificationsRegistrationTestOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretByNameTypeOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListConfigurationsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretGroupsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretVersionLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretVersionsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretsLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.NotificationsRegistration;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRotateCRLPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateVersionActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSCloudInternetServicesPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSCloudInternetServicesPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.Secret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroup;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroupCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroupPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLock;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLockPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLocksPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionLocksPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadataCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretsLocksPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretsPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.VersionAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the secrets-manager service.
 * <p>
 * The following configuration properties are assumed to be defined:
 * SECRETS_MANAGER_URL=&lt;service base url&gt;
 * SECRETS_MANAGER_AUTH_TYPE=iam
 * SECRETS_MANAGER_APIKEY=&lt;IAM apikey&gt;
 * SECRETS_MANAGER_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 * <p>
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class SecretsManagerExamples {
    private static final Logger logger = LoggerFactory.getLogger(SecretsManagerExamples.class);

    protected SecretsManagerExamples() {
    }

    static {
        System.setProperty("IBM_CREDENTIALS_FILE", "../../secrets_manager_v2.env");
    }

    /**
     * The main() function invokes operations of the secrets-manager service.
     *
     * @param args command-line arguments
     * @throws Exception an error occurred
     */
    @SuppressWarnings("checkstyle:methodlength")
    public static void main(String[] args) throws Exception {
        SecretsManager secretsManagerService = SecretsManager.newInstance();

        // Load up our test-specific config properties.
        Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(SecretsManager.DEFAULT_SERVICE_NAME);

        // Variables to hold link values
        String configurationNameForGetConfigurationLink = null;
        String secretGroupIdForGetSecretGroupLink = null;
        String secretIdForCreateSecretVersionLink = null;
        String secretIdForCreateSecretVersionLocksLink = null;
        String secretIdForGetSecretLink = null;
        String secretIdForGetSecretVersionLink = null;
        String secretIdForListSecretLocksLink = null;
        String secretIdForListSecretVersionLocksLink = null;
        String secretNameLink = null;
        String secretVersionIdForCreateSecretVersionLocksLink = null;
        String secretVersionIdForDeleteSecretVersionLocksLink = null;
        String secretVersionIdForGetSecretVersionLink = null;
        String secretVersionIdForGetSecretVersionMetadataLink = null;
        String secretVersionIdForListSecretVersionLocksLink = null;
        String secretVersionIdForUpdateSecretVersionMetadataLink = null;

        try {
            System.out.println("createSecretGroup() result:");
            // begin-create_secret_group
            CreateSecretGroupOptions createSecretGroupOptions = new CreateSecretGroupOptions.Builder()
                    .name("my-secret-group")
                    .build();

            Response<SecretGroup> response = secretsManagerService.createSecretGroup(createSecretGroupOptions).execute();
            SecretGroup secretGroup = response.getResult();

            System.out.println(secretGroup);
            // end-create_secret_group

            secretGroupIdForGetSecretGroupLink = secretGroup.getId();
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createSecret() result:");
            // begin-create_secret
            ArbitrarySecretPrototype secretPrototypeModel = new ArbitrarySecretPrototype.Builder()
                    .description("Description of my arbitrary secret.")
                    .expirationDate(DateUtils.parseAsDateTime("2030-10-05T11:49:42Z"))
                    .labels(java.util.Arrays.asList("dev", "us-south"))
                    .name("example-arbitrary-secret")
                    .secretGroupId("default")
                    .secretType("arbitrary")
                    .payload("secret-data")
                    .build();
            CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                    .secretPrototype(secretPrototypeModel)
                    .build();

            Response<Secret> response = secretsManagerService.createSecret(createSecretOptions).execute();
            Secret secret = response.getResult();

            System.out.println(secret);
            // end-create_secret

            secretIdForGetSecretLink = secret.getId();
            secretIdForGetSecretVersionLink = secret.getId();
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("updateSecretMetadata() result:");
            // begin-update_secret_metadata
            ArbitrarySecretMetadataPatch secretMetadataPatchModel = new ArbitrarySecretMetadataPatch.Builder()
                    .name("updated-arbitrary-secret-name-example")
                    .description("updated Arbitrary Secret description")
                    .labels(java.util.Arrays.asList("dev", "us-south"))
                    .build();
            Map<String, Object> secretMetadataPatchModelAsPatch = secretMetadataPatchModel.asPatch();
            UpdateSecretMetadataOptions updateSecretMetadataOptions = new UpdateSecretMetadataOptions.Builder()
                    .id(secretIdForGetSecretLink)
                    .secretMetadataPatch(secretMetadataPatchModelAsPatch)
                    .build();

            Response<SecretMetadata> response = secretsManagerService.updateSecretMetadata(updateSecretMetadataOptions).execute();
            SecretMetadata secretMetadata = response.getResult();

            System.out.println(secretMetadata);
            // end-update_secret_metadata

            secretNameLink = secretMetadata.getName();
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("listSecretVersions() result:");
            // begin-list_secret_versions
            ListSecretVersionsOptions listSecretVersionsOptions = new ListSecretVersionsOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .build();

            Response<SecretVersionMetadataCollection> response = secretsManagerService.listSecretVersions(listSecretVersionsOptions).execute();
            SecretVersionMetadataCollection secretVersionMetadataCollection = response.getResult();

            System.out.println(secretVersionMetadataCollection);
            // end-list_secret_versions

            secretVersionIdForGetSecretVersionLink = secretVersionMetadataCollection.getVersions().get(0).getId();
            secretIdForCreateSecretVersionLink = secretVersionMetadataCollection.getVersions().get(0).getSecretId();
            secretVersionIdForGetSecretVersionMetadataLink = secretVersionMetadataCollection.getVersions().get(0).getId();
            secretVersionIdForUpdateSecretVersionMetadataLink = secretVersionMetadataCollection.getVersions().get(0).getId();
            secretIdForCreateSecretVersionLocksLink = secretVersionMetadataCollection.getVersions().get(0).getSecretId();
            secretVersionIdForCreateSecretVersionLocksLink = secretVersionMetadataCollection.getVersions().get(0).getId();
            secretVersionIdForDeleteSecretVersionLocksLink = secretVersionMetadataCollection.getVersions().get(0).getId();
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createSecretLocksBulk() result:");
            // begin-create_secret_locks_bulk
            SecretLockPrototype secretLockPrototypeModel = new SecretLockPrototype.Builder()
                    .name("lock-example-1")
                    .description("lock for consumer 1")
                    .build();
            CreateSecretLocksBulkOptions createSecretLocksBulkOptions = new CreateSecretLocksBulkOptions.Builder()
                    .id(secretIdForGetSecretLink)
                    .locks(java.util.Arrays.asList(secretLockPrototypeModel))
                    .build();

            Response<SecretLocks> response = secretsManagerService.createSecretLocksBulk(createSecretLocksBulkOptions).execute();
            SecretLocks secretLocks = response.getResult();

            System.out.println(secretLocks);
            // end-create_secret_locks_bulk

            secretIdForListSecretLocksLink = secretLocks.getSecretId();
            secretIdForListSecretVersionLocksLink = secretLocks.getSecretId();
            secretVersionIdForListSecretVersionLocksLink = secretLocks.getVersions().get(0).getVersionId();
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createConfiguration() result:");
            // begin-create_configuration
            PublicCertificateConfigurationDNSCloudInternetServicesPrototype configurationPrototypeModel = new PublicCertificateConfigurationDNSCloudInternetServicesPrototype.Builder()
                    .configType("public_cert_configuration_dns_cloud_internet_services")
                    .name("example-cloud-internet-services-config")
                    .cloudInternetServicesApikey("5ipu_ykv0PMp2MhxQnDMn7VzrkSlBwi3BOI8uthi_EXZ")
                    .cloudInternetServicesCrn("crn:v1:bluemix:public:internet-svcs:global:a/128e84fcca45c1224aae525d31ef2b52:009a0357-1460-42b4-b903-10580aba7dd8::")
                    .build();
            CreateConfigurationOptions createConfigurationOptions = new CreateConfigurationOptions.Builder()
                    .configurationPrototype(configurationPrototypeModel)
                    .build();

            Response<Configuration> response = secretsManagerService.createConfiguration(createConfigurationOptions).execute();
            Configuration configuration = response.getResult();

            System.out.println(configuration);
            // end-create_configuration

            configurationNameForGetConfigurationLink = configuration.getName();
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("listSecretGroups() result:");
            // begin-list_secret_groups
            ListSecretGroupsOptions listSecretGroupsOptions = new ListSecretGroupsOptions();

            Response<SecretGroupCollection> response = secretsManagerService.listSecretGroups(listSecretGroupsOptions).execute();
            SecretGroupCollection secretGroupCollection = response.getResult();

            System.out.println(secretGroupCollection);
            // end-list_secret_groups
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("getSecretGroup() result:");
            // begin-get_secret_group
            GetSecretGroupOptions getSecretGroupOptions = new GetSecretGroupOptions.Builder()
                    .id(secretGroupIdForGetSecretGroupLink)
                    .build();

            Response<SecretGroup> response = secretsManagerService.getSecretGroup(getSecretGroupOptions).execute();
            SecretGroup secretGroup = response.getResult();

            System.out.println(secretGroup);
            // end-get_secret_group
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("updateSecretGroup() result:");
            // begin-update_secret_group
            SecretGroupPatch secretGroupPatchModel = new SecretGroupPatch.Builder()
                    .build();
            Map<String, Object> secretGroupPatchModelAsPatch = secretGroupPatchModel.asPatch();
            UpdateSecretGroupOptions updateSecretGroupOptions = new UpdateSecretGroupOptions.Builder()
                    .id(secretGroupIdForGetSecretGroupLink)
                    .secretGroupPatch(secretGroupPatchModelAsPatch)
                    .build();

            Response<SecretGroup> response = secretsManagerService.updateSecretGroup(updateSecretGroupOptions).execute();
            SecretGroup secretGroup = response.getResult();

            System.out.println(secretGroup);
            // end-update_secret_group
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("listSecrets() result:");
            // begin-list_secrets
            ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
                    .limit(Long.valueOf("10"))
                    .sort("created_at")
                    .search("example")
                    .groups(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"))
                    .secretTypes(java.util.Arrays.asList("arbitrary", "kv"))
                    .matchAllLabels(java.util.Arrays.asList("dev", "us-south"))
                    .build();

            SecretsPager pager = new SecretsPager(secretsManagerService, listSecretsOptions);
            List<SecretMetadata> allResults = new ArrayList<>();
            while (pager.hasNext()) {
                List<SecretMetadata> nextPage = pager.getNext();
                allResults.addAll(nextPage);
            }

            System.out.println(GsonSingleton.getGson().toJson(allResults));
            // end-list_secrets
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("getSecret() result:");
            // begin-get_secret
            GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                    .id(secretIdForGetSecretLink)
                    .build();

            Response<Secret> response = secretsManagerService.getSecret(getSecretOptions).execute();
            Secret secret = response.getResult();

            System.out.println(secret);
            // end-get_secret
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("getSecretMetadata() result:");
            // begin-get_secret_metadata
            GetSecretMetadataOptions getSecretMetadataOptions = new GetSecretMetadataOptions.Builder()
                    .id(secretIdForGetSecretLink)
                    .build();

            Response<SecretMetadata> response = secretsManagerService.getSecretMetadata(getSecretMetadataOptions).execute();
            SecretMetadata secretMetadata = response.getResult();

            System.out.println(secretMetadata);
            // end-get_secret_metadata
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createSecretAction() result:");
            // begin-create_secret_action
            PrivateCertificateActionRevokePrototype secretActionPrototypeModel = new PrivateCertificateActionRevokePrototype.Builder()
                    .actionType("private_cert_action_revoke_certificate")
                    .build();
            CreateSecretActionOptions createSecretActionOptions = new CreateSecretActionOptions.Builder()
                    .id(secretIdForGetSecretLink)
                    .secretActionPrototype(secretActionPrototypeModel)
                    .build();

            Response<SecretAction> response = secretsManagerService.createSecretAction(createSecretActionOptions).execute();
            SecretAction secretAction = response.getResult();

            System.out.println(secretAction);
            // end-create_secret_action
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("getSecretByNameType() result:");
            // begin-get_secret_by_name_type
            GetSecretByNameTypeOptions getSecretByNameTypeOptions = new GetSecretByNameTypeOptions.Builder()
                    .secretType("arbitrary")
                    .name(secretNameLink)
                    .secretGroupName("default")
                    .build();

            Response<Secret> response = secretsManagerService.getSecretByNameType(getSecretByNameTypeOptions).execute();
            Secret secret = response.getResult();

            System.out.println(secret);
            // end-get_secret_by_name_type
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createSecretVersion() result:");
            // begin-create_secret_version
            ArbitrarySecretVersionPrototype secretVersionPrototypeModel = new ArbitrarySecretVersionPrototype.Builder()
                    .payload("updated secret credentials")
                    .build();
            CreateSecretVersionOptions createSecretVersionOptions = new CreateSecretVersionOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .secretVersionPrototype(secretVersionPrototypeModel)
                    .build();

            Response<SecretVersion> response = secretsManagerService.createSecretVersion(createSecretVersionOptions).execute();
            SecretVersion secretVersion = response.getResult();

            System.out.println(secretVersion);
            // end-create_secret_version
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("getSecretVersion() result:");
            // begin-get_secret_version
            GetSecretVersionOptions getSecretVersionOptions = new GetSecretVersionOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .id(secretVersionIdForGetSecretVersionLink)
                    .build();

            Response<SecretVersion> response = secretsManagerService.getSecretVersion(getSecretVersionOptions).execute();
            SecretVersion secretVersion = response.getResult();

            System.out.println(secretVersion);
            // end-get_secret_version
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("getSecretVersionMetadata() result:");
            // begin-get_secret_version_metadata
            GetSecretVersionMetadataOptions getSecretVersionMetadataOptions = new GetSecretVersionMetadataOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .id(secretVersionIdForGetSecretVersionLink)
                    .build();

            Response<SecretVersionMetadata> response = secretsManagerService.getSecretVersionMetadata(getSecretVersionMetadataOptions).execute();
            SecretVersionMetadata secretVersionMetadata = response.getResult();

            System.out.println(secretVersionMetadata);
            // end-get_secret_version_metadata
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("updateSecretVersionMetadata() result:");
            // begin-update_secret_version_metadata
            SecretVersionMetadataPatch secretVersionMetadataPatchModel = new SecretVersionMetadataPatch.Builder()
                    .build();
            Map<String, Object> secretVersionMetadataPatchModelAsPatch = secretVersionMetadataPatchModel.asPatch();
            UpdateSecretVersionMetadataOptions updateSecretVersionMetadataOptions = new UpdateSecretVersionMetadataOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .id(secretVersionIdForGetSecretVersionLink)
                    .secretVersionMetadataPatch(secretVersionMetadataPatchModelAsPatch)
                    .build();

            Response<SecretVersionMetadata> response = secretsManagerService.updateSecretVersionMetadata(updateSecretVersionMetadataOptions).execute();
            SecretVersionMetadata secretVersionMetadata = response.getResult();

            System.out.println(secretVersionMetadata);
            // end-update_secret_version_metadata
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createSecretVersionAction() result:");
            // begin-create_secret_version_action
            PrivateCertificateVersionActionRevokePrototype secretVersionActionPrototypeModel = new PrivateCertificateVersionActionRevokePrototype.Builder()
                    .actionType("private_cert_action_revoke_certificate")
                    .build();
            CreateSecretVersionActionOptions createSecretVersionActionOptions = new CreateSecretVersionActionOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .id(secretVersionIdForGetSecretVersionLink)
                    .secretVersionActionPrototype(secretVersionActionPrototypeModel)
                    .build();

            Response<VersionAction> response = secretsManagerService.createSecretVersionAction(createSecretVersionActionOptions).execute();
            VersionAction versionAction = response.getResult();

            System.out.println(versionAction);
            // end-create_secret_version_action
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("listSecretsLocks() result:");
            // begin-list_secrets_locks
            ListSecretsLocksOptions listSecretsLocksOptions = new ListSecretsLocksOptions.Builder()
                    .limit(Long.valueOf("10"))
                    .search("example")
                    .groups(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"))
                    .build();

            SecretsLocksPager pager = new SecretsLocksPager(secretsManagerService, listSecretsLocksOptions);
            List<SecretLocks> allResults = new ArrayList<>();
            while (pager.hasNext()) {
                List<SecretLocks> nextPage = pager.getNext();
                allResults.addAll(nextPage);
            }

            System.out.println(GsonSingleton.getGson().toJson(allResults));
            // end-list_secrets_locks
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("listSecretLocks() result:");
            // begin-list_secret_locks
            ListSecretLocksOptions listSecretLocksOptions = new ListSecretLocksOptions.Builder()
                    .id(secretIdForGetSecretLink)
                    .limit(Long.valueOf("10"))
                    .sort("name")
                    .search("example")
                    .build();

            SecretLocksPager pager = new SecretLocksPager(secretsManagerService, listSecretLocksOptions);
            List<SecretLock> allResults = new ArrayList<>();
            while (pager.hasNext()) {
                List<SecretLock> nextPage = pager.getNext();
                allResults.addAll(nextPage);
            }

            System.out.println(GsonSingleton.getGson().toJson(allResults));
            // end-list_secret_locks
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createSecretVersionLocksBulk() result:");
            // begin-create_secret_version_locks_bulk
            SecretLockPrototype secretLockPrototypeModel = new SecretLockPrototype.Builder()
                    .name("lock-example-1")
                    .description("lock for consumer 1")
                    .build();
            CreateSecretVersionLocksBulkOptions createSecretVersionLocksBulkOptions = new CreateSecretVersionLocksBulkOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .id(secretVersionIdForGetSecretVersionLink)
                    .locks(java.util.Arrays.asList(secretLockPrototypeModel))
                    .build();

            Response<SecretLocks> response = secretsManagerService.createSecretVersionLocksBulk(createSecretVersionLocksBulkOptions).execute();
            SecretLocks secretLocks = response.getResult();

            System.out.println(secretLocks);
            // end-create_secret_version_locks_bulk
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("listSecretVersionLocks() result:");
            // begin-list_secret_version_locks
            ListSecretVersionLocksOptions listSecretVersionLocksOptions = new ListSecretVersionLocksOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .id(secretVersionIdForGetSecretVersionLink)
                    .limit(Long.valueOf("10"))
                    .sort("name")
                    .search("example")
                    .build();

            SecretVersionLocksPager pager = new SecretVersionLocksPager(secretsManagerService, listSecretVersionLocksOptions);
            List<SecretLock> allResults = new ArrayList<>();
            while (pager.hasNext()) {
                List<SecretLock> nextPage = pager.getNext();
                allResults.addAll(nextPage);
            }

            System.out.println(GsonSingleton.getGson().toJson(allResults));
            // end-list_secret_version_locks
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("listConfigurations() result:");
            // begin-list_configurations
            ListConfigurationsOptions listConfigurationsOptions = new ListConfigurationsOptions.Builder()
                    .limit(Long.valueOf("10"))
                    .sort("config_type")
                    .search("example")
                    .secretTypes(java.util.Arrays.asList("iam_credentials", "public_cert", "private_cert"))
                    .build();

            ConfigurationsPager pager = new ConfigurationsPager(secretsManagerService, listConfigurationsOptions);
            List<ConfigurationMetadata> allResults = new ArrayList<>();
            while (pager.hasNext()) {
                List<ConfigurationMetadata> nextPage = pager.getNext();
                allResults.addAll(nextPage);
            }

            System.out.println(GsonSingleton.getGson().toJson(allResults));
            // end-list_configurations
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("getConfiguration() result:");
            // begin-get_configuration
            GetConfigurationOptions getConfigurationOptions = new GetConfigurationOptions.Builder()
                    .name(configurationNameForGetConfigurationLink)
                    .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
                    .build();

            Response<Configuration> response = secretsManagerService.getConfiguration(getConfigurationOptions).execute();
            Configuration configuration = response.getResult();

            System.out.println(configuration);
            // end-get_configuration
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("updateConfiguration() result:");
            // begin-update_configuration
            PublicCertificateConfigurationDNSCloudInternetServicesPatch configurationPatchModel = new PublicCertificateConfigurationDNSCloudInternetServicesPatch.Builder()
                    .cloudInternetServicesApikey("5ipu_ykv0PMp2MhxQnDMn7VzrkSlBwi3BOI8uthi_EXZ")
                    .cloudInternetServicesCrn("crn:v1:bluemix:public:internet-svcs:global:a/128e84fcca45c1224aae525d31ef2b52:009a0357-1460-42b4-b903-10580aba7dd8::")
                    .build();
            Map<String, Object> configurationPatchModelAsPatch = configurationPatchModel.asPatch();
            UpdateConfigurationOptions updateConfigurationOptions = new UpdateConfigurationOptions.Builder()
                    .name(configurationNameForGetConfigurationLink)
                    .configurationPatch(configurationPatchModelAsPatch)
                    .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
                    .build();

            Response<Configuration> response = secretsManagerService.updateConfiguration(updateConfigurationOptions).execute();
            Configuration configuration = response.getResult();

            System.out.println(configuration);
            // end-update_configuration
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createConfigurationAction() result:");
            // begin-create_configuration_action
            PrivateCertificateConfigurationActionRotateCRLPrototype configurationActionPrototypeModel = new PrivateCertificateConfigurationActionRotateCRLPrototype.Builder()
                    .actionType("private_cert_configuration_action_rotate_crl")
                    .build();
            CreateConfigurationActionOptions createConfigurationActionOptions = new CreateConfigurationActionOptions.Builder()
                    .name(configurationNameForGetConfigurationLink)
                    .configActionPrototype(configurationActionPrototypeModel)
                    .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
                    .build();

            Response<ConfigurationAction> response = secretsManagerService.createConfigurationAction(createConfigurationActionOptions).execute();
            ConfigurationAction configurationAction = response.getResult();

            System.out.println(configurationAction);
            // end-create_configuration_action
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("createNotificationsRegistration() result:");
            // begin-create_notifications_registration
            CreateNotificationsRegistrationOptions createNotificationsRegistrationOptions = new CreateNotificationsRegistrationOptions.Builder()
                    .eventNotificationsInstanceCrn("crn:v1:bluemix:public:event-notifications:us-south:a/22018f3c34ff4ff193698d15ca316946:578ad1a4-2fd8-4e66-95d5-79a842ba91f8::")
                    .eventNotificationsSourceName("My Secrets Manager")
                    .eventNotificationsSourceDescription("Optional description of this source in an Event Notifications instance.")
                    .build();

            Response<NotificationsRegistration> response = secretsManagerService.createNotificationsRegistration(createNotificationsRegistrationOptions).execute();
            NotificationsRegistration notificationsRegistration = response.getResult();

            System.out.println(notificationsRegistration);
            // end-create_notifications_registration
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("getNotificationsRegistration() result:");
            // begin-get_notifications_registration
            GetNotificationsRegistrationOptions getNotificationsRegistrationOptions = new GetNotificationsRegistrationOptions();

            Response<NotificationsRegistration> response = secretsManagerService.getNotificationsRegistration(getNotificationsRegistrationOptions).execute();
            NotificationsRegistration notificationsRegistration = response.getResult();

            System.out.println(notificationsRegistration);
            // end-get_notifications_registration
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            // begin-get_notifications_registration_test
            GetNotificationsRegistrationTestOptions getNotificationsRegistrationTestOptions = new GetNotificationsRegistrationTestOptions();

            Response<Void> response = secretsManagerService.getNotificationsRegistrationTest(getNotificationsRegistrationTestOptions).execute();
            // end-get_notifications_registration_test
            System.out.printf("getNotificationsRegistrationTest() response status code: %d%n", response.getStatusCode());
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            // begin-delete_secret_group
            DeleteSecretGroupOptions deleteSecretGroupOptions = new DeleteSecretGroupOptions.Builder()
                    .id(secretGroupIdForGetSecretGroupLink)
                    .build();

            Response<Void> response = secretsManagerService.deleteSecretGroup(deleteSecretGroupOptions).execute();
            // end-delete_secret_group
            System.out.printf("deleteSecretGroup() response status code: %d%n", response.getStatusCode());
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            // begin-delete_secret_version_data
            DeleteSecretVersionDataOptions deleteSecretVersionDataOptions = new DeleteSecretVersionDataOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .id(secretVersionIdForGetSecretVersionLink)
                    .build();

            Response<Void> response = secretsManagerService.deleteSecretVersionData(deleteSecretVersionDataOptions).execute();
            // end-delete_secret_version_data
            System.out.printf("deleteSecretVersionData() response status code: %d%n", response.getStatusCode());
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("deleteSecretLocksBulk() result:");
            // begin-delete_secret_locks_bulk
            DeleteSecretLocksBulkOptions deleteSecretLocksBulkOptions = new DeleteSecretLocksBulkOptions.Builder()
                    .id(secretIdForGetSecretLink)
                    .name(java.util.Arrays.asList("lock-example-1"))
                    .build();

            Response<SecretLocks> response = secretsManagerService.deleteSecretLocksBulk(deleteSecretLocksBulkOptions).execute();
            SecretLocks secretLocks = response.getResult();

            System.out.println(secretLocks);
            // end-delete_secret_locks_bulk
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            System.out.println("deleteSecretVersionLocksBulk() result:");
            // begin-delete_secret_version_locks_bulk
            DeleteSecretVersionLocksBulkOptions deleteSecretVersionLocksBulkOptions = new DeleteSecretVersionLocksBulkOptions.Builder()
                    .secretId(secretIdForGetSecretLink)
                    .id(secretVersionIdForGetSecretVersionLink)
                    .name(java.util.Arrays.asList("lock-example-1"))
                    .build();

            Response<SecretLocks> response = secretsManagerService.deleteSecretVersionLocksBulk(deleteSecretVersionLocksBulkOptions).execute();
            SecretLocks secretLocks = response.getResult();

            System.out.println(secretLocks);
            // end-delete_secret_version_locks_bulk
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            // begin-delete_secret
            DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                    .id(secretIdForGetSecretLink)
                    .build();

            Response<Void> response = secretsManagerService.deleteSecret(deleteSecretOptions).execute();
            // end-delete_secret
            System.out.printf("deleteSecret() response status code: %d%n", response.getStatusCode());
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            // begin-delete_configuration
            DeleteConfigurationOptions deleteConfigurationOptions = new DeleteConfigurationOptions.Builder()
                    .name(configurationNameForGetConfigurationLink)
                    .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
                    .build();

            Response<Void> response = secretsManagerService.deleteConfiguration(deleteConfigurationOptions).execute();
            // end-delete_configuration
            System.out.printf("deleteConfiguration() response status code: %d%n", response.getStatusCode());
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }

        try {
            // begin-delete_notifications_registration
            DeleteNotificationsRegistrationOptions deleteNotificationsRegistrationOptions = new DeleteNotificationsRegistrationOptions();

            Response<Void> response = secretsManagerService.deleteNotificationsRegistration(deleteNotificationsRegistrationOptions).execute();
            // end-delete_notifications_registration
            System.out.printf("deleteNotificationsRegistration() response status code: %d%n", response.getStatusCode());
        } catch (ServiceResponseException e) {
            logger.error(String.format("Service returned status code %s: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
        }
    }
}
