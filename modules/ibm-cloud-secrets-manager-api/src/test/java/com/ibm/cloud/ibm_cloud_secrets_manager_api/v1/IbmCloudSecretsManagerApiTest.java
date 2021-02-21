/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1;

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.IbmCloudSecretsManagerApi;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.CollectionMetadata;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.CreateSecret;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.CreateSecretGroupOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.CreateSecretOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.DeleteSecretGroupOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.DeleteSecretOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.EngineConfigOneOf;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.EngineConfigOneOfIAMSecretEngineRootConfig;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetConfigOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetPolicyOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetSecret;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetSecretGroupOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetSecretMetadataOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetSecretOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetSecretPoliciesOneOf;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetSecretPoliciesOneOfGetSecretPolicyRotation;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetSecretPoliciesOneOfGetSecretPolicyRotationResourcesItem;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.GetSecretPoliciesOneOfResourcesItem;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.ListAllSecretsOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.ListSecretGroupsOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.ListSecrets;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.ListSecretsOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.PutConfigOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.PutPolicyOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretActionOneOf;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretActionOneOfDeleteCredentialsForIAMSecret;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretActionOneOfRotateArbitrarySecretBody;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretActionOneOfRotateUsernamePasswordSecretBody;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretGroupDef;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretGroupMetadataUpdatable;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretGroupResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretMetadata;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretMetadataRequest;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretPolicyRotation;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretPolicyRotationRotation;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretResourceArbitrarySecretResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretResourceIAMSecretResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretResourceUsernamePasswordSecretResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretVersion;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.UpdateSecretGroupMetadataOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.UpdateSecretMetadataOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.UpdateSecretOptions;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the IbmCloudSecretsManagerApi service.
 */
