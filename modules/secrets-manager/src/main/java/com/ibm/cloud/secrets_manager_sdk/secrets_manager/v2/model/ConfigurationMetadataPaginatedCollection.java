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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties that describe a paginated collection of secret locks.
 */
public class ConfigurationMetadataPaginatedCollection extends GenericModel {

    @SerializedName("total_count")
    protected Long totalCount;
    protected Long limit;
    protected Long offset;
    protected PaginatedCollectionFirst first;
    protected PaginatedCollectionNext next;
    protected PaginatedCollectionPrevious previous;
    protected PaginatedCollectionLast last;
    protected List<ConfigurationMetadata> configurations;

    protected ConfigurationMetadataPaginatedCollection() {
    }

    /**
     * Gets the totalCount.
     * <p>
     * The total number of resources in a collection.
     *
     * @return the totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * Gets the limit.
     * <p>
     * The number of items that are retrieved in a collection.
     *
     * @return the limit
     */
    public Long getLimit() {
        return limit;
    }

    /**
     * Gets the offset.
     * <p>
     * The number of items that are skipped in a collection.
     *
     * @return the offset
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Gets the first.
     * <p>
     * A URL that points to the first page in a collection.
     *
     * @return the first
     */
    public PaginatedCollectionFirst getFirst() {
        return first;
    }

    /**
     * Gets the next.
     * <p>
     * A URL that points to the next page in a collection.
     *
     * @return the next
     */
    public PaginatedCollectionNext getNext() {
        return next;
    }

    /**
     * Gets the previous.
     * <p>
     * A URL that points to the previous page in a collection.
     *
     * @return the previous
     */
    public PaginatedCollectionPrevious getPrevious() {
        return previous;
    }

    /**
     * Gets the last.
     * <p>
     * A URL that points to the last page in a collection.
     *
     * @return the last
     */
    public PaginatedCollectionLast getLast() {
        return last;
    }

    /**
     * Gets the configurations.
     * <p>
     * A collection of configuration metadata.
     *
     * @return the configurations
     */
    public List<ConfigurationMetadata> getConfigurations() {
        return configurations;
    }
}

