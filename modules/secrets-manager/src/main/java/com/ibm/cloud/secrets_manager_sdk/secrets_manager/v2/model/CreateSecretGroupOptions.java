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
 * The createSecretGroup options.
 */
public class CreateSecretGroupOptions extends GenericModel {

  protected String name;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateSecretGroupOptions instance.
     *
     * @param createSecretGroupOptions the instance to initialize the Builder with
     */
    private Builder(CreateSecretGroupOptions createSecretGroupOptions) {
      this.name = createSecretGroupOptions.name;
      this.description = createSecretGroupOptions.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a CreateSecretGroupOptions.
     *
     * @return the new CreateSecretGroupOptions instance
     */
    public CreateSecretGroupOptions build() {
      return new CreateSecretGroupOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSecretGroupOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateSecretGroupOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateSecretGroupOptions() { }

  protected CreateSecretGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateSecretGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of your secret group.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * An extended description of your secret group.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret
   * group.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

