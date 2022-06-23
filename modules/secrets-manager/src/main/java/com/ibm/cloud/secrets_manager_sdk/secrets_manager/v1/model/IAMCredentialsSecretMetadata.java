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
 * Metadata properties that describe an `iam_credentials` secret.
 */
public class IAMCredentialsSecretMetadata extends SecretMetadata {

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
        private List<String> labels;
        private String name;
        private String description;
        private String ttl;
        private Boolean serviceIdIsStatic;
        private String serviceId;
        private List<String> accessGroups;

        public Builder(SecretMetadata iamCredentialsSecretMetadata) {
            this.labels = iamCredentialsSecretMetadata.labels;
            this.name = iamCredentialsSecretMetadata.name;
            this.description = iamCredentialsSecretMetadata.description;
            this.ttl = iamCredentialsSecretMetadata.ttl;
            this.serviceIdIsStatic = iamCredentialsSecretMetadata.serviceIdIsStatic;
            this.serviceId = iamCredentialsSecretMetadata.serviceId;
            this.accessGroups = iamCredentialsSecretMetadata.accessGroups;
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
         * Builds a IAMCredentialsSecretMetadata.
         *
         * @return the new IAMCredentialsSecretMetadata instance
         */
        public IAMCredentialsSecretMetadata build() {
            return new IAMCredentialsSecretMetadata(this);
        }

        /**
         * Adds an labels to labels.
         *
         * @param labels the new labels
         * @return the IAMCredentialsSecretMetadata builder
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
         * @return the IAMCredentialsSecretMetadata builder
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
         * Set the labels.
         * Existing labels will be replaced.
         *
         * @param labels the labels
         * @return the IAMCredentialsSecretMetadata builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Set the name.
         *
         * @param name the name
         * @return the IAMCredentialsSecretMetadata builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the description.
         *
         * @param description the description
         * @return the IAMCredentialsSecretMetadata builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Set the ttl.
         *
         * @param ttl the ttl
         * @return the IAMCredentialsSecretMetadata builder
         */
        public Builder ttl(String ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * Set the serviceIdIsStatic.
         *
         * @param serviceIdIsStatic the serviceIdIsStatic
         * @return the IAMCredentialsSecretMetadata builder
         */
        public Builder serviceIdIsStatic(Boolean serviceIdIsStatic) {
            this.serviceIdIsStatic = serviceIdIsStatic;
            return this;
        }

        /**
         * Set the serviceId.
         *
         * @param serviceId the serviceId
         * @return the IAMCredentialsSecretMetadata builder
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Set the accessGroups.
         * Existing accessGroups will be replaced.
         *
         * @param accessGroups the accessGroups
         * @return the IAMCredentialsSecretMetadata builder
         */
        public Builder accessGroups(List<String> accessGroups) {
            this.accessGroups = accessGroups;
            return this;
        }
    }

    protected IAMCredentialsSecretMetadata() {
    }

    protected IAMCredentialsSecretMetadata(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
                "name cannot be null");
        labels = builder.labels;
        name = builder.name;
        description = builder.description;
        ttl = builder.ttl;
        serviceIdIsStatic = builder.serviceIdIsStatic;
        serviceId = builder.serviceId;
        accessGroups = builder.accessGroups;
    }

    /**
     * New builder.
     *
     * @return a IAMCredentialsSecretMetadata builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

