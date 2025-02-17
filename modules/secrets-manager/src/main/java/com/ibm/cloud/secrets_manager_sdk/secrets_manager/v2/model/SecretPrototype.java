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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Specify the properties for your secret.
 *
 * Classes which extend this class:
 * - ArbitrarySecretPrototype
 * - IAMCredentialsSecretPrototype
 * - ImportedCertificatePrototype
 * - KVSecretPrototype
 * - PrivateCertificatePrototype
 * - PublicCertificatePrototype
 * - ServiceCredentialsSecretPrototype
 * - UsernamePasswordSecretPrototype
 */
public class SecretPrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "secret_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("arbitrary", ArbitrarySecretPrototype.class);
    discriminatorMapping.put("iam_credentials", IAMCredentialsSecretPrototype.class);
    discriminatorMapping.put("imported_cert", ImportedCertificatePrototype.class);
    discriminatorMapping.put("kv", KVSecretPrototype.class);
    discriminatorMapping.put("private_cert", PrivateCertificatePrototype.class);
    discriminatorMapping.put("public_cert", PublicCertificatePrototype.class);
    discriminatorMapping.put("service_credentials", ServiceCredentialsSecretPrototype.class);
    discriminatorMapping.put("username_password", UsernamePasswordSecretPrototype.class);
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

  @SerializedName("custom_metadata")
  protected Map<String, Object> customMetadata;
  protected String description;
  @SerializedName("expiration_date")
  protected Date expirationDate;
  protected List<String> labels;
  protected String name;
  @SerializedName("secret_group_id")
  protected String secretGroupId;
  @SerializedName("secret_type")
  protected String secretType;
  protected String payload;
  @SerializedName("version_custom_metadata")
  protected Map<String, Object> versionCustomMetadata;
  protected String ttl;
  @SerializedName("access_groups")
  protected List<String> accessGroups;
  @SerializedName("service_id")
  protected String serviceId;
  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("reuse_api_key")
  protected Boolean reuseApiKey;
  protected RotationPolicy rotation;
  protected String certificate;
  protected String intermediate;
  @SerializedName("private_key")
  protected String privateKey;
  @SerializedName("managed_csr")
  protected ImportedCertificateManagedCsr managedCsr;
  protected Map<String, Object> data;
  @SerializedName("certificate_template")
  protected String certificateTemplate;
  @SerializedName("common_name")
  protected String commonName;
  @SerializedName("alt_names")
  protected List<String> altNames;
  @SerializedName("ip_sans")
  protected String ipSans;
  @SerializedName("uri_sans")
  protected String uriSans;
  @SerializedName("other_sans")
  protected List<String> otherSans;
  protected String csr;
  protected String format;
  @SerializedName("private_key_format")
  protected String privateKeyFormat;
  @SerializedName("exclude_cn_from_sans")
  protected Boolean excludeCnFromSans;
  @SerializedName("key_algorithm")
  protected String keyAlgorithm;
  protected String ca;
  protected String dns;
  @SerializedName("bundle_certs")
  protected Boolean bundleCerts;
  @SerializedName("source_service")
  protected ServiceCredentialsSecretSourceService sourceService;
  protected String username;
  protected String password;
  @SerializedName("password_generation_policy")
  protected PasswordGenerationPolicy passwordGenerationPolicy;

  protected SecretPrototype() { }

  /**
   * Gets the customMetadata.
   *
   * The secret metadata that a user can customize.
   *
   * @return the customMetadata
   */
  public Map<String, Object> customMetadata() {
    return customMetadata;
  }

  /**
   * Gets the description.
   *
   * An extended description of your secret.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret
   * group.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the expirationDate.
   *
   * The date when the secret material expires. The date format follows the `RFC 3339` format. Supported secret types:
   * Arbitrary, username_password.
   *
   * @return the expirationDate
   */
  public Date expirationDate() {
    return expirationDate;
  }

  /**
   * Gets the labels.
   *
   * Labels that you can use to search secrets in your instance. Only 30 labels can be created.
   *
   * Label can be between 2-64 characters, including spaces.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a label for your secret.
   *
   * @return the labels
   */
  public List<String> labels() {
    return labels;
  }

  /**
   * Gets the name.
   *
   * A human-readable name to assign to your secret.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a name for your secret.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the secretGroupId.
   *
   * A UUID identifier, or `default` secret group.
   *
   * @return the secretGroupId
   */
  public String secretGroupId() {
    return secretGroupId;
  }

  /**
   * Gets the secretType.
   *
   * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
   * service_credentials, kv, and username_password.
   *
   * @return the secretType
   */
  public String secretType() {
    return secretType;
  }

  /**
   * Gets the payload.
   *
   * The secret data that is assigned to an `arbitrary` secret.
   *
   * @return the payload
   */
  public String payload() {
    return payload;
  }

  /**
   * Gets the versionCustomMetadata.
   *
   * The secret version metadata that a user can customize.
   *
   * @return the versionCustomMetadata
   */
  public Map<String, Object> versionCustomMetadata() {
    return versionCustomMetadata;
  }

  /**
   * Gets the ttl.
   *
   * The time-to-live (TTL) or lease duration to assign to credentials that are generated. Supported secret types:
   * iam_credentials, service_credentials. The TTL defines how long generated credentials remain valid. The value can be
   * either an integer that specifies the number of seconds, or the string  representation of a duration, such as
   * `1440m` or `24h`. For the iam_credentials secret type, the TTL field is mandatory. The minimum duration is 1
   * minute. The maximum is 90 days. For the service_credentials secret type, the TTL field is optional. If it is set
   * the minimum duration is 1 day. The maximum is 90 days. By default, the TTL is set to 0. After the TTL is modified,
   * it will be applied only on the next secret rotation.
   *
   * @return the ttl
   */
  public String ttl() {
    return ttl;
  }

  /**
   * Gets the accessGroups.
   *
   * Access Groups that you can use for an `iam_credentials` secret.
   *
   * Up to 10 Access Groups can be used for each secret.
   *
   * @return the accessGroups
   */
  public List<String> accessGroups() {
    return accessGroups;
  }

  /**
   * Gets the serviceId.
   *
   * The service ID under which the API key (see the `api_key` field) is created.
   *
   * If you omit this parameter, Secrets Manager generates a new service ID for your secret at its creation, and adds it
   * to the access groups that you assign.
   *
   * Optionally, you can use this field to provide your own service ID if you prefer to manage its access directly or
   * retain the service ID after your secret expires, is rotated, or deleted. If you provide a service ID, do not
   * include the `access_groups` parameter.
   *
   * @return the serviceId
   */
  public String serviceId() {
    return serviceId;
  }

  /**
   * Gets the accountId.
   *
   * The ID of the account in which the IAM credentials are created. Use this field only if the target account is not
   * the same as the account of the Secrets Manager instance. Otherwise, the field can be omitted.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }

  /**
   * Gets the reuseApiKey.
   *
   * (IAM credentials) This parameter indicates whether to reuse the service ID and API key for future read operations.
   *
   * If it is set to `true`, the service reuses the current credentials. If it is set to `false`, a new service ID and
   * API key are generated each time that the secret is read or accessed.
   *
   * @return the reuseApiKey
   */
  public Boolean reuseApiKey() {
    return reuseApiKey;
  }

  /**
   * Gets the rotation.
   *
   * This field indicates whether Secrets Manager rotates your secrets automatically. Supported secret types:
   * username_password, private_cert, public_cert, iam_credentials.
   *
   * @return the rotation
   */
  public RotationPolicy rotation() {
    return rotation;
  }

  /**
   * Gets the certificate.
   *
   * Your PEM-encoded certificate. The data must be formatted on a single line with embedded newline characters.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
  }

  /**
   * Gets the intermediate.
   *
   * The PEM-encoded intermediate certificate that is associated with the root certificate. The data must be formatted
   * on a single line with embedded newline characters.
   *
   * @return the intermediate
   */
  public String intermediate() {
    return intermediate;
  }

  /**
   * Gets the privateKey.
   *
   * The PEM-encoded private key that is associated with the certificate. The data must be formatted on a single line
   * with embedded newline characters.
   *
   * @return the privateKey
   */
  public String privateKey() {
    return privateKey;
  }

  /**
   * Gets the managedCsr.
   *
   * The data specified to create the CSR and the private key.
   *
   * @return the managedCsr
   */
  public ImportedCertificateManagedCsr managedCsr() {
    return managedCsr;
  }

  /**
   * Gets the data.
   *
   * The payload data of a key-value secret.
   *
   * @return the data
   */
  public Map<String, Object> data() {
    return data;
  }

  /**
   * Gets the certificateTemplate.
   *
   * The name of the certificate template.
   *
   * @return the certificateTemplate
   */
  public String certificateTemplate() {
    return certificateTemplate;
  }

  /**
   * Gets the commonName.
   *
   * The Common Name (CN) represents the server name that is protected by the SSL certificate.
   *
   * @return the commonName
   */
  public String commonName() {
    return commonName;
  }

  /**
   * Gets the altNames.
   *
   * With the Subject Alternative Name field, you can specify additional hostnames to be protected by a single SSL
   * certificate.
   *
   * @return the altNames
   */
  public List<String> altNames() {
    return altNames;
  }

  /**
   * Gets the ipSans.
   *
   * The IP Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
   *
   * @return the ipSans
   */
  public String ipSans() {
    return ipSans;
  }

  /**
   * Gets the uriSans.
   *
   * The URI Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
   *
   * @return the uriSans
   */
  public String uriSans() {
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
  public List<String> otherSans() {
    return otherSans;
  }

  /**
   * Gets the csr.
   *
   * The certificate signing request.
   *
   * @return the csr
   */
  public String csr() {
    return csr;
  }

  /**
   * Gets the format.
   *
   * The format of the returned data.
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the privateKeyFormat.
   *
   * The format of the generated private key.
   *
   * @return the privateKeyFormat
   */
  public String privateKeyFormat() {
    return privateKeyFormat;
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
  public Boolean excludeCnFromSans() {
    return excludeCnFromSans;
  }

  /**
   * Gets the keyAlgorithm.
   *
   * The identifier for the cryptographic algorithm that is used to generate the public key that is associated with the
   * certificate.
   *
   * The algorithm that you select determines the encryption algorithm (`RSA` or `ECDSA`) and key size to be used to
   * generate keys and sign certificates. For longer living certificates, it is recommended to use longer keys to
   * provide more encryption protection. Allowed values:  `RSA2048`, `RSA4096`, `ECDSA256`, and `ECDSA384`.
   *
   * @return the keyAlgorithm
   */
  public String keyAlgorithm() {
    return keyAlgorithm;
  }

  /**
   * Gets the ca.
   *
   * The name of the certificate authority configuration.
   *
   * @return the ca
   */
  public String ca() {
    return ca;
  }

  /**
   * Gets the dns.
   *
   * The name of the DNS provider configuration.
   *
   * @return the dns
   */
  public String dns() {
    return dns;
  }

  /**
   * Gets the bundleCerts.
   *
   * This field indicates whether your issued certificate is bundled with intermediate certificates. Set to `false` for
   * the certificate file to contain only the issued certificate.
   *
   * @return the bundleCerts
   */
  public Boolean bundleCerts() {
    return bundleCerts;
  }

  /**
   * Gets the sourceService.
   *
   * The properties that are required to create the service credentials for the specified source service instance.
   *
   * @return the sourceService
   */
  public ServiceCredentialsSecretSourceService sourceService() {
    return sourceService;
  }

  /**
   * Gets the username.
   *
   * The username that is assigned to an `username_password` secret.
   *
   * @return the username
   */
  public String username() {
    return username;
  }

  /**
   * Gets the password.
   *
   * The password that is assigned to an `username_password` secret. If you omit this parameter, Secrets Manager
   * generates a new random password for your secret.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the passwordGenerationPolicy.
   *
   * Policy for auto-generated passwords.
   *
   * @return the passwordGenerationPolicy
   */
  public PasswordGenerationPolicy passwordGenerationPolicy() {
    return passwordGenerationPolicy;
  }
}

