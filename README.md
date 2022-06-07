# IBM Cloud Secrets Manager Java SDK

A Java client library to interact with
the [IBM Cloud® Secrets Manager APIs](https://cloud.ibm.com/apidocs/secrets-manager).

<details>
<summary>Table of Contents</summary>

* [Overview](#overview)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Authentication](#authentication)
* [Using the SDK](#using-the-sdk)
* [Questions](#questions)
* [Issues](#issues)
* [Contributing](#contributing)
* [License](#license)

</details>

## Overview

The IBM Cloud Secrets Manager Java SDK allows developers to programmatically interact with the following IBM Cloud
services:

Service name | Imported class name
--- | ---
[Secrets Manager](https://cloud.ibm.com/apidocs/secrets-manager) | SecretsManager

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

- An [IBM Cloud account](https://cloud.ibm.com/registration).
- A [Secrets Manager service instance](https://cloud.ibm.com/catalog/services/secrets-manager).
- An [IBM Cloud API key](https://cloud.ibm.com/iam/apikeys) that allows the SDK to access your account.
- Java 8 or above.

## Installation

##### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>secrets-manager</artifactId>
    <version>1.0.41</version>
</dependency>
```

##### Gradle

```gradle
'com.ibm.cloud:secrets-manager:1.0.41'
```

## Authentication

Secrets Manager uses token-based Identity and Access Management (IAM) authentication.

With IAM authentication, you supply an API key that is used to generate an access token. Then, the access token is
included in each API request to Secrets Manager. Access tokens are valid for a limited amount of time and must be
regenerated.

Authentication for this SDK is accomplished by
using [IAM authenticators](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md#authentication). Import
authenticators from `com.ibm.cloud.sdk.core.security`.

### Examples

#### Programmatic credentials

```java
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
...
IamAuthenticator iamAuthenticator = new IamAuthenticator.Builder()
        .apikey("<IBM_CLOUD_API_KEY>")
        .build();
```

To learn more about IAM authenticators and how to use them in your Java application, see
the [IBM Java SDK Core documentation](https://github.com/IBM/java-sdk-core/blob/master/Authentication.md).

## Using the SDK

### Basic usage

- Use the `setServiceUrl` method to set the endpoint URL that is specific to your Secrets Manager service instance. To
  find your endpoint URL, you can copy it from the **Endpoints** page in the Secrets Manager UI.

#### Examples

Construct a service client and use it to create and retrieve a secret from your Secrets Manager instance.

Here's an example `main.java` class file:

```java
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.SecretsManager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.*;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;

import java.util.Collections;

public class main {

    protected static SecretsManager sm;
    protected static IamAuthenticator iamAuthenticator;

    public static void main(String[] args) { 
        iamAuthenticator = new IamAuthenticator.Builder()
              .apikey("IBM_CLOUD_API_KEY")
              .build();
        sm = new SecretsManager("My Secrets-Manager service", iamAuthenticator);
        sm.setServiceUrl("SERVICE_URL");

        // create arbitrary secret
        CollectionMetadata collectionMetadata = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret+json")
                .collectionTotal(Long.parseLong("1"))
                .build();
      ArbitrarySecretResource arbitrarySecretResource = new ArbitrarySecretResource.Builder()
                .name("example-arbitrary-secret")
                .description("Extended description for this secret.")
                .payload("secret-data")
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType("arbitrary")
                .resources(new java.util.ArrayList<>(Collections.singletonList(arbitrarySecretResource)))
                .metadata(collectionMetadata)
                .build();
        Response<CreateSecret> createResp = sm.createSecret(createSecretOptions).execute();

        String secretId = createResp.getResult().resources().get(0).id();

        // get arbitrary secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType("arbitrary")
                .id(secretId)
                .build();
        Response<GetSecret> getResp = sm.getSecret(getSecretOptions).execute();

        String secretPayload = (String) getResp.getResult().getResources().get(0).secretData().get("payload");

        System.out.println("The arbitrary secret payload is: " + secretPayload);
    }

}
```

Replace the `IBM_CLOUD_API_KEY` and `SERVICE_URL` values. Then run your application. You should see the payload of the
arbitrary secret that was created.

For more information and IBM Cloud SDK usage examples for Java, see
the [IBM Cloud SDK Common documentation](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md).

## Questions

If you're having difficulties using this SDK, you can ask questions about this project by
using [Stack Overflow](https://stackoverflow.com/questions/tagged/ibm-cloud+secrets-manager). Be sure to include the `ibm-cloud` and `ibm-secrets-manager` tags.

You can also check out the [Secrets Manager documentation](https://cloud.ibm.com/docs/secrets-manager)
and [API reference](https://cloud.ibm.com/apidocs/secrets-manager) for more information about the service.

## Issues

If you encounter an issue with the project, you're welcome to submit
a [bug report](https://github.com/IBM/secrets-manager-java-sdk/issues) to help us improve.

## Contributing

For general contribution guidelines, see [CONTRIBUTING](CONTRIBUTING.md).

## License

This SDK project is released under the Apache 2.0 license. The license's full text can be found in [LICENSE](LICENSE).
