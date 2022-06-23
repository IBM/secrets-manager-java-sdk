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

/**
 * Properties that describe an IBM Cloud classic infrastructure (SoftLayer) configuration.
 */
public class ConfigElementDefConfigClassicInfrastructureConfig extends ConfigElementDefConfig {


    /**
     * Builder.
     */
    public static class Builder {
        private String classicInfrastructureUsername;
        private String classicInfrastructurePassword;

        public Builder(ConfigElementDefConfig configElementDefConfigClassicInfrastructureConfig) {
            this.classicInfrastructureUsername = configElementDefConfigClassicInfrastructureConfig.classicInfrastructureUsername;
            this.classicInfrastructurePassword = configElementDefConfigClassicInfrastructureConfig.classicInfrastructurePassword;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param classicInfrastructureUsername the classicInfrastructureUsername
         * @param classicInfrastructurePassword the classicInfrastructurePassword
         */
        public Builder(String classicInfrastructureUsername, String classicInfrastructurePassword) {
            this.classicInfrastructureUsername = classicInfrastructureUsername;
            this.classicInfrastructurePassword = classicInfrastructurePassword;
        }

        /**
         * Builds a ConfigElementDefConfigClassicInfrastructureConfig.
         *
         * @return the new ConfigElementDefConfigClassicInfrastructureConfig instance
         */
        public ConfigElementDefConfigClassicInfrastructureConfig build() {
            return new ConfigElementDefConfigClassicInfrastructureConfig(this);
        }

        /**
         * Set the classicInfrastructureUsername.
         *
         * @param classicInfrastructureUsername the classicInfrastructureUsername
         * @return the ConfigElementDefConfigClassicInfrastructureConfig builder
         */
        public Builder classicInfrastructureUsername(String classicInfrastructureUsername) {
            this.classicInfrastructureUsername = classicInfrastructureUsername;
            return this;
        }

        /**
         * Set the classicInfrastructurePassword.
         *
         * @param classicInfrastructurePassword the classicInfrastructurePassword
         * @return the ConfigElementDefConfigClassicInfrastructureConfig builder
         */
        public Builder classicInfrastructurePassword(String classicInfrastructurePassword) {
            this.classicInfrastructurePassword = classicInfrastructurePassword;
            return this;
        }
    }

    protected ConfigElementDefConfigClassicInfrastructureConfig() {
    }

    protected ConfigElementDefConfigClassicInfrastructureConfig(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.classicInfrastructureUsername,
                "classicInfrastructureUsername cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.classicInfrastructurePassword,
                "classicInfrastructurePassword cannot be null");
        classicInfrastructureUsername = builder.classicInfrastructureUsername;
        classicInfrastructurePassword = builder.classicInfrastructurePassword;
    }

    /**
     * New builder.
     *
     * @return a ConfigElementDefConfigClassicInfrastructureConfig builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

