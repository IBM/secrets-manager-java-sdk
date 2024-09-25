/*
 * (C) Copyright IBM Corp. 2024.
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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.SecretsManager;
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretByNameTypeOptions;
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PasswordGenerationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PasswordGenerationPolicyPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PasswordGenerationPolicyRO;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateActionRevoke;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCAData;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRevoke;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRotate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRotateCRL;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRotateCRLPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRotatePrototype;
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRotateAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplateMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplatePatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoKey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoProvider;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoProviderHPCS;
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsResourceKey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretCredentials;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretSourceService;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretSourceServiceRO;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIam;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamApikey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamRole;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamServiceid;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceInstance;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceParameters;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceRole;
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
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretsManager service.
 */
public class SecretsManagerTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected SecretsManager secretsManagerService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new SecretsManager(serviceName, null);
  }

  // Construct the service URL using the default server variable values
  @Test
  public void testConstructServiceURLwithDefaultValues() throws Throwable {
    String defaultFormattedUrl = "https://provide-here-your-smgr-instanceuuid.us-south.secrets-manager.appdomain.cloud";
    String constructedUrl = SecretsManager.constructServiceUrl(null);
    assertEquals(constructedUrl, defaultFormattedUrl);
  }

  // Construct the service URL with an invalid server variable name (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructServiceURLWithInvalidVariable() throws Throwable {
    Map<String, String> variables = new HashMap<>();
    variables.put("invalid_variable_name", "value");

    SecretsManager.constructServiceUrl(variables);
  }

  // Test the createSecretGroup operation with a valid options model parameter
  @Test
  public void testCreateSecretGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"default\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"updated_at\": \"2022-04-12T23:20:50.520Z\"}";
    String createSecretGroupPath = "/api/v2/secret_groups";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSecretGroupOptions model
    CreateSecretGroupOptions createSecretGroupOptionsModel = new CreateSecretGroupOptions.Builder()
      .name("my-secret-group")
      .description("Extended description for this group.")
      .build();

    // Invoke createSecretGroup() with a valid options model and verify the result
    Response<SecretGroup> response = secretsManagerService.createSecretGroup(createSecretGroupOptionsModel).execute();
    assertNotNull(response);
    SecretGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecretGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSecretGroup operation with and without retries enabled
  @Test
  public void testCreateSecretGroupWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateSecretGroupWOptions();

    secretsManagerService.disableRetries();
    testCreateSecretGroupWOptions();
  }

  // Test the createSecretGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createSecretGroup(null).execute();
  }

  // Test the listSecretGroups operation with a valid options model parameter
  @Test
  public void testListSecretGroupsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"secret_groups\": [{\"id\": \"default\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"updated_at\": \"2022-04-12T23:20:50.520Z\"}], \"total_count\": 0}";
    String listSecretGroupsPath = "/api/v2/secret_groups";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSecretGroupsOptions model
    ListSecretGroupsOptions listSecretGroupsOptionsModel = new ListSecretGroupsOptions();

    // Invoke listSecretGroups() with a valid options model and verify the result
    Response<SecretGroupCollection> response = secretsManagerService.listSecretGroups(listSecretGroupsOptionsModel).execute();
    assertNotNull(response);
    SecretGroupCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecretGroupsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSecretGroups operation with and without retries enabled
  @Test
  public void testListSecretGroupsWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testListSecretGroupsWOptions();

    secretsManagerService.disableRetries();
    testListSecretGroupsWOptions();
  }

  // Test the getSecretGroup operation with a valid options model parameter
  @Test
  public void testGetSecretGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"default\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"updated_at\": \"2022-04-12T23:20:50.520Z\"}";
    String getSecretGroupPath = "/api/v2/secret_groups/d898bb90-82f6-4d61-b5cc-b079b66cfa76";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecretGroupOptions model
    GetSecretGroupOptions getSecretGroupOptionsModel = new GetSecretGroupOptions.Builder()
      .id("d898bb90-82f6-4d61-b5cc-b079b66cfa76")
      .build();

    // Invoke getSecretGroup() with a valid options model and verify the result
    Response<SecretGroup> response = secretsManagerService.getSecretGroup(getSecretGroupOptionsModel).execute();
    assertNotNull(response);
    SecretGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecretGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecretGroup operation with and without retries enabled
  @Test
  public void testGetSecretGroupWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetSecretGroupWOptions();

    secretsManagerService.disableRetries();
    testGetSecretGroupWOptions();
  }

  // Test the getSecretGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.getSecretGroup(null).execute();
  }

  // Test the updateSecretGroup operation with a valid options model parameter
  @Test
  public void testUpdateSecretGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"default\", \"name\": \"my-secret-group\", \"description\": \"Extended description for this group.\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"updated_at\": \"2022-04-12T23:20:50.520Z\"}";
    String updateSecretGroupPath = "/api/v2/secret_groups/d898bb90-82f6-4d61-b5cc-b079b66cfa76";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SecretGroupPatch model
    SecretGroupPatch secretGroupPatchModel = new SecretGroupPatch.Builder()
      .name("my-secret-group")
      .description("Extended description for this group.")
      .build();
    Map<String, Object> secretGroupPatchModelAsPatch = secretGroupPatchModel.asPatch();

    // Construct an instance of the UpdateSecretGroupOptions model
    UpdateSecretGroupOptions updateSecretGroupOptionsModel = new UpdateSecretGroupOptions.Builder()
      .id("d898bb90-82f6-4d61-b5cc-b079b66cfa76")
      .secretGroupPatch(secretGroupPatchModelAsPatch)
      .build();

    // Invoke updateSecretGroup() with a valid options model and verify the result
    Response<SecretGroup> response = secretsManagerService.updateSecretGroup(updateSecretGroupOptionsModel).execute();
    assertNotNull(response);
    SecretGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSecretGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSecretGroup operation with and without retries enabled
  @Test
  public void testUpdateSecretGroupWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testUpdateSecretGroupWOptions();

    secretsManagerService.disableRetries();
    testUpdateSecretGroupWOptions();
  }

  // Test the updateSecretGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSecretGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.updateSecretGroup(null).execute();
  }

  // Test the deleteSecretGroup operation with a valid options model parameter
  @Test
  public void testDeleteSecretGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSecretGroupPath = "/api/v2/secret_groups/d898bb90-82f6-4d61-b5cc-b079b66cfa76";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSecretGroupOptions model
    DeleteSecretGroupOptions deleteSecretGroupOptionsModel = new DeleteSecretGroupOptions.Builder()
      .id("d898bb90-82f6-4d61-b5cc-b079b66cfa76")
      .build();

    // Invoke deleteSecretGroup() with a valid options model and verify the result
    Response<Void> response = secretsManagerService.deleteSecretGroup(deleteSecretGroupOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSecretGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSecretGroup operation with and without retries enabled
  @Test
  public void testDeleteSecretGroupWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testDeleteSecretGroupWOptions();

    secretsManagerService.disableRetries();
    testDeleteSecretGroupWOptions();
  }

  // Test the deleteSecretGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecretGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.deleteSecretGroup(null).execute();
  }

  // Test the createSecret operation with a valid options model parameter
  @Test
  public void testCreateSecretWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"crn\": \"crn\", \"custom_metadata\": {\"anyKey\": \"anyValue\"}, \"description\": \"Extended description for this secret.\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"labels\": [\"my-label\"], \"locks_total\": 0, \"name\": \"my-secret\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"state\": 0, \"state_description\": \"active\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"versions_total\": 0, \"referenced_by\": [\"my-example-engine-config\"], \"expiration_date\": \"2033-04-12T23:20:50.520Z\", \"payload\": \"secret-credentials\"}";
    String createSecretPath = "/api/v2/secrets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ArbitrarySecretPrototype model
    ArbitrarySecretPrototype secretPrototypeModel = new ArbitrarySecretPrototype.Builder()
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .description("Description of my arbitrary secret.")
      .expirationDate(DateUtils.parseAsDateTime("2030-10-05T11:49:42Z"))
      .labels(java.util.Arrays.asList("dev", "us-south"))
      .name("example-arbitrary-secret")
      .secretGroupId("default")
      .secretType("arbitrary")
      .payload("secret-data")
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the CreateSecretOptions model
    CreateSecretOptions createSecretOptionsModel = new CreateSecretOptions.Builder()
      .secretPrototype(secretPrototypeModel)
      .build();

    // Invoke createSecret() with a valid options model and verify the result
    Response<Secret> response = secretsManagerService.createSecret(createSecretOptionsModel).execute();
    assertNotNull(response);
    Secret responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecretPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSecret operation with and without retries enabled
  @Test
  public void testCreateSecretWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateSecretWOptions();

    secretsManagerService.disableRetries();
    testCreateSecretWOptions();
  }

  // Test the createSecret operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createSecret(null).execute();
  }

  // Test the listSecrets operation with a valid options model parameter
  @Test
  public void testListSecretsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"limit\": 25, \"offset\": 25, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"secrets\": [{\"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"crn\": \"crn\", \"custom_metadata\": {\"anyKey\": \"anyValue\"}, \"description\": \"Extended description for this secret.\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"labels\": [\"my-label\"], \"locks_total\": 0, \"name\": \"my-secret\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"state\": 0, \"state_description\": \"active\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"versions_total\": 0, \"referenced_by\": [\"my-example-engine-config\"], \"expiration_date\": \"2033-04-12T23:20:50.520Z\"}]}";
    String listSecretsPath = "/api/v2/secrets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSecretsOptions model
    ListSecretsOptions listSecretsOptionsModel = new ListSecretsOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .sort("created_at")
      .search("example")
      .groups(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"))
      .secretTypes(java.util.Arrays.asList("arbitrary", "kv"))
      .matchAllLabels(java.util.Arrays.asList("dev", "us-south"))
      .build();

    // Invoke listSecrets() with a valid options model and verify the result
    Response<SecretMetadataPaginatedCollection> response = secretsManagerService.listSecrets(listSecretsOptionsModel).execute();
    assertNotNull(response);
    SecretMetadataPaginatedCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecretsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("sort"), "created_at");
    assertEquals(query.get("search"), "example");
    assertEquals(query.get("groups"), RequestUtils.join(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"), ","));
    assertEquals(query.get("secret_types"), RequestUtils.join(java.util.Arrays.asList("arbitrary", "kv"), ","));
    assertEquals(query.get("match_all_labels"), RequestUtils.join(java.util.Arrays.asList("dev", "us-south"), ","));
  }

  // Test the listSecrets operation with and without retries enabled
  @Test
  public void testListSecretsWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testListSecretsWOptions();

    secretsManagerService.disableRetries();
    testListSecretsWOptions();
  }

  // Test the listSecrets operation using the SecretsPager.getNext() method
  @Test
  public void testListSecretsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"secrets\":[{\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"created_at\":\"2022-04-12T23:20:50.520Z\",\"crn\":\"crn\",\"custom_metadata\":{\"anyKey\":\"anyValue\"},\"description\":\"Extended description for this secret.\",\"downloaded\":true,\"id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"labels\":[\"my-label\"],\"locks_total\":0,\"name\":\"my-secret\",\"secret_group_id\":\"default\",\"secret_type\":\"arbitrary\",\"state\":0,\"state_description\":\"active\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"versions_total\":0,\"referenced_by\":[\"my-example-engine-config\"],\"expiration_date\":\"2033-04-12T23:20:50.520Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"secrets\":[{\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"created_at\":\"2022-04-12T23:20:50.520Z\",\"crn\":\"crn\",\"custom_metadata\":{\"anyKey\":\"anyValue\"},\"description\":\"Extended description for this secret.\",\"downloaded\":true,\"id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"labels\":[\"my-label\"],\"locks_total\":0,\"name\":\"my-secret\",\"secret_group_id\":\"default\",\"secret_type\":\"arbitrary\",\"state\":0,\"state_description\":\"active\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"versions_total\":0,\"referenced_by\":[\"my-example-engine-config\"],\"expiration_date\":\"2033-04-12T23:20:50.520Z\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
      .limit(Long.valueOf("10"))
      .sort("created_at")
      .search("example")
      .groups(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"))
      .secretTypes(java.util.Arrays.asList("arbitrary", "kv"))
      .matchAllLabels(java.util.Arrays.asList("dev", "us-south"))
      .build();

    List<SecretMetadata> allResults = new ArrayList<>();
    SecretsPager pager = new SecretsPager(secretsManagerService, listSecretsOptions);
    while (pager.hasNext()) {
      List<SecretMetadata> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSecrets operation using the SecretsPager.getAll() method
  @Test
  public void testListSecretsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"secrets\":[{\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"created_at\":\"2022-04-12T23:20:50.520Z\",\"crn\":\"crn\",\"custom_metadata\":{\"anyKey\":\"anyValue\"},\"description\":\"Extended description for this secret.\",\"downloaded\":true,\"id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"labels\":[\"my-label\"],\"locks_total\":0,\"name\":\"my-secret\",\"secret_group_id\":\"default\",\"secret_type\":\"arbitrary\",\"state\":0,\"state_description\":\"active\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"versions_total\":0,\"referenced_by\":[\"my-example-engine-config\"],\"expiration_date\":\"2033-04-12T23:20:50.520Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"secrets\":[{\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"created_at\":\"2022-04-12T23:20:50.520Z\",\"crn\":\"crn\",\"custom_metadata\":{\"anyKey\":\"anyValue\"},\"description\":\"Extended description for this secret.\",\"downloaded\":true,\"id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"labels\":[\"my-label\"],\"locks_total\":0,\"name\":\"my-secret\",\"secret_group_id\":\"default\",\"secret_type\":\"arbitrary\",\"state\":0,\"state_description\":\"active\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"versions_total\":0,\"referenced_by\":[\"my-example-engine-config\"],\"expiration_date\":\"2033-04-12T23:20:50.520Z\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
      .limit(Long.valueOf("10"))
      .sort("created_at")
      .search("example")
      .groups(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"))
      .secretTypes(java.util.Arrays.asList("arbitrary", "kv"))
      .matchAllLabels(java.util.Arrays.asList("dev", "us-south"))
      .build();

    SecretsPager pager = new SecretsPager(secretsManagerService, listSecretsOptions);
    List<SecretMetadata> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getSecret operation with a valid options model parameter
  @Test
  public void testGetSecretWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"crn\": \"crn\", \"custom_metadata\": {\"anyKey\": \"anyValue\"}, \"description\": \"Extended description for this secret.\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"labels\": [\"my-label\"], \"locks_total\": 0, \"name\": \"my-secret\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"state\": 0, \"state_description\": \"active\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"versions_total\": 0, \"referenced_by\": [\"my-example-engine-config\"], \"expiration_date\": \"2033-04-12T23:20:50.520Z\", \"payload\": \"secret-credentials\"}";
    String getSecretPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecretOptions model
    GetSecretOptions getSecretOptionsModel = new GetSecretOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .build();

    // Invoke getSecret() with a valid options model and verify the result
    Response<Secret> response = secretsManagerService.getSecret(getSecretOptionsModel).execute();
    assertNotNull(response);
    Secret responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecretPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecret operation with and without retries enabled
  @Test
  public void testGetSecretWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetSecretWOptions();

    secretsManagerService.disableRetries();
    testGetSecretWOptions();
  }

  // Test the getSecret operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.getSecret(null).execute();
  }

  // Test the deleteSecret operation with a valid options model parameter
  @Test
  public void testDeleteSecretWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSecretPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSecretOptions model
    DeleteSecretOptions deleteSecretOptionsModel = new DeleteSecretOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .build();

    // Invoke deleteSecret() with a valid options model and verify the result
    Response<Void> response = secretsManagerService.deleteSecret(deleteSecretOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSecretPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSecret operation with and without retries enabled
  @Test
  public void testDeleteSecretWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testDeleteSecretWOptions();

    secretsManagerService.disableRetries();
    testDeleteSecretWOptions();
  }

  // Test the deleteSecret operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecretNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.deleteSecret(null).execute();
  }

  // Test the getSecretMetadata operation with a valid options model parameter
  @Test
  public void testGetSecretMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"crn\": \"crn\", \"custom_metadata\": {\"anyKey\": \"anyValue\"}, \"description\": \"Extended description for this secret.\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"labels\": [\"my-label\"], \"locks_total\": 0, \"name\": \"my-secret\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"state\": 0, \"state_description\": \"active\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"versions_total\": 0, \"referenced_by\": [\"my-example-engine-config\"], \"expiration_date\": \"2033-04-12T23:20:50.520Z\"}";
    String getSecretMetadataPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecretMetadataOptions model
    GetSecretMetadataOptions getSecretMetadataOptionsModel = new GetSecretMetadataOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .build();

    // Invoke getSecretMetadata() with a valid options model and verify the result
    Response<SecretMetadata> response = secretsManagerService.getSecretMetadata(getSecretMetadataOptionsModel).execute();
    assertNotNull(response);
    SecretMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecretMetadataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecretMetadata operation with and without retries enabled
  @Test
  public void testGetSecretMetadataWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetSecretMetadataWOptions();

    secretsManagerService.disableRetries();
    testGetSecretMetadataWOptions();
  }

  // Test the getSecretMetadata operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretMetadataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.getSecretMetadata(null).execute();
  }

  // Test the updateSecretMetadata operation with a valid options model parameter
  @Test
  public void testUpdateSecretMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"crn\": \"crn\", \"custom_metadata\": {\"anyKey\": \"anyValue\"}, \"description\": \"Extended description for this secret.\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"labels\": [\"my-label\"], \"locks_total\": 0, \"name\": \"my-secret\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"state\": 0, \"state_description\": \"active\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"versions_total\": 0, \"referenced_by\": [\"my-example-engine-config\"], \"expiration_date\": \"2033-04-12T23:20:50.520Z\"}";
    String updateSecretMetadataPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ArbitrarySecretMetadataPatch model
    ArbitrarySecretMetadataPatch secretMetadataPatchModel = new ArbitrarySecretMetadataPatch.Builder()
      .name("updated-arbitrary-secret-name-example")
      .description("updated Arbitrary Secret description")
      .labels(java.util.Arrays.asList("dev", "us-south"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
      .build();
    Map<String, Object> secretMetadataPatchModelAsPatch = secretMetadataPatchModel.asPatch();

    // Construct an instance of the UpdateSecretMetadataOptions model
    UpdateSecretMetadataOptions updateSecretMetadataOptionsModel = new UpdateSecretMetadataOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .secretMetadataPatch(secretMetadataPatchModelAsPatch)
      .build();

    // Invoke updateSecretMetadata() with a valid options model and verify the result
    Response<SecretMetadata> response = secretsManagerService.updateSecretMetadata(updateSecretMetadataOptionsModel).execute();
    assertNotNull(response);
    SecretMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSecretMetadataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSecretMetadata operation with and without retries enabled
  @Test
  public void testUpdateSecretMetadataWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testUpdateSecretMetadataWOptions();

    secretsManagerService.disableRetries();
    testUpdateSecretMetadataWOptions();
  }

  // Test the updateSecretMetadata operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSecretMetadataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.updateSecretMetadata(null).execute();
  }

  // Test the createSecretAction operation with a valid options model parameter
  @Test
  public void testCreateSecretActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action_type\": \"public_cert_action_validate_dns_challenge\"}";
    String createSecretActionPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/actions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the PrivateCertificateActionRevokePrototype model
    PrivateCertificateActionRevokePrototype secretActionPrototypeModel = new PrivateCertificateActionRevokePrototype.Builder()
      .actionType("private_cert_action_revoke_certificate")
      .build();

    // Construct an instance of the CreateSecretActionOptions model
    CreateSecretActionOptions createSecretActionOptionsModel = new CreateSecretActionOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .secretActionPrototype(secretActionPrototypeModel)
      .build();

    // Invoke createSecretAction() with a valid options model and verify the result
    Response<SecretAction> response = secretsManagerService.createSecretAction(createSecretActionOptionsModel).execute();
    assertNotNull(response);
    SecretAction responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecretActionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSecretAction operation with and without retries enabled
  @Test
  public void testCreateSecretActionWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateSecretActionWOptions();

    secretsManagerService.disableRetries();
    testCreateSecretActionWOptions();
  }

  // Test the createSecretAction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretActionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createSecretAction(null).execute();
  }

  // Test the getSecretByNameType operation with a valid options model parameter
  @Test
  public void testGetSecretByNameTypeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"crn\": \"crn\", \"custom_metadata\": {\"anyKey\": \"anyValue\"}, \"description\": \"Extended description for this secret.\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"labels\": [\"my-label\"], \"locks_total\": 0, \"name\": \"my-secret\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"state\": 0, \"state_description\": \"active\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"versions_total\": 0, \"referenced_by\": [\"my-example-engine-config\"], \"expiration_date\": \"2033-04-12T23:20:50.520Z\", \"payload\": \"secret-credentials\"}";
    String getSecretByNameTypePath = "/api/v2/secret_groups/default/secret_types/arbitrary/secrets/my-secret";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecretByNameTypeOptions model
    GetSecretByNameTypeOptions getSecretByNameTypeOptionsModel = new GetSecretByNameTypeOptions.Builder()
      .secretType("arbitrary")
      .name("my-secret")
      .secretGroupName("default")
      .build();

    // Invoke getSecretByNameType() with a valid options model and verify the result
    Response<Secret> response = secretsManagerService.getSecretByNameType(getSecretByNameTypeOptionsModel).execute();
    assertNotNull(response);
    Secret responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecretByNameTypePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecretByNameType operation with and without retries enabled
  @Test
  public void testGetSecretByNameTypeWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetSecretByNameTypeWOptions();

    secretsManagerService.disableRetries();
    testGetSecretByNameTypeWOptions();
  }

  // Test the getSecretByNameType operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretByNameTypeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.getSecretByNameType(null).execute();
  }

  // Test the createSecretVersion operation with a valid options model parameter
  @Test
  public void testCreateSecretVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_rotated\": false, \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_name\": \"my-secret\", \"secret_type\": \"arbitrary\", \"secret_group_id\": \"default\", \"payload_available\": true, \"alias\": \"current\", \"version_custom_metadata\": {\"anyKey\": \"anyValue\"}, \"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"expiration_date\": \"2033-04-12T23:20:50.520Z\", \"payload\": \"secret-credentials\"}";
    String createSecretVersionPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ArbitrarySecretVersionPrototype model
    ArbitrarySecretVersionPrototype secretVersionPrototypeModel = new ArbitrarySecretVersionPrototype.Builder()
      .payload("updated secret credentials")
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the CreateSecretVersionOptions model
    CreateSecretVersionOptions createSecretVersionOptionsModel = new CreateSecretVersionOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .secretVersionPrototype(secretVersionPrototypeModel)
      .build();

    // Invoke createSecretVersion() with a valid options model and verify the result
    Response<SecretVersion> response = secretsManagerService.createSecretVersion(createSecretVersionOptionsModel).execute();
    assertNotNull(response);
    SecretVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecretVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSecretVersion operation with and without retries enabled
  @Test
  public void testCreateSecretVersionWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateSecretVersionWOptions();

    secretsManagerService.disableRetries();
    testCreateSecretVersionWOptions();
  }

  // Test the createSecretVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createSecretVersion(null).execute();
  }

  // Test the listSecretVersions operation with a valid options model parameter
  @Test
  public void testListSecretVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"versions\": [{\"auto_rotated\": false, \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_name\": \"my-secret\", \"secret_type\": \"arbitrary\", \"secret_group_id\": \"default\", \"payload_available\": true, \"alias\": \"current\", \"version_custom_metadata\": {\"anyKey\": \"anyValue\"}, \"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"expiration_date\": \"2033-04-12T23:20:50.520Z\"}], \"total_count\": 0}";
    String listSecretVersionsPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSecretVersionsOptions model
    ListSecretVersionsOptions listSecretVersionsOptionsModel = new ListSecretVersionsOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .build();

    // Invoke listSecretVersions() with a valid options model and verify the result
    Response<SecretVersionMetadataCollection> response = secretsManagerService.listSecretVersions(listSecretVersionsOptionsModel).execute();
    assertNotNull(response);
    SecretVersionMetadataCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecretVersionsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSecretVersions operation with and without retries enabled
  @Test
  public void testListSecretVersionsWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testListSecretVersionsWOptions();

    secretsManagerService.disableRetries();
    testListSecretVersionsWOptions();
  }

  // Test the listSecretVersions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSecretVersionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.listSecretVersions(null).execute();
  }

  // Test the getSecretVersion operation with a valid options model parameter
  @Test
  public void testGetSecretVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_rotated\": false, \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_name\": \"my-secret\", \"secret_type\": \"arbitrary\", \"secret_group_id\": \"default\", \"payload_available\": true, \"alias\": \"current\", \"version_custom_metadata\": {\"anyKey\": \"anyValue\"}, \"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"expiration_date\": \"2033-04-12T23:20:50.520Z\", \"payload\": \"secret-credentials\"}";
    String getSecretVersionPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions/eb4cf24d-9cae-424b-945e-159788a5f535";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecretVersionOptions model
    GetSecretVersionOptions getSecretVersionOptionsModel = new GetSecretVersionOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .build();

    // Invoke getSecretVersion() with a valid options model and verify the result
    Response<SecretVersion> response = secretsManagerService.getSecretVersion(getSecretVersionOptionsModel).execute();
    assertNotNull(response);
    SecretVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecretVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecretVersion operation with and without retries enabled
  @Test
  public void testGetSecretVersionWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetSecretVersionWOptions();

    secretsManagerService.disableRetries();
    testGetSecretVersionWOptions();
  }

  // Test the getSecretVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.getSecretVersion(null).execute();
  }

  // Test the deleteSecretVersionData operation with a valid options model parameter
  @Test
  public void testDeleteSecretVersionDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSecretVersionDataPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions/eb4cf24d-9cae-424b-945e-159788a5f535/secret_data";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSecretVersionDataOptions model
    DeleteSecretVersionDataOptions deleteSecretVersionDataOptionsModel = new DeleteSecretVersionDataOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .build();

    // Invoke deleteSecretVersionData() with a valid options model and verify the result
    Response<Void> response = secretsManagerService.deleteSecretVersionData(deleteSecretVersionDataOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSecretVersionDataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSecretVersionData operation with and without retries enabled
  @Test
  public void testDeleteSecretVersionDataWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testDeleteSecretVersionDataWOptions();

    secretsManagerService.disableRetries();
    testDeleteSecretVersionDataWOptions();
  }

  // Test the deleteSecretVersionData operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecretVersionDataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.deleteSecretVersionData(null).execute();
  }

  // Test the getSecretVersionMetadata operation with a valid options model parameter
  @Test
  public void testGetSecretVersionMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_rotated\": false, \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_name\": \"my-secret\", \"secret_type\": \"arbitrary\", \"secret_group_id\": \"default\", \"payload_available\": true, \"alias\": \"current\", \"version_custom_metadata\": {\"anyKey\": \"anyValue\"}, \"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"expiration_date\": \"2033-04-12T23:20:50.520Z\"}";
    String getSecretVersionMetadataPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions/eb4cf24d-9cae-424b-945e-159788a5f535/metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecretVersionMetadataOptions model
    GetSecretVersionMetadataOptions getSecretVersionMetadataOptionsModel = new GetSecretVersionMetadataOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .build();

    // Invoke getSecretVersionMetadata() with a valid options model and verify the result
    Response<SecretVersionMetadata> response = secretsManagerService.getSecretVersionMetadata(getSecretVersionMetadataOptionsModel).execute();
    assertNotNull(response);
    SecretVersionMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecretVersionMetadataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecretVersionMetadata operation with and without retries enabled
  @Test
  public void testGetSecretVersionMetadataWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetSecretVersionMetadataWOptions();

    secretsManagerService.disableRetries();
    testGetSecretVersionMetadataWOptions();
  }

  // Test the getSecretVersionMetadata operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretVersionMetadataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.getSecretVersionMetadata(null).execute();
  }

  // Test the updateSecretVersionMetadata operation with a valid options model parameter
  @Test
  public void testUpdateSecretVersionMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_rotated\": false, \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"downloaded\": true, \"id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_name\": \"my-secret\", \"secret_type\": \"arbitrary\", \"secret_group_id\": \"default\", \"payload_available\": true, \"alias\": \"current\", \"version_custom_metadata\": {\"anyKey\": \"anyValue\"}, \"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"expiration_date\": \"2033-04-12T23:20:50.520Z\"}";
    String updateSecretVersionMetadataPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions/eb4cf24d-9cae-424b-945e-159788a5f535/metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SecretVersionMetadataPatch model
    SecretVersionMetadataPatch secretVersionMetadataPatchModel = new SecretVersionMetadataPatch.Builder()
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    Map<String, Object> secretVersionMetadataPatchModelAsPatch = secretVersionMetadataPatchModel.asPatch();

    // Construct an instance of the UpdateSecretVersionMetadataOptions model
    UpdateSecretVersionMetadataOptions updateSecretVersionMetadataOptionsModel = new UpdateSecretVersionMetadataOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .secretVersionMetadataPatch(secretVersionMetadataPatchModelAsPatch)
      .build();

    // Invoke updateSecretVersionMetadata() with a valid options model and verify the result
    Response<SecretVersionMetadata> response = secretsManagerService.updateSecretVersionMetadata(updateSecretVersionMetadataOptionsModel).execute();
    assertNotNull(response);
    SecretVersionMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSecretVersionMetadataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSecretVersionMetadata operation with and without retries enabled
  @Test
  public void testUpdateSecretVersionMetadataWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testUpdateSecretVersionMetadataWOptions();

    secretsManagerService.disableRetries();
    testUpdateSecretVersionMetadataWOptions();
  }

  // Test the updateSecretVersionMetadata operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSecretVersionMetadataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.updateSecretVersionMetadata(null).execute();
  }

  // Test the createSecretVersionAction operation with a valid options model parameter
  @Test
  public void testCreateSecretVersionActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action_type\": \"private_cert_action_revoke_certificate\", \"revocation_time_seconds\": 21}";
    String createSecretVersionActionPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions/eb4cf24d-9cae-424b-945e-159788a5f535/actions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the PrivateCertificateVersionActionRevokePrototype model
    PrivateCertificateVersionActionRevokePrototype secretVersionActionPrototypeModel = new PrivateCertificateVersionActionRevokePrototype.Builder()
      .actionType("private_cert_action_revoke_certificate")
      .build();

    // Construct an instance of the CreateSecretVersionActionOptions model
    CreateSecretVersionActionOptions createSecretVersionActionOptionsModel = new CreateSecretVersionActionOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .secretVersionActionPrototype(secretVersionActionPrototypeModel)
      .build();

    // Invoke createSecretVersionAction() with a valid options model and verify the result
    Response<VersionAction> response = secretsManagerService.createSecretVersionAction(createSecretVersionActionOptionsModel).execute();
    assertNotNull(response);
    VersionAction responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecretVersionActionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSecretVersionAction operation with and without retries enabled
  @Test
  public void testCreateSecretVersionActionWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateSecretVersionActionWOptions();

    secretsManagerService.disableRetries();
    testCreateSecretVersionActionWOptions();
  }

  // Test the createSecretVersionAction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretVersionActionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createSecretVersionAction(null).execute();
  }

  // Test the listSecretsLocks operation with a valid options model parameter
  @Test
  public void testListSecretsLocksWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"limit\": 25, \"offset\": 25, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"secrets_locks\": [{\"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"secret_name\": \"my-secret\", \"versions\": [{\"version_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"version_alias\": \"current\", \"locks\": [\"lock-example\"], \"payload_available\": true}]}]}";
    String listSecretsLocksPath = "/api/v2/secrets_locks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSecretsLocksOptions model
    ListSecretsLocksOptions listSecretsLocksOptionsModel = new ListSecretsLocksOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .search("example")
      .groups(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"))
      .build();

    // Invoke listSecretsLocks() with a valid options model and verify the result
    Response<SecretsLocksPaginatedCollection> response = secretsManagerService.listSecretsLocks(listSecretsLocksOptionsModel).execute();
    assertNotNull(response);
    SecretsLocksPaginatedCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecretsLocksPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("search"), "example");
    assertEquals(query.get("groups"), RequestUtils.join(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"), ","));
  }

  // Test the listSecretsLocks operation with and without retries enabled
  @Test
  public void testListSecretsLocksWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testListSecretsLocksWOptions();

    secretsManagerService.disableRetries();
    testListSecretsLocksWOptions();
  }

  // Test the listSecretsLocks operation using the SecretsLocksPager.getNext() method
  @Test
  public void testListSecretsLocksWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"secrets_locks\":[{\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_group_id\":\"default\",\"secret_type\":\"arbitrary\",\"secret_name\":\"my-secret\",\"versions\":[{\"version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"version_alias\":\"current\",\"locks\":[\"lock-example\"],\"payload_available\":true}]}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"secrets_locks\":[{\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_group_id\":\"default\",\"secret_type\":\"arbitrary\",\"secret_name\":\"my-secret\",\"versions\":[{\"version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"version_alias\":\"current\",\"locks\":[\"lock-example\"],\"payload_available\":true}]}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretsLocksOptions listSecretsLocksOptions = new ListSecretsLocksOptions.Builder()
      .limit(Long.valueOf("10"))
      .search("example")
      .groups(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"))
      .build();

    List<SecretLocks> allResults = new ArrayList<>();
    SecretsLocksPager pager = new SecretsLocksPager(secretsManagerService, listSecretsLocksOptions);
    while (pager.hasNext()) {
      List<SecretLocks> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSecretsLocks operation using the SecretsLocksPager.getAll() method
  @Test
  public void testListSecretsLocksWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"secrets_locks\":[{\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_group_id\":\"default\",\"secret_type\":\"arbitrary\",\"secret_name\":\"my-secret\",\"versions\":[{\"version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"version_alias\":\"current\",\"locks\":[\"lock-example\"],\"payload_available\":true}]}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"secrets_locks\":[{\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_group_id\":\"default\",\"secret_type\":\"arbitrary\",\"secret_name\":\"my-secret\",\"versions\":[{\"version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"version_alias\":\"current\",\"locks\":[\"lock-example\"],\"payload_available\":true}]}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretsLocksOptions listSecretsLocksOptions = new ListSecretsLocksOptions.Builder()
      .limit(Long.valueOf("10"))
      .search("example")
      .groups(java.util.Arrays.asList("default", "cac40995-c37a-4dcb-9506-472869077634"))
      .build();

    SecretsLocksPager pager = new SecretsLocksPager(secretsManagerService, listSecretsLocksOptions);
    List<SecretLocks> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSecretLocks operation with a valid options model parameter
  @Test
  public void testListSecretLocksWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"limit\": 25, \"offset\": 25, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"locks\": [{\"name\": \"lock-example\", \"description\": \"description\", \"attributes\": {\"anyKey\": \"anyValue\"}, \"created_at\": \"2022-04-12T23:20:50.520Z\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"secret_group_id\": \"default\", \"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_version_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_version_alias\": \"current\"}]}";
    String listSecretLocksPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/locks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSecretLocksOptions model
    ListSecretLocksOptions listSecretLocksOptionsModel = new ListSecretLocksOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .sort("name")
      .search("example")
      .build();

    // Invoke listSecretLocks() with a valid options model and verify the result
    Response<SecretLocksPaginatedCollection> response = secretsManagerService.listSecretLocks(listSecretLocksOptionsModel).execute();
    assertNotNull(response);
    SecretLocksPaginatedCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecretLocksPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("sort"), "name");
    assertEquals(query.get("search"), "example");
  }

  // Test the listSecretLocks operation with and without retries enabled
  @Test
  public void testListSecretLocksWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testListSecretLocksWOptions();

    secretsManagerService.disableRetries();
    testListSecretLocksWOptions();
  }

  // Test the listSecretLocks operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSecretLocksNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.listSecretLocks(null).execute();
  }

  // Test the listSecretLocks operation using the SecretLocksPager.getNext() method
  @Test
  public void testListSecretLocksWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"locks\":[{\"name\":\"lock-example\",\"description\":\"description\",\"attributes\":{\"anyKey\":\"anyValue\"},\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"secret_group_id\":\"default\",\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_alias\":\"current\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"locks\":[{\"name\":\"lock-example\",\"description\":\"description\",\"attributes\":{\"anyKey\":\"anyValue\"},\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"secret_group_id\":\"default\",\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_alias\":\"current\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretLocksOptions listSecretLocksOptions = new ListSecretLocksOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .limit(Long.valueOf("10"))
      .sort("name")
      .search("example")
      .build();

    List<SecretLock> allResults = new ArrayList<>();
    SecretLocksPager pager = new SecretLocksPager(secretsManagerService, listSecretLocksOptions);
    while (pager.hasNext()) {
      List<SecretLock> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSecretLocks operation using the SecretLocksPager.getAll() method
  @Test
  public void testListSecretLocksWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"locks\":[{\"name\":\"lock-example\",\"description\":\"description\",\"attributes\":{\"anyKey\":\"anyValue\"},\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"secret_group_id\":\"default\",\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_alias\":\"current\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"locks\":[{\"name\":\"lock-example\",\"description\":\"description\",\"attributes\":{\"anyKey\":\"anyValue\"},\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"secret_group_id\":\"default\",\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_alias\":\"current\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretLocksOptions listSecretLocksOptions = new ListSecretLocksOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .limit(Long.valueOf("10"))
      .sort("name")
      .search("example")
      .build();

    SecretLocksPager pager = new SecretLocksPager(secretsManagerService, listSecretLocksOptions);
    List<SecretLock> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createSecretLocksBulk operation with a valid options model parameter
  @Test
  public void testCreateSecretLocksBulkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"secret_name\": \"my-secret\", \"versions\": [{\"version_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"version_alias\": \"current\", \"locks\": [\"lock-example\"], \"payload_available\": true}]}";
    String createSecretLocksBulkPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/locks_bulk";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SecretLockPrototype model
    SecretLockPrototype secretLockPrototypeModel = new SecretLockPrototype.Builder()
      .name("lock-example-1")
      .description("lock for consumer 1")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the CreateSecretLocksBulkOptions model
    CreateSecretLocksBulkOptions createSecretLocksBulkOptionsModel = new CreateSecretLocksBulkOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .locks(java.util.Arrays.asList(secretLockPrototypeModel))
      .mode("remove_previous")
      .build();

    // Invoke createSecretLocksBulk() with a valid options model and verify the result
    Response<SecretLocks> response = secretsManagerService.createSecretLocksBulk(createSecretLocksBulkOptionsModel).execute();
    assertNotNull(response);
    SecretLocks responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecretLocksBulkPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("mode"), "remove_previous");
  }

  // Test the createSecretLocksBulk operation with and without retries enabled
  @Test
  public void testCreateSecretLocksBulkWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateSecretLocksBulkWOptions();

    secretsManagerService.disableRetries();
    testCreateSecretLocksBulkWOptions();
  }

  // Test the createSecretLocksBulk operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretLocksBulkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createSecretLocksBulk(null).execute();
  }

  // Test the deleteSecretLocksBulk operation with a valid options model parameter
  @Test
  public void testDeleteSecretLocksBulkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"secret_name\": \"my-secret\", \"versions\": [{\"version_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"version_alias\": \"current\", \"locks\": [\"lock-example\"], \"payload_available\": true}]}";
    String deleteSecretLocksBulkPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/locks_bulk";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSecretLocksBulkOptions model
    DeleteSecretLocksBulkOptions deleteSecretLocksBulkOptionsModel = new DeleteSecretLocksBulkOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .name(java.util.Arrays.asList("lock-example-1"))
      .build();

    // Invoke deleteSecretLocksBulk() with a valid options model and verify the result
    Response<SecretLocks> response = secretsManagerService.deleteSecretLocksBulk(deleteSecretLocksBulkOptionsModel).execute();
    assertNotNull(response);
    SecretLocks responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSecretLocksBulkPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("name"), RequestUtils.join(java.util.Arrays.asList("lock-example-1"), ","));
  }

  // Test the deleteSecretLocksBulk operation with and without retries enabled
  @Test
  public void testDeleteSecretLocksBulkWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testDeleteSecretLocksBulkWOptions();

    secretsManagerService.disableRetries();
    testDeleteSecretLocksBulkWOptions();
  }

  // Test the deleteSecretLocksBulk operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecretLocksBulkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.deleteSecretLocksBulk(null).execute();
  }

  // Test the listSecretVersionLocks operation with a valid options model parameter
  @Test
  public void testListSecretVersionLocksWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"limit\": 25, \"offset\": 25, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"locks\": [{\"name\": \"lock-example\", \"description\": \"description\", \"attributes\": {\"anyKey\": \"anyValue\"}, \"created_at\": \"2022-04-12T23:20:50.520Z\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"secret_group_id\": \"default\", \"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_version_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_version_alias\": \"current\"}]}";
    String listSecretVersionLocksPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions/eb4cf24d-9cae-424b-945e-159788a5f535/locks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSecretVersionLocksOptions model
    ListSecretVersionLocksOptions listSecretVersionLocksOptionsModel = new ListSecretVersionLocksOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .sort("name")
      .search("example")
      .build();

    // Invoke listSecretVersionLocks() with a valid options model and verify the result
    Response<SecretVersionLocksPaginatedCollection> response = secretsManagerService.listSecretVersionLocks(listSecretVersionLocksOptionsModel).execute();
    assertNotNull(response);
    SecretVersionLocksPaginatedCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecretVersionLocksPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("sort"), "name");
    assertEquals(query.get("search"), "example");
  }

  // Test the listSecretVersionLocks operation with and without retries enabled
  @Test
  public void testListSecretVersionLocksWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testListSecretVersionLocksWOptions();

    secretsManagerService.disableRetries();
    testListSecretVersionLocksWOptions();
  }

  // Test the listSecretVersionLocks operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSecretVersionLocksNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.listSecretVersionLocks(null).execute();
  }

  // Test the listSecretVersionLocks operation using the SecretVersionLocksPager.getNext() method
  @Test
  public void testListSecretVersionLocksWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"locks\":[{\"name\":\"lock-example\",\"description\":\"description\",\"attributes\":{\"anyKey\":\"anyValue\"},\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"secret_group_id\":\"default\",\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_alias\":\"current\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"locks\":[{\"name\":\"lock-example\",\"description\":\"description\",\"attributes\":{\"anyKey\":\"anyValue\"},\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"secret_group_id\":\"default\",\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_alias\":\"current\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretVersionLocksOptions listSecretVersionLocksOptions = new ListSecretVersionLocksOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .limit(Long.valueOf("10"))
      .sort("name")
      .search("example")
      .build();

    List<SecretLock> allResults = new ArrayList<>();
    SecretVersionLocksPager pager = new SecretVersionLocksPager(secretsManagerService, listSecretVersionLocksOptions);
    while (pager.hasNext()) {
      List<SecretLock> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSecretVersionLocks operation using the SecretVersionLocksPager.getAll() method
  @Test
  public void testListSecretVersionLocksWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"locks\":[{\"name\":\"lock-example\",\"description\":\"description\",\"attributes\":{\"anyKey\":\"anyValue\"},\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"secret_group_id\":\"default\",\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_alias\":\"current\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"locks\":[{\"name\":\"lock-example\",\"description\":\"description\",\"attributes\":{\"anyKey\":\"anyValue\"},\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"secret_group_id\":\"default\",\"secret_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_id\":\"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\",\"secret_version_alias\":\"current\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretVersionLocksOptions listSecretVersionLocksOptions = new ListSecretVersionLocksOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .limit(Long.valueOf("10"))
      .sort("name")
      .search("example")
      .build();

    SecretVersionLocksPager pager = new SecretVersionLocksPager(secretsManagerService, listSecretVersionLocksOptions);
    List<SecretLock> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createSecretVersionLocksBulk operation with a valid options model parameter
  @Test
  public void testCreateSecretVersionLocksBulkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"secret_name\": \"my-secret\", \"versions\": [{\"version_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"version_alias\": \"current\", \"locks\": [\"lock-example\"], \"payload_available\": true}]}";
    String createSecretVersionLocksBulkPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions/eb4cf24d-9cae-424b-945e-159788a5f535/locks_bulk";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SecretLockPrototype model
    SecretLockPrototype secretLockPrototypeModel = new SecretLockPrototype.Builder()
      .name("lock-example-1")
      .description("lock for consumer 1")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the CreateSecretVersionLocksBulkOptions model
    CreateSecretVersionLocksBulkOptions createSecretVersionLocksBulkOptionsModel = new CreateSecretVersionLocksBulkOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .locks(java.util.Arrays.asList(secretLockPrototypeModel))
      .mode("remove_previous")
      .build();

    // Invoke createSecretVersionLocksBulk() with a valid options model and verify the result
    Response<SecretLocks> response = secretsManagerService.createSecretVersionLocksBulk(createSecretVersionLocksBulkOptionsModel).execute();
    assertNotNull(response);
    SecretLocks responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecretVersionLocksBulkPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("mode"), "remove_previous");
  }

  // Test the createSecretVersionLocksBulk operation with and without retries enabled
  @Test
  public void testCreateSecretVersionLocksBulkWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateSecretVersionLocksBulkWOptions();

    secretsManagerService.disableRetries();
    testCreateSecretVersionLocksBulkWOptions();
  }

  // Test the createSecretVersionLocksBulk operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretVersionLocksBulkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createSecretVersionLocksBulk(null).execute();
  }

  // Test the deleteSecretVersionLocksBulk operation with a valid options model parameter
  @Test
  public void testDeleteSecretVersionLocksBulkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"secret_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"secret_group_id\": \"default\", \"secret_type\": \"arbitrary\", \"secret_name\": \"my-secret\", \"versions\": [{\"version_id\": \"b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5\", \"version_alias\": \"current\", \"locks\": [\"lock-example\"], \"payload_available\": true}]}";
    String deleteSecretVersionLocksBulkPath = "/api/v2/secrets/0b5571f7-21e6-42b7-91c5-3f5ac9793a46/versions/eb4cf24d-9cae-424b-945e-159788a5f535/locks_bulk";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSecretVersionLocksBulkOptions model
    DeleteSecretVersionLocksBulkOptions deleteSecretVersionLocksBulkOptionsModel = new DeleteSecretVersionLocksBulkOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("eb4cf24d-9cae-424b-945e-159788a5f535")
      .name(java.util.Arrays.asList("lock-example-1"))
      .build();

    // Invoke deleteSecretVersionLocksBulk() with a valid options model and verify the result
    Response<SecretLocks> response = secretsManagerService.deleteSecretVersionLocksBulk(deleteSecretVersionLocksBulkOptionsModel).execute();
    assertNotNull(response);
    SecretLocks responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSecretVersionLocksBulkPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("name"), RequestUtils.join(java.util.Arrays.asList("lock-example-1"), ","));
  }

  // Test the deleteSecretVersionLocksBulk operation with and without retries enabled
  @Test
  public void testDeleteSecretVersionLocksBulkWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testDeleteSecretVersionLocksBulkWOptions();

    secretsManagerService.disableRetries();
    testDeleteSecretVersionLocksBulkWOptions();
  }

  // Test the deleteSecretVersionLocksBulk operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecretVersionLocksBulkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.deleteSecretVersionLocksBulk(null).execute();
  }

  // Test the createConfiguration operation with a valid options model parameter
  @Test
  public void testCreateConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"config_type\": \"public_cert_configuration_ca_lets_encrypt\", \"name\": \"my-secret-engine-config\", \"secret_type\": \"arbitrary\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"lets_encrypt_environment\": \"production\", \"lets_encrypt_preferred_chain\": \"letsEncryptPreferredChain\", \"lets_encrypt_private_key\": \"letsEncryptPrivateKey\"}";
    String createConfigurationPath = "/api/v2/configurations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the PublicCertificateConfigurationDNSCloudInternetServicesPrototype model
    PublicCertificateConfigurationDNSCloudInternetServicesPrototype configurationPrototypeModel = new PublicCertificateConfigurationDNSCloudInternetServicesPrototype.Builder()
      .configType("public_cert_configuration_dns_cloud_internet_services")
      .name("example-cloud-internet-services-config")
      .cloudInternetServicesApikey("5ipu_ykv0PMp2MhxQnDMn7VzrkSlBwi3BOI8uthi_EXZ")
      .cloudInternetServicesCrn("crn:v1:bluemix:public:internet-svcs:global:a/128e84fcca45c1224aae525d31ef2b52:009a0357-1460-42b4-b903-10580aba7dd8::")
      .build();

    // Construct an instance of the CreateConfigurationOptions model
    CreateConfigurationOptions createConfigurationOptionsModel = new CreateConfigurationOptions.Builder()
      .configurationPrototype(configurationPrototypeModel)
      .build();

    // Invoke createConfiguration() with a valid options model and verify the result
    Response<Configuration> response = secretsManagerService.createConfiguration(createConfigurationOptionsModel).execute();
    assertNotNull(response);
    Configuration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createConfiguration operation with and without retries enabled
  @Test
  public void testCreateConfigurationWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateConfigurationWOptions();

    secretsManagerService.disableRetries();
    testCreateConfigurationWOptions();
  }

  // Test the createConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createConfiguration(null).execute();
  }

  // Test the listConfigurations operation with a valid options model parameter
  @Test
  public void testListConfigurationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"limit\": 25, \"offset\": 25, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"configurations\": [{\"config_type\": \"iam_credentials_configuration\", \"name\": \"my-secret-engine-config\", \"secret_type\": \"arbitrary\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"disabled\": true}]}";
    String listConfigurationsPath = "/api/v2/configurations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListConfigurationsOptions model
    ListConfigurationsOptions listConfigurationsOptionsModel = new ListConfigurationsOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .sort("config_type")
      .search("example")
      .secretTypes(java.util.Arrays.asList("iam_credentials", "public_cert", "private_cert"))
      .build();

    // Invoke listConfigurations() with a valid options model and verify the result
    Response<ConfigurationMetadataPaginatedCollection> response = secretsManagerService.listConfigurations(listConfigurationsOptionsModel).execute();
    assertNotNull(response);
    ConfigurationMetadataPaginatedCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConfigurationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("sort"), "config_type");
    assertEquals(query.get("search"), "example");
    assertEquals(query.get("secret_types"), RequestUtils.join(java.util.Arrays.asList("iam_credentials", "public_cert", "private_cert"), ","));
  }

  // Test the listConfigurations operation with and without retries enabled
  @Test
  public void testListConfigurationsWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testListConfigurationsWOptions();

    secretsManagerService.disableRetries();
    testListConfigurationsWOptions();
  }

  // Test the listConfigurations operation using the ConfigurationsPager.getNext() method
  @Test
  public void testListConfigurationsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"configurations\":[{\"config_type\":\"iam_credentials_configuration\",\"name\":\"my-secret-engine-config\",\"secret_type\":\"arbitrary\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"disabled\":true}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"configurations\":[{\"config_type\":\"iam_credentials_configuration\",\"name\":\"my-secret-engine-config\",\"secret_type\":\"arbitrary\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"disabled\":true}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListConfigurationsOptions listConfigurationsOptions = new ListConfigurationsOptions.Builder()
      .limit(Long.valueOf("10"))
      .sort("config_type")
      .search("example")
      .secretTypes(java.util.Arrays.asList("iam_credentials", "public_cert", "private_cert"))
      .build();

    List<ConfigurationMetadata> allResults = new ArrayList<>();
    ConfigurationsPager pager = new ConfigurationsPager(secretsManagerService, listConfigurationsOptions);
    while (pager.hasNext()) {
      List<ConfigurationMetadata> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listConfigurations operation using the ConfigurationsPager.getAll() method
  @Test
  public void testListConfigurationsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"configurations\":[{\"config_type\":\"iam_credentials_configuration\",\"name\":\"my-secret-engine-config\",\"secret_type\":\"arbitrary\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"disabled\":true}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"configurations\":[{\"config_type\":\"iam_credentials_configuration\",\"name\":\"my-secret-engine-config\",\"secret_type\":\"arbitrary\",\"created_by\":\"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\",\"created_at\":\"2022-04-12T23:20:50.520Z\",\"updated_at\":\"2022-04-12T23:20:50.520Z\",\"disabled\":true}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListConfigurationsOptions listConfigurationsOptions = new ListConfigurationsOptions.Builder()
      .limit(Long.valueOf("10"))
      .sort("config_type")
      .search("example")
      .secretTypes(java.util.Arrays.asList("iam_credentials", "public_cert", "private_cert"))
      .build();

    ConfigurationsPager pager = new ConfigurationsPager(secretsManagerService, listConfigurationsOptions);
    List<ConfigurationMetadata> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getConfiguration operation with a valid options model parameter
  @Test
  public void testGetConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"config_type\": \"public_cert_configuration_ca_lets_encrypt\", \"name\": \"my-secret-engine-config\", \"secret_type\": \"arbitrary\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"lets_encrypt_environment\": \"production\", \"lets_encrypt_preferred_chain\": \"letsEncryptPreferredChain\", \"lets_encrypt_private_key\": \"letsEncryptPrivateKey\"}";
    String getConfigurationPath = "/api/v2/configurations/configuration-name";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfigurationOptions model
    GetConfigurationOptions getConfigurationOptionsModel = new GetConfigurationOptions.Builder()
      .name("configuration-name")
      .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
      .build();

    // Invoke getConfiguration() with a valid options model and verify the result
    Response<Configuration> response = secretsManagerService.getConfiguration(getConfigurationOptionsModel).execute();
    assertNotNull(response);
    Configuration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getConfiguration operation with and without retries enabled
  @Test
  public void testGetConfigurationWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetConfigurationWOptions();

    secretsManagerService.disableRetries();
    testGetConfigurationWOptions();
  }

  // Test the getConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.getConfiguration(null).execute();
  }

  // Test the updateConfiguration operation with a valid options model parameter
  @Test
  public void testUpdateConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"config_type\": \"public_cert_configuration_ca_lets_encrypt\", \"name\": \"my-secret-engine-config\", \"secret_type\": \"arbitrary\", \"created_by\": \"iam-ServiceId-e4a2f0a4-3c76-4bef-b1f2-fbeae11c0f21\", \"created_at\": \"2022-04-12T23:20:50.520Z\", \"updated_at\": \"2022-04-12T23:20:50.520Z\", \"lets_encrypt_environment\": \"production\", \"lets_encrypt_preferred_chain\": \"letsEncryptPreferredChain\", \"lets_encrypt_private_key\": \"letsEncryptPrivateKey\"}";
    String updateConfigurationPath = "/api/v2/configurations/configuration-name";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PublicCertificateConfigurationDNSCloudInternetServicesPatch model
    PublicCertificateConfigurationDNSCloudInternetServicesPatch configurationPatchModel = new PublicCertificateConfigurationDNSCloudInternetServicesPatch.Builder()
      .cloudInternetServicesApikey("5ipu_ykv0PMp2MhxQnDMn7VzrkSlBwi3BOI8uthi_EXZ")
      .cloudInternetServicesCrn("crn:v1:bluemix:public:internet-svcs:global:a/128e84fcca45c1224aae525d31ef2b52:009a0357-1460-42b4-b903-10580aba7dd8::")
      .build();
    Map<String, Object> configurationPatchModelAsPatch = configurationPatchModel.asPatch();

    // Construct an instance of the UpdateConfigurationOptions model
    UpdateConfigurationOptions updateConfigurationOptionsModel = new UpdateConfigurationOptions.Builder()
      .name("configuration-name")
      .configurationPatch(configurationPatchModelAsPatch)
      .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
      .build();

    // Invoke updateConfiguration() with a valid options model and verify the result
    Response<Configuration> response = secretsManagerService.updateConfiguration(updateConfigurationOptionsModel).execute();
    assertNotNull(response);
    Configuration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateConfiguration operation with and without retries enabled
  @Test
  public void testUpdateConfigurationWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testUpdateConfigurationWOptions();

    secretsManagerService.disableRetries();
    testUpdateConfigurationWOptions();
  }

  // Test the updateConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.updateConfiguration(null).execute();
  }

  // Test the deleteConfiguration operation with a valid options model parameter
  @Test
  public void testDeleteConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteConfigurationPath = "/api/v2/configurations/configuration-name";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteConfigurationOptions model
    DeleteConfigurationOptions deleteConfigurationOptionsModel = new DeleteConfigurationOptions.Builder()
      .name("configuration-name")
      .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
      .build();

    // Invoke deleteConfiguration() with a valid options model and verify the result
    Response<Void> response = secretsManagerService.deleteConfiguration(deleteConfigurationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteConfiguration operation with and without retries enabled
  @Test
  public void testDeleteConfigurationWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testDeleteConfigurationWOptions();

    secretsManagerService.disableRetries();
    testDeleteConfigurationWOptions();
  }

  // Test the deleteConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.deleteConfiguration(null).execute();
  }

  // Test the createConfigurationAction operation with a valid options model parameter
  @Test
  public void testCreateConfigurationActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action_type\": \"private_cert_configuration_action_revoke_ca_certificate\", \"revocation_time_seconds\": 21}";
    String createConfigurationActionPath = "/api/v2/configurations/configuration-name/actions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the PrivateCertificateConfigurationActionRotateCRLPrototype model
    PrivateCertificateConfigurationActionRotateCRLPrototype configurationActionPrototypeModel = new PrivateCertificateConfigurationActionRotateCRLPrototype.Builder()
      .actionType("private_cert_configuration_action_rotate_crl")
      .build();

    // Construct an instance of the CreateConfigurationActionOptions model
    CreateConfigurationActionOptions createConfigurationActionOptionsModel = new CreateConfigurationActionOptions.Builder()
      .name("configuration-name")
      .configActionPrototype(configurationActionPrototypeModel)
      .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
      .build();

    // Invoke createConfigurationAction() with a valid options model and verify the result
    Response<ConfigurationAction> response = secretsManagerService.createConfigurationAction(createConfigurationActionOptionsModel).execute();
    assertNotNull(response);
    ConfigurationAction responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createConfigurationActionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createConfigurationAction operation with and without retries enabled
  @Test
  public void testCreateConfigurationActionWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateConfigurationActionWOptions();

    secretsManagerService.disableRetries();
    testCreateConfigurationActionWOptions();
  }

  // Test the createConfigurationAction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigurationActionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createConfigurationAction(null).execute();
  }

  // Test the createNotificationsRegistration operation with a valid options model parameter
  @Test
  public void testCreateNotificationsRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"event_notifications_instance_crn\": \"eventNotificationsInstanceCrn\"}";
    String createNotificationsRegistrationPath = "/api/v2/notifications/registration";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateNotificationsRegistrationOptions model
    CreateNotificationsRegistrationOptions createNotificationsRegistrationOptionsModel = new CreateNotificationsRegistrationOptions.Builder()
      .eventNotificationsInstanceCrn("crn:v1:bluemix:public:event-notifications:us-south:a/22018f3c34ff4ff193698d15ca316946:578ad1a4-2fd8-4e66-95d5-79a842ba91f8::")
      .eventNotificationsSourceName("My Secrets Manager")
      .eventNotificationsSourceDescription("Optional description of this source in an Event Notifications instance.")
      .build();

    // Invoke createNotificationsRegistration() with a valid options model and verify the result
    Response<NotificationsRegistration> response = secretsManagerService.createNotificationsRegistration(createNotificationsRegistrationOptionsModel).execute();
    assertNotNull(response);
    NotificationsRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createNotificationsRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createNotificationsRegistration operation with and without retries enabled
  @Test
  public void testCreateNotificationsRegistrationWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testCreateNotificationsRegistrationWOptions();

    secretsManagerService.disableRetries();
    testCreateNotificationsRegistrationWOptions();
  }

  // Test the createNotificationsRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateNotificationsRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerService.createNotificationsRegistration(null).execute();
  }

  // Test the getNotificationsRegistration operation with a valid options model parameter
  @Test
  public void testGetNotificationsRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"event_notifications_instance_crn\": \"eventNotificationsInstanceCrn\"}";
    String getNotificationsRegistrationPath = "/api/v2/notifications/registration";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetNotificationsRegistrationOptions model
    GetNotificationsRegistrationOptions getNotificationsRegistrationOptionsModel = new GetNotificationsRegistrationOptions();

    // Invoke getNotificationsRegistration() with a valid options model and verify the result
    Response<NotificationsRegistration> response = secretsManagerService.getNotificationsRegistration(getNotificationsRegistrationOptionsModel).execute();
    assertNotNull(response);
    NotificationsRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getNotificationsRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getNotificationsRegistration operation with and without retries enabled
  @Test
  public void testGetNotificationsRegistrationWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetNotificationsRegistrationWOptions();

    secretsManagerService.disableRetries();
    testGetNotificationsRegistrationWOptions();
  }

  // Test the deleteNotificationsRegistration operation with a valid options model parameter
  @Test
  public void testDeleteNotificationsRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteNotificationsRegistrationPath = "/api/v2/notifications/registration";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteNotificationsRegistrationOptions model
    DeleteNotificationsRegistrationOptions deleteNotificationsRegistrationOptionsModel = new DeleteNotificationsRegistrationOptions();

    // Invoke deleteNotificationsRegistration() with a valid options model and verify the result
    Response<Void> response = secretsManagerService.deleteNotificationsRegistration(deleteNotificationsRegistrationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteNotificationsRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteNotificationsRegistration operation with and without retries enabled
  @Test
  public void testDeleteNotificationsRegistrationWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testDeleteNotificationsRegistrationWOptions();

    secretsManagerService.disableRetries();
    testDeleteNotificationsRegistrationWOptions();
  }

  // Test the getNotificationsRegistrationTest operation with a valid options model parameter
  @Test
  public void testGetNotificationsRegistrationTestWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String getNotificationsRegistrationTestPath = "/api/v2/notifications/registration/test";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the GetNotificationsRegistrationTestOptions model
    GetNotificationsRegistrationTestOptions getNotificationsRegistrationTestOptionsModel = new GetNotificationsRegistrationTestOptions();

    // Invoke getNotificationsRegistrationTest() with a valid options model and verify the result
    Response<Void> response = secretsManagerService.getNotificationsRegistrationTest(getNotificationsRegistrationTestOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getNotificationsRegistrationTestPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getNotificationsRegistrationTest operation with and without retries enabled
  @Test
  public void testGetNotificationsRegistrationTestWRetries() throws Throwable {
    secretsManagerService.enableRetries(4, 30);
    testGetNotificationsRegistrationTestWOptions();

    secretsManagerService.disableRetries();
    testGetNotificationsRegistrationTestWOptions();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    secretsManagerService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    secretsManagerService = SecretsManager.newInstance(serviceName);
    String url = server.url("/").toString();
    secretsManagerService.setServiceUrl(url);
  }
}