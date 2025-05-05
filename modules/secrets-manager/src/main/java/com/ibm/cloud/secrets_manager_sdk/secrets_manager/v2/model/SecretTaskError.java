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
 * API Error.
 */
public class SecretTaskError extends GenericModel {

  protected String code;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String code;
    private String description;

    /**
     * Instantiates a new Builder from an existing SecretTaskError instance.
     *
     * @param secretTaskError the instance to initialize the Builder with
     */
    private Builder(SecretTaskError secretTaskError) {
      this.code = secretTaskError.code;
      this.description = secretTaskError.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param code the code
     * @param description the description
     */
    public Builder(String code, String description) {
      this.code = code;
      this.description = description;
    }

    /**
     * Builds a SecretTaskError.
     *
     * @return the new SecretTaskError instance
     */
    public SecretTaskError build() {
      return new SecretTaskError(this);
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the SecretTaskError builder
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SecretTaskError builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected SecretTaskError() { }

  protected SecretTaskError(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.code,
      "code cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    code = builder.code;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a SecretTaskError builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the code.
   *
   * An error code identifier.
   *
   * @return the code
   */
  public String code() {
    return code;
  }

  /**
   * Gets the description.
   *
   * A human-readable message that provides details about the error.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

