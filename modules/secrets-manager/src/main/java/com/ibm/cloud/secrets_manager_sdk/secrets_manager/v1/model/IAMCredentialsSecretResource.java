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

import java.util.ArrayList;
import java.util.List;

/**
 * Properties that describe a secret.
 */
public class IAMCredentialsSecretResource extends SecretResource {

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
         * kv.
         */
        String KV = "kv";
    }


    /**
     * Builder.
     */
    public static class Builder {
        private String name;
        private String description;
        private String secretGroupId;
        private List<String> labels;
        private Object ttl;
        private List<String> accessGroups;
        private String serviceId;
        private Boolean reuseApiKey;

        public Builder(SecretResource iamCredentialsSecretResource) {
            this.name = iamCredentialsSecretResource.name;
            this.description = iamCredentialsSecretResource.description;
            this.secretGroupId = iamCredentialsSecretResource.secretGroupId;
            this.labels = iamCredentialsSecretResource.labels;
            this.ttl = iamCredentialsSecretResource.ttl;
            this.accessGroups = iamCredentialsSecretResource.accessGroups;
            this.serviceId = iamCredentialsSecretResource.serviceId;
            this.reuseApiKey = iamCredentialsSecretResource.reuseApiKey;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param name the name
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * Builds a IAMCredentialsSecretResource.
         *
         * @return the new IAMCredentialsSecretResource instance
         */
        public IAMCredentialsSecretResource build() {
            return new IAMCredentialsSecretResource(this);
        }

        /**
         * Adds an labels to labels.
         *
         * @param labels the new labels
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder addLabels(String labels) {
            com.ibm.cloud.sdk.core.util.Validator.notNull(labels,
                    "labels cannot be null");
            if (this.labels == null) {
                this.labels = new ArrayList<String>();
            }
            this.labels.add(labels);
            return this;
        }

        /**
         * Adds an accessGroups to accessGroups.
         *
         * @param accessGroups the new accessGroups
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder addAccessGroups(String accessGroups) {
            com.ibm.cloud.sdk.core.util.Validator.notNull(accessGroups,
                    "accessGroups cannot be null");
            if (this.accessGroups == null) {
                this.accessGroups = new ArrayList<String>();
            }
            this.accessGroups.add(accessGroups);
            return this;
        }

        /**
         * Set the name.
         *
         * @param name the name
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the description.
         *
         * @param description the description
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Set the secretGroupId.
         *
         * @param secretGroupId the secretGroupId
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder secretGroupId(String secretGroupId) {
            this.secretGroupId = secretGroupId;
            return this;
        }

        /**
         * Set the labels.
         * Existing labels will be replaced.
         *
         * @param labels the labels
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Set the ttl.
         *
         * @param ttl the ttl
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder ttl(Object ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * Set the accessGroups.
         * Existing accessGroups will be replaced.
         *
         * @param accessGroups the accessGroups
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder accessGroups(List<String> accessGroups) {
            this.accessGroups = accessGroups;
            return this;
        }

        /**
         * Set the serviceId.
         *
         * @param serviceId the serviceId
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Set the reuseApiKey.
         *
         * @param reuseApiKey the reuseApiKey
         * @return the IAMCredentialsSecretResource builder
         */
        public Builder reuseApiKey(Boolean reuseApiKey) {
            this.reuseApiKey = reuseApiKey;
            return this;
        }
    }

    protected IAMCredentialsSecretResource() {
    }

    protected IAMCredentialsSecretResource(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
                "name cannot be null");
        name = builder.name;
        description = builder.description;
        secretGroupId = builder.secretGroupId;
        labels = builder.labels;
        ttl = builder.ttl;
        accessGroups = builder.accessGroups;
        serviceId = builder.serviceId;
        reuseApiKey = builder.reuseApiKey;
    }

    /**
     * New builder.
     *
     * @return a IAMCredentialsSecretResource builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

