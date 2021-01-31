/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSecret options.
 */
public class CreateSecretOptions extends GenericModel {

  /**
   * The secret type.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
  }

  protected String secretType;
  protected CollectionMetadata metadata;
  protected List<SecretResource> resources;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;
    private CollectionMetadata metadata;
    private List<SecretResource> resources;

    private Builder(CreateSecretOptions createSecretOptions) {
      this.secretType = createSecretOptions.secretType;
      this.metadata = createSecretOptions.metadata;
      this.resources = createSecretOptions.resources;
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
     * @param metadata the metadata
     * @param resources the resources
     */
    public Builder(String secretType, CollectionMetadata metadata, List<SecretResource> resources) {
      this.secretType = secretType;
      this.metadata = metadata;
      this.resources = resources;
    }

    /**
     * Builds a CreateSecretOptions.
     *
     * @return the new CreateSecretOptions instance
     */
    public CreateSecretOptions build() {
      return new CreateSecretOptions(this);
    }

    /**
     * Adds an resources to resources.
     *
     * @param resources the new resources
     * @return the CreateSecretOptions builder
     */
    public Builder addResources(SecretResource resources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
        "resources cannot be null");
      if (this.resources == null) {
        this.resources = new ArrayList<SecretResource>();
      }
      this.resources.add(resources);
      return this;
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the CreateSecretOptions builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the CreateSecretOptions builder
     */
    public Builder metadata(CollectionMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set the resources.
     * Existing resources will be replaced.
     *
     * @param resources the resources
     * @return the CreateSecretOptions builder
     */
    public Builder resources(List<SecretResource> resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the createSecret.
     *
     * @param createSecret the createSecret
     * @return the CreateSecretOptions builder
     */
    public Builder createSecret(CreateSecret createSecret) {
      this.metadata = createSecret.metadata();
      this.resources = createSecret.resources();
      return this;
    }
  }

  protected CreateSecretOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
      "secretType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metadata,
      "metadata cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resources,
      "resources cannot be null");
    secretType = builder.secretType;
    metadata = builder.metadata;
    resources = builder.resources;
  }

  /**
   * New builder.
   *
   * @return a CreateSecretOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secretType.
   *
   * The secret type.
   *
   * @return the secretType
   */
  public String secretType() {
    return secretType;
  }

  /**
   * Gets the metadata.
   *
   * The metadata that describes the resource array.
   *
   * @return the metadata
   */
  public CollectionMetadata metadata() {
    return metadata;
  }

  /**
   * Gets the resources.
   *
   * A collection of resources.
   *
   * @return the resources
   */
  public List<SecretResource> resources() {
    return resources;
  }
}

