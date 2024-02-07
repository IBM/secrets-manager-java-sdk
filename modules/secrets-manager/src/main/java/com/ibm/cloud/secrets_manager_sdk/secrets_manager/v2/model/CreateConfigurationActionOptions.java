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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createConfigurationAction options.
 */
public class CreateConfigurationActionOptions extends GenericModel {

  /**
   * The configuration type of this configuration - use this header to resolve 300 error responses.
   */
  public interface XSmAcceptConfigurationType {
    /** public_cert_configuration_ca_lets_encrypt. */
    String PUBLIC_CERT_CONFIGURATION_CA_LETS_ENCRYPT = "public_cert_configuration_ca_lets_encrypt";
    /** public_cert_configuration_dns_classic_infrastructure. */
    String PUBLIC_CERT_CONFIGURATION_DNS_CLASSIC_INFRASTRUCTURE = "public_cert_configuration_dns_classic_infrastructure";
    /** public_cert_configuration_dns_cloud_internet_services. */
    String PUBLIC_CERT_CONFIGURATION_DNS_CLOUD_INTERNET_SERVICES = "public_cert_configuration_dns_cloud_internet_services";
    /** iam_credentials_configuration. */
    String IAM_CREDENTIALS_CONFIGURATION = "iam_credentials_configuration";
    /** private_cert_configuration_root_ca. */
    String PRIVATE_CERT_CONFIGURATION_ROOT_CA = "private_cert_configuration_root_ca";
    /** private_cert_configuration_intermediate_ca. */
    String PRIVATE_CERT_CONFIGURATION_INTERMEDIATE_CA = "private_cert_configuration_intermediate_ca";
    /** private_cert_configuration_template. */
    String PRIVATE_CERT_CONFIGURATION_TEMPLATE = "private_cert_configuration_template";
  }

  protected String name;
  protected ConfigurationActionPrototype configActionPrototype;
  protected String xSmAcceptConfigurationType;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ConfigurationActionPrototype configActionPrototype;
    private String xSmAcceptConfigurationType;

    /**
     * Instantiates a new Builder from an existing CreateConfigurationActionOptions instance.
     *
     * @param createConfigurationActionOptions the instance to initialize the Builder with
     */
    private Builder(CreateConfigurationActionOptions createConfigurationActionOptions) {
      this.name = createConfigurationActionOptions.name;
      this.configActionPrototype = createConfigurationActionOptions.configActionPrototype;
      this.xSmAcceptConfigurationType = createConfigurationActionOptions.xSmAcceptConfigurationType;
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
     * @param configActionPrototype the configActionPrototype
     */
    public Builder(String name, ConfigurationActionPrototype configActionPrototype) {
      this.name = name;
      this.configActionPrototype = configActionPrototype;
    }

    /**
     * Builds a CreateConfigurationActionOptions.
     *
     * @return the new CreateConfigurationActionOptions instance
     */
    public CreateConfigurationActionOptions build() {
      return new CreateConfigurationActionOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateConfigurationActionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the configActionPrototype.
     *
     * @param configActionPrototype the configActionPrototype
     * @return the CreateConfigurationActionOptions builder
     */
    public Builder configActionPrototype(ConfigurationActionPrototype configActionPrototype) {
      this.configActionPrototype = configActionPrototype;
      return this;
    }

    /**
     * Set the xSmAcceptConfigurationType.
     *
     * @param xSmAcceptConfigurationType the xSmAcceptConfigurationType
     * @return the CreateConfigurationActionOptions builder
     */
    public Builder xSmAcceptConfigurationType(String xSmAcceptConfigurationType) {
      this.xSmAcceptConfigurationType = xSmAcceptConfigurationType;
      return this;
    }
  }

  protected CreateConfigurationActionOptions() { }

  protected CreateConfigurationActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configActionPrototype,
      "configActionPrototype cannot be null");
    name = builder.name;
    configActionPrototype = builder.configActionPrototype;
    xSmAcceptConfigurationType = builder.xSmAcceptConfigurationType;
  }

  /**
   * New builder.
   *
   * @return a CreateConfigurationActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name that uniquely identifies a configuration.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the configActionPrototype.
   *
   * The request body to specify the properties of the action to create a configuration.
   *
   * @return the configActionPrototype
   */
  public ConfigurationActionPrototype configActionPrototype() {
    return configActionPrototype;
  }

  /**
   * Gets the xSmAcceptConfigurationType.
   *
   * The configuration type of this configuration - use this header to resolve 300 error responses.
   *
   * @return the xSmAcceptConfigurationType
   */
  public String xSmAcceptConfigurationType() {
    return xSmAcceptConfigurationType;
  }
}

