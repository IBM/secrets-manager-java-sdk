/*
 * (C) Copyright IBM Corp. 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * This field indicates whether Secrets Manager rotates your secrets automatically. Supported secret types:
 * username_password, private_cert, public_cert, iam_credentials, custom_credentials.
 *
 * Classes which extend this class:
 * - CommonRotationPolicy
 * - PublicCertificateRotationPolicy
 */
public class RotationPolicy extends GenericModel {

  /**
   * The units for the secret rotation time interval.
   */
  public interface Unit {
    /** day. */
    String DAY = "day";
    /** month. */
    String MONTH = "month";
    /** hour. */
    String HOUR = "hour";
  }

  @SerializedName("auto_rotate")
  protected Boolean autoRotate;
  protected Long interval;
  protected String unit;
  @SerializedName("rotate_keys")
  protected Boolean rotateKeys;

  protected RotationPolicy() { }

  /**
   * Gets the autoRotate.
   *
   * This field indicates whether Secrets Manager rotates your secret automatically.
   *
   * The default is `false`. If `auto_rotate` is set to `true` the service rotates your secret based on the defined
   * interval.
   *
   * @return the autoRotate
   */
  public Boolean autoRotate() {
    return autoRotate;
  }

  /**
   * Gets the interval.
   *
   * The length of the secret rotation time interval.
   *
   * @return the interval
   */
  public Long interval() {
    return interval;
  }

  /**
   * Gets the unit.
   *
   * The units for the secret rotation time interval.
   *
   * @return the unit
   */
  public String unit() {
    return unit;
  }

  /**
   * Gets the rotateKeys.
   *
   * This field indicates whether Secrets Manager rotates the private key for your public certificate automatically.
   *
   * The default is `false`. If it is set to `true`, the service generates and stores a new private key for your rotated
   * certificate.
   *
   * @return the rotateKeys
   */
  public Boolean rotateKeys() {
    return rotateKeys;
  }
}

