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
 * PrivateCertificatePrototype.
 */
public class PrivateCertificatePrototype extends SecretPrototype {

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
   * The format of the returned data.
   */
  public interface Format {
    /** pem. */
    String PEM = "pem";
    /** pem_bundle. */
    String PEM_BUNDLE = "pem_bundle";
  }

  /**
   * The format of the generated private key.
   */
  public interface PrivateKeyFormat {
    /** der. */
    String DER = "der";
    /** pkcs8. */
    String PKCS8 = "pkcs8";
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
    private String certificateTemplate;
    private String commonName;
    private List<String> altNames;
    private String ipSans;
    private String uriSans;
    private List<String> otherSans;
    private String csr;
    private String format;
    private String privateKeyFormat;
    private Boolean excludeCnFromSans;
    private String ttl;
    private RotationPolicy rotation;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing PrivateCertificatePrototype instance.
     *
     * @param privateCertificatePrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype privateCertificatePrototype) {
      this.secretType = privateCertificatePrototype.secretType;
      this.name = privateCertificatePrototype.name;
      this.description = privateCertificatePrototype.description;
      this.secretGroupId = privateCertificatePrototype.secretGroupId;
      this.labels = privateCertificatePrototype.labels;
      this.certificateTemplate = privateCertificatePrototype.certificateTemplate;
      this.commonName = privateCertificatePrototype.commonName;
      this.altNames = privateCertificatePrototype.altNames;
      this.ipSans = privateCertificatePrototype.ipSans;
      this.uriSans = privateCertificatePrototype.uriSans;
      this.otherSans = privateCertificatePrototype.otherSans;
      this.csr = privateCertificatePrototype.csr;
      this.format = privateCertificatePrototype.format;
      this.privateKeyFormat = privateCertificatePrototype.privateKeyFormat;
      this.excludeCnFromSans = privateCertificatePrototype.excludeCnFromSans;
      this.ttl = privateCertificatePrototype.ttl;
      this.rotation = privateCertificatePrototype.rotation;
      this.customMetadata = privateCertificatePrototype.customMetadata;
      this.versionCustomMetadata = privateCertificatePrototype.versionCustomMetadata;
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
     * @param certificateTemplate the certificateTemplate
     * @param commonName the commonName
     */
    public Builder(String secretType, String name, String certificateTemplate, String commonName) {
      this.secretType = secretType;
      this.name = name;
      this.certificateTemplate = certificateTemplate;
      this.commonName = commonName;
    }

    /**
     * Builds a PrivateCertificatePrototype.
     *
     * @return the new PrivateCertificatePrototype instance
     */
    public PrivateCertificatePrototype build() {
      return new PrivateCertificatePrototype(this);
    }

    /**
     * Adds an labels to labels.
     *
     * @param labels the new labels
     * @return the PrivateCertificatePrototype builder
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
     * @return the PrivateCertificatePrototype builder
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
     * Adds an otherSans to otherSans.
     *
     * @param otherSans the new otherSans
     * @return the PrivateCertificatePrototype builder
     */
    public Builder addOtherSans(String otherSans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(otherSans,
        "otherSans cannot be null");
      if (this.otherSans == null) {
        this.otherSans = new ArrayList<String>();
      }
      this.otherSans.add(otherSans);
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the PrivateCertificatePrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PrivateCertificatePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the PrivateCertificatePrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the PrivateCertificatePrototype builder
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
     * @return the PrivateCertificatePrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the certificateTemplate.
     *
     * @param certificateTemplate the certificateTemplate
     * @return the PrivateCertificatePrototype builder
     */
    public Builder certificateTemplate(String certificateTemplate) {
      this.certificateTemplate = certificateTemplate;
      return this;
    }

    /**
     * Set the commonName.
     *
     * @param commonName the commonName
     * @return the PrivateCertificatePrototype builder
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
     * @return the PrivateCertificatePrototype builder
     */
    public Builder altNames(List<String> altNames) {
      this.altNames = altNames;
      return this;
    }

    /**
     * Set the ipSans.
     *
     * @param ipSans the ipSans
     * @return the PrivateCertificatePrototype builder
     */
    public Builder ipSans(String ipSans) {
      this.ipSans = ipSans;
      return this;
    }

    /**
     * Set the uriSans.
     *
     * @param uriSans the uriSans
     * @return the PrivateCertificatePrototype builder
     */
    public Builder uriSans(String uriSans) {
      this.uriSans = uriSans;
      return this;
    }

    /**
     * Set the otherSans.
     * Existing otherSans will be replaced.
     *
     * @param otherSans the otherSans
     * @return the PrivateCertificatePrototype builder
     */
    public Builder otherSans(List<String> otherSans) {
      this.otherSans = otherSans;
      return this;
    }

    /**
     * Set the csr.
     *
     * @param csr the csr
     * @return the PrivateCertificatePrototype builder
     */
    public Builder csr(String csr) {
      this.csr = csr;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the PrivateCertificatePrototype builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the privateKeyFormat.
     *
     * @param privateKeyFormat the privateKeyFormat
     * @return the PrivateCertificatePrototype builder
     */
    public Builder privateKeyFormat(String privateKeyFormat) {
      this.privateKeyFormat = privateKeyFormat;
      return this;
    }

    /**
     * Set the excludeCnFromSans.
     *
     * @param excludeCnFromSans the excludeCnFromSans
     * @return the PrivateCertificatePrototype builder
     */
    public Builder excludeCnFromSans(Boolean excludeCnFromSans) {
      this.excludeCnFromSans = excludeCnFromSans;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the PrivateCertificatePrototype builder
     */
    public Builder ttl(String ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the PrivateCertificatePrototype builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the PrivateCertificatePrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the PrivateCertificatePrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected PrivateCertificatePrototype() { }

  protected PrivateCertificatePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificateTemplate,
      "certificateTemplate cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.commonName,
      "commonName cannot be null");
    secretType = builder.secretType;
    name = builder.name;
    description = builder.description;
    secretGroupId = builder.secretGroupId;
    labels = builder.labels;
    certificateTemplate = builder.certificateTemplate;
    commonName = builder.commonName;
    altNames = builder.altNames;
    ipSans = builder.ipSans;
    uriSans = builder.uriSans;
    otherSans = builder.otherSans;
    csr = builder.csr;
    format = builder.format;
    privateKeyFormat = builder.privateKeyFormat;
    excludeCnFromSans = builder.excludeCnFromSans;
    ttl = builder.ttl;
    rotation = builder.rotation;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a PrivateCertificatePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

