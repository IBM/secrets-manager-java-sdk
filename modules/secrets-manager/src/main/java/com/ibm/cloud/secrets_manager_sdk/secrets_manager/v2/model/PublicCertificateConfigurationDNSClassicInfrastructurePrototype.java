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
 * PublicCertificateConfigurationDNSClassicInfrastructurePrototype.
 */
public class PublicCertificateConfigurationDNSClassicInfrastructurePrototype extends ConfigurationPrototype {

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
    private String configType;
    private String name;
    private String classicInfrastructureUsername;
    private String classicInfrastructurePassword;

    /**
     * Instantiates a new Builder from an existing PublicCertificateConfigurationDNSClassicInfrastructurePrototype instance.
     *
     * @param publicCertificateConfigurationDnsClassicInfrastructurePrototype the instance to initialize the Builder with
     */
    public Builder(ConfigurationPrototype publicCertificateConfigurationDnsClassicInfrastructurePrototype) {
      this.configType = publicCertificateConfigurationDnsClassicInfrastructurePrototype.configType;
      this.name = publicCertificateConfigurationDnsClassicInfrastructurePrototype.name;
      this.classicInfrastructureUsername = publicCertificateConfigurationDnsClassicInfrastructurePrototype.classicInfrastructureUsername;
      this.classicInfrastructurePassword = publicCertificateConfigurationDnsClassicInfrastructurePrototype.classicInfrastructurePassword;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param configType the configType
     * @param name the name
     * @param classicInfrastructureUsername the classicInfrastructureUsername
     * @param classicInfrastructurePassword the classicInfrastructurePassword
     */
    public Builder(String configType, String name, String classicInfrastructureUsername, String classicInfrastructurePassword) {
      this.configType = configType;
      this.name = name;
      this.classicInfrastructureUsername = classicInfrastructureUsername;
      this.classicInfrastructurePassword = classicInfrastructurePassword;
    }

    /**
     * Builds a PublicCertificateConfigurationDNSClassicInfrastructurePrototype.
     *
     * @return the new PublicCertificateConfigurationDNSClassicInfrastructurePrototype instance
     */
    public PublicCertificateConfigurationDNSClassicInfrastructurePrototype build() {
      return new PublicCertificateConfigurationDNSClassicInfrastructurePrototype(this);
    }

    /**
     * Set the configType.
     *
     * @param configType the configType
     * @return the PublicCertificateConfigurationDNSClassicInfrastructurePrototype builder
     */
    public Builder configType(String configType) {
      this.configType = configType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PublicCertificateConfigurationDNSClassicInfrastructurePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the classicInfrastructureUsername.
     *
     * @param classicInfrastructureUsername the classicInfrastructureUsername
     * @return the PublicCertificateConfigurationDNSClassicInfrastructurePrototype builder
     */
    public Builder classicInfrastructureUsername(String classicInfrastructureUsername) {
      this.classicInfrastructureUsername = classicInfrastructureUsername;
      return this;
    }

    /**
     * Set the classicInfrastructurePassword.
     *
     * @param classicInfrastructurePassword the classicInfrastructurePassword
     * @return the PublicCertificateConfigurationDNSClassicInfrastructurePrototype builder
     */
    public Builder classicInfrastructurePassword(String classicInfrastructurePassword) {
      this.classicInfrastructurePassword = classicInfrastructurePassword;
      return this;
    }
  }

  protected PublicCertificateConfigurationDNSClassicInfrastructurePrototype() { }

  protected PublicCertificateConfigurationDNSClassicInfrastructurePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configType,
      "configType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.classicInfrastructureUsername,
      "classicInfrastructureUsername cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.classicInfrastructurePassword,
      "classicInfrastructurePassword cannot be null");
    configType = builder.configType;
    name = builder.name;
    classicInfrastructureUsername = builder.classicInfrastructureUsername;
    classicInfrastructurePassword = builder.classicInfrastructurePassword;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateConfigurationDNSClassicInfrastructurePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

