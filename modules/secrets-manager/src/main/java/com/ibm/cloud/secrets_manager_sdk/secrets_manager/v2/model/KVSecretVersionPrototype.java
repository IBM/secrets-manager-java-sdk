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

import java.util.Map;

/**
 * KVSecretVersionPrototype.
 */
public class KVSecretVersionPrototype extends SecretVersionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> data;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing KVSecretVersionPrototype instance.
     *
     * @param kvSecretVersionPrototype the instance to initialize the Builder with
     */
    public Builder(SecretVersionPrototype kvSecretVersionPrototype) {
      this.data = kvSecretVersionPrototype.data;
      this.customMetadata = kvSecretVersionPrototype.customMetadata;
      this.versionCustomMetadata = kvSecretVersionPrototype.versionCustomMetadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param data the data
     */
    public Builder(Map<String, Object> data) {
      this.data = data;
    }

    /**
     * Builds a KVSecretVersionPrototype.
     *
     * @return the new KVSecretVersionPrototype instance
     */
    public KVSecretVersionPrototype build() {
      return new KVSecretVersionPrototype(this);
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the KVSecretVersionPrototype builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the KVSecretVersionPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the KVSecretVersionPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected KVSecretVersionPrototype() { }

  protected KVSecretVersionPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.data,
      "data cannot be null");
    data = builder.data;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a KVSecretVersionPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

