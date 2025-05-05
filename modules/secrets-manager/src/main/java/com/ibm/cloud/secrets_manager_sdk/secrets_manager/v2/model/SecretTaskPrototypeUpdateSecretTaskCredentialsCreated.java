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
 * Called by the credentials provider on a successful creation of credentials.
 */
public class SecretTaskPrototypeUpdateSecretTaskCredentialsCreated extends SecretTaskPrototype {

  /**
   * Describes the status of a secret's task.
   */
  public interface Status {
    /** credentials_created. */
    String CREDENTIALS_CREATED = "credentials_created";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String status;
    private CustomCredentialsNewCredentials credentials;

    /**
     * Instantiates a new Builder from an existing SecretTaskPrototypeUpdateSecretTaskCredentialsCreated instance.
     *
     * @param secretTaskPrototypeUpdateSecretTaskCredentialsCreated the instance to initialize the Builder with
     */
    public Builder(SecretTaskPrototype secretTaskPrototypeUpdateSecretTaskCredentialsCreated) {
      this.status = secretTaskPrototypeUpdateSecretTaskCredentialsCreated.status;
      this.credentials = secretTaskPrototypeUpdateSecretTaskCredentialsCreated.credentials;
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
     * @param credentials the credentials
     */
    public Builder(String status, CustomCredentialsNewCredentials credentials) {
      this.status = status;
      this.credentials = credentials;
    }

    /**
     * Builds a SecretTaskPrototypeUpdateSecretTaskCredentialsCreated.
     *
     * @return the new SecretTaskPrototypeUpdateSecretTaskCredentialsCreated instance
     */
    public SecretTaskPrototypeUpdateSecretTaskCredentialsCreated build() {
      return new SecretTaskPrototypeUpdateSecretTaskCredentialsCreated(this);
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the SecretTaskPrototypeUpdateSecretTaskCredentialsCreated builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the credentials.
     *
     * @param credentials the credentials
     * @return the SecretTaskPrototypeUpdateSecretTaskCredentialsCreated builder
     */
    public Builder credentials(CustomCredentialsNewCredentials credentials) {
      this.credentials = credentials;
      return this;
    }
  }

  protected SecretTaskPrototypeUpdateSecretTaskCredentialsCreated() { }

  protected SecretTaskPrototypeUpdateSecretTaskCredentialsCreated(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.status,
      "status cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.credentials,
      "credentials cannot be null");
    status = builder.status;
    credentials = builder.credentials;
  }

  /**
   * New builder.
   *
   * @return a SecretTaskPrototypeUpdateSecretTaskCredentialsCreated builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

