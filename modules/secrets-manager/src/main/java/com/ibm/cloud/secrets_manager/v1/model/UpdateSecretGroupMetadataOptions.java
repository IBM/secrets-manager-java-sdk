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
package com.ibm.cloud.secrets_manager.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSecretGroupMetadata options.
 */
public class UpdateSecretGroupMetadataOptions extends GenericModel {

    protected String id;
    protected CollectionMetadata metadata;
    protected List<SecretGroupMetadataUpdatable> resources;

    /**
     * Builder.
     */
    public static class Builder {
        private String id;
        private CollectionMetadata metadata;
        private List<SecretGroupMetadataUpdatable> resources;

        private Builder(UpdateSecretGroupMetadataOptions updateSecretGroupMetadataOptions) {
            this.id = updateSecretGroupMetadataOptions.id;
            this.metadata = updateSecretGroupMetadataOptions.metadata;
            this.resources = updateSecretGroupMetadataOptions.resources;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param id        the id
         * @param metadata  the metadata
         * @param resources the resources
         */
        public Builder(String id, CollectionMetadata metadata, List<SecretGroupMetadataUpdatable> resources) {
            this.id = id;
            this.metadata = metadata;
            this.resources = resources;
        }

        /**
         * Builds a UpdateSecretGroupMetadataOptions.
         *
         * @return the new UpdateSecretGroupMetadataOptions instance
         */
        public UpdateSecretGroupMetadataOptions build() {
            return new UpdateSecretGroupMetadataOptions(this);
        }

        /**
         * Adds an resources to resources.
         *
         * @param resources the new resources
         * @return the UpdateSecretGroupMetadataOptions builder
         */
        public Builder addResources(SecretGroupMetadataUpdatable resources) {
            com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
                    "resources cannot be null");
            if (this.resources == null) {
                this.resources = new ArrayList<SecretGroupMetadataUpdatable>();
            }
            this.resources.add(resources);
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the UpdateSecretGroupMetadataOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the metadata.
         *
         * @param metadata the metadata
         * @return the UpdateSecretGroupMetadataOptions builder
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
         * @return the UpdateSecretGroupMetadataOptions builder
         */
        public Builder resources(List<SecretGroupMetadataUpdatable> resources) {
            this.resources = resources;
            return this;
        }
    }

    protected UpdateSecretGroupMetadataOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metadata,
                "metadata cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resources,
                "resources cannot be null");
        id = builder.id;
        metadata = builder.metadata;
        resources = builder.resources;
    }

    /**
     * New builder.
     *
     * @return a UpdateSecretGroupMetadataOptions builder
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
    public List<SecretGroupMetadataUpdatable> resources() {
        return resources;
    }
}

