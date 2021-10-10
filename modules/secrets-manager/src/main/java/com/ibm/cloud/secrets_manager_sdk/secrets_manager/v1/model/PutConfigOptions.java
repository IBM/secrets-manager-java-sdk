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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The putConfig options.
 */
public class PutConfigOptions extends GenericModel {

    public interface SecretType {
        /**
         * iam_credentials.
         */
        String IAM_CREDENTIALS = "iam_credentials";
    }

    protected EngineConfig engineConfig;
    protected String secretType;

    /**
     * Builder.
     */
    public static class Builder {
        private EngineConfig engineConfig;
        private String secretType;

        private Builder(PutConfigOptions putConfigOptions) {
            this.engineConfig = putConfigOptions.engineConfig;
            this.secretType = putConfigOptions.secretType;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param engineConfig the engineConfig
         */
        public Builder(EngineConfig engineConfig) {
            this.engineConfig = engineConfig;
        }

        /**
         * Builds a PutConfigOptions.
         *
         * @return the new PutConfigOptions instance
         */
        public PutConfigOptions build() {
            return new PutConfigOptions(this);
        }

        /**
         * Set the engineConfig.
         *
         * @param engineConfig the engineConfig
         * @return the PutConfigOptions builder
         */
        public Builder engineConfig(EngineConfig engineConfig) {
            this.engineConfig = engineConfig;
            return this;
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the PutConfigOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
    }

    protected PutConfigOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineConfig,
                "engineConfig cannot be null");
        engineConfig = builder.engineConfig;
        secretType = builder.secretType;
    }

    /**
     * New builder.
     *
     * @return a PutConfigOptions builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the engineConfig.
     * <p>
     * Properties to update for a secrets engine.
     *
     * @return the engineConfig
     */
    public EngineConfig engineConfig() {
        return engineConfig;
    }

    /**
     * Gets the secretType.
     *
     * @return the secretType
     */
    public String secretType() {
        return secretType;
    }
}

