/*
 * (C) Copyright IBM Corp. 2022.
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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.46.0-a4e29da0-20220224-210428
 */

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.secrets_manager_sdk.common.SdkCommon;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.DeleteSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElements;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigElementsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetConfigOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetNotificationsSettings;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetPolicyOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretPolicies;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.GetSingleConfigElement;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListAllSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretGroupsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretVersions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretVersionsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecrets;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ListSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PutConfigOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PutPolicyOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretGroupDef;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretMetadataRequest;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SendTestNotificationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretGroupMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * With IBM Cloud® Secrets Manager, you can create, lease, and centrally manage secrets that are used in IBM Cloud
 * services or your custom-built applications. Secrets are stored in a dedicated instance of Secrets Manager, which is
 * built on open source HashiCorp Vault.
 * <p>
 * API Version: 1.0.0
 * See: https://cloud.ibm.com/docs/secrets-manager
 */
public class SecretsManager extends BaseService {

    public static final String DEFAULT_SERVICE_NAME = "secrets_manager";

    public static final String DEFAULT_SERVICE_URL = "https://secrets-manager.cloud.ibm.com";

    /**
     * Class method which constructs an instance of the `SecretsManager` client.
     * The default service name is used to configure the client instance.
     *
     * @return an instance of the `SecretsManager` client using external configuration
     */
    public static SecretsManager newInstance() {
        return newInstance(DEFAULT_SERVICE_NAME);
    }

    /**
     * Class method which constructs an instance of the `SecretsManager` client.
     * The specified service name is used to configure the client instance.
     *
     * @param serviceName the service name to be used when configuring the client instance
     * @return an instance of the `SecretsManager` client using external configuration
     */
    public static SecretsManager newInstance(String serviceName) {
        Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
        SecretsManager service = new SecretsManager(serviceName, authenticator);
        service.configureService(serviceName);
        return service;
    }

    /**
     * Constructs an instance of the `SecretsManager` client.
     * The specified service name and authenticator are used to configure the client instance.
     *
     * @param serviceName   the service name to be used when configuring the client instance
     * @param authenticator the {@link Authenticator} instance to be configured for this client
     */
    public SecretsManager(String serviceName, Authenticator authenticator) {
        super(serviceName, authenticator);
        setServiceUrl(DEFAULT_SERVICE_URL);
    }

