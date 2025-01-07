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
 * The listSecretLocks options.
 */
public class ListSecretLocksOptions extends GenericModel {

    protected String id;
    protected Long offset;
    protected Long limit;
    protected String sort;
    protected String search;

    /**
     * Builder.
     */
    public static class Builder {
        private String id;
        private Long offset;
        private Long limit;
        private String sort;
        private String search;

        /**
         * Instantiates a new Builder from an existing ListSecretLocksOptions instance.
         *
         * @param listSecretLocksOptions the instance to initialize the Builder with
         */
        private Builder(ListSecretLocksOptions listSecretLocksOptions) {
            this.id = listSecretLocksOptions.id;
            this.offset = listSecretLocksOptions.offset;
            this.limit = listSecretLocksOptions.limit;
            this.sort = listSecretLocksOptions.sort;
            this.search = listSecretLocksOptions.search;
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
         * Builds a ListSecretLocksOptions.
         *
         * @return the new ListSecretLocksOptions instance
         */
        public ListSecretLocksOptions build() {
            return new ListSecretLocksOptions(this);
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the ListSecretLocksOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the offset.
         *
         * @param offset the offset
         * @return the ListSecretLocksOptions builder
         */
        public Builder offset(long offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set the limit.
         *
         * @param limit the limit
         * @return the ListSecretLocksOptions builder
         */
        public Builder limit(long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set the sort.
         *
         * @param sort the sort
         * @return the ListSecretLocksOptions builder
         */
        public Builder sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Set the search.
         *
         * @param search the search
         * @return the ListSecretLocksOptions builder
         */
        public Builder search(String search) {
            this.search = search;
            return this;
        }
    }

    protected ListSecretLocksOptions() {
    }

    protected ListSecretLocksOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        id = builder.id;
        offset = builder.offset;
        limit = builder.limit;
        sort = builder.sort;
        search = builder.search;
    }

    /**
     * New builder.
     *
     * @return a ListSecretLocksOptions builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the id.
     * <p>
     * The UUID that uniquely identifies your secret.
     *
     * @return the id
     */
    public String id() {
        return id;
    }

    /**
     * Gets the offset.
     * <p>
     * The number of locks to skip. By specifying `offset`, you retrieve a subset of items that starts with the `offset`
     * value. Use `offset` with `limit` to page through your available resources.
     * <p>
     * **Usage:** If you have 100 locks on your secret, and you want to retrieve locks 26 through 50, use
     * `..?offset=25&amp;limit=25`.
     *
     * @return the offset
     */
    public Long offset() {
        return offset;
    }

    /**
     * Gets the limit.
     * <p>
     * The number of locks with associated secret to retrieve. By default, list operations return the first 25 items. To
     * retrieve a different set of items, use `limit` with `offset` to page through your available resources.
     * <p>
     * **Usage:** If you have 20 secrets in your instance, and you want to retrieve only the first 5, use
     * `..?limit=5`.
     *
     * @return the limit
     */
    public Long limit() {
        return limit;
    }

    /**
     * Gets the sort.
     * <p>
     * Sort a collection of locks by the specified field in ascending order. To sort in descending order use the `-`
     * character
     * <p>
     * **Available values:** created_at | updated_at | name
     * <p>
     * **Usage:** To sort a list of locks by their creation date, use
     * `../locks?sort=created_at`.
     *
     * @return the sort
     */
    public String sort() {
        return sort;
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

