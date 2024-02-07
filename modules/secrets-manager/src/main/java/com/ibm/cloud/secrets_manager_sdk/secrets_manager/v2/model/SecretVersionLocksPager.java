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

import com.ibm.cloud.sdk.core.util.UrlHelper;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.SecretsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * SecretVersionLocksPager can be used to simplify the use of the "listSecretVersionLocks" method.
 */
public class SecretVersionLocksPager {
  private static class PageContext {
    private Long next;
    public Long getNext() {
      return next;
    }
    public void setNext(Long next) {
      this.next = next;
    }
  }

  protected boolean hasNext;
  protected ListSecretVersionLocksOptions options;
  protected SecretsManager client;
  protected PageContext pageContext;

  // Hide the default ctor.
  protected SecretVersionLocksPager() { }

  /**
   * Constructs a new SecretVersionLocksPager instance with the specified client and options model instance.
   * @param client the SecretsManager instance to be used to invoke the "listSecretVersionLocks" method
   * @param options the ListSecretVersionLocksOptions instance to be used to invoke the "listSecretVersionLocks" method
   */
  public SecretVersionLocksPager(SecretsManager client, ListSecretVersionLocksOptions options) {
    if (options.offset() != null && options.offset().longValue() != 0) {
      throw new IllegalArgumentException("The options 'offset' field should not be set");
    }

    this.hasNext = true;
    this.client = client;
    this.options = options.newBuilder().build();
    this.pageContext = new PageContext();
  }

  /**
   * Returns true if there are more results to be retrieved.
   * @return boolean
   */
  public boolean hasNext() {
    return hasNext;
  }

  /**
   * Returns the next page of results.
   * @return a List&lt;SecretLock&gt; that contains the next page of results
   */
  public List<SecretLock> getNext() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more results available");
    }

    ListSecretVersionLocksOptions.Builder builder = this.options.newBuilder();
    if (this.pageContext.getNext() != null) {
      builder.offset(this.pageContext.getNext());
    }
    this.options = builder.build();

    SecretVersionLocksPaginatedCollection result = client.listSecretVersionLocks(options).execute().getResult();

    Long next = null;
    if (result.getNext() != null) {
      String queryParam = UrlHelper.getQueryParam(result.getNext().getHref(), "offset");
      if (queryParam != null) {
        next = Long.valueOf(queryParam);
      }
    }
    this.pageContext.setNext(next);
    if (next == null) {
      this.hasNext = false;
    }

    return result.getLocks();
  }

  /**
   * Returns all results by invoking getNext() repeatedly until all pages of results have been retrieved.
   * @return a List&lt;SecretLock&gt; containing all results returned by the "listSecretVersionLocks" method
   */
  public List<SecretLock> getAll() {
    List<SecretLock> results = new ArrayList<>();
    while (hasNext()) {
      List<SecretLock> nextPage = getNext();
      results.addAll(nextPage);
    }
    return results;
  }
}
