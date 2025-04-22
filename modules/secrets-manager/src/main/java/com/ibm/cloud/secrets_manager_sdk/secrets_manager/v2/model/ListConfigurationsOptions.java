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
 * The listConfigurations options.
 */
public class ListConfigurationsOptions extends GenericModel {

  public interface SecretTypes {
    /** iam_credentials. */
    String IAM_CREDENTIALS = "iam_credentials";
    /** private_cert. */
    String PRIVATE_CERT = "private_cert";
    /** public_cert. */
    String PUBLIC_CERT = "public_cert";
    /** custom_credentials. */
    String CUSTOM_CREDENTIALS = "custom_credentials";
  }

  protected Long offset;
  protected Long limit;
  protected String sort;
  protected String search;
  protected List<String> secretTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String sort;
    private String search;
    private List<String> secretTypes;

    /**
     * Instantiates a new Builder from an existing ListConfigurationsOptions instance.
     *
     * @param listConfigurationsOptions the instance to initialize the Builder with
     */
    private Builder(ListConfigurationsOptions listConfigurationsOptions) {
      this.offset = listConfigurationsOptions.offset;
      this.limit = listConfigurationsOptions.limit;
      this.sort = listConfigurationsOptions.sort;
      this.search = listConfigurationsOptions.search;
      this.secretTypes = listConfigurationsOptions.secretTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListConfigurationsOptions.
     *
     * @return the new ListConfigurationsOptions instance
     */
    public ListConfigurationsOptions build() {
      return new ListConfigurationsOptions(this);
    }

    /**
     * Adds a new element to secretTypes.
     *
     * @param secretTypes the new element to be added
     * @return the ListConfigurationsOptions builder
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
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListConfigurationsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListConfigurationsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListConfigurationsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the ListConfigurationsOptions builder
     */
    public Builder search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set the secretTypes.
     * Existing secretTypes will be replaced.
     *
     * @param secretTypes the secretTypes
     * @return the ListConfigurationsOptions builder
     */
    public Builder secretTypes(List<String> secretTypes) {
      this.secretTypes = secretTypes;
      return this;
    }
  }

  protected ListConfigurationsOptions() { }

  protected ListConfigurationsOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    sort = builder.sort;
    search = builder.search;
    secretTypes = builder.secretTypes;
  }

  /**
   * New builder.
   *
   * @return a ListConfigurationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The number of configurations to skip. By specifying `offset`, you retrieve a subset of items that starts with the
   * `offset` value. Use `offset` with `limit` to page through your available resources.
   *
   * **Usage:** If you have 100 configurations in your instance, and you want to retrieve configurations 26 through 50,
   * use
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
   * The number of configurations to retrieve. By default, list operations return the first 200 items. To retrieve a
   * different set of items, use `limit` with `offset` to page through your available resources. Maximum limit allowed
   * is 1000 secrets.
   *
   * **Usage:** If you want to retrieve only the first 25 configurations in your instance, use
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
   * Sort a collection of configurations by the specified field in ascending order. To sort in descending order use the
   * `-` character
   *
   *
   * **Available values:**  config_type | secret_type | name
   *
   * **Usage:** To sort a list of configurations by their creation date, use
   * `../configurations?sort=config_type`.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }

  /**
   * Gets the search.
   *
   * Obtain a collection of configurations that contain the specified string in one or more of the fields: `name`,
   * `config_type`, `secret_type`.
   *
   * **Usage:** If you want to list only the configurations that contain the string `text`, use
   * `../configurations?search=text`.
   *
   * @return the search
   */
  public String search() {
    return search;
  }

  /**
   * Gets the secretTypes.
   *
   * Filter configurations by secret types, iam_credentials, public_cert or private_cert.
   *
   * You can apply multiple filters by using a comma-separated list of secret types.
   *
   * **Usage:** To retrieve a list of configurations that are associated with all secret types, use
   * `..?secret_types=iam_credentials,public_cert,private_cert,custom_credentials`.
   *
   * @return the secretTypes
   */
  public List<String> secretTypes() {
    return secretTypes;
  }
}

