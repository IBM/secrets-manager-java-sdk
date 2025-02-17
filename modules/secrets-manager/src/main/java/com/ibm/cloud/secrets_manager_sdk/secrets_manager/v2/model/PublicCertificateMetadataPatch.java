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

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * PublicCertificateMetadataPatch.
 */
public class PublicCertificateMetadataPatch extends SecretMetadataPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private List<String> labels;
    private Map<String, Object> customMetadata;
    private RotationPolicy rotation;

    /**
     * Instantiates a new Builder from an existing PublicCertificateMetadataPatch instance.
     *
     * @param publicCertificateMetadataPatch the instance to initialize the Builder with
     */
    public Builder(SecretMetadataPatch publicCertificateMetadataPatch) {
      this.name = publicCertificateMetadataPatch.name;
      this.description = publicCertificateMetadataPatch.description;
      this.labels = publicCertificateMetadataPatch.labels;
      this.customMetadata = publicCertificateMetadataPatch.customMetadata;
      this.rotation = publicCertificateMetadataPatch.rotation;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublicCertificateMetadataPatch.
     *
     * @return the new PublicCertificateMetadataPatch instance
     */
    public PublicCertificateMetadataPatch build() {
      return new PublicCertificateMetadataPatch(this);
    }

    /**
     * Adds a new element to labels.
     *
     * @param labels the new element to be added
     * @return the PublicCertificateMetadataPatch builder
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
     * @return the PublicCertificateMetadataPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the PublicCertificateMetadataPatch builder
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
     * @return the PublicCertificateMetadataPatch builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the PublicCertificateMetadataPatch builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the rotation.
     *
     * @param rotation the rotation
     * @return the PublicCertificateMetadataPatch builder
     */
    public Builder rotation(RotationPolicy rotation) {
      this.rotation = rotation;
      return this;
    }
  }

  protected PublicCertificateMetadataPatch() { }

  protected PublicCertificateMetadataPatch(Builder builder) {
    name = builder.name;
    description = builder.description;
    labels = builder.labels;
    customMetadata = builder.customMetadata;
    rotation = builder.rotation;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateMetadataPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the PublicCertificateMetadataPatch.
   *
   * Note that properties of the PublicCertificateMetadataPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PublicCertificateMetadataPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

