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
package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties that are associated with a specific secret version.
 */
public class SecretVersion extends GenericModel {

    protected String id;
    @SerializedName("creation_date")
    protected Date creationDate;
    @SerializedName("created_by")
    protected String createdBy;
    @SerializedName("auto_rotated")
    protected Boolean autoRotated;

    /**
     * Builder.
     */
    public static class Builder {

        private Builder(SecretVersion secretVersion) {
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a SecretVersion.
         *
         * @return the new SecretVersion instance
         */
        public SecretVersion build() {
            return new SecretVersion(this);
        }
    }

    protected SecretVersion(Builder builder) {
    }

    /**
     * New builder.
     *
     * @return a SecretVersion builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the id.
     * <p>
     * The ID of the secret version.
     *
     * @return the id
     */
    public String id() {
        return id;
    }

    /**
     * Gets the creationDate.
     * <p>
     * The date that the version of the secret was created.
     *
     * @return the creationDate
     */
    public Date creationDate() {
        return creationDate;
    }

    /**
     * Gets the createdBy.
     * <p>
     * The unique identifier for the entity that created the secret.
     *
     * @return the createdBy
     */
    public String createdBy() {
        return createdBy;
    }

    /**
     * Gets the autoRotated.
     * <p>
     * Indicates whether the version of the secret was created by automatic rotation.
     *
     * @return the autoRotated
     */
    public Boolean autoRotated() {
        return autoRotated;
    }
}

