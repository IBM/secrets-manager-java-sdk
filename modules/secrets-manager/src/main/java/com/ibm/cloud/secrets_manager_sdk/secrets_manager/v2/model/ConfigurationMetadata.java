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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Your configuration metadata properties.
 *
 * Classes which extend this class:
 * - IAMCredentialsConfigurationMetadata
 * - PublicCertificateConfigurationCALetsEncryptMetadata
 * - PublicCertificateConfigurationDNSCloudInternetServicesMetadata
 * - PublicCertificateConfigurationDNSClassicInfrastructureMetadata
 * - PrivateCertificateConfigurationRootCAMetadata
 * - PrivateCertificateConfigurationIntermediateCAMetadata
 * - PrivateCertificateConfigurationTemplateMetadata
 */
public class ConfigurationMetadata extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "config_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("iam_credentials_configuration", IAMCredentialsConfigurationMetadata.class);
    discriminatorMapping.put("public_cert_configuration_ca_lets_encrypt", PublicCertificateConfigurationCALetsEncryptMetadata.class);
    discriminatorMapping.put("public_cert_configuration_dns_cloud_internet_services", PublicCertificateConfigurationDNSCloudInternetServicesMetadata.class);
    discriminatorMapping.put("public_cert_configuration_dns_classic_infrastructure", PublicCertificateConfigurationDNSClassicInfrastructureMetadata.class);
    discriminatorMapping.put("private_cert_configuration_root_ca", PrivateCertificateConfigurationRootCAMetadata.class);
    discriminatorMapping.put("private_cert_configuration_intermediate_ca", PrivateCertificateConfigurationIntermediateCAMetadata.class);
    discriminatorMapping.put("private_cert_configuration_template", PrivateCertificateConfigurationTemplateMetadata.class);
  }

  /**
   * The configuration type.
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
   * The secret type. Supported types are arbitrary, certificates (imported, public, and private), IAM credentials,
   * key-value, and user credentials.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** kv. */
    String KV = "kv";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
  }

  @SerializedName("config_type")
  protected String configType;
  protected String name;
  @SerializedName("secret_type")
  protected String secretType;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected ConfigurationMetadata() { }

  /**
   * Gets the configType.
   *
   * The configuration type.
   *
   * @return the configType
   */
  public String getConfigType() {
    return configType;
  }

  /**
   * Gets the name.
   *
   * The unique name of your configuration.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the secretType.
   *
   * The secret type. Supported types are arbitrary, certificates (imported, public, and private), IAM credentials,
   * key-value, and user credentials.
   *
   * @return the secretType
   */
  public String getSecretType() {
    return secretType;
  }

  /**
   * Gets the createdBy.
   *
   * The unique identifier that is associated with the entity that created the secret.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the createdAt.
   *
   * The date when the resource was created. The date format follows `RFC 3339`.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * The date when a resource was modified. The date format follows `RFC 3339`.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}
