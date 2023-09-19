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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties of the version metadata of your secret.
 *
 * Classes which extend this class:
 * - ArbitrarySecretVersionMetadata
 * - PublicCertificateVersionMetadata
 * - ImportedCertificateVersionMetadata
 * - KVSecretVersionMetadata
 * - UsernamePasswordSecretVersionMetadata
 * - IAMCredentialsSecretVersionMetadata
 * - PrivateCertificateVersionMetadata
 */
public class SecretVersionMetadata extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "secret_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("arbitrary", ArbitrarySecretVersionMetadata.class);
    discriminatorMapping.put("imported_cert", ImportedCertificateVersionMetadata.class);
    discriminatorMapping.put("public_cert", PublicCertificateVersionMetadata.class);
    discriminatorMapping.put("kv", KVSecretVersionMetadata.class);
    discriminatorMapping.put("username_password", UsernamePasswordSecretVersionMetadata.class);
    discriminatorMapping.put("iam_credentials", IAMCredentialsSecretVersionMetadata.class);
    discriminatorMapping.put("private_cert", PrivateCertificateVersionMetadata.class);
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

  /**
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   */
  public interface Alias {
    /** current. */
    String CURRENT = "current";
    /** previous. */
    String PREVIOUS = "previous";
  }

  @SerializedName("auto_rotated")
  protected Boolean autoRotated;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_at")
  protected Date createdAt;
  protected Boolean downloaded;
  protected String id;
  @SerializedName("secret_name")
  protected String secretName;
  @SerializedName("secret_type")
  protected String secretType;
  @SerializedName("secret_group_id")
  protected String secretGroupId;
  @SerializedName("payload_available")
  protected Boolean payloadAvailable;
  protected String alias;
  @SerializedName("version_custom_metadata")
  protected Map<String, Object> versionCustomMetadata;
  @SerializedName("secret_id")
  protected String secretId;
  @SerializedName("expiration_date")
  protected Date expirationDate;
  @SerializedName("serial_number")
  protected String serialNumber;
  protected CertificateValidity validity;
  @SerializedName("api_key_id")
  protected String apiKeyId;
  @SerializedName("service_id")
  protected String serviceId;

  protected SecretVersionMetadata() { }

  /**
   * Gets the autoRotated.
   *
   * Indicates whether the version of the secret was created by automatic rotation.
   *
   * @return the autoRotated
   */
  public Boolean isAutoRotated() {
    return autoRotated;
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
   * Gets the secretName.
   *
   * The human-readable name of your secret.
   *
   * @return the secretName
   */
  public String getSecretName() {
    return secretName;
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
   * Gets the payloadAvailable.
   *
   * Indicates whether the secret payload is available in this secret version.
   *
   * @return the payloadAvailable
   */
  public Boolean isPayloadAvailable() {
    return payloadAvailable;
  }

  /**
   * Gets the alias.
   *
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   *
   * @return the alias
   */
  public String getAlias() {
    return alias;
  }

  /**
   * Gets the versionCustomMetadata.
   *
   * The secret version metadata that a user can customize.
   *
   * @return the versionCustomMetadata
   */
  public Map<String, Object> getVersionCustomMetadata() {
    return versionCustomMetadata;
  }

  /**
   * Gets the secretId.
   *
   * A v4 UUID identifier.
   *
   * @return the secretId
   */
  public String getSecretId() {
    return secretId;
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
}

