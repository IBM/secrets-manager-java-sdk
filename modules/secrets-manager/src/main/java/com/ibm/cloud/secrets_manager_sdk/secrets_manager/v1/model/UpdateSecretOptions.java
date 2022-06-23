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
 * The updateSecret options.
 */
public class UpdateSecretOptions extends GenericModel {

    /**
     * The secret type.
     */
    public interface SecretType {
        /**
         * arbitrary.
         */
        String ARBITRARY = "arbitrary";
        /**
         * iam_credentials.
         */
        String IAM_CREDENTIALS = "iam_credentials";
        /**
         * imported_cert.
         */
        String IMPORTED_CERT = "imported_cert";
        /**
         * public_cert.
         */
        String PUBLIC_CERT = "public_cert";
        /**
         * private_cert.
         */
        String PRIVATE_CERT = "private_cert";
        /**
         * username_password.
         */
        String USERNAME_PASSWORD = "username_password";
        /**
         * kv.
         */
        String KV = "kv";
    }

    /**
     * The action to perform on the specified secret.
     */
    public interface Action {
        /**
         * rotate.
         */
        String ROTATE = "rotate";
        /**
         * restore.
         */
        String RESTORE = "restore";
        /**
         * revoke.
         */
        String REVOKE = "revoke";
        /**
         * delete_credentials.
         */
        String DELETE_CREDENTIALS = "delete_credentials";
    }

    protected String secretType;
    protected String id;
    protected String action;
    protected SecretAction secretAction;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String id;
        private String action;
        private SecretAction secretAction;

        private Builder(UpdateSecretOptions updateSecretOptions) {
            this.secretType = updateSecretOptions.secretType;
            this.id = updateSecretOptions.id;
            this.action = updateSecretOptions.action;
            this.secretAction = updateSecretOptions.secretAction;
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
         * @param action     the action
         */
        public Builder(String secretType, String id, String action) {
            this.secretType = secretType;
            this.id = id;
            this.action = action;
        }

        /**
         * Builds a UpdateSecretOptions.
         *
         * @return the new UpdateSecretOptions instance
         */
        public UpdateSecretOptions build() {
            return new UpdateSecretOptions(this);
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the UpdateSecretOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the UpdateSecretOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the action.
         *
         * @param action the action
         * @return the UpdateSecretOptions builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Set the secretAction.
         *
         * @param secretAction the secretAction
         * @return the UpdateSecretOptions builder
         */
        public Builder secretAction(SecretAction secretAction) {
            this.secretAction = secretAction;
            return this;
        }
    }

    protected UpdateSecretOptions() {
    }

    protected UpdateSecretOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
                "action cannot be null");
        secretType = builder.secretType;
        id = builder.id;
        action = builder.action;
        secretAction = builder.secretAction;
    }

    /**
     * New builder.
     *
     * @return a UpdateSecretOptions builder
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
     * Gets the action.
     * <p>
     * The action to perform on the specified secret.
     *
     * @return the action
     */
    public String action() {
        return action;
    }

    /**
     * Gets the secretAction.
     * <p>
     * The properties to update for the secret.
     *
     * @return the secretAction
     */
    public SecretAction secretAction() {
        return secretAction;
    }
}

