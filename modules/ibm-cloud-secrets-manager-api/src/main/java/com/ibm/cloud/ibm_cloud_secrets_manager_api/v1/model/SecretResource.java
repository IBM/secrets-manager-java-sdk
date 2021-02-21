/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretResource.
 * <p>
 * Classes which extend this class:
 * - SecretResourceArbitrarySecretResource
 * - SecretResourceUsernamePasswordSecretResource
 * - SecretResourceIAMSecretResource
 */
public class SecretResource extends GenericModel {

    /**
     * The secret type.
     */
    public interface SecretType {
        /**
         * arbitrary.
         */
        String ARBITRARY = "arbitrary";
        /**
         * username_password.
         */
        String USERNAME_PASSWORD = "username_password";
        /**
         * iam_credentials.
         */
        String IAM_CREDENTIALS = "iam_credentials";
    }

    protected String type;
    protected String id;
    protected String name;
    protected String description;
    @SerializedName("secret_group_id")
    protected String secretGroupId;
    protected List<String> labels;
    protected Long state;
    @SerializedName("state_description")
    protected String stateDescription;
    @SerializedName("secret_type")
    protected String secretType;
    protected String crn;
    @SerializedName("creation_date")
    protected Date creationDate;
    @SerializedName("created_by")
    protected String createdBy;
    @SerializedName("last_update_date")
    protected Date lastUpdateDate;
    protected List<SecretVersion> versions;
    @SerializedName("expiration_date")
    protected Date expirationDate;
    protected String payload;
    @SerializedName("secret_data")
    protected Map<String, Object> secretData;
    protected String username;
    protected String password;
    @SerializedName("next_rotation_date")
    protected Date nextRotationDate;
    protected Object ttl;
    @SerializedName("access_groups")
    protected List<String> accessGroups;
    @SerializedName("api_key")
    protected String apiKey;
    @SerializedName("service_id")
    protected String serviceId;

    protected SecretResource() {
    }

    /**
     * Gets the type.
     * <p>
     * The MIME type that represents the secret.
     *
     * @return the type
     */
    public String type() {
        return type;
    }

    /**
     * Gets the id.
     * <p>
     * The v4 UUID that uniquely identifies the secret.
     *
     * @return the id
     */
    public String id() {
        return id;
    }

    /**
     * Gets the name.
     * <p>
     * A human-readable alias to assign to your secret.
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as an alias for your secret.
     *
     * @return the name
     */
    public String name() {
        return name;
    }

    /**
     * Gets the description.
     * <p>
     * An extended description of your secret.
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as a description for your secret.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Gets the secretGroupId.
     * <p>
     * The v4 UUID that uniquely identifies the secret group to assign to this secret.
     * <p>
     * If you omit this parameter, your secret is assigned to the `default` secret group.
     *
     * @return the secretGroupId
     */
    public String secretGroupId() {
        return secretGroupId;
    }

    /**
     * Gets the labels.
     * <p>
     * Labels that you can use to filter for secrets in your instance.
     * <p>
     * Up to 30 labels can be created. Labels can be between 2-30 characters, including spaces. Special characters not
     * permitted include the angled bracket, comma, colon, ampersand, and vertical pipe character (|).
     * <p>
     * To protect your privacy, do not use personal data, such as your name or location, as a label for your secret.
     *
     * @return the labels
     */
    public List<String> labels() {
        return labels;
    }

    /**
     * Gets the state.
     * <p>
     * The secret state based on NIST SP 800-57. States are integers and correspond to the Pre-activation = 0, Active = 1,
     * Suspended = 2, Deactivated = 3, and Destroyed = 5 values.
     *
     * @return the state
     */
    public Long state() {
        return state;
    }

    /**
     * Gets the stateDescription.
     * <p>
     * A text representation of the secret state.
     *
     * @return the stateDescription
     */
    public String stateDescription() {
        return stateDescription;
    }

    /**
     * Gets the secretType.
     * <p>
     * The secret type.
     *
     * @return the secretType
     */
    public String secretType() {
        return secretType;
    }

