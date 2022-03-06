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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretVersionMetadata.
 * <p>
 * Classes which extend this class:
 * - ArbitrarySecretVersionMetadata
 * - UsernamePasswordSecretVersionMetadata
 * - IAMCredentialsSecretVersionMetadata
 * - CertificateSecretVersionMetadata
 */
public class SecretVersionMetadata extends GenericModel {

    protected String id;
    @SerializedName("version_id")
    protected String versionId;
    @SerializedName("creation_date")
    protected Date creationDate;
    @SerializedName("created_by")
    protected String createdBy;
    @SerializedName("payload_available")
    protected Boolean payloadAvailable;
    protected Boolean downloaded;
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
     * <p>
     * The v4 UUID that uniquely identifies the secret.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the versionId.
     * <p>
     * The ID of the secret version.
     *
     * @return the versionId
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Gets the creationDate.
     * <p>
     * The date that the version of the secret was created.
     *
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Gets the createdBy.
     * <p>
     * The unique identifier for the entity that created the secret version.
     *
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Gets the payloadAvailable.
     * <p>
     * Indicates whether the payload for the secret version is stored and available.
     *
     * @return the payloadAvailable
     */
    public Boolean isPayloadAvailable() {
        return payloadAvailable;
    }

    /**
     * Gets the downloaded.
     * <p>
     * Indicates whether the secret data that is associated with a secret version was retrieved in a call to the service
     * API.
     *
     * @return the downloaded
     */
    public Boolean isDownloaded() {
        return downloaded;
    }

    /**
     * Gets the autoRotated.
     * <p>
     * Indicates whether the version of the secret was created by automatic rotation.
     *
     * @return the autoRotated
     */
    public Boolean isAutoRotated() {
        return autoRotated;
    }

    /**
     * Gets the serialNumber.
     * <p>
     * The unique serial number that was assigned to the certificate by the issuing certificate authority.
     *
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Gets the expirationDate.
     * <p>
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

