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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The properties that are required to create the service credentials for the specified source service instance.
 */
public class ServiceCredentialsSecretSourceService extends GenericModel {

    protected ServiceCredentialsSourceServiceInstance instance;
    protected ServiceCredentialsSourceServiceParameters parameters;
    protected ServiceCredentialsSourceServiceRole role;

    /**
     * Builder.
     */
    public static class Builder {
        private ServiceCredentialsSourceServiceInstance instance;
        private ServiceCredentialsSourceServiceParameters parameters;
        private ServiceCredentialsSourceServiceRole role;

        /**
         * Instantiates a new Builder from an existing ServiceCredentialsSecretSourceService instance.
         *
         * @param serviceCredentialsSecretSourceService the instance to initialize the Builder with
         */
        private Builder(ServiceCredentialsSecretSourceService serviceCredentialsSecretSourceService) {
            this.instance = serviceCredentialsSecretSourceService.instance;
            this.parameters = serviceCredentialsSecretSourceService.parameters;
            this.role = serviceCredentialsSecretSourceService.role;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param instance the instance
         */
        public Builder(ServiceCredentialsSourceServiceInstance instance) {
            this.instance = instance;
        }

        /**
         * Builds a ServiceCredentialsSecretSourceService.
         *
         * @return the new ServiceCredentialsSecretSourceService instance
         */
        public ServiceCredentialsSecretSourceService build() {
            return new ServiceCredentialsSecretSourceService(this);
        }

        /**
         * Set the instance.
         *
         * @param instance the instance
         * @return the ServiceCredentialsSecretSourceService builder
         */
        public Builder instance(ServiceCredentialsSourceServiceInstance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * Set the parameters.
         *
         * @param parameters the parameters
         * @return the ServiceCredentialsSecretSourceService builder
         */
        public Builder parameters(ServiceCredentialsSourceServiceParameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Set the role.
         *
         * @param role the role
         * @return the ServiceCredentialsSecretSourceService builder
         */
        public Builder role(ServiceCredentialsSourceServiceRole role) {
            this.role = role;
            return this;
        }
    }

    protected ServiceCredentialsSecretSourceService() {
    }

    protected ServiceCredentialsSecretSourceService(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instance,
                "instance cannot be null");
        instance = builder.instance;
        parameters = builder.parameters;
        role = builder.role;
    }

    /**
     * New builder.
     *
     * @return a ServiceCredentialsSecretSourceService builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the instance.
     * <p>
     * The source service instance identifier.
     *
     * @return the instance
     */
    public ServiceCredentialsSourceServiceInstance instance() {
        return instance;
    }

    /**
     * Gets the parameters.
     * <p>
     * Configuration options represented as key-value pairs. Service-defined options are used in the generation of
     * credentials for some services. For example, Cloud Object Storage accepts the optional boolean parameter HMAC for
     * creating specific kind of credentials.
     *
     * @return the parameters
     */
    public ServiceCredentialsSourceServiceParameters parameters() {
        return parameters;
    }

    /**
     * Gets the role.
     * <p>
     * The service-specific custom role. CRN is accepted. The role is assigned as part of an access policy to any
     * auto-generated IAM service ID.  If you provide an existing service ID, it is added to the access policy for that
     * ID.  If a role is not provided, any new service IDs that are autogenerated, will not have an assigned access policy
     * and provided service IDs are not changed in any way.  Refer to the service documentation for supported roles.
     *
     * @return the role
     */
    public ServiceCredentialsSourceServiceRole role() {
        return role;
    }
}

