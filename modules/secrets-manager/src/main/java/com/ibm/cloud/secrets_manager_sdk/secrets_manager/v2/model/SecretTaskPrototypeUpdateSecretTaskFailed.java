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

import java.util.ArrayList;
import java.util.List;

/**
 * Flag task as failed upon failure to create or delete credentials.
 */
public class SecretTaskPrototypeUpdateSecretTaskFailed extends SecretTaskPrototype {

  /**
   * Describes the status of a secret's task.
   */
  public interface Status {
    /** failed. */
    String FAILED = "failed";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String status;
    private List<SecretTaskError> errors;

    /**
     * Instantiates a new Builder from an existing SecretTaskPrototypeUpdateSecretTaskFailed instance.
     *
     * @param secretTaskPrototypeUpdateSecretTaskFailed the instance to initialize the Builder with
     */
    public Builder(SecretTaskPrototype secretTaskPrototypeUpdateSecretTaskFailed) {
      this.status = secretTaskPrototypeUpdateSecretTaskFailed.status;
      this.errors = secretTaskPrototypeUpdateSecretTaskFailed.errors;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param status the status
     * @param errors the errors
     */
    public Builder(String status, List<SecretTaskError> errors) {
      this.status = status;
      this.errors = errors;
    }

    /**
     * Builds a SecretTaskPrototypeUpdateSecretTaskFailed.
     *
     * @return the new SecretTaskPrototypeUpdateSecretTaskFailed instance
     */
    public SecretTaskPrototypeUpdateSecretTaskFailed build() {
      return new SecretTaskPrototypeUpdateSecretTaskFailed(this);
    }

    /**
     * Adds a new element to errors.
     *
     * @param errors the new element to be added
     * @return the SecretTaskPrototypeUpdateSecretTaskFailed builder
     */
    public Builder addErrors(SecretTaskError errors) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(errors,
        "errors cannot be null");
      if (this.errors == null) {
        this.errors = new ArrayList<SecretTaskError>();
      }
      this.errors.add(errors);
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the SecretTaskPrototypeUpdateSecretTaskFailed builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the errors.
     * Existing errors will be replaced.
     *
     * @param errors the errors
     * @return the SecretTaskPrototypeUpdateSecretTaskFailed builder
     */
    public Builder errors(List<SecretTaskError> errors) {
      this.errors = errors;
      return this;
    }
  }

  protected SecretTaskPrototypeUpdateSecretTaskFailed() { }

  protected SecretTaskPrototypeUpdateSecretTaskFailed(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.status,
      "status cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.errors,
      "errors cannot be null");
    status = builder.status;
    errors = builder.errors;
  }

  /**
   * New builder.
   *
   * @return a SecretTaskPrototypeUpdateSecretTaskFailed builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

