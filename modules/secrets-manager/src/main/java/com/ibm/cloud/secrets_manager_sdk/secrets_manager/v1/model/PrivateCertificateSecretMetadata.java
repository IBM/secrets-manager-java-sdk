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
import java.util.Map;

/**
 * Metadata properties that describe a private certificate secret.
 */
public class PrivateCertificateSecretMetadata extends SecretMetadata {

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
        private Map<String, Object> customMetadata;
        private Rotation rotation;
        private CertificateValidity validity;

        /**
         * Instantiates a new Builder from an existing PrivateCertificateSecretMetadata instance.
         *
         * @param privateCertificateSecretMetadata the instance to initialize the Builder with
         */
        public Builder(SecretMetadata privateCertificateSecretMetadata) {
            this.labels = privateCertificateSecretMetadata.labels;
            this.name = privateCertificateSecretMetadata.name;
            this.description = privateCertificateSecretMetadata.description;
            this.customMetadata = privateCertificateSecretMetadata.customMetadata;
            this.rotation = privateCertificateSecretMetadata.rotation;
            this.validity = privateCertificateSecretMetadata.validity;
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
         * Builds a PrivateCertificateSecretMetadata.
         *
         * @return the new PrivateCertificateSecretMetadata instance
         */
        public PrivateCertificateSecretMetadata build() {
            return new PrivateCertificateSecretMetadata(this);
        }

        /**
         * Adds an labels to labels.
         *
         * @param labels the new labels
         * @return the PrivateCertificateSecretMetadata builder
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
         * Set the labels.
         * Existing labels will be replaced.
         *
         * @param labels the labels
         * @return the PrivateCertificateSecretMetadata builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Set the name.
         *
         * @param name the name
         * @return the PrivateCertificateSecretMetadata builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the description.
         *
         * @param description the description
         * @return the PrivateCertificateSecretMetadata builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Set the customMetadata.
         *
         * @param customMetadata the customMetadata
         * @return the PrivateCertificateSecretMetadata builder
         */
        public Builder customMetadata(Map<String, Object> customMetadata) {
            this.customMetadata = customMetadata;
            return this;
        }

        /**
         * Set the rotation.
         *
         * @param rotation the rotation
         * @return the PrivateCertificateSecretMetadata builder
         */
        public Builder rotation(Rotation rotation) {
            this.rotation = rotation;
            return this;
        }

        /**
         * Set the validity.
         *
         * @param validity the validity
         * @return the PrivateCertificateSecretMetadata builder
         */
        public Builder validity(CertificateValidity validity) {
            this.validity = validity;
            return this;
        }
    }

    protected PrivateCertificateSecretMetadata() {
    }

    protected PrivateCertificateSecretMetadata(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
                "name cannot be null");
        labels = builder.labels;
        name = builder.name;
        description = builder.description;
        customMetadata = builder.customMetadata;
        rotation = builder.rotation;
        validity = builder.validity;
    }

    /**
     * New builder.
     *
     * @return a PrivateCertificateSecretMetadata builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

