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
 * The parameters required to configure Code Engine.
 */
public class CustomCredentialsConfigurationCodeEngine extends GenericModel {

  @SerializedName("job_name")
  protected String jobName;
  @SerializedName("project_id")
  protected String projectId;
  protected String region;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobName;
    private String projectId;
    private String region;

    /**
     * Instantiates a new Builder from an existing CustomCredentialsConfigurationCodeEngine instance.
     *
     * @param customCredentialsConfigurationCodeEngine the instance to initialize the Builder with
     */
    private Builder(CustomCredentialsConfigurationCodeEngine customCredentialsConfigurationCodeEngine) {
      this.jobName = customCredentialsConfigurationCodeEngine.jobName;
      this.projectId = customCredentialsConfigurationCodeEngine.projectId;
      this.region = customCredentialsConfigurationCodeEngine.region;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobName the jobName
     * @param projectId the projectId
     * @param region the region
     */
    public Builder(String jobName, String projectId, String region) {
      this.jobName = jobName;
      this.projectId = projectId;
      this.region = region;
    }

    /**
     * Builds a CustomCredentialsConfigurationCodeEngine.
     *
     * @return the new CustomCredentialsConfigurationCodeEngine instance
     */
    public CustomCredentialsConfigurationCodeEngine build() {
      return new CustomCredentialsConfigurationCodeEngine(this);
    }

    /**
     * Set the jobName.
     *
     * @param jobName the jobName
     * @return the CustomCredentialsConfigurationCodeEngine builder
     */
    public Builder jobName(String jobName) {
      this.jobName = jobName;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CustomCredentialsConfigurationCodeEngine builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the CustomCredentialsConfigurationCodeEngine builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }
  }

  protected CustomCredentialsConfigurationCodeEngine() { }

  protected CustomCredentialsConfigurationCodeEngine(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jobName,
      "jobName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.region,
      "region cannot be null");
    jobName = builder.jobName;
    projectId = builder.projectId;
    region = builder.region;
  }

  /**
   * New builder.
   *
   * @return a CustomCredentialsConfigurationCodeEngine builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobName.
   *
   * The Code Engine Job name used by this custom credentials configuration.
   *
   * @return the jobName
   */
  public String jobName() {
    return jobName;
  }

  /**
   * Gets the projectId.
   *
   * The Project ID of your Code Engine project used by this custom credentials configuration.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the region.
   *
   * The region of the Code Engine project. For example us-south.
   *
   * @return the region
   */
  public String region() {
    return region;
  }
}

