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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Rotation.
 */
public class Rotation extends GenericModel {

    @SerializedName("auto_rotate")
    protected Boolean autoRotate;
    @SerializedName("rotate_keys")
    protected Boolean rotateKeys;

    /**
     * Builder.
     */
    public static class Builder {
        private Boolean autoRotate;
        private Boolean rotateKeys;

        private Builder(Rotation rotation) {
            this.autoRotate = rotation.autoRotate;
            this.rotateKeys = rotation.rotateKeys;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a Rotation.
         *
         * @return the new Rotation instance
         */
        public Rotation build() {
            return new Rotation(this);
        }

        /**
         * Set the autoRotate.
         *
         * @param autoRotate the autoRotate
         * @return the Rotation builder
         */
        public Builder autoRotate(Boolean autoRotate) {
            this.autoRotate = autoRotate;
            return this;
        }

        /**
         * Set the rotateKeys.
         *
         * @param rotateKeys the rotateKeys
         * @return the Rotation builder
         */
        public Builder rotateKeys(Boolean rotateKeys) {
            this.rotateKeys = rotateKeys;
            return this;
        }
    }

    protected Rotation(Builder builder) {
        autoRotate = builder.autoRotate;
        rotateKeys = builder.rotateKeys;
    }

    /**
     * New builder.
     *
     * @return a Rotation builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the autoRotate.
     * <p>
     * Determines whether Secrets Manager rotates your certificate automatically.
     * <p>
     * If set to `true`, the service reorders your certificate 31 days before it expires. To access the previous  version
     * of the certifcate, you can use the [Get a version of a secret](#get-secret-version) method.
     *
     * @return the autoRotate
     */
    public Boolean autoRotate() {
        return autoRotate;
    }

    /**
     * Gets the rotateKeys.
     * <p>
     * Determines whether Secrets Manager rotates the private key for your certificate automatically.
     * <p>
     * If set to `true`, the service generates and stores a new private key for your rotated certificate.
     *
     * @return the rotateKeys
     */
    public Boolean rotateKeys() {
        return rotateKeys;
    }
}

