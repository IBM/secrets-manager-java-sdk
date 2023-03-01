/*
 * (C) Copyright IBM Corp. 2023.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImportedCertificateMetadataPatch model.
 */
public class ImportedCertificateMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportedCertificateMetadataPatch() throws Throwable {
    ImportedCertificateMetadataPatch importedCertificateMetadataPatchModel = new ImportedCertificateMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(importedCertificateMetadataPatchModel.name(), "my-secret-example");
    assertEquals(importedCertificateMetadataPatchModel.description(), "Extended description for this secret.");
    assertEquals(importedCertificateMetadataPatchModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(importedCertificateMetadataPatchModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(importedCertificateMetadataPatchModel);

    ImportedCertificateMetadataPatch importedCertificateMetadataPatchModelNew = TestUtilities.deserialize(json, ImportedCertificateMetadataPatch.class);
    assertTrue(importedCertificateMetadataPatchModelNew instanceof ImportedCertificateMetadataPatch);
    assertEquals(importedCertificateMetadataPatchModelNew.name(), "my-secret-example");
    assertEquals(importedCertificateMetadataPatchModelNew.description(), "Extended description for this secret.");
    assertEquals(importedCertificateMetadataPatchModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
  @Test
  public void testImportedCertificateMetadataPatchAsPatch() throws Throwable {
    ImportedCertificateMetadataPatch importedCertificateMetadataPatchModel = new ImportedCertificateMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    Map<String, Object> mergePatch = importedCertificateMetadataPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-secret-example");
    assertEquals(mergePatch.get("description"), "Extended description for this secret.");
    assertTrue(mergePatch.containsKey("labels"));
    assertTrue(mergePatch.containsKey("custom_metadata"));
  }

}