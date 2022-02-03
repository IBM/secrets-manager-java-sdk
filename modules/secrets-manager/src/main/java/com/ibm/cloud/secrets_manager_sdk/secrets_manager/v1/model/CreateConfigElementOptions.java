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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createConfigElement options.
 */
public class CreateConfigElementOptions extends GenericModel {

  /**
   * The secret type.
   */
  public interface SecretType {
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
  }

  /**
   * The configuration element to define or manage.
   */
  public interface ConfigElement {
    /** certificate_authorities. */
    String CERTIFICATE_AUTHORITIES = "certificate_authorities";
    /** dns_providers. */
    String DNS_PROVIDERS = "dns_providers";
  }

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
  }

  protected String secretType;
  protected String configElement;
  protected String name;
  protected String type;
  protected Map<String, Object> config;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;
    private String configElement;
    private String name;
    private String type;
    private Map<String, Object> config;

    private Builder(CreateConfigElementOptions createConfigElementOptions) {
      this.secretType = createConfigElementOptions.secretType;
      this.configElement = createConfigElementOptions.configElement;
      this.name = createConfigElementOptions.name;
      this.type = createConfigElementOptions.type;
      this.config = createConfigElementOptions.config;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param secretType the secretType
     * @param configElement the configElement
     * @param name the name
     * @param type the type
     * @param config the config
     */
    public Builder(String secretType, String configElement, String name, String type, Map<String, Object> config) {
      this.secretType = secretType;
      this.configElement = configElement;
      this.name = name;
      this.type = type;
      this.config = config;
    }

    /**
     * Builds a CreateConfigElementOptions.
     *
     * @return the new CreateConfigElementOptions instance
     */
    public CreateConfigElementOptions build() {
      return new CreateConfigElementOptions(this);
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the CreateConfigElementOptions builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the configElement.
     *
     * @param configElement the configElement
     * @return the CreateConfigElementOptions builder
     */
    public Builder configElement(String configElement) {
      this.configElement = configElement;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateConfigElementOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateConfigElementOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the config.
     *
     * @param config the config
     * @return the CreateConfigElementOptions builder
     */
    public Builder config(Map<String, Object> config) {
      this.config = config;
      return this;
    }

    /**
     * Set the configElementDef.
     *
     * @param configElementDef the configElementDef
     * @return the CreateConfigElementOptions builder
     */
    public Builder configElementDef(ConfigElementDef configElementDef) {
      this.name = configElementDef.name();
      this.type = configElementDef.type();
      this.config = configElementDef.config();
      return this;
    }
  }

  protected CreateConfigElementOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
      "secretType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.configElement,
      "configElement cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.config,
      "config cannot be null");
    secretType = builder.secretType;
    configElement = builder.configElement;
    name = builder.name;
    type = builder.type;
    config = builder.config;
  }

  /**
   * New builder.
   *
   * @return a CreateConfigElementOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secretType.
   *
   * The secret type.
   *
   * @return the secretType
   */
  public String secretType() {
    return secretType;
  }

  /**
   * Gets the configElement.
   *
   * The configuration element to define or manage.
   *
   * @return the configElement
   */
  public String configElement() {
    return configElement;
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
  public Map<String, Object> config() {
    return config;
  }
}

