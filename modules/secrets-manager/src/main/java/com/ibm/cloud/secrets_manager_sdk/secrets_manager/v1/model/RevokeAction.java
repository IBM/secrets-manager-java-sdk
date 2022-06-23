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
 * A request to revoke the certificate of an internally signed intermediate certificate authority.
 */
public class RevokeAction extends ConfigAction {


    /**
     * Builder.
     */
    public static class Builder {
        private String serialNumber;

        public Builder(ConfigAction revokeAction) {
            this.serialNumber = revokeAction.serialNumber;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param serialNumber the serialNumber
         */
        public Builder(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        /**
         * Builds a RevokeAction.
         *
         * @return the new RevokeAction instance
         */
        public RevokeAction build() {
            return new RevokeAction(this);
        }

        /**
         * Set the serialNumber.
         *
         * @param serialNumber the serialNumber
         * @return the RevokeAction builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
    }

    protected RevokeAction() {
    }

    protected RevokeAction(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.serialNumber,
                "serialNumber cannot be null");
        serialNumber = builder.serialNumber;
    }

    /**
     * New builder.
     *
     * @return a RevokeAction builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

