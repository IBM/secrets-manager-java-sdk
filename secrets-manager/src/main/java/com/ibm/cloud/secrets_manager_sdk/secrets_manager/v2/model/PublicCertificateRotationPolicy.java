/*
 * (C) Copyright IBM Corp. 2023.
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

/**
 * This field indicates whether Secrets Manager rotates your secrets automatically.
 *
 * For public certificates, if `auto_rotate` is set to `true`, the service reorders your certificate for 31 days, before
 * it expires.
 */
public class PublicCertificateRotationPolicy extends RotationPolicy {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean autoRotate;
    private Boolean rotateKeys;

    /**
     * Instantiates a new Builder from an existing PublicCertificateRotationPolicy instance.
     *
     * @param publicCertificateRotationPolicy the instance to initialize the Builder with
     */
    public Builder(RotationPolicy publicCertificateRotationPolicy) {
      this.autoRotate = publicCertificateRotationPolicy.autoRotate;
      this.rotateKeys = publicCertificateRotationPolicy.rotateKeys;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param autoRotate the autoRotate
     */
    public Builder(Boolean autoRotate) {
      this.autoRotate = autoRotate;
    }

    /**
     * Builds a PublicCertificateRotationPolicy.
     *
     * @return the new PublicCertificateRotationPolicy instance
     */
    public PublicCertificateRotationPolicy build() {
      return new PublicCertificateRotationPolicy(this);
    }

    /**
     * Set the autoRotate.
     *
     * @param autoRotate the autoRotate
     * @return the PublicCertificateRotationPolicy builder
     */
    public Builder autoRotate(Boolean autoRotate) {
      this.autoRotate = autoRotate;
      return this;
    }

    /**
     * Set the rotateKeys.
     *
     * @param rotateKeys the rotateKeys
     * @return the PublicCertificateRotationPolicy builder
     */
    public Builder rotateKeys(Boolean rotateKeys) {
      this.rotateKeys = rotateKeys;
      return this;
    }
  }

  protected PublicCertificateRotationPolicy() { }

  protected PublicCertificateRotationPolicy(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.autoRotate,
      "autoRotate cannot be null");
    autoRotate = builder.autoRotate;
    rotateKeys = builder.rotateKeys;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateRotationPolicy builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

