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

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Update your secret metadata.
 *
 * Classes which extend this class:
 * - ArbitrarySecretMetadataPatch
 * - IAMCredentialsSecretMetadataPatch
 * - ImportedCertificateMetadataPatch
 * - KVSecretMetadataPatch
 * - PrivateCertificateMetadataPatch
 * - PublicCertificateMetadataPatch
 * - ServiceCredentialsSecretMetadataPatch
 * - UsernamePasswordSecretMetadataPatch
 */
public class SecretMetadataPatch extends GenericModel {

  protected String name;
  protected String description;
  protected List<String> labels;
  @SerializedName("custom_metadata")
  protected Map<String, Object> customMetadata;
  @SerializedName("expiration_date")
  protected Date expirationDate;
  protected String ttl;
  protected RotationPolicy rotation;
  @SerializedName("password_generation_policy")
  protected PasswordGenerationPolicyPatch passwordGenerationPolicy;

  protected SecretMetadataPatch() { }

  /**
   * Gets the name.
   *
   * A human-readable name to assign to your secret.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a name for your secret.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * An extended description of your secret.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret
   * group.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the labels.
   *
   * Labels that you can use to search secrets in your instance. Only 30 labels can be created.
   *
   * Label can be between 2-30 characters, including spaces.
   *
   * To protect your privacy, do not use personal data, such as your name or location, as a label for your secret.
   *
   * @return the labels
   */
  public List<String> labels() {
    return labels;
  }

  /**
   * Gets the customMetadata.
   *
   * The secret metadata that a user can customize.
   *
   * @return the customMetadata
   */
  public Map<String, Object> customMetadata() {
    return customMetadata;
  }

  /**
   * Gets the expirationDate.
   *
   * The date when the secret material expires. The date format follows the `RFC 3339` format. Supported secret types:
   * Arbitrary, username_password.
   *
   * @return the expirationDate
   */
  public Date expirationDate() {
    return expirationDate;
  }

  /**
   * Gets the ttl.
   *
   * The time-to-live (TTL) or lease duration to assign to credentials that are generated. Supported secret types:
   * iam_credentials, service_credentials. The TTL defines how long generated credentials remain valid. The value can be
   * either an integer that specifies the number of seconds, or the string  representation of a duration, such as
   * `1440m` or `24h`. For the iam_credentials secret type, the TTL field is mandatory. The minimum duration is 1
   * minute. The maximum is 90 days. For the service_credentials secret type, the TTL field is optional. If it is set
   * the minimum duration is 1 day. The maximum is 90 days. By default, the TTL is set to 0.
   *
   * @return the ttl
   */
  public String ttl() {
    return ttl;
  }

  /**
   * Gets the rotation.
   *
   * This field indicates whether Secrets Manager rotates your secrets automatically. Supported secret types:
   * username_password, private_cert, public_cert, iam_credentials.
   *
   * @return the rotation
   */
  public RotationPolicy rotation() {
    return rotation;
  }

  /**
   * Gets the passwordGenerationPolicy.
   *
   * Policy patch for auto-generated passwords. Policy properties that are included in the patch are updated.
   * Properties that are not included in the patch remain unchanged.
   *
   * @return the passwordGenerationPolicy
   */
  public PasswordGenerationPolicyPatch passwordGenerationPolicy() {
    return passwordGenerationPolicy;
  }

  /**
   * Construct a JSON merge-patch from the SecretMetadataPatch.
   *
   * Note that properties of the SecretMetadataPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SecretMetadataPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

