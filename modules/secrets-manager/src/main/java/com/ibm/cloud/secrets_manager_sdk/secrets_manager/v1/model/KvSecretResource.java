/*
 * (C) Copyright IBM Corp. 2022.
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
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Properties that describe a secret.
 */
public class KvSecretResource extends SecretResource {

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
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** kv. */
    String KV = "kv";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String secretGroupId;
    private List<String> labels;
    private Date expirationDate;
    private Map<String, Object> payload;

    public Builder(SecretResource kvSecretResource) {
      this.name = kvSecretResource.name;
      this.description = kvSecretResource.description;
      this.secretGroupId = kvSecretResource.secretGroupId;
      this.labels = kvSecretResource.labels;
      this.expirationDate = kvSecretResource.expirationDate;
      this.payload = kvSecretResource.kvPayload;
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
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a KvSecretResource.
     *
     * @return the new KvSecretResource instance
     */
    public KvSecretResource build() {
      return new KvSecretResource(this);
    }

    /**
     * Adds an labels to labels.
     *
     * @param labels the new labels
     * @return the KvSecretResource builder
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
     * @return the KvSecretResource builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the KvSecretResource builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the secretGroupId.
     *
     * @param secretGroupId the secretGroupId
     * @return the KvSecretResource builder
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
     * @return the KvSecretResource builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the expirationDate.
     *
     * @param expirationDate the expirationDate
     * @return the KvSecretResource builder
     */
    public Builder expirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
      return this;
    }

    /**
     * Set the payload.
     *
     * @param payload the payload
     * @return the KvSecretResource builder
     */
    public Builder payload(Map<String, Object> payload) {
      this.payload = payload;
      return this;
    }
  }

  protected KvSecretResource(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
    description = builder.description;
    secretGroupId = builder.secretGroupId;
    labels = builder.labels;
    expirationDate = builder.expirationDate;
    kvPayload = builder.payload;
  }

  /**
   * New builder.
   *
   * @return a KvSecretResource builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

