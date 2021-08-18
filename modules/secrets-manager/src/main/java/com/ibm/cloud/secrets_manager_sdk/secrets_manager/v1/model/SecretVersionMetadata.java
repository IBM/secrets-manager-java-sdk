/*
 * (C) Copyright IBM Corp. 2021.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretVersionMetadata.
 *
 * Classes which extend this class:
 * - ArbitrarySecretVersionMetadata
 * - UsernamePasswordSecretVersionMetadata
 * - IAMCredentialsSecretVersionMetadata
 * - CertificateSecretVersionMetadata
 */
public class SecretVersionMetadata extends GenericModel {

  protected String id;
  @SerializedName("creation_date")
  protected Date creationDate;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("auto_rotated")
  protected Boolean autoRotated;
  @SerializedName("serial_number")
  protected String serialNumber;
  @SerializedName("expiration_date")
  protected Date expirationDate;
  protected CertificateValidity validity;

  protected SecretVersionMetadata() {
  }

  /**
   * Gets the id.
   *
   * The ID of the secret version.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
   * Gets the serialNumber.
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
   * Gets the validity.
   *
   * @return the validity
   */
  public CertificateValidity getValidity() {
    return validity;
  }
}

