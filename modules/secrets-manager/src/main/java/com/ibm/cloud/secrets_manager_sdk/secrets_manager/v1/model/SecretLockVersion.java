/*
 * (C) Copyright IBM Corp. 2022.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Properties that describe the secret locks.
 */
public class SecretLockVersion extends DynamicModel<Object> {

  /**
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   */
  public interface Alias {
    /** current. */
    String CURRENT = "current";
    /** previous. */
    String PREVIOUS = "previous";
  }

  @SerializedName("id")
  protected String id;
  @SerializedName("alias")
  protected String alias;
  @SerializedName("locks")
  protected List<String> locks;
  @SerializedName("payload_available")
  protected Boolean payloadAvailable;

  public SecretLockVersion() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the id.
   *
   * The v4 UUID that uniquely identifies the lock.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the alias.
   *
   * A human-readable alias that describes the secret version. 'Current' is used for version `n` and 'previous' is used
   * for version `n-1`.
   *
   * @return the alias
   */
  public String getAlias() {
    return this.alias;
  }

  /**
   * Gets the locks.
   *
   * The names of all locks that are associated with this secret.
   *
   * @return the locks
   */
  public List<String> getLocks() {
    return this.locks;
  }

  /**
   * Gets the payloadAvailable.
   *
   * Indicates whether the payload for the secret version is stored and available.
   *
   * @return the payloadAvailable
   */
  public Boolean isPayloadAvailable() {
    return this.payloadAvailable;
  }
}
