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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Newly created credentials provided by the credentials provider.
 */
public class CustomCredentialsNewCredentials extends GenericModel {

  protected String id;
  protected Map<String, Object> payload;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> payload;

    /**
     * Instantiates a new Builder from an existing CustomCredentialsNewCredentials instance.
     *
     * @param customCredentialsNewCredentials the instance to initialize the Builder with
     */
    private Builder(CustomCredentialsNewCredentials customCredentialsNewCredentials) {
      this.id = customCredentialsNewCredentials.id;
      this.payload = customCredentialsNewCredentials.payload;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param payload the payload
     */
    public Builder(String id, Map<String, Object> payload) {
      this.id = id;
      this.payload = payload;
    }

    /**
     * Builds a CustomCredentialsNewCredentials.
     *
     * @return the new CustomCredentialsNewCredentials instance
     */
    public CustomCredentialsNewCredentials build() {
      return new CustomCredentialsNewCredentials(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CustomCredentialsNewCredentials builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the payload.
     *
     * @param payload the payload
     * @return the CustomCredentialsNewCredentials builder
     */
    public Builder payload(Map<String, Object> payload) {
      this.payload = payload;
      return this;
    }
  }

  protected CustomCredentialsNewCredentials() { }

  protected CustomCredentialsNewCredentials(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.payload,
      "payload cannot be null");
    id = builder.id;
    payload = builder.payload;
  }

  /**
   * New builder.
   *
   * @return a CustomCredentialsNewCredentials builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * An identifier of credentials in the credentials provider that is used by the custom credentials secret type.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the payload.
   *
   * The fields that can be passed to and from the custom credentials engine. Allowed types are 'string', 'integer' and
   * 'boolean'.
   *
   * @return the payload
   */
  public Map<String, Object> payload() {
    return payload;
  }
}

