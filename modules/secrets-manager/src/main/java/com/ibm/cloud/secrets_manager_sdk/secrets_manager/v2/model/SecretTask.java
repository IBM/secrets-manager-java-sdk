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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties of a Secret's task.
 */
public class SecretTask extends GenericModel {

  /**
   * The type of the task, can be either "create_credentials" or "delete_credentials".
   */
  public interface Type {
    /** create_credentials. */
    String CREATE_CREDENTIALS = "create_credentials";
    /** delete_credentials. */
    String DELETE_CREDENTIALS = "delete_credentials";
  }

  /**
   * The status of a task, could be one of: queued, processing, succeeded, failed.
   */
  public interface Status {
    /** queued. */
    String QUEUED = "queued";
    /** processing. */
    String PROCESSING = "processing";
    /** credentials_created. */
    String CREDENTIALS_CREATED = "credentials_created";
    /** credentials_deleted. */
    String CREDENTIALS_DELETED = "credentials_deleted";
    /** failed. */
    String FAILED = "failed";
  }

  /**
   * Information about what has initiated the task.
   */
  public interface Trigger {
    /** secret_creation. */
    String SECRET_CREATION = "secret_creation";
    /** manual_secret_rotation. */
    String MANUAL_SECRET_ROTATION = "manual_secret_rotation";
    /** automatic_secret_rotation. */
    String AUTOMATIC_SECRET_ROTATION = "automatic_secret_rotation";
    /** secret_version_expiration. */
    String SECRET_VERSION_EXPIRATION = "secret_version_expiration";
    /** secret_version_data_deletion. */
    String SECRET_VERSION_DATA_DELETION = "secret_version_data_deletion";
  }

  protected String id;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("creation_date")
  protected Date creationDate;
  @SerializedName("last_update_date")
  protected Date lastUpdateDate;
  @SerializedName("updated_by")
  protected String updatedBy;
  protected String type;
  protected String status;
  protected String trigger;
  @SerializedName("secret_id")
  protected String secretId;
  @SerializedName("secret_version_id")
  protected String secretVersionId;
  protected List<SecretTaskError> errors;

  protected SecretTask() { }

  /**
   * Gets the id.
   *
   * A Secret Manager task identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
   * Gets the creationDate.
   *
   * The date when the resource was created. The date format follows `RFC 3339`.
   *
   * @return the creationDate
   */
  public Date getCreationDate() {
    return creationDate;
  }

  /**
   * Gets the lastUpdateDate.
   *
   * The date when a resource was modified. The date format follows `RFC 3339`.
   *
   * @return the lastUpdateDate
   */
  public Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  /**
   * Gets the updatedBy.
   *
   * The unique identifier that is associated with the entity that updated the resource.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Gets the type.
   *
   * The type of the task, can be either "create_credentials" or "delete_credentials".
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the status.
   *
   * The status of a task, could be one of: queued, processing, succeeded, failed.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the trigger.
   *
   * Information about what has initiated the task.
   *
   * @return the trigger
   */
  public String getTrigger() {
    return trigger;
  }

  /**
   * Gets the secretId.
   *
   * A UUID identifier.
   *
   * @return the secretId
   */
  public String getSecretId() {
    return secretId;
  }

  /**
   * Gets the secretVersionId.
   *
   * A UUID identifier.
   *
   * @return the secretVersionId
   */
  public String getSecretVersionId() {
    return secretVersionId;
  }

  /**
   * Gets the errors.
   *
   * A collection of errors.
   *
   * @return the errors
   */
  public List<SecretTaskError> getErrors() {
    return errors;
  }
}

