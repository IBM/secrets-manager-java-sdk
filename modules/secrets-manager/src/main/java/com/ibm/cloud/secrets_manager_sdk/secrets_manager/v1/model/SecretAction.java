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
import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretAction.
 *
 * Classes which extend this class:
 * - RotateArbitrarySecretBody
 * - RotatePublicCertBody
 * - RotateUsernamePasswordSecretBody
 * - RotateCertificateBody
 * - RestoreIAMCredentialsSecretBody
 * - DeleteCredentialsForIAMCredentialsSecret
 * - RotateKvSecretBody
 */
public class SecretAction extends GenericModel {

  protected String payload;
  @SerializedName("rotate_keys")
  protected Boolean rotateKeys;
  protected String password;
  protected String certificate;
  @SerializedName("private_key")
  protected String privateKey;
  protected String intermediate;
  @SerializedName("version_id")
  protected String versionId;
  @SerializedName("api_key_id")
  protected String apiKeyId;
  @SerializedName("service_id")
  protected String serviceId;

  protected SecretAction() {
  }

  /**
   * Gets the payload.
   *
   * The new secret data to assign to an `arbitrary` secret.
   *
   * @return the payload
   */
  public String payload() {
    return payload;
  }

  /**
   * Gets the rotateKeys.
   *
   * Determine whether keys must be rotated.
   *
   * @return the rotateKeys
   */
  public Boolean rotateKeys() {
    return rotateKeys;
  }

  /**
   * Gets the password.
   *
   * The new password to assign to a `username_password` secret.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the certificate.
   *
   * The new data to associate with the certificate.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
  }

  /**
   * Gets the privateKey.
   *
   * The new private key to associate with the certificate.
   *
   * @return the privateKey
   */
  public String privateKey() {
    return privateKey;
  }

  /**
   * Gets the intermediate.
   *
   * The new intermediate certificate to associate with the certificate.
   *
   * @return the intermediate
   */
  public String intermediate() {
    return intermediate;
  }

  /**
   * Gets the versionId.
   *
   * The ID of the target version or the alias `previous`.
   *
   * @return the versionId
   */
  public String versionId() {
    return versionId;
  }

  /**
   * Gets the apiKeyId.
   *
   * The ID of the API key that you want to delete. If the secret was created with a static service ID, only the API key
   * is deleted. Otherwise, the service ID is deleted together with its API key.
   *
   * @return the apiKeyId
   */
  public String apiKeyId() {
    return apiKeyId;
  }

  /**
   * Gets the serviceId.
   *
   * The service ID that you want to delete. This property can be used instead of the `api_key_id` field, but only for
   * secrets that were created with a service ID that was generated by Secrets Manager.
   *
   * **Deprecated.** Use the `api_key_id` field instead.
   *
   * @return the serviceId
   */
  public String serviceId() {
    return serviceId;
  }
}

