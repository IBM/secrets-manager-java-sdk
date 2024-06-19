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

/**
 * PrivateCertificateVersionPrototype.
 */
public class PrivateCertificateVersionPrototype extends SecretVersionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> customMetadata;
    private Map<String, Object> versionCustomMetadata;
    private String csr;

    /**
     * Instantiates a new Builder from an existing PrivateCertificateVersionPrototype instance.
     *
     * @param privateCertificateVersionPrototype the instance to initialize the Builder with
     */
    public Builder(SecretVersionPrototype privateCertificateVersionPrototype) {
      this.customMetadata = privateCertificateVersionPrototype.customMetadata;
      this.versionCustomMetadata = privateCertificateVersionPrototype.versionCustomMetadata;
      this.csr = privateCertificateVersionPrototype.csr;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrivateCertificateVersionPrototype.
     *
     * @return the new PrivateCertificateVersionPrototype instance
     */
    public PrivateCertificateVersionPrototype build() {
      return new PrivateCertificateVersionPrototype(this);
    }

    /**
     * Set the customMetadata.
     *
     * @param customMetadata the customMetadata
     * @return the PrivateCertificateVersionPrototype builder
     */
    public Builder customMetadata(Map<String, Object> customMetadata) {
      this.customMetadata = customMetadata;
      return this;
    }

    /**
     * Set the versionCustomMetadata.
     *
     * @param versionCustomMetadata the versionCustomMetadata
     * @return the PrivateCertificateVersionPrototype builder
     */
    public Builder versionCustomMetadata(Map<String, Object> versionCustomMetadata) {
      this.versionCustomMetadata = versionCustomMetadata;
      return this;
    }

    /**
     * Set the csr.
     *
     * @param csr the csr
     * @return the PrivateCertificateVersionPrototype builder
     */
    public Builder csr(String csr) {
      this.csr = csr;
      return this;
    }
  }

  protected PrivateCertificateVersionPrototype() { }

  protected PrivateCertificateVersionPrototype(Builder builder) {
    customMetadata = builder.customMetadata;
    versionCustomMetadata = builder.versionCustomMetadata;
    csr = builder.csr;
  }

  /**
   * New builder.
   *
   * @return a PrivateCertificateVersionPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

