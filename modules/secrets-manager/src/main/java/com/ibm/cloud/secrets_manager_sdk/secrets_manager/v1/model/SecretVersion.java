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
 * <p>
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

    protected SecretVersion() {
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
     * Gets the locksTotal.
     * <p>
     * The number of locks that are associated with a secret version.
     *
     * @return the locksTotal
     */
    public Long getLocksTotal() {
        return locksTotal;
    }

    /**
     * Gets the secretData.
     * <p>
     * The data that is associated with the secret version.
     * <p>
     * The data object contains the field `payload`.
     *
     * @return the secretData
     */
    public Map<String, Object> getSecretData() {
        return secretData;
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
     * Gets the validity.
     *
     * @return the validity
     */
    public CertificateValidity getValidity() {
        return validity;
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
     * Gets the state.
     * <p>
     * The secret state based on NIST SP 800-57. States are integers and correspond to the Pre-activation = 0, Active = 1,
     * Suspended = 2, Deactivated = 3, and Destroyed = 5 values.
     *
     * @return the state
     */
    public Long getState() {
        return state;
    }

    /**
     * Gets the stateDescription.
     * <p>
     * A text representation of the secret state.
     *
     * @return the stateDescription
     */
    public String getStateDescription() {
        return stateDescription;
    }

    /**
     * Gets the revocationTime.
     * <p>
     * The timestamp of the certificate revocation.
     *
     * @return the revocationTime
     */
    public Long getRevocationTime() {
        return revocationTime;
    }

    /**
     * Gets the revocationTimeRfc3339.
     * <p>
     * The date and time that the certificate was revoked. The date format follows RFC 3339.
     *
     * @return the revocationTimeRfc3339
     */
    public Date getRevocationTimeRfc3339() {
        return revocationTimeRfc3339;
    }
}

