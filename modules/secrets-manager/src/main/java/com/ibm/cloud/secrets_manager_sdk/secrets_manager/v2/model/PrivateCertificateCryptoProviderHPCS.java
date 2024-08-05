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
 * The data that is associated with Hyper Protect Crypto Services as the cryptographic provider.
 */
public class PrivateCertificateCryptoProviderHPCS extends PrivateCertificateCryptoProvider {

  /**
   * The type of cryptographic provider.
   */
  public interface Type {
    /** hyper_protect_crypto_services. */
    String HYPER_PROTECT_CRYPTO_SERVICES = "hyper_protect_crypto_services";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String instanceCrn;
    private String pinIamCredentialsSecretId;
    private String privateKeystoreId;

    /**
     * Instantiates a new Builder from an existing PrivateCertificateCryptoProviderHPCS instance.
     *
     * @param privateCertificateCryptoProviderHpcs the instance to initialize the Builder with
     */
    public Builder(PrivateCertificateCryptoProvider privateCertificateCryptoProviderHpcs) {
      this.type = privateCertificateCryptoProviderHpcs.type;
      this.instanceCrn = privateCertificateCryptoProviderHpcs.instanceCrn;
      this.pinIamCredentialsSecretId = privateCertificateCryptoProviderHpcs.pinIamCredentialsSecretId;
      this.privateKeystoreId = privateCertificateCryptoProviderHpcs.privateKeystoreId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param instanceCrn the instanceCrn
     * @param pinIamCredentialsSecretId the pinIamCredentialsSecretId
     * @param privateKeystoreId the privateKeystoreId
     */
    public Builder(String type, String instanceCrn, String pinIamCredentialsSecretId, String privateKeystoreId) {
      this.type = type;
      this.instanceCrn = instanceCrn;
      this.pinIamCredentialsSecretId = pinIamCredentialsSecretId;
      this.privateKeystoreId = privateKeystoreId;
    }

    /**
     * Builds a PrivateCertificateCryptoProviderHPCS.
     *
     * @return the new PrivateCertificateCryptoProviderHPCS instance
     */
    public PrivateCertificateCryptoProviderHPCS build() {
      return new PrivateCertificateCryptoProviderHPCS(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the PrivateCertificateCryptoProviderHPCS builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the instanceCrn.
     *
     * @param instanceCrn the instanceCrn
     * @return the PrivateCertificateCryptoProviderHPCS builder
     */
    public Builder instanceCrn(String instanceCrn) {
      this.instanceCrn = instanceCrn;
      return this;
    }

    /**
     * Set the pinIamCredentialsSecretId.
     *
     * @param pinIamCredentialsSecretId the pinIamCredentialsSecretId
     * @return the PrivateCertificateCryptoProviderHPCS builder
     */
    public Builder pinIamCredentialsSecretId(String pinIamCredentialsSecretId) {
      this.pinIamCredentialsSecretId = pinIamCredentialsSecretId;
      return this;
    }

    /**
     * Set the privateKeystoreId.
     *
     * @param privateKeystoreId the privateKeystoreId
     * @return the PrivateCertificateCryptoProviderHPCS builder
     */
    public Builder privateKeystoreId(String privateKeystoreId) {
      this.privateKeystoreId = privateKeystoreId;
      return this;
    }
  }

  protected PrivateCertificateCryptoProviderHPCS() { }

  protected PrivateCertificateCryptoProviderHPCS(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceCrn,
      "instanceCrn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pinIamCredentialsSecretId,
      "pinIamCredentialsSecretId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.privateKeystoreId,
      "privateKeystoreId cannot be null");
    type = builder.type;
    instanceCrn = builder.instanceCrn;
    pinIamCredentialsSecretId = builder.pinIamCredentialsSecretId;
    privateKeystoreId = builder.privateKeystoreId;
  }

  /**
   * New builder.
   *
   * @return a PrivateCertificateCryptoProviderHPCS builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

