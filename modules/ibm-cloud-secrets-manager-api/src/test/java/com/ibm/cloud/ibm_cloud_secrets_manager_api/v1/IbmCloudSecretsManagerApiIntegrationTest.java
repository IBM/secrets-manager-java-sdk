package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1;

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.*;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import static org.testng.Assert.*;

/**
 * Integration test class for the IbmCloudSecretsManagerApi service.
 */
@PrepareForTest({EnvironmentUtils.class})
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class IbmCloudSecretsManagerApiIntegrationTest extends PowerMockTestCase {

    protected IbmCloudSecretsManagerApi ibmCloudSecretsManagerApiService;
    protected IamAuthenticator iamAuthenticator;

    @BeforeClass
    public void initTest() {
        iamAuthenticator = new IamAuthenticator(System.getenv("SECRETS_MANAGER_API_APIKEY"));
        ibmCloudSecretsManagerApiService = new IbmCloudSecretsManagerApi("Secrets Manager integration test", iamAuthenticator);
        ibmCloudSecretsManagerApiService.setServiceUrl(System.getenv("SERVICE_URL"));
    }

    @Test
    public void testArbitrarySecret() {
        // create arbitrary secret
        CollectionMetadata collectionMetadata = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret+json")
                .collectionTotal(Long.parseLong("1"))
                .build();
        SecretResourceArbitrarySecretResource secretResource = new SecretResourceArbitrarySecretResource.Builder()
                .name(generateName())
                .description("Integration test generated")
                .labels(new java.util.ArrayList<>(java.util.Arrays.asList("label1", "label2")))
                .expirationDate(generateExpirationDate())
                .payload("secret-data")
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType("arbitrary")
                .metadata(collectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();
        Response<CreateSecret> createResp = ibmCloudSecretsManagerApiService.createSecret(createSecretOptions).execute();
        assertEquals(createResp.getStatusCode(), 200);

        String secretId = createResp.getResult().resources().get(0).id();

        // get arbitrary secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType("arbitrary")
                .id(secretId)
                .build();
        Response<GetSecret> getResp = ibmCloudSecretsManagerApiService.getSecret(getSecretOptions).execute();
        assertEquals(getResp.getStatusCode(), 200);
        assertEquals(getResp.getResult().getResources().get(0).secretData().get("payload"), "secret-data");

        // delete arbitrary secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType("arbitrary")
                .id(secretId)
                .build();
        Response<Void> delResp = ibmCloudSecretsManagerApiService.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delResp.getStatusCode(), 204);
    }

    @Test
    public void testSecretGroup() {
        // create a secret group
        CollectionMetadata secretGroupCollectionMetadata = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret.group+json")
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
        Response<SecretGroupDef> createSecretGroupResp = ibmCloudSecretsManagerApiService.createSecretGroup(createSecretGroupOptions).execute();
        assertEquals(createSecretGroupResp.getStatusCode(), 200);

        String secretGroupId = createSecretGroupResp.getResult().resources().get(0).getId();

        // create username_password secret and associate it with our secret group
        CollectionMetadata secretCollectionMetadata = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret+json")
                .collectionTotal(Long.parseLong("1"))
                .build();
        SecretResourceUsernamePasswordSecretResource secretResource = new SecretResourceUsernamePasswordSecretResource.Builder()
                .name(generateName())
                .description("Integration test generated")
                .labels(new java.util.ArrayList<>(java.util.Arrays.asList("label1")))
                .expirationDate(generateExpirationDate())
                .secretGroupId(secretGroupId)
                .username("test_user")
                .password("test_password")
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType("username_password")
                .metadata(secretCollectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();
        Response<CreateSecret> createSecretResp = ibmCloudSecretsManagerApiService.createSecret(createSecretOptions).execute();
        assertEquals(createSecretResp.getStatusCode(), 200);

        String secretId = createSecretResp.getResult().resources().get(0).id();

        // get username_password secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType("username_password")
                .id(secretId)
                .build();
        Response<GetSecret> getSecretResp = ibmCloudSecretsManagerApiService.getSecret(getSecretOptions).execute();
        assertEquals(getSecretResp.getStatusCode(), 200);

        // delete username_password secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType("username_password")
                .id(secretId)
                .build();
        Response<Void> delSecretResp = ibmCloudSecretsManagerApiService.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delSecretResp.getStatusCode(), 204);

        // delete secret group
        DeleteSecretGroupOptions deleteSecretGroupOptions = new DeleteSecretGroupOptions.Builder()
                .id(secretGroupId)
                .build();
        Response<Void> delSecretGroupResp = ibmCloudSecretsManagerApiService.deleteSecretGroup(deleteSecretGroupOptions).execute();
        assertEquals(delSecretGroupResp.getStatusCode(), 204);
    }

    @Test
    public void testSecretRotationPolicy() {
        CollectionMetadata secretCollectionMetadata = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret+json")
                .collectionTotal(Long.parseLong("1"))
                .build();
        SecretResourceUsernamePasswordSecretResource secretResource = new SecretResourceUsernamePasswordSecretResource.Builder()
                .name(generateName())
                .description("Integration test generated")
                .labels(new java.util.ArrayList<>(java.util.Arrays.asList("label1")))
                .expirationDate(generateExpirationDate())
                .username("test_user")
                .password("test_password")
                .build();
        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretType("username_password")
                .metadata(secretCollectionMetadata)
                .resources(new java.util.ArrayList<>(Collections.singletonList(secretResource)))
                .build();
        Response<CreateSecret> createSecretResp = ibmCloudSecretsManagerApiService.createSecret(createSecretOptions).execute();
        assertEquals(createSecretResp.getStatusCode(), 200);

        String secretId = createSecretResp.getResult().resources().get(0).id();

        // Create a rotation policy for the username_password secret type we have just created
        CollectionMetadata policyCollectionMetadata = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret.policy+json")
                .collectionTotal(Long.parseLong("1"))
                .build();
        SecretPolicyRotationRotation rotation = new SecretPolicyRotationRotation.Builder()
                .interval(Long.parseLong("1"))
                .unit("month")
                .build();
        SecretPolicyRotation secretPolicyRotation = new SecretPolicyRotation.Builder()
                .type("application/vnd.ibm.secrets-manager.secret.policy+json")
                .rotation(rotation)
                .build();
        PutPolicyOptions putPolicyOptions = new PutPolicyOptions.Builder()
                .secretType("username_password")
                .id(secretId)
                .metadata(policyCollectionMetadata)
                .resources(new java.util.ArrayList<>(java.util.Arrays.asList(secretPolicyRotation)))
                .policy("rotation")
                .build();
        Response<GetSecretPoliciesOneOf> putPolicyResp = ibmCloudSecretsManagerApiService.putPolicy(putPolicyOptions).execute();
        assertEquals(putPolicyResp.getStatusCode(), 200);

        // get username_password secret
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .secretType("username_password")
                .id(secretId)
                .build();
        Response<GetSecret> getSecretResp = ibmCloudSecretsManagerApiService.getSecret(getSecretOptions).execute();
        assertEquals(getSecretResp.getStatusCode(), 200);
        assertEquals(getSecretResp.getResult().getResources().get(0).secretData().get("username"), "test_user");
        assertEquals(getSecretResp.getResult().getResources().get(0).secretData().get("password"), "test_password");
        assertNotNull(getSecretResp.getResult().getResources().get(0).nextRotationDate());

        // delete username_password secret
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .secretType("username_password")
                .id(secretId)
                .build();
        Response<Void> delSecretResp = ibmCloudSecretsManagerApiService.deleteSecret(deleteSecretOptions).execute();
        assertEquals(delSecretResp.getStatusCode(), 204);
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
