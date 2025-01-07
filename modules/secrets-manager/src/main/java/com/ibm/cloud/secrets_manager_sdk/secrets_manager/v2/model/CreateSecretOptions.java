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
 * The createSecret options.
 */
public class CreateSecretOptions extends GenericModel {

    protected SecretPrototype secretPrototype;

    /**
     * Builder.
     */
    public static class Builder {
        private SecretPrototype secretPrototype;

        /**
         * Instantiates a new Builder from an existing CreateSecretOptions instance.
         *
         * @param createSecretOptions the instance to initialize the Builder with
         */
        private Builder(CreateSecretOptions createSecretOptions) {
            this.secretPrototype = createSecretOptions.secretPrototype;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param secretPrototype the secretPrototype
         */
        public Builder(SecretPrototype secretPrototype) {
            this.secretPrototype = secretPrototype;
        }

        /**
         * Builds a CreateSecretOptions.
         *
         * @return the new CreateSecretOptions instance
         */
        public CreateSecretOptions build() {
            return new CreateSecretOptions(this);
        }

        /**
         * Set the secretPrototype.
         *
         * @param secretPrototype the secretPrototype
         * @return the CreateSecretOptions builder
         */
        public Builder secretPrototype(SecretPrototype secretPrototype) {
            this.secretPrototype = secretPrototype;
            return this;
        }
    }

    protected CreateSecretOptions() {
    }

    protected CreateSecretOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretPrototype,
                "secretPrototype cannot be null");
        secretPrototype = builder.secretPrototype;
    }

    /**
     * New builder.
     *
     * @return a CreateSecretOptions builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the secretPrototype.
     * <p>
     * Specify the properties for your secret.
     *
     * @return the secretPrototype
     */
    public SecretPrototype secretPrototype() {
        return secretPrototype;
    }
}

