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

/**
 * Configuration that is used to generate IAM credentials.
 */
public class IAMCredentialsSecretEngineRootConfig extends EngineConfig {


    /**
     * Builder.
     */
    public static class Builder {
        private String apiKey;

        public Builder(EngineConfig iamCredentialsSecretEngineRootConfig) {
            this.apiKey = iamCredentialsSecretEngineRootConfig.apiKey;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param apiKey the apiKey
         */
        public Builder(String apiKey) {
            this.apiKey = apiKey;
        }

        /**
         * Builds a IAMCredentialsSecretEngineRootConfig.
         *
         * @return the new IAMCredentialsSecretEngineRootConfig instance
         */
        public IAMCredentialsSecretEngineRootConfig build() {
            return new IAMCredentialsSecretEngineRootConfig(this);
        }

        /**
         * Set the apiKey.
         *
         * @param apiKey the apiKey
         * @return the IAMCredentialsSecretEngineRootConfig builder
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
    }

    protected IAMCredentialsSecretEngineRootConfig(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiKey,
                "apiKey cannot be null");
        apiKey = builder.apiKey;
    }

    /**
     * New builder.
     *
     * @return a IAMCredentialsSecretEngineRootConfig builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

