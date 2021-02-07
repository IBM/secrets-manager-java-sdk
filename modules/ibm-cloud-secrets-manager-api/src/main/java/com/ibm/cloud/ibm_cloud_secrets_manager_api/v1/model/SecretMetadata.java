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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Metadata properties that describe a secret.
 */
public class SecretMetadata extends GenericModel {

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

  protected String id;
  protected List<String> labels;
  protected String name;
  protected String description;
  @SerializedName("secret_group_id")
  protected String secretGroupId;
  protected Long state;
  @SerializedName("state_description")
  protected String stateDescription;
  @SerializedName("secret_type")
  protected String secretType;
  @SerializedName("expiration_date")
  protected Date expirationDate;
  protected Object ttl;
  protected String crn;
  @SerializedName("creation_date")
  protected Date creationDate;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("last_update_date")
  protected Date lastUpdateDate;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> labels;
    private String name;
    private String description;
    private Date expirationDate;
    private Object ttl;

    private Builder(SecretMetadata secretMetadata) {
      this.labels = secretMetadata.labels;
      this.name = secretMetadata.name;
      this.description = secretMetadata.description;
      this.expirationDate = secretMetadata.expirationDate;
      this.ttl = secretMetadata.ttl;
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
     * Builds a SecretMetadata.
     *
     * @return the new SecretMetadata instance
     */
    public SecretMetadata build() {
      return new SecretMetadata(this);
    }

    /**
     * Adds an labels to labels.
     *
     * @param labels the new labels
     * @return the SecretMetadata builder
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
     * Set the labels.
     * Existing labels will be replaced.
     *
     * @param labels the labels
     * @return the SecretMetadata builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SecretMetadata builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SecretMetadata builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the expirationDate.
     *
     * @param expirationDate the expirationDate
     * @return the SecretMetadata builder
     */
    public Builder expirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the SecretMetadata builder
     */
    public Builder ttl(Object ttl) {
      this.ttl = ttl;
      return this;
    }
  }

  protected SecretMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    labels = builder.labels;
    name = builder.name;
    description = builder.description;
    expirationDate = builder.expirationDate;
    ttl = builder.ttl;
  }

  /**
   * New builder.
   *
   * @return a SecretMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The unique ID of the secret.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the labels.
   *
   * Labels that you can use to filter for secrets in your instance.
   *
   * Up to 30 labels can be created. Labels can be between 2-30 characters, including spaces. Special characters not
   * permitted include the angled bracket, comma, colon, ampersand, and vertical pipe character (|).
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a label for your secret.
   *
   * @return the labels
   */
  public List<String> labels() {
    return labels;
  }

  /**
   * Gets the name.
   *
   * A human-readable alias to assign to your secret.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as an alias for your secret.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * An extended description of your secret.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the secretGroupId.
   *
   * The v4 UUID that uniquely identifies the secret group to assign to this secret.
   *
   * If you omit this parameter, your secret is assigned to the `default` secret group.
   *
   * @return the secretGroupId
   */
  public String secretGroupId() {
    return secretGroupId;
  }

  /**
   * Gets the state.
   *
   * The secret state based on NIST SP 800-57. States are integers and correspond to the Pre-activation = 0, Active = 1,
   *  Suspended = 2, Deactivated = 3, and Destroyed = 5 values.
   *
   * @return the state
   */
  public Long state() {
    return state;
  }

  /**
   * Gets the stateDescription.
   *
   * A text representation of the secret state.
   *
   * @return the stateDescription
   */
  public String stateDescription() {
    return stateDescription;
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
   * Gets the expirationDate.
   *
   * The date the secret material expires. The date format follows RFC 3339.
   *
   * You can set an expiration date on supported secret types at their creation. If you create a secret without
   * specifying an expiration date, the secret does not expire. The `expiration_date` field is supported for the
   * following secret types:
   *
   * - `arbitrary`
   * - `username_password`.
   *
   * @return the expirationDate
   */
  public Date expirationDate() {
    return expirationDate;
  }

  /**
   * Gets the ttl.
   *
   * The time-to-live (TTL) or lease duration to assign to generated credentials.
   *
   * For `iam_credentials` secrets, the TTL defines for how long each generated API key remains valid. The value can be
   * either an integer that specifies the number of seconds, or the string representation of a duration, such as `120m`
   * or `24h`.
   *
   * @return the ttl
   */
  public Object ttl() {
    return ttl;
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies the resource.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the creationDate.
   *
   * The date the secret was created. The date format follows RFC 3339.
   *
   * @return the creationDate
   */
  public Date creationDate() {
    return creationDate;
  }

  /**
   * Gets the createdBy.
   *
   * The unique identifier for the entity that created the secret.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the lastUpdateDate.
   *
   * Updates when any part of the secret metadata is modified. The date format follows RFC 3339.
   *
   * @return the lastUpdateDate
   */
  public Date lastUpdateDate() {
    return lastUpdateDate;
  }
}

