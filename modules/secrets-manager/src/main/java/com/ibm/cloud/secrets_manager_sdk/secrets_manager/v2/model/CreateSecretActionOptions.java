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
 * The createSecretAction options.
 */
public class CreateSecretActionOptions extends GenericModel {

  protected String id;
  protected SecretActionPrototype secretActionPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private SecretActionPrototype secretActionPrototype;

    /**
     * Instantiates a new Builder from an existing CreateSecretActionOptions instance.
     *
     * @param createSecretActionOptions the instance to initialize the Builder with
     */
    private Builder(CreateSecretActionOptions createSecretActionOptions) {
      this.id = createSecretActionOptions.id;
      this.secretActionPrototype = createSecretActionOptions.secretActionPrototype;
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
     * @param secretActionPrototype the secretActionPrototype
     */
    public Builder(String id, SecretActionPrototype secretActionPrototype) {
      this.id = id;
      this.secretActionPrototype = secretActionPrototype;
    }

    /**
     * Builds a CreateSecretActionOptions.
     *
     * @return the new CreateSecretActionOptions instance
     */
    public CreateSecretActionOptions build() {
      return new CreateSecretActionOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateSecretActionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the secretActionPrototype.
     *
     * @param secretActionPrototype the secretActionPrototype
     * @return the CreateSecretActionOptions builder
     */
    public Builder secretActionPrototype(SecretActionPrototype secretActionPrototype) {
      this.secretActionPrototype = secretActionPrototype;
      return this;
    }
  }

  protected CreateSecretActionOptions() { }

  protected CreateSecretActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretActionPrototype,
      "secretActionPrototype cannot be null");
    id = builder.id;
    secretActionPrototype = builder.secretActionPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateSecretActionOptions builder
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
   * Gets the secretActionPrototype.
   *
   * The request body to specify the properties for your secret action.
   *
   * @return the secretActionPrototype
   */
  public SecretActionPrototype secretActionPrototype() {
    return secretActionPrototype;
  }
}

