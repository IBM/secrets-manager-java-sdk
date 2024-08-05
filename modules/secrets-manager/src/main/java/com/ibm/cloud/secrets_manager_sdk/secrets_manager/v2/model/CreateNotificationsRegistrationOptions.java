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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createNotificationsRegistration options.
 */
public class CreateNotificationsRegistrationOptions extends GenericModel {

  protected String eventNotificationsInstanceCrn;
  protected String eventNotificationsSourceName;
  protected String eventNotificationsSourceDescription;

  /**
   * Builder.
   */
  public static class Builder {
    private String eventNotificationsInstanceCrn;
    private String eventNotificationsSourceName;
    private String eventNotificationsSourceDescription;

    /**
     * Instantiates a new Builder from an existing CreateNotificationsRegistrationOptions instance.
     *
     * @param createNotificationsRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateNotificationsRegistrationOptions createNotificationsRegistrationOptions) {
      this.eventNotificationsInstanceCrn = createNotificationsRegistrationOptions.eventNotificationsInstanceCrn;
      this.eventNotificationsSourceName = createNotificationsRegistrationOptions.eventNotificationsSourceName;
      this.eventNotificationsSourceDescription = createNotificationsRegistrationOptions.eventNotificationsSourceDescription;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param eventNotificationsInstanceCrn the eventNotificationsInstanceCrn
     * @param eventNotificationsSourceName the eventNotificationsSourceName
     */
    public Builder(String eventNotificationsInstanceCrn, String eventNotificationsSourceName) {
      this.eventNotificationsInstanceCrn = eventNotificationsInstanceCrn;
      this.eventNotificationsSourceName = eventNotificationsSourceName;
    }

    /**
     * Builds a CreateNotificationsRegistrationOptions.
     *
     * @return the new CreateNotificationsRegistrationOptions instance
     */
    public CreateNotificationsRegistrationOptions build() {
      return new CreateNotificationsRegistrationOptions(this);
    }

    /**
     * Set the eventNotificationsInstanceCrn.
     *
     * @param eventNotificationsInstanceCrn the eventNotificationsInstanceCrn
     * @return the CreateNotificationsRegistrationOptions builder
     */
    public Builder eventNotificationsInstanceCrn(String eventNotificationsInstanceCrn) {
      this.eventNotificationsInstanceCrn = eventNotificationsInstanceCrn;
      return this;
    }

    /**
     * Set the eventNotificationsSourceName.
     *
     * @param eventNotificationsSourceName the eventNotificationsSourceName
     * @return the CreateNotificationsRegistrationOptions builder
     */
    public Builder eventNotificationsSourceName(String eventNotificationsSourceName) {
      this.eventNotificationsSourceName = eventNotificationsSourceName;
      return this;
    }

    /**
     * Set the eventNotificationsSourceDescription.
     *
     * @param eventNotificationsSourceDescription the eventNotificationsSourceDescription
     * @return the CreateNotificationsRegistrationOptions builder
     */
    public Builder eventNotificationsSourceDescription(String eventNotificationsSourceDescription) {
      this.eventNotificationsSourceDescription = eventNotificationsSourceDescription;
      return this;
    }
  }

  protected CreateNotificationsRegistrationOptions() { }

  protected CreateNotificationsRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.eventNotificationsInstanceCrn,
      "eventNotificationsInstanceCrn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.eventNotificationsSourceName,
      "eventNotificationsSourceName cannot be null");
    eventNotificationsInstanceCrn = builder.eventNotificationsInstanceCrn;
    eventNotificationsSourceName = builder.eventNotificationsSourceName;
    eventNotificationsSourceDescription = builder.eventNotificationsSourceDescription;
  }

  /**
   * New builder.
   *
   * @return a CreateNotificationsRegistrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the eventNotificationsInstanceCrn.
   *
   * A CRN that uniquely identifies an IBM Cloud resource.
   *
   * @return the eventNotificationsInstanceCrn
   */
  public String eventNotificationsInstanceCrn() {
    return eventNotificationsInstanceCrn;
  }

  /**
   * Gets the eventNotificationsSourceName.
   *
   * The name that is displayed as a source that is in your Event Notifications instance.
   *
   * @return the eventNotificationsSourceName
   */
  public String eventNotificationsSourceName() {
    return eventNotificationsSourceName;
  }

  /**
   * Gets the eventNotificationsSourceDescription.
   *
   * An optional description for the source that is in your Event Notifications instance.
   *
   * @return the eventNotificationsSourceDescription
   */
  public String eventNotificationsSourceDescription() {
    return eventNotificationsSourceDescription;
  }
}

