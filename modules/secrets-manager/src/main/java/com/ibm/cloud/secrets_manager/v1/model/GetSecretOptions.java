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
 * The getSecret options.
 */
public class GetSecretOptions extends GenericModel {

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
    protected String id;

    /**
     * Builder.
     */
    public static class Builder {
        private String secretType;
        private String id;

        private Builder(GetSecretOptions getSecretOptions) {
            this.secretType = getSecretOptions.secretType;
            this.id = getSecretOptions.id;
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
         * Builds a GetSecretOptions.
         *
         * @return the new GetSecretOptions instance
         */
        public GetSecretOptions build() {
            return new GetSecretOptions(this);
        }

        /**
         * Set the secretType.
         *
         * @param secretType the secretType
         * @return the GetSecretOptions builder
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the GetSecretOptions builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }
    }

    protected GetSecretOptions(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
                "secretType cannot be empty");
        com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
                "id cannot be empty");
        secretType = builder.secretType;
        id = builder.id;
    }

    /**
     * New builder.
     *
     * @return a GetSecretOptions builder
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
}

