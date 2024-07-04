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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretVersionMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretVersionMetadataPatch model.
 */
public class SecretVersionMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretVersionMetadataPatch() throws Throwable {
    SecretVersionMetadataPatch secretVersionMetadataPatchModel = new SecretVersionMetadataPatch.Builder()
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(secretVersionMetadataPatchModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(secretVersionMetadataPatchModel);

    SecretVersionMetadataPatch secretVersionMetadataPatchModelNew = TestUtilities.deserialize(json, SecretVersionMetadataPatch.class);
    assertTrue(secretVersionMetadataPatchModelNew instanceof SecretVersionMetadataPatch);
    assertEquals(secretVersionMetadataPatchModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
  @Test
  public void testSecretVersionMetadataPatchAsPatch() throws Throwable {
    SecretVersionMetadataPatch secretVersionMetadataPatchModel = new SecretVersionMetadataPatch.Builder()
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    Map<String, Object> mergePatch = secretVersionMetadataPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("version_custom_metadata"));
  }

}