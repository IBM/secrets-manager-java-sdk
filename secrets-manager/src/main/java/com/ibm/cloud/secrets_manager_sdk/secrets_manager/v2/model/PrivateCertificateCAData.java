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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The configuration data of your Private Certificate.
 *
 * Classes which extend this class:
 * - PrivateCertificateConfigurationIntermediateCACSR
 * - PrivateCertificateConfigurationCACertificate
 */
public class PrivateCertificateCAData extends GenericModel {

  /**
   * The type of private key to generate.
   */
  public interface PrivateKeyType {
    /** rsa. */
    String RSA = "rsa";
    /** ec. */
    String EC = "ec";
  }

  protected String csr;
  @SerializedName("private_key")
  protected String privateKey;
  @SerializedName("private_key_type")
  protected String privateKeyType;
  protected Long expiration;
  protected String certificate;
  @SerializedName("issuing_ca")
  protected String issuingCa;
  @SerializedName("ca_chain")
  protected List<String> caChain;

  protected PrivateCertificateCAData() { }

  /**
   * Gets the csr.
   *
   * The certificate signing request.
   *
   * @return the csr
   */
  public String getCsr() {
    return csr;
  }

  /**
   * Gets the privateKey.
   *
   * The PEM-encoded private key that is associated with the certificate. The data must be formatted on a single line
   * with embedded newline characters.
   *
   * @return the privateKey
   */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * Gets the privateKeyType.
   *
   * The type of private key to generate.
   *
   * @return the privateKeyType
   */
  public String getPrivateKeyType() {
    return privateKeyType;
  }

  /**
   * Gets the expiration.
   *
   * The certificate expiration time.
   *
   * @return the expiration
   */
  public Long getExpiration() {
    return expiration;
  }

  /**
   * Gets the certificate.
   *
   * Your PEM-encoded certificate. The data must be formatted on a single line with embedded newline characters.
   *
   * @return the certificate
   */
  public String getCertificate() {
    return certificate;
  }

  /**
   * Gets the issuingCa.
   *
   * The PEM-encoded certificate of the certificate authority that signed and issued this certificate.
   *
   * @return the issuingCa
   */
  public String getIssuingCa() {
    return issuingCa;
  }

  /**
   * Gets the caChain.
   *
   * The chain of certificate authorities that are associated with the certificate.
   *
   * @return the caChain
   */
  public List<String> getCaChain() {
    return caChain;
  }
}

