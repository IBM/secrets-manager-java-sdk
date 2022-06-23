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
public class PrivateCertificateSecretResource extends SecretResource {

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
     * The format of the returned data.
     */
    public interface Format {
        /**
         * pem.
         */
        String PEM = "pem";
        /**
         * pem_bundle.
         */
        String PEM_BUNDLE = "pem_bundle";
    }

    /**
     * The format of the generated private key.
     */
    public interface PrivateKeyFormat {
        /**
         * der.
         */
        String DER = "der";
        /**
         * pkcs8.
         */
        String PKCS8 = "pkcs8";
    }


    /**
     * Builder.
     */
    public static class Builder {
        private String name;
        private String description;
        private String secretGroupId;
        private List<String> labels;
        private String certificateTemplate;
        private String commonName;
        private Object altNames;
        private String ipSans;
        private String uriSans;
        private List<String> otherSans;
        private Object ttl;
        private String format;
        private String privateKeyFormat;
        private Boolean excludeCnFromSans;
        private Rotation rotation;
        private CertificateValidity validity;

        public Builder(SecretResource privateCertificateSecretResource) {
            this.name = privateCertificateSecretResource.name;
            this.description = privateCertificateSecretResource.description;
            this.secretGroupId = privateCertificateSecretResource.secretGroupId;
            this.labels = privateCertificateSecretResource.labels;
            this.certificateTemplate = privateCertificateSecretResource.certificateTemplate;
            this.commonName = privateCertificateSecretResource.commonName;
            this.altNames = privateCertificateSecretResource.altNames;
            this.ipSans = privateCertificateSecretResource.ipSans;
            this.uriSans = privateCertificateSecretResource.uriSans;
            this.otherSans = privateCertificateSecretResource.otherSans;
            this.ttl = privateCertificateSecretResource.ttl;
            this.format = privateCertificateSecretResource.format;
            this.privateKeyFormat = privateCertificateSecretResource.privateKeyFormat;
            this.excludeCnFromSans = privateCertificateSecretResource.excludeCnFromSans;
            this.rotation = privateCertificateSecretResource.rotation;
            this.validity = privateCertificateSecretResource.validity;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param name                the name
         * @param certificateTemplate the certificateTemplate
         * @param commonName          the commonName
         */
        public Builder(String name, String certificateTemplate, String commonName) {
            this.name = name;
            this.certificateTemplate = certificateTemplate;
            this.commonName = commonName;
        }

        /**
         * Builds a PrivateCertificateSecretResource.
         *
         * @return the new PrivateCertificateSecretResource instance
         */
        public PrivateCertificateSecretResource build() {
            return new PrivateCertificateSecretResource(this);
        }

        /**
         * Adds an labels to labels.
         *
         * @param labels the new labels
         * @return the PrivateCertificateSecretResource builder
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
         * Adds an otherSans to otherSans.
         *
         * @param otherSans the new otherSans
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder addOtherSans(String otherSans) {
            com.ibm.cloud.sdk.core.util.Validator.notNull(otherSans,
                    "otherSans cannot be null");
            if (this.otherSans == null) {
                this.otherSans = new ArrayList<String>();
            }
            this.otherSans.add(otherSans);
            return this;
        }

        /**
         * Set the name.
         *
         * @param name the name
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the description.
         *
         * @param description the description
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Set the secretGroupId.
         *
         * @param secretGroupId the secretGroupId
         * @return the PrivateCertificateSecretResource builder
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
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Set the certificateTemplate.
         *
         * @param certificateTemplate the certificateTemplate
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder certificateTemplate(String certificateTemplate) {
            this.certificateTemplate = certificateTemplate;
            return this;
        }

        /**
         * Set the commonName.
         *
         * @param commonName the commonName
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * Set the altNames.
         *
         * @param altNames the altNames
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder altNames(Object altNames) {
            this.altNames = altNames;
            return this;
        }

        /**
         * Set the ipSans.
         *
         * @param ipSans the ipSans
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder ipSans(String ipSans) {
            this.ipSans = ipSans;
            return this;
        }

        /**
         * Set the uriSans.
         *
         * @param uriSans the uriSans
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder uriSans(String uriSans) {
            this.uriSans = uriSans;
            return this;
        }

        /**
         * Set the otherSans.
         * Existing otherSans will be replaced.
         *
         * @param otherSans the otherSans
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder otherSans(List<String> otherSans) {
            this.otherSans = otherSans;
            return this;
        }

        /**
         * Set the ttl.
         *
         * @param ttl the ttl
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder ttl(Object ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * Set the format.
         *
         * @param format the format
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * Set the privateKeyFormat.
         *
         * @param privateKeyFormat the privateKeyFormat
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder privateKeyFormat(String privateKeyFormat) {
            this.privateKeyFormat = privateKeyFormat;
            return this;
        }

        /**
         * Set the excludeCnFromSans.
         *
         * @param excludeCnFromSans the excludeCnFromSans
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder excludeCnFromSans(Boolean excludeCnFromSans) {
            this.excludeCnFromSans = excludeCnFromSans;
            return this;
        }

        /**
         * Set the rotation.
         *
         * @param rotation the rotation
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder rotation(Rotation rotation) {
            this.rotation = rotation;
            return this;
        }

        /**
         * Set the validity.
         *
         * @param validity the validity
         * @return the PrivateCertificateSecretResource builder
         */
        public Builder validity(CertificateValidity validity) {
            this.validity = validity;
            return this;
        }
    }

    protected PrivateCertificateSecretResource() {
    }

    protected PrivateCertificateSecretResource(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
                "name cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificateTemplate,
                "certificateTemplate cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.commonName,
                "commonName cannot be null");
        name = builder.name;
        description = builder.description;
        secretGroupId = builder.secretGroupId;
        labels = builder.labels;
        certificateTemplate = builder.certificateTemplate;
        commonName = builder.commonName;
        altNames = builder.altNames;
        ipSans = builder.ipSans;
        uriSans = builder.uriSans;
        otherSans = builder.otherSans;
        ttl = builder.ttl;
        format = builder.format;
        privateKeyFormat = builder.privateKeyFormat;
        excludeCnFromSans = builder.excludeCnFromSans;
        rotation = builder.rotation;
        validity = builder.validity;
    }

    /**
     * New builder.
     *
     * @return a PrivateCertificateSecretResource builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

