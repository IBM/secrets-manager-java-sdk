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
 * The replaceSecretTask options.
 */
public class ReplaceSecretTaskOptions extends GenericModel {

  protected String secretId;
  protected String id;
  protected SecretTaskPrototype taskPut;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretId;
    private String id;
    private SecretTaskPrototype taskPut;

    /**
     * Instantiates a new Builder from an existing ReplaceSecretTaskOptions instance.
     *
     * @param replaceSecretTaskOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceSecretTaskOptions replaceSecretTaskOptions) {
      this.secretId = replaceSecretTaskOptions.secretId;
      this.id = replaceSecretTaskOptions.id;
      this.taskPut = replaceSecretTaskOptions.taskPut;
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
     * @param taskPut the taskPut
     */
    public Builder(String secretId, String id, SecretTaskPrototype taskPut) {
      this.secretId = secretId;
      this.id = id;
      this.taskPut = taskPut;
    }

    /**
     * Builds a ReplaceSecretTaskOptions.
     *
     * @return the new ReplaceSecretTaskOptions instance
     */
    public ReplaceSecretTaskOptions build() {
      return new ReplaceSecretTaskOptions(this);
    }

    /**
     * Set the secretId.
     *
     * @param secretId the secretId
     * @return the ReplaceSecretTaskOptions builder
     */
    public Builder secretId(String secretId) {
      this.secretId = secretId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceSecretTaskOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the taskPut.
     *
     * @param taskPut the taskPut
     * @return the ReplaceSecretTaskOptions builder
     */
    public Builder taskPut(SecretTaskPrototype taskPut) {
      this.taskPut = taskPut;
      return this;
    }
  }

  protected ReplaceSecretTaskOptions() { }

  protected ReplaceSecretTaskOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretId,
      "secretId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.taskPut,
      "taskPut cannot be null");
    secretId = builder.secretId;
    id = builder.id;
    taskPut = builder.taskPut;
  }

  /**
   * New builder.
   *
   * @return a ReplaceSecretTaskOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secretId.
   *
   * The UUID that uniquely identifies your secret.
   *
   * @return the secretId
   */
  public String secretId() {
    return secretId;
  }

  /**
   * Gets the id.
   *
   * The ID that uniquely identifies your task.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the taskPut.
   *
   * The request body to specify the properties for your secret task update.
   *
   * @return the taskPut
   */
  public SecretTaskPrototype taskPut() {
    return taskPut;
  }
}

