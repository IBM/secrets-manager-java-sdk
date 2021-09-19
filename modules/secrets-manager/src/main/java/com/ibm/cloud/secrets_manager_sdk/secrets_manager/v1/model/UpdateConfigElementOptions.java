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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateConfigElement options.
 */
public class UpdateConfigElementOptions extends GenericModel {

    /**
     * The secret type.
     */
    public interface SecretType {
        /**
         * public_cert.
         */
        String PUBLIC_CERT = "public_cert";
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
    }

    /**
     * The type of configuration. Value options differ depending on the `config_element` property that you want to define.
     */
    public interface Type {
        /**
         * letsencrypt.
         */
        String LETSENCRYPT = "letsencrypt";
        /**
         * letsencrypt-stage.
         */
        String LETSENCRYPT_STAGE = "letsencrypt-stage";
        /**
         * cis.
         */
        String CIS = "cis";
        /**
         * classic_infrastructure.
         */
        String CLASSIC_INFRASTRUCTURE = "classic_infrastructure";
    }

    protected String secretType;
    protected String configElement;
    protected String configName;
    protected String type;
    protected Map<String, Object> config;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String configElement;
        private String configName;
        private String type;
        private Map<String, Object> config;

        private Builder(UpdateConfigElementOptions updateConfigElementOptions) {
            this.secretType = updateConfigElementOptions.secretType;
            this.configElement = updateConfigElementOptions.configElement;
            this.configName = updateConfigElementOptions.configName;
            this.type = updateConfigElementOptions.type;
            this.config = updateConfigElementOptions.config;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param secretType    the secretType
         * @param configElement the configElement
         * @param configName    the configName
         * @param type          the type
         * @param config        the config
         */
        public Builder(String secretType, String configElement, String configName, String type, Map<String, Object> config) {
            this.secretType = secretType;
            this.configElement = configElement;
            this.configName = configName;
            this.type = type;
            this.config = config;
        }

        /**
         * Builds a UpdateConfigElementOptions.
         *
         * @return the new UpdateConfigElementOptions instance
         */
        public UpdateConfigElementOptions build() {
            return new UpdateConfigElementOptions(this);
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the UpdateConfigElementOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the configElement.
         *
         * @param configElement the configElement
         * @return the UpdateConfigElementOptions builder
         */
        public Builder configElement(String configElement) {
            this.configElement = configElement;
            return this;
        }

        /**
         * Set the configName.
         *
         * @param configName the configName
         * @return the UpdateConfigElementOptions builder
         */
        public Builder configName(String configName) {
            this.configName = configName;
            return this;
        }

        /**
         * Set the type.
         *
         * @param type the type
         * @return the UpdateConfigElementOptions builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Set the config.
         *
         * @param config the config
         * @return the UpdateConfigElementOptions builder
         */
        public Builder config(Map<String, Object> config) {
            this.config = config;
            return this;
        }
    }

    protected UpdateConfigElementOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.configElement,
                "configElement cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.configName,
                "configName cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
                "type cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.config,
                "config cannot be null");
        secretType = builder.secretType;
        configElement = builder.configElement;
        configName = builder.configName;
        type = builder.type;
        config = builder.config;
    }

    /**
     * New builder.
     *
     * @return a UpdateConfigElementOptions builder
     */
    public Builder newBuilder() {
        return new Builder(this);
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
     * Gets the type.
     * <p>
     * The type of configuration. Value options differ depending on the `config_element` property that you want to define.
     *
     * @return the type
     */
    public String type() {
        return type;
    }

    /**
     * Gets the config.
     *
     * @return the config
     */
    public Map<String, Object> config() {
        return config;
    }
}

