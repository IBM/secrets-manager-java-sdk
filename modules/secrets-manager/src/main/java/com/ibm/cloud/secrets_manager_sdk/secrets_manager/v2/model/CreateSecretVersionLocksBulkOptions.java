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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSecretVersionLocksBulk options.
 */
public class CreateSecretVersionLocksBulkOptions extends GenericModel {

  /**
   * An optional lock mode. When you create a lock, you can set one of the following modes to clear any matching locks
   * on a secret version.
   * - `remove_previous`: Removes any other locks with matching names if they are found in the previous version of the
   * secret. - `remove_previous_and_delete`: Completes the same action as `remove_previous`, but also permanently
   * deletes the data of the previous secret version if it doesn't have any locks.
   */
  public interface Mode {
    /** remove_previous. */
    String REMOVE_PREVIOUS = "remove_previous";
    /** remove_previous_and_delete. */
    String REMOVE_PREVIOUS_AND_DELETE = "remove_previous_and_delete";
  }

  protected String secretId;
  protected String id;
  protected List<SecretLockPrototype> locks;
  protected String mode;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretId;
    private String id;
    private List<SecretLockPrototype> locks;
    private String mode;

    /**
     * Instantiates a new Builder from an existing CreateSecretVersionLocksBulkOptions instance.
     *
     * @param createSecretVersionLocksBulkOptions the instance to initialize the Builder with
     */
    private Builder(CreateSecretVersionLocksBulkOptions createSecretVersionLocksBulkOptions) {
      this.secretId = createSecretVersionLocksBulkOptions.secretId;
      this.id = createSecretVersionLocksBulkOptions.id;
      this.locks = createSecretVersionLocksBulkOptions.locks;
      this.mode = createSecretVersionLocksBulkOptions.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param secretId the secretId
     * @param id the id
     * @param locks the locks
     */
    public Builder(String secretId, String id, List<SecretLockPrototype> locks) {
      this.secretId = secretId;
      this.id = id;
      this.locks = locks;
    }

    /**
     * Builds a CreateSecretVersionLocksBulkOptions.
     *
     * @return the new CreateSecretVersionLocksBulkOptions instance
     */
    public CreateSecretVersionLocksBulkOptions build() {
      return new CreateSecretVersionLocksBulkOptions(this);
    }

    /**
     * Adds an locks to locks.
     *
     * @param locks the new locks
     * @return the CreateSecretVersionLocksBulkOptions builder
     */
    public Builder addLocks(SecretLockPrototype locks) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(locks,
        "locks cannot be null");
      if (this.locks == null) {
        this.locks = new ArrayList<SecretLockPrototype>();
      }
      this.locks.add(locks);
      return this;
    }

    /**
     * Set the secretId.
     *
     * @param secretId the secretId
     * @return the CreateSecretVersionLocksBulkOptions builder
     */
    public Builder secretId(String secretId) {
      this.secretId = secretId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateSecretVersionLocksBulkOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the locks.
     * Existing locks will be replaced.
     *
     * @param locks the locks
     * @return the CreateSecretVersionLocksBulkOptions builder
     */
    public Builder locks(List<SecretLockPrototype> locks) {
      this.locks = locks;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the CreateSecretVersionLocksBulkOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected CreateSecretVersionLocksBulkOptions() { }

  protected CreateSecretVersionLocksBulkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretId,
      "secretId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locks,
      "locks cannot be null");
    secretId = builder.secretId;
    id = builder.id;
    locks = builder.locks;
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a CreateSecretVersionLocksBulkOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secretId.
   *
   * The v4 UUID that uniquely identifies your secret.
   *
   * @return the secretId
   */
  public String secretId() {
    return secretId;
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies your secret version. You can use the `current` or `previous` aliases to refer
   * to the current or previous secret version.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the locks.
   *
   * The locks data to be attached to a secret version.
   *
   * @return the locks
   */
  public List<SecretLockPrototype> locks() {
    return locks;
  }

  /**
   * Gets the mode.
   *
   * An optional lock mode. When you create a lock, you can set one of the following modes to clear any matching locks
   * on a secret version.
   * - `remove_previous`: Removes any other locks with matching names if they are found in the previous version of the
   * secret. - `remove_previous_and_delete`: Completes the same action as `remove_previous`, but also permanently
   * deletes the data of the previous secret version if it doesn't have any locks.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

