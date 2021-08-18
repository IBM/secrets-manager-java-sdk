/*
 * (C) Copyright IBM Corp. 2021.
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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * CertificateValidity.
 */
public class CertificateValidity extends GenericModel {

  @SerializedName("not_before")
  protected Date notBefore;
  @SerializedName("not_after")
  protected Date notAfter;

  /**
   * Builder.
   */
  public static class Builder {
    private Date notBefore;
    private Date notAfter;

    private Builder(CertificateValidity certificateValidity) {
      this.notBefore = certificateValidity.notBefore;
      this.notAfter = certificateValidity.notAfter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CertificateValidity.
     *
     * @return the new CertificateValidity instance
     */
    public CertificateValidity build() {
      return new CertificateValidity(this);
    }

    /**
     * Set the notBefore.
     *
     * @param notBefore the notBefore
     * @return the CertificateValidity builder
     */
    public Builder notBefore(Date notBefore) {
      this.notBefore = notBefore;
      return this;
    }

    /**
     * Set the notAfter.
     *
     * @param notAfter the notAfter
     * @return the CertificateValidity builder
     */
    public Builder notAfter(Date notAfter) {
      this.notAfter = notAfter;
      return this;
    }
  }

  protected CertificateValidity(Builder builder) {
    notBefore = builder.notBefore;
    notAfter = builder.notAfter;
  }

  /**
   * New builder.
   *
   * @return a CertificateValidity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the notBefore.
   *
   * The date the certificate validity period begins.
   *
   * @return the notBefore
   */
  public Date notBefore() {
    return notBefore;
  }

  /**
   * Gets the notAfter.
   *
   * The date the certificate validity period ends.
   *
   * @return the notAfter
   */
  public Date notAfter() {
    return notAfter;
  }
}

