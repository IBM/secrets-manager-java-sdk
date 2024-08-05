package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.*;
import com.ibm.cloud.secrets_manager_sdk.test.SdkIntegrationTestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

public class SecretsManagerManualTests extends SdkIntegrationTestBase {
    private final String rootCaName = "root-CA", interCaName = "inter-CA", templateName = "template-1", iamConfigName = "iam-configuration";
    private final String rootConfigType = "private_cert_configuration_root_ca";
    private final String interConfigType = "private_cert_configuration_intermediate_ca";
    private final String templateConfigType = "private_cert_configuration_template";
    private final String iamConfigType = "iam_credentials_configuration";
    public SecretsManager service = null;
    public String privateCertSecretId1, privateCertSecretId2, iamSecret;
    public static Map<String, String> config = null;

    @Override
    public String getConfigFilename() {
        return "../../secrets_manager_v2.env";
    }

    @BeforeClass
    public void constructService() {
        service = SecretsManager.newInstance();
        assertNotNull(service);
        assertNotNull(service.getServiceUrl());

        // Load up our test-specific config properties.
        config = CredentialUtils.getServiceProperties(SecretsManager.DEFAULT_SERVICE_NAME);
        assertNotNull(config);
        assertFalse(config.isEmpty());
        assertEquals(service.getServiceUrl(), config.get("URL"));

        service.enableRetries(4, 30);

        // Private Cert engine tests setup
        configPrivateCertEngine();
        privateCertSecretId1 = createPrivateCertificate("private-cert-secret1");
        privateCertSecretId2 = createPrivateCertificate("private-cert-secret2");

        // IAM Credentials engine tests setup
        System.out.println("Creating IAM configuration");
        IAMCredentialsConfigurationPrototype iamConfigPrototype = new IAMCredentialsConfigurationPrototype.Builder()
                .configType(iamConfigType)
                .name(iamConfigName)
                .apiKey(config.get("APIKEY"))
                .build();
        createConfiguration(iamConfigPrototype);

        // Create IAM Secret
        System.out.println("Creating IAM Credentials secret");
        List<String> accessGroups = new ArrayList<>(Collections.singletonList(config.get("ACCESS_GROUP")));
        IAMCredentialsSecretPrototype secretPrototypeModel = new IAMCredentialsSecretPrototype.Builder()
                .secretType("iam_credentials")
                .name("iam-credentials-secret")
                .description("test desc")
                .accessGroups(accessGroups)
                .ttl("5m")
                .reuseApiKey(false)
                .build();

        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretPrototype(secretPrototypeModel)
                .build();

        // Invoke operation
        Response<Secret> createSecretResponse = service.createSecret(createSecretOptions).execute();
        // Validate response
        assertNotNull(createSecretResponse);
        assertEquals(createSecretResponse.getStatusCode(), 201);
        iamSecret = createSecretResponse.getResult().getId();

        // get secret - generate credentials
        System.out.println("Get secret - generating credentials");
        GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                .id(iamSecret)
                .build();

        // Invoke operation
        Response<Secret> getSecretResponse = service.getSecret(getSecretOptions).execute();
        // Validate response
        assertNotNull(getSecretResponse);
        assertEquals(getSecretResponse.getStatusCode(), 200);

        System.out.println("Setup complete.");
    }

    @AfterClass
    public void afterAll() {
        deleteSecret(privateCertSecretId1);
        deleteSecret(privateCertSecretId2);
        deleteSecret(iamSecret);

        deleteConfiguration(templateName, templateConfigType);
        deleteConfiguration(interCaName, interConfigType);
        deleteConfiguration(rootCaName, rootConfigType);
        deleteConfiguration(iamConfigName, iamConfigType);
    }

