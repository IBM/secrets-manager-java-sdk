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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The IAM apikey metadata for the IAM credentials that were generated.
 */
public class ServiceCredentialsSourceServiceIamApikey extends GenericModel {

  protected String description;
  protected String id;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {

    /**
     * Instantiates a new Builder from an existing ServiceCredentialsSourceServiceIamApikey instance.
     *
     * @param serviceCredentialsSourceServiceIamApikey the instance to initialize the Builder with
     */
    private Builder(ServiceCredentialsSourceServiceIamApikey serviceCredentialsSourceServiceIamApikey) {
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceCredentialsSourceServiceIamApikey.
     *
     * @return the new ServiceCredentialsSourceServiceIamApikey instance
     */
    public ServiceCredentialsSourceServiceIamApikey build() {
      return new ServiceCredentialsSourceServiceIamApikey(this);
    }
  }

  protected ServiceCredentialsSourceServiceIamApikey() { }

  protected ServiceCredentialsSourceServiceIamApikey(Builder builder) {
  }

  /**
   * New builder.
   *
   * @return a ServiceCredentialsSourceServiceIamApikey builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * The IAM API key description for the generated service credentials.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the id.
   *
   * The IAM API key id for the generated service credentials.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The IAM API key name for the generated service credentials.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

