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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.KvSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KvSecretMetadata model.
 */
public class KvSecretMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKvSecretMetadata() throws Throwable {
    KvSecretMetadata kvSecretMetadataModel = new KvSecretMetadata.Builder()
      .labels(java.util.Arrays.asList("dev", "us-south"))
      .name("example-secret")
      .description("Extended description for this secret.")
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(kvSecretMetadataModel.labels(), java.util.Arrays.asList("dev", "us-south"));
    assertEquals(kvSecretMetadataModel.name(), "example-secret");
    assertEquals(kvSecretMetadataModel.description(), "Extended description for this secret.");
    assertEquals(kvSecretMetadataModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(kvSecretMetadataModel);

    KvSecretMetadata kvSecretMetadataModelNew = TestUtilities.deserialize(json, KvSecretMetadata.class);
    assertTrue(kvSecretMetadataModelNew instanceof KvSecretMetadata);
    assertEquals(kvSecretMetadataModelNew.name(), "example-secret");
    assertEquals(kvSecretMetadataModelNew.description(), "Extended description for this secret.");
    assertEquals(kvSecretMetadataModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testKvSecretMetadataError() throws Throwable {
    new KvSecretMetadata.Builder().build();
  }

}