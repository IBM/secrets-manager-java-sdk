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

import java.util.Map;

/**
 * The body of a request to rotate a private certificate.
 */
public class RotatePrivateCertBodyWithCsr extends SecretAction {


    /**
     * Builder.
     */
    public static class Builder {
        private String csr;
        private Map<String, Object> customMetadata;
        private Map<String, Object> versionCustomMetadata;

        /**
         * Instantiates a new Builder from an existing RotatePrivateCertBodyWithCsr instance.
         *
         * @param rotatePrivateCertBodyWithCsr the instance to initialize the Builder with
         */
        public Builder(SecretAction rotatePrivateCertBodyWithCsr) {
            this.csr = rotatePrivateCertBodyWithCsr.csr;
            this.customMetadata = rotatePrivateCertBodyWithCsr.customMetadata;
            this.versionCustomMetadata = rotatePrivateCertBodyWithCsr.versionCustomMetadata;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param csr the csr
         */
        public Builder(String csr) {
            this.csr = csr;
        }

        /**
         * Builds a RotatePrivateCertBodyWithCsr.
         *
         * @return the new RotatePrivateCertBodyWithCsr instance
         */
        public RotatePrivateCertBodyWithCsr build() {
            return new RotatePrivateCertBodyWithCsr(this);
        }

        /**
         * Set the csr.
         *
         * @param csr the csr
         * @return the RotatePrivateCertBodyWithCsr builder
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * Set the customMetadata.
         *
         * @param customMetadata the customMetadata
         * @return the RotatePrivateCertBodyWithCsr builder
         */
        public Builder customMetadata(Map<String, Object> customMetadata) {
            this.customMetadata = customMetadata;
            return this;
        }

        /**
         * Set the versionCustomMetadata.
         *
         * @param versionCustomMetadata the versionCustomMetadata
         * @return the RotatePrivateCertBodyWithCsr builder
         */
        public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
            this.versionCustomMetadata = versionCustomMetadata;
            return this;
        }
    }

    protected RotatePrivateCertBodyWithCsr() {
    }

    protected RotatePrivateCertBodyWithCsr(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.csr,
                "csr cannot be null");
        csr = builder.csr;
        customMetadata = builder.customMetadata;
        versionCustomMetadata = builder.versionCustomMetadata;
    }

    /**
     * New builder.
     *
     * @return a RotatePrivateCertBodyWithCsr builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

