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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Issuance information that is associated with your certificate.
 */
public class CertificateIssuanceInfo extends GenericModel {

  /**
   * A text representation of the secret state.
   */
  public interface StateDescription {
    /** pre_activation. */
    String PRE_ACTIVATION = "pre_activation";
    /** active. */
    String ACTIVE = "active";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** deactivated. */
    String DEACTIVATED = "deactivated";
    /** destroyed. */
    String DESTROYED = "destroyed";
  }

  @SerializedName("auto_rotated")
  protected Boolean autoRotated;
  protected List<ChallengeResource> challenges;
  @SerializedName("dns_challenge_validation_time")
  protected Date dnsChallengeValidationTime;
  @SerializedName("error_code")
  protected String errorCode;
  @SerializedName("error_message")
  protected String errorMessage;
  @SerializedName("ordered_on")
  protected Date orderedOn;
  protected Long state;
  @SerializedName("state_description")
  protected String stateDescription;

  protected CertificateIssuanceInfo() { }

  /**
   * Gets the autoRotated.
   *
   * This parameter indicates whether the issued certificate is configured with an automatic rotation policy.
   *
   * @return the autoRotated
   */
  public Boolean isAutoRotated() {
    return autoRotated;
  }

  /**
   * Gets the challenges.
   *
   * The set of challenges. It is returned only when ordering public certificates by using manual DNS configuration.
   *
   * @return the challenges
   */
  public List<ChallengeResource> getChallenges() {
    return challenges;
  }

  /**
   * Gets the dnsChallengeValidationTime.
   *
   * The date that a user requests to validate DNS challenges for certificates that are ordered with a manual DNS
   * provider. The date format follows `RFC 3339`.
   *
   * @return the dnsChallengeValidationTime
   */
  public Date getDnsChallengeValidationTime() {
    return dnsChallengeValidationTime;
  }

  /**
   * Gets the errorCode.
   *
   * A code that identifies an issuance error.
   *
   * This field, along with `error_message`, is returned when Secrets Manager successfully processes your request, but
   * the certificate authority is unable to issue a certificate.
   *
   * @return the errorCode
   */
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * Gets the errorMessage.
   *
   * A human-readable message that provides details about the issuance error.
   *
   * @return the errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Gets the orderedOn.
   *
   * The date when the certificate is ordered. The date format follows `RFC 3339`.
   *
   * @return the orderedOn
   */
  public Date getOrderedOn() {
    return orderedOn;
  }

  /**
   * Gets the state.
   *
   * The secret state that is based on `NIST SP 800-57`. States are integers and correspond to the `Pre-activation = 0`,
   * `Active = 1`,  `Suspended = 2`, `Deactivated = 3`, and `Destroyed = 5` values.
   *
   * @return the state
   */
  public Long getState() {
    return state;
  }

  /**
   * Gets the stateDescription.
   *
   * A text representation of the secret state.
   *
   * @return the stateDescription
   */
  public String getStateDescription() {
    return stateDescription;
  }
}

