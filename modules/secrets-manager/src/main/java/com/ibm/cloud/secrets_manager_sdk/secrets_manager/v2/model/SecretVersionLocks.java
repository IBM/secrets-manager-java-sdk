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
 * SecretVersionLocks.
 */
public class SecretVersionLocks extends GenericModel {

  /**
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   */
  public interface VersionAlias {
    /** current. */
    String CURRENT = "current";
    /** previous. */
    String PREVIOUS = "previous";
  }

  @SerializedName("version_id")
  protected String versionId;
  @SerializedName("version_alias")
  protected String versionAlias;
  protected List<String> locks;
  @SerializedName("payload_available")
  protected Boolean payloadAvailable;

  protected SecretVersionLocks() { }

  /**
   * Gets the versionId.
   *
   * A v4 UUID identifier.
   *
   * @return the versionId
   */
  public String getVersionId() {
    return versionId;
  }

  /**
   * Gets the versionAlias.
   *
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   *
   * @return the versionAlias
   */
  public String getVersionAlias() {
    return versionAlias;
  }

  /**
   * Gets the locks.
   *
   * The names of all locks that are associated with this secret version.
   *
   * @return the locks
   */
  public List<String> getLocks() {
    return locks;
  }

  /**
   * Gets the payloadAvailable.
   *
   * Indicates whether the secret payload is available in this secret version.
   *
   * @return the payloadAvailable
   */
  public Boolean isPayloadAvailable() {
    return payloadAvailable;
  }
}

