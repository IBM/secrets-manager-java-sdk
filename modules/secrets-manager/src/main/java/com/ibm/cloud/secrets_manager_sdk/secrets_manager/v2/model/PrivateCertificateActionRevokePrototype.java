/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model;

/**
 * The request body to specify the properties of the action to revoke the private certificate.
 */
public class PrivateCertificateActionRevokePrototype extends SecretActionPrototype {

    /**
     * The type of secret action.
     */
    public interface ActionType {
        /**
         * public_cert_action_validate_dns_challenge.
         */
        String PUBLIC_CERT_ACTION_VALIDATE_DNS_CHALLENGE = "public_cert_action_validate_dns_challenge";
        /**
         * private_cert_action_revoke_certificate.
         */
        String PRIVATE_CERT_ACTION_REVOKE_CERTIFICATE = "private_cert_action_revoke_certificate";
    }


    /**
     * Builder.
     */
    public static class Builder {
        private String actionType;

        /**
         * Instantiates a new Builder from an existing PrivateCertificateActionRevokePrototype instance.
         *
         * @param privateCertificateActionRevokePrototype the instance to initialize the Builder with
         */
        public Builder(SecretActionPrototype privateCertificateActionRevokePrototype) {
            this.actionType = privateCertificateActionRevokePrototype.actionType;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param actionType the actionType
         */
        public Builder(String actionType) {
            this.actionType = actionType;
        }

        /**
         * Builds a PrivateCertificateActionRevokePrototype.
         *
         * @return the new PrivateCertificateActionRevokePrototype instance
         */
        public PrivateCertificateActionRevokePrototype build() {
            return new PrivateCertificateActionRevokePrototype(this);
        }

        /**
         * Set the actionType.
         *
         * @param actionType the actionType
         * @return the PrivateCertificateActionRevokePrototype builder
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
    }

    protected PrivateCertificateActionRevokePrototype() {
    }

    protected PrivateCertificateActionRevokePrototype(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actionType,
                "actionType cannot be null");
        actionType = builder.actionType;
    }

    /**
     * New builder.
     *
     * @return a PrivateCertificateActionRevokePrototype builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

