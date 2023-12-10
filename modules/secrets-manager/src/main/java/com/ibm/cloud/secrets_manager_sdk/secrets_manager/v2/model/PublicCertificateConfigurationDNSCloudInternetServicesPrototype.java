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

/**
 * Specify the properties for Cloud Internet Services DNS configuration.
 */
public class PublicCertificateConfigurationDNSCloudInternetServicesPrototype extends ConfigurationPrototype {

  /**
   * The configuration type. Can be one of: iam_credentials_configuration, public_cert_configuration_ca_lets_encrypt,
   * public_cert_configuration_dns_classic_infrastructure, public_cert_configuration_dns_cloud_internet_services,
   * private_cert_configuration_root_ca, private_cert_configuration_intermediate_ca,
   * private_cert_configuration_template.
   */
  public interface ConfigType {
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


  /**
   * Builder.
   */
  public static class Builder {
    private String configType;
    private String name;
    private String cloudInternetServicesApikey;
    private String cloudInternetServicesCrn;

    /**
     * Instantiates a new Builder from an existing PublicCertificateConfigurationDNSCloudInternetServicesPrototype instance.
     *
     * @param publicCertificateConfigurationDnsCloudInternetServicesPrototype the instance to initialize the Builder with
     */
    public Builder(ConfigurationPrototype publicCertificateConfigurationDnsCloudInternetServicesPrototype) {
      this.configType = publicCertificateConfigurationDnsCloudInternetServicesPrototype.configType;
      this.name = publicCertificateConfigurationDnsCloudInternetServicesPrototype.name;
      this.cloudInternetServicesApikey = publicCertificateConfigurationDnsCloudInternetServicesPrototype.cloudInternetServicesApikey;
      this.cloudInternetServicesCrn = publicCertificateConfigurationDnsCloudInternetServicesPrototype.cloudInternetServicesCrn;
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
     * @param cloudInternetServicesCrn the cloudInternetServicesCrn
     */
    public Builder(String configType, String name, String cloudInternetServicesCrn) {
      this.configType = configType;
      this.name = name;
      this.cloudInternetServicesCrn = cloudInternetServicesCrn;
    }

    /**
     * Builds a PublicCertificateConfigurationDNSCloudInternetServicesPrototype.
     *
     * @return the new PublicCertificateConfigurationDNSCloudInternetServicesPrototype instance
     */
    public PublicCertificateConfigurationDNSCloudInternetServicesPrototype build() {
      return new PublicCertificateConfigurationDNSCloudInternetServicesPrototype(this);
    }

    /**
     * Set the configType.
     *
     * @param configType the configType
     * @return the PublicCertificateConfigurationDNSCloudInternetServicesPrototype builder
     */
    public Builder configType(String configType) {
      this.configType = configType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PublicCertificateConfigurationDNSCloudInternetServicesPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the cloudInternetServicesApikey.
     *
     * @param cloudInternetServicesApikey the cloudInternetServicesApikey
     * @return the PublicCertificateConfigurationDNSCloudInternetServicesPrototype builder
     */
    public Builder cloudInternetServicesApikey(String cloudInternetServicesApikey) {
      this.cloudInternetServicesApikey = cloudInternetServicesApikey;
      return this;
    }

    /**
     * Set the cloudInternetServicesCrn.
     *
     * @param cloudInternetServicesCrn the cloudInternetServicesCrn
     * @return the PublicCertificateConfigurationDNSCloudInternetServicesPrototype builder
     */
    public Builder cloudInternetServicesCrn(String cloudInternetServicesCrn) {
      this.cloudInternetServicesCrn = cloudInternetServicesCrn;
      return this;
    }
  }

  protected PublicCertificateConfigurationDNSCloudInternetServicesPrototype() { }

  protected PublicCertificateConfigurationDNSCloudInternetServicesPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configType,
      "configType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cloudInternetServicesCrn,
      "cloudInternetServicesCrn cannot be null");
    configType = builder.configType;
    name = builder.name;
    cloudInternetServicesApikey = builder.cloudInternetServicesApikey;
    cloudInternetServicesCrn = builder.cloudInternetServicesCrn;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateConfigurationDNSCloudInternetServicesPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

