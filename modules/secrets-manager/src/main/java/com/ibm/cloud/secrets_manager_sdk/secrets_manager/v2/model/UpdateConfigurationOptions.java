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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateConfiguration options.
 */
public class UpdateConfigurationOptions extends GenericModel {

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
  protected Map<String, Object> configurationPatch;
  protected String xSmAcceptConfigurationType;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Map<String, Object> configurationPatch;
    private String xSmAcceptConfigurationType;

    /**
     * Instantiates a new Builder from an existing UpdateConfigurationOptions instance.
     *
     * @param updateConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateConfigurationOptions updateConfigurationOptions) {
      this.name = updateConfigurationOptions.name;
      this.configurationPatch = updateConfigurationOptions.configurationPatch;
      this.xSmAcceptConfigurationType = updateConfigurationOptions.xSmAcceptConfigurationType;
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
     * @param configurationPatch the configurationPatch
     */
    public Builder(String name, Map<String, Object> configurationPatch) {
      this.name = name;
      this.configurationPatch = configurationPatch;
    }

    /**
     * Builds a UpdateConfigurationOptions.
     *
     * @return the new UpdateConfigurationOptions instance
     */
    public UpdateConfigurationOptions build() {
      return new UpdateConfigurationOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateConfigurationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the configurationPatch.
     *
     * @param configurationPatch the configurationPatch
     * @return the UpdateConfigurationOptions builder
     */
    public Builder configurationPatch(Map<String, Object> configurationPatch) {
      this.configurationPatch = configurationPatch;
      return this;
    }

    /**
     * Set the xSmAcceptConfigurationType.
     *
     * @param xSmAcceptConfigurationType the xSmAcceptConfigurationType
     * @return the UpdateConfigurationOptions builder
     */
    public Builder xSmAcceptConfigurationType(String xSmAcceptConfigurationType) {
      this.xSmAcceptConfigurationType = xSmAcceptConfigurationType;
      return this;
    }
  }

  protected UpdateConfigurationOptions() { }

  protected UpdateConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configurationPatch,
      "configurationPatch cannot be null");
    name = builder.name;
    configurationPatch = builder.configurationPatch;
    xSmAcceptConfigurationType = builder.xSmAcceptConfigurationType;
  }

  /**
   * New builder.
   *
   * @return a UpdateConfigurationOptions builder
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
   * Gets the configurationPatch.
   *
   * JSON Merge-Patch content for update_configuration.
   *
   * @return the configurationPatch
   */
  public Map<String, Object> configurationPatch() {
    return configurationPatch;
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

