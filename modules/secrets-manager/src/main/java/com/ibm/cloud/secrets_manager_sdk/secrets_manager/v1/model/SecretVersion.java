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
 * SecretVersion.
 * <p>
 * Classes which extend this class:
 * - CertificateSecretVersion
 */
public class SecretVersion extends GenericModel {

    protected String id;
    protected String crn;
    @SerializedName("version_id")
    protected String versionId;
    @SerializedName("creation_date")
    protected Date creationDate;
    @SerializedName("created_by")
    protected String createdBy;
    protected CertificateValidity validity;
    @SerializedName("serial_number")
    protected String serialNumber;
    @SerializedName("expiration_date")
    protected Date expirationDate;
    @SerializedName("secret_data")
    protected CertificateSecretData secretData;

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
     * Gets the crn.
     * <p>
     * The Cloud Resource Name (CRN) that uniquely identifies the secret.
     *
     * @return the crn
     */
    public String getCrn() {
        return crn;
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
     * Gets the secretData.
     *
     * @return the secretData
     */
    public CertificateSecretData getSecretData() {
        return secretData;
    }
}

