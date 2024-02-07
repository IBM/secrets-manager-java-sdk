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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PaginatedCollectionFirst;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PaginatedCollectionLast;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PaginatedCollectionNext;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PaginatedCollectionPrevious;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretMetadataPaginatedCollection;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretMetadataPaginatedCollection model.
 */
public class SecretMetadataPaginatedCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretMetadataPaginatedCollection() throws Throwable {
    SecretMetadataPaginatedCollection secretMetadataPaginatedCollectionModel = new SecretMetadataPaginatedCollection();
    assertNull(secretMetadataPaginatedCollectionModel.getTotalCount());
    assertNull(secretMetadataPaginatedCollectionModel.getLimit());
    assertNull(secretMetadataPaginatedCollectionModel.getOffset());
    assertNull(secretMetadataPaginatedCollectionModel.getFirst());
    assertNull(secretMetadataPaginatedCollectionModel.getNext());
    assertNull(secretMetadataPaginatedCollectionModel.getPrevious());
    assertNull(secretMetadataPaginatedCollectionModel.getLast());
    assertNull(secretMetadataPaginatedCollectionModel.getSecrets());
  }
}