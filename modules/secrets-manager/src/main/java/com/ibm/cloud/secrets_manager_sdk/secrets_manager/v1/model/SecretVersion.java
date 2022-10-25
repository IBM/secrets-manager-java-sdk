/*
 * (C) Copyright IBM Corp. 2022.
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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

import java.util.Date;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretVersion.
 *
 * Classes which extend this class:
 * - ArbitrarySecretVersion
 * - UsernamePasswordSecretVersion
 * - IAMCredentialsSecretVersion
 * - CertificateSecretVersion
 * - PrivateCertificateSecretVersion
 */
public class SecretVersion extends GenericModel {

  protected String id;
  @SerializedName("version_id")
  protected String versionId;
  @SerializedName("creation_date")
  protected Date creationDate;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("locks_total")
  protected Long locksTotal;
  @SerializedName("version_custom_metadata")
  protected Map<String, Object> versionCustomMetadata;
  @SerializedName("secret_data")
  protected Map<String, Object> secretData;
  @SerializedName("auto_rotated")
  protected Boolean autoRotated;
  protected CertificateValidity validity;
  @SerializedName("serial_number")
  protected String serialNumber;
  @SerializedName("expiration_date")
  protected Date expirationDate;
  protected Long state;
  @SerializedName("state_description")
  protected String stateDescription;
  @SerializedName("revocation_time")
  protected Long revocationTime;
  @SerializedName("revocation_time_rfc3339")
  protected Date revocationTimeRfc3339;

  protected SecretVersion() { }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies the secret.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the versionId.
   *
   * The ID of the secret version.
   *
   * @return the versionId
   */
  public String getVersionId() {
    return versionId;
  }

  /**
   * Gets the creationDate.
   *
   * The date that the version of the secret was created.
   *
   * @return the creationDate
   */
  public Date getCreationDate() {
    return creationDate;
  }

  /**
   * Gets the createdBy.
   *
   * The unique identifier for the entity that created the secret version.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the locksTotal.
   *
   * The number of locks that are associated with a secret version.
   *
   * @return the locksTotal
   */
  public Long getLocksTotal() {
    return locksTotal;
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
   * Gets the secretData.
   *
   * The data that is associated with the secret version.
   *
   * The data object contains the field `payload`.
   *
   * @return the secretData
   */
  public Map<String, Object> getSecretData() {
    return secretData;
  }

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
   * Gets the validity.
   *
   * @return the validity
   */
  public CertificateValidity getValidity() {
    return validity;
  }

  /**
   * Gets the serialNumber.
   *
   * The unique serial number that was assigned to the certificate by the issuing certificate authority.
   *
   * @return the serialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Gets the expirationDate.
   *
   * The date that the certificate expires. The date format follows RFC 3339.
   *
   * @return the expirationDate
   */
  public Date getExpirationDate() {
    return expirationDate;
  }

  /**
   * Gets the state.
   *
   * The secret state based on NIST SP 800-57. States are integers and correspond to the Pre-activation = 0, Active = 1,
   *  Suspended = 2, Deactivated = 3, and Destroyed = 5 values.
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
   * Gets the revocationTime.
   *
   * The timestamp of the certificate revocation.
   *
   * @return the revocationTime
   */
  public Long getRevocationTime() {
    return revocationTime;
  }

  /**
   * Gets the revocationTimeRfc3339.
   *
   * The date and time that the certificate was revoked. The date format follows RFC 3339.
   *
   * @return the revocationTimeRfc3339
   */
  public Date getRevocationTimeRfc3339() {
    return revocationTimeRfc3339;
  }
}

