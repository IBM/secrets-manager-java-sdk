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

/**
 * The request body of a rotate private certificate action.
 */
public class RotatePrivateCertBodyWithVersionCustomMetadata extends SecretAction {


  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing RotatePrivateCertBodyWithVersionCustomMetadata instance.
     *
     * @param rotatePrivateCertBodyWithVersionCustomMetadata the instance to initialize the Builder with
     */
    public Builder(SecretAction rotatePrivateCertBodyWithVersionCustomMetadata) {
      this.versionCustomMetadata = rotatePrivateCertBodyWithVersionCustomMetadata.versionCustomMetadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     */
    public Builder(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
    }

    /**
     * Builds a RotatePrivateCertBodyWithVersionCustomMetadata.
     *
     * @return the new RotatePrivateCertBodyWithVersionCustomMetadata instance
     */
    public RotatePrivateCertBodyWithVersionCustomMetadata build() {
      return new RotatePrivateCertBodyWithVersionCustomMetadata(this);
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the RotatePrivateCertBodyWithVersionCustomMetadata builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected RotatePrivateCertBodyWithVersionCustomMetadata() { }

  protected RotatePrivateCertBodyWithVersionCustomMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.versionCustomMetadata,
      "versionCustomMetadata cannot be null");
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a RotatePrivateCertBodyWithVersionCustomMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

