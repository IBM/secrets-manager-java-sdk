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
 * The configuration update of the Let's Encrypt Certificate Authority.
 */
public class PublicCertificateConfigurationCALetsEncryptPatch extends ConfigurationPatch {

  /**
   * The configuration of the Let's Encrypt CA environment.
   */
  public interface LetsEncryptEnvironment {
    /** production. */
    String PRODUCTION = "production";
    /** staging. */
    String STAGING = "staging";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String letsEncryptEnvironment;
    private String letsEncryptPrivateKey;
    private String letsEncryptPreferredChain;

    /**
     * Instantiates a new Builder from an existing PublicCertificateConfigurationCALetsEncryptPatch instance.
     *
     * @param publicCertificateConfigurationCaLetsEncryptPatch the instance to initialize the Builder with
     */
    public Builder(ConfigurationPatch publicCertificateConfigurationCaLetsEncryptPatch) {
      this.letsEncryptEnvironment = publicCertificateConfigurationCaLetsEncryptPatch.letsEncryptEnvironment;
      this.letsEncryptPrivateKey = publicCertificateConfigurationCaLetsEncryptPatch.letsEncryptPrivateKey;
      this.letsEncryptPreferredChain = publicCertificateConfigurationCaLetsEncryptPatch.letsEncryptPreferredChain;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param letsEncryptEnvironment the letsEncryptEnvironment
     */
    public Builder(String letsEncryptEnvironment) {
      this.letsEncryptEnvironment = letsEncryptEnvironment;
    }

    /**
     * Builds a PublicCertificateConfigurationCALetsEncryptPatch.
     *
     * @return the new PublicCertificateConfigurationCALetsEncryptPatch instance
     */
    public PublicCertificateConfigurationCALetsEncryptPatch build() {
      return new PublicCertificateConfigurationCALetsEncryptPatch(this);
    }

    /**
     * Set the letsEncryptEnvironment.
     *
     * @param letsEncryptEnvironment the letsEncryptEnvironment
     * @return the PublicCertificateConfigurationCALetsEncryptPatch builder
     */
    public Builder letsEncryptEnvironment(String letsEncryptEnvironment) {
      this.letsEncryptEnvironment = letsEncryptEnvironment;
      return this;
    }

    /**
     * Set the letsEncryptPrivateKey.
     *
     * @param letsEncryptPrivateKey the letsEncryptPrivateKey
     * @return the PublicCertificateConfigurationCALetsEncryptPatch builder
     */
    public Builder letsEncryptPrivateKey(String letsEncryptPrivateKey) {
      this.letsEncryptPrivateKey = letsEncryptPrivateKey;
      return this;
    }

    /**
     * Set the letsEncryptPreferredChain.
     *
     * @param letsEncryptPreferredChain the letsEncryptPreferredChain
     * @return the PublicCertificateConfigurationCALetsEncryptPatch builder
     */
    public Builder letsEncryptPreferredChain(String letsEncryptPreferredChain) {
      this.letsEncryptPreferredChain = letsEncryptPreferredChain;
      return this;
    }
  }

  protected PublicCertificateConfigurationCALetsEncryptPatch() { }

  protected PublicCertificateConfigurationCALetsEncryptPatch(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.letsEncryptEnvironment,
      "letsEncryptEnvironment cannot be null");
    letsEncryptEnvironment = builder.letsEncryptEnvironment;
    letsEncryptPrivateKey = builder.letsEncryptPrivateKey;
    letsEncryptPreferredChain = builder.letsEncryptPreferredChain;
  }

  /**
   * New builder.
   *
   * @return a PublicCertificateConfigurationCALetsEncryptPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the PublicCertificateConfigurationCALetsEncryptPatch.
   *
   * Note that properties of the PublicCertificateConfigurationCALetsEncryptPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PublicCertificateConfigurationCALetsEncryptPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

