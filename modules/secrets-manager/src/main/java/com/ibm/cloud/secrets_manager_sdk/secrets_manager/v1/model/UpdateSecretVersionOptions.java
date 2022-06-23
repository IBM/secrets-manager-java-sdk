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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSecretVersion options.
 */
public class UpdateSecretVersionOptions extends GenericModel {

    /**
     * The secret type.
     */
    public interface SecretType {
        /**
         * private_cert.
         */
        String PRIVATE_CERT = "private_cert";
    }

    /**
     * The action to perform on the specified secret version.
     */
    public interface Action {
        /**
         * revoke.
         */
        String REVOKE = "revoke";
    }

    protected String secretType;
    protected String id;
    protected String versionId;
    protected String action;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String id;
        private String versionId;
        private String action;

        private Builder(UpdateSecretVersionOptions updateSecretVersionOptions) {
            this.secretType = updateSecretVersionOptions.secretType;
            this.id = updateSecretVersionOptions.id;
            this.versionId = updateSecretVersionOptions.versionId;
            this.action = updateSecretVersionOptions.action;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param secretType the secretType
         * @param id         the id
         * @param versionId  the versionId
         * @param action     the action
         */
        public Builder(String secretType, String id, String versionId, String action) {
            this.secretType = secretType;
            this.id = id;
            this.versionId = versionId;
            this.action = action;
        }

        /**
         * Builds a UpdateSecretVersionOptions.
         *
         * @return the new UpdateSecretVersionOptions instance
         */
        public UpdateSecretVersionOptions build() {
            return new UpdateSecretVersionOptions(this);
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the UpdateSecretVersionOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the UpdateSecretVersionOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the versionId.
         *
         * @param versionId the versionId
         * @return the UpdateSecretVersionOptions builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * Set the action.
         *
         * @param action the action
         * @return the UpdateSecretVersionOptions builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }
    }

    protected UpdateSecretVersionOptions() {
    }

    protected UpdateSecretVersionOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.versionId,
                "versionId cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
                "action cannot be null");
        secretType = builder.secretType;
        id = builder.id;
        versionId = builder.versionId;
        action = builder.action;
    }

    /**
     * New builder.
     *
     * @return a UpdateSecretVersionOptions builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the secretType.
     * <p>
     * The secret type.
     *
     * @return the secretType
     */
    public String secretType() {
        return secretType;
    }

    /**
     * Gets the id.
     * <p>
     * The v4 UUID that uniquely identifies the secret.
     *
     * @return the id
     */
    public String id() {
        return id;
    }

    /**
     * Gets the versionId.
     * <p>
     * The v4 UUID that uniquely identifies the secret version. You can also use `previous` to retrieve the previous
     * version.
     * <p>
     * **Note:** To find the version ID of a secret, use the [Get secret metadata](#get-secret-metadata) method and check
     * the response details.
     *
     * @return the versionId
     */
    public String versionId() {
        return versionId;
    }

    /**
     * Gets the action.
     * <p>
     * The action to perform on the specified secret version.
     *
     * @return the action
     */
    public String action() {
        return action;
    }
}

