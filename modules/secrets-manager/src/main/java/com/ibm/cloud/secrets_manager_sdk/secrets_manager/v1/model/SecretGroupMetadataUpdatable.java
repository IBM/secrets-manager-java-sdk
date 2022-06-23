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
 * Metadata properties to update for a secret group.
 */
public class SecretGroupMetadataUpdatable extends GenericModel {

    protected String name;
    protected String description;

    /**
     * Builder.
     */
    public static class Builder {
        private String name;
        private String description;

        private Builder(SecretGroupMetadataUpdatable secretGroupMetadataUpdatable) {
            this.name = secretGroupMetadataUpdatable.name;
            this.description = secretGroupMetadataUpdatable.description;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a SecretGroupMetadataUpdatable.
         *
         * @return the new SecretGroupMetadataUpdatable instance
         */
        public SecretGroupMetadataUpdatable build() {
            return new SecretGroupMetadataUpdatable(this);
        }

        /**
         * Set the name.
         *
         * @param name the name
         * @return the SecretGroupMetadataUpdatable builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the description.
         *
         * @param description the description
         * @return the SecretGroupMetadataUpdatable builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }
    }

    protected SecretGroupMetadataUpdatable() {
    }

    protected SecretGroupMetadataUpdatable(Builder builder) {
        name = builder.name;
        description = builder.description;
    }

    /**
     * New builder.
     *
     * @return a SecretGroupMetadataUpdatable builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the name.
     * <p>
     * A human-readable name to assign to your secret group.
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as a name for your secret group.
     *
     * @return the name
     */
    public String name() {
        return name;
    }

    /**
     * Gets the description.
     * <p>
     * An extended description of your secret group.
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret
     * group.
     *
     * @return the description
     */
    public String description() {
        return description;
    }
}

