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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ImportedCertificatePrototype.
 */
public class ImportedCertificatePrototype extends SecretPrototype {

  /**
   * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
   * service_credentials, kv, and username_password.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** kv. */
    String KV = "kv";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** service_credentials. */
    String SERVICE_CREDENTIALS = "service_credentials";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** custom_credentials. */
    String CUSTOM_CREDENTIALS = "custom_credentials";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;
    private String name;
    private String description;
    private String secretGroupId;
    private List<String> labels;
    private String certificate;
    private String intermediate;
    private String privateKey;
    private ImportedCertificateManagedCsr managedCsr;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing ImportedCertificatePrototype instance.
     *
     * @param importedCertificatePrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype importedCertificatePrototype) {
      this.secretType = importedCertificatePrototype.secretType;
      this.name = importedCertificatePrototype.name;
      this.description = importedCertificatePrototype.description;
      this.secretGroupId = importedCertificatePrototype.secretGroupId;
      this.labels = importedCertificatePrototype.labels;
      this.certificate = importedCertificatePrototype.certificate;
      this.intermediate = importedCertificatePrototype.intermediate;
      this.privateKey = importedCertificatePrototype.privateKey;
      this.managedCsr = importedCertificatePrototype.managedCsr;
      this.customMetadata = importedCertificatePrototype.customMetadata;
      this.versionCustomMetadata = importedCertificatePrototype.versionCustomMetadata;
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
     * @param name the name
     */
    public Builder(String secretType, String name) {
      this.secretType = secretType;
      this.name = name;
    }

    /**
     * Builds a ImportedCertificatePrototype.
     *
     * @return the new ImportedCertificatePrototype instance
     */
    public ImportedCertificatePrototype build() {
      return new ImportedCertificatePrototype(this);
    }

    /**
     * Adds a new element to labels.
     *
     * @param labels the new element to be added
     * @return the ImportedCertificatePrototype builder
     */
    public Builder addLabels(String labels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(labels,
        "labels cannot be null");
      if (this.labels == null) {
        this.labels = new ArrayList<String>();
      }
      this.labels.add(labels);
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the ImportedCertificatePrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ImportedCertificatePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ImportedCertificatePrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the ImportedCertificatePrototype builder
     */
    public Builder secretGroupId(String secretGroupId) {
      this.secretGroupId = secretGroupId;
      return this;
    }

    /**
     * Set the labels.
     * Existing labels will be replaced.
     *
     * @param labels the labels
     * @return the ImportedCertificatePrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the ImportedCertificatePrototype builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the intermediate.
     *
     * @param intermediate the intermediate
     * @return the ImportedCertificatePrototype builder
     */
    public Builder intermediate(String intermediate) {
      this.intermediate = intermediate;
      return this;
    }

    /**
     * Set the privateKey.
     *
     * @param privateKey the privateKey
     * @return the ImportedCertificatePrototype builder
     */
    public Builder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    /**
     * Set the managedCsr.
     *
     * @param managedCsr the managedCsr
     * @return the ImportedCertificatePrototype builder
     */
    public Builder managedCsr(ImportedCertificateManagedCsr managedCsr) {
      this.managedCsr = managedCsr;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the ImportedCertificatePrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the ImportedCertificatePrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected ImportedCertificatePrototype() { }

  protected ImportedCertificatePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    secretType = builder.secretType;
    name = builder.name;
    description = builder.description;
    secretGroupId = builder.secretGroupId;
    labels = builder.labels;
    certificate = builder.certificate;
    intermediate = builder.intermediate;
    privateKey = builder.privateKey;
    managedCsr = builder.managedCsr;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a ImportedCertificatePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

