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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties that update the metadata of a secret version.
 */
public class UpdateSecretVersionMetadata extends GenericModel {

    @SerializedName("version_custom_metadata")
    protected Map<String, Object> versionCustomMetadata;

    /**
     * Builder.
     */
    public static class Builder {
        private Map<String, Object> versionCustomMetadata;

        /**
         * Instantiates a new Builder from an existing UpdateSecretVersionMetadata instance.
         *
         * @param updateSecretVersionMetadata the instance to initialize the Builder with
         */
        private Builder(UpdateSecretVersionMetadata updateSecretVersionMetadata) {
            this.versionCustomMetadata = updateSecretVersionMetadata.versionCustomMetadata;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a UpdateSecretVersionMetadata.
         *
         * @return the new UpdateSecretVersionMetadata instance
         */
        public UpdateSecretVersionMetadata build() {
            return new UpdateSecretVersionMetadata(this);
        }

        /**
         * Set the versionCustomMetadata.
         *
         * @param versionCustomMetadata the versionCustomMetadata
         * @return the UpdateSecretVersionMetadata builder
         */
        public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
            this.versionCustomMetadata = versionCustomMetadata;
            return this;
        }
    }

    protected UpdateSecretVersionMetadata() {
    }

    protected UpdateSecretVersionMetadata(Builder builder) {
        versionCustomMetadata = builder.versionCustomMetadata;
    }

    /**
     * New builder.
     *
     * @return a UpdateSecretVersionMetadata builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the versionCustomMetadata.
     * <p>
     * The secret version metadata that a user can customize.
     *
     * @return the versionCustomMetadata
     */
    public Map<String, Object> versionCustomMetadata() {
        return versionCustomMetadata;
    }
}

