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

/**
 * Delete the credentials that are associated with an `iam_credentials` secret.
 */
public class DeleteCredentialsForIAMCredentialsSecret extends SecretAction {


    /**
     * Builder.
     */
    public static class Builder {
        private String apiKeyId;
        private String serviceId;

        /**
         * Instantiates a new Builder from an existing DeleteCredentialsForIAMCredentialsSecret instance.
         *
         * @param deleteCredentialsForIamCredentialsSecret the instance to initialize the Builder with
         */
        public Builder(SecretAction deleteCredentialsForIamCredentialsSecret) {
            this.apiKeyId = deleteCredentialsForIamCredentialsSecret.apiKeyId;
            this.serviceId = deleteCredentialsForIamCredentialsSecret.serviceId;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a DeleteCredentialsForIAMCredentialsSecret.
         *
         * @return the new DeleteCredentialsForIAMCredentialsSecret instance
         */
        public DeleteCredentialsForIAMCredentialsSecret build() {
            return new DeleteCredentialsForIAMCredentialsSecret(this);
        }

        /**
         * Set the apiKeyId.
         *
         * @param apiKeyId the apiKeyId
         * @return the DeleteCredentialsForIAMCredentialsSecret builder
         */
        public Builder apiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * Set the serviceId.
         *
         * @param serviceId the serviceId
         * @return the DeleteCredentialsForIAMCredentialsSecret builder
         * @deprecated this method is deprecated and may be removed in a future release
         */
        @Deprecated
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
    }

    protected DeleteCredentialsForIAMCredentialsSecret() {
    }

    protected DeleteCredentialsForIAMCredentialsSecret(Builder builder) {
        apiKeyId = builder.apiKeyId;
        serviceId = builder.serviceId;
    }

    /**
     * New builder.
     *
     * @return a DeleteCredentialsForIAMCredentialsSecret builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

