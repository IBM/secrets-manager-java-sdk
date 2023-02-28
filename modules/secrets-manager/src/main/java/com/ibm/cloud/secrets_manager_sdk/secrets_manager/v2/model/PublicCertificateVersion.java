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
 * Versions of your public certificate.
 */
public class PublicCertificateVersion extends SecretVersion {

  /**
   * The secret type. Supported types are arbitrary, certificates (imported, public, and private), IAM credentials,
   * key-value, and user credentials.
   */
  public interface SecretType {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** kv. */
    String KV = "kv";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
  }

  /**
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   */
  public interface Alias {
    /** current. */
    String CURRENT = "current";
    /** previous. */
    String PREVIOUS = "previous";
  }


  protected PublicCertificateVersion() { }
}

