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
 * The request body of a `restore` action.
 */
public class RestoreIAMCredentialsSecretBody extends SecretAction {


    /**
     * Builder.
     */
    public static class Builder {
        private String versionId;

        public Builder(SecretAction restoreIamCredentialsSecretBody) {
            this.versionId = restoreIamCredentialsSecretBody.versionId;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param versionId the versionId
         */
        public Builder(String versionId) {
            this.versionId = versionId;
        }

        /**
         * Builds a RestoreIAMCredentialsSecretBody.
         *
         * @return the new RestoreIAMCredentialsSecretBody instance
         */
        public RestoreIAMCredentialsSecretBody build() {
            return new RestoreIAMCredentialsSecretBody(this);
        }

        /**
         * Set the versionId.
         *
         * @param versionId the versionId
         * @return the RestoreIAMCredentialsSecretBody builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
    }

    protected RestoreIAMCredentialsSecretBody() {
    }

    protected RestoreIAMCredentialsSecretBody(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.versionId,
                "versionId cannot be null");
        versionId = builder.versionId;
    }

    /**
     * New builder.
     *
     * @return a RestoreIAMCredentialsSecretBody builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

