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
import java.util.List;
import java.util.Map;

/**
 * ServiceCredentialsSecretPrototype.
 */
public class ServiceCredentialsSecretPrototype extends SecretPrototype {

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
    private List<String> labels;
    private String name;
    private RotationPolicy rotation;
    private String secretGroupId;
    private String secretType;
    private ServiceCredentialsSecretSourceService sourceService;
    private String ttl;
    private Map<String, Object> versionCustomMetadata;

    /**
     * Instantiates a new Builder from an existing ServiceCredentialsSecretPrototype instance.
     *
     * @param serviceCredentialsSecretPrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype serviceCredentialsSecretPrototype) {
      this.customMetadata = serviceCredentialsSecretPrototype.customMetadata;
      this.description = serviceCredentialsSecretPrototype.description;
      this.labels = serviceCredentialsSecretPrototype.labels;
      this.name = serviceCredentialsSecretPrototype.name;
      this.rotation = serviceCredentialsSecretPrototype.rotation;
      this.secretGroupId = serviceCredentialsSecretPrototype.secretGroupId;
      this.secretType = serviceCredentialsSecretPrototype.secretType;
      this.sourceService = serviceCredentialsSecretPrototype.sourceService;
      this.ttl = serviceCredentialsSecretPrototype.ttl;
      this.versionCustomMetadata = serviceCredentialsSecretPrototype.versionCustomMetadata;
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
     * @param sourceService the sourceService
     */
    public Builder(String name, String secretType, ServiceCredentialsSecretSourceService sourceService) {
      this.name = name;
      this.secretType = secretType;
      this.sourceService = sourceService;
    }

    /**
     * Builds a ServiceCredentialsSecretPrototype.
     *
     * @return the new ServiceCredentialsSecretPrototype instance
     */
    public ServiceCredentialsSecretPrototype build() {
      return new ServiceCredentialsSecretPrototype(this);
    }

    /**
     * Adds a new element to labels.
     *
     * @param labels the new element to be added
     * @return the ServiceCredentialsSecretPrototype builder
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
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ServiceCredentialsSecretPrototype builder
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
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder secretGroupId(String secretGroupId) {
      this.secretGroupId = secretGroupId;
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the sourceService.
     *
     * @param sourceService the sourceService
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder sourceService(ServiceCredentialsSecretSourceService sourceService) {
      this.sourceService = sourceService;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder ttl(String ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the ServiceCredentialsSecretPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }
  }

  protected ServiceCredentialsSecretPrototype() { }

  protected ServiceCredentialsSecretPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceService,
      "sourceService cannot be null");
    customMetadata = builder.customMetadata;
    description = builder.description;
    labels = builder.labels;
    name = builder.name;
    rotation = builder.rotation;
    secretGroupId = builder.secretGroupId;
    secretType = builder.secretType;
    sourceService = builder.sourceService;
    ttl = builder.ttl;
    versionCustomMetadata = builder.versionCustomMetadata;
  }

  /**
   * New builder.
   *
   * @return a ServiceCredentialsSecretPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

