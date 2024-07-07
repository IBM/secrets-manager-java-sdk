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

/**
 * The properties of the Let's Encrypt CA configuration.
 */
public class PublicCertificateConfigurationCALetsEncryptPrototype extends ConfigurationPrototype {

  /**
   * The configuration type. Can be one of: iam_credentials_configuration, public_cert_configuration_ca_lets_encrypt,
   * public_cert_configuration_dns_classic_infrastructure, public_cert_configuration_dns_cloud_internet_services,
   * private_cert_configuration_root_ca, private_cert_configuration_intermediate_ca,
   * private_cert_configuration_template.
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
  }

  /**
   * The configuration of the Let's Encrypt CA environment.
   */
  public interface LetsEncryptEnvironment {
    /** production. */
    String PRODUCTION = "production";
    /** staging. */
    String STAGING = "staging";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String configType;
    private String name;
    private String letsEncryptEnvironment;
    private String letsEncryptPrivateKey;
    private String letsEncryptPreferredChain;

    /**
     * Instantiates a new Builder from an existing PublicCertificateConfigurationCALetsEncryptPrototype instance.
     *
     * @param publicCertificateConfigurationCaLetsEncryptPrototype the instance to initialize the Builder with
     */
    public Builder(ConfigurationPrototype publicCertificateConfigurationCaLetsEncryptPrototype) {
      this.configType = publicCertificateConfigurationCaLetsEncryptPrototype.configType;
      this.name = publicCertificateConfigurationCaLetsEncryptPrototype.name;
      this.letsEncryptEnvironment = publicCertificateConfigurationCaLetsEncryptPrototype.letsEncryptEnvironment;
      this.letsEncryptPrivateKey = publicCertificateConfigurationCaLetsEncryptPrototype.letsEncryptPrivateKey;
      this.letsEncryptPreferredChain = publicCertificateConfigurationCaLetsEncryptPrototype.letsEncryptPreferredChain;
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
     * @param letsEncryptEnvironment the letsEncryptEnvironment
     * @param letsEncryptPrivateKey the letsEncryptPrivateKey
     */
    public Builder(String configType, String name, String letsEncryptEnvironment, String letsEncryptPrivateKey) {
      this.configType = configType;
      this.name = name;
      this.letsEncryptEnvironment = letsEncryptEnvironment;
      this.letsEncryptPrivateKey = letsEncryptPrivateKey;
    }

    /**
     * Builds a PublicCertificateConfigurationCALetsEncryptPrototype.
     *
     * @return the new PublicCertificateConfigurationCALetsEncryptPrototype instance
     */
    public PublicCertificateConfigurationCALetsEncryptPrototype build() {
      return new PublicCertificateConfigurationCALetsEncryptPrototype(this);
    }

    /**
     * Set the configType.
     *
     * @param configType the configType
     * @return the PublicCertificateConfigurationCALetsEncryptPrototype builder
     */
    public Builder configType(String configType) {
      this.configType = configType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PublicCertificateConfigurationCALetsEncryptPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the letsEncryptEnvironment.
     *
     * @param letsEncryptEnvironment the letsEncryptEnvironment
     * @return the PublicCertificateConfigurationCALetsEncryptPrototype builder
     */
    public Builder letsEncryptEnvironment(String letsEncryptEnvironment) {
      this.letsEncryptEnvironment = letsEncryptEnvironment;
      return this;
    }

    /**
     * Set the letsEncryptPrivateKey.
     *
     * @param letsEncryptPrivateKey the letsEncryptPrivateKey
     * @return the PublicCertificateConfigurationCALetsEncryptPrototype builder
     */
    public Builder letsEncryptPrivateKey(String letsEncryptPrivateKey) {
      this.letsEncryptPrivateKey = letsEncryptPrivateKey;
      return this;
    }

    /**
     * Set the letsEncryptPreferredChain.
     *
     * @param letsEncryptPreferredChain the letsEncryptPreferredChain
     * @return the PublicCertificateConfigurationCALetsEncryptPrototype builder
     */
    public Builder letsEncryptPreferredChain(String letsEncryptPreferredChain) {
      this.letsEncryptPreferredChain = letsEncryptPreferredChain;
      return this;
    }
  }

  protected PublicCertificateConfigurationCALetsEncryptPrototype() { }

  protected PublicCertificateConfigurationCALetsEncryptPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configType,
      "configType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.letsEncryptEnvironment,
      "letsEncryptEnvironment cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.letsEncryptPrivateKey,
      "letsEncryptPrivateKey cannot be null");
    configType = builder.configType;
    name = builder.name;
    letsEncryptEnvironment = builder.letsEncryptEnvironment;
    letsEncryptPrivateKey = builder.letsEncryptPrivateKey;
    letsEncryptPreferredChain = builder.letsEncryptPreferredChain;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateConfigurationCALetsEncryptPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

