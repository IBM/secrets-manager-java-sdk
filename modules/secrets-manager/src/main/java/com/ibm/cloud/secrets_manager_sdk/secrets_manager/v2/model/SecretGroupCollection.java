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
 * Properties that describe a collection of secret groups.
 */
public class SecretGroupCollection extends GenericModel {

    @SerializedName("secret_groups")
    protected List<SecretGroup> secretGroups;
    @SerializedName("total_count")
    protected Long totalCount;

    protected SecretGroupCollection() {
    }

    /**
     * Gets the secretGroups.
     * <p>
     * A collection of secret groups.
     *
     * @return the secretGroups
     */
    public List<SecretGroup> getSecretGroups() {
        return secretGroups;
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
}

