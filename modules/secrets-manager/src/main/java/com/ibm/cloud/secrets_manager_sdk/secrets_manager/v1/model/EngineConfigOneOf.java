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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EngineConfigOneOf.
 * <p>
 * Classes which extend this class:
 * - EngineConfigOneOfIAMSecretEngineRootConfig
 */
public class EngineConfigOneOf extends GenericModel {

    @SerializedName("api_key")
    protected String apiKey;
    @SerializedName("api_key_hash")
    protected String apiKeyHash;

    protected EngineConfigOneOf() {
    }

    /**
     * Gets the apiKey.
     * <p>
     * An IBM Cloud API key that has the capability to create and manage service IDs.
     * <p>
     * The API key must be assigned the Editor platform role on the Access Groups Service and the Operator platform role
     * on the IAM Identity Service. For more information, see [Enabling the IAM secrets
     * engine](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-secret-engines#configure-iam-engine).
     *
     * @return the apiKey
     */
    public String apiKey() {
        return apiKey;
    }

    /**
     * Gets the apiKeyHash.
     * <p>
     * The hash value of the IBM Cloud API key that is used to create and manage service IDs.
     *
     * @return the apiKeyHash
     */
    public String apiKeyHash() {
        return apiKeyHash;
    }
}

