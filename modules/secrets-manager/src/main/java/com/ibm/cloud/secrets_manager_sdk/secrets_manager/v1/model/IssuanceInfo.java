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
 * Public certificate issuance info.
 */
public class IssuanceInfo extends GenericModel {

  @SerializedName("ordered_on")
  protected Date orderedOn;
  @SerializedName("error_code")
  protected String errorCode;
  @SerializedName("error_message")
  protected String errorMessage;
  @SerializedName("bundle_certs")
  protected Boolean bundleCerts;
  protected Long state;
  @SerializedName("state_description")
  protected String stateDescription;
  @SerializedName("auto_rotated")
  protected Boolean autoRotated;
  protected String ca;
  protected String dns;

  /**
   * Builder.
   */
  public static class Builder {

    private Builder(IssuanceInfo issuanceInfo) {
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IssuanceInfo.
     *
     * @return the new IssuanceInfo instance
     */
    public IssuanceInfo build() {
      return new IssuanceInfo(this);
    }
  }

  protected IssuanceInfo(Builder builder) {
  }

  /**
   * New builder.
   *
   * @return a IssuanceInfo builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the orderedOn.
   *
   * The date the certificate was ordered. The date format follows RFC 3339.
   *
   * @return the orderedOn
   */
  public Date orderedOn() {
    return orderedOn;
  }

  /**
   * Gets the errorCode.
   *
   * The issuance info error code.
   *
   * @return the errorCode
   */
  public String errorCode() {
    return errorCode;
  }

  /**
   * Gets the errorMessage.
   *
   * The issuance info error message.
   *
   * @return the errorMessage
   */
  public String errorMessage() {
    return errorMessage;
  }

  /**
   * Gets the bundleCerts.
   *
   * @return the bundleCerts
   */
  public Boolean bundleCerts() {
    return bundleCerts;
  }

  /**
   * Gets the state.
   *
   * The secret state based on NIST SP 800-57. States are integers and correspond to the Pre-activation = 0, Active = 1,
   *  Suspended = 2, Deactivated = 3, and Destroyed = 5 values.
   *
   * @return the state
   */
  public Long state() {
    return state;
  }

  /**
   * Gets the stateDescription.
   *
   * A text representation of the secret state.
   *
   * @return the stateDescription
   */
  public String stateDescription() {
    return stateDescription;
  }

  /**
   * Gets the autoRotated.
   *
   * @return the autoRotated
   */
  public Boolean autoRotated() {
    return autoRotated;
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public String ca() {
    return ca;
  }

  /**
   * Gets the dns.
   *
   * @return the dns
   */
  public String dns() {
    return dns;
  }
}

