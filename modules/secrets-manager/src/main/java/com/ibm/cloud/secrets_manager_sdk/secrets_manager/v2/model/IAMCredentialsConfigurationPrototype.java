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
 * IAMCredentialsConfigurationPrototype.
 */
public class IAMCredentialsConfigurationPrototype extends ConfigurationPrototype {

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
    private String apiKey;
    private Boolean disabled;

    /**
     * Instantiates a new Builder from an existing IAMCredentialsConfigurationPrototype instance.
     *
     * @param iamCredentialsConfigurationPrototype the instance to initialize the Builder with
     */
    public Builder(ConfigurationPrototype iamCredentialsConfigurationPrototype) {
      this.name = iamCredentialsConfigurationPrototype.name;
      this.configType = iamCredentialsConfigurationPrototype.configType;
      this.apiKey = iamCredentialsConfigurationPrototype.apiKey;
      this.disabled = iamCredentialsConfigurationPrototype.disabled;
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
     * @param apiKey the apiKey
     */
    public Builder(String name, String configType, String apiKey) {
      this.name = name;
      this.configType = configType;
      this.apiKey = apiKey;
    }

    /**
     * Builds a IAMCredentialsConfigurationPrototype.
     *
     * @return the new IAMCredentialsConfigurationPrototype instance
     */
    public IAMCredentialsConfigurationPrototype build() {
      return new IAMCredentialsConfigurationPrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the IAMCredentialsConfigurationPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the configType.
     *
     * @param configType the configType
     * @return the IAMCredentialsConfigurationPrototype builder
     */
    public Builder configType(String configType) {
      this.configType = configType;
      return this;
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the IAMCredentialsConfigurationPrototype builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the disabled.
     *
     * @param disabled the disabled
     * @return the IAMCredentialsConfigurationPrototype builder
     */
    public Builder disabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }
  }

  protected IAMCredentialsConfigurationPrototype() { }

  protected IAMCredentialsConfigurationPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configType,
      "configType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiKey,
      "apiKey cannot be null");
    name = builder.name;
    configType = builder.configType;
    apiKey = builder.apiKey;
    disabled = builder.disabled;
  }

  /**
   * New builder.
   *
   * @return a IAMCredentialsConfigurationPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

