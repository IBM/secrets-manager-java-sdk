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

/**
 * The request body of a `rotate` action.
 */
public class RotatePublicCertBody extends SecretAction {


    /**
     * Builder.
     */
    public static class Builder {
        private Boolean rotateKeys;
        private Map<String, Object> customMetadata;
        private Map<String, Object> versionCustomMetadata;

        /**
         * Instantiates a new Builder from an existing RotatePublicCertBody instance.
         *
         * @param rotatePublicCertBody the instance to initialize the Builder with
         */
        public Builder(SecretAction rotatePublicCertBody) {
            this.rotateKeys = rotatePublicCertBody.rotateKeys;
            this.customMetadata = rotatePublicCertBody.customMetadata;
            this.versionCustomMetadata = rotatePublicCertBody.versionCustomMetadata;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param rotateKeys the rotateKeys
         */
        public Builder(Boolean rotateKeys) {
            this.rotateKeys = rotateKeys;
        }

        /**
         * Builds a RotatePublicCertBody.
         *
         * @return the new RotatePublicCertBody instance
         */
        public RotatePublicCertBody build() {
            return new RotatePublicCertBody(this);
        }

        /**
         * Set the rotateKeys.
         *
         * @param rotateKeys the rotateKeys
         * @return the RotatePublicCertBody builder
         */
        public Builder rotateKeys(Boolean rotateKeys) {
            this.rotateKeys = rotateKeys;
            return this;
        }

        /**
         * Set the customMetadata.
         *
         * @param customMetadata the customMetadata
         * @return the RotatePublicCertBody builder
         */
        public Builder customMetadata(Map<String, Object> customMetadata) {
            this.customMetadata = customMetadata;
            return this;
        }

        /**
         * Set the versionCustomMetadata.
         *
         * @param versionCustomMetadata the versionCustomMetadata
         * @return the RotatePublicCertBody builder
         */
        public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
            this.versionCustomMetadata = versionCustomMetadata;
            return this;
        }
    }

    protected RotatePublicCertBody() {
    }

    protected RotatePublicCertBody(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rotateKeys,
                "rotateKeys cannot be null");
        rotateKeys = builder.rotateKeys;
        customMetadata = builder.customMetadata;
        versionCustomMetadata = builder.versionCustomMetadata;
    }

    /**
     * New builder.
     *
     * @return a RotatePublicCertBody builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

