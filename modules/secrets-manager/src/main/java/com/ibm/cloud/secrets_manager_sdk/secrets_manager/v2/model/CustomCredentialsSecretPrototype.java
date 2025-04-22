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
 * CustomCredentialsSecretPrototype.
 */
public class CustomCredentialsSecretPrototype extends SecretPrototype {

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
    private Map<String, Object> customMetadata;
    private String description;
    private List<String> labels;
    private String name;
    private RotationPolicy rotation;
    private String secretGroupId;
    private String secretType;
    private String ttl;
    private Map<String, Object> versionCustomMetadata;
    private String configuration;
    private Map<String, Object> parameters;

    /**
     * Instantiates a new Builder from an existing CustomCredentialsSecretPrototype instance.
     *
     * @param customCredentialsSecretPrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype customCredentialsSecretPrototype) {
      this.customMetadata = customCredentialsSecretPrototype.customMetadata;
      this.description = customCredentialsSecretPrototype.description;
      this.labels = customCredentialsSecretPrototype.labels;
      this.name = customCredentialsSecretPrototype.name;
      this.rotation = customCredentialsSecretPrototype.rotation;
      this.secretGroupId = customCredentialsSecretPrototype.secretGroupId;
      this.secretType = customCredentialsSecretPrototype.secretType;
      this.ttl = customCredentialsSecretPrototype.ttl;
      this.versionCustomMetadata = customCredentialsSecretPrototype.versionCustomMetadata;
      this.configuration = customCredentialsSecretPrototype.configuration;
      this.parameters = customCredentialsSecretPrototype.parameters;
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
     * @param configuration the configuration
     */
    public Builder(String name, String secretType, String configuration) {
      this.name = name;
      this.secretType = secretType;
      this.configuration = configuration;
    }

    /**
     * Builds a CustomCredentialsSecretPrototype.
     *
     * @return the new CustomCredentialsSecretPrototype instance
     */
    public CustomCredentialsSecretPrototype build() {
      return new CustomCredentialsSecretPrototype(this);
    }

    /**
     * Adds a new element to labels.
     *
     * @param labels the new element to be added
     * @return the CustomCredentialsSecretPrototype builder
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
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the labels.
     * Existing labels will be replaced.
     *
     * @param labels the labels
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder secretGroupId(String secretGroupId) {
      this.secretGroupId = secretGroupId;
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder ttl(String ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder configuration(String configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the parameters.
     *
     * @param parameters the parameters
     * @return the CustomCredentialsSecretPrototype builder
     */
    public Builder parameters(Map<String, Object> parameters) {
      this.parameters = parameters;
      return this;
    }
  }

  protected CustomCredentialsSecretPrototype() { }

  protected CustomCredentialsSecretPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configuration,
      "configuration cannot be null");
    customMetadata = builder.customMetadata;
    description = builder.description;
    labels = builder.labels;
    name = builder.name;
    rotation = builder.rotation;
    secretGroupId = builder.secretGroupId;
    secretType = builder.secretType;
    ttl = builder.ttl;
    versionCustomMetadata = builder.versionCustomMetadata;
    configuration = builder.configuration;
    parameters = builder.parameters;
  }

  /**
   * New builder.
   *
   * @return a CustomCredentialsSecretPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

