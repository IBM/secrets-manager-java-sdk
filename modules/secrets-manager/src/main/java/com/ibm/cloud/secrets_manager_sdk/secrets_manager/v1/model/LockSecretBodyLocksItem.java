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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LockSecretBodyLocksItem.
 */
public class LockSecretBodyLocksItem extends GenericModel {

    protected String name;
    protected String description;
    protected Map<String, Object> attributes;

    /**
     * Builder.
     */
    public static class Builder {
        private String name;
        private String description;
        private Map<String, Object> attributes;

        /**
         * Instantiates a new Builder from an existing LockSecretBodyLocksItem instance.
         *
         * @param lockSecretBodyLocksItem the instance to initialize the Builder with
         */
        private Builder(LockSecretBodyLocksItem lockSecretBodyLocksItem) {
            this.name = lockSecretBodyLocksItem.name;
            this.description = lockSecretBodyLocksItem.description;
            this.attributes = lockSecretBodyLocksItem.attributes;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param name        the name
         * @param description the description
         * @param attributes  the attributes
         */
        public Builder(String name, String description, Map<String, Object> attributes) {
            this.name = name;
            this.description = description;
            this.attributes = attributes;
        }

        /**
         * Builds a LockSecretBodyLocksItem.
         *
         * @return the new LockSecretBodyLocksItem instance
         */
        public LockSecretBodyLocksItem build() {
            return new LockSecretBodyLocksItem(this);
        }

        /**
         * Set the name.
         *
         * @param name the name
         * @return the LockSecretBodyLocksItem builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the description.
         *
         * @param description the description
         * @return the LockSecretBodyLocksItem builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Set the attributes.
         *
         * @param attributes the attributes
         * @return the LockSecretBodyLocksItem builder
         */
        public Builder attributes(Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }
    }

    protected LockSecretBodyLocksItem() {
    }

    protected LockSecretBodyLocksItem(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
                "name cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
                "description cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
                "attributes cannot be null");
        name = builder.name;
        description = builder.description;
        attributes = builder.attributes;
    }

    /**
     * New builder.
     *
     * @return a LockSecretBodyLocksItem builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the name.
     * <p>
     * A human-readable name to assign to the lock. The lock name must be unique per secret version.
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as a name for your secret lock.
     *
     * @return the name
     */
    public String name() {
        return name;
    }

    /**
     * Gets the description.
     * <p>
     * An extended description of the lock.
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret
     * lock.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Gets the attributes.
     * <p>
     * Optional information to associate with a lock, such as resources CRNs to be used by automation.
     *
     * @return the attributes
     */
    public Map<String, Object> attributes() {
        return attributes;
    }
}

