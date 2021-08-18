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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.SecretsManager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretData;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateValidity;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CollectionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementDef;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteCredentialsForIAMCredentialsSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElements;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsResourcesItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsResourcesItemCertificateAuthoritiesConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsResourcesItemDnsProvidersConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigResourcesItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetPolicyOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretPolicies;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretPoliciesResourcesItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretPolicyRotationResourcesItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSingleConfigElement;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretEngineRootConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IssuanceInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListAllSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretGroupsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecrets;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertSecretEngineRootConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertificateMetadataSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertificateSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PutConfigOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PutPolicyOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateArbitrarySecretBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateCertificateBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotatePublicCertBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateUsernamePasswordSecretBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.Rotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretGroupDef;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretGroupMetadataUpdatable;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretGroupResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretMetadataRequest;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotationRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotationRotationPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotationRotationPublicCertPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretGroupMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
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
 * Unit test class for the SecretsManager service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class SecretsManagerTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected SecretsManager secretsManagerService;

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

    secretsManagerService = SecretsManager.newInstance(serviceName);
    String url = server.url("/").toString();
    secretsManagerService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";

    new SecretsManager(serviceName, null);
  }

  @Test
  public void testCreateConfigElementWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"name\": \"name\", \"type\": \"type\", \"config\": {\"mapKey\": \"anyValue\"}}]}";
    String createConfigElementPath = "/api/v1/config/public_cert/certificate_authorities";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateConfigElementOptions model
    CreateConfigElementOptions createConfigElementOptionsModel = new CreateConfigElementOptions.Builder()
    .secretType("public_cert")
    .configElement("certificate_authorities")
    .name("testString")
    .type("testString")
    .config(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetSingleConfigElement> response = secretsManagerService.createConfigElement(createConfigElementOptionsModel).execute();
    assertNotNull(response);
    GetSingleConfigElement responseObj = response.getResult();
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
    assertEquals(parsedPath, createConfigElementPath);
  }

  // Test the createConfigElement operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigElementNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    secretsManagerService.createConfigElement(null).execute();
  }

  @Test
  public void testGetConfigElementsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"certificate_authorities\": [{\"name\": \"name\", \"type\": \"type\"}]}]}";
    String getConfigElementsPath = "/api/v1/config/public_cert/certificate_authorities";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfigElementsOptions model
    GetConfigElementsOptions getConfigElementsOptionsModel = new GetConfigElementsOptions.Builder()
    .secretType("public_cert")
    .configElement("certificate_authorities")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetConfigElements> response = secretsManagerService.getConfigElements(getConfigElementsOptionsModel).execute();
    assertNotNull(response);
    GetConfigElements responseObj = response.getResult();
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
    assertEquals(parsedPath, getConfigElementsPath);
  }

  // Test the getConfigElements operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfigElementsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    secretsManagerService.getConfigElements(null).execute();
  }

  @Test
  public void testUpdateConfigElementWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"name\": \"name\", \"type\": \"type\", \"config\": {\"mapKey\": \"anyValue\"}}]}";
    String updateConfigElementPath = "/api/v1/config/public_cert/certificate_authorities/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateConfigElementOptions model
    UpdateConfigElementOptions updateConfigElementOptionsModel = new UpdateConfigElementOptions.Builder()
    .secretType("public_cert")
    .configElement("certificate_authorities")
    .configName("testString")
    .type("testString")
    .config(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetSingleConfigElement> response = secretsManagerService.updateConfigElement(updateConfigElementOptionsModel).execute();
    assertNotNull(response);
    GetSingleConfigElement responseObj = response.getResult();
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
    assertEquals(parsedPath, updateConfigElementPath);
  }

  // Test the updateConfigElement operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateConfigElementNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    secretsManagerService.updateConfigElement(null).execute();
  }

  @Test
  public void testDeleteConfigElementWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteConfigElementPath = "/api/v1/config/public_cert/certificate_authorities/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteConfigElementOptions model
    DeleteConfigElementOptions deleteConfigElementOptionsModel = new DeleteConfigElementOptions.Builder()
    .secretType("public_cert")
    .configElement("certificate_authorities")
    .configName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = secretsManagerService.deleteConfigElement(deleteConfigElementOptionsModel).execute();
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
    assertEquals(parsedPath, deleteConfigElementPath);
  }

  // Test the deleteConfigElement operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteConfigElementNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    secretsManagerService.deleteConfigElement(null).execute();
  }

  @Test
  public void testGetConfigElementWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"name\": \"name\", \"type\": \"type\", \"config\": {\"mapKey\": \"anyValue\"}}]}";
    String getConfigElementPath = "/api/v1/config/public_cert/certificate_authorities/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfigElementOptions model
    GetConfigElementOptions getConfigElementOptionsModel = new GetConfigElementOptions.Builder()
    .secretType("public_cert")
    .configElement("certificate_authorities")
    .configName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetSingleConfigElement> response = secretsManagerService.getConfigElement(getConfigElementOptionsModel).execute();
    assertNotNull(response);
    GetSingleConfigElement responseObj = response.getResult();
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
    assertEquals(parsedPath, getConfigElementPath);
  }

  // Test the getConfigElement operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfigElementNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    secretsManagerService.getConfigElement(null).execute();
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

    // Construct an instance of the PutConfigOptions model
    PutConfigOptions putConfigOptionsModel = new PutConfigOptions.Builder()
    .secretType("iam_credentials")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = secretsManagerService.putConfig(putConfigOptionsModel).execute();
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
    secretsManagerService.putConfig(null).execute();
  }

  @Test
  public void testGetConfigWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"certificate_authorities\": [{\"name\": \"name\", \"type\": \"type\"}], \"dns_providers\": [{\"name\": \"name\", \"type\": \"type\"}]}]}";
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
    Response<GetConfig> response = secretsManagerService.getConfig(getConfigOptionsModel).execute();
    assertNotNull(response);
    GetConfig responseObj = response.getResult();
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
    secretsManagerService.getConfig(null).execute();
  }

  @Test
  public void testPutPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"crn\": \"crn:v1:bluemix:public:kms:<region>:a/<account-id>:<service-instance:policy:<policy-id>\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"type\": \"application/vnd.ibm.secrets-manager.secret.policy+json\", \"rotation\": {\"interval\": 1, \"unit\": \"day\"}}]}";
    String putPolicyPath = "/api/v1/secrets/username_password/testString/policies";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CollectionMetadata model
    CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
    .collectionType("application/vnd.ibm.secrets-manager.config+json")
    .collectionTotal(Long.valueOf("1"))
    .build();

    // Construct an instance of the SecretPolicyRotationRotationPolicyRotation model
    SecretPolicyRotationRotationPolicyRotation secretPolicyRotationRotationModel = new SecretPolicyRotationRotationPolicyRotation.Builder()
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
    Response<GetSecretPolicies> response = secretsManagerService.putPolicy(putPolicyOptionsModel).execute();
    assertNotNull(response);
    GetSecretPolicies responseObj = response.getResult();
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
    secretsManagerService.putPolicy(null).execute();
  }

  @Test
  public void testGetPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"crn\": \"crn:v1:bluemix:public:kms:<region>:a/<account-id>:<service-instance:policy:<policy-id>\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"type\": \"application/vnd.ibm.secrets-manager.secret.policy+json\", \"rotation\": {\"interval\": 1, \"unit\": \"day\"}}]}";
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
    Response<GetSecretPolicies> response = secretsManagerService.getPolicy(getPolicyOptionsModel).execute();
    assertNotNull(response);
    GetSecretPolicies responseObj = response.getResult();
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
    secretsManagerService.getPolicy(null).execute();
  }

  @Test
  public void testCreateSecretGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"bc656587-8fda-4d05-9ad8-b1de1ec7e712\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"last_update_date\": \"2018-05-12T23:20:50.520Z\", \"type\": \"application/vnd.ibm.secrets-manager.secret.group+json\"}]}";
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
    Response<SecretGroupDef> response = secretsManagerService.createSecretGroup(createSecretGroupOptionsModel).execute();
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
    secretsManagerService.createSecretGroup(null).execute();
  }

  @Test
  public void testListSecretGroupsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"bc656587-8fda-4d05-9ad8-b1de1ec7e712\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"last_update_date\": \"2018-05-12T23:20:50.520Z\", \"type\": \"application/vnd.ibm.secrets-manager.secret.group+json\"}]}";
    String listSecretGroupsPath = "/api/v1/secret_groups";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSecretGroupsOptions model
    ListSecretGroupsOptions listSecretGroupsOptionsModel = new ListSecretGroupsOptions();

    // Invoke operation with valid options model (positive test)
    Response<SecretGroupDef> response = secretsManagerService.listSecretGroups(listSecretGroupsOptionsModel).execute();
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
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"bc656587-8fda-4d05-9ad8-b1de1ec7e712\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"last_update_date\": \"2018-05-12T23:20:50.520Z\", \"type\": \"application/vnd.ibm.secrets-manager.secret.group+json\"}]}";
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
    Response<SecretGroupDef> response = secretsManagerService.getSecretGroup(getSecretGroupOptionsModel).execute();
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
    secretsManagerService.getSecretGroup(null).execute();
  }

  @Test
  public void testUpdateSecretGroupMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"bc656587-8fda-4d05-9ad8-b1de1ec7e712\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"last_update_date\": \"2018-05-12T23:20:50.520Z\", \"type\": \"application/vnd.ibm.secrets-manager.secret.group+json\"}]}";
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
    Response<SecretGroupDef> response = secretsManagerService.updateSecretGroupMetadata(updateSecretGroupMetadataOptionsModel).execute();
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
    secretsManagerService.updateSecretGroupMetadata(null).execute();
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
    Response<Void> response = secretsManagerService.deleteSecretGroup(deleteSecretGroupOptionsModel).execute();
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
    secretsManagerService.deleteSecretGroup(null).execute();
  }

  @Test
  public void testCreateSecretWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions_total\": 1, \"versions\": [{\"mapKey\": \"anyValue\"}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
    String createSecretPath = "/api/v1/secrets/arbitrary";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CollectionMetadata model
    CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
    .collectionType("application/vnd.ibm.secrets-manager.config+json")
    .collectionTotal(Long.valueOf("1"))
    .build();

    // Construct an instance of the ArbitrarySecretResource model
    ArbitrarySecretResource secretResourceModel = new ArbitrarySecretResource.Builder()
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
    Response<CreateSecret> response = secretsManagerService.createSecret(createSecretOptionsModel).execute();
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
    secretsManagerService.createSecret(null).execute();
  }

  @Test
  public void testListSecretsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions_total\": 1, \"versions\": [{\"mapKey\": \"anyValue\"}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
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
    Response<ListSecrets> response = secretsManagerService.listSecrets(listSecretsOptionsModel).execute();
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
    secretsManagerService.listSecrets(null).execute();
  }

  @Test
  public void testListAllSecretsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions_total\": 1, \"versions\": [{\"mapKey\": \"anyValue\"}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
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
    .groups(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListSecrets> response = secretsManagerService.listAllSecrets(listAllSecretsOptionsModel).execute();
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
    assertEquals(query.get("groups"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllSecretsPath);
  }

  @Test
  public void testGetSecretWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions_total\": 1, \"versions\": [{\"mapKey\": \"anyValue\"}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
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
    Response<GetSecret> response = secretsManagerService.getSecret(getSecretOptionsModel).execute();
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
    secretsManagerService.getSecret(null).execute();
  }

  @Test
  public void testUpdateSecretWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"secret_group_id\": \"secretGroupId\", \"labels\": [\"labels\"], \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"createdBy\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions_total\": 1, \"versions\": [{\"mapKey\": \"anyValue\"}], \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"payload\": \"payload\", \"secret_data\": {\"mapKey\": \"anyValue\"}}]}";
    String updateSecretPath = "/api/v1/secrets/arbitrary/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RotateArbitrarySecretBody model
    RotateArbitrarySecretBody secretActionModel = new RotateArbitrarySecretBody.Builder()
    .payload("testString")
    .build();

    // Construct an instance of the UpdateSecretOptions model
    UpdateSecretOptions updateSecretOptionsModel = new UpdateSecretOptions.Builder()
    .secretType("arbitrary")
    .id("testString")
    .action("rotate")
    .secretAction(secretActionModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetSecret> response = secretsManagerService.updateSecret(updateSecretOptionsModel).execute();
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
    secretsManagerService.updateSecret(null).execute();
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
    Response<Void> response = secretsManagerService.deleteSecret(deleteSecretOptionsModel).execute();
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
    secretsManagerService.deleteSecret(null).execute();
  }

  @Test
  public void testGetSecretVersionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"id\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"version_id\": \"4a0225e9-17a0-46c1-ace7-f25bcf4237d4\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"validity\": {\"not_before\": \"2020-10-05T21:33:11.000Z\", \"not_after\": \"2021-01-01T00:00:00.000Z\"}, \"serial_number\": \"serialNumber\", \"expiration_date\": \"2030-04-01T09:30:00.000Z\", \"secret_data\": {\"certificate\": \"certificate\", \"private_key\": \"privateKey\", \"intermediate\": \"intermediate\"}}]}";
    String getSecretVersionPath = "/api/v1/secrets/imported_cert/testString/versions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSecretVersionOptions model
    GetSecretVersionOptions getSecretVersionOptionsModel = new GetSecretVersionOptions.Builder()
    .secretType("imported_cert")
    .id("testString")
    .versionId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetSecretVersion> response = secretsManagerService.getSecretVersion(getSecretVersionOptionsModel).execute();
    assertNotNull(response);
    GetSecretVersion responseObj = response.getResult();
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
    assertEquals(parsedPath, getSecretVersionPath);
  }

  // Test the getSecretVersion operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretVersionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    secretsManagerService.getSecretVersion(null).execute();
  }

  @Test
  public void testGetSecretVersionMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"4a0225e9-17a0-46c1-ace7-f25bcf4237d4\", \"creation_date\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\"}]}";
    String getSecretVersionMetadataPath = "/api/v1/secrets/imported_cert/testString/versions/testString/metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSecretVersionMetadataOptions model
    GetSecretVersionMetadataOptions getSecretVersionMetadataOptionsModel = new GetSecretVersionMetadataOptions.Builder()
    .secretType("imported_cert")
    .id("testString")
    .versionId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetSecretVersionMetadata> response = secretsManagerService.getSecretVersionMetadata(getSecretVersionMetadataOptionsModel).execute();
    assertNotNull(response);
    GetSecretVersionMetadata responseObj = response.getResult();
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
    assertEquals(parsedPath, getSecretVersionMetadataPath);
  }

  // Test the getSecretVersionMetadata operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretVersionMetadataNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    secretsManagerService.getSecretVersionMetadata(null).execute();
  }

  @Test
  public void testGetSecretMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"b0283d74-0894-830b-f81d-1f115f67729f\", \"labels\": [\"labels\"], \"name\": \"example-secret\", \"description\": \"Extended description for this secret.\", \"secret_group_id\": \"f5283d74-9024-230a-b72c-1f115f61290f\", \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"ServiceId-cb258cb9-8de3-4ac0-9aec-b2b2d27ac976\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions_total\": 1, \"expiration_date\": \"2030-04-01T09:30:00.000Z\"}]}";
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
    Response<SecretMetadataRequest> response = secretsManagerService.getSecretMetadata(getSecretMetadataOptionsModel).execute();
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
    secretsManagerService.getSecretMetadata(null).execute();
  }

  @Test
  public void testUpdateSecretMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"collection_type\": \"application/vnd.ibm.secrets-manager.config+json\", \"collection_total\": 1}, \"resources\": [{\"id\": \"b0283d74-0894-830b-f81d-1f115f67729f\", \"labels\": [\"labels\"], \"name\": \"example-secret\", \"description\": \"Extended description for this secret.\", \"secret_group_id\": \"f5283d74-9024-230a-b72c-1f115f61290f\", \"state\": 0, \"state_description\": \"Active\", \"secret_type\": \"arbitrary\", \"crn\": \"crn:v1:bluemix:public:secrets-manager:<region>:a/<account-id>:<service-instance>:secret:<secret-id>\", \"creation_date\": \"2018-04-12T23:20:50.520Z\", \"created_by\": \"ServiceId-cb258cb9-8de3-4ac0-9aec-b2b2d27ac976\", \"last_update_date\": \"2018-04-12T23:20:50.520Z\", \"versions_total\": 1, \"expiration_date\": \"2030-04-01T09:30:00.000Z\"}]}";
    String updateSecretMetadataPath = "/api/v1/secrets/arbitrary/testString/metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CollectionMetadata model
    CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
    .collectionType("application/vnd.ibm.secrets-manager.config+json")
    .collectionTotal(Long.valueOf("1"))
    .build();

    // Construct an instance of the ArbitrarySecretMetadata model
    ArbitrarySecretMetadata secretMetadataModel = new ArbitrarySecretMetadata.Builder()
    .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")))
    .name("example-secret")
    .description("Extended description for this secret.")
    .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
    .build();

    // Construct an instance of the UpdateSecretMetadataOptions model
    UpdateSecretMetadataOptions updateSecretMetadataOptionsModel = new UpdateSecretMetadataOptions.Builder()
    .secretType("arbitrary")
    .id("testString")
    .metadata(collectionMetadataModel)
    .resources(new java.util.ArrayList<SecretMetadata>(java.util.Arrays.asList(secretMetadataModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecretMetadataRequest> response = secretsManagerService.updateSecretMetadata(updateSecretMetadataOptionsModel).execute();
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
    secretsManagerService.updateSecretMetadata(null).execute();
  }

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    secretsManagerService = null;
  }
}