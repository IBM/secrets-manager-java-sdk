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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The lockSecret options.
 */
public class LockSecretOptions extends GenericModel {

  /**
   * The secret type.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** kv. */
    String KV = "kv";
  }

  /**
   * An optional lock mode. At lock creation, you can set one of the following modes to clear any matching locks on a
   * secret version. Note: When you are locking the `previous` version, the mode parameter is ignored.
   *
   * - `exclusive`: Removes any other locks with matching names if they are found in the previous version of the secret.
   * - `exclusive_delete`: Same as `exclusive`, but also permanently deletes the data of the previous secret version if
   * it doesn't have any locks.
   */
  public interface Mode {
    /** exclusive. */
    String EXCLUSIVE = "exclusive";
    /** exclusive_delete. */
    String EXCLUSIVE_DELETE = "exclusive_delete";
  }

  protected String secretType;
  protected String id;
  protected List<LockSecretBodyLocksItem> locks;
  protected String mode;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;
    private String id;
    private List<LockSecretBodyLocksItem> locks;
    private String mode;

    /**
     * Instantiates a new Builder from an existing LockSecretOptions instance.
     *
     * @param lockSecretOptions the instance to initialize the Builder with
     */
    private Builder(LockSecretOptions lockSecretOptions) {
      this.secretType = lockSecretOptions.secretType;
      this.id = lockSecretOptions.id;
      this.locks = lockSecretOptions.locks;
      this.mode = lockSecretOptions.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param secretType the secretType
     * @param id the id
     */
    public Builder(String secretType, String id) {
      this.secretType = secretType;
      this.id = id;
    }

    /**
     * Builds a LockSecretOptions.
     *
     * @return the new LockSecretOptions instance
     */
    public LockSecretOptions build() {
      return new LockSecretOptions(this);
    }

    /**
     * Adds an locks to locks.
     *
     * @param locks the new locks
     * @return the LockSecretOptions builder
     */
    public Builder addLocks(LockSecretBodyLocksItem locks) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(locks,
        "locks cannot be null");
      if (this.locks == null) {
        this.locks = new ArrayList<LockSecretBodyLocksItem>();
      }
      this.locks.add(locks);
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the LockSecretOptions builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the LockSecretOptions builder
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
     * @return the LockSecretOptions builder
     */
    public Builder locks(List<LockSecretBodyLocksItem> locks) {
      this.locks = locks;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the LockSecretOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected LockSecretOptions() { }

  protected LockSecretOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
      "secretType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    secretType = builder.secretType;
    id = builder.id;
    locks = builder.locks;
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a LockSecretOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secretType.
   *
   * The secret type.
   *
   * @return the secretType
   */
  public String secretType() {
    return secretType;
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies the secret.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the locks.
   *
   * The lock data to be attached to a secret version.
   *
   * @return the locks
   */
  public List<LockSecretBodyLocksItem> locks() {
    return locks;
  }

  /**
   * Gets the mode.
   *
   * An optional lock mode. At lock creation, you can set one of the following modes to clear any matching locks on a
   * secret version. Note: When you are locking the `previous` version, the mode parameter is ignored.
   *
   * - `exclusive`: Removes any other locks with matching names if they are found in the previous version of the secret.
   * - `exclusive_delete`: Same as `exclusive`, but also permanently deletes the data of the previous secret version if
   * it doesn't have any locks.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

