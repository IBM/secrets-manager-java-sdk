/*
 * (C) Copyright IBM Corp. 2025.
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
 * IBM OpenAPI SDK Code Generator Version: 3.107.0-b68ebf7a-20250811-145645
 */

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2;

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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.Configuration;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ConfigurationMetadataPaginatedCollection;
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretTaskOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretVersionDataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretVersionLocksBulkOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetNotificationsRegistrationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetNotificationsRegistrationTestOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretByNameTypeOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretTaskOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.GetSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListConfigurationsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretGroupsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretTasksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretVersionLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretVersionsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretsLocksOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListSecretsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.NotificationsRegistration;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ReplaceSecretTaskOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.Secret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroup;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroupCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLocks;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretLocksPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretMetadataPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretTask;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretTaskCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionLocksPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadataCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretsLocksPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretGroupOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UpdateSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.VersionAction;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * With IBM Cloud® Secrets Manager, you can create, lease, and centrally manage secrets that are used in IBM Cloud
 * services or your custom-built applications.
 *
 * API Version: 2.0.0
 * See: https://cloud.ibm.com/docs/secrets-manager
 */
public class SecretsManager extends BaseService {

  /**
   * Default service name used when configuring the `SecretsManager` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "secrets_manager";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://provide-here-your-smgr-instanceuuid.us-south.secrets-manager.appdomain.cloud";

  /**
   * The parameterized service endpoint URL.
   */
  public static final String PARAMETERIZED_SERVICE_URL = "https://{instance_id}.{region}.secrets-manager.appdomain.cloud";

  private static final Map<String, String> defaultUrlVariables = createDefaultUrlVariables();

