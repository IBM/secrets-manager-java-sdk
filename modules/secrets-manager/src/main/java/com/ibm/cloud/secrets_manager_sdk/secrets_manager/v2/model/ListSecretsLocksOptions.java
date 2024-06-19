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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSecretsLocks options.
 */
public class ListSecretsLocksOptions extends GenericModel {

  protected Long offset;
  protected Long limit;
  protected String search;
  protected List<String> groups;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String search;
    private List<String> groups;

    /**
     * Instantiates a new Builder from an existing ListSecretsLocksOptions instance.
     *
     * @param listSecretsLocksOptions the instance to initialize the Builder with
     */
    private Builder(ListSecretsLocksOptions listSecretsLocksOptions) {
      this.offset = listSecretsLocksOptions.offset;
      this.limit = listSecretsLocksOptions.limit;
      this.search = listSecretsLocksOptions.search;
      this.groups = listSecretsLocksOptions.groups;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSecretsLocksOptions.
     *
     * @return the new ListSecretsLocksOptions instance
     */
    public ListSecretsLocksOptions build() {
      return new ListSecretsLocksOptions(this);
    }

    /**
     * Adds a new element to groups.
     *
     * @param groups the new element to be added
     * @return the ListSecretsLocksOptions builder
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
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListSecretsLocksOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSecretsLocksOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the ListSecretsLocksOptions builder
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
     * @return the ListSecretsLocksOptions builder
     */
    public Builder groups(List<String> groups) {
      this.groups = groups;
      return this;
    }
  }

  protected ListSecretsLocksOptions() { }

  protected ListSecretsLocksOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    search = builder.search;
    groups = builder.groups;
  }

  /**
   * New builder.
   *
   * @return a ListSecretsLocksOptions builder
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
   * Gets the search.
   *
   * Filter locks that contain the specified string in the field "name".
   *
   * **Usage:** If you want to list only the locks that contain the string "text" in the field "name", use
   * `..?search=text`.
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
}

