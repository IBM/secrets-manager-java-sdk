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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The request body to specify the properties for your secret task update.
 *
 * Classes which extend this class:
 * - SecretTaskPrototypeUpdateSecretTaskCredentialsCreated
 * - SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted
 * - SecretTaskPrototypeUpdateSecretTaskFailed
 */
public class SecretTaskPrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "status";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("credentials_created", SecretTaskPrototypeUpdateSecretTaskCredentialsCreated.class);
    discriminatorMapping.put("credentials_deleted", SecretTaskPrototypeUpdateSecretTaskCredentialsDeleted.class);
    discriminatorMapping.put("failed", SecretTaskPrototypeUpdateSecretTaskFailed.class);
  }
  /**
   * Describes the status of a secret's task.
   */
  public interface Status {
    /** credentials_created. */
    String CREDENTIALS_CREATED = "credentials_created";
  }

  protected String status;
  protected CustomCredentialsNewCredentials credentials;
  protected List<SecretTaskError> errors;

  protected SecretTaskPrototype() { }

  /**
   * Gets the status.
   *
   * Describes the status of a secret's task.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the credentials.
   *
   * Newly created credentials provided by the credentials provider.
   *
   * @return the credentials
   */
  public CustomCredentialsNewCredentials credentials() {
    return credentials;
  }

  /**
   * Gets the errors.
   *
   * A collection of errors.
   *
   * @return the errors
   */
  public List<SecretTaskError> errors() {
    return errors;
  }
}

