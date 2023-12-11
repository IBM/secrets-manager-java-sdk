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
 * The properties of the service credentials secret payload.
 */
public class ServiceCredentialsSecretCredentials extends GenericModel {

  protected String apikey;
  @SerializedName("cos_hmac_keys")
  protected CosHmacKeys cosHmacKeys;
  protected String endpoints;
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
  @SerializedName("resource_instance_id")
  protected String resourceInstanceId;

  protected ServiceCredentialsSecretCredentials() { }

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
    return apikey;
  }

  /**
   * Gets the cosHmacKeys.
   *
   * The Cloud Object Storage HMAC keys that are returned after you create a service credentials secret.
   *
   * @return the cosHmacKeys
   */
  public CosHmacKeys getCosHmacKeys() {
    return cosHmacKeys;
  }

  /**
   * Gets the endpoints.
   *
   * The endpoints that are returned after you create a service credentials secret.
   *
   * @return the endpoints
   */
  public String getEndpoints() {
    return endpoints;
  }

  /**
   * Gets the iamApikeyDescription.
   *
   * The IAM API key description for the generated service credentials.
   *
   * @return the iamApikeyDescription
   */
  public String getIamApikeyDescription() {
    return iamApikeyDescription;
  }

  /**
   * Gets the iamApikeyId.
   *
   * The IAM API key id for the generated service credentials.
   *
   * @return the iamApikeyId
   */
  public String getIamApikeyId() {
    return iamApikeyId;
  }

  /**
   * Gets the iamApikeyName.
   *
   * The IAM API key name for the generated service credentials.
   *
   * @return the iamApikeyName
   */
  public String getIamApikeyName() {
    return iamApikeyName;
  }

  /**
   * Gets the iamRoleCrn.
   *
   * The IAM role CRN assigned to the generated service credentials.
   *
   * @return the iamRoleCrn
   */
  public String getIamRoleCrn() {
    return iamRoleCrn;
  }

  /**
   * Gets the iamServiceidCrn.
   *
   * The IAM Service ID CRN.
   *
   * @return the iamServiceidCrn
   */
  public String getIamServiceidCrn() {
    return iamServiceidCrn;
  }

  /**
   * Gets the resourceInstanceId.
   *
   * The resource instance CRN that is returned after you create a service credentials secret.
   *
   * @return the resourceInstanceId
   */
  public String getResourceInstanceId() {
    return resourceInstanceId;
  }
}

