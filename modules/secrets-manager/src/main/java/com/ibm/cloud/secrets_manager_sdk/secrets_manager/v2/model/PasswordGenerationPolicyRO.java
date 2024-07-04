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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Policy for auto-generated passwords.
 */
public class PasswordGenerationPolicyRO extends GenericModel {

  protected Long length;
  @SerializedName("include_digits")
  protected Boolean includeDigits;
  @SerializedName("include_symbols")
  protected Boolean includeSymbols;
  @SerializedName("include_uppercase")
  protected Boolean includeUppercase;

  protected PasswordGenerationPolicyRO() { }

  /**
   * Gets the length.
   *
   * The length of auto-generated passwords.
   *
   * @return the length
   */
  public Long getLength() {
    return length;
  }

  /**
   * Gets the includeDigits.
   *
   * Include digits in auto-generated passwords.
   *
   * @return the includeDigits
   */
  public Boolean isIncludeDigits() {
    return includeDigits;
  }

  /**
   * Gets the includeSymbols.
   *
   * Include symbols in auto-generated passwords.
   *
   * @return the includeSymbols
   */
  public Boolean isIncludeSymbols() {
    return includeSymbols;
  }

  /**
   * Gets the includeUppercase.
   *
   * Include uppercase letters in auto-generated passwords.
   *
   * @return the includeUppercase
   */
  public Boolean isIncludeUppercase() {
    return includeUppercase;
  }
}

