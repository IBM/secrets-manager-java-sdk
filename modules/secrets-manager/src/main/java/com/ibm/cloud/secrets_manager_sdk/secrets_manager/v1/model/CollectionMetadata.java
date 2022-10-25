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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The metadata that describes the resource array.
 */
public class CollectionMetadata extends GenericModel {

    /**
     * The type of resources in the resource array.
     */
    public interface CollectionType {
        /**
         * application/vnd.ibm.secrets-manager.config+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_CONFIG_JSON = "application/vnd.ibm.secrets-manager.config+json";
        /**
         * application/vnd.ibm.secrets-manager.secret+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_JSON = "application/vnd.ibm.secrets-manager.secret+json";
        /**
         * application/vnd.ibm.secrets-manager.secret.version+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_VERSION_JSON = "application/vnd.ibm.secrets-manager.secret.version+json";
        /**
         * application/vnd.ibm.secrets-manager.secret.policy+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_POLICY_JSON = "application/vnd.ibm.secrets-manager.secret.policy+json";
        /**
         * application/vnd.ibm.secrets-manager.secret.group+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_GROUP_JSON = "application/vnd.ibm.secrets-manager.secret.group+json";
        /**
         * application/vnd.ibm.secrets-manager.secret.lock+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_LOCK_JSON = "application/vnd.ibm.secrets-manager.secret.lock+json";
        /**
         * application/vnd.ibm.secrets-manager.error+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_ERROR_JSON = "application/vnd.ibm.secrets-manager.error+json";
    }

    @SerializedName("collection_type")
    protected String collectionType;
    @SerializedName("collection_total")
    protected Long collectionTotal;

    /**
     * Builder.
     */
    public static class Builder {
        private String collectionType;
        private Long collectionTotal;

        /**
         * Instantiates a new Builder from an existing CollectionMetadata instance.
         *
         * @param collectionMetadata the instance to initialize the Builder with
         */
        private Builder(CollectionMetadata collectionMetadata) {
            this.collectionType = collectionMetadata.collectionType;
            this.collectionTotal = collectionMetadata.collectionTotal;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param collectionType  the collectionType
         * @param collectionTotal the collectionTotal
         */
        public Builder(String collectionType, Long collectionTotal) {
            this.collectionType = collectionType;
            this.collectionTotal = collectionTotal;
        }

        /**
         * Builds a CollectionMetadata.
         *
         * @return the new CollectionMetadata instance
         */
        public CollectionMetadata build() {
            return new CollectionMetadata(this);
        }

        /**
         * Set the collectionType.
         *
         * @param collectionType the collectionType
         * @return the CollectionMetadata builder
         */
        public Builder collectionType(String collectionType) {
            this.collectionType = collectionType;
            return this;
        }

        /**
         * Set the collectionTotal.
         *
         * @param collectionTotal the collectionTotal
         * @return the CollectionMetadata builder
         */
        public Builder collectionTotal(long collectionTotal) {
            this.collectionTotal = collectionTotal;
            return this;
        }
    }

    protected CollectionMetadata() {
    }

    protected CollectionMetadata(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.collectionType,
                "collectionType cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.collectionTotal,
                "collectionTotal cannot be null");
        collectionType = builder.collectionType;
        collectionTotal = builder.collectionTotal;
    }

    /**
     * New builder.
     *
     * @return a CollectionMetadata builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the collectionType.
     * <p>
     * The type of resources in the resource array.
     *
     * @return the collectionType
     */
    public String collectionType() {
        return collectionType;
    }

    /**
     * Gets the collectionTotal.
     * <p>
     * The number of elements in the resource array.
     *
     * @return the collectionTotal
     */
    public Long collectionTotal() {
        return collectionTotal;
    }
}

