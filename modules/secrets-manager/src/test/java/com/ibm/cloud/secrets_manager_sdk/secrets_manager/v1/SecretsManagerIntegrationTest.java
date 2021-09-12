package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.service.exception.ConflictException;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.*;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Integration test class for the IbmCloudSecretsManagerApi service.
 */
@PrepareForTest({EnvironmentUtils.class})
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class SecretsManagerIntegrationTest extends PowerMockTestCase {

    protected SecretsManager secretsManager;
    protected IamAuthenticator iamAuthenticator;

    @BeforeClass
    public void initTest() {
        iamAuthenticator = new IamAuthenticator.Builder()
                .apikey(System.getenv("SECRETS_MANAGER_API_APIKEY"))
                .url(System.getenv("AUTH_URL"))
                .build();
        secretsManager = new SecretsManager("Secrets Manager integration test", iamAuthenticator);
        secretsManager.setServiceUrl(System.getenv("SERVICE_URL"));
    }

    @Test
    public void testArbitrarySecret() {
        // create arbitrary secret
        CollectionMetadata collectionMetadata = new CollectionMetadata.Builder()
                .collectionType(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_JSON)
                .collectionTotal(Long.parseLong("1"))
                .build();
        ArbitrarySecretResource secretResource = new ArbitrarySecretResource.Builder()
                .name(generateName())
                .description("Integration test generated")
                .labels(new java.util.ArrayList<>(java.util.Arrays.asList("label1", "label2")))
                .expirationDate(generateExpirationDate())
                .payload("secret-data")
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType(SecretResource.SecretType.ARBITRARY)
                .metadata(collectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();
        Response<CreateSecret> createResp = secretsManager.createSecret(createSecretOptions).execute();
        assertEquals(createResp.getStatusCode(), 200);

        String secretId = createResp.getResult().resources().get(0).id();

        // get arbitrary secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType(SecretResource.SecretType.ARBITRARY)
                .id(secretId)
                .build();
        Response<GetSecret> getResp = secretsManager.getSecret(getSecretOptions).execute();
        assertEquals(getResp.getStatusCode(), 200);
        assertEquals(getResp.getResult().getResources().get(0).secretData().get("payload"), "secret-data");

        // delete arbitrary secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType(SecretResource.SecretType.ARBITRARY)
                .id(secretId)
                .build();
        Response<Void> delResp = secretsManager.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delResp.getStatusCode(), 204);
    }

    @Test
    public void testSecretGroup() {
        // create a secret group
        CollectionMetadata secretGroupCollectionMetadata = new CollectionMetadata.Builder()
                .collectionType(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_GROUP_JSON)
                .collectionTotal(Long.parseLong("1"))
                .build();
        SecretGroupResource secretGroupResource = new SecretGroupResource.Builder()
                .name(generateName())
                .description("Integration test generated")
                .build();
        CreateSecretGroupOptions createSecretGroupOptions = new CreateSecretGroupOptions.Builder()
                .metadata(secretGroupCollectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretGroupResource)))
                .build();
        Response<SecretGroupDef> createSecretGroupResp = secretsManager.createSecretGroup(createSecretGroupOptions).execute();
        assertEquals(createSecretGroupResp.getStatusCode(), 200);

        String secretGroupId = createSecretGroupResp.getResult().resources().get(0).getId();

        // create username_password secret and associate it with our secret group
        CollectionMetadata secretCollectionMetadata = new CollectionMetadata.Builder()
                .collectionType(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_JSON)
                .collectionTotal(Long.parseLong("1"))
                .build();
        UsernamePasswordSecretResource secretResource = new UsernamePasswordSecretResource.Builder()
                .name(generateName())
                .description("Integration test generated")
                .labels(new java.util.ArrayList<>(java.util.Arrays.asList("label1")))
                .expirationDate(generateExpirationDate())
                .secretGroupId(secretGroupId)
                .username("test_user")
                .password("test_password")
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType(SecretResource.SecretType.USERNAME_PASSWORD)
                .metadata(secretCollectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();
        Response<CreateSecret> createSecretResp = secretsManager.createSecret(createSecretOptions).execute();
        assertEquals(createSecretResp.getStatusCode(), 200);

        String secretId = createSecretResp.getResult().resources().get(0).id();

        // get username_password secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType(SecretResource.SecretType.USERNAME_PASSWORD)
                .id(secretId)
                .build();
        Response<GetSecret> getSecretResp = secretsManager.getSecret(getSecretOptions).execute();
        assertEquals(getSecretResp.getStatusCode(), 200);

        // delete username_password secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType(SecretResource.SecretType.USERNAME_PASSWORD)
                .id(secretId)
                .build();
        Response<Void> delSecretResp = secretsManager.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delSecretResp.getStatusCode(), 204);

        // delete secret group
        DeleteSecretGroupOptions deleteSecretGroupOptions = new DeleteSecretGroupOptions.Builder()
                .id(secretGroupId)
                .build();
        Response<Void> delSecretGroupResp = secretsManager.deleteSecretGroup(deleteSecretGroupOptions).execute();
        assertEquals(delSecretGroupResp.getStatusCode(), 204);
    }

    @Test
    public void testSecretRotationPolicy() {
        CollectionMetadata secretCollectionMetadata = new CollectionMetadata.Builder()
                .collectionType(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_JSON)
                .collectionTotal(Long.parseLong("1"))
                .build();
        UsernamePasswordSecretResource secretResource = new UsernamePasswordSecretResource.Builder()
                .name(generateName())
                .description("Integration test generated")
                .labels(new java.util.ArrayList<>(java.util.Arrays.asList("label1")))
                .expirationDate(generateExpirationDate())
                .username("test_user")
                .password("test_password")
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType(SecretResource.SecretType.USERNAME_PASSWORD)
                .metadata(secretCollectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();
        Response<CreateSecret> createSecretResp = secretsManager.createSecret(createSecretOptions).execute();
        assertEquals(createSecretResp.getStatusCode(), 200);

        String secretId = createSecretResp.getResult().resources().get(0).id();

        // Create a rotation policy for the username_password secret type we have just created
        CollectionMetadata policyCollectionMetadata = new CollectionMetadata.Builder()
                .collectionType(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_POLICY_JSON)
                .collectionTotal(Long.parseLong("1"))
                .build();
        SecretPolicyRotationRotation rotation = new SecretPolicyRotationRotationPolicyRotation.Builder()
                .interval(Long.parseLong("1"))
                .unit("month")
                .build();
        SecretPolicyRotation secretPolicyRotation = new SecretPolicyRotation.Builder()
                .type(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_POLICY_JSON)
                .rotation(rotation)
                .build();
        PutPolicyOptions putPolicyOptions = new PutPolicyOptions.Builder()
                .secretType(SecretResource.SecretType.USERNAME_PASSWORD)
                .id(secretId)
                .metadata(policyCollectionMetadata)
                .resources(new java.util.ArrayList<>(java.util.Arrays.asList(secretPolicyRotation)))
                .policy("rotation")
                .build();
        Response<GetSecretPolicies> putPolicyResp = secretsManager.putPolicy(putPolicyOptions).execute();
        assertEquals(putPolicyResp.getStatusCode(), 200);

        // get username_password secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType(SecretResource.SecretType.USERNAME_PASSWORD)
                .id(secretId)
                .build();
        Response<GetSecret> getSecretResp = secretsManager.getSecret(getSecretOptions).execute();
        assertEquals(getSecretResp.getStatusCode(), 200);
        assertEquals(getSecretResp.getResult().getResources().get(0).secretData().get("username"), "test_user");
        assertEquals(getSecretResp.getResult().getResources().get(0).secretData().get("password"), "test_password");
        assertNotNull(getSecretResp.getResult().getResources().get(0).nextRotationDate());

        // delete username_password secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType(SecretResource.SecretType.USERNAME_PASSWORD)
                .id(secretId)
                .build();
        Response<Void> delSecretResp = secretsManager.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delSecretResp.getStatusCode(), 204);
    }

    @Test
    public void testCreateSecretConflict() {
        String secretName = "conflict_integration_test_secret";
        // create arbitrary secret
        CollectionMetadata collectionMetadata = new CollectionMetadata.Builder()
                .collectionType(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_JSON)
                .collectionTotal(Long.parseLong("1"))
                .build();
        ArbitrarySecretResource secretResource = new ArbitrarySecretResource.Builder()
                .name(secretName)
                .description("Integration test generated")
                .payload("secret-data")
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType(SecretResource.SecretType.ARBITRARY)
                .metadata(collectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();
        Response<CreateSecret> createResp = secretsManager.createSecret(createSecretOptions).execute();
        assertEquals(createResp.getStatusCode(), 200);

        String secretId = createResp.getResult().resources().get(0).id();

        // now reuse the same secret name under the same secret type, should result in a conflict error
        try {
            createResp = secretsManager.createSecret(createSecretOptions).execute();
        } catch (ConflictException e) {
            assertEquals(e.getStatusCode(), 409);
            assertEquals(e.getMessage(), "Conflict");
        }
        // delete arbitrary secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType(SecretResource.SecretType.ARBITRARY)
                .id(secretId)
                .build();
        Response<Void> delResp = secretsManager.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delResp.getStatusCode(), 204);
    }

    @Test
    public void testImportedCertSecret() {
        String testCertificate = "-----BEGIN CERTIFICATE-----\r\nMIICsDCCAhmgAwIBAgIJALrogcLQxAOqMA0GCSqGSIb3DQEBCwUAMHExCzAJBgNV\r\nBAYTAnVzMREwDwYDVQQIDAh1cy1zb3V0aDEPMA0GA1UEBwwGRGFsLTEwMQwwCgYD\r\nVQQKDANJQk0xEzARBgNVBAsMCkNsb3VkQ2VydHMxGzAZBgNVBAMMEiouY2VydG1n\r\nbXQtZGV2LmNvbTAeFw0xODA0MjUwODM5NTlaFw00NTA5MTAwODM5NTlaMHExCzAJ\r\nBgNVBAYTAnVzMREwDwYDVQQIDAh1cy1zb3V0aDEPMA0GA1UEBwwGRGFsLTEwMQww\r\nCgYDVQQKDANJQk0xEzARBgNVBAsMCkNsb3VkQ2VydHMxGzAZBgNVBAMMEiouY2Vy\r\ndG1nbXQtZGV2LmNvbTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEAmy/4uEEw\r\nAn75rBuAIv5zi+1b2ycUnlw94x3QzYtY3QHQysFu73U3rczVHOsQNd9VIoC0z8py\r\npMZZu7W6dv6cjOSXlpiLfd7Y9TWzO43mNUH0qrnFpSgXM9ZXN3PJWjmTH3yxAsdK\r\nd5wtRdSv9AwrHWo8hHoTumoXYNMDuehyVJ8CAwEAAaNQME4wHQYDVR0OBBYEFMNC\r\nbcvQ+Smn8ikBDrMKhPc4C+f5MB8GA1UdIwQYMBaAFMNCbcvQ+Smn8ikBDrMKhPc4\r\nC+f5MAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQELBQADgYEAFe2fCmzTcmCHeijV\r\nq0+EOvMRVNF/FTYyjb24gUGTbouZOkfv7JK94lAt/u5mPhpftYX+b1wUlkz0Kyl5\r\n4IgM0XXpcPYDdxQ87c0l/nAUF7Pi++u7CVmJBlclyDOL6AmBpUE0HyquQT4rSp/K\r\n+5qcqSxVjznd5XgQrWQGHLI2tnY=\r\n-----END CERTIFICATE-----";
        String testPrivateKey = "-----BEGIN PRIVATE KEY-----\r\nMIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJsv+LhBMAJ++awb\r\ngCL+c4vtW9snFJ5cPeMd0M2LWN0B0MrBbu91N63M1RzrEDXfVSKAtM/KcqTGWbu1\r\nunb+nIzkl5aYi33e2PU1szuN5jVB9Kq5xaUoFzPWVzdzyVo5kx98sQLHSnecLUXU\r\nr/QMKx1qPIR6E7pqF2DTA7noclSfAgMBAAECgYBsFjd3rf+QXXvsQaM3vF4iIYoO\r\n0+NqgPihzUx3PQ0BsZgJAD0SD2ReawIsCBTcUNbtFxPYfjrnRTeOo/5hjujdq0ei\r\nx1PDh4qzDDPRxOdkCHjfMQb/FBNQvhSh+nQsylCm1qZeaOwgqiM8johDvQ8XLaql\r\n/uNcc1kGXHHd7hKQkQJBAMv04YfjtDxdfanrVtjz8Nm3QGklnAgmddRfY9AZB1Vw\r\nT4hpfvmRi0zOXn2KTaVjAcdqp0Irg+IyTQzd+q9dFG0CQQDCyVOEzUfLHotITqPy\r\nzN2EQ/e/YNnfsElBgNbL44V0Gy2vclLBt6hsvJrD0lSXHCo8aWplIvs2cRM/8uv3\r\nim27AkBrgcQTrgoGO72OgJeBumv9RuPzyLhLb4JylGl3eonsFkxF+l3MzVQhAzK5\r\nd9pf0CVS6TwK3AcjhyIoIyYNo8GtAkBUyi6A8Jr/4BvhLdpQJr2Ghc+ijxZIOQSq\r\nbtsRhcjh8bLBXJKJoNi//JmiBDyuSqRYB8s4mzGfUTl/7M6qwqdhAkEAnZEM+ZUV\r\nV0lZA18QsbwYHY1GVmaOi/dpZjS4ECl+7hbqhHfry88bgXzRKaITxe5Tss+lwQQ7\r\ncfLx+EZh+XOvRw==\r\n-----END PRIVATE KEY-----\r\n";
        // create certificate secret
        CollectionMetadata collectionMetadata = new CollectionMetadata.Builder()
                .collectionType(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_JSON)
                .collectionTotal(Long.parseLong("1"))
                .build();
        CertificateSecretResource secretResource = new CertificateSecretResource.Builder()
                .name(generateName())
                .description("Integration test generated")
                .labels(new java.util.ArrayList<>(java.util.Arrays.asList("label1", "label2")))
                .certificate(testCertificate)
                .privateKey(testPrivateKey)
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType(SecretResource.SecretType.IMPORTED_CERT)
                .metadata(collectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();
        Response<CreateSecret> createResp = secretsManager.createSecret(createSecretOptions).execute();
        assertEquals(createResp.getStatusCode(), 200);

        String secretId = createResp.getResult().resources().get(0).id();

        // get certificate secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType(SecretResource.SecretType.IMPORTED_CERT)
                .id(secretId)
                .build();
        Response<GetSecret> getResp = secretsManager.getSecret(getSecretOptions).execute();
        assertEquals(getResp.getStatusCode(), 200);
        assertEquals(getResp.getResult().getResources().get(0).secretData().get("certificate"), testCertificate);
        assertEquals(getResp.getResult().getResources().get(0).secretData().get("private_key"), testPrivateKey);

        // delete certificate secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType(SecretResource.SecretType.IMPORTED_CERT)
                .id(secretId)
                .build();
        Response<Void> delResp = secretsManager.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delResp.getStatusCode(), 204);
    }

    @Test
    public void testPublicCertSecret() {

        String caConfigName = generateName() + "-le-stage-config";


        ConfigElementDefConfigLetsEncryptConfig letsEncryptConfig = new ConfigElementDefConfigLetsEncryptConfig.Builder()
                .privateKey(System.getenv("CA_CONFIG_PRIVATE_KEY").replace("\\n", "\n")).build();

        ConfigElementDef configElementDef = new ConfigElementDef.Builder()
                .name(caConfigName)
                .type("letsencrypt-stage")
                .config(letsEncryptConfig).build();
        //create the CA config
        CreateConfigElementOptions createConfigElementOptions = new CreateConfigElementOptions.Builder()
                .secretType(CreateConfigElementOptions.SecretType.PUBLIC_CERT)
                .configElement(CreateConfigElementOptions.ConfigElement.CERTIFICATE_AUTHORITIES)
                .configElementDef(configElementDef)
                .build();

        Response<GetSingleConfigElement> res = secretsManager.createConfigElement(createConfigElementOptions).execute();
        assertEquals(res.getStatusCode(), 201);

        //create the DNS config
        String dnsConfigName = generateName() + "-dns-config";

        ConfigElementDefConfigCloudInternetServicesConfig cisConfig = new ConfigElementDefConfigCloudInternetServicesConfig.Builder()
                .cisApikey(System.getenv("SECRETS_MANAGER_API_APIKEY"))
                .cisCrn(System.getenv("DNS_CONFIG_CRN")).build();

        configElementDef = new ConfigElementDef.Builder()
                .name(dnsConfigName)
                .type("cis")
                .config(cisConfig).build();


        createConfigElementOptions = new CreateConfigElementOptions.Builder()
                .secretType(CreateConfigElementOptions.SecretType.PUBLIC_CERT)
                .configElement(CreateConfigElementOptions.ConfigElement.DNS_PROVIDERS)
                .configElementDef(configElementDef)
                .build();

        res = secretsManager.createConfigElement(createConfigElementOptions).execute();
        assertEquals(res.getStatusCode(), 201);


        //Order certificate
        // create certificate secret
        CollectionMetadata collectionMetadata = new CollectionMetadata.Builder()
                .collectionType(CollectionMetadata.CollectionType.APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_JSON)
                .collectionTotal(Long.parseLong("1"))
                .build();
        PublicCertificateSecretResource secretResource = new PublicCertificateSecretResource.Builder()
                .name(generateName())
                .description("public_cert integration test generated")
                .labels(new java.util.ArrayList<>(java.util.Arrays.asList("label1", "label2")))
                .commonName("integration.secrets-manager.test.appdomain.cloud")
                .altNames(new java.util.ArrayList<>(java.util.Arrays.asList("integration.secrets-manager.test.appdomain.cloud")))
                .keyAlgorithm("RSA2048")
                .ca(caConfigName)
                .dns(dnsConfigName)
                .rotation(new Rotation.Builder().autoRotate(false).rotateKeys(false).build())
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType(CreateSecretOptions.SecretType.PUBLIC_CERT)
                .metadata(collectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();

        Response<CreateSecret> createResp = secretsManager.createSecret(createSecretOptions).execute();
        assertEquals(createResp.getStatusCode(), 202);

        String secretId = createResp.getResult().resources().get(0).id();

        //Get the secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType(GetSecretOptions.SecretType.PUBLIC_CERT)
                .id(secretId)
                .build();

        Response<GetSecret> getResp = secretsManager.getSecret(getSecretOptions).execute();
        assertEquals(getResp.getStatusCode(), 200);

        //Get the secret metadata
        GetSecretMetadataOptions getSecretMetadataOptions = new GetSecretMetadataOptions.Builder()
                .secretType(GetSecretMetadataOptions.SecretType.PUBLIC_CERT)
                .id(secretId)
                .build();
        Response<SecretMetadataRequest> getMetaResp = secretsManager.getSecretMetadata(getSecretMetadataOptions).execute();
        assertEquals(getMetaResp.getStatusCode(), 200);

        // delete public secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType(DeleteConfigElementOptions.SecretType.PUBLIC_CERT)
                .id(secretId)
                .build();
        Response<Void> delResp = secretsManager.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delResp.getStatusCode(), 204);

        //Delete configs
        DeleteConfigElementOptions deleteConfigElementOptions = new DeleteConfigElementOptions.Builder()
                .configElement(DeleteConfigElementOptions.ConfigElement.DNS_PROVIDERS)
                .secretType(DeleteConfigElementOptions.SecretType.PUBLIC_CERT)
                .configName(dnsConfigName).build();

        Response<Void> delRes = secretsManager.deleteConfigElement(deleteConfigElementOptions).execute();
        assertEquals(delResp.getStatusCode(), 204);

        deleteConfigElementOptions = new DeleteConfigElementOptions.Builder()
                .configElement(DeleteConfigElementOptions.ConfigElement.CERTIFICATE_AUTHORITIES)
                .secretType(DeleteConfigElementOptions.SecretType.PUBLIC_CERT)
                .configName(caConfigName).build();

        delRes = secretsManager.deleteConfigElement(deleteConfigElementOptions).execute();
        assertEquals(delResp.getStatusCode(), 204);

    }

    @Test
    public void testCreateGetListDeleteConfigElement() {
        String caConfigName = generateName() + "-le-stage-config";

        ConfigElementDefConfigLetsEncryptConfig letsEncryptConfig = new ConfigElementDefConfigLetsEncryptConfig.Builder()
                .privateKey(System.getenv("CA_CONFIG_PRIVATE_KEY").replace("\\n", "\n")).build();
        ConfigElementDef configElementDef = new ConfigElementDef.Builder()
                .name(caConfigName)
                .type("letsencrypt-stage")
                .config(letsEncryptConfig).build();
        //create the CA config
        CreateConfigElementOptions createConfigElementOptions = new CreateConfigElementOptions.Builder()
                .secretType(CreateConfigElementOptions.SecretType.PUBLIC_CERT)
                .configElement(CreateConfigElementOptions.ConfigElement.CERTIFICATE_AUTHORITIES)
                .configElementDef(configElementDef)
                .build();

        Response<GetSingleConfigElement> res = secretsManager.createConfigElement(createConfigElementOptions).execute();
        assertEquals(res.getStatusCode(), 201);

        //create the DNS config
        String dnsConfigName = generateName() + "-dns-config";

        ConfigElementDefConfigCloudInternetServicesConfig cisConfig = new ConfigElementDefConfigCloudInternetServicesConfig.Builder()
                .cisCrn(System.getenv("DNS_CONFIG_CRN"))
                .cisApikey(System.getenv("SECRETS_MANAGER_API_APIKEY")).build();

        configElementDef = new ConfigElementDef.Builder()
                .name(dnsConfigName)
                .type("cis")
                .config(cisConfig).build();


        createConfigElementOptions = new CreateConfigElementOptions.Builder()
                .secretType(CreateConfigElementOptions.SecretType.PUBLIC_CERT)
                .configElement(CreateConfigElementOptions.ConfigElement.DNS_PROVIDERS)
                .configElementDef(configElementDef)
                .build();

        res = secretsManager.createConfigElement(createConfigElementOptions).execute();
        assertEquals(res.getStatusCode(), 201);

        //get the ca config
        Response<GetSingleConfigElement> caConfig = secretsManager.getConfigElement(new GetConfigElementOptions.Builder()
                .configElement(GetConfigElementOptions.ConfigElement.CERTIFICATE_AUTHORITIES)
                .secretType(GetConfigElementOptions.SecretType.PUBLIC_CERT).configName(caConfigName).build()).execute();
        assertEquals(caConfig.getStatusCode(), 200);
        assertEquals(caConfig.getResult().getResources().size(), 1);
        assertEquals(caConfig.getResult().getResources().get(0).name(), caConfigName);
        assertEquals(caConfig.getResult().getResources().get(0).type(), "letsencrypt-stage");

        //get the dns config
        Response<GetSingleConfigElement> dnsConfig = secretsManager.getConfigElement(new GetConfigElementOptions.Builder()
                .configElement(GetConfigElementOptions.ConfigElement.DNS_PROVIDERS)
                .secretType(GetConfigElementOptions.SecretType.PUBLIC_CERT).configName(dnsConfigName).build()).execute();
        assertEquals(dnsConfig.getStatusCode(), 200);
        assertEquals(dnsConfig.getResult().getResources().size(), 1);
        assertEquals(dnsConfig.getResult().getResources().get(0).name(), dnsConfigName);
        assertEquals(dnsConfig.getResult().getResources().get(0).type(), "cis");

        //list all
        Response<GetConfig> all = secretsManager.getConfig(new GetConfigOptions.Builder().secretType(GetConfigOptions.SecretType.PUBLIC_CERT).build()).execute();
        assertEquals(all.getStatusCode(), 200);
        assertEquals(all.getResult().getResources().size(), 1);
        assertNotNull(all.getResult().getResources().get(0).getCertificateAuthorities());
        assertNotNull(all.getResult().getResources().get(0).getDnsProviders());


        //delete
        Response<Void> delRes = secretsManager.deleteConfigElement(new DeleteConfigElementOptions.Builder()
                .secretType(DeleteConfigElementOptions.SecretType.PUBLIC_CERT)
                .configElement(DeleteConfigElementOptions.ConfigElement.DNS_PROVIDERS).configName(dnsConfigName).build()).execute();
        assertEquals(delRes.getStatusCode(), 204);

        delRes = secretsManager.deleteConfigElement(new DeleteConfigElementOptions.Builder()
                .secretType(DeleteConfigElementOptions.SecretType.PUBLIC_CERT)
                .configElement(DeleteConfigElementOptions.ConfigElement.CERTIFICATE_AUTHORITIES).configName(caConfigName).build()).execute();
        assertEquals(delRes.getStatusCode(), 204);

    }

    private Date generateExpirationDate() {
        Calendar c = Calendar.getInstance();
        Date now = new Date();
        c.setTime(now);
        c.add(Calendar.YEAR, 10);
        Date expiration = c.getTime();
        return DateUtils.parseAsDateTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").format(expiration));
    }

    private String generateName() {
        return "test-integration-" + System.currentTimeMillis();
    }

}
