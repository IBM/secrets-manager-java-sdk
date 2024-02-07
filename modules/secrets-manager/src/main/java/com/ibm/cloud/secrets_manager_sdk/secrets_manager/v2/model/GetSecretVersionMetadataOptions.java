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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getSecretVersionMetadata options.
 */
public class GetSecretVersionMetadataOptions extends GenericModel {

  protected String secretId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetSecretVersionMetadataOptions instance.
     *
     * @param getSecretVersionMetadataOptions the instance to initialize the Builder with
     */
    private Builder(GetSecretVersionMetadataOptions getSecretVersionMetadataOptions) {
      this.secretId = getSecretVersionMetadataOptions.secretId;
      this.id = getSecretVersionMetadataOptions.id;
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
     */
    public Builder(String secretId, String id) {
      this.secretId = secretId;
      this.id = id;
    }

    /**
     * Builds a GetSecretVersionMetadataOptions.
     *
     * @return the new GetSecretVersionMetadataOptions instance
     */
    public GetSecretVersionMetadataOptions build() {
      return new GetSecretVersionMetadataOptions(this);
    }

    /**
     * Set the secretId.
     *
     * @param secretId the secretId
     * @return the GetSecretVersionMetadataOptions builder
     */
    public Builder secretId(String secretId) {
      this.secretId = secretId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetSecretVersionMetadataOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetSecretVersionMetadataOptions() { }

  protected GetSecretVersionMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretId,
      "secretId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    secretId = builder.secretId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetSecretVersionMetadataOptions builder
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
}

