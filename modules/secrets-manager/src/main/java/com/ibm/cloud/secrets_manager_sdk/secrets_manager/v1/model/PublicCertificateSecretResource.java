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
public class PublicCertificateSecretResource extends SecretResource {

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
     * The identifier for the cryptographic algorithm to be used to generate the public key that is associated with the
     * certificate.
     * <p>
     * The algorithm that you select determines the encryption algorithm (`RSA` or `ECDSA`) and key size to be used to
     * generate keys and sign certificates. For longer living certificates, it is recommended to use longer keys to
     * provide more encryption protection.
     */
    public interface KeyAlgorithm {
        /**
         * RSA2048.
         */
        String RSA2048 = "RSA2048";
        /**
         * RSA4096.
         */
        String RSA4096 = "RSA4096";
        /**
         * EC256.
         */
        String EC256 = "EC256";
        /**
         * EC384.
         */
        String EC384 = "EC384";
    }


    /**
     * Builder.
     */
    public static class Builder {
        private String name;
        private String description;
        private String secretGroupId;
        private List<String> labels;
        private Boolean bundleCerts;
        private String ca;
        private String dns;
        private String keyAlgorithm;
        private Object altNames;
        private String commonName;
        private Rotation rotation;
        private IssuanceInfo issuanceInfo;
        private CertificateValidity validity;

        public Builder(SecretResource publicCertificateSecretResource) {
            this.name = publicCertificateSecretResource.name;
            this.description = publicCertificateSecretResource.description;
            this.secretGroupId = publicCertificateSecretResource.secretGroupId;
            this.labels = publicCertificateSecretResource.labels;
            this.bundleCerts = publicCertificateSecretResource.bundleCerts;
            this.ca = publicCertificateSecretResource.ca;
            this.dns = publicCertificateSecretResource.dns;
            this.keyAlgorithm = publicCertificateSecretResource.keyAlgorithm;
            this.altNames = publicCertificateSecretResource.altNames;
            this.commonName = publicCertificateSecretResource.commonName;
            this.rotation = publicCertificateSecretResource.rotation;
            this.issuanceInfo = publicCertificateSecretResource.issuanceInfo;
            this.validity = publicCertificateSecretResource.validity;
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
         * Builds a PublicCertificateSecretResource.
         *
         * @return the new PublicCertificateSecretResource instance
         */
        public PublicCertificateSecretResource build() {
            return new PublicCertificateSecretResource(this);
        }

        /**
         * Adds an labels to labels.
         *
         * @param labels the new labels
         * @return the PublicCertificateSecretResource builder
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
         * Set the name.
         *
         * @param name the name
         * @return the PublicCertificateSecretResource builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the description.
         *
         * @param description the description
         * @return the PublicCertificateSecretResource builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Set the secretGroupId.
         *
         * @param secretGroupId the secretGroupId
         * @return the PublicCertificateSecretResource builder
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
         * @return the PublicCertificateSecretResource builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Set the bundleCerts.
         *
         * @param bundleCerts the bundleCerts
         * @return the PublicCertificateSecretResource builder
         */
        public Builder bundleCerts(Boolean bundleCerts) {
            this.bundleCerts = bundleCerts;
            return this;
        }

        /**
         * Set the ca.
         *
         * @param ca the ca
         * @return the PublicCertificateSecretResource builder
         */
        public Builder ca(String ca) {
            this.ca = ca;
            return this;
        }

        /**
         * Set the dns.
         *
         * @param dns the dns
         * @return the PublicCertificateSecretResource builder
         */
        public Builder dns(String dns) {
            this.dns = dns;
            return this;
        }

        /**
         * Set the keyAlgorithm.
         *
         * @param keyAlgorithm the keyAlgorithm
         * @return the PublicCertificateSecretResource builder
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * Set the altNames.
         *
         * @param altNames the altNames
         * @return the PublicCertificateSecretResource builder
         */
        public Builder altNames(Object altNames) {
            this.altNames = altNames;
            return this;
        }

        /**
         * Set the commonName.
         *
         * @param commonName the commonName
         * @return the PublicCertificateSecretResource builder
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * Set the rotation.
         *
         * @param rotation the rotation
         * @return the PublicCertificateSecretResource builder
         */
        public Builder rotation(Rotation rotation) {
            this.rotation = rotation;
            return this;
        }

        /**
         * Set the issuanceInfo.
         *
         * @param issuanceInfo the issuanceInfo
         * @return the PublicCertificateSecretResource builder
         */
        public Builder issuanceInfo(IssuanceInfo issuanceInfo) {
            this.issuanceInfo = issuanceInfo;
            return this;
        }

        /**
         * Set the validity.
         *
         * @param validity the validity
         * @return the PublicCertificateSecretResource builder
         */
        public Builder validity(CertificateValidity validity) {
            this.validity = validity;
            return this;
        }
    }

    protected PublicCertificateSecretResource() {
    }

    protected PublicCertificateSecretResource(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
                "name cannot be null");
        name = builder.name;
        description = builder.description;
        secretGroupId = builder.secretGroupId;
        labels = builder.labels;
        bundleCerts = builder.bundleCerts;
        ca = builder.ca;
        dns = builder.dns;
        keyAlgorithm = builder.keyAlgorithm;
        altNames = builder.altNames;
        commonName = builder.commonName;
        rotation = builder.rotation;
        issuanceInfo = builder.issuanceInfo;
        validity = builder.validity;
    }

    /**
     * New builder.
     *
     * @return a PublicCertificateSecretResource builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

