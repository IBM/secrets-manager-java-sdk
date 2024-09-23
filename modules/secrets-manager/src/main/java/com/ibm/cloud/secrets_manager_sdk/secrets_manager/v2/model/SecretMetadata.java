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
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties of your secret metadata.
 *
 * Classes which extend this class:
 * - ArbitrarySecretMetadata
 * - IAMCredentialsSecretMetadata
 * - ImportedCertificateMetadata
 * - KVSecretMetadata
 * - PrivateCertificateMetadata
 * - PublicCertificateMetadata
 * - ServiceCredentialsSecretMetadata
 * - UsernamePasswordSecretMetadata
 */
public class SecretMetadata extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "secret_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("arbitrary", ArbitrarySecretMetadata.class);
    discriminatorMapping.put("iam_credentials", IAMCredentialsSecretMetadata.class);
    discriminatorMapping.put("imported_cert", ImportedCertificateMetadata.class);
    discriminatorMapping.put("kv", KVSecretMetadata.class);
    discriminatorMapping.put("private_cert", PrivateCertificateMetadata.class);
    discriminatorMapping.put("public_cert", PublicCertificateMetadata.class);
    discriminatorMapping.put("service_credentials", ServiceCredentialsSecretMetadata.class);
    discriminatorMapping.put("username_password", UsernamePasswordSecretMetadata.class);
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
   * A text representation of the secret state.
   */
  public interface StateDescription {
    /** pre_activation. */
    String PRE_ACTIVATION = "pre_activation";
    /** active. */
    String ACTIVE = "active";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** deactivated. */
    String DEACTIVATED = "deactivated";
    /** destroyed. */
    String DESTROYED = "destroyed";
  }

  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("custom_metadata")
  protected Map<String, Object> customMetadata;
  protected String description;
  protected Boolean downloaded;
  protected String id;
  protected List<String> labels;
  @SerializedName("locks_total")
  protected Long locksTotal;
  protected String name;
  @SerializedName("secret_group_id")
  protected String secretGroupId;
  @SerializedName("secret_type")
  protected String secretType;
  protected Long state;
  @SerializedName("state_description")
  protected String stateDescription;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("versions_total")
  protected Long versionsTotal;
  @SerializedName("referenced_by")
  protected List<String> referencedBy;
  @SerializedName("expiration_date")
  protected Date expirationDate;
  protected String ttl;
  @SerializedName("access_groups")
  protected List<String> accessGroups;
  @SerializedName("api_key_id")
  protected String apiKeyId;
  @SerializedName("service_id")
  protected String serviceId;
  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("service_id_is_static")
  protected Boolean serviceIdIsStatic;
  @SerializedName("reuse_api_key")
  protected Boolean reuseApiKey;
  protected RotationPolicy rotation;
  @SerializedName("next_rotation_date")
  protected Date nextRotationDate;
  @SerializedName("signing_algorithm")
  protected String signingAlgorithm;
  @SerializedName("alt_names")
  protected List<String> altNames;
  @SerializedName("common_name")
  protected String commonName;
  @SerializedName("intermediate_included")
  protected Boolean intermediateIncluded;
  protected String issuer;
  @SerializedName("key_algorithm")
  protected String keyAlgorithm;
  @SerializedName("private_key_included")
  protected Boolean privateKeyIncluded;
  @SerializedName("serial_number")
  protected String serialNumber;
  protected CertificateValidity validity;
  @SerializedName("certificate_authority")
  protected String certificateAuthority;
  @SerializedName("certificate_template")
  protected String certificateTemplate;
  @SerializedName("revocation_time_seconds")
  protected Long revocationTimeSeconds;
  @SerializedName("revocation_time_rfc3339")
  protected Date revocationTimeRfc3339;
  @SerializedName("issuance_info")
  protected CertificateIssuanceInfo issuanceInfo;
  @SerializedName("bundle_certs")
  protected Boolean bundleCerts;
  protected String ca;
  protected String dns;
  @SerializedName("source_service")
  protected ServiceCredentialsSecretSourceServiceRO sourceService;
  @SerializedName("password_generation_policy")
  protected PasswordGenerationPolicyRO passwordGenerationPolicy;

  protected SecretMetadata() { }

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
   * Gets the crn.
   *
   * A CRN that uniquely identifies an IBM Cloud resource.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the customMetadata.
   *
   * The secret metadata that a user can customize.
   *
   * @return the customMetadata
   */
  public Map<String, Object> getCustomMetadata() {
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
  public String getDescription() {
    return description;
  }

  /**
   * Gets the downloaded.
   *
   * This field indicates whether the secret data that is associated with a secret version was retrieved in a call to
   * the service API.
   *
   * @return the downloaded
   */
  public Boolean isDownloaded() {
    return downloaded;
  }

  /**
   * Gets the id.
   *
   * A v4 UUID identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
  public List<String> getLabels() {
    return labels;
  }

  /**
   * Gets the locksTotal.
   *
   * The number of locks of the secret.
   *
   * @return the locksTotal
   */
  public Long getLocksTotal() {
    return locksTotal;
  }

  /**
   * Gets the name.
   *
   * The human-readable name of your secret.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the secretGroupId.
   *
   * A v4 UUID identifier, or `default` secret group.
   *
   * @return the secretGroupId
   */
  public String getSecretGroupId() {
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
  public String getSecretType() {
    return secretType;
  }

  /**
   * Gets the state.
   *
   * The secret state that is based on `NIST SP 800-57`. States are integers and correspond to the `Pre-activation = 0`,
   * `Active = 1`,  `Suspended = 2`, `Deactivated = 3`, and `Destroyed = 5` values.
   *
   * @return the state
   */
  public Long getState() {
    return state;
  }

  /**
   * Gets the stateDescription.
   *
   * A text representation of the secret state.
   *
   * @return the stateDescription
   */
  public String getStateDescription() {
    return stateDescription;
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
   * Gets the versionsTotal.
   *
   * The number of versions of your secret.
   *
   * @return the versionsTotal
   */
  public Long getVersionsTotal() {
    return versionsTotal;
  }

  /**
   * Gets the referencedBy.
   *
   * The list of configurations that have a reference to the secret.
   *
   * @return the referencedBy
   */
  public List<String> getReferencedBy() {
    return referencedBy;
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
  public String getTtl() {
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
  public List<String> getAccessGroups() {
    return accessGroups;
  }

  /**
   * Gets the apiKeyId.
   *
   * The ID of the API key that is generated for this secret.
   *
   * @return the apiKeyId
   */
  public String getApiKeyId() {
    return apiKeyId;
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
  public String getServiceId() {
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
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the serviceIdIsStatic.
   *
   * Indicates whether an `iam_credentials` secret was created with a static service ID.
   *
   * If it is set to `true`, the service ID for the secret was provided by the user at secret creation. If it is set to
   * `false`, the service ID was generated by Secrets Manager.
   *
   * @return the serviceIdIsStatic
   */
  public Boolean isServiceIdIsStatic() {
    return serviceIdIsStatic;
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
  public Boolean isReuseApiKey() {
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
  public RotationPolicy getRotation() {
    return rotation;
  }

  /**
   * Gets the nextRotationDate.
   *
   * The date that the secret is scheduled for automatic rotation.
   *
   * The service automatically creates a new version of the secret on its next rotation date. This field exists only for
   * secrets that can be auto-rotated and an existing rotation policy.
   *
   * @return the nextRotationDate
   */
  public Date getNextRotationDate() {
    return nextRotationDate;
  }

  /**
   * Gets the signingAlgorithm.
   *
   * The identifier for the cryptographic algorithm that is used by the issuing certificate authority to sign a
   * certificate.
   *
   * @return the signingAlgorithm
   */
  public String getSigningAlgorithm() {
    return signingAlgorithm;
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
   * Gets the commonName.
   *
   * The Common Name (CN) represents the server name protected by the SSL certificate.
   *
   * @return the commonName
   */
  public String getCommonName() {
    return commonName;
  }

  /**
   * Gets the intermediateIncluded.
   *
   * Indicates whether the certificate was imported with an associated intermediate certificate.
   *
   * @return the intermediateIncluded
   */
  public Boolean isIntermediateIncluded() {
    return intermediateIncluded;
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
   * Gets the keyAlgorithm.
   *
   * The identifier for the cryptographic algorithm used to generate the public key that is associated with the
   * certificate.
   *
   * @return the keyAlgorithm
   */
  public String getKeyAlgorithm() {
    return keyAlgorithm;
  }

  /**
   * Gets the privateKeyIncluded.
   *
   * Indicates whether the certificate was imported with an associated private key.
   *
   * @return the privateKeyIncluded
   */
  public Boolean isPrivateKeyIncluded() {
    return privateKeyIncluded;
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
   * Gets the validity.
   *
   * The date and time that the certificate validity period begins and ends.
   *
   * @return the validity
   */
  public CertificateValidity getValidity() {
    return validity;
  }

  /**
   * Gets the certificateAuthority.
   *
   * The intermediate certificate authority that signed this certificate.
   *
   * @return the certificateAuthority
   */
  public String getCertificateAuthority() {
    return certificateAuthority;
  }

  /**
   * Gets the certificateTemplate.
   *
   * The name of the certificate template.
   *
   * @return the certificateTemplate
   */
  public String getCertificateTemplate() {
    return certificateTemplate;
  }

  /**
   * Gets the revocationTimeSeconds.
   *
   * The timestamp of the certificate revocation.
   *
   * @return the revocationTimeSeconds
   */
  public Long getRevocationTimeSeconds() {
    return revocationTimeSeconds;
  }

  /**
   * Gets the revocationTimeRfc3339.
   *
   * The date and time that the certificate was revoked. The date format follows `RFC 3339`.
   *
   * @return the revocationTimeRfc3339
   */
  public Date getRevocationTimeRfc3339() {
    return revocationTimeRfc3339;
  }

  /**
   * Gets the issuanceInfo.
   *
   * Issuance information that is associated with your certificate.
   *
   * @return the issuanceInfo
   */
  public CertificateIssuanceInfo getIssuanceInfo() {
    return issuanceInfo;
  }

  /**
   * Gets the bundleCerts.
   *
   * Indicates whether the issued certificate is bundled with intermediate certificates.
   *
   * @return the bundleCerts
   */
  public Boolean isBundleCerts() {
    return bundleCerts;
  }

  /**
   * Gets the ca.
   *
   * The name of the certificate authority configuration.
   *
   * @return the ca
   */
  public String getCa() {
    return ca;
  }

  /**
   * Gets the dns.
   *
   * The name of the DNS provider configuration.
   *
   * @return the dns
   */
  public String getDns() {
    return dns;
  }

  /**
   * Gets the sourceService.
   *
   * The properties of the resource key that was created for this source service instance.
   *
   * @return the sourceService
   */
  public ServiceCredentialsSecretSourceServiceRO getSourceService() {
    return sourceService;
  }

  /**
   * Gets the passwordGenerationPolicy.
   *
   * Policy for auto-generated passwords.
   *
   * @return the passwordGenerationPolicy
   */
  public PasswordGenerationPolicyRO getPasswordGenerationPolicy() {
    return passwordGenerationPolicy;
  }
}

