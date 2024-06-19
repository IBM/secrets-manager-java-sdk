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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSecretVersionAction options.
 */
public class CreateSecretVersionActionOptions extends GenericModel {

  protected String secretId;
  protected String id;
  protected SecretVersionActionPrototype secretVersionActionPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretId;
    private String id;
    private SecretVersionActionPrototype secretVersionActionPrototype;

    /**
     * Instantiates a new Builder from an existing CreateSecretVersionActionOptions instance.
     *
     * @param createSecretVersionActionOptions the instance to initialize the Builder with
     */
    private Builder(CreateSecretVersionActionOptions createSecretVersionActionOptions) {
      this.secretId = createSecretVersionActionOptions.secretId;
      this.id = createSecretVersionActionOptions.id;
      this.secretVersionActionPrototype = createSecretVersionActionOptions.secretVersionActionPrototype;
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
     * @param secretVersionActionPrototype the secretVersionActionPrototype
     */
    public Builder(String secretId, String id, SecretVersionActionPrototype secretVersionActionPrototype) {
      this.secretId = secretId;
      this.id = id;
      this.secretVersionActionPrototype = secretVersionActionPrototype;
    }

    /**
     * Builds a CreateSecretVersionActionOptions.
     *
     * @return the new CreateSecretVersionActionOptions instance
     */
    public CreateSecretVersionActionOptions build() {
      return new CreateSecretVersionActionOptions(this);
    }

    /**
     * Set the secretId.
     *
     * @param secretId the secretId
     * @return the CreateSecretVersionActionOptions builder
     */
    public Builder secretId(String secretId) {
      this.secretId = secretId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateSecretVersionActionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the secretVersionActionPrototype.
     *
     * @param secretVersionActionPrototype the secretVersionActionPrototype
     * @return the CreateSecretVersionActionOptions builder
     */
    public Builder secretVersionActionPrototype(SecretVersionActionPrototype secretVersionActionPrototype) {
      this.secretVersionActionPrototype = secretVersionActionPrototype;
      return this;
    }
  }

  protected CreateSecretVersionActionOptions() { }

  protected CreateSecretVersionActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretId,
      "secretId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretVersionActionPrototype,
      "secretVersionActionPrototype cannot be null");
    secretId = builder.secretId;
    id = builder.id;
    secretVersionActionPrototype = builder.secretVersionActionPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateSecretVersionActionOptions builder
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
   * Gets the secretVersionActionPrototype.
   *
   * The request body to specify the properties of the action to create a secret version.
   *
   * @return the secretVersionActionPrototype
   */
  public SecretVersionActionPrototype secretVersionActionPrototype() {
    return secretVersionActionPrototype;
  }
}

