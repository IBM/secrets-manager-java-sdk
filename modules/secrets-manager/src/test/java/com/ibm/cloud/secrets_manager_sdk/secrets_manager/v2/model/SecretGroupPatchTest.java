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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretGroupPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretGroupPatch model.
 */
public class SecretGroupPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretGroupPatch() throws Throwable {
    SecretGroupPatch secretGroupPatchModel = new SecretGroupPatch.Builder()
      .name("my-secret-group")
      .description("Extended description for this group.")
      .build();
    assertEquals(secretGroupPatchModel.name(), "my-secret-group");
    assertEquals(secretGroupPatchModel.description(), "Extended description for this group.");

    String json = TestUtilities.serialize(secretGroupPatchModel);

    SecretGroupPatch secretGroupPatchModelNew = TestUtilities.deserialize(json, SecretGroupPatch.class);
    assertTrue(secretGroupPatchModelNew instanceof SecretGroupPatch);
    assertEquals(secretGroupPatchModelNew.name(), "my-secret-group");
    assertEquals(secretGroupPatchModelNew.description(), "Extended description for this group.");
  }
  @Test
  public void testSecretGroupPatchAsPatch() throws Throwable {
    SecretGroupPatch secretGroupPatchModel = new SecretGroupPatch.Builder()
      .name("my-secret-group")
      .description("Extended description for this group.")
      .build();

    Map<String, Object> mergePatch = secretGroupPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-secret-group");
    assertEquals(mergePatch.get("description"), "Extended description for this group.");
  }

}