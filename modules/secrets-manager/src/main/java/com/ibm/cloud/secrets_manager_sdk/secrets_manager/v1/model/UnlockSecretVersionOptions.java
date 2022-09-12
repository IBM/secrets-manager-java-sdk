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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The unlockSecretVersion options.
 */
public class UnlockSecretVersionOptions extends GenericModel {

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

    protected String secretType;
    protected String id;
    protected String versionId;
    protected List<String> locks;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String id;
        private String versionId;
        private List<String> locks;

        /**
         * Instantiates a new Builder from an existing UnlockSecretVersionOptions instance.
         *
         * @param unlockSecretVersionOptions the instance to initialize the Builder with
         */
        private Builder(UnlockSecretVersionOptions unlockSecretVersionOptions) {
            this.secretType = unlockSecretVersionOptions.secretType;
            this.id = unlockSecretVersionOptions.id;
            this.versionId = unlockSecretVersionOptions.versionId;
            this.locks = unlockSecretVersionOptions.locks;
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
         */
        public Builder(String secretType, String id, String versionId) {
            this.secretType = secretType;
            this.id = id;
            this.versionId = versionId;
        }

        /**
         * Builds a UnlockSecretVersionOptions.
         *
         * @return the new UnlockSecretVersionOptions instance
         */
        public UnlockSecretVersionOptions build() {
            return new UnlockSecretVersionOptions(this);
        }

        /**
         * Adds an locks to locks.
         *
         * @param locks the new locks
         * @return the UnlockSecretVersionOptions builder
         */
        public Builder addLocks(String locks) {
            com.ibm.cloud.sdk.core.util.Validator.notNull(locks,
                    "locks cannot be null");
            if (this.locks == null) {
                this.locks = new ArrayList<String>();
            }
            this.locks.add(locks);
            return this;
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the UnlockSecretVersionOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the UnlockSecretVersionOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the versionId.
         *
         * @param versionId the versionId
         * @return the UnlockSecretVersionOptions builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * Set the locks.
         * Existing locks will be replaced.
         *
         * @param locks the locks
         * @return the UnlockSecretVersionOptions builder
         */
        public Builder locks(List<String> locks) {
            this.locks = locks;
            return this;
        }
    }

    protected UnlockSecretVersionOptions() {
    }

    protected UnlockSecretVersionOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.versionId,
                "versionId cannot be empty");
        secretType = builder.secretType;
        id = builder.id;
        versionId = builder.versionId;
        locks = builder.locks;
    }

    /**
     * New builder.
     *
     * @return a UnlockSecretVersionOptions builder
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
     * Gets the locks.
     * <p>
     * A comma-separated list of locks to delete.
     *
     * @return the locks
     */
    public List<String> locks() {
        return locks;
    }
}

