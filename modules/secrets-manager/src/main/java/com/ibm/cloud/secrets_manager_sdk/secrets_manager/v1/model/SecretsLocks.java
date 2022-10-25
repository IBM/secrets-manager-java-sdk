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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Properties that describe the secret locks.
 */
public class SecretsLocks extends DynamicModel<Object> {

  @SerializedName("secret_id")
  protected String secretId;
  @SerializedName("secret_group_id")
  protected String secretGroupId;
  @SerializedName("versions")
  protected List<SecretLockVersion> versions;

  public SecretsLocks() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the secretId.
   *
   * The unique ID of the secret.
   *
   * @return the secretId
   */
  public String getSecretId() {
    return this.secretId;
  }

  /**
   * Gets the secretGroupId.
   *
   * The v4 UUID that uniquely identifies the secret group to assign to this secret.
   *
   * If you omit this parameter, your secret is assigned to the `default` secret group.
   *
   * @return the secretGroupId
   */
  public String getSecretGroupId() {
    return this.secretGroupId;
  }

  /**
   * Gets the versions.
   *
   * A collection of locks that are attached to a secret version.
   *
   * @return the versions
   */
  public List<SecretLockVersion> getVersions() {
    return this.versions;
  }
}
