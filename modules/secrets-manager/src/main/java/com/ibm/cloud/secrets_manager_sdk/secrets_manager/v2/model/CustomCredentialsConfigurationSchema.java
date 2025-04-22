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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The schema that defines by the Code Engine job to be used as input and output formats for this custom credentials
 * configuration.
 */
public class CustomCredentialsConfigurationSchema extends GenericModel {

  protected List<CustomCredentialsConfigurationSchemaParameter> parameters;
  protected List<CustomCredentialsConfigurationSchemaCredentials> credentials;

  protected CustomCredentialsConfigurationSchema() { }

  /**
   * Gets the parameters.
   *
   * custom credentials configuration schema parameter.
   *
   * @return the parameters
   */
  public List<CustomCredentialsConfigurationSchemaParameter> getParameters() {
    return parameters;
  }

  /**
   * Gets the credentials.
   *
   * custom credentials configuration schema credentials format.
   *
   * @return the credentials
   */
  public List<CustomCredentialsConfigurationSchemaCredentials> getCredentials() {
    return credentials;
  }
}

