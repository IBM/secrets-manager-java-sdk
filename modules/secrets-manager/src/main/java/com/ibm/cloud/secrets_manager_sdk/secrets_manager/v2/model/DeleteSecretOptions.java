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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteSecret options.
 */
public class DeleteSecretOptions extends GenericModel {

  protected String id;
  protected Boolean forceDelete;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean forceDelete;

    /**
     * Instantiates a new Builder from an existing DeleteSecretOptions instance.
     *
     * @param deleteSecretOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSecretOptions deleteSecretOptions) {
      this.id = deleteSecretOptions.id;
      this.forceDelete = deleteSecretOptions.forceDelete;
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
     * Builds a DeleteSecretOptions.
     *
     * @return the new DeleteSecretOptions instance
     */
    public DeleteSecretOptions build() {
      return new DeleteSecretOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteSecretOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the forceDelete.
     *
     * @param forceDelete the forceDelete
     * @return the DeleteSecretOptions builder
     */
    public Builder forceDelete(Boolean forceDelete) {
      this.forceDelete = forceDelete;
      return this;
    }
  }

  protected DeleteSecretOptions() { }

  protected DeleteSecretOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    forceDelete = builder.forceDelete;
  }

  /**
   * New builder.
   *
   * @return a DeleteSecretOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The UUID that uniquely identifies your secret.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the forceDelete.
   *
   * Set to `true` to force delete the secret. Available only for custom credentials secret type.
   *
   * @return the forceDelete
   */
  public Boolean forceDelete() {
    return forceDelete;
  }
}

