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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Your configuration update data.
 *
 * Classes which extend this class:
 * - IAMCredentialsConfigurationPatch
 * - PrivateCertificateConfigurationRootCAPatch
 * - PrivateCertificateConfigurationIntermediateCAPatch
 * - PrivateCertificateConfigurationTemplatePatch
 * - PublicCertificateConfigurationCALetsEncryptPatch
 * - PublicCertificateConfigurationDNSCloudInternetServicesPatch
 * - PublicCertificateConfigurationDNSClassicInfrastructurePatch
 */
public class ConfigurationPatch extends GenericModel {

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
   * The configuration of the Let's Encrypt CA environment.
   */
  public interface LetsEncryptEnvironment {
    /** production. */
    String PRODUCTION = "production";
    /** staging. */
    String STAGING = "staging";
  }

  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("max_ttl")
  protected String maxTtl;
  @SerializedName("crl_expiry")
  protected String crlExpiry;
  @SerializedName("crl_disable")
  protected Boolean crlDisable;
  @SerializedName("crl_distribution_points_encoded")
  protected Boolean crlDistributionPointsEncoded;
  @SerializedName("issuing_certificates_urls_encoded")
  protected Boolean issuingCertificatesUrlsEncoded;
  @SerializedName("allowed_secret_groups")
  protected String allowedSecretGroups;
  protected String ttl;
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
  @SerializedName("key_type")
  protected String keyType;
  @SerializedName("key_bits")
  protected Long keyBits;
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
  @SerializedName("require_cn")
  protected Boolean requireCn;
  @SerializedName("policy_identifiers")
  protected List<String> policyIdentifiers;
  @SerializedName("basic_constraints_valid_for_non_ca")
  protected Boolean basicConstraintsValidForNonCa;
  @SerializedName("not_before_duration")
  protected String notBeforeDuration;
  @SerializedName("lets_encrypt_environment")
  protected String letsEncryptEnvironment;
  @SerializedName("lets_encrypt_private_key")
  protected String letsEncryptPrivateKey;
  @SerializedName("lets_encrypt_preferred_chain")
  protected String letsEncryptPreferredChain;
  @SerializedName("cloud_internet_services_apikey")
  protected String cloudInternetServicesApikey;
  @SerializedName("cloud_internet_services_crn")
  protected String cloudInternetServicesCrn;
  @SerializedName("classic_infrastructure_username")
  protected String classicInfrastructureUsername;
  @SerializedName("classic_infrastructure_password")
  protected String classicInfrastructurePassword;

  protected ConfigurationPatch() { }

  /**
   * Gets the apiKey.
   *
   * An IBM Cloud API key that can create and manage service IDs. The API key must be assigned the Editor platform role
   * on the Access Groups Service and the Operator platform role on the IAM Identity Service.  For more information, see
   * the [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-configure-iam-engine).
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the maxTtl.
   *
   * The maximum time-to-live (TTL) for certificates that are created by this CA.
   *
   * The value can be supplied as a string representation of a duration in hours, for example '8760h'. In the API
   * response, this value is returned in seconds (integer).
   *
   * Minimum value is one hour (`1h`). Maximum value is 100 years (`876000h`).
   *
   * @return the maxTtl
   */
  public String maxTtl() {
    return maxTtl;
  }

