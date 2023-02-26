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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IAMCredentialsSecretMetadataPatch model.
 */
public class IAMCredentialsSecretMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIAMCredentialsSecretMetadataPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

    IAMCredentialsSecretMetadataPatch iamCredentialsSecretMetadataPatchModel = new IAMCredentialsSecretMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ttl("30m")
      .rotation(rotationPolicyModel)
      .build();
    assertEquals(iamCredentialsSecretMetadataPatchModel.name(), "my-secret-example");
    assertEquals(iamCredentialsSecretMetadataPatchModel.description(), "Extended description for this secret.");
    assertEquals(iamCredentialsSecretMetadataPatchModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(iamCredentialsSecretMetadataPatchModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(iamCredentialsSecretMetadataPatchModel.ttl(), "30m");
    assertEquals(iamCredentialsSecretMetadataPatchModel.rotation(), rotationPolicyModel);

    String json = TestUtilities.serialize(iamCredentialsSecretMetadataPatchModel);

    IAMCredentialsSecretMetadataPatch iamCredentialsSecretMetadataPatchModelNew = TestUtilities.deserialize(json, IAMCredentialsSecretMetadataPatch.class);
    assertTrue(iamCredentialsSecretMetadataPatchModelNew instanceof IAMCredentialsSecretMetadataPatch);
    assertEquals(iamCredentialsSecretMetadataPatchModelNew.name(), "my-secret-example");
    assertEquals(iamCredentialsSecretMetadataPatchModelNew.description(), "Extended description for this secret.");
    assertEquals(iamCredentialsSecretMetadataPatchModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(iamCredentialsSecretMetadataPatchModelNew.ttl(), "30m");
    assertEquals(iamCredentialsSecretMetadataPatchModelNew.rotation().toString(), rotationPolicyModel.toString());
  }
  @Test
  public void testIAMCredentialsSecretMetadataPatchAsPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();

    IAMCredentialsSecretMetadataPatch iamCredentialsSecretMetadataPatchModel = new IAMCredentialsSecretMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ttl("30m")
      .rotation(rotationPolicyModel)
      .build();

    Map<String, Object> mergePatch = iamCredentialsSecretMetadataPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-secret-example");
    assertEquals(mergePatch.get("description"), "Extended description for this secret.");
    assertTrue(mergePatch.containsKey("labels"));
    assertTrue(mergePatch.containsKey("custom_metadata"));
    assertEquals(mergePatch.get("ttl"), "30m");
    assertTrue(mergePatch.containsKey("rotation"));
  }

}