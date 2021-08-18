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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

/**
 * The request body of a `rotate` action.
 */
public class RotateUsernamePasswordSecretBody extends SecretAction {


  /**
   * Builder.
   */
  public static class Builder {
    private String password;

    public Builder(SecretAction rotateUsernamePasswordSecretBody) {
      this.password = rotateUsernamePasswordSecretBody.password;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param password the password
     */
    public Builder(String password) {
      this.password = password;
    }

    /**
     * Builds a RotateUsernamePasswordSecretBody.
     *
     * @return the new RotateUsernamePasswordSecretBody instance
     */
    public RotateUsernamePasswordSecretBody build() {
      return new RotateUsernamePasswordSecretBody(this);
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the RotateUsernamePasswordSecretBody builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }
  }

  protected RotateUsernamePasswordSecretBody(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    password = builder.password;
  }

  /**
   * New builder.
   *
   * @return a RotateUsernamePasswordSecretBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

