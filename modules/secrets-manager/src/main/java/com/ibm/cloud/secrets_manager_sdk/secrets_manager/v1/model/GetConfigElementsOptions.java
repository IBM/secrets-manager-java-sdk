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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getConfigElements options.
 */
public class GetConfigElementsOptions extends GenericModel {

  /**
   * The secret type.
   */
  public interface SecretType {
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
  }

  /**
   * The configuration element to define or manage.
   */
  public interface ConfigElement {
    /** certificate_authorities. */
    String CERTIFICATE_AUTHORITIES = "certificate_authorities";
    /** dns_providers. */
    String DNS_PROVIDERS = "dns_providers";
    /** root_certificate_authorities. */
    String ROOT_CERTIFICATE_AUTHORITIES = "root_certificate_authorities";
    /** intermediate_certificate_authorities. */
    String INTERMEDIATE_CERTIFICATE_AUTHORITIES = "intermediate_certificate_authorities";
    /** certificate_templates. */
    String CERTIFICATE_TEMPLATES = "certificate_templates";
  }

  protected String secretType;
  protected String configElement;

  /**
   * Builder.
   */
  public static class Builder {
    private String secretType;
    private String configElement;

    /**
     * Instantiates a new Builder from an existing GetConfigElementsOptions instance.
     *
     * @param getConfigElementsOptions the instance to initialize the Builder with
     */
    private Builder(GetConfigElementsOptions getConfigElementsOptions) {
      this.secretType = getConfigElementsOptions.secretType;
      this.configElement = getConfigElementsOptions.configElement;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param secretType the secretType
     * @param configElement the configElement
     */
    public Builder(String secretType, String configElement) {
      this.secretType = secretType;
      this.configElement = configElement;
    }

    /**
     * Builds a GetConfigElementsOptions.
     *
     * @return the new GetConfigElementsOptions instance
     */
    public GetConfigElementsOptions build() {
      return new GetConfigElementsOptions(this);
    }

    /**
     * Set the secretType.
     *
     * @param secretType the secretType
     * @return the GetConfigElementsOptions builder
     */
    public Builder secretType(String secretType) {
      this.secretType = secretType;
      return this;
    }

    /**
     * Set the configElement.
     *
     * @param configElement the configElement
     * @return the GetConfigElementsOptions builder
     */
    public Builder configElement(String configElement) {
      this.configElement = configElement;
      return this;
    }
  }

  protected GetConfigElementsOptions() { }

  protected GetConfigElementsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secretType,
      "secretType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.configElement,
      "configElement cannot be empty");
    secretType = builder.secretType;
    configElement = builder.configElement;
  }

  /**
   * New builder.
   *
   * @return a GetConfigElementsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secretType.
   *
   * The secret type.
   *
   * @return the secretType
   */
  public String secretType() {
    return secretType;
  }

  /**
   * Gets the configElement.
   *
   * The configuration element to define or manage.
   *
   * @return the configElement
   */
  public String configElement() {
    return configElement;
  }
}

