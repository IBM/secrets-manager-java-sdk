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
 * Properties that describe a lock.
 */
public class SecretLockData extends GenericModel {

    protected String name;
    protected String description;
    @SerializedName("creation_date")
    protected Date creationDate;
    @SerializedName("created_by")
    protected String createdBy;
    protected Map<String, Object> attributes;
    @SerializedName("secret_version_id")
    protected String secretVersionId;
    @SerializedName("secret_id")
    protected String secretId;
    @SerializedName("secret_group_id")
    protected String secretGroupId;
    @SerializedName("last_update_date")
    protected Date lastUpdateDate;
    @SerializedName("secret_version_alias")
    protected String secretVersionAlias;

    protected SecretLockData() {
    }

    /**
     * Gets the name.
     * <p>
     * A human-readable name to assign to the secret lock.
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as a name for the secret lock.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the description.
     * <p>
     * An extended description of the secret lock.
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as a description for the secret
     * lock.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the creationDate.
     * <p>
     * The date the secret lock was created. The date format follows RFC 3339.
     *
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Gets the createdBy.
     * <p>
     * The unique identifier for the entity that created the secret lock.
     *
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Gets the attributes.
     * <p>
     * The information that is associated with a lock, such as resources CRNs to be used by automation.
     *
     * @return the attributes
     */
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    /**
     * Gets the secretVersionId.
     * <p>
     * The v4 UUID that uniquely identifies the secret version.
     *
     * @return the secretVersionId
     */
    public String getSecretVersionId() {
        return secretVersionId;
    }

    /**
     * Gets the secretId.
     * <p>
     * The v4 UUID that uniquely identifies the secret.
     *
     * @return the secretId
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * Gets the secretGroupId.
     * <p>
     * The v4 UUID that uniquely identifies the secret group to assign to this secret.
     * <p>
     * If you omit this parameter, your secret is assigned to the `default` secret group.
     *
     * @return the secretGroupId
     */
    public String getSecretGroupId() {
        return secretGroupId;
    }

    /**
     * Gets the lastUpdateDate.
     * <p>
     * Updates when the actual secret is modified. The date format follows RFC 3339.
     *
     * @return the lastUpdateDate
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Gets the secretVersionAlias.
     * <p>
     * A representation for the 2 last secret versions. Could be "current" for version (n) or "previous" for version
     * (n-1).
     *
     * @return the secretVersionAlias
     */
    public String getSecretVersionAlias() {
        return secretVersionAlias;
    }
}

