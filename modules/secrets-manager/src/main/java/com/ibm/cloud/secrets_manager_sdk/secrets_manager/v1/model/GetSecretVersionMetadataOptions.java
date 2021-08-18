/*
 * (C) Copyright IBM Corp. 2021.
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
 * The getSecretVersionMetadata options.
 */
public class GetSecretVersionMetadataOptions extends GenericModel {

  /**
   * The secret type. Supported options include: imported_cert.
   */
  public interface SecretType {
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
  }

  protected String secretType;
  protected String id;
  protected String versionId;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;
    private String id;
    private String versionId;

    private Builder(GetSecretVersionMetadataOptions getSecretVersionMetadataOptions) {
      this.secretType = getSecretVersionMetadataOptions.secretType;
      this.id = getSecretVersionMetadataOptions.id;
      this.versionId = getSecretVersionMetadataOptions.versionId;
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
     * @param id the id
     * @param versionId the versionId
     */
    public Builder(String secretType, String id, String versionId) {
      this.secretType = secretType;
      this.id = id;
      this.versionId = versionId;
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
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the GetSecretVersionMetadataOptions builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
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

    /**
     * Set the versionId.
     *
     * @param versionId the versionId
     * @return the GetSecretVersionMetadataOptions builder
     */
    public Builder versionId(String versionId) {
      this.versionId = versionId;
      return this;
    }
  }

  protected GetSecretVersionMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
      "secretType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.versionId,
      "versionId cannot be empty");
    secretType = builder.secretType;
    id = builder.id;
    versionId = builder.versionId;
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
   * Gets the secretType.
   *
   * The secret type. Supported options include: imported_cert.
   *
   * @return the secretType
   */
  public String secretType() {
    return secretType;
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies the secret.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the versionId.
   *
   * The v4 UUID that uniquely identifies the secret version. You can also use `previous` to retrieve the previous
   * version.
   *
   * **Note:** To find the version ID of a secret, use the [Get secret metadata](#get-secret-metadata) method and check
   * the response details.
   *
   * @return the versionId
   */
  public String versionId() {
    return versionId;
  }
}

