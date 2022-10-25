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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EngineConfig.
 *
 * Classes which extend this class:
 * - CreateIAMCredentialsSecretEngineRootConfig
 */
public class EngineConfig extends GenericModel {

  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("api_key_hash")
  protected String apiKeyHash;

  protected EngineConfig() { }

  /**
   * Gets the apiKey.
   *
   * An IBM Cloud API key that can create and manage service IDs.
   *
   * The API key must be assigned the Editor platform role on the Access Groups Service and the Operator platform role
   * on the IAM Identity Service. For more information, see the
   * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-configure-iam-engine).
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the apiKeyHash.
   *
   * The hash value of the IBM Cloud API key that is used to create and manage service IDs.
   *
   * @return the apiKeyHash
   */
  public String apiKeyHash() {
    return apiKeyHash;
  }
}

