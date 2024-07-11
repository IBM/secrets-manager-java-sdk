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

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * The configuration update of the Cloud Internet Services DNS.
 */
public class PublicCertificateConfigurationDNSCloudInternetServicesPatch extends ConfigurationPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String cloudInternetServicesApikey;
    private String cloudInternetServicesCrn;

    /**
     * Instantiates a new Builder from an existing PublicCertificateConfigurationDNSCloudInternetServicesPatch instance.
     *
     * @param publicCertificateConfigurationDnsCloudInternetServicesPatch the instance to initialize the Builder with
     */
    public Builder(ConfigurationPatch publicCertificateConfigurationDnsCloudInternetServicesPatch) {
      this.cloudInternetServicesApikey = publicCertificateConfigurationDnsCloudInternetServicesPatch.cloudInternetServicesApikey;
      this.cloudInternetServicesCrn = publicCertificateConfigurationDnsCloudInternetServicesPatch.cloudInternetServicesCrn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cloudInternetServicesApikey the cloudInternetServicesApikey
     */
    public Builder(String cloudInternetServicesApikey) {
      this.cloudInternetServicesApikey = cloudInternetServicesApikey;
    }

    /**
     * Builds a PublicCertificateConfigurationDNSCloudInternetServicesPatch.
     *
     * @return the new PublicCertificateConfigurationDNSCloudInternetServicesPatch instance
     */
    public PublicCertificateConfigurationDNSCloudInternetServicesPatch build() {
      return new PublicCertificateConfigurationDNSCloudInternetServicesPatch(this);
    }

    /**
     * Set the cloudInternetServicesApikey.
     *
     * @param cloudInternetServicesApikey the cloudInternetServicesApikey
     * @return the PublicCertificateConfigurationDNSCloudInternetServicesPatch builder
     */
    public Builder cloudInternetServicesApikey(String cloudInternetServicesApikey) {
      this.cloudInternetServicesApikey = cloudInternetServicesApikey;
      return this;
    }

    /**
     * Set the cloudInternetServicesCrn.
     *
     * @param cloudInternetServicesCrn the cloudInternetServicesCrn
     * @return the PublicCertificateConfigurationDNSCloudInternetServicesPatch builder
     */
    public Builder cloudInternetServicesCrn(String cloudInternetServicesCrn) {
      this.cloudInternetServicesCrn = cloudInternetServicesCrn;
      return this;
    }
  }

  protected PublicCertificateConfigurationDNSCloudInternetServicesPatch() { }

  protected PublicCertificateConfigurationDNSCloudInternetServicesPatch(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cloudInternetServicesApikey,
      "cloudInternetServicesApikey cannot be null");
    cloudInternetServicesApikey = builder.cloudInternetServicesApikey;
    cloudInternetServicesCrn = builder.cloudInternetServicesCrn;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateConfigurationDNSCloudInternetServicesPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the PublicCertificateConfigurationDNSCloudInternetServicesPatch.
   *
   * Note that properties of the PublicCertificateConfigurationDNSCloudInternetServicesPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PublicCertificateConfigurationDNSCloudInternetServicesPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

