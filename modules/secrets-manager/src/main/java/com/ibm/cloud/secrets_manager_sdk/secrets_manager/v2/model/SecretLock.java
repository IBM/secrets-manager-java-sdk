/*
 * (C) Copyright IBM Corp. 2023.
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

import java.util.Date;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretLock.
 */
public class SecretLock extends GenericModel {

  /**
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   */
  public interface SecretVersionAlias {
    /** current. */
    String CURRENT = "current";
    /** previous. */
    String PREVIOUS = "previous";
  }

  protected String name;
  protected String description;
  protected Map<String, Object> attributes;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("secret_group_id")
  protected String secretGroupId;
  @SerializedName("secret_id")
  protected String secretId;
  @SerializedName("secret_version_id")
  protected String secretVersionId;
  @SerializedName("secret_version_alias")
  protected String secretVersionAlias;

  protected SecretLock() { }

  /**
   * Gets the name.
   *
   * A human-readable name to assign to the lock. The lock name must be unique per secret version.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a name for your secret lock.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * An extended description of the lock.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret
   * lock.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the attributes.
   *
   * Optional information to associate with a lock, such as resources CRNs to be used by automation.
   *
   * @return the attributes
   */
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  /**
   * Gets the createdAt.
   *
   * The date when the resource was created. The date format follows `RFC 3339`.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * The date when a resource was modified. The date format follows `RFC 3339`.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the createdBy.
   *
   * The unique identifier that is associated with the entity that created the secret.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
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
   * Gets the secretVersionId.
   *
   * A v4 UUID identifier.
   *
   * @return the secretVersionId
   */
  public String getSecretVersionId() {
    return secretVersionId;
  }

  /**
   * Gets the secretVersionAlias.
   *
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   *
   * @return the secretVersionAlias
   */
  public String getSecretVersionAlias() {
    return secretVersionAlias;
  }
}

