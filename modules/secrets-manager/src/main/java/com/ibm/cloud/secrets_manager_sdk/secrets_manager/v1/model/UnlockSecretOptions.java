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
 * The unlockSecret options.
 */
public class UnlockSecretOptions extends GenericModel {

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
    protected List<String> locks;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String id;
        private List<String> locks;

        private Builder(UnlockSecretOptions unlockSecretOptions) {
            this.secretType = unlockSecretOptions.secretType;
            this.id = unlockSecretOptions.id;
            this.locks = unlockSecretOptions.locks;
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
         */
        public Builder(String secretType, String id) {
            this.secretType = secretType;
            this.id = id;
        }

        /**
         * Builds a UnlockSecretOptions.
         *
         * @return the new UnlockSecretOptions instance
         */
        public UnlockSecretOptions build() {
            return new UnlockSecretOptions(this);
        }

        /**
         * Adds an locks to locks.
         *
         * @param locks the new locks
         * @return the UnlockSecretOptions builder
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
         * @return the UnlockSecretOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the UnlockSecretOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the locks.
         * Existing locks will be replaced.
         *
         * @param locks the locks
         * @return the UnlockSecretOptions builder
         */
        public Builder locks(List<String> locks) {
            this.locks = locks;
            return this;
        }
    }

    protected UnlockSecretOptions() {
    }

    protected UnlockSecretOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        secretType = builder.secretType;
        id = builder.id;
        locks = builder.locks;
    }

    /**
     * New builder.
     *
     * @return a UnlockSecretOptions builder
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

