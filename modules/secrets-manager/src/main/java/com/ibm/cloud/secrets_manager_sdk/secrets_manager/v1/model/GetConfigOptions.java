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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getConfig options.
 */
public class GetConfigOptions extends GenericModel {

  /**
   * The secret type.
   */
  public interface SecretType {
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
  }

  protected String secretType;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;

    /**
     * Instantiates a new Builder from an existing GetConfigOptions instance.
     *
     * @param getConfigOptions the instance to initialize the Builder with
     */
    private Builder(GetConfigOptions getConfigOptions) {
      this.secretType = getConfigOptions.secretType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param secretType the secretType
     */
    public Builder(String secretType) {
      this.secretType = secretType;
    }

    /**
     * Builds a GetConfigOptions.
     *
     * @return the new GetConfigOptions instance
     */
    public GetConfigOptions build() {
      return new GetConfigOptions(this);
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the GetConfigOptions builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }
  }

  protected GetConfigOptions() { }

  protected GetConfigOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
      "secretType cannot be empty");
    secretType = builder.secretType;
  }

  /**
   * New builder.
   *
   * @return a GetConfigOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

