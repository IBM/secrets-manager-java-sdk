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
 * The listSecretTasks options.
 */
public class ListSecretTasksOptions extends GenericModel {

  protected String secretId;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretId;

    /**
     * Instantiates a new Builder from an existing ListSecretTasksOptions instance.
     *
     * @param listSecretTasksOptions the instance to initialize the Builder with
     */
    private Builder(ListSecretTasksOptions listSecretTasksOptions) {
      this.secretId = listSecretTasksOptions.secretId;
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
     */
    public Builder(String secretId) {
      this.secretId = secretId;
    }

    /**
     * Builds a ListSecretTasksOptions.
     *
     * @return the new ListSecretTasksOptions instance
     */
    public ListSecretTasksOptions build() {
      return new ListSecretTasksOptions(this);
    }

    /**
     * Set the secretId.
     *
     * @param secretId the secretId
     * @return the ListSecretTasksOptions builder
     */
    public Builder secretId(String secretId) {
      this.secretId = secretId;
      return this;
    }
  }

  protected ListSecretTasksOptions() { }

  protected ListSecretTasksOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretId,
      "secretId cannot be empty");
    secretId = builder.secretId;
  }

  /**
   * New builder.
   *
   * @return a ListSecretTasksOptions builder
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
}

