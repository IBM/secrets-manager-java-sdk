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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * The properties of the service credentials secret payload.
 *
 * This type supports additional properties of type Object.
 */
public class ServiceCredentialsSecretCredentials extends DynamicModel<Object> {

  @SerializedName("apikey")
  protected String apikey;
  @SerializedName("iam_apikey_description")
  protected String iamApikeyDescription;
  @SerializedName("iam_apikey_id")
  protected String iamApikeyId;
  @SerializedName("iam_apikey_name")
  protected String iamApikeyName;
  @SerializedName("iam_role_crn")
  protected String iamRoleCrn;
  @SerializedName("iam_serviceid_crn")
  protected String iamServiceidCrn;

  public ServiceCredentialsSecretCredentials() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the apikey.
   *
   * The API key that is generated for this secret.
   *
   * After the secret reaches the end of its lease, the API key is deleted automatically. See the `time-to-live` field
   * to understand the duration of the lease.
   *
   * @return the apikey
   */
  public String getApikey() {
    return this.apikey;
  }

  /**
   * Gets the iamApikeyDescription.
   *
   * The IAM API key description for the generated service credentials.
   *
   * @return the iamApikeyDescription
   */
  public String getIamApikeyDescription() {
    return this.iamApikeyDescription;
  }

  /**
   * Gets the iamApikeyId.
   *
   * The IAM API key id for the generated service credentials.
   *
   * @return the iamApikeyId
   */
  public String getIamApikeyId() {
    return this.iamApikeyId;
  }

  /**
   * Gets the iamApikeyName.
   *
   * The IAM API key name for the generated service credentials.
   *
   * @return the iamApikeyName
   */
  public String getIamApikeyName() {
    return this.iamApikeyName;
  }

  /**
   * Gets the iamRoleCrn.
   *
   * The IAM role CRN assigned to the generated service credentials.
   *
   * @return the iamRoleCrn
   */
  public String getIamRoleCrn() {
    return this.iamRoleCrn;
  }

  /**
   * Gets the iamServiceidCrn.
   *
   * The IAM Service ID CRN.
   *
   * @return the iamServiceidCrn
   */
  public String getIamServiceidCrn() {
    return this.iamServiceidCrn;
  }
}
