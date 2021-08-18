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
package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listAllSecrets options.
 */
public class ListAllSecretsOptions extends GenericModel {

  /**
   * Sort a list of secrets by the specified field.
   *
   * **Usage:** To sort a list of secrets by their creation date, use
   * `../secrets/{secret-type}?sort_by=creation_date`.
   */
  public interface SortBy {
    /** id. */
    String ID = "id";
    /** creation_date. */
    String CREATION_DATE = "creation_date";
    /** expiration_date. */
    String EXPIRATION_DATE = "expiration_date";
    /** secret_type. */
    String SECRET_TYPE = "secret_type";
    /** name. */
    String NAME = "name";
  }

  protected Long limit;
  protected Long offset;
  protected String search;
  protected String sortBy;
  protected List<String> groups;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private Long offset;
    private String search;
    private String sortBy;
    private List<String> groups;

    private Builder(ListAllSecretsOptions listAllSecretsOptions) {
      this.limit = listAllSecretsOptions.limit;
      this.offset = listAllSecretsOptions.offset;
      this.search = listAllSecretsOptions.search;
      this.sortBy = listAllSecretsOptions.sortBy;
      this.groups = listAllSecretsOptions.groups;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListAllSecretsOptions.
     *
     * @return the new ListAllSecretsOptions instance
     */
    public ListAllSecretsOptions build() {
      return new ListAllSecretsOptions(this);
    }

    /**
     * Adds an groups to groups.
     *
     * @param groups the new groups
     * @return the ListAllSecretsOptions builder
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
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListAllSecretsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListAllSecretsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the ListAllSecretsOptions builder
     */
    public Builder search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set the sortBy.
     *
     * @param sortBy the sortBy
     * @return the ListAllSecretsOptions builder
     */
    public Builder sortBy(String sortBy) {
      this.sortBy = sortBy;
      return this;
    }

    /**
     * Set the groups.
     * Existing groups will be replaced.
     *
     * @param groups the groups
     * @return the ListAllSecretsOptions builder
     */
    public Builder groups(List<String> groups) {
      this.groups = groups;
      return this;
    }
  }

  protected ListAllSecretsOptions(Builder builder) {
    limit = builder.limit;
    offset = builder.offset;
    search = builder.search;
    sortBy = builder.sortBy;
    groups = builder.groups;
  }

  /**
   * New builder.
   *
   * @return a ListAllSecretsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * The number of secrets to retrieve. By default, list operations return the first 200 items. To retrieve a different
   * set of items, use `limit` with `offset` to page through your available resources.
   *
   * **Usage:** If you have 20 secrets in your instance, and you want to retrieve only the first 5 secrets, use
   * `../secrets/{secret-type}?limit=5`.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of secrets to skip. By specifying `offset`, you retrieve a subset of items that starts with the `offset`
   * value. Use `offset` with `limit` to page through your available resources.
   *
   * **Usage:** If you have 100 secrets in your instance, and you want to retrieve secrets 26 through 50, use
   * `../secrets/{secret-type}?offset=25&amp;limit=25`.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the search.
   *
   * Filter secrets that contain the specified string. The fields that are searched include: id, name, description,
   * labels, secret_type.
   *
   * **Usage:** If you want to list only the secrets that contain the string "text", use
   * `../secrets/{secret-type}?search=text`.
   *
   * @return the search
   */
  public String search() {
    return search;
  }

  /**
   * Gets the sortBy.
   *
   * Sort a list of secrets by the specified field.
   *
   * **Usage:** To sort a list of secrets by their creation date, use
   * `../secrets/{secret-type}?sort_by=creation_date`.
   *
   * @return the sortBy
   */
  public String sortBy() {
    return sortBy;
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
   * use `../secrets?groups={secret_group_ID},default`.
   *
   * @return the groups
   */
  public List<String> groups() {
    return groups;
  }
}

