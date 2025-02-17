/*
 * (C) Copyright IBM Corp. 2025.
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
 * The data that is associated with a cryptographic provider.
 *
 * Classes which extend this class:
 * - PrivateCertificateCryptoProviderHPCS
 */
public class PrivateCertificateCryptoProvider extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("hyper_protect_crypto_services", PrivateCertificateCryptoProviderHPCS.class);
  }
  /**
   * The type of cryptographic provider.
   */
  public interface Type {
    /** hyper_protect_crypto_services. */
    String HYPER_PROTECT_CRYPTO_SERVICES = "hyper_protect_crypto_services";
  }

  protected String type;
  @SerializedName("instance_crn")
  protected String instanceCrn;
  @SerializedName("pin_iam_credentials_secret_id")
  protected String pinIamCredentialsSecretId;
  @SerializedName("private_keystore_id")
  protected String privateKeystoreId;

  protected PrivateCertificateCryptoProvider() { }

  /**
   * Gets the type.
   *
   * The type of cryptographic provider.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the instanceCrn.
   *
   * The HPCS instance CRN.
   *
   * @return the instanceCrn
   */
  public String instanceCrn() {
    return instanceCrn;
  }

  /**
   * Gets the pinIamCredentialsSecretId.
   *
   * The secret Id of iam credentials with api key to access HPCS instance.
   *
   * @return the pinIamCredentialsSecretId
   */
  public String pinIamCredentialsSecretId() {
    return pinIamCredentialsSecretId;
  }

  /**
   * Gets the privateKeystoreId.
   *
   * The HPCS private key store space id.
   *
   * @return the privateKeystoreId
   */
  public String privateKeystoreId() {
    return privateKeystoreId;
  }
}

