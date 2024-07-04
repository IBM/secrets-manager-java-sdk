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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImportedCertificatePrototype model.
 */
public class ImportedCertificatePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportedCertificatePrototype() throws Throwable {
    ImportedCertificatePrototype importedCertificatePrototypeModel = new ImportedCertificatePrototype.Builder()
      .secretType("imported_cert")
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .secretGroupId("default")
      .labels(java.util.Arrays.asList("my-label"))
      .certificate("testString")
      .intermediate("testString")
      .privateKey("testString")
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(importedCertificatePrototypeModel.secretType(), "imported_cert");
    assertEquals(importedCertificatePrototypeModel.name(), "my-secret-example");
    assertEquals(importedCertificatePrototypeModel.description(), "Extended description for this secret.");
    assertEquals(importedCertificatePrototypeModel.secretGroupId(), "default");
    assertEquals(importedCertificatePrototypeModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(importedCertificatePrototypeModel.certificate(), "testString");
    assertEquals(importedCertificatePrototypeModel.intermediate(), "testString");
    assertEquals(importedCertificatePrototypeModel.privateKey(), "testString");
    assertEquals(importedCertificatePrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(importedCertificatePrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(importedCertificatePrototypeModel);

    ImportedCertificatePrototype importedCertificatePrototypeModelNew = TestUtilities.deserialize(json, ImportedCertificatePrototype.class);
    assertTrue(importedCertificatePrototypeModelNew instanceof ImportedCertificatePrototype);
    assertEquals(importedCertificatePrototypeModelNew.secretType(), "imported_cert");
    assertEquals(importedCertificatePrototypeModelNew.name(), "my-secret-example");
    assertEquals(importedCertificatePrototypeModelNew.description(), "Extended description for this secret.");
    assertEquals(importedCertificatePrototypeModelNew.secretGroupId(), "default");
    assertEquals(importedCertificatePrototypeModelNew.certificate(), "testString");
    assertEquals(importedCertificatePrototypeModelNew.intermediate(), "testString");
    assertEquals(importedCertificatePrototypeModelNew.privateKey(), "testString");
    assertEquals(importedCertificatePrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(importedCertificatePrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportedCertificatePrototypeError() throws Throwable {
    new ImportedCertificatePrototype.Builder().build();
  }

}