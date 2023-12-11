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
 * The IAM role for the generate service credentials.
 */
public class ServiceCredentialsSourceServiceIamRole extends GenericModel {

  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {

    /**
     * Instantiates a new Builder from an existing ServiceCredentialsSourceServiceIamRole instance.
     *
     * @param serviceCredentialsSourceServiceIamRole the instance to initialize the Builder with
     */
    private Builder(ServiceCredentialsSourceServiceIamRole serviceCredentialsSourceServiceIamRole) {
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceCredentialsSourceServiceIamRole.
     *
     * @return the new ServiceCredentialsSourceServiceIamRole instance
     */
    public ServiceCredentialsSourceServiceIamRole build() {
      return new ServiceCredentialsSourceServiceIamRole(this);
    }
  }

  protected ServiceCredentialsSourceServiceIamRole() { }

  protected ServiceCredentialsSourceServiceIamRole(Builder builder) {
  }

  /**
   * New builder.
   *
   * @return a ServiceCredentialsSourceServiceIamRole builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The IAM role CRN assigned to the generated service credentials.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

