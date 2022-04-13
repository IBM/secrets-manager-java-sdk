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
 * The actionOnConfigElement options.
 */
public class ActionOnConfigElementOptions extends GenericModel {

    /**
     * The secret type.
     */
    public interface SecretType {
        /**
         * private_cert.
         */
        String PRIVATE_CERT = "private_cert";
    }

    /**
     * The configuration element on which the action is applied.
     */
    public interface ConfigElement {
        /**
         * root_certificate_authorities.
         */
        String ROOT_CERTIFICATE_AUTHORITIES = "root_certificate_authorities";
        /**
         * intermediate_certificate_authorities.
         */
        String INTERMEDIATE_CERTIFICATE_AUTHORITIES = "intermediate_certificate_authorities";
    }

    /**
     * The action to perform on the specified configuration element.
     */
    public interface Action {
        /**
         * sign_intermediate.
         */
        String SIGN_INTERMEDIATE = "sign_intermediate";
        /**
         * sign_csr.
         */
        String SIGN_CSR = "sign_csr";
        /**
         * set_signed.
         */
        String SET_SIGNED = "set_signed";
        /**
         * revoke.
         */
        String REVOKE = "revoke";
        /**
         * rotate_crl.
         */
        String ROTATE_CRL = "rotate_crl";
    }

    protected String secretType;
    protected String configElement;
    protected String configName;
    protected String action;
    protected ConfigAction config;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String configElement;
        private String configName;
        private String action;
        private ConfigAction config;

        private Builder(ActionOnConfigElementOptions actionOnConfigElementOptions) {
            this.secretType = actionOnConfigElementOptions.secretType;
            this.configElement = actionOnConfigElementOptions.configElement;
            this.configName = actionOnConfigElementOptions.configName;
            this.action = actionOnConfigElementOptions.action;
            this.config = actionOnConfigElementOptions.config;
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
         * @param action        the action
         */
        public Builder(String secretType, String configElement, String configName, String action) {
            this.secretType = secretType;
            this.configElement = configElement;
            this.configName = configName;
            this.action = action;
        }

        /**
         * Builds a ActionOnConfigElementOptions.
         *
         * @return the new ActionOnConfigElementOptions instance
         */
        public ActionOnConfigElementOptions build() {
            return new ActionOnConfigElementOptions(this);
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the ActionOnConfigElementOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the configElement.
         *
         * @param configElement the configElement
         * @return the ActionOnConfigElementOptions builder
         */
        public Builder configElement(String configElement) {
            this.configElement = configElement;
            return this;
        }

        /**
         * Set the configName.
         *
         * @param configName the configName
         * @return the ActionOnConfigElementOptions builder
         */
        public Builder configName(String configName) {
            this.configName = configName;
            return this;
        }

        /**
         * Set the action.
         *
         * @param action the action
         * @return the ActionOnConfigElementOptions builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Set the config.
         *
         * @param config the config
         * @return the ActionOnConfigElementOptions builder
         */
        public Builder config(ConfigAction config) {
            this.config = config;
            return this;
        }
    }

    protected ActionOnConfigElementOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.configElement,
                "configElement cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.configName,
                "configName cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
                "action cannot be null");
        secretType = builder.secretType;
        configElement = builder.configElement;
        configName = builder.configName;
        action = builder.action;
        config = builder.config;
    }

    /**
     * New builder.
     *
     * @return a ActionOnConfigElementOptions builder
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
     * The configuration element on which the action is applied.
     *
     * @return the configElement
     */
    public String configElement() {
        return configElement;
    }

    /**
     * Gets the configName.
     * <p>
     * The name of the certificate authority.
     *
     * @return the configName
     */
    public String configName() {
        return configName;
    }

    /**
     * Gets the action.
     * <p>
     * The action to perform on the specified configuration element.
     *
     * @return the action
     */
    public String action() {
        return action;
    }

    /**
     * Gets the config.
     * <p>
     * Properties that describe an action on a configuration element.
     *
     * @return the config
     */
    public ConfigAction config() {
        return config;
    }
}

