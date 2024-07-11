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
 * The IAM apikey metadata for the IAM credentials that were generated.
 */
public class ServiceCredentialsSourceServiceIamApikey extends GenericModel {

  protected String description;
  protected String id;
  protected String name;

  protected ServiceCredentialsSourceServiceIamApikey() { }

  /**
   * Gets the description.
   *
   * The IAM API key description for the generated service credentials.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the id.
   *
   * The IAM API key id for the generated service credentials.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The IAM API key name for the generated service credentials.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

