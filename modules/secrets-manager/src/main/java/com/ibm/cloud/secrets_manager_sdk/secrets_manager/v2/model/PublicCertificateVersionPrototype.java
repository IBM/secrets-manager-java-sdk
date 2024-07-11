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
 * PublicCertificateVersionPrototype.
 */
public class PublicCertificateVersionPrototype extends SecretVersionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private PublicCertificateRotationObject rotation;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing PublicCertificateVersionPrototype instance.
     *
     * @param publicCertificateVersionPrototype the instance to initialize the Builder with
     */
    public Builder(SecretVersionPrototype publicCertificateVersionPrototype) {
      this.rotation = publicCertificateVersionPrototype.rotation;
      this.customMetadata = publicCertificateVersionPrototype.customMetadata;
      this.versionCustomMetadata = publicCertificateVersionPrototype.versionCustomMetadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rotation the rotation
     */
    public Builder(PublicCertificateRotationObject rotation) {
      this.rotation = rotation;
    }

    /**
     * Builds a PublicCertificateVersionPrototype.
     *
     * @return the new PublicCertificateVersionPrototype instance
     */
    public PublicCertificateVersionPrototype build() {
      return new PublicCertificateVersionPrototype(this);
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the PublicCertificateVersionPrototype builder
     */
    public Builder rotation(PublicCertificateRotationObject rotation) {
      this.rotation = rotation;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the PublicCertificateVersionPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the PublicCertificateVersionPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected PublicCertificateVersionPrototype() { }

  protected PublicCertificateVersionPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rotation,
      "rotation cannot be null");
    rotation = builder.rotation;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateVersionPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

