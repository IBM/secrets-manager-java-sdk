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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Your configuration.
 *
 * Classes which extend this class:
 * - PublicCertificateConfigurationCALetsEncrypt
 * - PublicCertificateConfigurationDNSCloudInternetServices
 * - PublicCertificateConfigurationDNSClassicInfrastructure
 * - IAMCredentialsConfiguration
 * - PrivateCertificateConfigurationRootCA
 * - PrivateCertificateConfigurationIntermediateCA
 * - PrivateCertificateConfigurationTemplate
 * - CustomCredentialsConfiguration
 */
public class Configuration extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "config_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("public_cert_configuration_dns_cloud_internet_services", PublicCertificateConfigurationDNSCloudInternetServices.class);
    discriminatorMapping.put("public_cert_configuration_dns_classic_infrastructure", PublicCertificateConfigurationDNSClassicInfrastructure.class);
    discriminatorMapping.put("public_cert_configuration_ca_lets_encrypt", PublicCertificateConfigurationCALetsEncrypt.class);
    discriminatorMapping.put("iam_credentials_configuration", IAMCredentialsConfiguration.class);
    discriminatorMapping.put("private_cert_configuration_root_ca", PrivateCertificateConfigurationRootCA.class);
    discriminatorMapping.put("private_cert_configuration_intermediate_ca", PrivateCertificateConfigurationIntermediateCA.class);
    discriminatorMapping.put("private_cert_configuration_template", PrivateCertificateConfigurationTemplate.class);
    discriminatorMapping.put("custom_credentials_configuration", CustomCredentialsConfiguration.class);
  }
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
    /** custom_credentials. */
    String CUSTOM_CREDENTIALS = "custom_credentials";
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
   * The format of the returned data.
   */
  public interface Format {
    /** pem. */
    String PEM = "pem";
    /** pem_bundle. */
    String PEM_BUNDLE = "pem_bundle";
  }

  /**
   * The format of the generated private key.
   */
  public interface PrivateKeyFormat {
    /** der. */
    String DER = "der";
    /** pkcs8. */
    String PKCS8 = "pkcs8";
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
  @SerializedName("lets_encrypt_environment")
  protected String letsEncryptEnvironment;
  @SerializedName("lets_encrypt_preferred_chain")
  protected String letsEncryptPreferredChain;
  @SerializedName("lets_encrypt_private_key")
  protected String letsEncryptPrivateKey;
  @SerializedName("cloud_internet_services_apikey")
  protected String cloudInternetServicesApikey;
  @SerializedName("cloud_internet_services_crn")
  protected String cloudInternetServicesCrn;
  @SerializedName("classic_infrastructure_username")
  protected String classicInfrastructureUsername;
  @SerializedName("classic_infrastructure_password")
  protected String classicInfrastructurePassword;
  protected Boolean disabled;
  @SerializedName("api_key")
  protected String apiKey;
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
  @SerializedName("max_ttl_seconds")
  protected Long maxTtlSeconds;
  @SerializedName("crl_expiry_seconds")
  protected Long crlExpirySeconds;
  @SerializedName("crl_disable")
  protected Boolean crlDisable;
  @SerializedName("issuing_certificates_urls_encoded")
  protected Boolean issuingCertificatesUrlsEncoded;
  @SerializedName("alt_names")
  protected List<String> altNames;
  @SerializedName("ip_sans")
  protected String ipSans;
  @SerializedName("uri_sans")
  protected String uriSans;
  @SerializedName("other_sans")
  protected List<String> otherSans;
  @SerializedName("ttl_seconds")
  protected Long ttlSeconds;
  protected String format;
  @SerializedName("private_key_format")
  protected String privateKeyFormat;
  @SerializedName("max_path_length")
  protected Long maxPathLength;
  @SerializedName("exclude_cn_from_sans")
  protected Boolean excludeCnFromSans;
  @SerializedName("permitted_dns_domains")
  protected List<String> permittedDnsDomains;
  protected List<String> ou;
  protected List<String> organization;
  protected List<String> country;
  protected List<String> locality;
  protected List<String> province;
  @SerializedName("street_address")
  protected List<String> streetAddress;
  @SerializedName("postal_code")
  protected List<String> postalCode;
  @SerializedName("serial_number")
  protected String serialNumber;
  protected PrivateCertificateCAData data;
  protected String issuer;
  @SerializedName("signing_method")
  protected String signingMethod;
  @SerializedName("certificate_authority")
  protected String certificateAuthority;
  @SerializedName("allowed_secret_groups")
  protected String allowedSecretGroups;
  @SerializedName("allow_localhost")
  protected Boolean allowLocalhost;
  @SerializedName("allowed_domains")
  protected List<String> allowedDomains;
  @SerializedName("allowed_domains_template")
  protected Boolean allowedDomainsTemplate;
  @SerializedName("allow_bare_domains")
  protected Boolean allowBareDomains;
  @SerializedName("allow_subdomains")
  protected Boolean allowSubdomains;
  @SerializedName("allow_glob_domains")
  protected Boolean allowGlobDomains;
  @SerializedName("allow_any_name")
  protected Boolean allowAnyName;
  @SerializedName("enforce_hostnames")
  protected Boolean enforceHostnames;
  @SerializedName("allow_ip_sans")
  protected Boolean allowIpSans;
  @SerializedName("allowed_uri_sans")
  protected List<String> allowedUriSans;
  @SerializedName("allowed_other_sans")
  protected List<String> allowedOtherSans;
  @SerializedName("server_flag")
  protected Boolean serverFlag;
  @SerializedName("client_flag")
  protected Boolean clientFlag;
  @SerializedName("code_signing_flag")
  protected Boolean codeSigningFlag;
  @SerializedName("email_protection_flag")
  protected Boolean emailProtectionFlag;
  @SerializedName("key_usage")
  protected List<String> keyUsage;
  @SerializedName("ext_key_usage")
  protected List<String> extKeyUsage;
  @SerializedName("ext_key_usage_oids")
  protected List<String> extKeyUsageOids;
  @SerializedName("use_csr_common_name")
  protected Boolean useCsrCommonName;
  @SerializedName("use_csr_sans")
  protected Boolean useCsrSans;
  @SerializedName("require_cn")
  protected Boolean requireCn;
  @SerializedName("policy_identifiers")
  protected List<String> policyIdentifiers;
  @SerializedName("basic_constraints_valid_for_non_ca")
  protected Boolean basicConstraintsValidForNonCa;
  @SerializedName("not_before_duration_seconds")
  protected Long notBeforeDurationSeconds;
  @SerializedName("code_engine_key_ref")
  protected String codeEngineKeyRef;
  @SerializedName("api_key_ref")
  protected String apiKeyRef;
  @SerializedName("code_engine")
  protected CustomCredentialsConfigurationCodeEngine codeEngine;
  protected CustomCredentialsConfigurationSchema schema;
  @SerializedName("task_timeout")
  protected String taskTimeout;

  protected Configuration() { }

  /**
   * Gets the configType.
   *
   * The configuration type. Can be one of: iam_credentials_configuration, public_cert_configuration_ca_lets_encrypt,
   * public_cert_configuration_dns_classic_infrastructure, public_cert_configuration_dns_cloud_internet_services,
   * private_cert_configuration_root_ca, private_cert_configuration_intermediate_ca,
   * private_cert_configuration_template, custom_credentials_configuration.
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
   * Gets the letsEncryptPrivateKey.
   *
   * The PEM-encoded private key of your Let's Encrypt account. The data must be formatted on a single line with
   * embedded newline characters.
   *
   * @return the letsEncryptPrivateKey
   */
  public String getLetsEncryptPrivateKey() {
    return letsEncryptPrivateKey;
  }

  /**
   * Gets the cloudInternetServicesApikey.
   *
   * An IBM Cloud API key that can list domains in your Cloud Internet Services instance and add DNS records.
   *
   * To grant Secrets Manager the ability to view the Cloud Internet Services instance and all of its domains, the API
   * key must be assigned the Reader service role on Internet Services (`internet-svcs`). In order to add DNS records
   * you need to assign the Manager role.
   *
   * If you want to manage specific domains, you can assign the Manager role for this specific domain.  For production
   * environments, it is recommended that you assign the Reader access role, and then use the
   * [IAM Policy Management API](https://cloud.ibm.com/apidocs/iam-policy-management#create-policy) to control specific
   * domains.
   *
   * If an IBM Cloud API key value is empty Secrets Manager tries to access your Cloud Internet Services instance  with
   * service-to-service authorization.
   *
   * For more information, see the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-prepare-order-certificates#authorize-cis).
   *
   * @return the cloudInternetServicesApikey
   */
  public String getCloudInternetServicesApikey() {
    return cloudInternetServicesApikey;
  }

  /**
   * Gets the cloudInternetServicesCrn.
   *
   * A CRN that uniquely identifies an IBM Cloud resource.
   *
   * @return the cloudInternetServicesCrn
   */
  public String getCloudInternetServicesCrn() {
    return cloudInternetServicesCrn;
  }

  /**
   * Gets the classicInfrastructureUsername.
   *
   * The username that is associated with your classic infrastructure account.
   *
   * In most cases, your classic infrastructure username is your `&lt;account_id&gt;_&lt;email_address&gt;`. For more
   * information, see the [docs](https://cloud.ibm.com/docs/account?topic=account-classic_keys).
   *
   * @return the classicInfrastructureUsername
   */
  public String getClassicInfrastructureUsername() {
    return classicInfrastructureUsername;
  }

  /**
   * Gets the classicInfrastructurePassword.
   *
   * Your classic infrastructure API key.
   *
   * For information about viewing and accessing your classic infrastructure API key, see the
   * [docs](https://cloud.ibm.com/docs/account?topic=account-classic_keys).
   *
   * @return the classicInfrastructurePassword
   */
  public String getClassicInfrastructurePassword() {
    return classicInfrastructurePassword;
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
   * Gets the apiKey.
   *
   * An IBM Cloud API key that can create and manage service IDs. The API key must be assigned the Editor platform role
   * on the Access Groups Service and the Operator platform role on the IAM Identity Service.  For more information, see
   * the [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-configure-iam-engine).
   *
   * @return the apiKey
   */
  public String getApiKey() {
    return apiKey;
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
   * arbitrary, imported_cert, public_cert, private_cert, iam_credentials, service_credentials, username_password, and
   * custom_credentials.
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
   * Gets the maxTtlSeconds.
   *
   * The maximum time-to-live (TTL) for certificates that are created by this CA in seconds.
   *
   * @return the maxTtlSeconds
   */
  public Long getMaxTtlSeconds() {
    return maxTtlSeconds;
  }

  /**
   * Gets the crlExpirySeconds.
   *
   * The time until the certificate revocation list (CRL) expires, in seconds.
   *
   * @return the crlExpirySeconds
   */
  public Long getCrlExpirySeconds() {
    return crlExpirySeconds;
  }

  /**
   * Gets the crlDisable.
   *
   * This field disables or enables certificate revocation list (CRL) building.
   *
   * If CRL building is disabled, a signed but zero-length CRL is returned when you're downloading the CRL. If CRL
   * building is enabled, it rebuilds the CRL.
   *
   * @return the crlDisable
   */
  public Boolean isCrlDisable() {
    return crlDisable;
  }

  /**
   * Gets the issuingCertificatesUrlsEncoded.
   *
   * This field determines whether to encode the URL of the issuing certificate in the certificates that are issued by
   * this certificate authority.
   *
   * @return the issuingCertificatesUrlsEncoded
   */
  public Boolean isIssuingCertificatesUrlsEncoded() {
    return issuingCertificatesUrlsEncoded;
  }

  /**
   * Gets the altNames.
   *
   * With the Subject Alternative Name field, you can specify additional hostnames to be protected by a single SSL
   * certificate.
   *
   * @return the altNames
   */
  public List<String> getAltNames() {
    return altNames;
  }

  /**
   * Gets the ipSans.
   *
   * The IP Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
   *
   * @return the ipSans
   */
  public String getIpSans() {
    return ipSans;
  }

  /**
   * Gets the uriSans.
   *
   * The URI Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
   *
   * @return the uriSans
   */
  public String getUriSans() {
    return uriSans;
  }

  /**
   * Gets the otherSans.
   *
   * The custom Object Identifier (OID) or UTF8-string Subject Alternative Names to define for the CA certificate.
   *
   * The alternative names must match the values that are specified in the `allowed_other_sans` field in the associated
   * certificate template. The format is the same as OpenSSL: `&lt;oid&gt;:&lt;type&gt;:&lt;value&gt;` where the current
   * valid type is `UTF8`.
   *
   * @return the otherSans
   */
  public List<String> getOtherSans() {
    return otherSans;
  }

  /**
   * Gets the ttlSeconds.
   *
   * he requested TTL, after which the certificate expires.
   *
   * @return the ttlSeconds
   */
  public Long getTtlSeconds() {
    return ttlSeconds;
  }

  /**
   * Gets the format.
   *
   * The format of the returned data.
   *
   * @return the format
   */
  public String getFormat() {
    return format;
  }

  /**
   * Gets the privateKeyFormat.
   *
   * The format of the generated private key.
   *
   * @return the privateKeyFormat
   */
  public String getPrivateKeyFormat() {
    return privateKeyFormat;
  }

  /**
   * Gets the maxPathLength.
   *
   * The maximum path length to encode in the generated certificate. `-1` means no limit.
   *
   * If the signing certificate has a maximum path length set, the path length is set to one less than that of the
   * signing certificate. A limit of `0` means a literal path length of zero.
   *
   * @return the maxPathLength
   */
  public Long getMaxPathLength() {
    return maxPathLength;
  }

  /**
   * Gets the excludeCnFromSans.
   *
   * This parameter controls whether the common name is excluded from Subject Alternative Names (SANs).
   *
   * If the common name is set to `true`, it is not included in DNS, or email SANs if they apply. This field can be
   * useful if the common name is a human-readable identifier, instead of a hostname or an email address.
   *
   * @return the excludeCnFromSans
   */
  public Boolean isExcludeCnFromSans() {
    return excludeCnFromSans;
  }

  /**
   * Gets the permittedDnsDomains.
   *
   * The allowed DNS domains or subdomains for the certificates that are to be signed and issued by this CA certificate.
   *
   * @return the permittedDnsDomains
   */
  public List<String> getPermittedDnsDomains() {
    return permittedDnsDomains;
  }

  /**
   * Gets the ou.
   *
   * The Organizational Unit (OU) values to define in the subject field of the resulting certificate.
   *
   * @return the ou
   */
  public List<String> getOu() {
    return ou;
  }

  /**
   * Gets the organization.
   *
   * The Organization (O) values to define in the subject field of the resulting certificate.
   *
   * @return the organization
   */
  public List<String> getOrganization() {
    return organization;
  }

  /**
   * Gets the country.
   *
   * The Country (C) values to define in the subject field of the resulting certificate.
   *
   * @return the country
   */
  public List<String> getCountry() {
    return country;
  }

  /**
   * Gets the locality.
   *
   * The Locality (L) values to define in the subject field of the resulting certificate.
   *
   * @return the locality
   */
  public List<String> getLocality() {
    return locality;
  }

  /**
   * Gets the province.
   *
   * The Province (ST) values to define in the subject field of the resulting certificate.
   *
   * @return the province
   */
  public List<String> getProvince() {
    return province;
  }

  /**
   * Gets the streetAddress.
   *
   * The street address values to define in the subject field of the resulting certificate.
   *
   * @return the streetAddress
   */
  public List<String> getStreetAddress() {
    return streetAddress;
  }

  /**
   * Gets the postalCode.
   *
   * The postal code values to define in the subject field of the resulting certificate.
   *
   * @return the postalCode
   */
  public List<String> getPostalCode() {
    return postalCode;
  }

  /**
   * Gets the serialNumber.
   *
   * The unique serial number that was assigned to a certificate by the issuing certificate authority.
   *
   * @return the serialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Gets the data.
   *
   * The configuration data of your Private Certificate.
   *
   * @return the data
   */
  public PrivateCertificateCAData getData() {
    return data;
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

  /**
   * Gets the allowedSecretGroups.
   *
   * This field scopes the creation of private certificates to only the secret groups that you specify.
   *
   * This field can be supplied as a comma-delimited list of secret group IDs.
   *
   * @return the allowedSecretGroups
   */
  public String getAllowedSecretGroups() {
    return allowedSecretGroups;
  }

  /**
   * Gets the allowLocalhost.
   *
   * This field indicates whether to allow `localhost` to be included as one of the requested common names.
   *
   * @return the allowLocalhost
   */
  public Boolean isAllowLocalhost() {
    return allowLocalhost;
  }

  /**
   * Gets the allowedDomains.
   *
   * The domains to define for the certificate template. This property is used along with the `allow_bare_domains` and
   * `allow_subdomains` options.
   *
   * @return the allowedDomains
   */
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }

  /**
   * Gets the allowedDomainsTemplate.
   *
   * This field indicates whether to allow the domains that are supplied in the `allowed_domains` field to contain
   * access control list (ACL) templates.
   *
   * @return the allowedDomainsTemplate
   */
  public Boolean isAllowedDomainsTemplate() {
    return allowedDomainsTemplate;
  }

  /**
   * Gets the allowBareDomains.
   *
   * This field indicates whether to allow clients to request private certificates that match the value of the actual
   * domains on the final certificate.
   *
   * For example, if you specify `example.com` in the `allowed_domains` field, you grant clients the ability to request
   * a certificate that contains the name `example.com` as one of the DNS values on the final certificate.
   *
   * **Important:** In some scenarios, allowing bare domains can be considered a security risk.
   *
   * @return the allowBareDomains
   */
  public Boolean isAllowBareDomains() {
    return allowBareDomains;
  }

  /**
   * Gets the allowSubdomains.
   *
   * This field indicates whether to allow clients to request private certificates with common names (CN) that are
   * subdomains of the CNs that are allowed by the other certificate template options. This includes wildcard
   * subdomains.
   *
   * For example, if `allowed_domains` has a value of `example.com` and `allow_subdomains`is set to `true`, then the
   * following subdomains are allowed: `foo.example.com`, `bar.example.com`, `*.example.com`.
   *
   * **Note:** This field is redundant if you use the `allow_any_name` option.
   *
   * @return the allowSubdomains
   */
  public Boolean isAllowSubdomains() {
    return allowSubdomains;
  }

  /**
   * Gets the allowGlobDomains.
   *
   * This field indicates whether to allow glob patterns, for example, `ftp*.example.com`, in the names that are
   * specified in the `allowed_domains` field.
   *
   * If set to `true`, clients are allowed to request private certificates with names that match the glob patterns.
   *
   * @return the allowGlobDomains
   */
  public Boolean isAllowGlobDomains() {
    return allowGlobDomains;
  }

  /**
   * Gets the allowAnyName.
   *
   * This field indicates whether to allow clients to request a private certificate that matches any common name.
   *
   * @return the allowAnyName
   */
  public Boolean isAllowAnyName() {
    return allowAnyName;
  }

  /**
   * Gets the enforceHostnames.
   *
   * This field indicates whether to enforce only valid hostnames for common names, DNS Subject Alternative Names, and
   * the host section of email addresses.
   *
   * @return the enforceHostnames
   */
  public Boolean isEnforceHostnames() {
    return enforceHostnames;
  }

  /**
   * Gets the allowIpSans.
   *
   * This field indicates whether to allow clients to request a private certificate with IP Subject Alternative Names.
   *
   * @return the allowIpSans
   */
  public Boolean isAllowIpSans() {
    return allowIpSans;
  }

  /**
   * Gets the allowedUriSans.
   *
   * The URI Subject Alternative Names to allow for private certificates.
   *
   * Values can contain glob patterns, for example `spiffe://hostname/_*`.
   *
   * @return the allowedUriSans
   */
  public List<String> getAllowedUriSans() {
    return allowedUriSans;
  }

  /**
   * Gets the allowedOtherSans.
   *
   * The custom Object Identifier (OID) or UTF8-string Subject Alternative Names (SANs) to allow for private
   * certificates.
   *
   * The format for each element in the list is the same as OpenSSL: `&lt;oid&gt;:&lt;type&gt;:&lt;value&gt;` where the
   * current valid type is `UTF8`. To allow any value for an OID, use `*` as its value. Alternatively, specify a single
   * `*` to allow any `other_sans` input.
   *
   * @return the allowedOtherSans
   */
  public List<String> getAllowedOtherSans() {
    return allowedOtherSans;
  }

  /**
   * Gets the serverFlag.
   *
   * This field indicates whether private certificates are flagged for server use.
   *
   * @return the serverFlag
   */
  public Boolean isServerFlag() {
    return serverFlag;
  }

  /**
   * Gets the clientFlag.
   *
   * This field indicates whether private certificates are flagged for client use.
   *
   * @return the clientFlag
   */
  public Boolean isClientFlag() {
    return clientFlag;
  }

  /**
   * Gets the codeSigningFlag.
   *
   * This field indicates whether private certificates are flagged for code signing use.
   *
   * @return the codeSigningFlag
   */
  public Boolean isCodeSigningFlag() {
    return codeSigningFlag;
  }

  /**
   * Gets the emailProtectionFlag.
   *
   * This field indicates whether private certificates are flagged for email protection use.
   *
   * @return the emailProtectionFlag
   */
  public Boolean isEmailProtectionFlag() {
    return emailProtectionFlag;
  }

  /**
   * Gets the keyUsage.
   *
   * The allowed key usage constraint to define for private certificates.
   *
   * You can find valid values in the [Go x509 package documentation](https://pkg.go.dev/crypto/x509#KeyUsage). Omit the
   * `KeyUsage` part of the value. Values are not case-sensitive. To specify no key usage constraints, set this field to
   * an empty list.
   *
   * @return the keyUsage
   */
  public List<String> getKeyUsage() {
    return keyUsage;
  }

  /**
   * Gets the extKeyUsage.
   *
   * The allowed extended key usage constraint on private certificates.
   *
   * You can find valid values in the [Go x509 package documentation](https://golang.org/pkg/crypto/x509/#ExtKeyUsage).
   * Omit the `ExtKeyUsage` part of the value. Values are not case-sensitive. To specify no key usage constraints, set
   * this field to an empty list.
   *
   * @return the extKeyUsage
   */
  public List<String> getExtKeyUsage() {
    return extKeyUsage;
  }

  /**
   * Gets the extKeyUsageOids.
   *
   * A list of extended key usage Object Identifiers (OIDs).
   *
   * @return the extKeyUsageOids
   */
  public List<String> getExtKeyUsageOids() {
    return extKeyUsageOids;
  }

  /**
   * Gets the useCsrCommonName.
   *
   * When used with the `private_cert_configuration_action_sign_csr` action, this field determines whether to use the
   * common name (CN) from a certificate signing request (CSR) instead of the CN that is included in the data of the
   * certificate.
   *
   * Does not include any requested Subject Alternative Names (SANs) in the CSR. To use the alternative names, include
   * the `use_csr_sans` property.
   *
   * @return the useCsrCommonName
   */
  public Boolean isUseCsrCommonName() {
    return useCsrCommonName;
  }

  /**
   * Gets the useCsrSans.
   *
   * When used with the `private_cert_configuration_action_sign_csr` action, this field determines whether to use the
   * Subject Alternative Names
   * (SANs) from a certificate signing request (CSR) instead of the SANs that are included in the data of the
   * certificate.
   *
   * This field does not include the common name in the CSR. To use the common name, include the `use_csr_common_name`
   * property.
   *
   * @return the useCsrSans
   */
  public Boolean isUseCsrSans() {
    return useCsrSans;
  }

  /**
   * Gets the requireCn.
   *
   * This field indicates whether to require a common name to create a private certificate.
   *
   * By default, a common name is required to generate a certificate. To make the `common_name` field optional, set the
   * `require_cn` option to `false`.
   *
   * @return the requireCn
   */
  public Boolean isRequireCn() {
    return requireCn;
  }

  /**
   * Gets the policyIdentifiers.
   *
   * A list of policy Object Identifiers (OIDs).
   *
   * @return the policyIdentifiers
   */
  public List<String> getPolicyIdentifiers() {
    return policyIdentifiers;
  }

  /**
   * Gets the basicConstraintsValidForNonCa.
   *
   * This field indicates whether to mark the Basic Constraints extension of an issued private certificate as valid for
   * non-CA certificates.
   *
   * @return the basicConstraintsValidForNonCa
   */
  public Boolean isBasicConstraintsValidForNonCa() {
    return basicConstraintsValidForNonCa;
  }

  /**
   * Gets the notBeforeDurationSeconds.
   *
   * The duration in seconds by which to backdate the `not_before` property of an issued private certificate.
   *
   * @return the notBeforeDurationSeconds
   */
  public Long getNotBeforeDurationSeconds() {
    return notBeforeDurationSeconds;
  }

  /**
   * Gets the codeEngineKeyRef.
   *
   * The IAM API key used by the credentials provider to access this Secrets Manager instance.
   *
   * @return the codeEngineKeyRef
   */
  public String getCodeEngineKeyRef() {
    return codeEngineKeyRef;
  }

  /**
   * Gets the apiKeyRef.
   *
   * The IAM credentials secret ID that is used for setting up a custom credentials engine configuration.
   *
   * @return the apiKeyRef
   */
  public String getApiKeyRef() {
    return apiKeyRef;
  }

  /**
   * Gets the codeEngine.
   *
   * The parameters required to configure Code Engine.
   *
   * @return the codeEngine
   */
  public CustomCredentialsConfigurationCodeEngine getCodeEngine() {
    return codeEngine;
  }

  /**
   * Gets the schema.
   *
   * The schema that defines by the Code Engine job to be used as input and output formats for this custom credentials
   * configuration.
   *
   * @return the schema
   */
  public CustomCredentialsConfigurationSchema getSchema() {
    return schema;
  }

  /**
   * Gets the taskTimeout.
   *
   * Specifies the maximum allowed time for a Code Engine task to be completed. After this time elapses, the task state
   * will changed to failed. The minimum value is 5 minutes and the maximum value is 24 hours. Default task time out is
   * 10 minutes.  The value can be either an integer that specifies the number of seconds, or the string representation
   * of a duration, such as `10m` or `2h`.
   *
   * @return the taskTimeout
   */
  public String getTaskTimeout() {
    return taskTimeout;
  }
}

