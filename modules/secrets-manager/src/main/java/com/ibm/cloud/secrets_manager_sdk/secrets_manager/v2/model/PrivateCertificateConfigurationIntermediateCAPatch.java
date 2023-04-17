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

import java.util.Map;

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * The configuration patch of the intermediate certificate authority.
 */
public class PrivateCertificateConfigurationIntermediateCAPatch extends ConfigurationPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String maxTtl;
    private String crlExpiry;
    private Boolean crlDisable;
    private Boolean crlDistributionPointsEncoded;
    private Boolean issuingCertificatesUrlsEncoded;

    /**
     * Instantiates a new Builder from an existing PrivateCertificateConfigurationIntermediateCAPatch instance.
     *
     * @param privateCertificateConfigurationIntermediateCaPatch the instance to initialize the Builder with
     */
    public Builder(ConfigurationPatch privateCertificateConfigurationIntermediateCaPatch) {
      this.maxTtl = privateCertificateConfigurationIntermediateCaPatch.maxTtl;
      this.crlExpiry = privateCertificateConfigurationIntermediateCaPatch.crlExpiry;
      this.crlDisable = privateCertificateConfigurationIntermediateCaPatch.crlDisable;
      this.crlDistributionPointsEncoded = privateCertificateConfigurationIntermediateCaPatch.crlDistributionPointsEncoded;
      this.issuingCertificatesUrlsEncoded = privateCertificateConfigurationIntermediateCaPatch.issuingCertificatesUrlsEncoded;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrivateCertificateConfigurationIntermediateCAPatch.
     *
     * @return the new PrivateCertificateConfigurationIntermediateCAPatch instance
     */
    public PrivateCertificateConfigurationIntermediateCAPatch build() {
      return new PrivateCertificateConfigurationIntermediateCAPatch(this);
    }

    /**
     * Set the maxTtl.
     *
     * @param maxTtl the maxTtl
     * @return the PrivateCertificateConfigurationIntermediateCAPatch builder
     */
    public Builder maxTtl(String maxTtl) {
      this.maxTtl = maxTtl;
      return this;
    }

    /**
     * Set the crlExpiry.
     *
     * @param crlExpiry the crlExpiry
     * @return the PrivateCertificateConfigurationIntermediateCAPatch builder
     */
    public Builder crlExpiry(String crlExpiry) {
      this.crlExpiry = crlExpiry;
      return this;
    }

    /**
     * Set the crlDisable.
     *
     * @param crlDisable the crlDisable
     * @return the PrivateCertificateConfigurationIntermediateCAPatch builder
     */
    public Builder crlDisable(Boolean crlDisable) {
      this.crlDisable = crlDisable;
      return this;
    }

    /**
     * Set the crlDistributionPointsEncoded.
     *
     * @param crlDistributionPointsEncoded the crlDistributionPointsEncoded
     * @return the PrivateCertificateConfigurationIntermediateCAPatch builder
     */
    public Builder crlDistributionPointsEncoded(Boolean crlDistributionPointsEncoded) {
      this.crlDistributionPointsEncoded = crlDistributionPointsEncoded;
      return this;
    }

    /**
     * Set the issuingCertificatesUrlsEncoded.
     *
     * @param issuingCertificatesUrlsEncoded the issuingCertificatesUrlsEncoded
     * @return the PrivateCertificateConfigurationIntermediateCAPatch builder
     */
    public Builder issuingCertificatesUrlsEncoded(Boolean issuingCertificatesUrlsEncoded) {
      this.issuingCertificatesUrlsEncoded = issuingCertificatesUrlsEncoded;
      return this;
    }
  }

  protected PrivateCertificateConfigurationIntermediateCAPatch() { }

  protected PrivateCertificateConfigurationIntermediateCAPatch(Builder builder) {
    maxTtl = builder.maxTtl;
    crlExpiry = builder.crlExpiry;
    crlDisable = builder.crlDisable;
    crlDistributionPointsEncoded = builder.crlDistributionPointsEncoded;
    issuingCertificatesUrlsEncoded = builder.issuingCertificatesUrlsEncoded;
  }

  /**
   * New builder.
   *
   * @return a PrivateCertificateConfigurationIntermediateCAPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the PrivateCertificateConfigurationIntermediateCAPatch.
   *
   * Note that properties of the PrivateCertificateConfigurationIntermediateCAPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PrivateCertificateConfigurationIntermediateCAPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

