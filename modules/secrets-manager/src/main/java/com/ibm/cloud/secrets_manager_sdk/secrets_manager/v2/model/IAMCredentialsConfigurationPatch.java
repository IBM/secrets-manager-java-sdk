/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * The configuration update of the IAM Credentials engine.
 */
public class IAMCredentialsConfigurationPatch extends ConfigurationPatch {


    /**
     * Builder.
     */
    public static class Builder {
        private String apiKey;
        private Boolean disabled;

        /**
         * Instantiates a new Builder from an existing IAMCredentialsConfigurationPatch instance.
         *
         * @param iamCredentialsConfigurationPatch the instance to initialize the Builder with
         */
        public Builder(ConfigurationPatch iamCredentialsConfigurationPatch) {
            this.apiKey = iamCredentialsConfigurationPatch.apiKey;
            this.disabled = iamCredentialsConfigurationPatch.disabled;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a IAMCredentialsConfigurationPatch.
         *
         * @return the new IAMCredentialsConfigurationPatch instance
         */
        public IAMCredentialsConfigurationPatch build() {
            return new IAMCredentialsConfigurationPatch(this);
        }

        /**
         * Set the apiKey.
         *
         * @param apiKey the apiKey
         * @return the IAMCredentialsConfigurationPatch builder
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Set the disabled.
         *
         * @param disabled the disabled
         * @return the IAMCredentialsConfigurationPatch builder
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
    }

    protected IAMCredentialsConfigurationPatch() {
    }

    protected IAMCredentialsConfigurationPatch(Builder builder) {
        apiKey = builder.apiKey;
        disabled = builder.disabled;
    }

    /**
     * New builder.
     *
     * @return a IAMCredentialsConfigurationPatch builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Construct a JSON merge-patch from the IAMCredentialsConfigurationPatch.
     * <p>
     * Note that properties of the IAMCredentialsConfigurationPatch with null values are not represented in the constructed
     * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
     *
     * @return a JSON merge-patch for the IAMCredentialsConfigurationPatch
     */
    public Map<String, Object> asPatch() {
        return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
    }
}

