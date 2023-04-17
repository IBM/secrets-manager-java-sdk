/*
 * (C) Copyright IBM Corp. 2023.
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
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ActionOnConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretVersionInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretData;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretVersionInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateTemplateConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateTemplatesConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateTemplatesConfigItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateValidity;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ChallengeResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CollectionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementActionData;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementActionResult;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementActionResultConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementDef;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementDefConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementDefConfigClassicInfrastructureConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementDefConfigCloudInternetServicesConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementDefConfigLetsEncryptConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateIAMCredentialsSecretEngineRootConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteCredentialsForIAMCredentialsSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.EngineConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElements;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsResourcesItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsResourcesItemCertificateAuthoritiesConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsResourcesItemDnsProvidersConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigResourcesItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetInstanceLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetNotificationsSettings;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetPolicyOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretPolicies;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSingleConfigElement;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretEngineRootConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretVersionInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.InstanceSecretsLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IntermediateCertificateAuthoritiesConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IntermediateCertificateAuthoritiesConfigItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IntermediateCertificateAuthorityConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IssuanceInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.KvSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.KvSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListAllSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListInstanceSecretsLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretGroupsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretVersions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretVersionsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecrets;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.LockSecretBodyLocksItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.LockSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.LockSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.NotificationsSettings;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertSecretEngineRootConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertificateSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertificateSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertificateSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertificateSecretVersionInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertificateSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertSecretEngineRootConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertificateSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertificateSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PutConfigOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PutPolicyOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RestoreIAMCredentialsSecretBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RevokeAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RevokeActionResult;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RootCertificateAuthoritiesConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RootCertificateAuthoritiesConfigItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RootCertificateAuthorityConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateArbitrarySecretBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateCertificateBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateCrlActionResult;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateKvSecretBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotatePrivateCertBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotatePrivateCertBodyWithCsr;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotatePrivateCertBodyWithVersionCustomMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotatePublicCertBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateUsernamePasswordSecretBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.Rotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretGroupDef;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretGroupMetadataUpdatable;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretGroupResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretLockData;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretLockVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretMetadataRequest;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotationRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotationRotationPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotationRotationPublicCertPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretVersionInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretsLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SendTestNotificationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SetSignedAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SetSignedActionResult;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignActionResultData;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignCsrAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignCsrActionResult;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignIntermediateAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignIntermediateActionResult;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignIntermediateActionResultData;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UnlockSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UnlockSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretGroupMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretVersionInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import com.ibm.cloud.secrets_manager_sdk.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the SecretsManager service.
 */
