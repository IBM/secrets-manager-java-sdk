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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import static org.testng.Assert.assertNull;

/**
 * Unit test class for the KVSecretVersionMetadata model.
 */
public class KVSecretVersionMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKVSecretVersionMetadata() throws Throwable {
    KVSecretVersionMetadata kvSecretVersionMetadataModel = new KVSecretVersionMetadata();
    assertNull(kvSecretVersionMetadataModel.isAutoRotated());
    assertNull(kvSecretVersionMetadataModel.getCreatedBy());
    assertNull(kvSecretVersionMetadataModel.getCreatedAt());
    assertNull(kvSecretVersionMetadataModel.getId());
    assertNull(kvSecretVersionMetadataModel.getSecretType());
    assertNull(kvSecretVersionMetadataModel.getSecretGroupId());
    assertNull(kvSecretVersionMetadataModel.isPayloadAvailable());
    assertNull(kvSecretVersionMetadataModel.getAlias());
    assertNull(kvSecretVersionMetadataModel.getVersionCustomMetadata());
    assertNull(kvSecretVersionMetadataModel.getSecretId());
    assertNull(kvSecretVersionMetadataModel.getExpirationDate());
  }
}