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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines the rotation object that is used to manually rotate public certificates.
 */
public class PublicCertificateRotationObject extends GenericModel {

  @SerializedName("rotate_keys")
  protected Boolean rotateKeys;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean rotateKeys;

    /**
     * Instantiates a new Builder from an existing PublicCertificateRotationObject instance.
     *
     * @param publicCertificateRotationObject the instance to initialize the Builder with
     */
    private Builder(PublicCertificateRotationObject publicCertificateRotationObject) {
      this.rotateKeys = publicCertificateRotationObject.rotateKeys;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublicCertificateRotationObject.
     *
     * @return the new PublicCertificateRotationObject instance
     */
    public PublicCertificateRotationObject build() {
      return new PublicCertificateRotationObject(this);
    }

    /**
     * Set the rotateKeys.
     *
     * @param rotateKeys the rotateKeys
     * @return the PublicCertificateRotationObject builder
     */
    public Builder rotateKeys(Boolean rotateKeys) {
      this.rotateKeys = rotateKeys;
      return this;
    }
  }

  protected PublicCertificateRotationObject() { }

  protected PublicCertificateRotationObject(Builder builder) {
    rotateKeys = builder.rotateKeys;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateRotationObject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rotateKeys.
   *
   * This field indicates whether Secrets Manager rotates the private key for your public certificate automatically.
   *
   * The default is `false`. If it is set to `true`, the service generates and stores a new private key for your rotated
   * certificate.
   *
   * @return the rotateKeys
   */
  public Boolean rotateKeys() {
    return rotateKeys;
  }
}

