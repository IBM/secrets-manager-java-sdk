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
 * The createConfiguration options.
 */
public class CreateConfigurationOptions extends GenericModel {

  protected ConfigurationPrototype configurationPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigurationPrototype configurationPrototype;

    /**
     * Instantiates a new Builder from an existing CreateConfigurationOptions instance.
     *
     * @param createConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(CreateConfigurationOptions createConfigurationOptions) {
      this.configurationPrototype = createConfigurationOptions.configurationPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param configurationPrototype the configurationPrototype
     */
    public Builder(ConfigurationPrototype configurationPrototype) {
      this.configurationPrototype = configurationPrototype;
    }

    /**
     * Builds a CreateConfigurationOptions.
     *
     * @return the new CreateConfigurationOptions instance
     */
    public CreateConfigurationOptions build() {
      return new CreateConfigurationOptions(this);
    }

    /**
     * Set the configurationPrototype.
     *
     * @param configurationPrototype the configurationPrototype
     * @return the CreateConfigurationOptions builder
     */
    public Builder configurationPrototype(ConfigurationPrototype configurationPrototype) {
      this.configurationPrototype = configurationPrototype;
      return this;
    }
  }

  protected CreateConfigurationOptions() { }

  protected CreateConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configurationPrototype,
      "configurationPrototype cannot be null");
    configurationPrototype = builder.configurationPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the configurationPrototype.
   *
   * The details of your configuration.
   *
   * @return the configurationPrototype
   */
  public ConfigurationPrototype configurationPrototype() {
    return configurationPrototype;
  }
}

