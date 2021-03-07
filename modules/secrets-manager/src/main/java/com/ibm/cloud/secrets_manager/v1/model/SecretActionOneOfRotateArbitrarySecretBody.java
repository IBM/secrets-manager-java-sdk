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

/**
 * The request body of a `rotate` action.
 */
public class SecretActionOneOfRotateArbitrarySecretBody extends SecretActionOneOf {


    /**
     * Builder.
     */
    public static class Builder {
        private String payload;

        public Builder(SecretActionOneOf secretActionOneOfRotateArbitrarySecretBody) {
            this.payload = secretActionOneOfRotateArbitrarySecretBody.payload;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param payload the payload
         */
        public Builder(String payload) {
            this.payload = payload;
        }

        /**
         * Builds a SecretActionOneOfRotateArbitrarySecretBody.
         *
         * @return the new SecretActionOneOfRotateArbitrarySecretBody instance
         */
        public SecretActionOneOfRotateArbitrarySecretBody build() {
            return new SecretActionOneOfRotateArbitrarySecretBody(this);
        }

        /**
         * Set the payload.
         *
         * @param payload the payload
         * @return the SecretActionOneOfRotateArbitrarySecretBody builder
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }
    }

    protected SecretActionOneOfRotateArbitrarySecretBody(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.payload,
                "payload cannot be null");
        payload = builder.payload;
    }

    /**
     * New builder.
     *
     * @return a SecretActionOneOfRotateArbitrarySecretBody builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

