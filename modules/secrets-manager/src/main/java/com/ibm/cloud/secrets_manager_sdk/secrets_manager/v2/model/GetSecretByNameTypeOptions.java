/*
 * (C) Copyright IBM Corp. 2024.
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
 * The getSecretByNameType options.
 */
public class GetSecretByNameTypeOptions extends GenericModel {

  /**
   * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
   * service_credentials, kv, and username_password.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** kv. */
    String KV = "kv";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** service_credentials. */
    String SERVICE_CREDENTIALS = "service_credentials";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
  }

  protected String secretType;
  protected String name;
  protected String secretGroupName;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;
    private String name;
    private String secretGroupName;

    /**
     * Instantiates a new Builder from an existing GetSecretByNameTypeOptions instance.
     *
     * @param getSecretByNameTypeOptions the instance to initialize the Builder with
     */
    private Builder(GetSecretByNameTypeOptions getSecretByNameTypeOptions) {
      this.secretType = getSecretByNameTypeOptions.secretType;
      this.name = getSecretByNameTypeOptions.name;
      this.secretGroupName = getSecretByNameTypeOptions.secretGroupName;
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
     * @param name the name
     * @param secretGroupName the secretGroupName
     */
    public Builder(String secretType, String name, String secretGroupName) {
      this.secretType = secretType;
      this.name = name;
      this.secretGroupName = secretGroupName;
    }

    /**
     * Builds a GetSecretByNameTypeOptions.
     *
     * @return the new GetSecretByNameTypeOptions instance
     */
    public GetSecretByNameTypeOptions build() {
      return new GetSecretByNameTypeOptions(this);
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the GetSecretByNameTypeOptions builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GetSecretByNameTypeOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the secretGroupName.
     *
     * @param secretGroupName the secretGroupName
     * @return the GetSecretByNameTypeOptions builder
     */
    public Builder secretGroupName(String secretGroupName) {
      this.secretGroupName = secretGroupName;
      return this;
    }
  }

  protected GetSecretByNameTypeOptions() { }

  protected GetSecretByNameTypeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
      "secretType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretGroupName,
      "secretGroupName cannot be empty");
    secretType = builder.secretType;
    name = builder.name;
    secretGroupName = builder.secretGroupName;
  }

  /**
   * New builder.
   *
   * @return a GetSecretByNameTypeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secretType.
   *
   * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
   * service_credentials, kv, and username_password.
   *
   * @return the secretType
   */
  public String secretType() {
    return secretType;
  }

  /**
   * Gets the name.
   *
   * A human-readable name to assign to your secret. To protect your privacy, do not use personal data, such as your
   * name or location, as a name for your secret.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the secretGroupName.
   *
   * The name of your secret group.
   *
   * @return the secretGroupName
   */
  public String secretGroupName() {
    return secretGroupName;
  }
}

