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
 * Properties that describe a rotation policy.
 */
public class GetSecretPolicyRotationResourcesItem extends GenericModel {

    /**
     * The MIME type that represents the policy. Currently, only the default is supported.
     */
    public interface Type {
        /**
         * application/vnd.ibm.secrets-manager.secret.policy+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_POLICY_JSON = "application/vnd.ibm.secrets-manager.secret.policy+json";
    }

    protected String id;
    protected String crn;
    @SerializedName("creation_date")
    protected Date creationDate;
    @SerializedName("created_by")
    protected String createdBy;
    @SerializedName("last_update_date")
    protected Date lastUpdateDate;
    @SerializedName("updated_by")
    protected String updatedBy;
    protected String type;
    protected SecretPolicyRotationRotation rotation;

    /**
     * Gets the id.
     * <p>
     * The v4 UUID that uniquely identifies the policy.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the crn.
     * <p>
     * The Cloud Resource Name (CRN) that uniquely identifies your cloud resources.
     *
     * @return the crn
     */
    public String getCrn() {
        return crn;
    }

    /**
     * Gets the creationDate.
     * <p>
     * The date the policy was created. The date format follows RFC 3339.
     *
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Gets the createdBy.
     * <p>
     * The unique identifier for the entity that created the policy.
     *
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Gets the lastUpdateDate.
     * <p>
     * Updates when the policy is replaced or modified. The date format follows RFC 3339.
     *
     * @return the lastUpdateDate
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Gets the updatedBy.
     * <p>
     * The unique identifier for the entity that updated the policy.
     *
     * @return the updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Gets the type.
     * <p>
     * The MIME type that represents the policy. Currently, only the default is supported.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the rotation.
     *
     * @return the rotation
     */
    public SecretPolicyRotationRotation getRotation() {
        return rotation;
    }
}

