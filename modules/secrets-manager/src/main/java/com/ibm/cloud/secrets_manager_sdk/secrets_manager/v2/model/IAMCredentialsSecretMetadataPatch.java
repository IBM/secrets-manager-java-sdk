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

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * IAMCredentialsSecretMetadataPatch.
 */
public class IAMCredentialsSecretMetadataPatch extends SecretMetadataPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private List<String> labels;
    private Map<String, Object> customMetadata;
    private String ttl;
    private RotationPolicy rotation;

    /**
     * Instantiates a new Builder from an existing IAMCredentialsSecretMetadataPatch instance.
     *
     * @param iamCredentialsSecretMetadataPatch the instance to initialize the Builder with
     */
    public Builder(SecretMetadataPatch iamCredentialsSecretMetadataPatch) {
      this.name = iamCredentialsSecretMetadataPatch.name;
      this.description = iamCredentialsSecretMetadataPatch.description;
      this.labels = iamCredentialsSecretMetadataPatch.labels;
      this.customMetadata = iamCredentialsSecretMetadataPatch.customMetadata;
      this.ttl = iamCredentialsSecretMetadataPatch.ttl;
      this.rotation = iamCredentialsSecretMetadataPatch.rotation;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IAMCredentialsSecretMetadataPatch.
     *
     * @return the new IAMCredentialsSecretMetadataPatch instance
     */
    public IAMCredentialsSecretMetadataPatch build() {
      return new IAMCredentialsSecretMetadataPatch(this);
    }

    /**
     * Adds a new element to labels.
     *
     * @param labels the new element to be added
     * @return the IAMCredentialsSecretMetadataPatch builder
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
     * Set the name.
     *
     * @param name the name
     * @return the IAMCredentialsSecretMetadataPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the IAMCredentialsSecretMetadataPatch builder
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
     * @return the IAMCredentialsSecretMetadataPatch builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the IAMCredentialsSecretMetadataPatch builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the IAMCredentialsSecretMetadataPatch builder
     */
    public Builder ttl(String ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the IAMCredentialsSecretMetadataPatch builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }
  }

  protected IAMCredentialsSecretMetadataPatch() { }

  protected IAMCredentialsSecretMetadataPatch(Builder builder) {
    name = builder.name;
    description = builder.description;
    labels = builder.labels;
    customMetadata = builder.customMetadata;
    ttl = builder.ttl;
    rotation = builder.rotation;
  }

  /**
   * New builder.
   *
   * @return a IAMCredentialsSecretMetadataPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the IAMCredentialsSecretMetadataPatch.
   *
   * Note that properties of the IAMCredentialsSecretMetadataPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the IAMCredentialsSecretMetadataPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

