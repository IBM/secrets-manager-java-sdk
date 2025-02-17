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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ArbitrarySecretMetadataPatch model.
 */
public class ArbitrarySecretMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testArbitrarySecretMetadataPatch() throws Throwable {
    ArbitrarySecretMetadataPatch arbitrarySecretMetadataPatchModel = new ArbitrarySecretMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
      .build();
    assertEquals(arbitrarySecretMetadataPatchModel.name(), "my-secret-example");
    assertEquals(arbitrarySecretMetadataPatchModel.description(), "Extended description for this secret.");
    assertEquals(arbitrarySecretMetadataPatchModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(arbitrarySecretMetadataPatchModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(arbitrarySecretMetadataPatchModel.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));

    String json = TestUtilities.serialize(arbitrarySecretMetadataPatchModel);

    ArbitrarySecretMetadataPatch arbitrarySecretMetadataPatchModelNew = TestUtilities.deserialize(json, ArbitrarySecretMetadataPatch.class);
    assertTrue(arbitrarySecretMetadataPatchModelNew instanceof ArbitrarySecretMetadataPatch);
    assertEquals(arbitrarySecretMetadataPatchModelNew.name(), "my-secret-example");
    assertEquals(arbitrarySecretMetadataPatchModelNew.description(), "Extended description for this secret.");
    assertEquals(arbitrarySecretMetadataPatchModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(arbitrarySecretMetadataPatchModelNew.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));
  }
  @Test
  public void testArbitrarySecretMetadataPatchAsPatch() throws Throwable {
    ArbitrarySecretMetadataPatch arbitrarySecretMetadataPatchModel = new ArbitrarySecretMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
      .build();

    Map<String, Object> mergePatch = arbitrarySecretMetadataPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-secret-example");
    assertEquals(mergePatch.get("description"), "Extended description for this secret.");
    assertTrue(mergePatch.containsKey("labels"));
    assertTrue(mergePatch.containsKey("custom_metadata"));
    assertTrue(mergePatch.containsKey("expiration_date"));
  }

}