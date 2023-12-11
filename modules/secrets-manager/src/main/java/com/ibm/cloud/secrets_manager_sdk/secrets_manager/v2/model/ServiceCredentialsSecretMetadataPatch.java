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

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * ServiceCredentialsSecretMetadataPatch.
 */
public class ServiceCredentialsSecretMetadataPatch extends SecretMetadataPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> customMetadata;
    private String description;
    private List<String> labels;
    private String name;
    private RotationPolicy rotation;
    private String ttl;

    /**
     * Instantiates a new Builder from an existing ServiceCredentialsSecretMetadataPatch instance.
     *
     * @param serviceCredentialsSecretMetadataPatch the instance to initialize the Builder with
     */
    public Builder(SecretMetadataPatch serviceCredentialsSecretMetadataPatch) {
      this.customMetadata = serviceCredentialsSecretMetadataPatch.customMetadata;
      this.description = serviceCredentialsSecretMetadataPatch.description;
      this.labels = serviceCredentialsSecretMetadataPatch.labels;
      this.name = serviceCredentialsSecretMetadataPatch.name;
      this.rotation = serviceCredentialsSecretMetadataPatch.rotation;
      this.ttl = serviceCredentialsSecretMetadataPatch.ttl;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceCredentialsSecretMetadataPatch.
     *
     * @return the new ServiceCredentialsSecretMetadataPatch instance
     */
    public ServiceCredentialsSecretMetadataPatch build() {
      return new ServiceCredentialsSecretMetadataPatch(this);
    }

    /**
     * Adds an labels to labels.
     *
     * @param labels the new labels
     * @return the ServiceCredentialsSecretMetadataPatch builder
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
     * @return the ServiceCredentialsSecretMetadataPatch builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ServiceCredentialsSecretMetadataPatch builder
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
     * @return the ServiceCredentialsSecretMetadataPatch builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ServiceCredentialsSecretMetadataPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the ServiceCredentialsSecretMetadataPatch builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the ServiceCredentialsSecretMetadataPatch builder
     */
    public Builder ttl(String ttl) {
      this.ttl = ttl;
      return this;
    }
  }

  protected ServiceCredentialsSecretMetadataPatch() { }

  protected ServiceCredentialsSecretMetadataPatch(Builder builder) {
    customMetadata = builder.customMetadata;
    description = builder.description;
    labels = builder.labels;
    name = builder.name;
    rotation = builder.rotation;
    ttl = builder.ttl;
  }

  /**
   * New builder.
   *
   * @return a ServiceCredentialsSecretMetadataPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the ServiceCredentialsSecretMetadataPatch.
   *
   * Note that properties of the ServiceCredentialsSecretMetadataPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ServiceCredentialsSecretMetadataPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

