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
 * The base schema for creating secrets.
 */
public class CreateSecret extends GenericModel {

  protected CollectionMetadata metadata;
  protected List<SecretResource> resources;

  /**
   * Builder.
   */
  public static class Builder {
    private CollectionMetadata metadata;
    private List<SecretResource> resources;

    private Builder(CreateSecret createSecret) {
      this.metadata = createSecret.metadata;
      this.resources = createSecret.resources;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param metadata the metadata
     * @param resources the resources
     */
    public Builder(CollectionMetadata metadata, List<SecretResource> resources) {
      this.metadata = metadata;
      this.resources = resources;
    }

    /**
     * Builds a CreateSecret.
     *
     * @return the new CreateSecret instance
     */
    public CreateSecret build() {
      return new CreateSecret(this);
    }

    /**
     * Adds an resources to resources.
     *
     * @param resources the new resources
     * @return the CreateSecret builder
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
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the CreateSecret builder
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
     * @return the CreateSecret builder
     */
    public Builder resources(List<SecretResource> resources) {
      this.resources = resources;
      return this;
    }
  }

  protected CreateSecret(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metadata,
      "metadata cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resources,
      "resources cannot be null");
    metadata = builder.metadata;
    resources = builder.resources;
  }

  /**
   * New builder.
   *
   * @return a CreateSecret builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

