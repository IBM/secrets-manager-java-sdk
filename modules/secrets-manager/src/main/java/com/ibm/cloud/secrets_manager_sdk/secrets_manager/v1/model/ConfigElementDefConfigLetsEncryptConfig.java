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

/**
 * Properties that describe a Let's Encrypt configuration.
 */
public class ConfigElementDefConfigLetsEncryptConfig extends ConfigElementDefConfig {


  /**
   * Builder.
   */
  public static class Builder {
    private String privateKey;

    public Builder(ConfigElementDefConfig configElementDefConfigLetsEncryptConfig) {
      this.privateKey = configElementDefConfigLetsEncryptConfig.privateKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param privateKey the privateKey
     */
    public Builder(String privateKey) {
      this.privateKey = privateKey;
    }

    /**
     * Builds a ConfigElementDefConfigLetsEncryptConfig.
     *
     * @return the new ConfigElementDefConfigLetsEncryptConfig instance
     */
    public ConfigElementDefConfigLetsEncryptConfig build() {
      return new ConfigElementDefConfigLetsEncryptConfig(this);
    }

    /**
     * Set the privateKey.
     *
     * @param privateKey the privateKey
     * @return the ConfigElementDefConfigLetsEncryptConfig builder
     */
    public Builder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }
  }

  protected ConfigElementDefConfigLetsEncryptConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.privateKey,
      "privateKey cannot be null");
    privateKey = builder.privateKey;
  }

  /**
   * New builder.
   *
   * @return a ConfigElementDefConfigLetsEncryptConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

