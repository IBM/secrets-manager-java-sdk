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
 * The deleteSecretLocksBulk options.
 */
public class DeleteSecretLocksBulkOptions extends GenericModel {

  protected String id;
  protected List<String> name;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<String> name;

    /**
     * Instantiates a new Builder from an existing DeleteSecretLocksBulkOptions instance.
     *
     * @param deleteSecretLocksBulkOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSecretLocksBulkOptions deleteSecretLocksBulkOptions) {
      this.id = deleteSecretLocksBulkOptions.id;
      this.name = deleteSecretLocksBulkOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a DeleteSecretLocksBulkOptions.
     *
     * @return the new DeleteSecretLocksBulkOptions instance
     */
    public DeleteSecretLocksBulkOptions build() {
      return new DeleteSecretLocksBulkOptions(this);
    }

    /**
     * Adds an name to name.
     *
     * @param name the new name
     * @return the DeleteSecretLocksBulkOptions builder
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
     * Set the id.
     *
     * @param id the id
     * @return the DeleteSecretLocksBulkOptions builder
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
     * @return the DeleteSecretLocksBulkOptions builder
     */
    public Builder name(List<String> name) {
      this.name = name;
      return this;
    }
  }

  protected DeleteSecretLocksBulkOptions() { }

  protected DeleteSecretLocksBulkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a DeleteSecretLocksBulkOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies your secret.
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

