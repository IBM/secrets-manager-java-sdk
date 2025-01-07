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
 * Properties that describe the configuration update of an IBM Cloud classic infrastructure (SoftLayer).
 */
public class PublicCertificateConfigurationDNSClassicInfrastructurePatch extends ConfigurationPatch {


    /**
     * Builder.
     */
    public static class Builder {
        private String classicInfrastructureUsername;
        private String classicInfrastructurePassword;

        /**
         * Instantiates a new Builder from an existing PublicCertificateConfigurationDNSClassicInfrastructurePatch instance.
         *
         * @param publicCertificateConfigurationDnsClassicInfrastructurePatch the instance to initialize the Builder with
         */
        public Builder(ConfigurationPatch publicCertificateConfigurationDnsClassicInfrastructurePatch) {
            this.classicInfrastructureUsername = publicCertificateConfigurationDnsClassicInfrastructurePatch.classicInfrastructureUsername;
            this.classicInfrastructurePassword = publicCertificateConfigurationDnsClassicInfrastructurePatch.classicInfrastructurePassword;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a PublicCertificateConfigurationDNSClassicInfrastructurePatch.
         *
         * @return the new PublicCertificateConfigurationDNSClassicInfrastructurePatch instance
         */
        public PublicCertificateConfigurationDNSClassicInfrastructurePatch build() {
            return new PublicCertificateConfigurationDNSClassicInfrastructurePatch(this);
        }

        /**
         * Set the classicInfrastructureUsername.
         *
         * @param classicInfrastructureUsername the classicInfrastructureUsername
         * @return the PublicCertificateConfigurationDNSClassicInfrastructurePatch builder
         */
        public Builder classicInfrastructureUsername(String classicInfrastructureUsername) {
            this.classicInfrastructureUsername = classicInfrastructureUsername;
            return this;
        }

        /**
         * Set the classicInfrastructurePassword.
         *
         * @param classicInfrastructurePassword the classicInfrastructurePassword
         * @return the PublicCertificateConfigurationDNSClassicInfrastructurePatch builder
         */
        public Builder classicInfrastructurePassword(String classicInfrastructurePassword) {
            this.classicInfrastructurePassword = classicInfrastructurePassword;
            return this;
        }
    }

    protected PublicCertificateConfigurationDNSClassicInfrastructurePatch() {
    }

    protected PublicCertificateConfigurationDNSClassicInfrastructurePatch(Builder builder) {
        classicInfrastructureUsername = builder.classicInfrastructureUsername;
        classicInfrastructurePassword = builder.classicInfrastructurePassword;
    }

    /**
     * New builder.
     *
     * @return a PublicCertificateConfigurationDNSClassicInfrastructurePatch builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Construct a JSON merge-patch from the PublicCertificateConfigurationDNSClassicInfrastructurePatch.
     * <p>
     * Note that properties of the PublicCertificateConfigurationDNSClassicInfrastructurePatch with null values are not represented in the constructed
     * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
     *
     * @return a JSON merge-patch for the PublicCertificateConfigurationDNSClassicInfrastructurePatch
     */
    public Map<String, Object> asPatch() {
        return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
    }
}

