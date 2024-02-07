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
 * ImportedCertificateVersionPrototype.
 */
public class ImportedCertificateVersionPrototype extends SecretVersionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String certificate;
    private String intermediate;
    private String privateKey;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing ImportedCertificateVersionPrototype instance.
     *
     * @param importedCertificateVersionPrototype the instance to initialize the Builder with
     */
    public Builder(SecretVersionPrototype importedCertificateVersionPrototype) {
      this.certificate = importedCertificateVersionPrototype.certificate;
      this.intermediate = importedCertificateVersionPrototype.intermediate;
      this.privateKey = importedCertificateVersionPrototype.privateKey;
      this.customMetadata = importedCertificateVersionPrototype.customMetadata;
      this.versionCustomMetadata = importedCertificateVersionPrototype.versionCustomMetadata;
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
     * Builds a ImportedCertificateVersionPrototype.
     *
     * @return the new ImportedCertificateVersionPrototype instance
     */
    public ImportedCertificateVersionPrototype build() {
      return new ImportedCertificateVersionPrototype(this);
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the ImportedCertificateVersionPrototype builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the intermediate.
     *
     * @param intermediate the intermediate
     * @return the ImportedCertificateVersionPrototype builder
     */
    public Builder intermediate(String intermediate) {
      this.intermediate = intermediate;
      return this;
    }

    /**
     * Set the privateKey.
     *
     * @param privateKey the privateKey
     * @return the ImportedCertificateVersionPrototype builder
     */
    public Builder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the ImportedCertificateVersionPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the ImportedCertificateVersionPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected ImportedCertificateVersionPrototype() { }

  protected ImportedCertificateVersionPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificate,
      "certificate cannot be null");
    certificate = builder.certificate;
    intermediate = builder.intermediate;
    privateKey = builder.privateKey;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a ImportedCertificateVersionPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

