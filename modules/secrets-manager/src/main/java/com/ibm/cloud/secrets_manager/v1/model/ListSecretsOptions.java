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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSecrets options.
 */
public class ListSecretsOptions extends GenericModel {

    /**
     * The secret type.
     */
    public interface SecretType {
        /**
         * arbitrary.
         */
        String ARBITRARY = "arbitrary";
        /**
         * username_password.
         */
        String USERNAME_PASSWORD = "username_password";
        /**
         * iam_credentials.
         */
        String IAM_CREDENTIALS = "iam_credentials";
    }

    protected String secretType;
    protected Long limit;
    protected Long offset;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private Long limit;
        private Long offset;

        private Builder(ListSecretsOptions listSecretsOptions) {
            this.secretType = listSecretsOptions.secretType;
            this.limit = listSecretsOptions.limit;
            this.offset = listSecretsOptions.offset;
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
         */
        public Builder(String secretType) {
            this.secretType = secretType;
        }

        /**
         * Builds a ListSecretsOptions.
         *
         * @return the new ListSecretsOptions instance
         */
        public ListSecretsOptions build() {
            return new ListSecretsOptions(this);
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the ListSecretsOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the limit.
         *
         * @param limit the limit
         * @return the ListSecretsOptions builder
         */
        public Builder limit(long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set the offset.
         *
         * @param offset the offset
         * @return the ListSecretsOptions builder
         */
        public Builder offset(long offset) {
            this.offset = offset;
            return this;
        }
    }

    protected ListSecretsOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        secretType = builder.secretType;
        limit = builder.limit;
        offset = builder.offset;
    }

    /**
     * New builder.
     *
     * @return a ListSecretsOptions builder
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
}

