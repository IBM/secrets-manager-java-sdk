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
 * The request body of a rotate certificate action.
 */
public class RotateCertificateBody extends SecretAction {


  /**
   * Builder.
   */
  public static class Builder {
    private String certificate;
    private String privateKey;
    private String intermediate;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing RotateCertificateBody instance.
     *
     * @param rotateCertificateBody the instance to initialize the Builder with
     */
    public Builder(SecretAction rotateCertificateBody) {
      this.certificate = rotateCertificateBody.certificate;
      this.privateKey = rotateCertificateBody.privateKey;
      this.intermediate = rotateCertificateBody.intermediate;
      this.customMetadata = rotateCertificateBody.customMetadata;
      this.versionCustomMetadata = rotateCertificateBody.versionCustomMetadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param certificate the certificate
     */
    public Builder(String certificate) {
      this.certificate = certificate;
    }

    /**
     * Builds a RotateCertificateBody.
     *
     * @return the new RotateCertificateBody instance
     */
    public RotateCertificateBody build() {
      return new RotateCertificateBody(this);
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the RotateCertificateBody builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the privateKey.
     *
     * @param privateKey the privateKey
     * @return the RotateCertificateBody builder
     */
    public Builder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    /**
     * Set the intermediate.
     *
     * @param intermediate the intermediate
     * @return the RotateCertificateBody builder
     */
    public Builder intermediate(String intermediate) {
      this.intermediate = intermediate;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the RotateCertificateBody builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the RotateCertificateBody builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected RotateCertificateBody() { }

  protected RotateCertificateBody(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificate,
      "certificate cannot be null");
    certificate = builder.certificate;
    privateKey = builder.privateKey;
    intermediate = builder.intermediate;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a RotateCertificateBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

