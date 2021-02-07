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

/**
 * Delete the credentials that are associated with an `iam_credentials` secret.
 */
public class SecretActionOneOfDeleteCredentialsForIAMSecret extends SecretActionOneOf {


    /**
     * Builder.
     */
    public static class Builder {
        private String serviceId;

        public Builder(SecretActionOneOf secretActionOneOfDeleteCredentialsForIamSecret) {
            this.serviceId = secretActionOneOfDeleteCredentialsForIamSecret.serviceId;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param serviceId the serviceId
         */
        public Builder(String serviceId) {
            this.serviceId = serviceId;
        }

        /**
         * Builds a SecretActionOneOfDeleteCredentialsForIAMSecret.
         *
         * @return the new SecretActionOneOfDeleteCredentialsForIAMSecret instance
         */
        public SecretActionOneOfDeleteCredentialsForIAMSecret build() {
            return new SecretActionOneOfDeleteCredentialsForIAMSecret(this);
        }

        /**
         * Set the serviceId.
         *
         * @param serviceId the serviceId
         * @return the SecretActionOneOfDeleteCredentialsForIAMSecret builder
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
    }

    protected SecretActionOneOfDeleteCredentialsForIAMSecret(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.serviceId,
                "serviceId cannot be null");
        serviceId = builder.serviceId;
    }

    /**
     * New builder.
     *
     * @return a SecretActionOneOfDeleteCredentialsForIAMSecret builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

