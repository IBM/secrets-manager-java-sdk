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
 * The response body of the action to revoke the private certificate.
 */
public class PrivateCertificateActionRevoke extends SecretAction {

  /**
   * The type of secret action.
   */
  public interface ActionType {
    /** public_cert_action_validate_dns_challenge. */
    String PUBLIC_CERT_ACTION_VALIDATE_DNS_CHALLENGE = "public_cert_action_validate_dns_challenge";
    /** private_cert_action_revoke_certificate. */
    String PRIVATE_CERT_ACTION_REVOKE_CERTIFICATE = "private_cert_action_revoke_certificate";
  }


  protected PrivateCertificateActionRevoke() { }
}

