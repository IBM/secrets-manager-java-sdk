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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties that describe a secret group.
 */
public class SecretGroupDef extends GenericModel {

    protected CollectionMetadata metadata;
    protected List<SecretGroupResource> resources;

    /**
     * Builder.
     */
    public static class Builder {
        private CollectionMetadata metadata;
        private List<SecretGroupResource> resources;

        private Builder(SecretGroupDef secretGroupDef) {
            this.metadata = secretGroupDef.metadata;
            this.resources = secretGroupDef.resources;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param metadata  the metadata
         * @param resources the resources
         */
        public Builder(CollectionMetadata metadata, List<SecretGroupResource> resources) {
            this.metadata = metadata;
            this.resources = resources;
        }

        /**
         * Builds a SecretGroupDef.
         *
         * @return the new SecretGroupDef instance
         */
        public SecretGroupDef build() {
            return new SecretGroupDef(this);
        }

        /**
         * Adds an resources to resources.
         *
         * @param resources the new resources
         * @return the SecretGroupDef builder
         */
        public Builder addResources(SecretGroupResource resources) {
            com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
                    "resources cannot be null");
            if (this.resources == null) {
                this.resources = new ArrayList<SecretGroupResource>();
            }
            this.resources.add(resources);
            return this;
        }

        /**
         * Set the metadata.
         *
         * @param metadata the metadata
         * @return the SecretGroupDef builder
         */
        public Builder metadata(CollectionMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Set the resources.
         * Existing resources will be replaced.
         *
         * @param resources the resources
         * @return the SecretGroupDef builder
         */
        public Builder resources(List<SecretGroupResource> resources) {
            this.resources = resources;
            return this;
        }
    }

    protected SecretGroupDef(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metadata,
                "metadata cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resources,
                "resources cannot be null");
        metadata = builder.metadata;
        resources = builder.resources;
    }

    /**
     * New builder.
     *
     * @return a SecretGroupDef builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the metadata.
     * <p>
     * The metadata that describes the resource array.
     *
     * @return the metadata
     */
    public CollectionMetadata metadata() {
        return metadata;
    }

    /**
     * Gets the resources.
     * <p>
     * A collection of resources.
     *
     * @return the resources
     */
    public List<SecretGroupResource> resources() {
        return resources;
    }
}

