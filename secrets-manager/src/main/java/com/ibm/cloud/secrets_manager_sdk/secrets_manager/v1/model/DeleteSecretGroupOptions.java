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
 * The deleteSecretGroup options.
 */
public class DeleteSecretGroupOptions extends GenericModel {

    protected String id;

    /**
     * Builder.
     */
    public static class Builder {
        private String id;

        private Builder(DeleteSecretGroupOptions deleteSecretGroupOptions) {
            this.id = deleteSecretGroupOptions.id;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param id the id
         */
        public Builder(String id) {
            this.id = id;
        }

        /**
         * Builds a DeleteSecretGroupOptions.
         *
         * @return the new DeleteSecretGroupOptions instance
         */
        public DeleteSecretGroupOptions build() {
            return new DeleteSecretGroupOptions(this);
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the DeleteSecretGroupOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }
    }

    protected DeleteSecretGroupOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        id = builder.id;
    }

    /**
     * New builder.
     *
     * @return a DeleteSecretGroupOptions builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the id.
     * <p>
     * The v4 UUID that uniquely identifies the secret group.
     *
     * @return the id
     */
    public String id() {
        return id;
    }
}

