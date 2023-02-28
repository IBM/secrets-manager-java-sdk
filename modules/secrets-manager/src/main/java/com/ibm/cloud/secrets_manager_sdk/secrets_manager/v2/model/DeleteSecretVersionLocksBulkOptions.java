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
 * The deleteSecretVersionLocksBulk options.
 */
public class DeleteSecretVersionLocksBulkOptions extends GenericModel {

  protected String secretId;
  protected String id;
  protected List<String> name;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretId;
    private String id;
    private List<String> name;

    /**
     * Instantiates a new Builder from an existing DeleteSecretVersionLocksBulkOptions instance.
     *
     * @param deleteSecretVersionLocksBulkOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSecretVersionLocksBulkOptions deleteSecretVersionLocksBulkOptions) {
      this.secretId = deleteSecretVersionLocksBulkOptions.secretId;
      this.id = deleteSecretVersionLocksBulkOptions.id;
      this.name = deleteSecretVersionLocksBulkOptions.name;
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
     */
    public Builder(String secretId, String id) {
      this.secretId = secretId;
      this.id = id;
    }

    /**
     * Builds a DeleteSecretVersionLocksBulkOptions.
     *
     * @return the new DeleteSecretVersionLocksBulkOptions instance
     */
    public DeleteSecretVersionLocksBulkOptions build() {
      return new DeleteSecretVersionLocksBulkOptions(this);
    }

    /**
     * Adds an name to name.
     *
     * @param name the new name
     * @return the DeleteSecretVersionLocksBulkOptions builder
     */
    public Builder addName(String name) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name,
        "name cannot be null");
      if (this.name == null) {
        this.name = new ArrayList<String>();
      }
      this.name.add(name);
      return this;
    }

    /**
     * Set the secretId.
     *
     * @param secretId the secretId
     * @return the DeleteSecretVersionLocksBulkOptions builder
     */
    public Builder secretId(String secretId) {
      this.secretId = secretId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteSecretVersionLocksBulkOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     * Existing name will be replaced.
     *
     * @param name the name
     * @return the DeleteSecretVersionLocksBulkOptions builder
     */
    public Builder name(List<String> name) {
      this.name = name;
      return this;
    }
  }

  protected DeleteSecretVersionLocksBulkOptions() { }

  protected DeleteSecretVersionLocksBulkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretId,
      "secretId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    secretId = builder.secretId;
    id = builder.id;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a DeleteSecretVersionLocksBulkOptions builder
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
   * Gets the name.
   *
   * Specify the names of the secret locks to be deleted.
   *
   * @return the name
   */
  public List<String> name() {
    return name;
  }
}