    @Test
    public void testDeleteSecretVersionData() {
        try {
            // Delete version's secret-data
            DeleteSecretVersionDataOptions deleteSecretVersionDataOptions = new DeleteSecretVersionDataOptions.Builder()
                    .secretId(iamSecret)
                    .id("current")
                    .build();

            // Invoke operation
            Response<Void> dataDeleteResponse = service.deleteSecretVersionData(deleteSecretVersionDataOptions).execute();
            // Validate response
            assertNotNull(dataDeleteResponse);
            assertEquals(dataDeleteResponse.getStatusCode(), 204);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test
    public void testCreateSecretAction() {
        try {
            // Revoke Private Cert Secret
            PublicCertificateActionValidateManualDNSPrototype secretActionPrototypeModel = new PublicCertificateActionValidateManualDNSPrototype.Builder()
                    .actionType("private_cert_action_revoke_certificate")
                    .build();

            CreateSecretActionOptions createSecretActionOptions = new CreateSecretActionOptions.Builder()
                    .id(privateCertSecretId1)
                    .secretActionPrototype(secretActionPrototypeModel)
                    .build();

            // Invoke operation
            Response<SecretAction> secretActionResponse = service.createSecretAction(createSecretActionOptions).execute();
            // Validate response
            assertNotNull(secretActionResponse);
            assertEquals(secretActionResponse.getStatusCode(), 201);

            SecretAction secretActionResult = secretActionResponse.getResult();

            assertNotNull(secretActionResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test
    public void testCreateSecretVersionAction() {
        try {
            PrivateCertificateVersionActionRevokePrototype secretVersionActionPrototypeModel = new PrivateCertificateVersionActionRevokePrototype.Builder()
                    .actionType("private_cert_action_revoke_certificate")
                    .build();

            CreateSecretVersionActionOptions createSecretVersionActionOptions = new CreateSecretVersionActionOptions.Builder()
                    .secretId(privateCertSecretId2)
                    .id("current")
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

    @Test
    public void testCreateConfigurationAction() {
        try {
            PrivateCertificateConfigurationActionRotateCRLPrototype configurationActionPrototypeModel = new PrivateCertificateConfigurationActionRotateCRLPrototype.Builder()
                    .actionType("private_cert_configuration_action_rotate_crl")
                    .build();

            CreateConfigurationActionOptions createConfigurationActionOptions = new CreateConfigurationActionOptions.Builder()
                    .name(rootCaName)
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

    private void configPrivateCertEngine() {
        // Create Root CA
        System.out.println("Creating Root CA");
        PrivateCertificateConfigurationRootCAPrototype rootCAPrototype = new PrivateCertificateConfigurationRootCAPrototype.Builder()
                .configType(rootConfigType)
                .name(rootCaName)
                .maxTtl("43830h")
                .commonName("localhost")
                .build();

        createConfiguration(rootCAPrototype);

        // Create Intermediate CA
        System.out.println("Creating Intermediate CA");
        PrivateCertificateConfigurationIntermediateCAPrototype intermediateCAPrototype = new PrivateCertificateConfigurationIntermediateCAPrototype.Builder()
                .configType(interConfigType)
                .name(interCaName)
                .maxTtl("43830h")
                .commonName("localhost")
                .issuer(rootCaName)
                .signingMethod("internal")
                .build();

        createConfiguration(intermediateCAPrototype);

        // Sign intermediate CA
        System.out.println("Signing intermediate CA");
        PrivateCertificateConfigurationActionSignIntermediatePrototype configurationActionPrototypeModel = new PrivateCertificateConfigurationActionSignIntermediatePrototype.Builder()
                .actionType("private_cert_configuration_action_sign_intermediate")
                .intermediateCertificateAuthority(interCaName)
                .build();

        CreateConfigurationActionOptions createConfigurationActionOptions = new CreateConfigurationActionOptions.Builder()
                .name(rootCaName)
                .configActionPrototype(configurationActionPrototypeModel)
                .xSmAcceptConfigurationType(rootConfigType)
                .build();

        // Invoke operation
        Response<ConfigurationAction> actionResponse = service.createConfigurationAction(createConfigurationActionOptions).execute();
        // Validate response
        assertNotNull(actionResponse);
        assertEquals(actionResponse.getStatusCode(), 201);

        // Create Template
        System.out.println("Creating Template");
        PrivateCertificateConfigurationTemplatePrototype templatePrototype = new PrivateCertificateConfigurationTemplatePrototype.Builder()
                .configType(templateConfigType)
                .name(templateName)
                .certificateAuthority(interCaName)
                .build();

        createConfiguration(templatePrototype);
    }

    private void createConfiguration(ConfigurationPrototype intermediateCAPrototype) {
        CreateConfigurationOptions createInterConfigurationOptions = new CreateConfigurationOptions.Builder()
                .configurationPrototype(intermediateCAPrototype)
                .build();
        try {
            // Invoke operation
            Response<Configuration> response = service.createConfiguration(createInterConfigurationOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);
        } catch (Exception ex) {
            String errMessage = ex.getMessage();
            assertTrue((errMessage.contains("already exists") || errMessage.contains("reached the maximum")), "Config creation failed");
        }
    }

    private void deleteConfiguration(String configName, String configType) {
        DeleteConfigurationOptions deleteConfigurationOptions = new DeleteConfigurationOptions.Builder()
                .name(configName)
                .xSmAcceptConfigurationType(configType)
                .build();

        // Invoke operation
        Response<Void> response = service.deleteConfiguration(deleteConfigurationOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 204);
    }

    private void deleteSecret(String secretId) {
        DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                .id(secretId)
                .build();

        // Invoke operation
        Response<Void> response = service.deleteSecret(deleteSecretOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 204);
    }

    private String createPrivateCertificate(String secretName) {
        // Create Private certificate secret
        System.out.println("Creating Private certificate secret");
        PrivateCertificatePrototype secretPrototypeModel = new PrivateCertificatePrototype.Builder()
                .secretType("private_cert")
                .name(secretName)
                .certificateTemplate(templateName)
                .commonName("localhost")
                .ttl("10h")
                .build();

        CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                .secretPrototype(secretPrototypeModel)
                .build();

        // Invoke operation
        Response<Secret> createSecretResponse = service.createSecret(createSecretOptions).execute();
        // Validate response
        assertNotNull(createSecretResponse);
        assertEquals(createSecretResponse.getStatusCode(), 201);
        return createSecretResponse.getResult().getId();
    }
}
