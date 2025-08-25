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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSecrets options.
 */
public class ListSecretsOptions extends GenericModel {

  public interface SecretTypes {
    /** arbitrary. */
    String ARBITRARY = "arbitrary";
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** imported_cert. */
    String IMPORTED_CERT = "imported_cert";
    /** kv. */
    String KV = "kv";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** service_credentials. */
    String SERVICE_CREDENTIALS = "service_credentials";
    /** username_password. */
    String USERNAME_PASSWORD = "username_password";
    /** custom_credentials. */
    String CUSTOM_CREDENTIALS = "custom_credentials";
  }

  protected Long offset;
  protected Long limit;
  protected String sort;
  protected String search;
  protected List<String> groups;
  protected List<String> secretTypes;
  protected List<String> matchAllLabels;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String sort;
    private String search;
    private List<String> groups;
    private List<String> secretTypes;
    private List<String> matchAllLabels;

    /**
     * Instantiates a new Builder from an existing ListSecretsOptions instance.
     *
     * @param listSecretsOptions the instance to initialize the Builder with
     */
    private Builder(ListSecretsOptions listSecretsOptions) {
      this.offset = listSecretsOptions.offset;
      this.limit = listSecretsOptions.limit;
      this.sort = listSecretsOptions.sort;
      this.search = listSecretsOptions.search;
      this.groups = listSecretsOptions.groups;
      this.secretTypes = listSecretsOptions.secretTypes;
      this.matchAllLabels = listSecretsOptions.matchAllLabels;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSecretsOptions.
     *
     * @return the new ListSecretsOptions instance
     */
    public ListSecretsOptions build() {
      return new ListSecretsOptions(this);
    }

    /**
     * Adds a new element to groups.
     *
     * @param groups the new element to be added
     * @return the ListSecretsOptions builder
     */
    public Builder addGroups(String groups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groups,
        "groups cannot be null");
      if (this.groups == null) {
        this.groups = new ArrayList<String>();
      }
      this.groups.add(groups);
      return this;
    }

    /**
     * Adds a new element to secretTypes.
     *
     * @param secretTypes the new element to be added
     * @return the ListSecretsOptions builder
     */
    public Builder addSecretTypes(String secretTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(secretTypes,
        "secretTypes cannot be null");
      if (this.secretTypes == null) {
        this.secretTypes = new ArrayList<String>();
      }
      this.secretTypes.add(secretTypes);
      return this;
    }

    /**
     * Adds a new element to matchAllLabels.
     *
     * @param matchAllLabels the new element to be added
     * @return the ListSecretsOptions builder
     */
    public Builder addMatchAllLabels(String matchAllLabels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(matchAllLabels,
        "matchAllLabels cannot be null");
      if (this.matchAllLabels == null) {
        this.matchAllLabels = new ArrayList<String>();
      }
      this.matchAllLabels.add(matchAllLabels);
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListSecretsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSecretsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListSecretsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the ListSecretsOptions builder
     */
    public Builder search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set the groups.
     * Existing groups will be replaced.
     *
     * @param groups the groups
     * @return the ListSecretsOptions builder
     */
    public Builder groups(List<String> groups) {
      this.groups = groups;
      return this;
    }

    /**
     * Set the secretTypes.
     * Existing secretTypes will be replaced.
     *
     * @param secretTypes the secretTypes
     * @return the ListSecretsOptions builder
     */
    public Builder secretTypes(List<String> secretTypes) {
      this.secretTypes = secretTypes;
      return this;
    }

    /**
     * Set the matchAllLabels.
     * Existing matchAllLabels will be replaced.
     *
     * @param matchAllLabels the matchAllLabels
     * @return the ListSecretsOptions builder
     */
    public Builder matchAllLabels(List<String> matchAllLabels) {
      this.matchAllLabels = matchAllLabels;
      return this;
    }
  }

  protected ListSecretsOptions() { }

  protected ListSecretsOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    sort = builder.sort;
    search = builder.search;
    groups = builder.groups;
    secretTypes = builder.secretTypes;
    matchAllLabels = builder.matchAllLabels;
  }

  /**
   * New builder.
   *
   * @return a ListSecretsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The number of secrets to skip. By specifying `offset`, you retrieve a subset of items that starts with the `offset`
   * value. Use `offset` with `limit` to page through your available resources.
   *
   * **Usage:** If you have 100 secrets in your instance, and you want to retrieve secrets 26 through 50, use
   * `..?offset=25&amp;limit=25`.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of secrets to retrieve. By default, list operations return the first 200 items. To retrieve a different
   * set of items, use `limit` with `offset` to page through your available resources. Maximum limit allowed is 1000
   * secrets.
   *
   * **Usage:** If you want to retrieve only the first 25 secrets in your instance, use
   * `..?limit=25`.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the sort.
   *
   * Sort a collection of secrets by the specified field in ascending order. To sort in descending order use the `-`
   * character
   *
   *
   * **Available values:** id | created_at | updated_at | retrieved_at | expiration_date | secret_type | name
   *
   * **Usage:** To sort a list of secrets by their creation date, use
   * `../secrets?sort=created_at`.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }

  /**
   * Gets the search.
   *
   * Obtain a collection of secrets that contain the specified string in one or more of the fields: `id`, `name`,
   * `description`,
   * `labels`, `secret_type`.
   *
   * **Usage:** If you want to list only the secrets that contain the string `text`, use
   * `../secrets?search=text`.
   *
   * @return the search
   */
  public String search() {
    return search;
  }

  /**
   * Gets the groups.
   *
   * Filter secrets by groups.
   *
   * You can apply multiple filters by using a comma-separated list of secret group IDs. If you need to filter secrets
   * that are in the default secret group, use the `default` keyword.
   *
   * **Usage:** To retrieve a list of secrets that are associated with an existing secret group or the default group,
   * use `..?groups={secret_group_ID},default`.
   *
   * @return the groups
   */
  public List<String> groups() {
    return groups;
  }

  /**
   * Gets the secretTypes.
   *
   * Filter secrets by types.
   *
   * You can apply multiple filters by using a comma-separated list of secret types.
   *
   * **Usage:** To retrieve a list of imported certificates and public certificates use
   * `..?secret_types=imported_cert,public_cert`.
   *
   * @return the secretTypes
   */
  public List<String> secretTypes() {
    return secretTypes;
  }

  /**
   * Gets the matchAllLabels.
   *
   * Filter secrets by labels.
   *
   * You can use a comma-separated list of labels to filter secrets that include all of the labels in the list.
   *
   * **Usage:** To retrieve a list of secrets that include both the label "dev" and the label "us-south" in their list
   * of labels, use `..?labels=dev,us-south`.
   *
   * @return the matchAllLabels
   */
  public List<String> matchAllLabels() {
    return matchAllLabels;
  }
}

