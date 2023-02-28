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

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CertificateIssuanceInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CertificateValidity;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ChallengeResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.Configuration;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationActionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationMetadataPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationPrototype;
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsConfiguration;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsConfigurationMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsConfigurationPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsConfigurationPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretRestoreFromVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListConfigurationsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretGroupsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretVersionLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretVersionsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretsLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.NotificationsRegistration;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PaginatedCollectionFirst;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PaginatedCollectionLast;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PaginatedCollectionNext;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PaginatedCollectionPrevious;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateActionRevoke;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCAData;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRevoke;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRotateCRL;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRotateCRLPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionSetSigned;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionSetSignedPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionSignCSR;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionSignCSRPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionSignIntermediate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionSignIntermediatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationCACertificate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCA;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCACSR;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCAMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCAPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCAPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRootCA;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRootCAMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRootCAPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRootCAPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplateMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplatePatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateVersionActionRevoke;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateVersionActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateActionValidateManualDNS;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateActionValidateManualDNSPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationCALetsEncrypt;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationCALetsEncryptMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationCALetsEncryptPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationCALetsEncryptPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSClassicInfrastructure;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSClassicInfrastructureMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSClassicInfrastructurePatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSClassicInfrastructurePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSCloudInternetServices;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSCloudInternetServicesMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSCloudInternetServicesPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSCloudInternetServicesPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateRotationObject;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.RotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.Secret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretActionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroup;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroupCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroupPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLock;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLockPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLocksPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLocksPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretMetadataPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionActionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionLocksPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionLocksPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadataCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretsLocksPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretsLocksPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretsPager;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecretVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.VersionAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import com.ibm.cloud.secrets_manager_sdk.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.ArrayList;
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

  // Variables to hold link values
  String configurationNameForGetConfigurationLink = null;
  String secretGroupIdForGetSecretGroupLink = null;
  String secretIdForCreateSecretVersionLink = null;
  String secretIdForCreateSecretVersionLocksLink = null;
  String secretIdForGetSecretLink = null;
  String secretIdForGetSecretVersionLink = null;
  String secretIdForListSecretLocksLink = null;
  String secretIdForListSecretVersionLocksLink = null;
  String secretVersionIdForCreateSecretVersionLocksLink = null;
  String secretVersionIdForDeleteSecretVersionLocksLink = null;
  String secretVersionIdForGetSecretVersionLink = null;
  String secretVersionIdForGetSecretVersionMetadataLink = null;
  String secretVersionIdForListSecretVersionLocksLink = null;
  String secretVersionIdForUpdateSecretVersionMetadataLink = null;

  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../secrets_manager_v2.env";
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
      CreateSecretGroupOptions createSecretGroupOptions = new CreateSecretGroupOptions.Builder()
        .name("my-secret-group")
        .description("Extended description for this group.")
        .build();

      // Invoke operation
      Response<SecretGroup> response = service.createSecretGroup(createSecretGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecretGroup secretGroupResult = response.getResult();

      assertNotNull(secretGroupResult);
      secretGroupIdForGetSecretGroupLink = secretGroupResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecretGroup" })
  public void testCreateSecret() throws Exception {
    try {
      ArbitrarySecretPrototype secretPrototypeModel = new ArbitrarySecretPrototype.Builder()
        .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .description("Description of my arbitrary secret.")
        .expirationDate(DateUtils.parseAsDateTime("2023-10-05T11:49:42Z"))
        .labels(java.util.Arrays.asList("dev", "us-south"))
        .name("example-arbitrary-secret")
        .secretGroupId("default")
        .secretType("arbitrary")
        .payload("secret-data")
        .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
        .secretPrototype(secretPrototypeModel)
        .build();

      // Invoke operation
      Response<Secret> response = service.createSecret(createSecretOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Secret secretResult = response.getResult();

      assertNotNull(secretResult);
      secretIdForGetSecretLink = secretResult.getId();
      secretIdForGetSecretVersionLink = secretResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecret" })
  public void testListSecretVersions() throws Exception {
    try {
      ListSecretVersionsOptions listSecretVersionsOptions = new ListSecretVersionsOptions.Builder()
        .secretId(secretIdForGetSecretLink)
        .build();

      // Invoke operation
      Response<SecretVersionMetadataCollection> response = service.listSecretVersions(listSecretVersionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretVersionMetadataCollection secretVersionMetadataCollectionResult = response.getResult();

      assertNotNull(secretVersionMetadataCollectionResult);
      secretVersionIdForGetSecretVersionLink = secretVersionMetadataCollectionResult.getVersions().get(0).getId();
      secretIdForCreateSecretVersionLink = secretVersionMetadataCollectionResult.getVersions().get(0).getSecretId();
      secretVersionIdForGetSecretVersionMetadataLink = secretVersionMetadataCollectionResult.getVersions().get(0).getId();
      secretVersionIdForUpdateSecretVersionMetadataLink = secretVersionMetadataCollectionResult.getVersions().get(0).getId();
      secretIdForCreateSecretVersionLocksLink = secretVersionMetadataCollectionResult.getVersions().get(0).getSecretId();
      secretVersionIdForCreateSecretVersionLocksLink = secretVersionMetadataCollectionResult.getVersions().get(0).getId();
      secretVersionIdForDeleteSecretVersionLocksLink = secretVersionMetadataCollectionResult.getVersions().get(0).getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretVersions" })
  public void testCreateSecretLocksBulk() throws Exception {
    try {
      SecretLockPrototype secretLockPrototypeModel = new SecretLockPrototype.Builder()
        .name("lock-example-1")
        .description("lock for consumer 1")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      CreateSecretLocksBulkOptions createSecretLocksBulkOptions = new CreateSecretLocksBulkOptions.Builder()
        .id(secretIdForGetSecretLink)
        .locks(java.util.Arrays.asList(secretLockPrototypeModel))
        .mode("exclusive")
        .build();

      // Invoke operation
      Response<SecretLocks> response = service.createSecretLocksBulk(createSecretLocksBulkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecretLocks secretLocksResult = response.getResult();

      assertNotNull(secretLocksResult);
      secretIdForListSecretLocksLink = secretLocksResult.getSecretId();
      secretIdForListSecretVersionLocksLink = secretLocksResult.getSecretId();
      secretVersionIdForListSecretVersionLocksLink = secretLocksResult.getVersions().get(0).getVersionId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecretLocksBulk" })
  public void testCreateConfiguration() throws Exception {
    try {
      PrivateCertificateConfigurationRootCAPrototype configurationPrototypeModel = new PrivateCertificateConfigurationRootCAPrototype.Builder()
        .configType("private_cert_configuration_root_ca")
        .name("example-root-CA")
        .maxTtl("43830h")
        .crlExpiry("72h")
        .crlDisable(false)
        .crlDistributionPointsEncoded(true)
        .issuingCertificatesUrlsEncoded(true)
        .commonName("example.com")
        .altNames(java.util.Arrays.asList("s1.example.com", "*.s2.example.com"))
        .ipSans("1.1.1.1, 2.2.2.2")
        .uriSans("testString")
        .otherSans(java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"))
        .ttl("8760h")
        .format("pem")
        .privateKeyFormat("der")
        .keyType("rsa")
        .keyBits(Long.valueOf("4096"))
        .maxPathLength(Long.valueOf("26"))
        .excludeCnFromSans(true)
        .permittedDnsDomains(java.util.Arrays.asList("testString"))
        .ou(java.util.Arrays.asList("testString"))
        .organization(java.util.Arrays.asList("testString"))
        .country(java.util.Arrays.asList("testString"))
        .locality(java.util.Arrays.asList("testString"))
        .province(java.util.Arrays.asList("testString"))
        .streetAddress(java.util.Arrays.asList("testString"))
        .postalCode(java.util.Arrays.asList("testString"))
        .serialNumber("d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5")
        .build();

      CreateConfigurationOptions createConfigurationOptions = new CreateConfigurationOptions.Builder()
        .configurationPrototype(configurationPrototypeModel)
        .build();

      // Invoke operation
      Response<Configuration> response = service.createConfiguration(createConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Configuration configurationResult = response.getResult();

      assertNotNull(configurationResult);
      configurationNameForGetConfigurationLink = configurationResult.getName();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateConfiguration" })
  public void testListSecretGroups() throws Exception {
    try {
      ListSecretGroupsOptions listSecretGroupsOptions = new ListSecretGroupsOptions();

      // Invoke operation
      Response<SecretGroupCollection> response = service.listSecretGroups(listSecretGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretGroupCollection secretGroupCollectionResult = response.getResult();

      assertNotNull(secretGroupCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretGroups" })
  public void testGetSecretGroup() throws Exception {
    try {
      GetSecretGroupOptions getSecretGroupOptions = new GetSecretGroupOptions.Builder()
        .id(secretGroupIdForGetSecretGroupLink)
        .build();

      // Invoke operation
      Response<SecretGroup> response = service.getSecretGroup(getSecretGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretGroup secretGroupResult = response.getResult();

      assertNotNull(secretGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretGroup" })
  public void testUpdateSecretGroup() throws Exception {
    try {
      SecretGroupPatch secretGroupPatchModel = new SecretGroupPatch.Builder()
        .name("my-secret-group")
        .description("Extended description for this group.")
        .build();
      Map<String, Object> secretGroupPatchModelAsPatch = secretGroupPatchModel.asPatch();

      UpdateSecretGroupOptions updateSecretGroupOptions = new UpdateSecretGroupOptions.Builder()
        .id(secretGroupIdForGetSecretGroupLink)
        .secretGroupPatch(secretGroupPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<SecretGroup> response = service.updateSecretGroup(updateSecretGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretGroup secretGroupResult = response.getResult();

      assertNotNull(secretGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecretGroup" })
  public void testListSecrets() throws Exception {
    try {
      ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .sort("created_at")
        .search("example")
        .groups(java.util.Arrays.asList("default"))
        .build();

      // Invoke operation
      Response<SecretMetadataPaginatedCollection> response = service.listSecrets(listSecretsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretMetadataPaginatedCollection secretMetadataPaginatedCollectionResult = response.getResult();

      assertNotNull(secretMetadataPaginatedCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecrets" })
  public void testListSecretsWithPager() throws Exception {
    try {
      ListSecretsOptions options = new ListSecretsOptions.Builder()
        .limit(Long.valueOf("10"))
        .sort("created_at")
        .search("example")
        .groups(java.util.Arrays.asList("default"))
        .build();

      // Test getNext().
      List<SecretMetadata> allResults = new ArrayList<>();
      SecretsPager pager = new SecretsPager(service, options);
      while (pager.hasNext()) {
        List<SecretMetadata> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SecretsPager(service, options);
      List<SecretMetadata> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecrets" })
  public void testGetSecret() throws Exception {
    try {
      GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
        .id(secretIdForGetSecretLink)
        .build();

      // Invoke operation
      Response<Secret> response = service.getSecret(getSecretOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Secret secretResult = response.getResult();

      assertNotNull(secretResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecret" })
  public void testGetSecretMetadata() throws Exception {
    try {
      GetSecretMetadataOptions getSecretMetadataOptions = new GetSecretMetadataOptions.Builder()
        .id(secretIdForGetSecretLink)
        .build();

      // Invoke operation
      Response<SecretMetadata> response = service.getSecretMetadata(getSecretMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretMetadata secretMetadataResult = response.getResult();

      assertNotNull(secretMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretMetadata" })
  public void testUpdateSecretMetadata() throws Exception {
    try {
      ArbitrarySecretMetadataPatch secretMetadataPatchModel = new ArbitrarySecretMetadataPatch.Builder()
        .name("updated-arbitrary-secret-name")
        .description("updated Arbitrary Secret description")
        .labels(java.util.Arrays.asList("dev", "us-south"))
        .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
        .build();
      Map<String, Object> secretMetadataPatchModelAsPatch = secretMetadataPatchModel.asPatch();

      UpdateSecretMetadataOptions updateSecretMetadataOptions = new UpdateSecretMetadataOptions.Builder()
        .id(secretIdForGetSecretLink)
        .secretMetadataPatch(secretMetadataPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<SecretMetadata> response = service.updateSecretMetadata(updateSecretMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretMetadata secretMetadataResult = response.getResult();

      assertNotNull(secretMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecretMetadata" })
  public void testCreateSecretAction() throws Exception {
    try {
      PublicCertificateActionValidateManualDNSPrototype secretActionPrototypeModel = new PublicCertificateActionValidateManualDNSPrototype.Builder()
        .actionType("private_cert_action_revoke_certificate")
        .build();

      CreateSecretActionOptions createSecretActionOptions = new CreateSecretActionOptions.Builder()
        .id(secretIdForGetSecretLink)
        .secretActionPrototype(secretActionPrototypeModel)
        .build();

      // Invoke operation
      Response<SecretAction> response = service.createSecretAction(createSecretActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecretAction secretActionResult = response.getResult();

      assertNotNull(secretActionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecretAction" })
  public void testCreateSecretVersion() throws Exception {
    try {
      ArbitrarySecretVersionPrototype secretVersionPrototypeModel = new ArbitrarySecretVersionPrototype.Builder()
        .payload("updated secret credentials")
        .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      CreateSecretVersionOptions createSecretVersionOptions = new CreateSecretVersionOptions.Builder()
        .secretId(secretIdForCreateSecretVersionLink)
        .secretVersionPrototype(secretVersionPrototypeModel)
        .build();

      // Invoke operation
      Response<SecretVersion> response = service.createSecretVersion(createSecretVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecretVersion secretVersionResult = response.getResult();

      assertNotNull(secretVersionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecretVersion" })
  public void testGetSecretVersion() throws Exception {
    try {
      GetSecretVersionOptions getSecretVersionOptions = new GetSecretVersionOptions.Builder()
        .secretId(secretIdForGetSecretVersionLink)
        .id(secretVersionIdForGetSecretVersionLink)
        .build();

      // Invoke operation
      Response<SecretVersion> response = service.getSecretVersion(getSecretVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretVersion secretVersionResult = response.getResult();

      assertNotNull(secretVersionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretVersion" })
  public void testGetSecretVersionMetadata() throws Exception {
    try {
      GetSecretVersionMetadataOptions getSecretVersionMetadataOptions = new GetSecretVersionMetadataOptions.Builder()
        .secretId(secretIdForGetSecretLink)
        .id(secretVersionIdForGetSecretVersionMetadataLink)
        .build();

      // Invoke operation
      Response<SecretVersionMetadata> response = service.getSecretVersionMetadata(getSecretVersionMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretVersionMetadata secretVersionMetadataResult = response.getResult();

      assertNotNull(secretVersionMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecretVersionMetadata" })
  public void testUpdateSecretVersionMetadata() throws Exception {
    try {
      SecretVersionMetadataPatch secretVersionMetadataPatchModel = new SecretVersionMetadataPatch.Builder()
        .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();
      Map<String, Object> secretVersionMetadataPatchModelAsPatch = secretVersionMetadataPatchModel.asPatch();

      UpdateSecretVersionMetadataOptions updateSecretVersionMetadataOptions = new UpdateSecretVersionMetadataOptions.Builder()
        .secretId(secretIdForGetSecretLink)
        .id(secretVersionIdForUpdateSecretVersionMetadataLink)
        .secretVersionMetadataPatch(secretVersionMetadataPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<SecretVersionMetadata> response = service.updateSecretVersionMetadata(updateSecretVersionMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretVersionMetadata secretVersionMetadataResult = response.getResult();

      assertNotNull(secretVersionMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecretVersionMetadata" })
  public void testCreateSecretVersionAction() throws Exception {
    try {
      PrivateCertificateVersionActionRevokePrototype secretVersionActionPrototypeModel = new PrivateCertificateVersionActionRevokePrototype.Builder()
        .actionType("private_cert_action_revoke_certificate")
        .build();

      CreateSecretVersionActionOptions createSecretVersionActionOptions = new CreateSecretVersionActionOptions.Builder()
        .secretId(secretIdForGetSecretLink)
        .id(secretIdForGetSecretLink)
        .secretVersionActionPrototype(secretVersionActionPrototypeModel)
        .build();

      // Invoke operation
      Response<VersionAction> response = service.createSecretVersionAction(createSecretVersionActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VersionAction versionActionResult = response.getResult();

      assertNotNull(versionActionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecretVersionAction" })
  public void testListSecretsLocks() throws Exception {
    try {
      ListSecretsLocksOptions listSecretsLocksOptions = new ListSecretsLocksOptions.Builder()
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .search("example")
        .groups(java.util.Arrays.asList("default"))
        .build();

      // Invoke operation
      Response<SecretsLocksPaginatedCollection> response = service.listSecretsLocks(listSecretsLocksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretsLocksPaginatedCollection secretsLocksPaginatedCollectionResult = response.getResult();

      assertNotNull(secretsLocksPaginatedCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretsLocks" })
  public void testListSecretsLocksWithPager() throws Exception {
    try {
      ListSecretsLocksOptions options = new ListSecretsLocksOptions.Builder()
        .limit(Long.valueOf("10"))
        .search("example")
        .groups(java.util.Arrays.asList("default"))
        .build();

      // Test getNext().
      List<SecretLocks> allResults = new ArrayList<>();
      SecretsLocksPager pager = new SecretsLocksPager(service, options);
      while (pager.hasNext()) {
        List<SecretLocks> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SecretsLocksPager(service, options);
      List<SecretLocks> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretsLocks" })
  public void testListSecretLocks() throws Exception {
    try {
      ListSecretLocksOptions listSecretLocksOptions = new ListSecretLocksOptions.Builder()
        .id(secretIdForListSecretLocksLink)
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .sort("name")
        .search("example")
        .build();

      // Invoke operation
      Response<SecretLocksPaginatedCollection> response = service.listSecretLocks(listSecretLocksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretLocksPaginatedCollection secretLocksPaginatedCollectionResult = response.getResult();

      assertNotNull(secretLocksPaginatedCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretLocks" })
  public void testListSecretLocksWithPager() throws Exception {
    try {
      ListSecretLocksOptions options = new ListSecretLocksOptions.Builder()
        .id(secretIdForListSecretLocksLink)
        .limit(Long.valueOf("10"))
        .sort("name")
        .search("example")
        .build();

      // Test getNext().
      List<SecretLock> allResults = new ArrayList<>();
      SecretLocksPager pager = new SecretLocksPager(service, options);
      while (pager.hasNext()) {
        List<SecretLock> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SecretLocksPager(service, options);
      List<SecretLock> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretLocks" })
  public void testListSecretVersionLocks() throws Exception {
    try {
      ListSecretVersionLocksOptions listSecretVersionLocksOptions = new ListSecretVersionLocksOptions.Builder()
        .secretId(secretIdForListSecretVersionLocksLink)
        .id(secretVersionIdForListSecretVersionLocksLink)
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .sort("name")
        .search("example")
        .build();

      // Invoke operation
      Response<SecretVersionLocksPaginatedCollection> response = service.listSecretVersionLocks(listSecretVersionLocksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretVersionLocksPaginatedCollection secretVersionLocksPaginatedCollectionResult = response.getResult();

      assertNotNull(secretVersionLocksPaginatedCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretVersionLocks" })
  public void testListSecretVersionLocksWithPager() throws Exception {
    try {
      ListSecretVersionLocksOptions options = new ListSecretVersionLocksOptions.Builder()
        .secretId(secretIdForListSecretVersionLocksLink)
        .id(secretVersionIdForListSecretVersionLocksLink)
        .limit(Long.valueOf("10"))
        .sort("name")
        .search("example")
        .build();

      // Test getNext().
      List<SecretLock> allResults = new ArrayList<>();
      SecretVersionLocksPager pager = new SecretVersionLocksPager(service, options);
      while (pager.hasNext()) {
        List<SecretLock> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SecretVersionLocksPager(service, options);
      List<SecretLock> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecretVersionLocks" })
  public void testCreateSecretVersionLocksBulk() throws Exception {
    try {
      SecretLockPrototype secretLockPrototypeModel = new SecretLockPrototype.Builder()
        .name("lock-example-1")
        .description("lock for consumer 1")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      CreateSecretVersionLocksBulkOptions createSecretVersionLocksBulkOptions = new CreateSecretVersionLocksBulkOptions.Builder()
        .secretId(secretIdForCreateSecretVersionLocksLink)
        .id(secretVersionIdForCreateSecretVersionLocksLink)
        .locks(java.util.Arrays.asList(secretLockPrototypeModel))
        .mode("exclusive")
        .build();

      // Invoke operation
      Response<SecretLocks> response = service.createSecretVersionLocksBulk(createSecretVersionLocksBulkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecretLocks secretLocksResult = response.getResult();

      assertNotNull(secretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecretVersionLocksBulk" })
  public void testListConfigurations() throws Exception {
    try {
      ListConfigurationsOptions listConfigurationsOptions = new ListConfigurationsOptions.Builder()
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .sort("config_type")
        .search("example")
        .build();

      // Invoke operation
      Response<ConfigurationMetadataPaginatedCollection> response = service.listConfigurations(listConfigurationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadataPaginatedCollection configurationMetadataPaginatedCollectionResult = response.getResult();

      assertNotNull(configurationMetadataPaginatedCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListConfigurations" })
  public void testListConfigurationsWithPager() throws Exception {
    try {
      ListConfigurationsOptions options = new ListConfigurationsOptions.Builder()
        .limit(Long.valueOf("10"))
        .sort("config_type")
        .search("example")
        .build();

      // Test getNext().
      List<ConfigurationMetadata> allResults = new ArrayList<>();
      ConfigurationsPager pager = new ConfigurationsPager(service, options);
      while (pager.hasNext()) {
        List<ConfigurationMetadata> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ConfigurationsPager(service, options);
      List<ConfigurationMetadata> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListConfigurations" })
  public void testGetConfiguration() throws Exception {
    try {
      GetConfigurationOptions getConfigurationOptions = new GetConfigurationOptions.Builder()
        .name(configurationNameForGetConfigurationLink)
        .xSmAcceptConfigurationType("private_cert_configuration_root_ca")
        .build();

      // Invoke operation
      Response<Configuration> response = service.getConfiguration(getConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Configuration configurationResult = response.getResult();

      assertNotNull(configurationResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguration" })
  public void testUpdateConfiguration() throws Exception {
    try {
      IAMCredentialsConfigurationPatch configurationPatchModel = new IAMCredentialsConfigurationPatch.Builder()
        .apiKey("RmnPBn6n1dzoo0v3kyznKEpg0WzdTpW9lW7FtKa017_u")
        .build();
      Map<String, Object> configurationPatchModelAsPatch = configurationPatchModel.asPatch();

      UpdateConfigurationOptions updateConfigurationOptions = new UpdateConfigurationOptions.Builder()
        .name(configurationNameForGetConfigurationLink)
        .configurationPatch(configurationPatchModelAsPatch)
        .xSmAcceptConfigurationType("private_cert_configuration_root_ca")
        .build();

      // Invoke operation
      Response<Configuration> response = service.updateConfiguration(updateConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Configuration configurationResult = response.getResult();

      assertNotNull(configurationResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateConfiguration" })
  public void testCreateConfigurationAction() throws Exception {
    try {
      PrivateCertificateConfigurationActionRotateCRLPrototype configurationActionPrototypeModel = new PrivateCertificateConfigurationActionRotateCRLPrototype.Builder()
        .actionType("private_cert_configuration_action_rotate_crl")
        .build();

      CreateConfigurationActionOptions createConfigurationActionOptions = new CreateConfigurationActionOptions.Builder()
        .name(configurationNameForGetConfigurationLink)
        .configActionPrototype(configurationActionPrototypeModel)
        .xSmAcceptConfigurationType("private_cert_configuration_root_ca")
        .build();

      // Invoke operation
      Response<ConfigurationAction> response = service.createConfigurationAction(createConfigurationActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ConfigurationAction configurationActionResult = response.getResult();

      assertNotNull(configurationActionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateConfigurationAction" })
  public void testCreateNotificationsRegistration() throws Exception {
    try {
      CreateNotificationsRegistrationOptions createNotificationsRegistrationOptions = new CreateNotificationsRegistrationOptions.Builder()
        .eventNotificationsInstanceCrn("crn:v1:bluemix:public:event-notifications:us-south:a/22018f3c34ff4ff193698d15ca316946:578ad1a4-2fd8-4e66-95d5-79a842ba91f8::")
        .eventNotificationsSourceName("My Secrets Manager")
        .eventNotificationsSourceDescription("Optional description of this source in an Event Notifications instance.")
        .build();

      // Invoke operation
      Response<NotificationsRegistration> response = service.createNotificationsRegistration(createNotificationsRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NotificationsRegistration notificationsRegistrationResult = response.getResult();

      assertNotNull(notificationsRegistrationResult);
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
      Response<NotificationsRegistration> response = service.getNotificationsRegistration(getNotificationsRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NotificationsRegistration notificationsRegistrationResult = response.getResult();

      assertNotNull(notificationsRegistrationResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetNotificationsRegistration" })
  public void testGetNotificationsRegistrationTest() throws Exception {
    try {
      GetNotificationsRegistrationTestOptions getNotificationsRegistrationTestOptions = new GetNotificationsRegistrationTestOptions();

      // Invoke operation
      Response<Void> response = service.getNotificationsRegistrationTest(getNotificationsRegistrationTestOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetNotificationsRegistrationTest" })
  public void testDeleteSecretGroup() throws Exception {
    try {
      DeleteSecretGroupOptions deleteSecretGroupOptions = new DeleteSecretGroupOptions.Builder()
        .id(secretGroupIdForGetSecretGroupLink)
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
  public void testDeleteSecretVersionData() throws Exception {
    try {
      DeleteSecretVersionDataOptions deleteSecretVersionDataOptions = new DeleteSecretVersionDataOptions.Builder()
        .secretId(secretIdForGetSecretLink)
        .id(secretIdForGetSecretLink)
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSecretVersionData(deleteSecretVersionDataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecretVersionData" })
  public void testDeleteSecretLocksBulk() throws Exception {
    try {
      DeleteSecretLocksBulkOptions deleteSecretLocksBulkOptions = new DeleteSecretLocksBulkOptions.Builder()
        .id(secretIdForGetSecretLink)
        .name(java.util.Arrays.asList("lock-example-1"))
        .build();

      // Invoke operation
      Response<SecretLocks> response = service.deleteSecretLocksBulk(deleteSecretLocksBulkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretLocks secretLocksResult = response.getResult();

      assertNotNull(secretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecretLocksBulk" })
  public void testDeleteSecretVersionLocksBulk() throws Exception {
    try {
      DeleteSecretVersionLocksBulkOptions deleteSecretVersionLocksBulkOptions = new DeleteSecretVersionLocksBulkOptions.Builder()
        .secretId(secretIdForGetSecretLink)
        .id(secretVersionIdForDeleteSecretVersionLocksLink)
        .name(java.util.Arrays.asList("lock-example-1"))
        .build();

      // Invoke operation
      Response<SecretLocks> response = service.deleteSecretVersionLocksBulk(deleteSecretVersionLocksBulkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecretLocks secretLocksResult = response.getResult();

      assertNotNull(secretLocksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecretVersionLocksBulk" })
  public void testDeleteSecret() throws Exception {
    try {
      DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
        .id(secretIdForGetSecretLink)
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
  public void testDeleteConfiguration() throws Exception {
    try {
      DeleteConfigurationOptions deleteConfigurationOptions = new DeleteConfigurationOptions.Builder()
        .name(configurationNameForGetConfigurationLink)
        .xSmAcceptConfigurationType("private_cert_configuration_root_ca")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteConfiguration(deleteConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteConfiguration" })
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