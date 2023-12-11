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
 * The source service IAM data is returned in case IAM credentials where created for this secret.
 */
public class ServiceCredentialsSourceServiceIam extends GenericModel {

  protected ServiceCredentialsSourceServiceIamApikey apikey;
  protected ServiceCredentialsSourceServiceIamRole role;
  protected ServiceCredentialsSourceServiceIamServiceid serviceid;

  /**
   * Builder.
   */
  public static class Builder {
    private ServiceCredentialsSourceServiceIamApikey apikey;
    private ServiceCredentialsSourceServiceIamRole role;
    private ServiceCredentialsSourceServiceIamServiceid serviceid;

    /**
     * Instantiates a new Builder from an existing ServiceCredentialsSourceServiceIam instance.
     *
     * @param serviceCredentialsSourceServiceIam the instance to initialize the Builder with
     */
    private Builder(ServiceCredentialsSourceServiceIam serviceCredentialsSourceServiceIam) {
      this.apikey = serviceCredentialsSourceServiceIam.apikey;
      this.role = serviceCredentialsSourceServiceIam.role;
      this.serviceid = serviceCredentialsSourceServiceIam.serviceid;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceCredentialsSourceServiceIam.
     *
     * @return the new ServiceCredentialsSourceServiceIam instance
     */
    public ServiceCredentialsSourceServiceIam build() {
      return new ServiceCredentialsSourceServiceIam(this);
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the ServiceCredentialsSourceServiceIam builder
     */
    public Builder apikey(ServiceCredentialsSourceServiceIamApikey apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the ServiceCredentialsSourceServiceIam builder
     */
    public Builder role(ServiceCredentialsSourceServiceIamRole role) {
      this.role = role;
      return this;
    }

    /**
     * Set the serviceid.
     *
     * @param serviceid the serviceid
     * @return the ServiceCredentialsSourceServiceIam builder
     */
    public Builder serviceid(ServiceCredentialsSourceServiceIamServiceid serviceid) {
      this.serviceid = serviceid;
      return this;
    }
  }

  protected ServiceCredentialsSourceServiceIam() { }

  protected ServiceCredentialsSourceServiceIam(Builder builder) {
    apikey = builder.apikey;
    role = builder.role;
    serviceid = builder.serviceid;
  }

  /**
   * New builder.
   *
   * @return a ServiceCredentialsSourceServiceIam builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apikey.
   *
   * The IAM apikey metadata for the IAM credentials that were generated.
   *
   * @return the apikey
   */
  public ServiceCredentialsSourceServiceIamApikey apikey() {
    return apikey;
  }

  /**
   * Gets the role.
   *
   * The IAM role for the generate service credentials.
   *
   * @return the role
   */
  public ServiceCredentialsSourceServiceIamRole role() {
    return role;
  }

  /**
   * Gets the serviceid.
   *
   * The IAM serviceid for the generated service credentials.
   *
   * @return the serviceid
   */
  public ServiceCredentialsSourceServiceIamServiceid serviceid() {
    return serviceid;
  }
}

