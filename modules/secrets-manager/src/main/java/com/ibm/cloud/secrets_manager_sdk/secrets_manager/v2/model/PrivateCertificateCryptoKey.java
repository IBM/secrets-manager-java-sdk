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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The data that is associated with a cryptographic key.
 */
public class PrivateCertificateCryptoKey extends GenericModel {

    protected String id;
    protected String label;
    @SerializedName("allow_generate_key")
    protected Boolean allowGenerateKey;
    protected PrivateCertificateCryptoProvider provider;

    /**
     * Builder.
     */
    public static class Builder {
        private String id;
        private String label;
        private Boolean allowGenerateKey;
        private PrivateCertificateCryptoProvider provider;

        /**
         * Instantiates a new Builder from an existing PrivateCertificateCryptoKey instance.
         *
         * @param privateCertificateCryptoKey the instance to initialize the Builder with
         */
        private Builder(PrivateCertificateCryptoKey privateCertificateCryptoKey) {
            this.id = privateCertificateCryptoKey.id;
            this.label = privateCertificateCryptoKey.label;
            this.allowGenerateKey = privateCertificateCryptoKey.allowGenerateKey;
            this.provider = privateCertificateCryptoKey.provider;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param provider the provider
         */
        public Builder(PrivateCertificateCryptoProvider provider) {
            this.provider = provider;
        }

        /**
         * Builds a PrivateCertificateCryptoKey.
         *
         * @return the new PrivateCertificateCryptoKey instance
         */
        public PrivateCertificateCryptoKey build() {
            return new PrivateCertificateCryptoKey(this);
        }

        /**
         * Set the id.
         *
         * @param id the id
         * @return the PrivateCertificateCryptoKey builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set the label.
         *
         * @param label the label
         * @return the PrivateCertificateCryptoKey builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Set the allowGenerateKey.
         *
         * @param allowGenerateKey the allowGenerateKey
         * @return the PrivateCertificateCryptoKey builder
         */
        public Builder allowGenerateKey(Boolean allowGenerateKey) {
            this.allowGenerateKey = allowGenerateKey;
            return this;
        }

        /**
         * Set the provider.
         *
         * @param provider the provider
         * @return the PrivateCertificateCryptoKey builder
         */
        public Builder provider(PrivateCertificateCryptoProvider provider) {
            this.provider = provider;
            return this;
        }
    }

    protected PrivateCertificateCryptoKey() {
    }

    protected PrivateCertificateCryptoKey(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.provider,
                "provider cannot be null");
        id = builder.id;
        label = builder.label;
        allowGenerateKey = builder.allowGenerateKey;
        provider = builder.provider;
    }

    /**
     * New builder.
     *
     * @return a PrivateCertificateCryptoKey builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the id.
     * <p>
     * The ID of a PKCS#11 key to use. If the key does not exist and generation is enabled, this ID is given to the
     * generated key.  If the key exists, and generation is disabled, then this ID is used to look up the key. This value
     * or the crypto key label must be specified.
     *
     * @return the id
     */
    public String id() {
        return id;
    }

    /**
     * Gets the label.
     * <p>
     * The label of the key to use. If the key does not exist and generation is enabled, this field is the label that is
     * given to the generated key.  If the key exists, and generation is disabled, then this label is used to look up the
     * key. This value or the crypto key ID must be specified.
     *
     * @return the label
     */
    public String label() {
        return label;
    }

    /**
     * Gets the allowGenerateKey.
     * <p>
     * The indication of whether a new key is generated by the crypto provider if the given key name cannot be found.
     *
     * @return the allowGenerateKey
     */
    public Boolean allowGenerateKey() {
        return allowGenerateKey;
    }

    /**
     * Gets the provider.
     * <p>
     * The data that is associated with a cryptographic provider.
     *
     * @return the provider
     */
    public PrivateCertificateCryptoProvider provider() {
        return provider;
    }
}