    /**
     * Create a secret group.
     * <p>
     * Creates a secret group that you can use to organize secrets and control who on your team has access to them.
     * <p>
     * A successful request returns the ID value of the secret group, along with other metadata. To learn more about
     * secret groups, check out the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-secret-groups).
     *
     * @param createSecretGroupOptions the {@link CreateSecretGroupOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link SecretGroupDef}
     */
    public ServiceCall<SecretGroupDef> createSecretGroup(CreateSecretGroupOptions createSecretGroupOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretGroupOptions,
                "createSecretGroupOptions cannot be null");
        RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secret_groups"));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "createSecretGroup");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        final JsonObject contentJson = new JsonObject();
        contentJson.add("metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretGroupOptions.metadata()));
        contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretGroupOptions.resources()));
        builder.bodyJson(contentJson);
        ResponseConverter<SecretGroupDef> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretGroupDef>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * List secret groups.
     * <p>
     * Retrieves the list of secret groups that are available in your Secrets Manager instance.
     *
     * @param listSecretGroupsOptions the {@link ListSecretGroupsOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link SecretGroupDef}
     */
    public ServiceCall<SecretGroupDef> listSecretGroups(ListSecretGroupsOptions listSecretGroupsOptions) {
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secret_groups"));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "listSecretGroups");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<SecretGroupDef> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretGroupDef>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * List secret groups.
     * <p>
     * Retrieves the list of secret groups that are available in your Secrets Manager instance.
     *
     * @return a {@link ServiceCall} with a result of type {@link SecretGroupDef}
     */
    public ServiceCall<SecretGroupDef> listSecretGroups() {
        return listSecretGroups(null);
    }

    /**
     * Get a secret group.
     * <p>
     * Retrieves the metadata of an existing secret group by specifying the ID of the group.
     *
     * @param getSecretGroupOptions the {@link GetSecretGroupOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link SecretGroupDef}
     */
    public ServiceCall<SecretGroupDef> getSecretGroup(GetSecretGroupOptions getSecretGroupOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretGroupOptions,
                "getSecretGroupOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("id", getSecretGroupOptions.id());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secret_groups/{id}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getSecretGroup");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<SecretGroupDef> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretGroupDef>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Update a secret group.
     * <p>
     * Updates the metadata of an existing secret group, such as its name or description.
     *
     * @param updateSecretGroupMetadataOptions the {@link UpdateSecretGroupMetadataOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link SecretGroupDef}
     */
    public ServiceCall<SecretGroupDef> updateSecretGroupMetadata(UpdateSecretGroupMetadataOptions updateSecretGroupMetadataOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(updateSecretGroupMetadataOptions,
                "updateSecretGroupMetadataOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("id", updateSecretGroupMetadataOptions.id());
        RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secret_groups/{id}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "updateSecretGroupMetadata");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        final JsonObject contentJson = new JsonObject();
        contentJson.add("metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSecretGroupMetadataOptions.metadata()));
        contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSecretGroupMetadataOptions.resources()));
        builder.bodyJson(contentJson);
        ResponseConverter<SecretGroupDef> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretGroupDef>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Delete a secret group.
     * <p>
     * Deletes a secret group by specifying the ID of the secret group.
     * <p>
     * **Note:** To delete a secret group, it must be empty. If you need to remove a secret group that contains secrets,
     * you must first [delete the secrets](#delete-secret) that are associated with the group.
     *
     * @param deleteSecretGroupOptions the {@link DeleteSecretGroupOptions} containing the options for the call
     * @return a {@link ServiceCall} with a void result
     */
    public ServiceCall<Void> deleteSecretGroup(DeleteSecretGroupOptions deleteSecretGroupOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretGroupOptions,
                "deleteSecretGroupOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("id", deleteSecretGroupOptions.id());
        RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secret_groups/{id}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "deleteSecretGroup");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Create a secret.
     * <p>
     * Create a secret or import an existing value that you can use to access or authenticate to a protected resource.
     * <p>
     * Use this method to either generate or import an existing secret, such as an arbitrary value or a TLS certificate,
     * that you can manage in your Secrets Manager service instance. A successful request stores the secret in your
     * dedicated instance based on the secret type and data that you specify. The response returns the ID value of the
     * secret, along with other metadata.
     * <p>
     * To learn more about the types of secrets that you can create with Secrets Manager, check out the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-what-is-secret).
     *
     * @param createSecretOptions the {@link CreateSecretOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link CreateSecret}
     */
    public ServiceCall<CreateSecret> createSecret(CreateSecretOptions createSecretOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretOptions,
                "createSecretOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", createSecretOptions.secretType());
        RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "createSecret");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        final JsonObject contentJson = new JsonObject();
        contentJson.add("metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretOptions.metadata()));
        contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretOptions.resources()));
        builder.bodyJson(contentJson);
        ResponseConverter<CreateSecret> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateSecret>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * List secrets by type.
     * <p>
     * Retrieves a list of secrets based on the type that you specify.
     *
     * @param listSecretsOptions the {@link ListSecretsOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link ListSecrets}
     */
    public ServiceCall<ListSecrets> listSecrets(ListSecretsOptions listSecretsOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(listSecretsOptions,
                "listSecretsOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", listSecretsOptions.secretType());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "listSecrets");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        if (listSecretsOptions.limit() != null) {
            builder.query("limit", String.valueOf(listSecretsOptions.limit()));
        }
        if (listSecretsOptions.offset() != null) {
            builder.query("offset", String.valueOf(listSecretsOptions.offset()));
        }
        ResponseConverter<ListSecrets> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListSecrets>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * List all secrets.
     * <p>
     * Retrieves a list of all secrets in your Secrets Manager instance.
     *
     * @param listAllSecretsOptions the {@link ListAllSecretsOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link ListSecrets}
     */
    public ServiceCall<ListSecrets> listAllSecrets(ListAllSecretsOptions listAllSecretsOptions) {
        if (listAllSecretsOptions == null) {
            listAllSecretsOptions = new ListAllSecretsOptions.Builder().build();
        }
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets"));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "listAllSecrets");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        if (listAllSecretsOptions.limit() != null) {
            builder.query("limit", String.valueOf(listAllSecretsOptions.limit()));
        }
        if (listAllSecretsOptions.offset() != null) {
            builder.query("offset", String.valueOf(listAllSecretsOptions.offset()));
        }
        if (listAllSecretsOptions.search() != null) {
            builder.query("search", String.valueOf(listAllSecretsOptions.search()));
        }
        if (listAllSecretsOptions.sortBy() != null) {
            builder.query("sort_by", String.valueOf(listAllSecretsOptions.sortBy()));
        }
        if (listAllSecretsOptions.groups() != null) {
            builder.query("groups", RequestUtils.join(listAllSecretsOptions.groups(), ","));
        }
        ResponseConverter<ListSecrets> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListSecrets>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * List all secrets.
     * <p>
     * Retrieves a list of all secrets in your Secrets Manager instance.
     *
     * @return a {@link ServiceCall} with a result of type {@link ListSecrets}
     */
    public ServiceCall<ListSecrets> listAllSecrets() {
        return listAllSecrets(null);
    }

    /**
     * Get a secret.
     * <p>
     * Get a secret and its details by specifying the ID of the secret.
     * <p>
     * A successful request returns the secret data that is associated with your secret, along with other metadata. To
     * view only the details of a specified secret without retrieving its value, use the [Get secret
     * metadata](#get-secret-metadata) method.
     *
     * @param getSecretOptions the {@link GetSecretOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSecret}
     */
    public ServiceCall<GetSecret> getSecret(GetSecretOptions getSecretOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretOptions,
                "getSecretOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", getSecretOptions.secretType());
        pathParamsMap.put("id", getSecretOptions.id());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getSecret");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<GetSecret> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSecret>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Invoke an action on a secret.
     * <p>
     * Invokes an action on a specified secret. This method supports the following actions:
     * <p>
     * - `rotate`: Replace the value of a secret.
     * - `restore`: Restore a previous version of an `iam_credentials` secret.
     * - `revoke`: Revoke a private certificate.
     * - `delete_credentials`: Delete the API key that is associated with an `iam_credentials` secret.
     *
     * @param updateSecretOptions the {@link UpdateSecretOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSecret}
     */
    public ServiceCall<GetSecret> updateSecret(UpdateSecretOptions updateSecretOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(updateSecretOptions,
                "updateSecretOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", updateSecretOptions.secretType());
        pathParamsMap.put("id", updateSecretOptions.id());
        RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "updateSecret");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        builder.query("action", String.valueOf(updateSecretOptions.action()));
        if (updateSecretOptions.secretAction() != null) {
            builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateSecretOptions.secretAction()), "application/json");
        }
        ResponseConverter<GetSecret> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSecret>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Delete a secret.
     * <p>
     * Deletes a secret by specifying the ID of the secret.
     *
     * @param deleteSecretOptions the {@link DeleteSecretOptions} containing the options for the call
     * @return a {@link ServiceCall} with a void result
     */
    public ServiceCall<Void> deleteSecret(DeleteSecretOptions deleteSecretOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretOptions,
                "deleteSecretOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", deleteSecretOptions.secretType());
        pathParamsMap.put("id", deleteSecretOptions.id());
        RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "deleteSecret");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * List versions of a secret.
     * <p>
     * Retrieves a list of the versions of a secret.
     * <p>
     * A successful request returns the list of the versions along with the metadata of each version.
     *
     * @param listSecretVersionsOptions the {@link ListSecretVersionsOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link ListSecretVersions}
     */
    public ServiceCall<ListSecretVersions> listSecretVersions(ListSecretVersionsOptions listSecretVersionsOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(listSecretVersionsOptions,
                "listSecretVersionsOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", listSecretVersionsOptions.secretType());
        pathParamsMap.put("id", listSecretVersionsOptions.id());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}/versions", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "listSecretVersions");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<ListSecretVersions> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListSecretVersions>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Get a version of a secret.
     * <p>
     * Retrieves a version of a secret by specifying the ID of the version or the alias `previous`.
     * <p>
     * A successful request returns the secret data that is associated with the specified version of your secret, along
     * with other metadata.
     *
     * @param getSecretVersionOptions the {@link GetSecretVersionOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSecretVersion}
     */
    public ServiceCall<GetSecretVersion> getSecretVersion(GetSecretVersionOptions getSecretVersionOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretVersionOptions,
                "getSecretVersionOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", getSecretVersionOptions.secretType());
        pathParamsMap.put("id", getSecretVersionOptions.id());
        pathParamsMap.put("version_id", getSecretVersionOptions.versionId());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}/versions/{version_id}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getSecretVersion");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<GetSecretVersion> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSecretVersion>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Get secret version metadata.
     * <p>
     * Retrieves secret version metadata by specifying the ID of the version or the alias `previous`.
     * <p>
     * A successful request returns the metadata that is associated with the specified version of your secret.
     *
     * @param getSecretVersionMetadataOptions the {@link GetSecretVersionMetadataOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSecretVersionMetadata}
     */
    public ServiceCall<GetSecretVersionMetadata> getSecretVersionMetadata(GetSecretVersionMetadataOptions getSecretVersionMetadataOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretVersionMetadataOptions,
                "getSecretVersionMetadataOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", getSecretVersionMetadataOptions.secretType());
        pathParamsMap.put("id", getSecretVersionMetadataOptions.id());
        pathParamsMap.put("version_id", getSecretVersionMetadataOptions.versionId());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}/versions/{version_id}/metadata", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getSecretVersionMetadata");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<GetSecretVersionMetadata> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSecretVersionMetadata>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Get secret metadata.
     * <p>
     * Retrieves the details of a secret by specifying the ID.
     * <p>
     * A successful request returns only metadata about the secret, such as its name and creation date. To retrieve the
     * value of a secret, use the [Get a secret](#get-secret) or [Get a version of a secret](#get-secret-version) methods.
     *
     * @param getSecretMetadataOptions the {@link GetSecretMetadataOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link SecretMetadataRequest}
     */
    public ServiceCall<SecretMetadataRequest> getSecretMetadata(GetSecretMetadataOptions getSecretMetadataOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretMetadataOptions,
                "getSecretMetadataOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", getSecretMetadataOptions.secretType());
        pathParamsMap.put("id", getSecretMetadataOptions.id());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}/metadata", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getSecretMetadata");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<SecretMetadataRequest> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretMetadataRequest>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Update secret metadata.
     * <p>
     * Updates the metadata of a secret, such as its name or description.
     * <p>
     * To update the actual contents of a secret, rotate the secret by using the [Invoke an action on a
     * secret](#update-secret) method.
     *
     * @param updateSecretMetadataOptions the {@link UpdateSecretMetadataOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link SecretMetadataRequest}
     */
    public ServiceCall<SecretMetadataRequest> updateSecretMetadata(UpdateSecretMetadataOptions updateSecretMetadataOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(updateSecretMetadataOptions,
                "updateSecretMetadataOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", updateSecretMetadataOptions.secretType());
        pathParamsMap.put("id", updateSecretMetadataOptions.id());
        RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}/metadata", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "updateSecretMetadata");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        final JsonObject contentJson = new JsonObject();
        contentJson.add("metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSecretMetadataOptions.metadata()));
        contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSecretMetadataOptions.resources()));
        builder.bodyJson(contentJson);
        ResponseConverter<SecretMetadataRequest> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretMetadataRequest>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Set secret policies.
     * <p>
     * Creates or updates one or more policies, such as an [automatic rotation
     * policy](http://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-rotate-secrets#auto-rotate-secret), for the
     * specified secret.
     *
     * @param putPolicyOptions the {@link PutPolicyOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSecretPolicies}
     */
    public ServiceCall<GetSecretPolicies> putPolicy(PutPolicyOptions putPolicyOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(putPolicyOptions,
                "putPolicyOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", putPolicyOptions.secretType());
        pathParamsMap.put("id", putPolicyOptions.id());
        RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}/policies", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "putPolicy");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        if (putPolicyOptions.policy() != null) {
            builder.query("policy", String.valueOf(putPolicyOptions.policy()));
        }
        final JsonObject contentJson = new JsonObject();
        contentJson.add("metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putPolicyOptions.metadata()));
        contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putPolicyOptions.resources()));
        builder.bodyJson(contentJson);
        ResponseConverter<GetSecretPolicies> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSecretPolicies>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * List secret policies.
     * <p>
     * Retrieves a list of policies that are associated with a specified secret.
     *
     * @param getPolicyOptions the {@link GetPolicyOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSecretPolicies}
     */
    public ServiceCall<GetSecretPolicies> getPolicy(GetPolicyOptions getPolicyOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getPolicyOptions,
                "getPolicyOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", getPolicyOptions.secretType());
        pathParamsMap.put("id", getPolicyOptions.id());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/secrets/{secret_type}/{id}/policies", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getPolicy");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        if (getPolicyOptions.policy() != null) {
            builder.query("policy", String.valueOf(getPolicyOptions.policy()));
        }
        ResponseConverter<GetSecretPolicies> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSecretPolicies>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Set the configuration of a secret type.
     * <p>
     * Sets the configuration for the specified secret type.
     * <p>
     * Use this method to configure the IAM credentials (`iam_credentials`) engine for your service instance. Looking to
     * set up certificate ordering? To configure the public certificates (`public_cert`) engine, use the [Add a
     * configuration](#create_config_element) method.
     *
     * @param putConfigOptions the {@link PutConfigOptions} containing the options for the call
     * @return a {@link ServiceCall} with a void result
     */
    public ServiceCall<Void> putConfig(PutConfigOptions putConfigOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(putConfigOptions,
                "putConfigOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", putConfigOptions.secretType());
        RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/config/{secret_type}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "putConfig");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(putConfigOptions.engineConfig()), "application/json");
        ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Get the configuration of a secret type.
     * <p>
     * Retrieves the configuration that is associated with the specified secret type.
     *
     * @param getConfigOptions the {@link GetConfigOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetConfig}
     */
    public ServiceCall<GetConfig> getConfig(GetConfigOptions getConfigOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getConfigOptions,
                "getConfigOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", getConfigOptions.secretType());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/config/{secret_type}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getConfig");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<GetConfig> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetConfig>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Add a configuration.
     * <p>
     * Adds a configuration element to the specified secret type.
     * <p>
     * Use this method to define the configurations that are required to enable the public certificates (`public_cert`)
     * engine. You can add up to 10 certificate authority and DNS provider configurations for your instance.
     *
     * @param createConfigElementOptions the {@link CreateConfigElementOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSingleConfigElement}
     */
    public ServiceCall<GetSingleConfigElement> createConfigElement(CreateConfigElementOptions createConfigElementOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(createConfigElementOptions,
                "createConfigElementOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", createConfigElementOptions.secretType());
        pathParamsMap.put("config_element", createConfigElementOptions.configElement());
        RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/config/{secret_type}/{config_element}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "createConfigElement");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        final JsonObject contentJson = new JsonObject();
        contentJson.addProperty("name", createConfigElementOptions.name());
        contentJson.addProperty("type", createConfigElementOptions.type());
        contentJson.add("config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createConfigElementOptions.config()));
        builder.bodyJson(contentJson);
        ResponseConverter<GetSingleConfigElement> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSingleConfigElement>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * List configurations.
     * <p>
     * Lists the configuration elements that are associated with a specified secret type.
     *
     * @param getConfigElementsOptions the {@link GetConfigElementsOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetConfigElements}
     */
    public ServiceCall<GetConfigElements> getConfigElements(GetConfigElementsOptions getConfigElementsOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getConfigElementsOptions,
                "getConfigElementsOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("secret_type", getConfigElementsOptions.secretType());
        pathParamsMap.put("config_element", getConfigElementsOptions.configElement());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/config/{secret_type}/{config_element}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getConfigElements");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<GetConfigElements> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetConfigElements>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Get a configuration.
     * <p>
     * Retrieves the details of a specific configuration that is associated with a secret type.
     *
     * @param getConfigElementOptions the {@link GetConfigElementOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSingleConfigElement}
     */
    public ServiceCall<GetSingleConfigElement> getConfigElement(GetConfigElementOptions getConfigElementOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(getConfigElementOptions,
                "getConfigElementOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("config_name", getConfigElementOptions.configName());
        pathParamsMap.put("secret_type", getConfigElementOptions.secretType());
        pathParamsMap.put("config_element", getConfigElementOptions.configElement());
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/config/{secret_type}/{config_element}/{config_name}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getConfigElement");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<GetSingleConfigElement> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSingleConfigElement>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Update a configuration.
     * <p>
     * Updates a configuration element that is associated with the specified secret type.
     *
     * @param updateConfigElementOptions the {@link UpdateConfigElementOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetSingleConfigElement}
     */
    public ServiceCall<GetSingleConfigElement> updateConfigElement(UpdateConfigElementOptions updateConfigElementOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(updateConfigElementOptions,
                "updateConfigElementOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("config_name", updateConfigElementOptions.configName());
        pathParamsMap.put("secret_type", updateConfigElementOptions.secretType());
        pathParamsMap.put("config_element", updateConfigElementOptions.configElement());
        RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/config/{secret_type}/{config_element}/{config_name}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "updateConfigElement");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        final JsonObject contentJson = new JsonObject();
        contentJson.addProperty("type", updateConfigElementOptions.type());
        contentJson.add("config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateConfigElementOptions.config()));
        builder.bodyJson(contentJson);
        ResponseConverter<GetSingleConfigElement> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSingleConfigElement>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Delete a configuration.
     * <p>
     * Deletes a configuration element from the specified secret type.
     *
     * @param deleteConfigElementOptions the {@link DeleteConfigElementOptions} containing the options for the call
     * @return a {@link ServiceCall} with a void result
     */
    public ServiceCall<Void> deleteConfigElement(DeleteConfigElementOptions deleteConfigElementOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(deleteConfigElementOptions,
                "deleteConfigElementOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("config_name", deleteConfigElementOptions.configName());
        pathParamsMap.put("secret_type", deleteConfigElementOptions.secretType());
        pathParamsMap.put("config_element", deleteConfigElementOptions.configElement());
        RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/config/{secret_type}/{config_element}/{config_name}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "deleteConfigElement");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Register with Event Notifications.
     * <p>
     * Creates a registration between a Secrets Manager instance and [Event
     * Notifications](https://cloud.ibm.com/apidocs/event-notifications).
     * <p>
     * A successful request adds Secrets Manager as a source that you can reference from your Event Notifications
     * instance. For more information about enabling notifications for Secrets Manager, check out the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-event-notifications).
     *
     * @param createNotificationsRegistrationOptions the {@link CreateNotificationsRegistrationOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetNotificationsSettings}
     */
    public ServiceCall<GetNotificationsSettings> createNotificationsRegistration(CreateNotificationsRegistrationOptions createNotificationsRegistrationOptions) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(createNotificationsRegistrationOptions,
                "createNotificationsRegistrationOptions cannot be null");
        RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/notifications/registration"));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "createNotificationsRegistration");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        final JsonObject contentJson = new JsonObject();
        contentJson.addProperty("event_notifications_instance_crn", createNotificationsRegistrationOptions.eventNotificationsInstanceCrn());
        contentJson.addProperty("event_notifications_source_name", createNotificationsRegistrationOptions.eventNotificationsSourceName());
        if (createNotificationsRegistrationOptions.eventNotificationsSourceDescription() != null) {
            contentJson.addProperty("event_notifications_source_description", createNotificationsRegistrationOptions.eventNotificationsSourceDescription());
        }
        builder.bodyJson(contentJson);
        ResponseConverter<GetNotificationsSettings> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetNotificationsSettings>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Get Event Notifications registration details.
     * <p>
     * Retrieves the details of an existing registration between a Secrets Manager instance and Event Notifications.
     *
     * @param getNotificationsRegistrationOptions the {@link GetNotificationsRegistrationOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link GetNotificationsSettings}
     */
    public ServiceCall<GetNotificationsSettings> getNotificationsRegistration(GetNotificationsRegistrationOptions getNotificationsRegistrationOptions) {
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/notifications/registration"));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "getNotificationsRegistration");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<GetNotificationsSettings> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetNotificationsSettings>() {
                }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Get Event Notifications registration details.
     * <p>
     * Retrieves the details of an existing registration between a Secrets Manager instance and Event Notifications.
     *
     * @return a {@link ServiceCall} with a result of type {@link GetNotificationsSettings}
     */
    public ServiceCall<GetNotificationsSettings> getNotificationsRegistration() {
        return getNotificationsRegistration(null);
    }

    /**
     * Unregister from Event Notifications.
     * <p>
     * Deletes a registration between a Secrets Manager instance and Event Notifications.
     * <p>
     * A successful request removes your Secrets Manager instance as a source in Event Notifications.
     *
     * @param deleteNotificationsRegistrationOptions the {@link DeleteNotificationsRegistrationOptions} containing the options for the call
     * @return a {@link ServiceCall} with a void result
     */
    public ServiceCall<Void> deleteNotificationsRegistration(DeleteNotificationsRegistrationOptions deleteNotificationsRegistrationOptions) {
        RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/notifications/registration"));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "deleteNotificationsRegistration");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Unregister from Event Notifications.
     * <p>
     * Deletes a registration between a Secrets Manager instance and Event Notifications.
     * <p>
     * A successful request removes your Secrets Manager instance as a source in Event Notifications.
     *
     * @return a {@link ServiceCall} with a void result
     */
    public ServiceCall<Void> deleteNotificationsRegistration() {
        return deleteNotificationsRegistration(null);
    }

    /**
     * Send test event.
     * <p>
     * Send a test event from a Secrets Manager instance to a configured [Event
     * Notifications](https://cloud.ibm.com/apidocs/event-notifications) instance.
     * <p>
     * A successful request sends a test event to the Event Notifications instance. For more information about enabling
     * notifications for Secrets Manager, check out the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-event-notifications).
     *
     * @param sendTestNotificationOptions the {@link SendTestNotificationOptions} containing the options for the call
     * @return a {@link ServiceCall} with a void result
     */
    public ServiceCall<Void> sendTestNotification(SendTestNotificationOptions sendTestNotificationOptions) {
        RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/notifications/test"));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v1", "sendTestNotification");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
        return createServiceCall(builder.build(), responseConverter);
    }

    /**
     * Send test event.
     * <p>
     * Send a test event from a Secrets Manager instance to a configured [Event
     * Notifications](https://cloud.ibm.com/apidocs/event-notifications) instance.
     * <p>
     * A successful request sends a test event to the Event Notifications instance. For more information about enabling
     * notifications for Secrets Manager, check out the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-event-notifications).
     *
     * @return a {@link ServiceCall} with a void result
     */
    public ServiceCall<Void> sendTestNotification() {
        return sendTestNotification(null);
    }

}
