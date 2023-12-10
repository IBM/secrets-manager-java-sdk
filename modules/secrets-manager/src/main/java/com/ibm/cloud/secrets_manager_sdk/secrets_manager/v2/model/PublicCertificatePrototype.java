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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * PublicCertificatePrototype.
 */
public class PublicCertificatePrototype extends SecretPrototype {

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
    private String commonName;
    private List<String> altNames;
    private String keyAlgorithm;
    private String ca;
    private String dns;
    private Boolean bundleCerts;
    private RotationPolicy rotation;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing PublicCertificatePrototype instance.
     *
     * @param publicCertificatePrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype publicCertificatePrototype) {
      this.secretType = publicCertificatePrototype.secretType;
      this.name = publicCertificatePrototype.name;
      this.description = publicCertificatePrototype.description;
      this.secretGroupId = publicCertificatePrototype.secretGroupId;
      this.labels = publicCertificatePrototype.labels;
      this.commonName = publicCertificatePrototype.commonName;
      this.altNames = publicCertificatePrototype.altNames;
      this.keyAlgorithm = publicCertificatePrototype.keyAlgorithm;
      this.ca = publicCertificatePrototype.ca;
      this.dns = publicCertificatePrototype.dns;
      this.bundleCerts = publicCertificatePrototype.bundleCerts;
      this.rotation = publicCertificatePrototype.rotation;
      this.customMetadata = publicCertificatePrototype.customMetadata;
      this.versionCustomMetadata = publicCertificatePrototype.versionCustomMetadata;
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
     * @param commonName the commonName
     * @param ca the ca
     * @param dns the dns
     */
    public Builder(String secretType, String name, String commonName, String ca, String dns) {
      this.secretType = secretType;
      this.name = name;
      this.commonName = commonName;
      this.ca = ca;
      this.dns = dns;
    }

    /**
     * Builds a PublicCertificatePrototype.
     *
     * @return the new PublicCertificatePrototype instance
     */
    public PublicCertificatePrototype build() {
      return new PublicCertificatePrototype(this);
    }

    /**
     * Adds an labels to labels.
     *
     * @param labels the new labels
     * @return the PublicCertificatePrototype builder
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
     * Adds an altNames to altNames.
     *
     * @param altNames the new altNames
     * @return the PublicCertificatePrototype builder
     */
    public Builder addAltNames(String altNames) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(altNames,
        "altNames cannot be null");
      if (this.altNames == null) {
        this.altNames = new ArrayList<String>();
      }
      this.altNames.add(altNames);
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the PublicCertificatePrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PublicCertificatePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the PublicCertificatePrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the PublicCertificatePrototype builder
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
     * @return the PublicCertificatePrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the commonName.
     *
     * @param commonName the commonName
     * @return the PublicCertificatePrototype builder
     */
    public Builder commonName(String commonName) {
      this.commonName = commonName;
      return this;
    }

    /**
     * Set the altNames.
     * Existing altNames will be replaced.
     *
     * @param altNames the altNames
     * @return the PublicCertificatePrototype builder
     */
    public Builder altNames(List<String> altNames) {
      this.altNames = altNames;
      return this;
    }

    /**
     * Set the keyAlgorithm.
     *
     * @param keyAlgorithm the keyAlgorithm
     * @return the PublicCertificatePrototype builder
     */
    public Builder keyAlgorithm(String keyAlgorithm) {
      this.keyAlgorithm = keyAlgorithm;
      return this;
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the PublicCertificatePrototype builder
     */
    public Builder ca(String ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the dns.
     *
     * @param dns the dns
     * @return the PublicCertificatePrototype builder
     */
    public Builder dns(String dns) {
      this.dns = dns;
      return this;
    }

    /**
     * Set the bundleCerts.
     *
     * @param bundleCerts the bundleCerts
     * @return the PublicCertificatePrototype builder
     */
    public Builder bundleCerts(Boolean bundleCerts) {
      this.bundleCerts = bundleCerts;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the PublicCertificatePrototype builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the PublicCertificatePrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the PublicCertificatePrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected PublicCertificatePrototype() { }

  protected PublicCertificatePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.commonName,
      "commonName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ca,
      "ca cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dns,
      "dns cannot be null");
    secretType = builder.secretType;
    name = builder.name;
    description = builder.description;
    secretGroupId = builder.secretGroupId;
    labels = builder.labels;
    commonName = builder.commonName;
    altNames = builder.altNames;
    keyAlgorithm = builder.keyAlgorithm;
    ca = builder.ca;
    dns = builder.dns;
    bundleCerts = builder.bundleCerts;
    rotation = builder.rotation;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificatePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