  /**
   * Gets the crlExpiry.
   *
   * The time until the certificate revocation list (CRL) expires.
   *
   * The value can be supplied as a string representation of a duration in hours, such as `48h`. The default is 72
   * hours. In the API response, this value is returned in seconds (integer).
   *
   * **Note:** The CRL is rotated automatically before it expires.
   *
   * @return the crlExpiry
   */
  public String crlExpiry() {
    return crlExpiry;
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
  public Boolean crlDisable() {
    return crlDisable;
  }

  /**
   * Gets the crlDistributionPointsEncoded.
   *
   * This field determines whether to encode the certificate revocation list (CRL) distribution points in the
   * certificates that are issued by this certificate authority.
   *
   * @return the crlDistributionPointsEncoded
   */
  public Boolean crlDistributionPointsEncoded() {
    return crlDistributionPointsEncoded;
  }

  /**
   * Gets the issuingCertificatesUrlsEncoded.
   *
   * This field determines whether to encode the URL of the issuing certificate in the certificates that are issued by
   * this certificate authority.
   *
   * @return the issuingCertificatesUrlsEncoded
   */
  public Boolean issuingCertificatesUrlsEncoded() {
    return issuingCertificatesUrlsEncoded;
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
  public String allowedSecretGroups() {
    return allowedSecretGroups;
  }

  /**
   * Gets the ttl.
   *
   * The requested time-to-live (TTL) for certificates that are created by this CA. This field's value can't be longer
   * than the `max_ttl` limit.
   *
   * The value can be supplied as a string representation of a duration in hours, for example '8760h'. In the API
   * response, this value is returned in seconds (integer).
   *
   * @return the ttl
   */
  public String ttl() {
    return ttl;
  }

  /**
   * Gets the allowLocalhost.
   *
   * This field indicates whether to allow `localhost` to be included as one of the requested common names.
   *
   * @return the allowLocalhost
   */
  public Boolean allowLocalhost() {
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
  public List<String> allowedDomains() {
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
  public Boolean allowedDomainsTemplate() {
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
  public Boolean allowBareDomains() {
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
  public Boolean allowSubdomains() {
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
  public Boolean allowGlobDomains() {
    return allowGlobDomains;
  }

  /**
   * Gets the allowAnyName.
   *
   * This field indicates whether to allow clients to request a private certificate that matches any common name.
   *
   * @return the allowAnyName
   */
  public Boolean allowAnyName() {
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
  public Boolean enforceHostnames() {
    return enforceHostnames;
  }

  /**
   * Gets the allowIpSans.
   *
   * This field indicates whether to allow clients to request a private certificate with IP Subject Alternative Names.
   *
   * @return the allowIpSans
   */
  public Boolean allowIpSans() {
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
  public List<String> allowedUriSans() {
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
  public List<String> allowedOtherSans() {
    return allowedOtherSans;
  }

  /**
   * Gets the serverFlag.
   *
   * This field indicates whether private certificates are flagged for server use.
   *
   * @return the serverFlag
   */
  public Boolean serverFlag() {
    return serverFlag;
  }

  /**
   * Gets the clientFlag.
   *
   * This field indicates whether private certificates are flagged for client use.
   *
   * @return the clientFlag
   */
  public Boolean clientFlag() {
    return clientFlag;
  }

  /**
   * Gets the codeSigningFlag.
   *
   * This field indicates whether private certificates are flagged for code signing use.
   *
   * @return the codeSigningFlag
   */
  public Boolean codeSigningFlag() {
    return codeSigningFlag;
  }

  /**
   * Gets the emailProtectionFlag.
   *
   * This field indicates whether private certificates are flagged for email protection use.
   *
   * @return the emailProtectionFlag
   */
  public Boolean emailProtectionFlag() {
    return emailProtectionFlag;
  }

  /**
   * Gets the keyType.
   *
   * The type of private key to generate.
   *
   * @return the keyType
   */
  public String keyType() {
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
  public Long keyBits() {
    return keyBits;
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
  public List<String> keyUsage() {
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
  public List<String> extKeyUsage() {
    return extKeyUsage;
  }

  /**
   * Gets the extKeyUsageOids.
   *
   * A list of extended key usage Object Identifiers (OIDs).
   *
   * @return the extKeyUsageOids
   */
  public List<String> extKeyUsageOids() {
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
  public Boolean useCsrCommonName() {
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
  public Boolean useCsrSans() {
    return useCsrSans;
  }

  /**
   * Gets the ou.
   *
   * The Organizational Unit (OU) values to define in the subject field of the resulting certificate.
   *
   * @return the ou
   */
  public List<String> ou() {
    return ou;
  }

  /**
   * Gets the organization.
   *
   * The Organization (O) values to define in the subject field of the resulting certificate.
   *
   * @return the organization
   */
  public List<String> organization() {
    return organization;
  }

  /**
   * Gets the country.
   *
   * The Country (C) values to define in the subject field of the resulting certificate.
   *
   * @return the country
   */
  public List<String> country() {
    return country;
  }

  /**
   * Gets the locality.
   *
   * The Locality (L) values to define in the subject field of the resulting certificate.
   *
   * @return the locality
   */
  public List<String> locality() {
    return locality;
  }

  /**
   * Gets the province.
   *
   * The Province (ST) values to define in the subject field of the resulting certificate.
   *
   * @return the province
   */
  public List<String> province() {
    return province;
  }

  /**
   * Gets the streetAddress.
   *
   * The street address values to define in the subject field of the resulting certificate.
   *
   * @return the streetAddress
   */
  public List<String> streetAddress() {
    return streetAddress;
  }

  /**
   * Gets the postalCode.
   *
   * The postal code values to define in the subject field of the resulting certificate.
   *
   * @return the postalCode
   */
  public List<String> postalCode() {
    return postalCode;
  }

  /**
   * Gets the serialNumber.
   *
   * This field is deprecated. You can ignore its value.
   *
   * @return the serialNumber
   */
  public String serialNumber() {
    return serialNumber;
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
  public Boolean requireCn() {
    return requireCn;
  }

  /**
   * Gets the policyIdentifiers.
   *
   * A list of policy Object Identifiers (OIDs).
   *
   * @return the policyIdentifiers
   */
  public List<String> policyIdentifiers() {
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
  public Boolean basicConstraintsValidForNonCa() {
    return basicConstraintsValidForNonCa;
  }

  /**
   * Gets the notBeforeDuration.
   *
   * The duration in seconds by which to backdate the `not_before` property of an issued private certificate.
   *
   * The value can be supplied as a string representation of a duration, such as `30s`. In the API response, this value
   * is returned in seconds (integer).
   *
   * @return the notBeforeDuration
   */
  public String notBeforeDuration() {
    return notBeforeDuration;
  }

  /**
   * Gets the letsEncryptEnvironment.
   *
   * The configuration of the Let's Encrypt CA environment.
   *
   * @return the letsEncryptEnvironment
   */
  public String letsEncryptEnvironment() {
    return letsEncryptEnvironment;
  }

  /**
   * Gets the letsEncryptPrivateKey.
   *
   * The PEM-encoded private key of your Let's Encrypt account. The data must be formatted on a single line with
   * embedded newline characters.
   *
   * @return the letsEncryptPrivateKey
   */
  public String letsEncryptPrivateKey() {
    return letsEncryptPrivateKey;
  }

  /**
   * Gets the letsEncryptPreferredChain.
   *
   * This field supports only the chains that Let's Encrypt provides. Keep empty to use the default or supply a valid
   * Let's Encrypt-provided value. For a list of supported chains, see: https://letsencrypt.org/certificates/.
   *
   * @return the letsEncryptPreferredChain
   */
  public String letsEncryptPreferredChain() {
    return letsEncryptPreferredChain;
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
  public String cloudInternetServicesApikey() {
    return cloudInternetServicesApikey;
  }

  /**
   * Gets the cloudInternetServicesCrn.
   *
   * A CRN that uniquely identifies an IBM Cloud resource.
   *
   * @return the cloudInternetServicesCrn
   */
  public String cloudInternetServicesCrn() {
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
  public String classicInfrastructureUsername() {
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
  public String classicInfrastructurePassword() {
    return classicInfrastructurePassword;
  }

  /**
   * Construct a JSON merge-patch from the ConfigurationPatch.
   *
   * Note that properties of the ConfigurationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ConfigurationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

