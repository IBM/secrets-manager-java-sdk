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
 * The getPolicy options.
 */
public class GetPolicyOptions extends GenericModel {

  /**
   * The secret type.
   */
  public interface SecretType {
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
  }

  /**
   * The type of policy that is associated with the specified secret.
   */
  public interface Policy {
    /** rotation. */
    String ROTATION = "rotation";
  }

  protected String secretType;
  protected String id;
  protected String policy;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;
    private String id;
    private String policy;

    /**
     * Instantiates a new Builder from an existing GetPolicyOptions instance.
     *
     * @param getPolicyOptions the instance to initialize the Builder with
     */
    private Builder(GetPolicyOptions getPolicyOptions) {
      this.secretType = getPolicyOptions.secretType;
      this.id = getPolicyOptions.id;
      this.policy = getPolicyOptions.policy;
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
     * @param id the id
     */
    public Builder(String secretType, String id) {
      this.secretType = secretType;
      this.id = id;
    }

    /**
     * Builds a GetPolicyOptions.
     *
     * @return the new GetPolicyOptions instance
     */
    public GetPolicyOptions build() {
      return new GetPolicyOptions(this);
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the GetPolicyOptions builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the policy.
     *
     * @param policy the policy
     * @return the GetPolicyOptions builder
     */
    public Builder policy(String policy) {
      this.policy = policy;
      return this;
    }
  }

  protected GetPolicyOptions() { }

  protected GetPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
      "secretType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    secretType = builder.secretType;
    id = builder.id;
    policy = builder.policy;
  }

  /**
   * New builder.
   *
   * @return a GetPolicyOptions builder
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

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies the secret.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the policy.
   *
   * The type of policy that is associated with the specified secret.
   *
   * @return the policy
   */
  public String policy() {
    return policy;
  }
}

