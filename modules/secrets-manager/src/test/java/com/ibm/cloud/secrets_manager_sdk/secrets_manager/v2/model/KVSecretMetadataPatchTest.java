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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KVSecretMetadataPatch model.
 */
public class KVSecretMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKVSecretMetadataPatch() throws Throwable {
    KVSecretMetadataPatch kvSecretMetadataPatchModel = new KVSecretMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(kvSecretMetadataPatchModel.name(), "my-secret-example");
    assertEquals(kvSecretMetadataPatchModel.description(), "Extended description for this secret.");
    assertEquals(kvSecretMetadataPatchModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(kvSecretMetadataPatchModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(kvSecretMetadataPatchModel);

    KVSecretMetadataPatch kvSecretMetadataPatchModelNew = TestUtilities.deserialize(json, KVSecretMetadataPatch.class);
    assertTrue(kvSecretMetadataPatchModelNew instanceof KVSecretMetadataPatch);
    assertEquals(kvSecretMetadataPatchModelNew.name(), "my-secret-example");
    assertEquals(kvSecretMetadataPatchModelNew.description(), "Extended description for this secret.");
    assertEquals(kvSecretMetadataPatchModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
  @Test
  public void testKVSecretMetadataPatchAsPatch() throws Throwable {
    KVSecretMetadataPatch kvSecretMetadataPatchModel = new KVSecretMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    Map<String, Object> mergePatch = kvSecretMetadataPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-secret-example");
    assertEquals(mergePatch.get("description"), "Extended description for this secret.");
    assertTrue(mergePatch.containsKey("labels"));
    assertTrue(mergePatch.containsKey("custom_metadata"));
  }

}