public class SecretsManagerIT extends SdkIntegrationTestBase {
  public SecretsManager service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../secrets_manager_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = SecretsManager.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(SecretsManager.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testCreateSecretGroup() throws Exception {
    try {
      CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
        .collectionType("application/vnd.ibm.secrets-manager.secret.group+json")
        .collectionTotal(Long.valueOf("1"))
        .build();

      SecretGroupResource secretGroupResourceModel = new SecretGroupResource.Builder()
        .name("my-secret-group")
        .description("Extended description for this group.")
        .add("foo", "testString")
        .build();

      CreateSecretGroupOptions createSecretGroupOptions = new CreateSecretGroupOptions.Builder()
        .metadata(collectionMetadataModel)
        .resources(java.util.Arrays.asList(secretGroupResourceModel))
        .build();

      // Invoke operation
      Response<SecretGroupDef> response = service.createSecretGroup(createSecretGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretGroupDef secretGroupDefResult = response.getResult();

      assertNotNull(secretGroupDefResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecretGroup" })
  public void testListSecretGroups() throws Exception {
    try {
      ListSecretGroupsOptions listSecretGroupsOptions = new ListSecretGroupsOptions();

      // Invoke operation
      Response<SecretGroupDef> response = service.listSecretGroups(listSecretGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretGroupDef secretGroupDefResult = response.getResult();

      assertNotNull(secretGroupDefResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretGroups" })
  public void testGetSecretGroup() throws Exception {
    try {
      GetSecretGroupOptions getSecretGroupOptions = new GetSecretGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<SecretGroupDef> response = service.getSecretGroup(getSecretGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretGroupDef secretGroupDefResult = response.getResult();

      assertNotNull(secretGroupDefResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretGroup" })
  public void testUpdateSecretGroupMetadata() throws Exception {
    try {
      CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
        .collectionType("application/vnd.ibm.secrets-manager.secret.group+json")
        .collectionTotal(Long.valueOf("1"))
        .build();

      SecretGroupMetadataUpdatable secretGroupMetadataUpdatableModel = new SecretGroupMetadataUpdatable.Builder()
        .name("updated-secret-group-name")
        .description("Updated description for this group.")
        .build();

      UpdateSecretGroupMetadataOptions updateSecretGroupMetadataOptions = new UpdateSecretGroupMetadataOptions.Builder()
        .id("testString")
        .metadata(collectionMetadataModel)
        .resources(java.util.Arrays.asList(secretGroupMetadataUpdatableModel))
        .build();

      // Invoke operation
      Response<SecretGroupDef> response = service.updateSecretGroupMetadata(updateSecretGroupMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretGroupDef secretGroupDefResult = response.getResult();

      assertNotNull(secretGroupDefResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecretGroupMetadata" })
  public void testCreateSecret() throws Exception {
    try {
      CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
        .collectionType("application/vnd.ibm.secrets-manager.secret+json")
        .collectionTotal(Long.valueOf("1"))
        .build();

      ArbitrarySecretResource secretResourceModel = new ArbitrarySecretResource.Builder()
        .name("example-arbitrary-secret")
        .description("Extended description for this secret.")
        .secretGroupId("bc656587-8fda-4d05-9ad8-b1de1ec7e712")
        .labels(java.util.Arrays.asList("dev", "us-south"))
        .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .expirationDate(DateUtils.parseAsDateTime("2030-01-01T00:00:00Z"))
        .payload("secret-data")
        .build();

      CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
        .secretType("arbitrary")
        .metadata(collectionMetadataModel)
        .resources(java.util.Arrays.asList(secretResourceModel))
        .build();

      // Invoke operation
      Response<CreateSecret> response = service.createSecret(createSecretOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CreateSecret createSecretResult = response.getResult();

      assertNotNull(createSecretResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecret" })
  public void testListSecrets() throws Exception {
    try {
      ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
        .secretType("arbitrary")
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .build();

      // Invoke operation
      Response<ListSecrets> response = service.listSecrets(listSecretsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSecrets listSecretsResult = response.getResult();

      assertNotNull(listSecretsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecrets" })
  public void testListAllSecrets() throws Exception {
    try {
      ListAllSecretsOptions listAllSecretsOptions = new ListAllSecretsOptions.Builder()
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .search("testString")
        .sortBy("id")
        .groups(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<ListSecrets> response = service.listAllSecrets(listAllSecretsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSecrets listSecretsResult = response.getResult();

      assertNotNull(listSecretsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAllSecrets" })
  public void testGetSecret() throws Exception {
    try {
      GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .build();

      // Invoke operation
      Response<GetSecret> response = service.getSecret(getSecretOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecret getSecretResult = response.getResult();

      assertNotNull(getSecretResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecret" })
  public void testUpdateSecret() throws Exception {
    try {
      RotateArbitrarySecretBody secretActionModel = new RotateArbitrarySecretBody.Builder()
        .payload("testString")
        .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      UpdateSecretOptions updateSecretOptions = new UpdateSecretOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .action("rotate")
        .secretAction(secretActionModel)
        .build();

      // Invoke operation
      Response<GetSecret> response = service.updateSecret(updateSecretOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecret getSecretResult = response.getResult();

      assertNotNull(getSecretResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecret" })
  public void testListSecretVersions() throws Exception {
    try {
      ListSecretVersionsOptions listSecretVersionsOptions = new ListSecretVersionsOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .build();

      // Invoke operation
      Response<ListSecretVersions> response = service.listSecretVersions(listSecretVersionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSecretVersions listSecretVersionsResult = response.getResult();

      assertNotNull(listSecretVersionsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretVersions" })
  public void testGetSecretVersion() throws Exception {
    try {
      GetSecretVersionOptions getSecretVersionOptions = new GetSecretVersionOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .versionId("testString")
        .build();

      // Invoke operation
      Response<GetSecretVersion> response = service.getSecretVersion(getSecretVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretVersion getSecretVersionResult = response.getResult();

      assertNotNull(getSecretVersionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretVersion" })
  public void testUpdateSecretVersion() throws Exception {
    try {
      UpdateSecretVersionOptions updateSecretVersionOptions = new UpdateSecretVersionOptions.Builder()
        .secretType("private_cert")
        .id("testString")
        .versionId("testString")
        .action("revoke")
        .build();

      // Invoke operation
      Response<GetSecret> response = service.updateSecretVersion(updateSecretVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecret getSecretResult = response.getResult();

      assertNotNull(getSecretResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecretVersion" })
  public void testGetSecretVersionMetadata() throws Exception {
    try {
      GetSecretVersionMetadataOptions getSecretVersionMetadataOptions = new GetSecretVersionMetadataOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .versionId("testString")
        .build();

      // Invoke operation
      Response<GetSecretVersionMetadata> response = service.getSecretVersionMetadata(getSecretVersionMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretVersionMetadata getSecretVersionMetadataResult = response.getResult();

      assertNotNull(getSecretVersionMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretVersionMetadata" })
  public void testUpdateSecretVersionMetadata() throws Exception {
    try {
      CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
        .collectionType("application/vnd.ibm.secrets-manager.secret+json")
        .collectionTotal(Long.valueOf("1"))
        .build();

      UpdateSecretVersionMetadata updateSecretVersionMetadataModel = new UpdateSecretVersionMetadata.Builder()
        .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      UpdateSecretVersionMetadataOptions updateSecretVersionMetadataOptions = new UpdateSecretVersionMetadataOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .versionId("testString")
        .metadata(collectionMetadataModel)
        .resources(java.util.Arrays.asList(updateSecretVersionMetadataModel))
        .build();

      // Invoke operation
      Response<GetSecretVersionMetadata> response = service.updateSecretVersionMetadata(updateSecretVersionMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretVersionMetadata getSecretVersionMetadataResult = response.getResult();

      assertNotNull(getSecretVersionMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecretVersionMetadata" })
  public void testGetSecretMetadata() throws Exception {
    try {
      GetSecretMetadataOptions getSecretMetadataOptions = new GetSecretMetadataOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .build();

      // Invoke operation
      Response<SecretMetadataRequest> response = service.getSecretMetadata(getSecretMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretMetadataRequest secretMetadataRequestResult = response.getResult();

      assertNotNull(secretMetadataRequestResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretMetadata" })
  public void testUpdateSecretMetadata() throws Exception {
    try {
      CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
        .collectionType("application/vnd.ibm.secrets-manager.secret+json")
        .collectionTotal(Long.valueOf("1"))
        .build();

      ArbitrarySecretMetadata secretMetadataModel = new ArbitrarySecretMetadata.Builder()
        .labels(java.util.Arrays.asList("dev", "us-south"))
        .name("updated-secret-name")
        .description("Updated description for this secret.")
        .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00Z"))
        .build();

      UpdateSecretMetadataOptions updateSecretMetadataOptions = new UpdateSecretMetadataOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .metadata(collectionMetadataModel)
        .resources(java.util.Arrays.asList(secretMetadataModel))
        .build();

      // Invoke operation
      Response<SecretMetadataRequest> response = service.updateSecretMetadata(updateSecretMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretMetadataRequest secretMetadataRequestResult = response.getResult();

      assertNotNull(secretMetadataRequestResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecretMetadata" })
  public void testGetLocks() throws Exception {
    try {
      GetLocksOptions getLocksOptions = new GetLocksOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .search("testString")
        .build();

      // Invoke operation
      Response<ListSecretLocks> response = service.getLocks(getLocksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSecretLocks listSecretLocksResult = response.getResult();

      assertNotNull(listSecretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLocks" })
  public void testLockSecret() throws Exception {
    try {
      LockSecretBodyLocksItem lockSecretBodyLocksItemModel = new LockSecretBodyLocksItem.Builder()
        .name("lock-1")
        .description("lock for consumer-1")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      LockSecretOptions lockSecretOptions = new LockSecretOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .locks(java.util.Arrays.asList(lockSecretBodyLocksItemModel))
        .mode("exclusive")
        .build();

      // Invoke operation
      Response<GetSecretLocks> response = service.lockSecret(lockSecretOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretLocks getSecretLocksResult = response.getResult();

      assertNotNull(getSecretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testLockSecret" })
  public void testUnlockSecret() throws Exception {
    try {
      UnlockSecretOptions unlockSecretOptions = new UnlockSecretOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .locks(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<GetSecretLocks> response = service.unlockSecret(unlockSecretOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretLocks getSecretLocksResult = response.getResult();

      assertNotNull(getSecretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUnlockSecret" })
  public void testGetSecretVersionLocks() throws Exception {
    try {
      GetSecretVersionLocksOptions getSecretVersionLocksOptions = new GetSecretVersionLocksOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .versionId("testString")
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .search("testString")
        .build();

      // Invoke operation
      Response<ListSecretLocks> response = service.getSecretVersionLocks(getSecretVersionLocksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSecretLocks listSecretLocksResult = response.getResult();

      assertNotNull(listSecretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretVersionLocks" })
  public void testLockSecretVersion() throws Exception {
    try {
      LockSecretBodyLocksItem lockSecretBodyLocksItemModel = new LockSecretBodyLocksItem.Builder()
        .name("lock-1")
        .description("lock for consumer-1")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      LockSecretVersionOptions lockSecretVersionOptions = new LockSecretVersionOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .versionId("testString")
        .locks(java.util.Arrays.asList(lockSecretBodyLocksItemModel))
        .mode("exclusive")
        .build();

      // Invoke operation
      Response<GetSecretLocks> response = service.lockSecretVersion(lockSecretVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretLocks getSecretLocksResult = response.getResult();

      assertNotNull(getSecretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testLockSecretVersion" })
  public void testUnlockSecretVersion() throws Exception {
    try {
      UnlockSecretVersionOptions unlockSecretVersionOptions = new UnlockSecretVersionOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .versionId("testString")
        .locks(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<GetSecretLocks> response = service.unlockSecretVersion(unlockSecretVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretLocks getSecretLocksResult = response.getResult();

      assertNotNull(getSecretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUnlockSecretVersion" })
  public void testListInstanceSecretsLocks() throws Exception {
    try {
      ListInstanceSecretsLocksOptions listInstanceSecretsLocksOptions = new ListInstanceSecretsLocksOptions.Builder()
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .search("testString")
        .groups(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<GetInstanceLocks> response = service.listInstanceSecretsLocks(listInstanceSecretsLocksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetInstanceLocks getInstanceLocksResult = response.getResult();

      assertNotNull(getInstanceLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceSecretsLocks" })
  public void testPutPolicy() throws Exception {
    try {
      CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
        .collectionType("application/vnd.ibm.secrets-manager.config+json")
        .collectionTotal(Long.valueOf("1"))
        .build();

      SecretPolicyRotationRotationPolicyRotation secretPolicyRotationRotationModel = new SecretPolicyRotationRotationPolicyRotation.Builder()
        .interval(Long.valueOf("1"))
        .unit("day")
        .build();

      SecretPolicyRotation secretPolicyRotationModel = new SecretPolicyRotation.Builder()
        .type("application/vnd.ibm.secrets-manager.secret.policy+json")
        .rotation(secretPolicyRotationRotationModel)
        .build();

      PutPolicyOptions putPolicyOptions = new PutPolicyOptions.Builder()
        .secretType("username_password")
        .id("testString")
        .metadata(collectionMetadataModel)
        .resources(java.util.Arrays.asList(secretPolicyRotationModel))
        .policy("rotation")
        .build();

      // Invoke operation
      Response<GetSecretPolicies> response = service.putPolicy(putPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretPolicies getSecretPoliciesResult = response.getResult();

      assertNotNull(getSecretPoliciesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPutPolicy" })
  public void testGetPolicy() throws Exception {
    try {
      GetPolicyOptions getPolicyOptions = new GetPolicyOptions.Builder()
        .secretType("username_password")
        .id("testString")
        .policy("rotation")
        .build();

      // Invoke operation
      Response<GetSecretPolicies> response = service.getPolicy(getPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSecretPolicies getSecretPoliciesResult = response.getResult();

      assertNotNull(getSecretPoliciesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPolicy" })
  public void testPutConfig() throws Exception {
    try {
      CreateIAMCredentialsSecretEngineRootConfig engineConfigModel = new CreateIAMCredentialsSecretEngineRootConfig.Builder()
        .apiKey("API_KEY")
        .build();

      PutConfigOptions putConfigOptions = new PutConfigOptions.Builder()
        .secretType("iam_credentials")
        .engineConfig(engineConfigModel)
        .build();

      // Invoke operation
      Response<Void> response = service.putConfig(putConfigOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPutConfig" })
  public void testGetConfig() throws Exception {
    try {
      GetConfigOptions getConfigOptions = new GetConfigOptions.Builder()
        .secretType("iam_credentials")
        .build();

      // Invoke operation
      Response<GetConfig> response = service.getConfig(getConfigOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetConfig getConfigResult = response.getResult();

      assertNotNull(getConfigResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfig" })
  public void testCreateConfigElement() throws Exception {
    try {
      ConfigElementDefConfigCloudInternetServicesConfig configElementDefConfigModel = new ConfigElementDefConfigCloudInternetServicesConfig.Builder()
        .cisCrn("crn:v1:bluemix:public:internet-svcs:global:a/<account-id>:<service-instance>::")
        .cisApikey("cis_apikey_value")
        .build();

      CreateConfigElementOptions createConfigElementOptions = new CreateConfigElementOptions.Builder()
        .secretType("public_cert")
        .configElement("certificate_authorities")
        .name("cis-example-config")
        .type("cis")
        .config(configElementDefConfigModel)
        .build();

      // Invoke operation
      Response<GetSingleConfigElement> response = service.createConfigElement(createConfigElementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      GetSingleConfigElement getSingleConfigElementResult = response.getResult();

      assertNotNull(getSingleConfigElementResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateConfigElement" })
  public void testGetConfigElements() throws Exception {
    try {
      GetConfigElementsOptions getConfigElementsOptions = new GetConfigElementsOptions.Builder()
        .secretType("public_cert")
        .configElement("certificate_authorities")
        .build();

      // Invoke operation
      Response<GetConfigElements> response = service.getConfigElements(getConfigElementsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetConfigElements getConfigElementsResult = response.getResult();

      assertNotNull(getConfigElementsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfigElements" })
  public void testGetConfigElement() throws Exception {
    try {
      GetConfigElementOptions getConfigElementOptions = new GetConfigElementOptions.Builder()
        .secretType("public_cert")
        .configElement("certificate_authorities")
        .configName("testString")
        .build();

      // Invoke operation
      Response<GetSingleConfigElement> response = service.getConfigElement(getConfigElementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSingleConfigElement getSingleConfigElementResult = response.getResult();

      assertNotNull(getSingleConfigElementResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfigElement" })
  public void testUpdateConfigElement() throws Exception {
    try {
      UpdateConfigElementOptions updateConfigElementOptions = new UpdateConfigElementOptions.Builder()
        .secretType("public_cert")
        .configElement("certificate_authorities")
        .configName("testString")
        .type("cis")
        .config(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      // Invoke operation
      Response<GetSingleConfigElement> response = service.updateConfigElement(updateConfigElementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSingleConfigElement getSingleConfigElementResult = response.getResult();

      assertNotNull(getSingleConfigElementResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateConfigElement" })
  public void testActionOnConfigElement() throws Exception {
    try {
      SignCsrAction configActionModel = new SignCsrAction.Builder()
        .commonName("example.com")
        .altNames("testString")
        .ipSans("testString")
        .uriSans("testString")
        .otherSans(java.util.Arrays.asList("testString"))
        .ttl("12h")
        .format("pem")
        .maxPathLength(Long.valueOf("26"))
        .excludeCnFromSans(false)
        .permittedDnsDomains(java.util.Arrays.asList("testString"))
        .useCsrValues(false)
        .ou(java.util.Arrays.asList("testString"))
        .organization(java.util.Arrays.asList("testString"))
        .country(java.util.Arrays.asList("testString"))
        .locality(java.util.Arrays.asList("testString"))
        .province(java.util.Arrays.asList("testString"))
        .streetAddress(java.util.Arrays.asList("testString"))
        .postalCode(java.util.Arrays.asList("testString"))
        .serialNumber("d9:be:fe:35:ba:09:42:b5")
        .csr("testString")
        .build();

      ActionOnConfigElementOptions actionOnConfigElementOptions = new ActionOnConfigElementOptions.Builder()
        .secretType("private_cert")
        .configElement("root_certificate_authorities")
        .configName("testString")
        .action("sign_intermediate")
        .config(configActionModel)
        .build();

      // Invoke operation
      Response<ConfigElementActionResult> response = service.actionOnConfigElement(actionOnConfigElementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigElementActionResult configElementActionResultResult = response.getResult();

      assertNotNull(configElementActionResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testActionOnConfigElement" })
  public void testCreateNotificationsRegistration() throws Exception {
    try {
      CreateNotificationsRegistrationOptions createNotificationsRegistrationOptions = new CreateNotificationsRegistrationOptions.Builder()
        .eventNotificationsInstanceCrn("crn:v1:bluemix:public:event-notifications:us-south:a/<account-id>:<service-instance>::")
        .eventNotificationsSourceName("My Secrets Manager")
        .eventNotificationsSourceDescription("Optional description of this source in an Event Notifications instance.")
        .build();

      // Invoke operation
      Response<GetNotificationsSettings> response = service.createNotificationsRegistration(createNotificationsRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      GetNotificationsSettings getNotificationsSettingsResult = response.getResult();

      assertNotNull(getNotificationsSettingsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateNotificationsRegistration" })
  public void testGetNotificationsRegistration() throws Exception {
    try {
      GetNotificationsRegistrationOptions getNotificationsRegistrationOptions = new GetNotificationsRegistrationOptions();

      // Invoke operation
      Response<GetNotificationsSettings> response = service.getNotificationsRegistration(getNotificationsRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetNotificationsSettings getNotificationsSettingsResult = response.getResult();

      assertNotNull(getNotificationsSettingsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetNotificationsRegistration" })
  public void testSendTestNotification() throws Exception {
    try {
      SendTestNotificationOptions sendTestNotificationOptions = new SendTestNotificationOptions();

      // Invoke operation
      Response<Void> response = service.sendTestNotification(sendTestNotificationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testSendTestNotification" })
  public void testDeleteSecretGroup() throws Exception {
    try {
      DeleteSecretGroupOptions deleteSecretGroupOptions = new DeleteSecretGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSecretGroup(deleteSecretGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecretGroup" })
  public void testDeleteSecret() throws Exception {
    try {
      DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
        .secretType("arbitrary")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSecret(deleteSecretOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecret" })
  public void testDeleteConfigElement() throws Exception {
    try {
      DeleteConfigElementOptions deleteConfigElementOptions = new DeleteConfigElementOptions.Builder()
        .secretType("public_cert")
        .configElement("certificate_authorities")
        .configName("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteConfigElement(deleteConfigElementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteConfigElement" })
  public void testDeleteNotificationsRegistration() throws Exception {
    try {
      DeleteNotificationsRegistrationOptions deleteNotificationsRegistrationOptions = new DeleteNotificationsRegistrationOptions();

      // Invoke operation
      Response<Void> response = service.deleteNotificationsRegistration(deleteNotificationsRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
