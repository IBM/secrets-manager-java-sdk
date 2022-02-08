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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Properties that describe a secret group.
 */
public class SecretGroupResource extends DynamicModel<Object> {

  @SerializedName("id")
  protected String id;
  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("creation_date")
  protected Date creationDate;
  @SerializedName("last_update_date")
  protected Date lastUpdateDate;
  @SerializedName("type")
  protected String type;

  public SecretGroupResource() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private Map<String, Object> dynamicProperties;

    private Builder(SecretGroupResource secretGroupResource) {
      this.name = secretGroupResource.name;
      this.description = secretGroupResource.description;
      this.dynamicProperties = secretGroupResource.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SecretGroupResource.
     *
     * @return the new SecretGroupResource instance
     */
    public SecretGroupResource build() {
      return new SecretGroupResource(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SecretGroupResource builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SecretGroupResource builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SecretGroupResource builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected SecretGroupResource(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a SecretGroupResource builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies the secret group.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the name.
   *
   * A human-readable name to assign to your secret group.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a name for your secret group.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets the description.
   *
   * An extended description of your secret group.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret
   * group.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Gets the creationDate.
   *
   * The date the secret group was created. The date format follows RFC 3339.
   *
   * @return the creationDate
   */
  public Date getCreationDate() {
    return this.creationDate;
  }

  /**
   * Gets the lastUpdateDate.
   *
   * Updates when the metadata of the secret group is modified. The date format follows RFC 3339.
   *
   * @return the lastUpdateDate
   */
  public Date getLastUpdateDate() {
    return this.lastUpdateDate;
  }

  /**
   * Gets the type.
   *
   * The MIME type that represents the secret group.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }
}
