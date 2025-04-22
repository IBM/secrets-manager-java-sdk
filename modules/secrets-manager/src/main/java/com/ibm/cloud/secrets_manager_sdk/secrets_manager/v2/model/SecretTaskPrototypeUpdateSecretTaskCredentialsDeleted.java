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

/**
 * This endpoint is called back by the credentials provider on a successful deletion of credentials.
 */
public class SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted extends SecretTaskPrototype {

  /**
   * Describes the status of a secret's task.
   */
  public interface Status {
    /** credentials_deleted. */
    String CREDENTIALS_DELETED = "credentials_deleted";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String status;

    /**
     * Instantiates a new Builder from an existing SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted instance.
     *
     * @param secretTaskPrototypeUpdateSecretTaskCredentialsDeleted the instance to initialize the Builder with
     */
    public Builder(SecretTaskPrototype secretTaskPrototypeUpdateSecretTaskCredentialsDeleted) {
      this.status = secretTaskPrototypeUpdateSecretTaskCredentialsDeleted.status;
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
     */
    public Builder(String status) {
      this.status = status;
    }

    /**
     * Builds a SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted.
     *
     * @return the new SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted instance
     */
    public SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted build() {
      return new SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted(this);
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted() { }

  protected SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.status,
      "status cannot be null");
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

