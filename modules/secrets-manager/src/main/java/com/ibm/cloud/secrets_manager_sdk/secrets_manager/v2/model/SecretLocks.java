/*
 * (C) Copyright IBM Corp. 2024.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Create locks response body containing a collection of locks that are attached to a secret.
 */
public class SecretLocks extends GenericModel {

  /**
   * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
   * service_credentials, kv, and username_password.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** kv. */
    String KV = "kv";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** service_credentials. */
    String SERVICE_CREDENTIALS = "service_credentials";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
  }

  @SerializedName("secret_id")
  protected String secretId;
  @SerializedName("secret_group_id")
  protected String secretGroupId;
  @SerializedName("secret_type")
  protected String secretType;
  @SerializedName("secret_name")
  protected String secretName;
  protected List<SecretVersionLocks> versions;

  protected SecretLocks() { }

  /**
   * Gets the secretId.
   *
   * A v4 UUID identifier.
   *
   * @return the secretId
   */
  public String getSecretId() {
    return secretId;
  }

  /**
   * Gets the secretGroupId.
   *
   * A v4 UUID identifier, or `default` secret group.
   *
   * @return the secretGroupId
   */
  public String getSecretGroupId() {
    return secretGroupId;
  }

  /**
   * Gets the secretType.
   *
   * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
   * service_credentials, kv, and username_password.
   *
   * @return the secretType
   */
  public String getSecretType() {
    return secretType;
  }

  /**
   * Gets the secretName.
   *
   * The human-readable name of your secret.
   *
   * @return the secretName
   */
  public String getSecretName() {
    return secretName;
  }

  /**
   * Gets the versions.
   *
   * A collection of locks that are attached to a secret.
   *
   * @return the versions
   */
  public List<SecretVersionLocks> getVersions() {
    return versions;
  }
}

