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
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * UsernamePasswordSecretPrototype.
 */
public class UsernamePasswordSecretPrototype extends SecretPrototype {

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
    private String username;
    private String password;
    private Date expirationDate;
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;
    private RotationPolicy rotation;

    /**
     * Instantiates a new Builder from an existing UsernamePasswordSecretPrototype instance.
     *
     * @param usernamePasswordSecretPrototype the instance to initialize the Builder with
     */
    public Builder(SecretPrototype usernamePasswordSecretPrototype) {
      this.secretType = usernamePasswordSecretPrototype.secretType;
      this.name = usernamePasswordSecretPrototype.name;
      this.description = usernamePasswordSecretPrototype.description;
      this.secretGroupId = usernamePasswordSecretPrototype.secretGroupId;
      this.labels = usernamePasswordSecretPrototype.labels;
      this.username = usernamePasswordSecretPrototype.username;
      this.password = usernamePasswordSecretPrototype.password;
      this.expirationDate = usernamePasswordSecretPrototype.expirationDate;
      this.customMetadata = usernamePasswordSecretPrototype.customMetadata;
      this.versionCustomMetadata = usernamePasswordSecretPrototype.versionCustomMetadata;
      this.rotation = usernamePasswordSecretPrototype.rotation;
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
     * @param username the username
     * @param password the password
     */
    public Builder(String secretType, String name, String username, String password) {
      this.secretType = secretType;
      this.name = name;
      this.username = username;
      this.password = password;
    }

    /**
     * Builds a UsernamePasswordSecretPrototype.
     *
     * @return the new UsernamePasswordSecretPrototype instance
     */
    public UsernamePasswordSecretPrototype build() {
      return new UsernamePasswordSecretPrototype(this);
    }

    /**
     * Adds an labels to labels.
     *
     * @param labels the new labels
     * @return the UsernamePasswordSecretPrototype builder
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
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the UsernamePasswordSecretPrototype builder
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
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the expirationDate.
     *
     * @param expirationDate the expirationDate
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder expirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the UsernamePasswordSecretPrototype builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }
  }

  protected UsernamePasswordSecretPrototype() { }

  protected UsernamePasswordSecretPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretType,
      "secretType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.username,
      "username cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    secretType = builder.secretType;
    name = builder.name;
    description = builder.description;
    secretGroupId = builder.secretGroupId;
    labels = builder.labels;
    username = builder.username;
    password = builder.password;
    expirationDate = builder.expirationDate;
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
    rotation = builder.rotation;
  }

  /**
   * New builder.
   *
   * @return a UsernamePasswordSecretPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

