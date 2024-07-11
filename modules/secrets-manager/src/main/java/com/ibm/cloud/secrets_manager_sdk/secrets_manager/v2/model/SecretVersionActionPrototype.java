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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The request body to specify the properties of the action to create a secret version.
 *
 * Classes which extend this class:
 * - PrivateCertificateVersionActionRevokePrototype
 */
public class SecretVersionActionPrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "action_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("private_cert_action_revoke_certificate", PrivateCertificateVersionActionRevokePrototype.class);
  }
  /**
   * The type of secret version action.
   */
  public interface ActionType {
    /** private_cert_action_revoke_certificate. */
    String PRIVATE_CERT_ACTION_REVOKE_CERTIFICATE = "private_cert_action_revoke_certificate";
  }

  @SerializedName("action_type")
  protected String actionType;

  protected SecretVersionActionPrototype() { }

  /**
   * Gets the actionType.
   *
   * The type of secret version action.
   *
   * @return the actionType
   */
  public String actionType() {
    return actionType;
  }
}

