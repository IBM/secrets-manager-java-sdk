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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ServiceCredentialsSecretMetadataPatch model.
 */
public class ServiceCredentialsSecretMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceCredentialsSecretMetadataPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

    ServiceCredentialsSecretMetadataPatch serviceCredentialsSecretMetadataPatchModel = new ServiceCredentialsSecretMetadataPatch.Builder()
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .name("my-secret-example")
      .rotation(rotationPolicyModel)
      .ttl("1d")
      .build();
    assertEquals(serviceCredentialsSecretMetadataPatchModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(serviceCredentialsSecretMetadataPatchModel.description(), "Extended description for this secret.");
    assertEquals(serviceCredentialsSecretMetadataPatchModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(serviceCredentialsSecretMetadataPatchModel.name(), "my-secret-example");
    assertEquals(serviceCredentialsSecretMetadataPatchModel.rotation(), rotationPolicyModel);
    assertEquals(serviceCredentialsSecretMetadataPatchModel.ttl(), "1d");

    String json = TestUtilities.serialize(serviceCredentialsSecretMetadataPatchModel);

    ServiceCredentialsSecretMetadataPatch serviceCredentialsSecretMetadataPatchModelNew = TestUtilities.deserialize(json, ServiceCredentialsSecretMetadataPatch.class);
    assertTrue(serviceCredentialsSecretMetadataPatchModelNew instanceof ServiceCredentialsSecretMetadataPatch);
    assertEquals(serviceCredentialsSecretMetadataPatchModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(serviceCredentialsSecretMetadataPatchModelNew.description(), "Extended description for this secret.");
    assertEquals(serviceCredentialsSecretMetadataPatchModelNew.name(), "my-secret-example");
    assertEquals(serviceCredentialsSecretMetadataPatchModelNew.rotation().toString(), rotationPolicyModel.toString());
    assertEquals(serviceCredentialsSecretMetadataPatchModelNew.ttl(), "1d");
  }
  @Test
  public void testServiceCredentialsSecretMetadataPatchAsPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();

    ServiceCredentialsSecretMetadataPatch serviceCredentialsSecretMetadataPatchModel = new ServiceCredentialsSecretMetadataPatch.Builder()
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .name("my-secret-example")
      .rotation(rotationPolicyModel)
      .ttl("1d")
      .build();

    Map<String, Object> mergePatch = serviceCredentialsSecretMetadataPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("custom_metadata"));
    assertEquals(mergePatch.get("description"), "Extended description for this secret.");
    assertTrue(mergePatch.containsKey("labels"));
    assertEquals(mergePatch.get("name"), "my-secret-example");
    assertTrue(mergePatch.containsKey("rotation"));
    assertEquals(mergePatch.get("ttl"), "1d");
  }

}