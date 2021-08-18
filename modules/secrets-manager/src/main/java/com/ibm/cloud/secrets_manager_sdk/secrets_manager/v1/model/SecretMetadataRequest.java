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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The metadata of a secret.
 */
public class SecretMetadataRequest extends GenericModel {

  protected CollectionMetadata metadata;
  protected List<SecretMetadata> resources;

  /**
   * Builder.
   */
  public static class Builder {
    private CollectionMetadata metadata;
    private List<SecretMetadata> resources;

    private Builder(SecretMetadataRequest secretMetadataRequest) {
      this.metadata = secretMetadataRequest.metadata;
      this.resources = secretMetadataRequest.resources;
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
    public Builder(CollectionMetadata metadata, List<SecretMetadata> resources) {
      this.metadata = metadata;
      this.resources = resources;
    }

    /**
     * Builds a SecretMetadataRequest.
     *
     * @return the new SecretMetadataRequest instance
     */
    public SecretMetadataRequest build() {
      return new SecretMetadataRequest(this);
    }

    /**
     * Adds an resources to resources.
     *
     * @param resources the new resources
     * @return the SecretMetadataRequest builder
     */
    public Builder addResources(SecretMetadata resources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
        "resources cannot be null");
      if (this.resources == null) {
        this.resources = new ArrayList<SecretMetadata>();
      }
      this.resources.add(resources);
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the SecretMetadataRequest builder
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
     * @return the SecretMetadataRequest builder
     */
    public Builder resources(List<SecretMetadata> resources) {
      this.resources = resources;
      return this;
    }
  }

  protected SecretMetadataRequest(Builder builder) {
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
   * @return a SecretMetadataRequest builder
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
  public List<SecretMetadata> resources() {
    return resources;
  }
}

