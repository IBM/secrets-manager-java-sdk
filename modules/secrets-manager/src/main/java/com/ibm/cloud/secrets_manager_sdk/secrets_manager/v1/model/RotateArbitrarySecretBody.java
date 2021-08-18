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
public class RotateArbitrarySecretBody extends SecretAction {


  /**
   * Builder.
   */
  public static class Builder {
    private String payload;

    public Builder(SecretAction rotateArbitrarySecretBody) {
      this.payload = rotateArbitrarySecretBody.payload;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param payload the payload
     */
    public Builder(String payload) {
      this.payload = payload;
    }

    /**
     * Builds a RotateArbitrarySecretBody.
     *
     * @return the new RotateArbitrarySecretBody instance
     */
    public RotateArbitrarySecretBody build() {
      return new RotateArbitrarySecretBody(this);
    }

    /**
     * Set the payload.
     *
     * @param payload the payload
     * @return the RotateArbitrarySecretBody builder
     */
    public Builder payload(String payload) {
      this.payload = payload;
      return this;
    }
  }

  protected RotateArbitrarySecretBody(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.payload,
      "payload cannot be null");
    payload = builder.payload;
  }

  /**
   * New builder.
   *
   * @return a RotateArbitrarySecretBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

