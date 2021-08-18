/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Config element.
 */
public class ConfigElementDef extends GenericModel {

  protected String name;
  protected String type;
  protected Map<String, Object> config;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String type;
    private Map<String, Object> config;

    private Builder(ConfigElementDef configElementDef) {
      this.name = configElementDef.name;
      this.type = configElementDef.type;
      this.config = configElementDef.config;
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
     * @param type the type
     * @param config the config
     */
    public Builder(String name, String type, Map<String, Object> config) {
      this.name = name;
      this.type = type;
      this.config = config;
    }

    /**
     * Builds a ConfigElementDef.
     *
     * @return the new ConfigElementDef instance
     */
    public ConfigElementDef build() {
      return new ConfigElementDef(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ConfigElementDef builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ConfigElementDef builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the config.
     *
     * @param config the config
     * @return the ConfigElementDef builder
     */
    public Builder config(Map<String, Object> config) {
      this.config = config;
      return this;
    }
  }

  protected ConfigElementDef(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.config,
      "config cannot be null");
    name = builder.name;
    type = builder.type;
    config = builder.config;
  }

  /**
   * New builder.
   *
   * @return a ConfigElementDef builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Config element name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Dns provider config type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the config.
   *
   * @return the config
   */
  public Map<String, Object> config() {
    return config;
  }
}

