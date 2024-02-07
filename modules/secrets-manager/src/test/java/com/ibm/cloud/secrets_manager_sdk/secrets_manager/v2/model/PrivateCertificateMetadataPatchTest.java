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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateMetadataPatch model.
 */
public class PrivateCertificateMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateMetadataPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

    PrivateCertificateMetadataPatch privateCertificateMetadataPatchModel = new PrivateCertificateMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .rotation(rotationPolicyModel)
      .build();
    assertEquals(privateCertificateMetadataPatchModel.name(), "my-secret-example");
    assertEquals(privateCertificateMetadataPatchModel.description(), "Extended description for this secret.");
    assertEquals(privateCertificateMetadataPatchModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(privateCertificateMetadataPatchModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(privateCertificateMetadataPatchModel.rotation(), rotationPolicyModel);

    String json = TestUtilities.serialize(privateCertificateMetadataPatchModel);

    PrivateCertificateMetadataPatch privateCertificateMetadataPatchModelNew = TestUtilities.deserialize(json, PrivateCertificateMetadataPatch.class);
    assertTrue(privateCertificateMetadataPatchModelNew instanceof PrivateCertificateMetadataPatch);
    assertEquals(privateCertificateMetadataPatchModelNew.name(), "my-secret-example");
    assertEquals(privateCertificateMetadataPatchModelNew.description(), "Extended description for this secret.");
    assertEquals(privateCertificateMetadataPatchModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(privateCertificateMetadataPatchModelNew.rotation().toString(), rotationPolicyModel.toString());
  }
  @Test
  public void testPrivateCertificateMetadataPatchAsPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();

    PrivateCertificateMetadataPatch privateCertificateMetadataPatchModel = new PrivateCertificateMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .rotation(rotationPolicyModel)
      .build();

    Map<String, Object> mergePatch = privateCertificateMetadataPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-secret-example");
    assertEquals(mergePatch.get("description"), "Extended description for this secret.");
    assertTrue(mergePatch.containsKey("labels"));
    assertTrue(mergePatch.containsKey("custom_metadata"));
    assertTrue(mergePatch.containsKey("rotation"));
  }

}