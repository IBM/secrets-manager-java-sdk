/*
 * (C) Copyright IBM Corp. 2023.
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
 * The details of the Event Notifications registration.
 */
public class NotificationsRegistration extends GenericModel {

  @SerializedName("event_notifications_instance_crn")
  protected String eventNotificationsInstanceCrn;

  protected NotificationsRegistration() { }

  /**
   * Gets the eventNotificationsInstanceCrn.
   *
   * A CRN that uniquely identifies an IBM Cloud resource.
   *
   * @return the eventNotificationsInstanceCrn
   */
  public String getEventNotificationsInstanceCrn() {
    return eventNotificationsInstanceCrn;
  }
}

