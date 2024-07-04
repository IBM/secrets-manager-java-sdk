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
 * Policy patch for auto-generated passwords. Policy properties that are included in the patch are updated. Properties
 * that are not included in the patch remain unchanged.
 */
public class PasswordGenerationPolicyPatch extends GenericModel {

  protected Long length;
  @SerializedName("include_digits")
  protected Boolean includeDigits;
  @SerializedName("include_symbols")
  protected Boolean includeSymbols;
  @SerializedName("include_uppercase")
  protected Boolean includeUppercase;

  /**
   * Builder.
   */
  public static class Builder {
    private Long length;
    private Boolean includeDigits;
    private Boolean includeSymbols;
    private Boolean includeUppercase;

    /**
     * Instantiates a new Builder from an existing PasswordGenerationPolicyPatch instance.
     *
     * @param passwordGenerationPolicyPatch the instance to initialize the Builder with
     */
    private Builder(PasswordGenerationPolicyPatch passwordGenerationPolicyPatch) {
      this.length = passwordGenerationPolicyPatch.length;
      this.includeDigits = passwordGenerationPolicyPatch.includeDigits;
      this.includeSymbols = passwordGenerationPolicyPatch.includeSymbols;
      this.includeUppercase = passwordGenerationPolicyPatch.includeUppercase;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PasswordGenerationPolicyPatch.
     *
     * @return the new PasswordGenerationPolicyPatch instance
     */
    public PasswordGenerationPolicyPatch build() {
      return new PasswordGenerationPolicyPatch(this);
    }

    /**
     * Set the length.
     *
     * @param length the length
     * @return the PasswordGenerationPolicyPatch builder
     */
    public Builder length(long length) {
      this.length = length;
      return this;
    }

    /**
     * Set the includeDigits.
     *
     * @param includeDigits the includeDigits
     * @return the PasswordGenerationPolicyPatch builder
     */
    public Builder includeDigits(Boolean includeDigits) {
      this.includeDigits = includeDigits;
      return this;
    }

    /**
     * Set the includeSymbols.
     *
     * @param includeSymbols the includeSymbols
     * @return the PasswordGenerationPolicyPatch builder
     */
    public Builder includeSymbols(Boolean includeSymbols) {
      this.includeSymbols = includeSymbols;
      return this;
    }

    /**
     * Set the includeUppercase.
     *
     * @param includeUppercase the includeUppercase
     * @return the PasswordGenerationPolicyPatch builder
     */
    public Builder includeUppercase(Boolean includeUppercase) {
      this.includeUppercase = includeUppercase;
      return this;
    }
  }

  protected PasswordGenerationPolicyPatch() { }

  protected PasswordGenerationPolicyPatch(Builder builder) {
    length = builder.length;
    includeDigits = builder.includeDigits;
    includeSymbols = builder.includeSymbols;
    includeUppercase = builder.includeUppercase;
  }

  /**
   * New builder.
   *
   * @return a PasswordGenerationPolicyPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the length.
   *
   * The length of auto-generated passwords.
   *
   * @return the length
   */
  public Long length() {
    return length;
  }

  /**
   * Gets the includeDigits.
   *
   * Include digits in auto-generated passwords.
   *
   * @return the includeDigits
   */
  public Boolean includeDigits() {
    return includeDigits;
  }

  /**
   * Gets the includeSymbols.
   *
   * Include symbols in auto-generated passwords.
   *
   * @return the includeSymbols
   */
  public Boolean includeSymbols() {
    return includeSymbols;
  }

  /**
   * Gets the includeUppercase.
   *
   * Include uppercase letters in auto-generated passwords.
   *
   * @return the includeUppercase
   */
  public Boolean includeUppercase() {
    return includeUppercase;
  }
}

