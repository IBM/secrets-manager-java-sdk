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
 * The updateSecretMetadata options.
 */
public class UpdateSecretMetadataOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> secretMetadataPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> secretMetadataPatch;

    /**
     * Instantiates a new Builder from an existing UpdateSecretMetadataOptions instance.
     *
     * @param updateSecretMetadataOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSecretMetadataOptions updateSecretMetadataOptions) {
      this.id = updateSecretMetadataOptions.id;
      this.secretMetadataPatch = updateSecretMetadataOptions.secretMetadataPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param secretMetadataPatch the secretMetadataPatch
     */
    public Builder(String id, Map<String, Object> secretMetadataPatch) {
      this.id = id;
      this.secretMetadataPatch = secretMetadataPatch;
    }

    /**
     * Builds a UpdateSecretMetadataOptions.
     *
     * @return the new UpdateSecretMetadataOptions instance
     */
    public UpdateSecretMetadataOptions build() {
      return new UpdateSecretMetadataOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSecretMetadataOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the secretMetadataPatch.
     *
     * @param secretMetadataPatch the secretMetadataPatch
     * @return the UpdateSecretMetadataOptions builder
     */
    public Builder secretMetadataPatch(Map<String, Object> secretMetadataPatch) {
      this.secretMetadataPatch = secretMetadataPatch;
      return this;
    }
  }

  protected UpdateSecretMetadataOptions() { }

  protected UpdateSecretMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretMetadataPatch,
      "secretMetadataPatch cannot be null");
    id = builder.id;
    secretMetadataPatch = builder.secretMetadataPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSecretMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies your secret.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the secretMetadataPatch.
   *
   * JSON Merge-Patch content for update_secret_metadata.
   *
   * @return the secretMetadataPatch
   */
  public Map<String, Object> secretMetadataPatch() {
    return secretMetadataPatch;
  }
}

