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

/**
 * The request body to specify the properties of the action to revoke the private certificate.
 */
public class PrivateCertificateVersionActionRevokePrototype extends SecretVersionActionPrototype {

  /**
   * The type of secret version action.
   */
  public interface ActionType {
    /** private_cert_action_revoke_certificate. */
    String PRIVATE_CERT_ACTION_REVOKE_CERTIFICATE = "private_cert_action_revoke_certificate";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String actionType;

    /**
     * Instantiates a new Builder from an existing PrivateCertificateVersionActionRevokePrototype instance.
     *
     * @param privateCertificateVersionActionRevokePrototype the instance to initialize the Builder with
     */
    public Builder(SecretVersionActionPrototype privateCertificateVersionActionRevokePrototype) {
      this.actionType = privateCertificateVersionActionRevokePrototype.actionType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actionType the actionType
     */
    public Builder(String actionType) {
      this.actionType = actionType;
    }

    /**
     * Builds a PrivateCertificateVersionActionRevokePrototype.
     *
     * @return the new PrivateCertificateVersionActionRevokePrototype instance
     */
    public PrivateCertificateVersionActionRevokePrototype build() {
      return new PrivateCertificateVersionActionRevokePrototype(this);
    }

    /**
     * Set the actionType.
     *
     * @param actionType the actionType
     * @return the PrivateCertificateVersionActionRevokePrototype builder
     */
    public Builder actionType(String actionType) {
      this.actionType = actionType;
      return this;
    }
  }

  protected PrivateCertificateVersionActionRevokePrototype() { }

  protected PrivateCertificateVersionActionRevokePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actionType,
      "actionType cannot be null");
    actionType = builder.actionType;
  }

  /**
   * New builder.
   *
   * @return a PrivateCertificateVersionActionRevokePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

