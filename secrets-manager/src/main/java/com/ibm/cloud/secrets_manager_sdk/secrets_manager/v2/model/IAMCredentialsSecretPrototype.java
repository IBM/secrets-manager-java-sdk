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
 * IAMCredentialsSecretPrototype.
 */
public class IAMCredentialsSecretPrototype extends SecretPrototype {

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
    private String ttl;
    private List<String> accessGroups;
    private String serviceId;
    private Boolean reuseApiKey;
    private RotationPolicy rotation;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing IAMCredentialsSecretPrototype instance.
     *
     * @param iamCredentialsSecretPrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype iamCredentialsSecretPrototype) {
      this.secretType = iamCredentialsSecretPrototype.secretType;
      this.name = iamCredentialsSecretPrototype.name;
      this.description = iamCredentialsSecretPrototype.description;
      this.secretGroupId = iamCredentialsSecretPrototype.secretGroupId;
      this.labels = iamCredentialsSecretPrototype.labels;
      this.ttl = iamCredentialsSecretPrototype.ttl;
      this.accessGroups = iamCredentialsSecretPrototype.accessGroups;
      this.serviceId = iamCredentialsSecretPrototype.serviceId;
      this.reuseApiKey = iamCredentialsSecretPrototype.reuseApiKey;
      this.rotation = iamCredentialsSecretPrototype.rotation;
      this.customMetadata = iamCredentialsSecretPrototype.customMetadata;
      this.versionCustomMetadata = iamCredentialsSecretPrototype.versionCustomMetadata;
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
     * @param ttl the ttl
     * @param reuseApiKey the reuseApiKey
     */
    public Builder(String secretType, String name, String ttl, Boolean reuseApiKey) {
      this.secretType = secretType;
      this.name = name;
      this.ttl = ttl;
      this.reuseApiKey = reuseApiKey;
    }

    /**
     * Builds a IAMCredentialsSecretPrototype.
     *
     * @return the new IAMCredentialsSecretPrototype instance
     */
    public IAMCredentialsSecretPrototype build() {
      return new IAMCredentialsSecretPrototype(this);
    }

    /**
     * Adds an labels to labels.
     *
     * @param labels the new labels
     * @return the IAMCredentialsSecretPrototype builder
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
     * Adds an accessGroups to accessGroups.
     *
     * @param accessGroups the new accessGroups
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder addAccessGroups(String accessGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(accessGroups,
        "accessGroups cannot be null");
      if (this.accessGroups == null) {
        this.accessGroups = new ArrayList<String>();
      }
      this.accessGroups.add(accessGroups);
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the IAMCredentialsSecretPrototype builder
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
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder ttl(String ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the accessGroups.
     * Existing accessGroups will be replaced.
     *
     * @param accessGroups the accessGroups
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder accessGroups(List<String> accessGroups) {
      this.accessGroups = accessGroups;
      return this;
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the reuseApiKey.
     *
     * @param reuseApiKey the reuseApiKey
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder reuseApiKey(Boolean reuseApiKey) {
      this.reuseApiKey = reuseApiKey;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the IAMCredentialsSecretPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected IAMCredentialsSecretPrototype() { }

  protected IAMCredentialsSecretPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ttl,
      "ttl cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.reuseApiKey,
      "reuseApiKey cannot be null");
    secretType = builder.secretType;
    name = builder.name;
    description = builder.description;
    secretGroupId = builder.secretGroupId;
    labels = builder.labels;
    ttl = builder.ttl;
    accessGroups = builder.accessGroups;
    serviceId = builder.serviceId;
    reuseApiKey = builder.reuseApiKey;
    rotation = builder.rotation;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a IAMCredentialsSecretPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

