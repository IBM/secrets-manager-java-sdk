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
 * The updateSecretMetadata options.
 */
public class UpdateSecretMetadataOptions extends GenericModel {

    /**
     * The secret type.
     */
    public interface SecretType {
        /**
         * arbitrary.
         */
        String ARBITRARY = "arbitrary";
        /**
         * iam_credentials.
         */
        String IAM_CREDENTIALS = "iam_credentials";
        /**
         * imported_cert.
         */
        String IMPORTED_CERT = "imported_cert";
        /**
         * public_cert.
         */
        String PUBLIC_CERT = "public_cert";
        /**
         * username_password.
         */
        String USERNAME_PASSWORD = "username_password";
    }

    protected String secretType;
    protected String id;
    protected CollectionMetadata metadata;
    protected List<SecretMetadata> resources;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String id;
        private CollectionMetadata metadata;
        private List<SecretMetadata> resources;

        private Builder(UpdateSecretMetadataOptions updateSecretMetadataOptions) {
            this.secretType = updateSecretMetadataOptions.secretType;
            this.id = updateSecretMetadataOptions.id;
            this.metadata = updateSecretMetadataOptions.metadata;
            this.resources = updateSecretMetadataOptions.resources;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param secretType the secretType
         * @param id         the id
         * @param metadata   the metadata
         * @param resources  the resources
         */
        public Builder(String secretType, String id, CollectionMetadata metadata, List<SecretMetadata> resources) {
            this.secretType = secretType;
            this.id = id;
            this.metadata = metadata;
            this.resources = resources;
        }

        /**
         * Builds a UpdateSecretMetadataOptions.
         *
         * @return the new UpdateSecretMetadataOptions instance
         */
        public UpdateSecretMetadataOptions build() {
            return new UpdateSecretMetadataOptions(this);
        }

        /**
         * Adds an resources to resources.
         *
         * @param resources the new resources
         * @return the UpdateSecretMetadataOptions builder
         */
        public Builder addResources(SecretMetadata resources) {
            com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
                    "resources cannot be null");
            if (this.resources == null) {
                this.resources = new ArrayList<SecretMetadata>();
            }
            this.resources.add(resources);
            return this;
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the UpdateSecretMetadataOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the UpdateSecretMetadataOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the metadata.
         *
         * @param metadata the metadata
         * @return the UpdateSecretMetadataOptions builder
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
         * @return the UpdateSecretMetadataOptions builder
         */
        public Builder resources(List<SecretMetadata> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Set the secretMetadataRequest.
         *
         * @param secretMetadataRequest the secretMetadataRequest
         * @return the UpdateSecretMetadataOptions builder
         */
        public Builder secretMetadataRequest(SecretMetadataRequest secretMetadataRequest) {
            this.metadata = secretMetadataRequest.metadata();
            this.resources = secretMetadataRequest.resources();
            return this;
        }
    }

    protected UpdateSecretMetadataOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metadata,
                "metadata cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resources,
                "resources cannot be null");
        secretType = builder.secretType;
        id = builder.id;
        metadata = builder.metadata;
        resources = builder.resources;
    }

    /**
     * New builder.
     *
     * @return a UpdateSecretMetadataOptions builder
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
     * Gets the id.
     * <p>
     * The v4 UUID that uniquely identifies the secret.
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
    public List<SecretMetadata> resources() {
        return resources;
    }
}

