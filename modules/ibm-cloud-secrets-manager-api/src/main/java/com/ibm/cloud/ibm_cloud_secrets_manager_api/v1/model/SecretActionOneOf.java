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
package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretActionOneOf.
 *
 * Classes which extend this class:
 * - SecretActionOneOfRotateArbitrarySecretBody
 * - SecretActionOneOfRotateUsernamePasswordSecretBody
 * - SecretActionOneOfDeleteCredentialsForIAMSecret
 */
public class SecretActionOneOf extends GenericModel {

  protected String payload;
  protected String password;
  @SerializedName("service_id")
  protected String serviceId;

  protected SecretActionOneOf() {
  }

  /**
   * Gets the payload.
   *
   * The new secret data to assign to an `arbitrary` secret.
   *
   * @return the payload
   */
  public String payload() {
    return payload;
  }

  /**
   * Gets the password.
   *
   * The new password to assign to a `username_password` secret.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the serviceId.
   *
   * The service ID that you want to delete. It is deleted together with its API key.
   *
   * @return the serviceId
   */
  public String serviceId() {
    return serviceId;
  }
}

