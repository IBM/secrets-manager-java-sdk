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
public class RotateUsernamePasswordSecretBody extends SecretAction {


    /**
     * Builder.
     */
    public static class Builder {
        private String password;
        private Map<String, Object> customMetadata;
        private Map<String, Object> versionCustomMetadata;

        /**
         * Instantiates a new Builder from an existing RotateUsernamePasswordSecretBody instance.
         *
         * @param rotateUsernamePasswordSecretBody the instance to initialize the Builder with
         */
        public Builder(SecretAction rotateUsernamePasswordSecretBody) {
            this.password = rotateUsernamePasswordSecretBody.password;
            this.customMetadata = rotateUsernamePasswordSecretBody.customMetadata;
            this.versionCustomMetadata = rotateUsernamePasswordSecretBody.versionCustomMetadata;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param password the password
         */
        public Builder(String password) {
            this.password = password;
        }

        /**
         * Builds a RotateUsernamePasswordSecretBody.
         *
         * @return the new RotateUsernamePasswordSecretBody instance
         */
        public RotateUsernamePasswordSecretBody build() {
            return new RotateUsernamePasswordSecretBody(this);
        }

        /**
         * Set the password.
         *
         * @param password the password
         * @return the RotateUsernamePasswordSecretBody builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Set the customMetadata.
         *
         * @param customMetadata the customMetadata
         * @return the RotateUsernamePasswordSecretBody builder
         */
        public Builder customMetadata(Map<String, Object> customMetadata) {
            this.customMetadata = customMetadata;
            return this;
        }

        /**
         * Set the versionCustomMetadata.
         *
         * @param versionCustomMetadata the versionCustomMetadata
         * @return the RotateUsernamePasswordSecretBody builder
         */
        public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
            this.versionCustomMetadata = versionCustomMetadata;
            return this;
        }
    }

    protected RotateUsernamePasswordSecretBody() {
    }

    protected RotateUsernamePasswordSecretBody(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
                "password cannot be null");
        password = builder.password;
        customMetadata = builder.customMetadata;
        versionCustomMetadata = builder.versionCustomMetadata;
    }

    /**
     * New builder.
     *
     * @return a RotateUsernamePasswordSecretBody builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

