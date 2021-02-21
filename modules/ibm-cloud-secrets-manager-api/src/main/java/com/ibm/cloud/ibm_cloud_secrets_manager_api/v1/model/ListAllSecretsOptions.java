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
package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listAllSecrets options.
 */
public class ListAllSecretsOptions extends GenericModel {

    /**
     * Sorts a list of secrets by the field that you specify.
     * <p>
     * **Usage:** To sort a list of secrets by their creation date, use
     * `../secrets/{secret-type}?sort_by=creation_date`.
     */
    public interface SortBy {
        /**
         * id.
         */
        String ID = "id";
        /**
         * creation_date.
         */
        String CREATION_DATE = "creation_date";
        /**
         * expiration_date.
         */
        String EXPIRATION_DATE = "expiration_date";
        /**
         * secret_type.
         */
        String SECRET_TYPE = "secret_type";
        /**
         * name.
         */
        String NAME = "name";
    }

    protected Long limit;
    protected Long offset;
    protected String search;
    protected String sortBy;

    /**
     * Builder.
     */
    public static class Builder {
        private Long limit;
        private Long offset;
        private String search;
        private String sortBy;

        private Builder(ListAllSecretsOptions listAllSecretsOptions) {
            this.limit = listAllSecretsOptions.limit;
            this.offset = listAllSecretsOptions.offset;
            this.search = listAllSecretsOptions.search;
            this.sortBy = listAllSecretsOptions.sortBy;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a ListAllSecretsOptions.
         *
         * @return the new ListAllSecretsOptions instance
         */
        public ListAllSecretsOptions build() {
            return new ListAllSecretsOptions(this);
        }

        /**
         * Set the limit.
         *
         * @param limit the limit
         * @return the ListAllSecretsOptions builder
         */
        public Builder limit(long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set the offset.
         *
         * @param offset the offset
         * @return the ListAllSecretsOptions builder
         */
        public Builder offset(long offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set the search.
         *
         * @param search the search
         * @return the ListAllSecretsOptions builder
         */
        public Builder search(String search) {
            this.search = search;
            return this;
        }

        /**
         * Set the sortBy.
         *
         * @param sortBy the sortBy
         * @return the ListAllSecretsOptions builder
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }
    }

    protected ListAllSecretsOptions(Builder builder) {
        limit = builder.limit;
        offset = builder.offset;
        search = builder.search;
        sortBy = builder.sortBy;
    }

    /**
     * New builder.
     *
     * @return a ListAllSecretsOptions builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the limit.
     * <p>
     * The number of secrets to retrieve. By default, list operations return the first 200 items. To retrieve a different
     * set of items, use `limit` with `offset` to page through your available resources.
     * <p>
     * **Usage:** If you have 20 secrets in your instance, and you want to retrieve only the first 5 secrets, use
     * `../secrets/{secret-type}?limit=5`.
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
     * `../secrets/{secret-type}?offset=25&amp;limit=25`.
     *
     * @return the offset
     */
    public Long offset() {
        return offset;
    }

    /**
     * Gets the search.
     * <p>
     * Filters for secrets that contain the string that you specify. The fields that are searched include: id, name,
     * description, labels, secret_type.
     * <p>
     * **Usage:** If you want to list only the secrets that contain the string "text", use
     * `../secrets/{secret-type}?search=text`.
     *
     * @return the search
     */
    public String search() {
        return search;
    }

    /**
     * Gets the sortBy.
     * <p>
     * Sorts a list of secrets by the field that you specify.
     * <p>
     * **Usage:** To sort a list of secrets by their creation date, use
     * `../secrets/{secret-type}?sort_by=creation_date`.
     *
     * @return the sortBy
     */
    public String sortBy() {
        return sortBy;
    }
}