  private static Map<String, String> createDefaultUrlVariables() {
    Map<String, String> map = new HashMap<>();
    map.put("instance_id", "provide-here-your-smgr-instanceuuid");
    map.put("region", "us-south");
    return map;
  }

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
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public SecretsManager(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Constructs a service URL by formatting the parameterized service URL.
   *
   * The parameterized service URL is:
   * 'https://{instance_id}.{region}.secrets-manager.appdomain.cloud'
   *
   * The default variable values are:
   * - 'instance_id': 'provide-here-your-smgr-instanceuuid'
   * - 'region': 'us-south'
   *
   * @param providedUrlVariables map from variable names to desired values.
   *   If a variable is not provided in this map,
   *   the default variable value will be used instead.
   * @return the formatted URL with all variable placeholders replaced by values.
   */
  public static String constructServiceUrl(Map<String, String> providedUrlVariables) {
    return BaseService.constructServiceUrl(PARAMETERIZED_SERVICE_URL, defaultUrlVariables, providedUrlVariables);
  }

  /**
   * Create a new secret group.
   *
   * Create a secret group that you can use to organize secrets and control who can access them.
   *
   * A successful request returns the ID value of the secret group, along with other properties. To learn more about
   * secret groups, check out the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-secret-groups).
   *
   * @param createSecretGroupOptions the {@link CreateSecretGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretGroup}
   */
  public ServiceCall<SecretGroup> createSecretGroup(CreateSecretGroupOptions createSecretGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretGroupOptions,
      "createSecretGroupOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secret_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createSecretGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createSecretGroupOptions.name());
    if (createSecretGroupOptions.description() != null) {
      contentJson.addProperty("description", createSecretGroupOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SecretGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secret groups.
   *
   * List the secret groups that are available in your Secrets Manager instance.
   *
   * @param listSecretGroupsOptions the {@link ListSecretGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretGroupCollection}
   */
  public ServiceCall<SecretGroupCollection> listSecretGroups(ListSecretGroupsOptions listSecretGroupsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secret_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "listSecretGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecretGroupCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretGroupCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secret groups.
   *
   * List the secret groups that are available in your Secrets Manager instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecretGroupCollection}
   */
  public ServiceCall<SecretGroupCollection> listSecretGroups() {
    return listSecretGroups(null);
  }

  /**
   * Get a secret group.
   *
   * Get the properties of an existing secret group by specifying the ID of the group.
   *
   * @param getSecretGroupOptions the {@link GetSecretGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretGroup}
   */
  public ServiceCall<SecretGroup> getSecretGroup(GetSecretGroupOptions getSecretGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretGroupOptions,
      "getSecretGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSecretGroupOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secret_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getSecretGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecretGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a secret group.
   *
   * Update the properties of an existing secret group, such as its name or description.
   *
   * @param updateSecretGroupOptions the {@link UpdateSecretGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretGroup}
   */
  public ServiceCall<SecretGroup> updateSecretGroup(UpdateSecretGroupOptions updateSecretGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSecretGroupOptions,
      "updateSecretGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSecretGroupOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secret_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "updateSecretGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSecretGroupOptions.secretGroupPatch()), "application/merge-patch+json");
    ResponseConverter<SecretGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a secret group.
   *
   * Delete a secret group by specifying the ID of the secret group.
   *
   * **Note:** To delete a secret group, it must be empty. If you need to remove a secret group that contains secrets,
   * you must first delete the secrets that are associated with the group.
   *
   * @param deleteSecretGroupOptions the {@link DeleteSecretGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSecretGroup(DeleteSecretGroupOptions deleteSecretGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretGroupOptions,
      "deleteSecretGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSecretGroupOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secret_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "deleteSecretGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new secret.
   *
   * Create a secret or import an existing value that you can use to access or authenticate to a protected resource.
   *
   * Use this operation to either generate or import an existing secret, such as a TLS certificate, that you can manage
   * in your Secrets Manager service instance. A successful request stores the secret in your dedicated instance, based
   * on the secret type and data that you specify. The response returns the ID value of the secret, along with other
   * metadata.
   *
   * To learn more about the types of secrets that you can create with Secrets Manager, check out the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-what-is-secret).
   *
   * @param createSecretOptions the {@link CreateSecretOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Secret}
   */
  public ServiceCall<Secret> createSecret(CreateSecretOptions createSecretOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretOptions,
      "createSecretOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createSecret");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createSecretOptions.secretPrototype()), "application/json");
    ResponseConverter<Secret> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Secret>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secrets.
   *
   * List the secrets that are available in your Secrets Manager instance.
   *
   * @param listSecretsOptions the {@link ListSecretsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretMetadataPaginatedCollection}
   */
  public ServiceCall<SecretMetadataPaginatedCollection> listSecrets(ListSecretsOptions listSecretsOptions) {
    if (listSecretsOptions == null) {
      listSecretsOptions = new ListSecretsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "listSecrets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSecretsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listSecretsOptions.offset()));
    }
    if (listSecretsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSecretsOptions.limit()));
    }
    if (listSecretsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listSecretsOptions.sort()));
    }
    if (listSecretsOptions.search() != null) {
      builder.query("search", String.valueOf(listSecretsOptions.search()));
    }
    if (listSecretsOptions.groups() != null) {
      builder.query("groups", RequestUtils.join(listSecretsOptions.groups(), ","));
    }
    if (listSecretsOptions.secretTypes() != null) {
      builder.query("secret_types", RequestUtils.join(listSecretsOptions.secretTypes(), ","));
    }
    if (listSecretsOptions.matchAllLabels() != null) {
      builder.query("match_all_labels", RequestUtils.join(listSecretsOptions.matchAllLabels(), ","));
    }
    ResponseConverter<SecretMetadataPaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretMetadataPaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secrets.
   *
   * List the secrets that are available in your Secrets Manager instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecretMetadataPaginatedCollection}
   */
  public ServiceCall<SecretMetadataPaginatedCollection> listSecrets() {
    return listSecrets(null);
  }

  /**
   * Get a secret.
   *
   * Get a secret and its details by specifying the ID of the secret.
   *
   * A successful request returns the secret data that is associated with your secret, along with other metadata. To
   * view only the details of a specified secret without retrieving its value, use the Get secret metadata operation.
   *
   * @param getSecretOptions the {@link GetSecretOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Secret}
   */
  public ServiceCall<Secret> getSecret(GetSecretOptions getSecretOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretOptions,
      "getSecretOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSecretOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getSecret");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Secret> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Secret>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a secret.
   *
   * Delete a secret by specifying the ID of the secret.
   *
   * @param deleteSecretOptions the {@link DeleteSecretOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSecret(DeleteSecretOptions deleteSecretOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretOptions,
      "deleteSecretOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSecretOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "deleteSecret");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSecretOptions.forceDelete() != null) {
      builder.query("force_delete", String.valueOf(deleteSecretOptions.forceDelete()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the metadata of a secret.
   *
   * Get the metadata of a secret by specifying the ID of the secret.
   *
   * @param getSecretMetadataOptions the {@link GetSecretMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretMetadata}
   */
  public ServiceCall<SecretMetadata> getSecretMetadata(GetSecretMetadataOptions getSecretMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretMetadataOptions,
      "getSecretMetadataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSecretMetadataOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{id}/metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getSecretMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecretMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the metadata of a secret.
   *
   * Update the metadata of a secret, such as its name or description.
   *
   * @param updateSecretMetadataOptions the {@link UpdateSecretMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretMetadata}
   */
  public ServiceCall<SecretMetadata> updateSecretMetadata(UpdateSecretMetadataOptions updateSecretMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSecretMetadataOptions,
      "updateSecretMetadataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSecretMetadataOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{id}/metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "updateSecretMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSecretMetadataOptions.secretMetadataPatch()), "application/merge-patch+json");
    ResponseConverter<SecretMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a secret action.
   *
   * Create a secret action. This operation supports the following actions:.
   *
   * @param createSecretActionOptions the {@link CreateSecretActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretAction}
   */
  public ServiceCall<SecretAction> createSecretAction(CreateSecretActionOptions createSecretActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretActionOptions,
      "createSecretActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createSecretActionOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createSecretAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createSecretActionOptions.secretActionPrototype()), "application/json");
    ResponseConverter<SecretAction> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretAction>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a secret by name.
   *
   * Get a secret and its details by specifying the Name and Type of the secret.
   *
   * A successful request returns the secret data that is associated with your secret, along with other metadata. To
   * view only the details of a specified secret without retrieving its value, use the Get secret metadata operation.
   *
   * @param getSecretByNameTypeOptions the {@link GetSecretByNameTypeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Secret}
   */
  public ServiceCall<Secret> getSecretByNameType(GetSecretByNameTypeOptions getSecretByNameTypeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretByNameTypeOptions,
      "getSecretByNameTypeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_type", getSecretByNameTypeOptions.secretType());
    pathParamsMap.put("name", getSecretByNameTypeOptions.name());
    pathParamsMap.put("secret_group_name", getSecretByNameTypeOptions.secretGroupName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secret_groups/{secret_group_name}/secret_types/{secret_type}/secrets/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getSecretByNameType");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Secret> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Secret>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new secret version.
   *
   * Create a new secret version.
   *
   * @param createSecretVersionOptions the {@link CreateSecretVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretVersion}
   */
  public ServiceCall<SecretVersion> createSecretVersion(CreateSecretVersionOptions createSecretVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretVersionOptions,
      "createSecretVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", createSecretVersionOptions.secretId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createSecretVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createSecretVersionOptions.secretVersionPrototype()), "application/json");
    ResponseConverter<SecretVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List versions of a secret.
   *
   * List the versions of a secret.
   *
   * A successful request returns the list of versions of a secret, along with the metadata of each version.
   *
   * @param listSecretVersionsOptions the {@link ListSecretVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretVersionMetadataCollection}
   */
  public ServiceCall<SecretVersionMetadataCollection> listSecretVersions(ListSecretVersionsOptions listSecretVersionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSecretVersionsOptions,
      "listSecretVersionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", listSecretVersionsOptions.secretId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "listSecretVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecretVersionMetadataCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretVersionMetadataCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a version of a secret.
   *
   * Get a version of a secret by specifying the ID of the version. You can use the `current` or `previous` aliases to
   * refer to the current or previous secret version.
   *
   * A successful request returns the secret data that is associated with the specified version of your secret, along
   * with other metadata.
   *
   * @param getSecretVersionOptions the {@link GetSecretVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretVersion}
   */
  public ServiceCall<SecretVersion> getSecretVersion(GetSecretVersionOptions getSecretVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretVersionOptions,
      "getSecretVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", getSecretVersionOptions.secretId());
    pathParamsMap.put("id", getSecretVersionOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getSecretVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecretVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the data of a secret version.
   *
   * Delete the data of a secret version by specifying its version ID.
   *
   * This operation is available for the following secret types:
   *
   * `iam_credentials`: current version only
   *
   * `custom_credentials`: both current and previous versions.
   *
   * @param deleteSecretVersionDataOptions the {@link DeleteSecretVersionDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSecretVersionData(DeleteSecretVersionDataOptions deleteSecretVersionDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretVersionDataOptions,
      "deleteSecretVersionDataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", deleteSecretVersionDataOptions.secretId());
    pathParamsMap.put("id", deleteSecretVersionDataOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions/{id}/secret_data", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "deleteSecretVersionData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the metadata of a secret version.
   *
   * Get the metadata of a secret version by specifying the ID of the version. You can use the `current` or `previous`
   * aliases to refer to the current or previous secret version.
   *
   * A successful request returns the metadata that is associated with the specified version of your secret.
   *
   * @param getSecretVersionMetadataOptions the {@link GetSecretVersionMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretVersionMetadata}
   */
  public ServiceCall<SecretVersionMetadata> getSecretVersionMetadata(GetSecretVersionMetadataOptions getSecretVersionMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretVersionMetadataOptions,
      "getSecretVersionMetadataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", getSecretVersionMetadataOptions.secretId());
    pathParamsMap.put("id", getSecretVersionMetadataOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions/{id}/metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getSecretVersionMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecretVersionMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretVersionMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the metadata of a secret version.
   *
   * Update the custom metadata of a secret version.
   *
   * @param updateSecretVersionMetadataOptions the {@link UpdateSecretVersionMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretVersionMetadata}
   */
  public ServiceCall<SecretVersionMetadata> updateSecretVersionMetadata(UpdateSecretVersionMetadataOptions updateSecretVersionMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSecretVersionMetadataOptions,
      "updateSecretVersionMetadataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", updateSecretVersionMetadataOptions.secretId());
    pathParamsMap.put("id", updateSecretVersionMetadataOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions/{id}/metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "updateSecretVersionMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSecretVersionMetadataOptions.secretVersionMetadataPatch()), "application/merge-patch+json");
    ResponseConverter<SecretVersionMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretVersionMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a version action.
   *
   * Create a secret version action. This operation supports the following actions:
   *
   * - `private_cert_action_revoke_certificate`: Revoke a version of a private certificate.
   *
   * @param createSecretVersionActionOptions the {@link CreateSecretVersionActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VersionAction}
   */
  public ServiceCall<VersionAction> createSecretVersionAction(CreateSecretVersionActionOptions createSecretVersionActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretVersionActionOptions,
      "createSecretVersionActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", createSecretVersionActionOptions.secretId());
    pathParamsMap.put("id", createSecretVersionActionOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions/{id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createSecretVersionAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createSecretVersionActionOptions.secretVersionActionPrototype()), "application/json");
    ResponseConverter<VersionAction> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VersionAction>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secret tasks.
   *
   * List secret tasks.
   *
   * Supported secret types: `custom_credentials`.
   *
   * @param listSecretTasksOptions the {@link ListSecretTasksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretTaskCollection}
   */
  public ServiceCall<SecretTaskCollection> listSecretTasks(ListSecretTasksOptions listSecretTasksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSecretTasksOptions,
      "listSecretTasksOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", listSecretTasksOptions.secretId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/tasks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "listSecretTasks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecretTaskCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretTaskCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a secret's task.
   *
   * Get a task of a secret and its details by specifying the ID of the task.
   *
   * A successful request returns the task that is associated with your secret.
   *
   * Supported secret types: `custom_credentials`.
   *
   * @param getSecretTaskOptions the {@link GetSecretTaskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretTask}
   */
  public ServiceCall<SecretTask> getSecretTask(GetSecretTaskOptions getSecretTaskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretTaskOptions,
      "getSecretTaskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", getSecretTaskOptions.secretId());
    pathParamsMap.put("id", getSecretTaskOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/tasks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getSecretTask");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecretTask> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretTask>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a secret's task.
   *
   * A callback endpoint for updating a task with results.
   *
   * Supported secret types: `custom_credentials`.
   *
   * @param replaceSecretTaskOptions the {@link ReplaceSecretTaskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretTask}
   */
  public ServiceCall<SecretTask> replaceSecretTask(ReplaceSecretTaskOptions replaceSecretTaskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSecretTaskOptions,
      "replaceSecretTaskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", replaceSecretTaskOptions.secretId());
    pathParamsMap.put("id", replaceSecretTaskOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/tasks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "replaceSecretTask");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceSecretTaskOptions.taskPut()), "application/json");
    ResponseConverter<SecretTask> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretTask>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a task.
   *
   * Delete a task by specifying the ID of the secret.
   *
   * Supported secret types: `custom_credentials`.
   *
   * @param deleteSecretTaskOptions the {@link DeleteSecretTaskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSecretTask(DeleteSecretTaskOptions deleteSecretTaskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretTaskOptions,
      "deleteSecretTaskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", deleteSecretTaskOptions.secretId());
    pathParamsMap.put("id", deleteSecretTaskOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/tasks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "deleteSecretTask");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secrets and their locks.
   *
   * List the secrets and their locks in your Secrets Manager instance.
   *
   * @param listSecretsLocksOptions the {@link ListSecretsLocksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretsLocksPaginatedCollection}
   */
  public ServiceCall<SecretsLocksPaginatedCollection> listSecretsLocks(ListSecretsLocksOptions listSecretsLocksOptions) {
    if (listSecretsLocksOptions == null) {
      listSecretsLocksOptions = new ListSecretsLocksOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets_locks"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "listSecretsLocks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSecretsLocksOptions.offset() != null) {
      builder.query("offset", String.valueOf(listSecretsLocksOptions.offset()));
    }
    if (listSecretsLocksOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSecretsLocksOptions.limit()));
    }
    if (listSecretsLocksOptions.search() != null) {
      builder.query("search", String.valueOf(listSecretsLocksOptions.search()));
    }
    if (listSecretsLocksOptions.groups() != null) {
      builder.query("groups", RequestUtils.join(listSecretsLocksOptions.groups(), ","));
    }
    ResponseConverter<SecretsLocksPaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretsLocksPaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secrets and their locks.
   *
   * List the secrets and their locks in your Secrets Manager instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecretsLocksPaginatedCollection}
   */
  public ServiceCall<SecretsLocksPaginatedCollection> listSecretsLocks() {
    return listSecretsLocks(null);
  }

  /**
   * List secret locks.
   *
   * List the locks that are associated with a specified secret.
   *
   * @param listSecretLocksOptions the {@link ListSecretLocksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretLocksPaginatedCollection}
   */
  public ServiceCall<SecretLocksPaginatedCollection> listSecretLocks(ListSecretLocksOptions listSecretLocksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSecretLocksOptions,
      "listSecretLocksOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listSecretLocksOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{id}/locks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "listSecretLocks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSecretLocksOptions.offset() != null) {
      builder.query("offset", String.valueOf(listSecretLocksOptions.offset()));
    }
    if (listSecretLocksOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSecretLocksOptions.limit()));
    }
    if (listSecretLocksOptions.sort() != null) {
      builder.query("sort", String.valueOf(listSecretLocksOptions.sort()));
    }
    if (listSecretLocksOptions.search() != null) {
      builder.query("search", String.valueOf(listSecretLocksOptions.search()));
    }
    ResponseConverter<SecretLocksPaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretLocksPaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create secret locks.
   *
   * Create a lock on the current version of a secret.
   *
   * A lock can be used to prevent a secret from being deleted or modified while it's in use by your applications. A
   * successful request attaches a new lock to your secret, or replaces a lock of the same name if it already exists.
   * Additionally, you can use this operation to clear any matching locks on a secret by using one of the following
   * optional lock modes:
   *
   * - `remove_previous`: Removes any other locks with matching names if they are found in the previous version of the
   * secret.\n
   * - `remove_previous_and_delete`: Carries out the same function as `remove_previous`, but also permanently deletes
   * the data of the previous secret version if it doesn't have any locks.
   *
   * @param createSecretLocksBulkOptions the {@link CreateSecretLocksBulkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretLocks}
   */
  public ServiceCall<SecretLocks> createSecretLocksBulk(CreateSecretLocksBulkOptions createSecretLocksBulkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretLocksBulkOptions,
      "createSecretLocksBulkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createSecretLocksBulkOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{id}/locks_bulk", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createSecretLocksBulk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSecretLocksBulkOptions.mode() != null) {
      builder.query("mode", String.valueOf(createSecretLocksBulkOptions.mode()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("locks", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretLocksBulkOptions.locks()));
    builder.bodyJson(contentJson);
    ResponseConverter<SecretLocks> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretLocks>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete secret locks.
   *
   * Delete all the locks or a subset of the locks that are associated with a version of a secret.
   *
   * To delete only a subset of the locks, add a query param with a comma to separate the list of lock names:
   *
   * Example: `?name=lock-example-1,lock-example-2`.
   *
   * **Note:** A secret is considered unlocked and able to be deleted only after you remove all of its locks. To
   * determine whether a secret contains locks, check the `locks_total` field that is returned as part of the metadata
   * of your secret.
   *
   * @param deleteSecretLocksBulkOptions the {@link DeleteSecretLocksBulkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretLocks}
   */
  public ServiceCall<SecretLocks> deleteSecretLocksBulk(DeleteSecretLocksBulkOptions deleteSecretLocksBulkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretLocksBulkOptions,
      "deleteSecretLocksBulkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSecretLocksBulkOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{id}/locks_bulk", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "deleteSecretLocksBulk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteSecretLocksBulkOptions.name() != null) {
      builder.query("name", RequestUtils.join(deleteSecretLocksBulkOptions.name(), ","));
    }
    ResponseConverter<SecretLocks> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretLocks>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secret version locks.
   *
   * List the locks that are associated with a specified secret version.
   *
   * @param listSecretVersionLocksOptions the {@link ListSecretVersionLocksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretVersionLocksPaginatedCollection}
   */
  public ServiceCall<SecretVersionLocksPaginatedCollection> listSecretVersionLocks(ListSecretVersionLocksOptions listSecretVersionLocksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSecretVersionLocksOptions,
      "listSecretVersionLocksOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", listSecretVersionLocksOptions.secretId());
    pathParamsMap.put("id", listSecretVersionLocksOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions/{id}/locks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "listSecretVersionLocks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSecretVersionLocksOptions.offset() != null) {
      builder.query("offset", String.valueOf(listSecretVersionLocksOptions.offset()));
    }
    if (listSecretVersionLocksOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSecretVersionLocksOptions.limit()));
    }
    if (listSecretVersionLocksOptions.sort() != null) {
      builder.query("sort", String.valueOf(listSecretVersionLocksOptions.sort()));
    }
    if (listSecretVersionLocksOptions.search() != null) {
      builder.query("search", String.valueOf(listSecretVersionLocksOptions.search()));
    }
    ResponseConverter<SecretVersionLocksPaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretVersionLocksPaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create secret version locks.
   *
   * Create a lock on the specified version of a secret.
   *
   * A lock can be used to prevent a secret from being deleted or modified while it's in use by your applications. A
   * successful request attaches a new lock to your secret, or replaces a lock of the same name if it already exists.
   * Additionally, you can use this operation to clear any matching locks on a secret by using one of the following
   * optional lock modes:
   *
   * - `remove_previous`: Removes any other locks with matching names if they are found in the previous version of the
   * secret.
   * - `remove_previous_and_delete`: Carries out the same function as `remove_previous`, but also permanently deletes
   * the data of the previous secret version if it doesn't have any locks.
   *
   * @param createSecretVersionLocksBulkOptions the {@link CreateSecretVersionLocksBulkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretLocks}
   */
  public ServiceCall<SecretLocks> createSecretVersionLocksBulk(CreateSecretVersionLocksBulkOptions createSecretVersionLocksBulkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretVersionLocksBulkOptions,
      "createSecretVersionLocksBulkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", createSecretVersionLocksBulkOptions.secretId());
    pathParamsMap.put("id", createSecretVersionLocksBulkOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions/{id}/locks_bulk", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createSecretVersionLocksBulk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSecretVersionLocksBulkOptions.mode() != null) {
      builder.query("mode", String.valueOf(createSecretVersionLocksBulkOptions.mode()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("locks", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretVersionLocksBulkOptions.locks()));
    builder.bodyJson(contentJson);
    ResponseConverter<SecretLocks> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretLocks>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete locks on a secret version.
   *
   * Delete all the locks or a subset of the locks that are associated with the specified version of a secret.
   *
   * To delete only a subset of the locks, add a query param with a comma to separate the list of lock names:
   *
   * Example: `?name=lock-example-1,lock-example-2`.
   *
   * **Note:** A secret is considered unlocked and able to be deleted only after all of its locks are removed. To
   * determine whether a secret contains locks, check the `locks_total` field that is returned as part of the metadata
   * of your secret.
   *
   * @param deleteSecretVersionLocksBulkOptions the {@link DeleteSecretVersionLocksBulkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretLocks}
   */
  public ServiceCall<SecretLocks> deleteSecretVersionLocksBulk(DeleteSecretVersionLocksBulkOptions deleteSecretVersionLocksBulkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretVersionLocksBulkOptions,
      "deleteSecretVersionLocksBulkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("secret_id", deleteSecretVersionLocksBulkOptions.secretId());
    pathParamsMap.put("id", deleteSecretVersionLocksBulkOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/secrets/{secret_id}/versions/{id}/locks_bulk", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "deleteSecretVersionLocksBulk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteSecretVersionLocksBulkOptions.name() != null) {
      builder.query("name", RequestUtils.join(deleteSecretVersionLocksBulkOptions.name(), ","));
    }
    ResponseConverter<SecretLocks> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretLocks>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new configuration.
   *
   * Add a configuration to the specified secret type.
   *
   * Use this operation to define the configurations that are required to create public certificates (`public_cert`),
   * private certificates (`private_cert`), IAM credentials secrets (`iam_credentials`) and custom credentials secrets
   * (`custom_credentials`).
   *
   * You can add multiple configurations for your instance as follows:
   *
   * - A single configuration for IAM credentials.
   * - Up to 10 CA configurations for public certificates.
   * - Up to 10 DNS configurations for public certificates.
   * - Up to 10 Root CA configurations for private certificates.
   * - Up to 10 Intermediate CA configurations for private certificates.
   * - Up to 10 Certificate Template configurations for private certificates.
   *
   * @param createConfigurationOptions the {@link CreateConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Configuration}
   */
  public ServiceCall<Configuration> createConfiguration(CreateConfigurationOptions createConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createConfigurationOptions,
      "createConfigurationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/configurations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createConfigurationOptions.configurationPrototype()), "application/json");
    ResponseConverter<Configuration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Configuration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List configurations.
   *
   * List the configurations that are available in your Secrets Manager instance.
   *
   * @param listConfigurationsOptions the {@link ListConfigurationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadataPaginatedCollection}
   */
  public ServiceCall<ConfigurationMetadataPaginatedCollection> listConfigurations(ListConfigurationsOptions listConfigurationsOptions) {
    if (listConfigurationsOptions == null) {
      listConfigurationsOptions = new ListConfigurationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/configurations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "listConfigurations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listConfigurationsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listConfigurationsOptions.offset()));
    }
    if (listConfigurationsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listConfigurationsOptions.limit()));
    }
    if (listConfigurationsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listConfigurationsOptions.sort()));
    }
    if (listConfigurationsOptions.search() != null) {
      builder.query("search", String.valueOf(listConfigurationsOptions.search()));
    }
    if (listConfigurationsOptions.secretTypes() != null) {
      builder.query("secret_types", RequestUtils.join(listConfigurationsOptions.secretTypes(), ","));
    }
    ResponseConverter<ConfigurationMetadataPaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationMetadataPaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List configurations.
   *
   * List the configurations that are available in your Secrets Manager instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadataPaginatedCollection}
   */
  public ServiceCall<ConfigurationMetadataPaginatedCollection> listConfigurations() {
    return listConfigurations(null);
  }

  /**
   * Get a configuration.
   *
   * Get a configuration by specifying its name.
   *
   * A successful request returns the details of your configuration.
   *
   * @param getConfigurationOptions the {@link GetConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Configuration}
   */
  public ServiceCall<Configuration> getConfiguration(GetConfigurationOptions getConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfigurationOptions,
      "getConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getConfigurationOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/configurations/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getConfigurationOptions.xSmAcceptConfigurationType() != null) {
      builder.header("X-Sm-Accept-Configuration-Type", getConfigurationOptions.xSmAcceptConfigurationType());
    }
    ResponseConverter<Configuration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Configuration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update configuration.
   *
   * Update a configuration.
   *
   * @param updateConfigurationOptions the {@link UpdateConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Configuration}
   */
  public ServiceCall<Configuration> updateConfiguration(UpdateConfigurationOptions updateConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateConfigurationOptions,
      "updateConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", updateConfigurationOptions.name());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/configurations/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "updateConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateConfigurationOptions.xSmAcceptConfigurationType() != null) {
      builder.header("X-Sm-Accept-Configuration-Type", updateConfigurationOptions.xSmAcceptConfigurationType());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateConfigurationOptions.configurationPatch()), "application/merge-patch+json");
    ResponseConverter<Configuration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Configuration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a configuration.
   *
   * Delete a configuration by specifying its name.
   *
   * @param deleteConfigurationOptions the {@link DeleteConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteConfiguration(DeleteConfigurationOptions deleteConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteConfigurationOptions,
      "deleteConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", deleteConfigurationOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/configurations/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "deleteConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteConfigurationOptions.xSmAcceptConfigurationType() != null) {
      builder.header("X-Sm-Accept-Configuration-Type", deleteConfigurationOptions.xSmAcceptConfigurationType());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a configuration action.
   *
   * Create a configuration action. This operation supports the following actions:
   *
   * - `private_cert_configuration_action_sign_intermediate`: Sign an intermediate certificate authority.
   * - `private_cert_configuration_action_sign_csr`: Sign a certificate signing request.
   * - `private_cert_configuration_action_set_signed`: Set a signed intermediate certificate authority.
   * - `private_cert_configuration_action_revoke_ca_certificate`: Revoke an internally signed intermediate certificate
   * authority certificate.
   * - `private_cert_configuration_action_rotate_crl`: Rotate the certificate revocation list (CRL) of an intermediate
   * certificate authority.
   * - `private_cert_configuration_action_rotate_intermediate`: Rotate an internally signed intermediate certificate
   * authority certificate.
   *
   * @param createConfigurationActionOptions the {@link CreateConfigurationActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationAction}
   */
  public ServiceCall<ConfigurationAction> createConfigurationAction(CreateConfigurationActionOptions createConfigurationActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createConfigurationActionOptions,
      "createConfigurationActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", createConfigurationActionOptions.name());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/configurations/{name}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createConfigurationAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createConfigurationActionOptions.xSmAcceptConfigurationType() != null) {
      builder.header("X-Sm-Accept-Configuration-Type", createConfigurationActionOptions.xSmAcceptConfigurationType());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createConfigurationActionOptions.configActionPrototype()), "application/json");
    ResponseConverter<ConfigurationAction> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationAction>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Register with Event Notifications instance.
   *
   * Create a registration between a Secrets Manager instance and [Event
   * Notifications](https://cloud.ibm.com/apidocs/event-notifications).
   *
   * A successful request adds Secrets Manager as a source that you can reference from your Event Notifications
   * instance. For more information about enabling notifications for Secrets Manager, check out the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-event-notifications).
   *
   * @param createNotificationsRegistrationOptions the {@link CreateNotificationsRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NotificationsRegistration}
   */
  public ServiceCall<NotificationsRegistration> createNotificationsRegistration(CreateNotificationsRegistrationOptions createNotificationsRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createNotificationsRegistrationOptions,
      "createNotificationsRegistrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/notifications/registration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "createNotificationsRegistration");
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
    ResponseConverter<NotificationsRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NotificationsRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Event Notifications registration details.
   *
   * Get the details of the registration between your Secrets Manager instance and Event Notifications.
   *
   * @param getNotificationsRegistrationOptions the {@link GetNotificationsRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NotificationsRegistration}
   */
  public ServiceCall<NotificationsRegistration> getNotificationsRegistration(GetNotificationsRegistrationOptions getNotificationsRegistrationOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/notifications/registration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getNotificationsRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<NotificationsRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NotificationsRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Event Notifications registration details.
   *
   * Get the details of the registration between your Secrets Manager instance and Event Notifications.
   *
   * @return a {@link ServiceCall} with a result of type {@link NotificationsRegistration}
   */
  public ServiceCall<NotificationsRegistration> getNotificationsRegistration() {
    return getNotificationsRegistration(null);
  }

  /**
   * Unregister from Event Notifications instance.
   *
   * Delete the registration between your Secrets Manager instance and Event Notifications.
   *
   * A successful request removes your Secrets Manager instance as a source in Event Notifications.
   *
   * @param deleteNotificationsRegistrationOptions the {@link DeleteNotificationsRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteNotificationsRegistration(DeleteNotificationsRegistrationOptions deleteNotificationsRegistrationOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/notifications/registration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "deleteNotificationsRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unregister from Event Notifications instance.
   *
   * Delete the registration between your Secrets Manager instance and Event Notifications.
   *
   * A successful request removes your Secrets Manager instance as a source in Event Notifications.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteNotificationsRegistration() {
    return deleteNotificationsRegistration(null);
  }

  /**
   * Send a test event for Event Notifications registrations.
   *
   * Send a test event from a Secrets Manager instance to a configured [Event
   * Notifications](https://cloud.ibm.com/apidocs/event-notifications) instance.
   *
   * A successful request sends a test event to the Event Notifications instance. For more information about enabling
   * notifications for Secrets Manager, check out the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-event-notifications).
   *
   * @param getNotificationsRegistrationTestOptions the {@link GetNotificationsRegistrationTestOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> getNotificationsRegistrationTest(GetNotificationsRegistrationTestOptions getNotificationsRegistrationTestOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/notifications/registration/test"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager", "v2", "getNotificationsRegistrationTest");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Send a test event for Event Notifications registrations.
   *
   * Send a test event from a Secrets Manager instance to a configured [Event
   * Notifications](https://cloud.ibm.com/apidocs/event-notifications) instance.
   *
   * A successful request sends a test event to the Event Notifications instance. For more information about enabling
   * notifications for Secrets Manager, check out the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-event-notifications).
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> getNotificationsRegistrationTest() {
    return getNotificationsRegistrationTest(null);
  }

}
