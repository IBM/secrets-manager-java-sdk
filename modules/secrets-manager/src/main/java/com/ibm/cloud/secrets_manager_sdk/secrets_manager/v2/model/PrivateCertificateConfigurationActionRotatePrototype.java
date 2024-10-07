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

/**
 * The request body to specify the properties of the action to rotate the private certificate configuration.
 */
public class PrivateCertificateConfigurationActionRotatePrototype extends ConfigurationActionPrototype {

  /**
   * The type of configuration action.
   */
  public interface ActionType {
    /** private_cert_configuration_action_rotate_crl. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_ROTATE_CRL = "private_cert_configuration_action_rotate_crl";
    /** private_cert_configuration_action_sign_intermediate. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_SIGN_INTERMEDIATE = "private_cert_configuration_action_sign_intermediate";
    /** private_cert_configuration_action_sign_csr. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_SIGN_CSR = "private_cert_configuration_action_sign_csr";
    /** private_cert_configuration_action_set_signed. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_SET_SIGNED = "private_cert_configuration_action_set_signed";
    /** private_cert_configuration_action_revoke_ca_certificate. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_REVOKE_CA_CERTIFICATE = "private_cert_configuration_action_revoke_ca_certificate";
    /** private_cert_configuration_action_rotate_intermediate. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_ROTATE_INTERMEDIATE = "private_cert_configuration_action_rotate_intermediate";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String actionType;

    /**
     * Instantiates a new Builder from an existing PrivateCertificateConfigurationActionRotatePrototype instance.
     *
     * @param privateCertificateConfigurationActionRotatePrototype the instance to initialize the Builder with
     */
    public Builder(ConfigurationActionPrototype privateCertificateConfigurationActionRotatePrototype) {
      this.actionType = privateCertificateConfigurationActionRotatePrototype.actionType;
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
     * Builds a PrivateCertificateConfigurationActionRotatePrototype.
     *
     * @return the new PrivateCertificateConfigurationActionRotatePrototype instance
     */
    public PrivateCertificateConfigurationActionRotatePrototype build() {
      return new PrivateCertificateConfigurationActionRotatePrototype(this);
    }

    /**
     * Set the actionType.
     *
     * @param actionType the actionType
     * @return the PrivateCertificateConfigurationActionRotatePrototype builder
     */
    public Builder actionType(String actionType) {
      this.actionType = actionType;
      return this;
    }
  }

  protected PrivateCertificateConfigurationActionRotatePrototype() { }

  protected PrivateCertificateConfigurationActionRotatePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actionType,
      "actionType cannot be null");
    actionType = builder.actionType;
  }

  /**
   * New builder.
   *
   * @return a PrivateCertificateConfigurationActionRotatePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

