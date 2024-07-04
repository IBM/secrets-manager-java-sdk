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

import java.util.Map;

/**
 * ServiceCredentialsSecretVersionPrototype.
 */
public class ServiceCredentialsSecretVersionPrototype extends SecretVersionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing ServiceCredentialsSecretVersionPrototype instance.
     *
     * @param serviceCredentialsSecretVersionPrototype the instance to initialize the Builder with
     */
    public Builder(SecretVersionPrototype serviceCredentialsSecretVersionPrototype) {
      this.customMetadata = serviceCredentialsSecretVersionPrototype.customMetadata;
      this.versionCustomMetadata = serviceCredentialsSecretVersionPrototype.versionCustomMetadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceCredentialsSecretVersionPrototype.
     *
     * @return the new ServiceCredentialsSecretVersionPrototype instance
     */
    public ServiceCredentialsSecretVersionPrototype build() {
      return new ServiceCredentialsSecretVersionPrototype(this);
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the ServiceCredentialsSecretVersionPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the ServiceCredentialsSecretVersionPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected ServiceCredentialsSecretVersionPrototype() { }

  protected ServiceCredentialsSecretVersionPrototype(Builder builder) {
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a ServiceCredentialsSecretVersionPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

