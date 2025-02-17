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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Update your secret version metadata.
 */
public class SecretVersionMetadataPatch extends GenericModel {

  @SerializedName("version_custom_metadata")
  protected Map<String, Object> versionCustomMetadata;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing SecretVersionMetadataPatch instance.
     *
     * @param secretVersionMetadataPatch the instance to initialize the Builder with
     */
    private Builder(SecretVersionMetadataPatch secretVersionMetadataPatch) {
      this.versionCustomMetadata = secretVersionMetadataPatch.versionCustomMetadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SecretVersionMetadataPatch.
     *
     * @return the new SecretVersionMetadataPatch instance
     */
    public SecretVersionMetadataPatch build() {
      return new SecretVersionMetadataPatch(this);
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the SecretVersionMetadataPatch builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected SecretVersionMetadataPatch() { }

  protected SecretVersionMetadataPatch(Builder builder) {
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a SecretVersionMetadataPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the versionCustomMetadata.
   *
   * The secret version metadata that a user can customize.
   *
   * @return the versionCustomMetadata
   */
  public Map<String, Object> versionCustomMetadata() {
    return versionCustomMetadata;
  }

  /**
   * Construct a JSON merge-patch from the SecretVersionMetadataPatch.
   *
   * Note that properties of the SecretVersionMetadataPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SecretVersionMetadataPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

