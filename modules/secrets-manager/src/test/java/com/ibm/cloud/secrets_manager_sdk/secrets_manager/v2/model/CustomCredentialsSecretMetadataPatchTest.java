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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CustomCredentialsSecretMetadataPatch model.
 */
public class CustomCredentialsSecretMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCustomCredentialsSecretMetadataPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

    CustomCredentialsSecretMetadataPatch customCredentialsSecretMetadataPatchModel = new CustomCredentialsSecretMetadataPatch.Builder()
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .name("my-secret-example")
      .rotation(rotationPolicyModel)
      .ttl("1d")
      .parameters(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(customCredentialsSecretMetadataPatchModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(customCredentialsSecretMetadataPatchModel.description(), "Extended description for this secret.");
    assertEquals(customCredentialsSecretMetadataPatchModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(customCredentialsSecretMetadataPatchModel.name(), "my-secret-example");
    assertEquals(customCredentialsSecretMetadataPatchModel.rotation(), rotationPolicyModel);
    assertEquals(customCredentialsSecretMetadataPatchModel.ttl(), "1d");
    assertEquals(customCredentialsSecretMetadataPatchModel.parameters(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(customCredentialsSecretMetadataPatchModel);

    CustomCredentialsSecretMetadataPatch customCredentialsSecretMetadataPatchModelNew = TestUtilities.deserialize(json, CustomCredentialsSecretMetadataPatch.class);
    assertTrue(customCredentialsSecretMetadataPatchModelNew instanceof CustomCredentialsSecretMetadataPatch);
    assertEquals(customCredentialsSecretMetadataPatchModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(customCredentialsSecretMetadataPatchModelNew.description(), "Extended description for this secret.");
    assertEquals(customCredentialsSecretMetadataPatchModelNew.name(), "my-secret-example");
    assertEquals(customCredentialsSecretMetadataPatchModelNew.rotation().toString(), rotationPolicyModel.toString());
    assertEquals(customCredentialsSecretMetadataPatchModelNew.ttl(), "1d");
    assertEquals(customCredentialsSecretMetadataPatchModelNew.parameters().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
  @Test
  public void testCustomCredentialsSecretMetadataPatchAsPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();

    CustomCredentialsSecretMetadataPatch customCredentialsSecretMetadataPatchModel = new CustomCredentialsSecretMetadataPatch.Builder()
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .name("my-secret-example")
      .rotation(rotationPolicyModel)
      .ttl("1d")
      .parameters(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    Map<String, Object> mergePatch = customCredentialsSecretMetadataPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("custom_metadata"));
    assertEquals(mergePatch.get("description"), "Extended description for this secret.");
    assertTrue(mergePatch.containsKey("labels"));
    assertEquals(mergePatch.get("name"), "my-secret-example");
    assertTrue(mergePatch.containsKey("rotation"));
    assertEquals(mergePatch.get("ttl"), "1d");
    assertTrue(mergePatch.containsKey("parameters"));
  }

}