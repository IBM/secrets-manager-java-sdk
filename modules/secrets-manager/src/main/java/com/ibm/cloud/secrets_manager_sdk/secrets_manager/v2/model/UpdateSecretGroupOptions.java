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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSecretGroup options.
 */
public class UpdateSecretGroupOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> secretGroupPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> secretGroupPatch;

    /**
     * Instantiates a new Builder from an existing UpdateSecretGroupOptions instance.
     *
     * @param updateSecretGroupOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSecretGroupOptions updateSecretGroupOptions) {
      this.id = updateSecretGroupOptions.id;
      this.secretGroupPatch = updateSecretGroupOptions.secretGroupPatch;
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
     * @param secretGroupPatch the secretGroupPatch
     */
    public Builder(String id, Map<String, Object> secretGroupPatch) {
      this.id = id;
      this.secretGroupPatch = secretGroupPatch;
    }

    /**
     * Builds a UpdateSecretGroupOptions.
     *
     * @return the new UpdateSecretGroupOptions instance
     */
    public UpdateSecretGroupOptions build() {
      return new UpdateSecretGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSecretGroupOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the secretGroupPatch.
     *
     * @param secretGroupPatch the secretGroupPatch
     * @return the UpdateSecretGroupOptions builder
     */
    public Builder secretGroupPatch(Map<String, Object> secretGroupPatch) {
      this.secretGroupPatch = secretGroupPatch;
      return this;
    }
  }

  protected UpdateSecretGroupOptions() { }

  protected UpdateSecretGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretGroupPatch,
      "secretGroupPatch cannot be null");
    id = builder.id;
    secretGroupPatch = builder.secretGroupPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSecretGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies your secret group.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the secretGroupPatch.
   *
   * The request body to update a secret group.
   *
   * @return the secretGroupPatch
   */
  public Map<String, Object> secretGroupPatch() {
    return secretGroupPatch;
  }
}

