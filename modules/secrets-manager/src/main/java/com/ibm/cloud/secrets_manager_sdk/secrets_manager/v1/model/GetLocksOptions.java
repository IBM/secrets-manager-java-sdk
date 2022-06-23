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
 * The getLocks options.
 */
public class GetLocksOptions extends GenericModel {

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
         * private_cert.
         */
        String PRIVATE_CERT = "private_cert";
        /**
         * username_password.
         */
        String USERNAME_PASSWORD = "username_password";
        /**
         * kv.
         */
        String KV = "kv";
    }

    protected String secretType;
    protected String id;
    protected Long limit;
    protected Long offset;
    protected String search;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String id;
        private Long limit;
        private Long offset;
        private String search;

        private Builder(GetLocksOptions getLocksOptions) {
            this.secretType = getLocksOptions.secretType;
            this.id = getLocksOptions.id;
            this.limit = getLocksOptions.limit;
            this.offset = getLocksOptions.offset;
            this.search = getLocksOptions.search;
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
         */
        public Builder(String secretType, String id) {
            this.secretType = secretType;
            this.id = id;
        }

        /**
         * Builds a GetLocksOptions.
         *
         * @return the new GetLocksOptions instance
         */
        public GetLocksOptions build() {
            return new GetLocksOptions(this);
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the GetLocksOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the GetLocksOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the limit.
         *
         * @param limit the limit
         * @return the GetLocksOptions builder
         */
        public Builder limit(long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set the offset.
         *
         * @param offset the offset
         * @return the GetLocksOptions builder
         */
        public Builder offset(long offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set the search.
         *
         * @param search the search
         * @return the GetLocksOptions builder
         */
        public Builder search(String search) {
            this.search = search;
            return this;
        }
    }

    protected GetLocksOptions() {
    }

    protected GetLocksOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        secretType = builder.secretType;
        id = builder.id;
        limit = builder.limit;
        offset = builder.offset;
        search = builder.search;
    }

    /**
     * New builder.
     *
     * @return a GetLocksOptions builder
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
     * Gets the limit.
     * <p>
     * The number of secrets with locks to retrieve. By default, list operations return the first 25 items. To retrieve a
     * different set of items, use `limit` with `offset` to page through your available resources.
     * <p>
     * **Usage:** If you have 20 secrets in your instance, and you want to retrieve only the first 5 with locks, use
     * `..?limit=5`.
     *
     * @return the limit
     */
    public Long limit() {
        return limit;
    }

    /**
     * Gets the offset.
     * <p>
     * The number of secrets to skip. By specifying `offset`, you retrieve a subset of items that starts with the `offset`
     * value. Use `offset` with `limit` to page through your available resources.
     * <p>
     * **Usage:** If you have 100 secrets in your instance, and you want to retrieve secrets 26 through 50, use
     * `..?offset=25&amp;limit=25`.
     *
     * @return the offset
     */
    public Long offset() {
        return offset;
    }

    /**
     * Gets the search.
     * <p>
     * Filter locks that contain the specified string in the field "name".
     * <p>
     * **Usage:** If you want to list only the locks that contain the string "text" in the field "name", use
     * `..?search=text`.
     *
     * @return the search
     */
    public String search() {
        return search;
    }
}

