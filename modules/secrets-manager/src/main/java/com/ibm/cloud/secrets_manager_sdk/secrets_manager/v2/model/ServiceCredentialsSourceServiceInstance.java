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
 * The source service instance identifier.
 */
public class ServiceCredentialsSourceServiceInstance extends GenericModel {

  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    /**
     * Instantiates a new Builder from an existing ServiceCredentialsSourceServiceInstance instance.
     *
     * @param serviceCredentialsSourceServiceInstance the instance to initialize the Builder with
     */
    private Builder(ServiceCredentialsSourceServiceInstance serviceCredentialsSourceServiceInstance) {
      this.crn = serviceCredentialsSourceServiceInstance.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceCredentialsSourceServiceInstance.
     *
     * @return the new ServiceCredentialsSourceServiceInstance instance
     */
    public ServiceCredentialsSourceServiceInstance build() {
      return new ServiceCredentialsSourceServiceInstance(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ServiceCredentialsSourceServiceInstance builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected ServiceCredentialsSourceServiceInstance() { }

  protected ServiceCredentialsSourceServiceInstance(Builder builder) {
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a ServiceCredentialsSourceServiceInstance builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * A CRN that uniquely identifies a service credentials source.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

