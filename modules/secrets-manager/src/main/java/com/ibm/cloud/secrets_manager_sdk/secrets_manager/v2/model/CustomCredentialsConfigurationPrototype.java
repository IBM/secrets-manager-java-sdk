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

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model;

/**
 * CustomCredentialsConfigurationPrototype.
 */
public class CustomCredentialsConfigurationPrototype extends ConfigurationPrototype {

  /**
   * The configuration type. Can be one of: iam_credentials_configuration, public_cert_configuration_ca_lets_encrypt,
   * public_cert_configuration_dns_classic_infrastructure, public_cert_configuration_dns_cloud_internet_services,
   * private_cert_configuration_root_ca, private_cert_configuration_intermediate_ca,
   * private_cert_configuration_template, custom_credentials_configuration.
   */
  public interface ConfigType {
    /** public_cert_configuration_dns_cloud_internet_services. */
    String PUBLIC_CERT_CONFIGURATION_DNS_CLOUD_INTERNET_SERVICES = "public_cert_configuration_dns_cloud_internet_services";
    /** public_cert_configuration_dns_classic_infrastructure. */
    String PUBLIC_CERT_CONFIGURATION_DNS_CLASSIC_INFRASTRUCTURE = "public_cert_configuration_dns_classic_infrastructure";
    /** public_cert_configuration_ca_lets_encrypt. */
    String PUBLIC_CERT_CONFIGURATION_CA_LETS_ENCRYPT = "public_cert_configuration_ca_lets_encrypt";
    /** private_cert_configuration_root_ca. */
    String PRIVATE_CERT_CONFIGURATION_ROOT_CA = "private_cert_configuration_root_ca";
    /** private_cert_configuration_intermediate_ca. */
    String PRIVATE_CERT_CONFIGURATION_INTERMEDIATE_CA = "private_cert_configuration_intermediate_ca";
    /** private_cert_configuration_template. */
    String PRIVATE_CERT_CONFIGURATION_TEMPLATE = "private_cert_configuration_template";
    /** iam_credentials_configuration. */
    String IAM_CREDENTIALS_CONFIGURATION = "iam_credentials_configuration";
    /** custom_credentials_configuration. */
    String CUSTOM_CREDENTIALS_CONFIGURATION = "custom_credentials_configuration";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String configType;
    private String apiKeyRef;
    private CustomCredentialsConfigurationCodeEngine codeEngine;
    private String taskTimeout;

    /**
     * Instantiates a new Builder from an existing CustomCredentialsConfigurationPrototype instance.
     *
     * @param customCredentialsConfigurationPrototype the instance to initialize the Builder with
     */
    public Builder(ConfigurationPrototype customCredentialsConfigurationPrototype) {
      this.name = customCredentialsConfigurationPrototype.name;
      this.configType = customCredentialsConfigurationPrototype.configType;
      this.apiKeyRef = customCredentialsConfigurationPrototype.apiKeyRef;
      this.codeEngine = customCredentialsConfigurationPrototype.codeEngine;
      this.taskTimeout = customCredentialsConfigurationPrototype.taskTimeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param configType the configType
     * @param codeEngine the codeEngine
     */
    public Builder(String name, String configType, CustomCredentialsConfigurationCodeEngine codeEngine) {
      this.name = name;
      this.configType = configType;
      this.codeEngine = codeEngine;
    }

    /**
     * Builds a CustomCredentialsConfigurationPrototype.
     *
     * @return the new CustomCredentialsConfigurationPrototype instance
     */
    public CustomCredentialsConfigurationPrototype build() {
      return new CustomCredentialsConfigurationPrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CustomCredentialsConfigurationPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the configType.
     *
     * @param configType the configType
     * @return the CustomCredentialsConfigurationPrototype builder
     */
    public Builder configType(String configType) {
      this.configType = configType;
      return this;
    }

    /**
     * Set the apiKeyRef.
     *
     * @param apiKeyRef the apiKeyRef
     * @return the CustomCredentialsConfigurationPrototype builder
     */
    public Builder apiKeyRef(String apiKeyRef) {
      this.apiKeyRef = apiKeyRef;
      return this;
    }

    /**
     * Set the codeEngine.
     *
     * @param codeEngine the codeEngine
     * @return the CustomCredentialsConfigurationPrototype builder
     */
    public Builder codeEngine(CustomCredentialsConfigurationCodeEngine codeEngine) {
      this.codeEngine = codeEngine;
      return this;
    }

    /**
     * Set the taskTimeout.
     *
     * @param taskTimeout the taskTimeout
     * @return the CustomCredentialsConfigurationPrototype builder
     */
    public Builder taskTimeout(String taskTimeout) {
      this.taskTimeout = taskTimeout;
      return this;
    }
  }

  protected CustomCredentialsConfigurationPrototype() { }

  protected CustomCredentialsConfigurationPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configType,
      "configType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.codeEngine,
      "codeEngine cannot be null");
    name = builder.name;
    configType = builder.configType;
    apiKeyRef = builder.apiKeyRef;
    codeEngine = builder.codeEngine;
    taskTimeout = builder.taskTimeout;
  }

  /**
   * New builder.
   *
   * @return a CustomCredentialsConfigurationPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

