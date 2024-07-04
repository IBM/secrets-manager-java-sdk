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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties that describe a collection of your secret version metadata.
 */
public class SecretVersionMetadataCollection extends GenericModel {

  protected List<SecretVersionMetadata> versions;
  @SerializedName("total_count")
  protected Long totalCount;

  protected SecretVersionMetadataCollection() { }

  /**
   * Gets the versions.
   *
   * A collection of secret version metadata.
   *
   * @return the versions
   */
  public List<SecretVersionMetadata> getVersions() {
    return versions;
  }

  /**
   * Gets the totalCount.
   *
   * The total number of resources in a collection.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

