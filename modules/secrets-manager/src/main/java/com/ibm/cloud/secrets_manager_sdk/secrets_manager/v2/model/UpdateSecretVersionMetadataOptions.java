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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSecretVersionMetadata options.
 */
public class UpdateSecretVersionMetadataOptions extends GenericModel {

  protected String secretId;
  protected String id;
  protected Map<String, Object> secretVersionMetadataPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretId;
    private String id;
    private Map<String, Object> secretVersionMetadataPatch;

    /**
     * Instantiates a new Builder from an existing UpdateSecretVersionMetadataOptions instance.
     *
     * @param updateSecretVersionMetadataOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSecretVersionMetadataOptions updateSecretVersionMetadataOptions) {
      this.secretId = updateSecretVersionMetadataOptions.secretId;
      this.id = updateSecretVersionMetadataOptions.id;
      this.secretVersionMetadataPatch = updateSecretVersionMetadataOptions.secretVersionMetadataPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param secretId the secretId
     * @param id the id
     * @param secretVersionMetadataPatch the secretVersionMetadataPatch
     */
    public Builder(String secretId, String id, Map<String, Object> secretVersionMetadataPatch) {
      this.secretId = secretId;
      this.id = id;
      this.secretVersionMetadataPatch = secretVersionMetadataPatch;
    }

    /**
     * Builds a UpdateSecretVersionMetadataOptions.
     *
     * @return the new UpdateSecretVersionMetadataOptions instance
     */
    public UpdateSecretVersionMetadataOptions build() {
      return new UpdateSecretVersionMetadataOptions(this);
    }

    /**
     * Set the secretId.
     *
     * @param secretId the secretId
     * @return the UpdateSecretVersionMetadataOptions builder
     */
    public Builder secretId(String secretId) {
      this.secretId = secretId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSecretVersionMetadataOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the secretVersionMetadataPatch.
     *
     * @param secretVersionMetadataPatch the secretVersionMetadataPatch
     * @return the UpdateSecretVersionMetadataOptions builder
     */
    public Builder secretVersionMetadataPatch(Map<String, Object> secretVersionMetadataPatch) {
      this.secretVersionMetadataPatch = secretVersionMetadataPatch;
      return this;
    }
  }

  protected UpdateSecretVersionMetadataOptions() { }

  protected UpdateSecretVersionMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretId,
      "secretId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretVersionMetadataPatch,
      "secretVersionMetadataPatch cannot be null");
    secretId = builder.secretId;
    id = builder.id;
    secretVersionMetadataPatch = builder.secretVersionMetadataPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSecretVersionMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secretId.
   *
   * The v4 UUID that uniquely identifies your secret.
   *
   * @return the secretId
   */
  public String secretId() {
    return secretId;
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies your secret version. You can use the `current` or `previous` aliases to refer
   * to the current or previous secret version.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the secretVersionMetadataPatch.
   *
   * JSON Merge-Patch content for update_secret_version_metadata.
   *
   * @return the secretVersionMetadataPatch
   */
  public Map<String, Object> secretVersionMetadataPatch() {
    return secretVersionMetadataPatch;
  }
}

