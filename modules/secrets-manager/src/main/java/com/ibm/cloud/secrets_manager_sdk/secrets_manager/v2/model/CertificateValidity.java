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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The date and time that the certificate validity period begins and ends.
 */
public class CertificateValidity extends GenericModel {

  @SerializedName("not_before")
  protected Date notBefore;
  @SerializedName("not_after")
  protected Date notAfter;

  protected CertificateValidity() { }

  /**
   * Gets the notBefore.
   *
   * The date-time format follows `RFC 3339`.
   *
   * @return the notBefore
   */
  public Date getNotBefore() {
    return notBefore;
  }

  /**
   * Gets the notAfter.
   *
   * The date-time format follows `RFC 3339`.
   *
   * @return the notAfter
   */
  public Date getNotAfter() {
    return notAfter;
  }
}

