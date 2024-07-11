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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * ArbitrarySecretPrototype.
 */
public class ArbitrarySecretPrototype extends SecretPrototype {

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
    private Map<String, Object> customMetadata;
    private String description;
    private Date expirationDate;
    private List<String> labels;
    private String name;
    private String secretGroupId;
    private String secretType;
    private String payload;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing ArbitrarySecretPrototype instance.
     *
     * @param arbitrarySecretPrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype arbitrarySecretPrototype) {
      this.customMetadata = arbitrarySecretPrototype.customMetadata;
      this.description = arbitrarySecretPrototype.description;
      this.expirationDate = arbitrarySecretPrototype.expirationDate;
      this.labels = arbitrarySecretPrototype.labels;
      this.name = arbitrarySecretPrototype.name;
      this.secretGroupId = arbitrarySecretPrototype.secretGroupId;
      this.secretType = arbitrarySecretPrototype.secretType;
      this.payload = arbitrarySecretPrototype.payload;
      this.versionCustomMetadata = arbitrarySecretPrototype.versionCustomMetadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param secretType the secretType
     * @param payload the payload
     */
    public Builder(String name, String secretType, String payload) {
      this.name = name;
      this.secretType = secretType;
      this.payload = payload;
    }

    /**
     * Builds a ArbitrarySecretPrototype.
     *
     * @return the new ArbitrarySecretPrototype instance
     */
    public ArbitrarySecretPrototype build() {
      return new ArbitrarySecretPrototype(this);
    }

    /**
     * Adds a new element to labels.
     *
     * @param labels the new element to be added
     * @return the ArbitrarySecretPrototype builder
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
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the expirationDate.
     *
     * @param expirationDate the expirationDate
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder expirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
      return this;
    }

    /**
     * Set the labels.
     * Existing labels will be replaced.
     *
     * @param labels the labels
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder secretGroupId(String secretGroupId) {
      this.secretGroupId = secretGroupId;
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the payload.
     *
     * @param payload the payload
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder payload(String payload) {
      this.payload = payload;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the ArbitrarySecretPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected ArbitrarySecretPrototype() { }

  protected ArbitrarySecretPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.payload,
      "payload cannot be null");
    customMetadata = builder.customMetadata;
    description = builder.description;
    expirationDate = builder.expirationDate;
    labels = builder.labels;
    name = builder.name;
    secretGroupId = builder.secretGroupId;
    secretType = builder.secretType;
    payload = builder.payload;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a ArbitrarySecretPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