    /**
     * Gets the crn.
     * <p>
     * The Cloud Resource Name (CRN) that uniquely identifies your Secrets Manager resource.
     *
     * @return the crn
     */
    public String crn() {
        return crn;
    }

    /**
     * Gets the creationDate.
     * <p>
     * The date the secret was created. The date format follows RFC 3339.
     *
     * @return the creationDate
     */
    public Date creationDate() {
        return creationDate;
    }

    /**
     * Gets the createdBy.
     * <p>
     * The unique identifier for the entity that created the secret.
     *
     * @return the createdBy
     */
    public String createdBy() {
        return createdBy;
    }

    /**
     * Gets the lastUpdateDate.
     * <p>
     * Updates when the actual secret is modified. The date format follows RFC 3339.
     *
     * @return the lastUpdateDate
     */
    public Date lastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Gets the versions.
     * <p>
     * An array that contains metadata for each secret version.
     *
     * @return the versions
     */
    public List<SecretVersion> versions() {
        return versions;
    }

    /**
     * Gets the expirationDate.
     * <p>
     * The date the secret material expires. The date format follows RFC 3339.
     * <p>
     * You can set an expiration date on supported secret types at their creation. If you create a secret without
     * specifying an expiration date, the secret does not expire. The `expiration_date` field is supported for the
     * following secret types:
     * <p>
     * - `arbitrary`
     * - `username_password`.
     *
     * @return the expirationDate
     */
    public Date expirationDate() {
        return expirationDate;
    }

    /**
     * Gets the payload.
     * <p>
     * The new secret data to assign to an `arbitrary` secret.
     *
     * @return the payload
     */
    public String payload() {
        return payload;
    }

    /**
     * Gets the secretData.
     *
     * @return the secretData
     */
    public Map<String, Object> secretData() {
        return secretData;
    }

    /**
     * Gets the username.
     * <p>
     * The username to assign to this secret.
     *
     * @return the username
     */
    public String username() {
        return username;
    }

    /**
     * Gets the password.
     * <p>
     * The password to assign to this secret.
     *
     * @return the password
     */
    public String password() {
        return password;
    }

    /**
     * Gets the nextRotationDate.
     * <p>
     * The date that the secret is scheduled for automatic rotation.
     * <p>
     * The service automatically creates a new version of the secret on its next rotation date. This field exists only for
     * secrets that can be auto-rotated and have an existing rotation policy.
     *
     * @return the nextRotationDate
     */
    public Date nextRotationDate() {
        return nextRotationDate;
    }

    /**
     * Gets the ttl.
     * <p>
     * The time-to-live (TTL) or lease duration to assign to generated credentials.
     * <p>
     * For `iam_credentials` secrets, the TTL defines for how long each generated API key remains valid. The value can be
     * either an integer that specifies the number of seconds, or the string representation of a duration, such as `120m`
     * or `24h`.
     *
     * @return the ttl
     */
    public Object ttl() {
        return ttl;
    }

    /**
     * Gets the accessGroups.
     * <p>
     * The access groups that define the capabilities of the service ID and API key that are generated for an
     * `iam_credentials` secret.
     * <p>
     * **Tip:** To find the ID of an access group, go to **Manage &gt; Access (IAM) &gt; Access groups** in the IBM Cloud
     * console. Select the access group to inspect, and click **Details** to view its ID.
     *
     * @return the accessGroups
     */
    public List<String> accessGroups() {
        return accessGroups;
    }

    /**
     * Gets the apiKey.
     * <p>
     * The API key that is generated for this secret.
     * <p>
     * After the secret reaches the end of its lease (see the `ttl` field), the API key is revoked automatically.
     *
     * @return the apiKey
     */
    public String apiKey() {
        return apiKey;
    }

    /**
     * Gets the serviceId.
     * <p>
     * The service ID under which the API key (see the `api_key` field) is created. This service ID is added to the access
     * groups that you assign for this secret.
     *
     * @return the serviceId
     */
    public String serviceId() {
        return serviceId;
    }
}

