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

import java.util.ArrayList;
import java.util.List;

/**
 * The base schema for secrets.
 */
public class SecretResourceIAMSecretResource extends SecretResource {

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


    /**
     * Builder.
     */
    public static class Builder {
        private String type;
        private String name;
        private String description;
        private String secretGroupId;
        private List<String> labels;
        private Object ttl;
        private List<String> accessGroups;

        public Builder(SecretResource secretResourceIamSecretResource) {
            this.type = secretResourceIamSecretResource.type;
            this.name = secretResourceIamSecretResource.name;
            this.description = secretResourceIamSecretResource.description;
            this.secretGroupId = secretResourceIamSecretResource.secretGroupId;
            this.labels = secretResourceIamSecretResource.labels;
            this.ttl = secretResourceIamSecretResource.ttl;
            this.accessGroups = secretResourceIamSecretResource.accessGroups;
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
         * Builds a SecretResourceIAMSecretResource.
         *
         * @return the new SecretResourceIAMSecretResource instance
         */
        public SecretResourceIAMSecretResource build() {
            return new SecretResourceIAMSecretResource(this);
        }

        /**
         * Adds an labels to labels.
         *
         * @param labels the new labels
         * @return the SecretResourceIAMSecretResource builder
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
         * @return the SecretResourceIAMSecretResource builder
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
         * Set the type.
         *
         * @param type the type
         * @return the SecretResourceIAMSecretResource builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Set the name.
         *
         * @param name the name
         * @return the SecretResourceIAMSecretResource builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the description.
         *
         * @param description the description
         * @return the SecretResourceIAMSecretResource builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Set the secretGroupId.
         *
         * @param secretGroupId the secretGroupId
         * @return the SecretResourceIAMSecretResource builder
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
         * @return the SecretResourceIAMSecretResource builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Set the ttl.
         *
         * @param ttl the ttl
         * @return the SecretResourceIAMSecretResource builder
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
         * @return the SecretResourceIAMSecretResource builder
         */
        public Builder accessGroups(List<String> accessGroups) {
            this.accessGroups = accessGroups;
            return this;
        }
    }

    protected SecretResourceIAMSecretResource(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
                "name cannot be null");
        type = builder.type;
        name = builder.name;
        description = builder.description;
        secretGroupId = builder.secretGroupId;
        labels = builder.labels;
        ttl = builder.ttl;
        accessGroups = builder.accessGroups;
    }

    /**
     * New builder.
     *
     * @return a SecretResourceIAMSecretResource builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

