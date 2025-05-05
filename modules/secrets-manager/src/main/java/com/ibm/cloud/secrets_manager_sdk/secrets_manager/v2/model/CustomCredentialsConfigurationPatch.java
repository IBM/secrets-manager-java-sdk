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

import java.util.Map;

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * The configuration update of the custom credentials engine.
 */
public class CustomCredentialsConfigurationPatch extends ConfigurationPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String taskTimeout;

    /**
     * Instantiates a new Builder from an existing CustomCredentialsConfigurationPatch instance.
     *
     * @param customCredentialsConfigurationPatch the instance to initialize the Builder with
     */
    public Builder(ConfigurationPatch customCredentialsConfigurationPatch) {
      this.taskTimeout = customCredentialsConfigurationPatch.taskTimeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CustomCredentialsConfigurationPatch.
     *
     * @return the new CustomCredentialsConfigurationPatch instance
     */
    public CustomCredentialsConfigurationPatch build() {
      return new CustomCredentialsConfigurationPatch(this);
    }

    /**
     * Set the taskTimeout.
     *
     * @param taskTimeout the taskTimeout
     * @return the CustomCredentialsConfigurationPatch builder
     */
    public Builder taskTimeout(String taskTimeout) {
      this.taskTimeout = taskTimeout;
      return this;
    }
  }

  protected CustomCredentialsConfigurationPatch() { }

  protected CustomCredentialsConfigurationPatch(Builder builder) {
    taskTimeout = builder.taskTimeout;
  }

  /**
   * New builder.
   *
   * @return a CustomCredentialsConfigurationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the CustomCredentialsConfigurationPatch.
   *
   * Note that properties of the CustomCredentialsConfigurationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the CustomCredentialsConfigurationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

