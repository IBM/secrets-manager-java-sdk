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
    discriminatorMapping.put("public_cert_configuration_dns_cloud_internet_services", PublicCertificateConfigurationDNSCloudInternetServicesMetadata.class);
    discriminatorMapping.put("public_cert_configuration_dns_classic_infrastructure", PublicCertificateConfigurationDNSClassicInfrastructureMetadata.class);
    discriminatorMapping.put("public_cert_configuration_ca_lets_encrypt", PublicCertificateConfigurationCALetsEncryptMetadata.class);
    discriminatorMapping.put("private_cert_configuration_root_ca", PrivateCertificateConfigurationRootCAMetadata.class);
    discriminatorMapping.put("private_cert_configuration_intermediate_ca", PrivateCertificateConfigurationIntermediateCAMetadata.class);
    discriminatorMapping.put("private_cert_configuration_template", PrivateCertificateConfigurationTemplateMetadata.class);
    discriminatorMapping.put("iam_credentials_configuration", IAMCredentialsConfigurationMetadata.class);
  }
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
   * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
   * service_credentials, kv, and username_password.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** kv. */
    String KV = "kv";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** service_credentials. */
    String SERVICE_CREDENTIALS = "service_credentials";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
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
   * The type of private key to generate.
   */
  public interface KeyType {
    /** rsa. */
    String RSA = "rsa";
    /** ec. */
    String EC = "ec";
  }

  /**
   * The status of the certificate authority. The status of a root certificate authority is either `configured` or
   * `expired`. For intermediate certificate authorities, possible statuses include `signing_required`,
   * `signed_certificate_required`, `certificate_template_required`, `configured`, `expired` or `revoked`.
   */
  public interface Status {
    /** signing_required. */
    String SIGNING_REQUIRED = "signing_required";
    /** signed_certificate_required. */
    String SIGNED_CERTIFICATE_REQUIRED = "signed_certificate_required";
    /** certificate_template_required. */
    String CERTIFICATE_TEMPLATE_REQUIRED = "certificate_template_required";
    /** configured. */
    String CONFIGURED = "configured";
    /** expired. */
    String EXPIRED = "expired";
    /** revoked. */
    String REVOKED = "revoked";
  }

  /**
   * The signing method to use with this certificate authority to generate private certificates.
   *
   * You can choose between internal or externally signed options. For more information, see the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-intermediate-certificate-authorities).
   */
  public interface SigningMethod {
    /** internal. */
    String INTERNAL = "internal";
    /** external. */
    String EXTERNAL = "external";
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
  protected Boolean disabled;
  @SerializedName("lets_encrypt_environment")
  protected String letsEncryptEnvironment;
  @SerializedName("lets_encrypt_preferred_chain")
  protected String letsEncryptPreferredChain;
  @SerializedName("common_name")
  protected String commonName;
  @SerializedName("crl_distribution_points_encoded")
  protected Boolean crlDistributionPointsEncoded;
  @SerializedName("expiration_date")
  protected Date expirationDate;
  @SerializedName("key_type")
  protected String keyType;
  @SerializedName("key_bits")
  protected Long keyBits;
  protected String status;
  @SerializedName("crypto_key")
  protected PrivateCertificateCryptoKey cryptoKey;
  protected String issuer;
  @SerializedName("signing_method")
  protected String signingMethod;
  @SerializedName("certificate_authority")
  protected String certificateAuthority;

  protected ConfigurationMetadata() { }

  /**
   * Gets the configType.
   *
   * The configuration type. Can be one of: iam_credentials_configuration, public_cert_configuration_ca_lets_encrypt,
   * public_cert_configuration_dns_classic_infrastructure, public_cert_configuration_dns_cloud_internet_services,
   * private_cert_configuration_root_ca, private_cert_configuration_intermediate_ca,
   * private_cert_configuration_template.
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
   * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
   * service_credentials, kv, and username_password.
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

  /**
   * Gets the disabled.
   *
   * This parameter indicates whether the API key configuration is disabled.
   *
   * @return the disabled
   */
  public Boolean isDisabled() {
    return disabled;
  }

  /**
   * Gets the letsEncryptEnvironment.
   *
   * The configuration of the Let's Encrypt CA environment.
   *
   * @return the letsEncryptEnvironment
   */
  public String getLetsEncryptEnvironment() {
    return letsEncryptEnvironment;
  }

  /**
   * Gets the letsEncryptPreferredChain.
   *
   * This field supports only the chains that Let's Encrypt provides. Keep empty to use the default or supply a valid
   * Let's Encrypt-provided value. For a list of supported chains, see: https://letsencrypt.org/certificates/.
   *
   * @return the letsEncryptPreferredChain
   */
  public String getLetsEncryptPreferredChain() {
    return letsEncryptPreferredChain;
  }

  /**
   * Gets the commonName.
   *
   * The Common Name (CN) represents the server name that is protected by the SSL certificate.
   *
   * @return the commonName
   */
  public String getCommonName() {
    return commonName;
  }

  /**
   * Gets the crlDistributionPointsEncoded.
   *
   * This field determines whether to encode the certificate revocation list (CRL) distribution points in the
   * certificates that are issued by this certificate authority.
   *
   * @return the crlDistributionPointsEncoded
   */
  public Boolean isCrlDistributionPointsEncoded() {
    return crlDistributionPointsEncoded;
  }

  /**
   * Gets the expirationDate.
   *
   * The date when the secret material expires. The date format follows the `RFC 3339` format. Supported secret types:
   * Arbitrary, username_password.
   *
   * @return the expirationDate
   */
  public Date getExpirationDate() {
    return expirationDate;
  }

  /**
   * Gets the keyType.
   *
   * The type of private key to generate.
   *
   * @return the keyType
   */
  public String getKeyType() {
    return keyType;
  }

  /**
   * Gets the keyBits.
   *
   * The number of bits to use to generate the private key.
   *
   * Allowable values for RSA keys are: `2048` and `4096`. Allowable values for EC keys are: `224`, `256`, `384`, and
   * `521`. The default for RSA keys is `2048`. The default for EC keys is `256`.
   *
   * @return the keyBits
   */
  public Long getKeyBits() {
    return keyBits;
  }

  /**
   * Gets the status.
   *
   * The status of the certificate authority. The status of a root certificate authority is either `configured` or
   * `expired`. For intermediate certificate authorities, possible statuses include `signing_required`,
   * `signed_certificate_required`, `certificate_template_required`, `configured`, `expired` or `revoked`.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the cryptoKey.
   *
   * The data that is associated with a cryptographic key.
   *
   * @return the cryptoKey
   */
  public PrivateCertificateCryptoKey getCryptoKey() {
    return cryptoKey;
  }

  /**
   * Gets the issuer.
   *
   * The distinguished name that identifies the entity that signed and issued the certificate.
   *
   * @return the issuer
   */
  public String getIssuer() {
    return issuer;
  }

  /**
   * Gets the signingMethod.
   *
   * The signing method to use with this certificate authority to generate private certificates.
   *
   * You can choose between internal or externally signed options. For more information, see the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-intermediate-certificate-authorities).
   *
   * @return the signingMethod
   */
  public String getSigningMethod() {
    return signingMethod;
  }

  /**
   * Gets the certificateAuthority.
   *
   * The name of the intermediate certificate authority.
   *
   * @return the certificateAuthority
   */
  public String getCertificateAuthority() {
    return certificateAuthority;
  }
}

