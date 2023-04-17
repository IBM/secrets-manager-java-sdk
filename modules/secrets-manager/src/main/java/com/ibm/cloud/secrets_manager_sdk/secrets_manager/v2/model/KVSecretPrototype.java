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
 * KVSecretPrototype.
 */
public class KVSecretPrototype extends SecretPrototype {

  /**
   * The secret type. Supported types are arbitrary, certificates (imported, public, and private), IAM credentials,
   * key-value, and user credentials.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** kv. */
    String KV = "kv";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
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
    private Map<String, Object> data;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing KVSecretPrototype instance.
     *
     * @param kvSecretPrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype kvSecretPrototype) {
      this.secretType = kvSecretPrototype.secretType;
      this.name = kvSecretPrototype.name;
      this.description = kvSecretPrototype.description;
      this.secretGroupId = kvSecretPrototype.secretGroupId;
      this.labels = kvSecretPrototype.labels;
      this.data = kvSecretPrototype.data;
      this.customMetadata = kvSecretPrototype.customMetadata;
      this.versionCustomMetadata = kvSecretPrototype.versionCustomMetadata;
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
     * @param data the data
     */
    public Builder(String secretType, String name, Map<String, Object> data) {
      this.secretType = secretType;
      this.name = name;
      this.data = data;
    }

    /**
     * Builds a KVSecretPrototype.
     *
     * @return the new KVSecretPrototype instance
     */
    public KVSecretPrototype build() {
      return new KVSecretPrototype(this);
    }

    /**
     * Adds an labels to labels.
     *
     * @param labels the new labels
     * @return the KVSecretPrototype builder
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
     * @return the KVSecretPrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the KVSecretPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the KVSecretPrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the KVSecretPrototype builder
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
     * @return the KVSecretPrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the KVSecretPrototype builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the KVSecretPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the KVSecretPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected KVSecretPrototype() { }

  protected KVSecretPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.data,
      "data cannot be null");
    secretType = builder.secretType;
    name = builder.name;
    description = builder.description;
    secretGroupId = builder.secretGroupId;
    labels = builder.labels;
    data = builder.data;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a KVSecretPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

