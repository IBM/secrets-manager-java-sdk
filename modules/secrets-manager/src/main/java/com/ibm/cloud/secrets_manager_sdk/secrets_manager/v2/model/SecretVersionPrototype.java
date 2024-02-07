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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Specify the properties for your new secret version.
 *
 * Classes which extend this class:
 * - ArbitrarySecretVersionPrototype
 * - IAMCredentialsSecretRestoreFromVersionPrototype
 * - IAMCredentialsSecretVersionPrototype
 * - ImportedCertificateVersionPrototype
 * - KVSecretVersionPrototype
 * - PrivateCertificateVersionPrototype
 * - PublicCertificateVersionPrototype
 * - ServiceCredentialsSecretVersionPrototype
 * - UsernamePasswordSecretVersionPrototype
 */
public class SecretVersionPrototype extends GenericModel {

  protected String payload;
  @SerializedName("custom_metadata")
  protected Map<String, Object> customMetadata;
  @SerializedName("version_custom_metadata")
  protected Map<String, Object> versionCustomMetadata;
  @SerializedName("restore_from_version")
  protected String restoreFromVersion;
  protected String certificate;
  protected String intermediate;
  @SerializedName("private_key")
  protected String privateKey;
  protected Map<String, Object> data;
  protected String csr;
  protected PublicCertificateRotationObject rotation;
  protected String password;

  protected SecretVersionPrototype() { }

  /**
   * Gets the payload.
   *
   * The secret data that is assigned to an `arbitrary` secret.
   *
   * @return the payload
   */
  public String payload() {
    return payload;
  }

  /**
   * Gets the customMetadata.
   *
   * The secret metadata that a user can customize.
   *
   * @return the customMetadata
   */
  public Map<String, Object> customMetadata() {
    return customMetadata;
  }

  /**
   * Gets the versionCustomMetadata.
   *
   * The secret version metadata that a user can customize.
   *
   * @return the versionCustomMetadata
   */
  public Map<String, Object> versionCustomMetadata() {
    return versionCustomMetadata;
  }

  /**
   * Gets the restoreFromVersion.
   *
   * A v4 UUID identifier, or `current` or `previous` secret version aliases.
   *
   * @return the restoreFromVersion
   */
  public String restoreFromVersion() {
    return restoreFromVersion;
  }

  /**
   * Gets the certificate.
   *
   * Your PEM-encoded certificate. The data must be formatted on a single line with embedded newline characters.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
  }

  /**
   * Gets the intermediate.
   *
   * The PEM-encoded intermediate certificate that is associated with the root certificate. The data must be formatted
   * on a single line with embedded newline characters.
   *
   * @return the intermediate
   */
  public String intermediate() {
    return intermediate;
  }

  /**
   * Gets the privateKey.
   *
   * The PEM-encoded private key that is associated with the certificate. The data must be formatted on a single line
   * with embedded newline characters.
   *
   * @return the privateKey
   */
  public String privateKey() {
    return privateKey;
  }

  /**
   * Gets the data.
   *
   * The payload data of a key-value secret.
   *
   * @return the data
   */
  public Map<String, Object> data() {
    return data;
  }

  /**
   * Gets the csr.
   *
   * The certificate signing request.
   *
   * @return the csr
   */
  public String csr() {
    return csr;
  }

  /**
   * Gets the rotation.
   *
   * Defines the rotation object that is used to manually rotate public certificates.
   *
   * @return the rotation
   */
  public PublicCertificateRotationObject rotation() {
    return rotation;
  }

  /**
   * Gets the password.
   *
   * The password that is assigned to an `username_password` secret. If you omit this parameter, Secrets Manager
   * generates a new random password for your secret.
   *
   * @return the password
   */
  public String password() {
    return password;
  }
}

