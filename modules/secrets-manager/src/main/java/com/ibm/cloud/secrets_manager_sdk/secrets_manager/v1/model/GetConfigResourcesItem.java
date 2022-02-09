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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GetConfigResourcesItem.
 * <p>
 * Classes which extend this class:
 * - PublicCertSecretEngineRootConfig
 * - IAMCredentialsSecretEngineRootConfig
 */
public class GetConfigResourcesItem extends GenericModel {

    @SerializedName("certificate_authorities")
    protected List<ConfigElementMetadata> certificateAuthorities;
    @SerializedName("dns_providers")
    protected List<ConfigElementMetadata> dnsProviders;
    @SerializedName("api_key")
    protected String apiKey;
    @SerializedName("api_key_hash")
    protected String apiKeyHash;

    protected GetConfigResourcesItem() {
    }

    /**
     * Gets the certificateAuthorities.
     * <p>
     * The certificate authority configurations that are associated with your instance.
     *
     * @return the certificateAuthorities
     */
    public List<ConfigElementMetadata> getCertificateAuthorities() {
        return certificateAuthorities;
    }

    /**
     * Gets the dnsProviders.
     * <p>
     * The DNS provider configurations that are associated with your instance.
     *
     * @return the dnsProviders
     */
    public List<ConfigElementMetadata> getDnsProviders() {
        return dnsProviders;
    }

    /**
     * Gets the apiKey.
     * <p>
     * An IBM Cloud API key that can create and manage service IDs.
     * <p>
     * The API key must be assigned the Editor platform role on the Access Groups Service and the Operator platform role
     * on the IAM Identity Service. For more information, see the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-configure-iam-engine).
     *
     * @return the apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Gets the apiKeyHash.
     * <p>
     * The hash value of the IBM Cloud API key that is used to create and manage service IDs.
     *
     * @return the apiKeyHash
     */
    public String getApiKeyHash() {
        return apiKeyHash;
    }
}

