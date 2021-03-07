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
package com.ibm.cloud.secrets_manager.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties that are associated with a rotation policy.
 */
public class SecretPolicyRotation extends GenericModel {

    /**
     * The MIME type that represents the policy. Currently, only the default is supported.
     */
    public interface Type {
        /**
         * application/vnd.ibm.secrets-manager.secret.policy+json.
         */
        String APPLICATION_VND_IBM_SECRETS_MANAGER_SECRET_POLICY_JSON = "application/vnd.ibm.secrets-manager.secret.policy+json";
    }

    protected String type;
    protected SecretPolicyRotationRotation rotation;

    /**
     * Builder.
     */
    public static class Builder {
        private String type;
        private SecretPolicyRotationRotation rotation;

        private Builder(SecretPolicyRotation secretPolicyRotation) {
            this.type = secretPolicyRotation.type;
            this.rotation = secretPolicyRotation.rotation;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param type     the type
         * @param rotation the rotation
         */
        public Builder(String type, SecretPolicyRotationRotation rotation) {
            this.type = type;
            this.rotation = rotation;
        }

        /**
         * Builds a SecretPolicyRotation.
         *
         * @return the new SecretPolicyRotation instance
         */
        public SecretPolicyRotation build() {
            return new SecretPolicyRotation(this);
        }

        /**
         * Set the type.
         *
         * @param type the type
         * @return the SecretPolicyRotation builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Set the rotation.
         *
         * @param rotation the rotation
         * @return the SecretPolicyRotation builder
         */
        public Builder rotation(SecretPolicyRotationRotation rotation) {
            this.rotation = rotation;
            return this;
        }
    }

    protected SecretPolicyRotation(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
                "type cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rotation,
                "rotation cannot be null");
        type = builder.type;
        rotation = builder.rotation;
    }

    /**
     * New builder.
     *
     * @return a SecretPolicyRotation builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the type.
     * <p>
     * The MIME type that represents the policy. Currently, only the default is supported.
     *
     * @return the type
     */
    public String type() {
        return type;
    }

    /**
     * Gets the rotation.
     * <p>
     * The secret rotation time interval.
     *
     * @return the rotation
     */
    public SecretPolicyRotationRotation rotation() {
        return rotation;
    }
}

