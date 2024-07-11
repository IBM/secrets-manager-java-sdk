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
 * The createSecretVersion options.
 */
public class CreateSecretVersionOptions extends GenericModel {

  protected String secretId;
  protected SecretVersionPrototype secretVersionPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretId;
    private SecretVersionPrototype secretVersionPrototype;

    /**
     * Instantiates a new Builder from an existing CreateSecretVersionOptions instance.
     *
     * @param createSecretVersionOptions the instance to initialize the Builder with
     */
    private Builder(CreateSecretVersionOptions createSecretVersionOptions) {
      this.secretId = createSecretVersionOptions.secretId;
      this.secretVersionPrototype = createSecretVersionOptions.secretVersionPrototype;
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
     * @param secretVersionPrototype the secretVersionPrototype
     */
    public Builder(String secretId, SecretVersionPrototype secretVersionPrototype) {
      this.secretId = secretId;
      this.secretVersionPrototype = secretVersionPrototype;
    }

    /**
     * Builds a CreateSecretVersionOptions.
     *
     * @return the new CreateSecretVersionOptions instance
     */
    public CreateSecretVersionOptions build() {
      return new CreateSecretVersionOptions(this);
    }

    /**
     * Set the secretId.
     *
     * @param secretId the secretId
     * @return the CreateSecretVersionOptions builder
     */
    public Builder secretId(String secretId) {
      this.secretId = secretId;
      return this;
    }

    /**
     * Set the secretVersionPrototype.
     *
     * @param secretVersionPrototype the secretVersionPrototype
     * @return the CreateSecretVersionOptions builder
     */
    public Builder secretVersionPrototype(SecretVersionPrototype secretVersionPrototype) {
      this.secretVersionPrototype = secretVersionPrototype;
      return this;
    }
  }

  protected CreateSecretVersionOptions() { }

  protected CreateSecretVersionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretId,
      "secretId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretVersionPrototype,
      "secretVersionPrototype cannot be null");
    secretId = builder.secretId;
    secretVersionPrototype = builder.secretVersionPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateSecretVersionOptions builder
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
   * Gets the secretVersionPrototype.
   *
   * Specify the properties for your new secret version.
   *
   * @return the secretVersionPrototype
   */
  public SecretVersionPrototype secretVersionPrototype() {
    return secretVersionPrototype;
  }
}

