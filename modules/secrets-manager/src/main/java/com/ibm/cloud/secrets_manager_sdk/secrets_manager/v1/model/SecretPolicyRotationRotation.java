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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretPolicyRotationRotation.
 *
 * Classes which extend this class:
 * - SecretPolicyRotationRotationPolicyRotation
 * - SecretPolicyRotationRotationPublicCertPolicyRotation
 */
public class SecretPolicyRotationRotation extends GenericModel {

  /**
   * Specifies the units for the secret rotation time interval.
   */
  public interface Unit {
    /** day. */
    String DAY = "day";
    /** month. */
    String MONTH = "month";
  }

  protected Long interval;
  protected String unit;
  @SerializedName("auto_rotate")
  protected Boolean autoRotate;
  @SerializedName("rotate_keys")
  protected Boolean rotateKeys;

  protected SecretPolicyRotationRotation() {
  }

  /**
   * Gets the interval.
   *
   * Specifies the length of the secret rotation time interval.
   *
   * @return the interval
   */
  public Long interval() {
    return interval;
  }

  /**
   * Gets the unit.
   *
   * Specifies the units for the secret rotation time interval.
   *
   * @return the unit
   */
  public String unit() {
    return unit;
  }

  /**
   * Gets the autoRotate.
   *
   * @return the autoRotate
   */
  public Boolean autoRotate() {
    return autoRotate;
  }

  /**
   * Gets the rotateKeys.
   *
   * @return the rotateKeys
   */
  public Boolean rotateKeys() {
    return rotateKeys;
  }
}

