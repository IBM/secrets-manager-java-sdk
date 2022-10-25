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
 * Properties that describe the locks that are associated with an instance.
 */
public class InstanceSecretsLocks extends DynamicModel<Object> {

  /**
   * The secret type.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
    /** kv. */
    String KV = "kv";
  }

  @SerializedName("secret_id")
  protected String secretId;
  @SerializedName("secret_group_id")
  protected String secretGroupId;
  @SerializedName("secret_type")
  protected String secretType;
  @SerializedName("versions")
  protected List<SecretLockVersion> versions;

  public InstanceSecretsLocks() {
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
   * Gets the secretType.
   *
   * The secret type.
   *
   * @return the secretType
   */
  public String getSecretType() {
    return this.secretType;
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
