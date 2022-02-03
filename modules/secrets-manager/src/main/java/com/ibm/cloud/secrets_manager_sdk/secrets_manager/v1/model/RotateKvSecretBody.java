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

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * The request body of a `rotate` action.
 */
public class RotateKvSecretBody extends SecretAction {


  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> payload;

    public Builder(SecretAction rotateKvSecretBody) throws Exception {
      this.payload = new ObjectMapper().readValue(rotateKvSecretBody.payload, Map.class);
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
    public Builder(Map<String, Object> payload) {
      this.payload = payload;
    }

    /**
     * Builds a RotateKvSecretBody.
     *
     * @return the new RotateKvSecretBody instance
     */
    public RotateKvSecretBody build() throws Exception {
      return new RotateKvSecretBody(this);
    }

    /**
     * Set the payload.
     *
     * @param payload the payload
     * @return the RotateKvSecretBody builder
     */
    public Builder payload(Map<String, Object> payload) {
      this.payload = payload;
      return this;
    }
  }

  protected RotateKvSecretBody(Builder builder) {
    ObjectMapper mapper = new ObjectMapper();
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.payload,
      "payload cannot be null");
    payload = builder.payload.toString();
  }

  /**
   * New builder.
   *
   * @return a RotateKvSecretBody builder
   */
  public Builder newBuilder() throws Exception {
    return new Builder(this);
  }
}

