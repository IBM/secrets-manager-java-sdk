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
 * Properties that describe an IBM Cloud Internet Services (CIS) configuration.
 */
public class ConfigElementDefConfigCloudInternetServicesConfig extends ConfigElementDefConfig {


    /**
     * Builder.
     */
    public static class Builder {
        private String cisCrn;
        private String cisApikey;

        public Builder(ConfigElementDefConfig configElementDefConfigCloudInternetServicesConfig) {
            this.cisCrn = configElementDefConfigCloudInternetServicesConfig.cisCrn;
            this.cisApikey = configElementDefConfigCloudInternetServicesConfig.cisApikey;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param cisCrn the cisCrn
         */
        public Builder(String cisCrn) {
            this.cisCrn = cisCrn;
        }

        /**
         * Builds a ConfigElementDefConfigCloudInternetServicesConfig.
         *
         * @return the new ConfigElementDefConfigCloudInternetServicesConfig instance
         */
        public ConfigElementDefConfigCloudInternetServicesConfig build() {
            return new ConfigElementDefConfigCloudInternetServicesConfig(this);
        }

        /**
         * Set the cisCrn.
         *
         * @param cisCrn the cisCrn
         * @return the ConfigElementDefConfigCloudInternetServicesConfig builder
         */
        public Builder cisCrn(String cisCrn) {
            this.cisCrn = cisCrn;
            return this;
        }

        /**
         * Set the cisApikey.
         *
         * @param cisApikey the cisApikey
         * @return the ConfigElementDefConfigCloudInternetServicesConfig builder
         */
        public Builder cisApikey(String cisApikey) {
            this.cisApikey = cisApikey;
            return this;
        }
    }

    protected ConfigElementDefConfigCloudInternetServicesConfig(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cisCrn,
                "cisCrn cannot be null");
        cisCrn = builder.cisCrn;
        cisApikey = builder.cisApikey;
    }

    /**
     * New builder.
     *
     * @return a ConfigElementDefConfigCloudInternetServicesConfig builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

