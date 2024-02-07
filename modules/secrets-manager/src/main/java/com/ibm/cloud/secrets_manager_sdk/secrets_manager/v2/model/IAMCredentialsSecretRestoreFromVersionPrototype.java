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
 * IAMCredentialsSecretRestoreFromVersionPrototype.
 */
public class IAMCredentialsSecretRestoreFromVersionPrototype extends SecretVersionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String restoreFromVersion;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing IAMCredentialsSecretRestoreFromVersionPrototype instance.
     *
     * @param iamCredentialsSecretRestoreFromVersionPrototype the instance to initialize the Builder with
     */
    public Builder(SecretVersionPrototype iamCredentialsSecretRestoreFromVersionPrototype) {
      this.restoreFromVersion = iamCredentialsSecretRestoreFromVersionPrototype.restoreFromVersion;
      this.customMetadata = iamCredentialsSecretRestoreFromVersionPrototype.customMetadata;
      this.versionCustomMetadata = iamCredentialsSecretRestoreFromVersionPrototype.versionCustomMetadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param restoreFromVersion the restoreFromVersion
     */
    public Builder(String restoreFromVersion) {
      this.restoreFromVersion = restoreFromVersion;
    }

    /**
     * Builds a IAMCredentialsSecretRestoreFromVersionPrototype.
     *
     * @return the new IAMCredentialsSecretRestoreFromVersionPrototype instance
     */
    public IAMCredentialsSecretRestoreFromVersionPrototype build() {
      return new IAMCredentialsSecretRestoreFromVersionPrototype(this);
    }

    /**
     * Set the restoreFromVersion.
     *
     * @param restoreFromVersion the restoreFromVersion
     * @return the IAMCredentialsSecretRestoreFromVersionPrototype builder
     */
    public Builder restoreFromVersion(String restoreFromVersion) {
      this.restoreFromVersion = restoreFromVersion;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the IAMCredentialsSecretRestoreFromVersionPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the IAMCredentialsSecretRestoreFromVersionPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected IAMCredentialsSecretRestoreFromVersionPrototype() { }

  protected IAMCredentialsSecretRestoreFromVersionPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.restoreFromVersion,
      "restoreFromVersion cannot be null");
    restoreFromVersion = builder.restoreFromVersion;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a IAMCredentialsSecretRestoreFromVersionPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