@PrepareForTest({EnvironmentUtils.class})
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class IbmCloudSecretsManagerApiTest extends PowerMockTestCase {

    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    protected MockWebServer server;
    protected IbmCloudSecretsManagerApi ibmCloudSecretsManagerApiService;

    // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
    private Map<String, String> getTestProcessEnvironment() {
        Map<String, String> env = new HashMap<>();
        env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
        return env;
    }

    public void constructClientService() throws Throwable {
        PowerMockito.spy(EnvironmentUtils.class);
        PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
        final String serviceName = "testService";

        ibmCloudSecretsManagerApiService = IbmCloudSecretsManagerApi.newInstance(serviceName);
        String url = server.url("/").toString();
        ibmCloudSecretsManagerApiService.setServiceUrl(url);
    }

    /**
     * Negative Test - construct the service with a null authenticator.
     */
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithNullAuthenticator() throws Throwable {
        final String serviceName = "testService";

        new IbmCloudSecretsManagerApi(serviceName, null);
    }

    @Test
    public void testPutConfigWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "";
        String putConfigPath = "/api/v1/config/iam_credentials";

        server.enqueue(new MockResponse()
                .setResponseCode(204)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the EngineConfigOneOfIAMSecretEngineRootConfig model
        EngineConfigOneOfIAMSecretEngineRootConfig engineConfigOneOfModel = new EngineConfigOneOfIAMSecretEngineRootConfig.Builder()
                .apiKey("API_KEY")
                .build();

        // Construct an instance of the PutConfigOptions model
        PutConfigOptions putConfigOptionsModel = new PutConfigOptions.Builder()
                .secretType("iam_credentials")
                .engineConfigOneOf(engineConfigOneOfModel)
                .build();

        // Invoke operation with valid options model (positive test)
        Response<Void> response = ibmCloudSecretsManagerApiService.putConfig(putConfigOptionsModel).execute();
        assertNotNull(response);
        Void responseObj = response.getResult();
        // Response does not have a return type. Check that the result is null.
        assertNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "PUT");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, putConfigPath);
    }

    // Test the putConfig operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPutConfigNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.putConfig(null).execute();
    }

    @Test
    public void testGetConfigWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"api_key\": \"API_KEY\", \"api_key_hash\": \"a737c3a98ebfc16a0d5ddc6b277548491440780003e06f5924dc906bc8d78e91\"}";
        String getConfigPath = "/api/v1/config/iam_credentials";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the GetConfigOptions model
        GetConfigOptions getConfigOptionsModel = new GetConfigOptions.Builder()
                .secretType("iam_credentials")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<EngineConfigOneOf> response = ibmCloudSecretsManagerApiService.getConfig(getConfigOptionsModel).execute();
        assertNotNull(response);
        EngineConfigOneOf responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "GET");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, getConfigPath);
    }

    // Test the getConfig operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetConfigNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.getConfig(null).execute();
    }

    @Test
    public void testPutPolicyWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"crn\": \"crn:v1:bluemix:public:kms:<region>:a/<account-id>:<service-instance:policy:<policy-id>\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"type\": \"application/vnd.ibm.secrets-manager.secret.policy+json\", \"rotation\": {\"interval\": 1, \"unit\": \"day\"}}]}";
        String putPolicyPath = "/api/v1/secrets/username_password/testString/policies";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the CollectionMetadata model
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret+json")
                .collectionTotal(Long.valueOf("1"))
                .build();

        // Construct an instance of the SecretPolicyRotationRotation model
        SecretPolicyRotationRotation secretPolicyRotationRotationModel = new SecretPolicyRotationRotation.Builder()
                .interval(Long.valueOf("1"))
                .unit("day")
                .build();

        // Construct an instance of the SecretPolicyRotation model
        SecretPolicyRotation secretPolicyRotationModel = new SecretPolicyRotation.Builder()
                .type("application/vnd.ibm.secrets-manager.secret.policy+json")
                .rotation(secretPolicyRotationRotationModel)
                .build();

        // Construct an instance of the PutPolicyOptions model
        PutPolicyOptions putPolicyOptionsModel = new PutPolicyOptions.Builder()
                .secretType("username_password")
                .id("testString")
                .metadata(collectionMetadataModel)
                .resources(new java.util.ArrayList<SecretPolicyRotation>(java.util.Arrays.asList(secretPolicyRotationModel)))
                .policy("rotation")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<GetSecretPoliciesOneOf> response = ibmCloudSecretsManagerApiService.putPolicy(putPolicyOptionsModel).execute();
        assertNotNull(response);
        GetSecretPoliciesOneOf responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "PUT");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNotNull(query);
        // Get query params
        assertEquals(query.get("policy"), "rotation");
        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, putPolicyPath);
    }

    // Test the putPolicy operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPutPolicyNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.putPolicy(null).execute();
    }

    @Test
    public void testGetPolicyWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"crn\": \"crn:v1:bluemix:public:kms:<region>:a/<account-id>:<service-instance:policy:<policy-id>\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"type\": \"application/vnd.ibm.secrets-manager.secret.policy+json\", \"rotation\": {\"interval\": 1, \"unit\": \"day\"}}]}";
        String getPolicyPath = "/api/v1/secrets/username_password/testString/policies";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the GetPolicyOptions model
        GetPolicyOptions getPolicyOptionsModel = new GetPolicyOptions.Builder()
                .secretType("username_password")
                .id("testString")
                .policy("rotation")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<GetSecretPoliciesOneOf> response = ibmCloudSecretsManagerApiService.getPolicy(getPolicyOptionsModel).execute();
        assertNotNull(response);
        GetSecretPoliciesOneOf responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "GET");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNotNull(query);
        // Get query params
        assertEquals(query.get("policy"), "rotation");
        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, getPolicyPath);
    }

    // Test the getPolicy operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetPolicyNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.getPolicy(null).execute();
    }

    @Test
    public void testCreateSecretGroupWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"bc656587-8fda-4d05-9ad8-b1de1ec7e712\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"last_update_date\": \"2018-05-12T23:20:50.520Z\", \"type\": \"application/vnd.ibm.secrets-manager.secret.group+json\"}]}";
        String createSecretGroupPath = "/api/v1/secret_groups";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the CollectionMetadata model
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret.group+json")
                .collectionTotal(Long.valueOf("1"))
                .build();

        // Construct an instance of the SecretGroupResource model
        SecretGroupResource secretGroupResourceModel = new SecretGroupResource.Builder()
                .name("my-secret-group")
                .description("Extended description for this group.")
                .add("foo", "testString")
                .build();

        // Construct an instance of the CreateSecretGroupOptions model
        CreateSecretGroupOptions createSecretGroupOptionsModel = new CreateSecretGroupOptions.Builder()
                .metadata(collectionMetadataModel)
                .resources(new java.util.ArrayList<SecretGroupResource>(java.util.Arrays.asList(secretGroupResourceModel)))
                .build();

        // Invoke operation with valid options model (positive test)
        Response<SecretGroupDef> response = ibmCloudSecretsManagerApiService.createSecretGroup(createSecretGroupOptionsModel).execute();
        assertNotNull(response);
        SecretGroupDef responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "POST");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, createSecretGroupPath);
    }

    // Test the createSecretGroup operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCreateSecretGroupNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.createSecretGroup(null).execute();
    }

    @Test
    public void testListSecretGroupsWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"bc656587-8fda-4d05-9ad8-b1de1ec7e712\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"last_update_date\": \"2018-05-12T23:20:50.520Z\", \"type\": \"application/vnd.ibm.secrets-manager.secret.group+json\"}]}";
        String listSecretGroupsPath = "/api/v1/secret_groups";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the ListSecretGroupsOptions model
        ListSecretGroupsOptions listSecretGroupsOptionsModel = new ListSecretGroupsOptions();

        // Invoke operation with valid options model (positive test)
        Response<SecretGroupDef> response = ibmCloudSecretsManagerApiService.listSecretGroups(listSecretGroupsOptionsModel).execute();
        assertNotNull(response);
        SecretGroupDef responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "GET");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, listSecretGroupsPath);
    }

    @Test
    public void testGetSecretGroupWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"bc656587-8fda-4d05-9ad8-b1de1ec7e712\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"last_update_date\": \"2018-05-12T23:20:50.520Z\", \"type\": \"application/vnd.ibm.secrets-manager.secret.group+json\"}]}";
        String getSecretGroupPath = "/api/v1/secret_groups/testString";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the GetSecretGroupOptions model
        GetSecretGroupOptions getSecretGroupOptionsModel = new GetSecretGroupOptions.Builder()
                .id("testString")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<SecretGroupDef> response = ibmCloudSecretsManagerApiService.getSecretGroup(getSecretGroupOptionsModel).execute();
        assertNotNull(response);
        SecretGroupDef responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "GET");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, getSecretGroupPath);
    }

    // Test the getSecretGroup operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetSecretGroupNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.getSecretGroup(null).execute();
    }

    @Test
    public void testUpdateSecretGroupMetadataWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"bc656587-8fda-4d05-9ad8-b1de1ec7e712\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"last_update_date\": \"2018-05-12T23:20:50.520Z\", \"type\": \"application/vnd.ibm.secrets-manager.secret.group+json\"}]}";
        String updateSecretGroupMetadataPath = "/api/v1/secret_groups/testString";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the CollectionMetadata model
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret.group+json")
                .collectionTotal(Long.valueOf("1"))
                .build();

        // Construct an instance of the SecretGroupMetadataUpdatable model
        SecretGroupMetadataUpdatable secretGroupMetadataUpdatableModel = new SecretGroupMetadataUpdatable.Builder()
                .name("updated-secret-group-name")
                .description("Updated description for this group.")
                .build();

        // Construct an instance of the UpdateSecretGroupMetadataOptions model
        UpdateSecretGroupMetadataOptions updateSecretGroupMetadataOptionsModel = new UpdateSecretGroupMetadataOptions.Builder()
                .id("testString")
                .metadata(collectionMetadataModel)
                .resources(new java.util.ArrayList<SecretGroupMetadataUpdatable>(java.util.Arrays.asList(secretGroupMetadataUpdatableModel)))
                .build();

        // Invoke operation with valid options model (positive test)
        Response<SecretGroupDef> response = ibmCloudSecretsManagerApiService.updateSecretGroupMetadata(updateSecretGroupMetadataOptionsModel).execute();
        assertNotNull(response);
        SecretGroupDef responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "PUT");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, updateSecretGroupMetadataPath);
    }

    // Test the updateSecretGroupMetadata operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateSecretGroupMetadataNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.updateSecretGroupMetadata(null).execute();
    }

    @Test
    public void testDeleteSecretGroupWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "";
        String deleteSecretGroupPath = "/api/v1/secret_groups/testString";

        server.enqueue(new MockResponse()
                .setResponseCode(204)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the DeleteSecretGroupOptions model
        DeleteSecretGroupOptions deleteSecretGroupOptionsModel = new DeleteSecretGroupOptions.Builder()
                .id("testString")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<Void> response = ibmCloudSecretsManagerApiService.deleteSecretGroup(deleteSecretGroupOptionsModel).execute();
        assertNotNull(response);
        Void responseObj = response.getResult();
        // Response does not have a return type. Check that the result is null.
        assertNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "DELETE");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, deleteSecretGroupPath);
    }

    // Test the deleteSecretGroup operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDeleteSecretGroupNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.deleteSecretGroup(null).execute();
    }

    @Test
    public void testCreateSecretWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"type\": \"type\", \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions\": [{\"id\": \"4a0225e9-17a0-46c1-ace7-f25bcf4237d4\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"auto_rotated\": false}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
        String createSecretPath = "/api/v1/secrets/arbitrary";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(201)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the CollectionMetadata model
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret+json")
                .collectionTotal(Long.valueOf("1"))
                .build();

        // Construct an instance of the SecretResourceArbitrarySecretResource model
        SecretResourceArbitrarySecretResource secretResourceModel = new SecretResourceArbitrarySecretResource.Builder()
                .type("testString")
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .payload("testString")
                .build();

        // Construct an instance of the CreateSecretOptions model
        CreateSecretOptions createSecretOptionsModel = new CreateSecretOptions.Builder()
                .secretType("arbitrary")
                .metadata(collectionMetadataModel)
                .resources(new java.util.ArrayList<SecretResource>(java.util.Arrays.asList(secretResourceModel)))
                .build();

        // Invoke operation with valid options model (positive test)
        Response<CreateSecret> response = ibmCloudSecretsManagerApiService.createSecret(createSecretOptionsModel).execute();
        assertNotNull(response);
        CreateSecret responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "POST");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, createSecretPath);
    }

    // Test the createSecret operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCreateSecretNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.createSecret(null).execute();
    }

    @Test
    public void testListSecretsWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"type\": \"type\", \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions\": [{\"id\": \"4a0225e9-17a0-46c1-ace7-f25bcf4237d4\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"auto_rotated\": false}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
        String listSecretsPath = "/api/v1/secrets/arbitrary";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the ListSecretsOptions model
        ListSecretsOptions listSecretsOptionsModel = new ListSecretsOptions.Builder()
                .secretType("arbitrary")
                .limit(Long.valueOf("1"))
                .offset(Long.valueOf("0"))
                .build();

        // Invoke operation with valid options model (positive test)
        Response<ListSecrets> response = ibmCloudSecretsManagerApiService.listSecrets(listSecretsOptionsModel).execute();
        assertNotNull(response);
        ListSecrets responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "GET");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNotNull(query);
        // Get query params
        assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
        assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, listSecretsPath);
    }

    // Test the listSecrets operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testListSecretsNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.listSecrets(null).execute();
    }

    @Test
    public void testListAllSecretsWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"type\": \"type\", \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions\": [{\"id\": \"4a0225e9-17a0-46c1-ace7-f25bcf4237d4\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"auto_rotated\": false}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
        String listAllSecretsPath = "/api/v1/secrets";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the ListAllSecretsOptions model
        ListAllSecretsOptions listAllSecretsOptionsModel = new ListAllSecretsOptions.Builder()
                .limit(Long.valueOf("1"))
                .offset(Long.valueOf("0"))
                .search("testString")
                .sortBy("id")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<ListSecrets> response = ibmCloudSecretsManagerApiService.listAllSecrets(listAllSecretsOptionsModel).execute();
        assertNotNull(response);
        ListSecrets responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "GET");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNotNull(query);
        // Get query params
        assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
        assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
        assertEquals(query.get("search"), "testString");
        assertEquals(query.get("sort_by"), "id");
        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, listAllSecretsPath);
    }

    @Test
    public void testGetSecretWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"type\": \"type\", \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions\": [{\"id\": \"4a0225e9-17a0-46c1-ace7-f25bcf4237d4\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"auto_rotated\": false}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
        String getSecretPath = "/api/v1/secrets/arbitrary/testString";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the GetSecretOptions model
        GetSecretOptions getSecretOptionsModel = new GetSecretOptions.Builder()
                .secretType("arbitrary")
                .id("testString")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<GetSecret> response = ibmCloudSecretsManagerApiService.getSecret(getSecretOptionsModel).execute();
        assertNotNull(response);
        GetSecret responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "GET");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, getSecretPath);
    }

    // Test the getSecret operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetSecretNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.getSecret(null).execute();
    }

    @Test
    public void testUpdateSecretWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"type\": \"type\", \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions\": [{\"id\": \"4a0225e9-17a0-46c1-ace7-f25bcf4237d4\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"auto_rotated\": false}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
        String updateSecretPath = "/api/v1/secrets/arbitrary/testString";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the SecretActionOneOfRotateArbitrarySecretBody model
        SecretActionOneOfRotateArbitrarySecretBody secretActionOneOfModel = new SecretActionOneOfRotateArbitrarySecretBody.Builder()
                .payload("testString")
                .build();

        // Construct an instance of the UpdateSecretOptions model
        UpdateSecretOptions updateSecretOptionsModel = new UpdateSecretOptions.Builder()
                .secretType("arbitrary")
                .id("testString")
                .action("rotate")
                .secretActionOneOf(secretActionOneOfModel)
                .build();

        // Invoke operation with valid options model (positive test)
        Response<GetSecret> response = ibmCloudSecretsManagerApiService.updateSecret(updateSecretOptionsModel).execute();
        assertNotNull(response);
        GetSecret responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "POST");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNotNull(query);
        // Get query params
        assertEquals(query.get("action"), "rotate");
        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, updateSecretPath);
    }

    // Test the updateSecret operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateSecretNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.updateSecret(null).execute();
    }

    @Test
    public void testDeleteSecretWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "";
        String deleteSecretPath = "/api/v1/secrets/arbitrary/testString";

        server.enqueue(new MockResponse()
                .setResponseCode(204)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the DeleteSecretOptions model
        DeleteSecretOptions deleteSecretOptionsModel = new DeleteSecretOptions.Builder()
                .secretType("arbitrary")
                .id("testString")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<Void> response = ibmCloudSecretsManagerApiService.deleteSecret(deleteSecretOptionsModel).execute();
        assertNotNull(response);
        Void responseObj = response.getResult();
        // Response does not have a return type. Check that the result is null.
        assertNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "DELETE");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, deleteSecretPath);
    }

    // Test the deleteSecret operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDeleteSecretNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.deleteSecret(null).execute();
    }

    @Test
    public void testGetSecretMetadataWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"b0283d74-0894-830b-f81d-1f115f67729f\", \"labels\": [\"labels\"], \"name\": \"example-secret\", \"description\": \"Extended description for this secret.\", \"secret_group_id\": \"f5283d74-9024-230a-b72c-1f115f61290f\", \"state\": 1, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"ttl\": \"anyValue\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"ServiceId-cb258cb9-8de3-4ac0-9aec-b2b2d27ac976\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\"}]}";
        String getSecretMetadataPath = "/api/v1/secrets/arbitrary/testString/metadata";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the GetSecretMetadataOptions model
        GetSecretMetadataOptions getSecretMetadataOptionsModel = new GetSecretMetadataOptions.Builder()
                .secretType("arbitrary")
                .id("testString")
                .build();

        // Invoke operation with valid options model (positive test)
        Response<SecretMetadataRequest> response = ibmCloudSecretsManagerApiService.getSecretMetadata(getSecretMetadataOptionsModel).execute();
        assertNotNull(response);
        SecretMetadataRequest responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "GET");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, getSecretMetadataPath);
    }

    // Test the getSecretMetadata operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetSecretMetadataNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.getSecretMetadata(null).execute();
    }

    @Test
    public void testUpdateSecretMetadataWOptions() throws Throwable {
        // Schedule some responses.
        String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.secret+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"b0283d74-0894-830b-f81d-1f115f67729f\", \"labels\": [\"labels\"], \"name\": \"example-secret\", \"description\": \"Extended description for this secret.\", \"secret_group_id\": \"f5283d74-9024-230a-b72c-1f115f61290f\", \"state\": 1, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"ttl\": \"anyValue\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"ServiceId-cb258cb9-8de3-4ac0-9aec-b2b2d27ac976\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\"}]}";
        String updateSecretMetadataPath = "/api/v1/secrets/arbitrary/testString/metadata";

        server.enqueue(new MockResponse()
                .setHeader("Content-type", "application/json")
                .setResponseCode(200)
                .setBody(mockResponseBody));

        constructClientService();

        // Construct an instance of the CollectionMetadata model
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret+json")
                .collectionTotal(Long.valueOf("1"))
                .build();

        // Construct an instance of the SecretMetadata model
        SecretMetadata secretMetadataModel = new SecretMetadata.Builder()
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")))
                .name("example-secret")
                .description("Extended description for this secret.")
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .ttl("24h")
                .build();

        // Construct an instance of the UpdateSecretMetadataOptions model
        UpdateSecretMetadataOptions updateSecretMetadataOptionsModel = new UpdateSecretMetadataOptions.Builder()
                .secretType("arbitrary")
                .id("testString")
                .metadata(collectionMetadataModel)
                .resources(new java.util.ArrayList<SecretMetadata>(java.util.Arrays.asList(secretMetadataModel)))
                .build();

        // Invoke operation with valid options model (positive test)
        Response<SecretMetadataRequest> response = ibmCloudSecretsManagerApiService.updateSecretMetadata(updateSecretMetadataOptionsModel).execute();
        assertNotNull(response);
        SecretMetadataRequest responseObj = response.getResult();
        assertNotNull(responseObj);

        // Verify the contents of the request
        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(request.getMethod(), "PUT");

        // Check query
        Map<String, String> query = TestUtilities.parseQueryString(request);
        assertNull(query);

        // Check request path
        String parsedPath = TestUtilities.parseReqPath(request);
        assertEquals(parsedPath, updateSecretMetadataPath);
    }

    // Test the updateSecretMetadata operation with null options model parameter
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateSecretMetadataNoOptions() throws Throwable {
        // construct the service
        constructClientService();

        server.enqueue(new MockResponse());

        // Invoke operation with null options model (negative test)
        ibmCloudSecretsManagerApiService.updateSecretMetadata(null).execute();
    }

    /**
     * Initialize the server
     */
    @BeforeMethod
    public void setUpMockServer() {
        try {
            server = new MockWebServer();
            // register handler
            server.start();
        } catch (IOException err) {
            fail("Failed to instantiate mock web server");
        }
    }

    @AfterMethod
    public void tearDownMockServer() throws IOException {
        server.shutdown();
        ibmCloudSecretsManagerApiService = null;
    }
}