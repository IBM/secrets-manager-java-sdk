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
 * The lockSecretVersion options.
 */
public class LockSecretVersionOptions extends GenericModel {

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
     * An optional lock mode. At lock creation, you can set one of the following modes to clear any matching locks on a
     * secret version.
     * <p>
     * - `exclusive`: Removes any other locks with matching names if they are found in the previous version of the secret.
     * - `exclusive_delete`: Same as `exclusive`, but also permanently deletes the data of the previous secret version if
     * it doesn't have any locks.
     */
    public interface Mode {
        /**
         * exclusive.
         */
        String EXCLUSIVE = "exclusive";
        /**
         * exclusive_delete.
         */
        String EXCLUSIVE_DELETE = "exclusive_delete";
    }

    protected String secretType;
    protected String id;
    protected String versionId;
    protected List<LockSecretBodyLocksItem> locks;
    protected String mode;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String id;
        private String versionId;
        private List<LockSecretBodyLocksItem> locks;
        private String mode;

        private Builder(LockSecretVersionOptions lockSecretVersionOptions) {
            this.secretType = lockSecretVersionOptions.secretType;
            this.id = lockSecretVersionOptions.id;
            this.versionId = lockSecretVersionOptions.versionId;
            this.locks = lockSecretVersionOptions.locks;
            this.mode = lockSecretVersionOptions.mode;
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
         * Builds a LockSecretVersionOptions.
         *
         * @return the new LockSecretVersionOptions instance
         */
        public LockSecretVersionOptions build() {
            return new LockSecretVersionOptions(this);
        }

        /**
         * Adds an locks to locks.
         *
         * @param locks the new locks
         * @return the LockSecretVersionOptions builder
         */
        public Builder addLocks(LockSecretBodyLocksItem locks) {
            com.ibm.cloud.sdk.core.util.Validator.notNull(locks,
                    "locks cannot be null");
            if (this.locks == null) {
                this.locks = new ArrayList<LockSecretBodyLocksItem>();
            }
            this.locks.add(locks);
            return this;
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the LockSecretVersionOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the LockSecretVersionOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the versionId.
         *
         * @param versionId the versionId
         * @return the LockSecretVersionOptions builder
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
         * @return the LockSecretVersionOptions builder
         */
        public Builder locks(List<LockSecretBodyLocksItem> locks) {
            this.locks = locks;
            return this;
        }

        /**
         * Set the mode.
         *
         * @param mode the mode
         * @return the LockSecretVersionOptions builder
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }
    }

    protected LockSecretVersionOptions(Builder builder) {
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
        mode = builder.mode;
    }

    /**
     * New builder.
     *
     * @return a LockSecretVersionOptions builder
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
     * The lock data to be attached to a secret version.
     *
     * @return the locks
     */
    public List<LockSecretBodyLocksItem> locks() {
        return locks;
    }

    /**
     * Gets the mode.
     * <p>
     * An optional lock mode. At lock creation, you can set one of the following modes to clear any matching locks on a
     * secret version.
     * <p>
     * - `exclusive`: Removes any other locks with matching names if they are found in the previous version of the secret.
     * - `exclusive_delete`: Same as `exclusive`, but also permanently deletes the data of the previous secret version if
     * it doesn't have any locks.
     *
     * @return the mode
     */
    public String mode() {
        return mode;
    }
}

