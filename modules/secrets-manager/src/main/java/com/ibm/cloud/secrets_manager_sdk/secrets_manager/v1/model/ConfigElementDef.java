/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The configuration to add or update.
 */
public class ConfigElementDef extends GenericModel {

  /**
   * The type of configuration. Value options differ depending on the `config_element` property that you want to define.
   */
  public interface Type {
    /** letsencrypt. */
    String LETSENCRYPT = "letsencrypt";
    /** letsencrypt-stage. */
    String LETSENCRYPT_STAGE = "letsencrypt-stage";
    /** cis. */
    String CIS = "cis";
    /** classic_infrastructure. */
    String CLASSIC_INFRASTRUCTURE = "classic_infrastructure";
    /** root_certificate_authority. */
    String ROOT_CERTIFICATE_AUTHORITY = "root_certificate_authority";
    /** intermediate_certificate_authority. */
    String INTERMEDIATE_CERTIFICATE_AUTHORITY = "intermediate_certificate_authority";
    /** certificate_template. */
    String CERTIFICATE_TEMPLATE = "certificate_template";
  }

  protected String name;
  protected String type;
  protected ConfigElementDefConfig config;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String type;
    private ConfigElementDefConfig config;

    /**
     * Instantiates a new Builder from an existing ConfigElementDef instance.
     *
     * @param configElementDef the instance to initialize the Builder with
     */
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
    public Builder(String name, String type, ConfigElementDefConfig config) {
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
    public Builder config(ConfigElementDefConfig config) {
      this.config = config;
      return this;
    }
  }

  protected ConfigElementDef() { }

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
   * The human-readable name to assign to your configuration.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * The type of configuration. Value options differ depending on the `config_element` property that you want to define.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the config.
   *
   * The configuration to define for the specified secret type.
   *
   * @return the config
   */
  public ConfigElementDefConfig config() {
    return config;
  }
}

