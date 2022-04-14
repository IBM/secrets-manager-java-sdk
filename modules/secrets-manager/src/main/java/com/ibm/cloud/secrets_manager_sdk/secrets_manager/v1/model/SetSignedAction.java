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
 * A request to set a signed certificate in an intermediate certificate authority.
 */
public class SetSignedAction extends ConfigAction {


    /**
     * Builder.
     */
    public static class Builder {
        private String certificate;

        public Builder(ConfigAction setSignedAction) {
            this.certificate = setSignedAction.certificate;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param certificate the certificate
         */
        public Builder(String certificate) {
            this.certificate = certificate;
        }

        /**
         * Builds a SetSignedAction.
         *
         * @return the new SetSignedAction instance
         */
        public SetSignedAction build() {
            return new SetSignedAction(this);
        }

        /**
         * Set the certificate.
         *
         * @param certificate the certificate
         * @return the SetSignedAction builder
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
    }

    protected SetSignedAction(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificate,
                "certificate cannot be null");
        certificate = builder.certificate;
    }

    /**
     * New builder.
     *
     * @return a SetSignedAction builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

