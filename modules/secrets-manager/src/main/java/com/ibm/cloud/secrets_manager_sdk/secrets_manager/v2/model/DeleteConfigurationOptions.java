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
 * The deleteConfiguration options.
 */
public class DeleteConfigurationOptions extends GenericModel {

  /**
   * The configuration type of this configuration - use this header to resolve 300 error responses.
   */
  public interface XSmAcceptConfigurationType {
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
  }

  protected String name;
  protected String xSmAcceptConfigurationType;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String xSmAcceptConfigurationType;

    /**
     * Instantiates a new Builder from an existing DeleteConfigurationOptions instance.
     *
     * @param deleteConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(DeleteConfigurationOptions deleteConfigurationOptions) {
      this.name = deleteConfigurationOptions.name;
      this.xSmAcceptConfigurationType = deleteConfigurationOptions.xSmAcceptConfigurationType;
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
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a DeleteConfigurationOptions.
     *
     * @return the new DeleteConfigurationOptions instance
     */
    public DeleteConfigurationOptions build() {
      return new DeleteConfigurationOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DeleteConfigurationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the xSmAcceptConfigurationType.
     *
     * @param xSmAcceptConfigurationType the xSmAcceptConfigurationType
     * @return the DeleteConfigurationOptions builder
     */
    public Builder xSmAcceptConfigurationType(String xSmAcceptConfigurationType) {
      this.xSmAcceptConfigurationType = xSmAcceptConfigurationType;
      return this;
    }
  }

  protected DeleteConfigurationOptions() { }

  protected DeleteConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    name = builder.name;
    xSmAcceptConfigurationType = builder.xSmAcceptConfigurationType;
  }

  /**
   * New builder.
   *
   * @return a DeleteConfigurationOptions builder
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

