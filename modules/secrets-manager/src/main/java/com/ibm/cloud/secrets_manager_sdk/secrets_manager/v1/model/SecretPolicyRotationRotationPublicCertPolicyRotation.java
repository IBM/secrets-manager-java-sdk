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
 * The `public_cert` secret rotation policy.
 */
public class SecretPolicyRotationRotationPublicCertPolicyRotation extends SecretPolicyRotationRotation {


    /**
     * Builder.
     */
    public static class Builder {
        private Boolean autoRotate;
        private Boolean rotateKeys;

        public Builder(SecretPolicyRotationRotation secretPolicyRotationRotationPublicCertPolicyRotation) {
            this.autoRotate = secretPolicyRotationRotationPublicCertPolicyRotation.autoRotate;
            this.rotateKeys = secretPolicyRotationRotationPublicCertPolicyRotation.rotateKeys;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param autoRotate the autoRotate
         * @param rotateKeys the rotateKeys
         */
        public Builder(Boolean autoRotate, Boolean rotateKeys) {
            this.autoRotate = autoRotate;
            this.rotateKeys = rotateKeys;
        }

        /**
         * Builds a SecretPolicyRotationRotationPublicCertPolicyRotation.
         *
         * @return the new SecretPolicyRotationRotationPublicCertPolicyRotation instance
         */
        public SecretPolicyRotationRotationPublicCertPolicyRotation build() {
            return new SecretPolicyRotationRotationPublicCertPolicyRotation(this);
        }

        /**
         * Set the autoRotate.
         *
         * @param autoRotate the autoRotate
         * @return the SecretPolicyRotationRotationPublicCertPolicyRotation builder
         */
        public Builder autoRotate(Boolean autoRotate) {
            this.autoRotate = autoRotate;
            return this;
        }

        /**
         * Set the rotateKeys.
         *
         * @param rotateKeys the rotateKeys
         * @return the SecretPolicyRotationRotationPublicCertPolicyRotation builder
         */
        public Builder rotateKeys(Boolean rotateKeys) {
            this.rotateKeys = rotateKeys;
            return this;
        }
    }

    protected SecretPolicyRotationRotationPublicCertPolicyRotation() {
    }

    protected SecretPolicyRotationRotationPublicCertPolicyRotation(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.autoRotate,
                "autoRotate cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rotateKeys,
                "rotateKeys cannot be null");
        autoRotate = builder.autoRotate;
        rotateKeys = builder.rotateKeys;
    }

    /**
     * New builder.
     *
     * @return a SecretPolicyRotationRotationPublicCertPolicyRotation builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

