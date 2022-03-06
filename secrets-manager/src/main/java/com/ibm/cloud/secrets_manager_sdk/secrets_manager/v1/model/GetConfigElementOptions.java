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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getConfigElement options.
 */
public class GetConfigElementOptions extends GenericModel {

    /**
     * The secret type.
     */
    public interface SecretType {
        /**
         * public_cert.
         */
        String PUBLIC_CERT = "public_cert";
        /**
         * private_cert.
         */
        String PRIVATE_CERT = "private_cert";
    }

    /**
     * The configuration element to define or manage.
     */
    public interface ConfigElement {
        /**
         * certificate_authorities.
         */
        String CERTIFICATE_AUTHORITIES = "certificate_authorities";
        /**
         * dns_providers.
         */
        String DNS_PROVIDERS = "dns_providers";
        /**
         * root_certificate_authorities.
         */
        String ROOT_CERTIFICATE_AUTHORITIES = "root_certificate_authorities";
        /**
         * intermediate_certificate_authorities.
         */
        String INTERMEDIATE_CERTIFICATE_AUTHORITIES = "intermediate_certificate_authorities";
        /**
         * certificate_templates.
         */
        String CERTIFICATE_TEMPLATES = "certificate_templates";
    }

    protected String configName;
    protected String secretType;
    protected String configElement;

    /**
     * Builder.
     */
    public static class Builder {
        private String configName;
        private String secretType;
        private String configElement;

        private Builder(GetConfigElementOptions getConfigElementOptions) {
            this.configName = getConfigElementOptions.configName;
            this.secretType = getConfigElementOptions.secretType;
            this.configElement = getConfigElementOptions.configElement;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param configName    the configName
         * @param secretType    the secretType
         * @param configElement the configElement
         */
        public Builder(String configName, String secretType, String configElement) {
            this.configName = configName;
            this.secretType = secretType;
            this.configElement = configElement;
        }

        /**
         * Builds a GetConfigElementOptions.
         *
         * @return the new GetConfigElementOptions instance
         */
        public GetConfigElementOptions build() {
            return new GetConfigElementOptions(this);
        }

        /**
         * Set the configName.
         *
         * @param configName the configName
         * @return the GetConfigElementOptions builder
         */
        public Builder configName(String configName) {
            this.configName = configName;
            return this;
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the GetConfigElementOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the configElement.
         *
         * @param configElement the configElement
         * @return the GetConfigElementOptions builder
         */
        public Builder configElement(String configElement) {
            this.configElement = configElement;
            return this;
        }
    }

    protected GetConfigElementOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.configName,
                "configName cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.configElement,
                "configElement cannot be empty");
        configName = builder.configName;
        secretType = builder.secretType;
        configElement = builder.configElement;
    }

    /**
     * New builder.
     *
     * @return a GetConfigElementOptions builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the configName.
     * <p>
     * The name of your configuration.
     *
     * @return the configName
     */
    public String configName() {
        return configName;
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
     * Gets the configElement.
     * <p>
     * The configuration element to define or manage.
     *
     * @return the configElement
     */
    public String configElement() {
        return configElement;
    }
}

