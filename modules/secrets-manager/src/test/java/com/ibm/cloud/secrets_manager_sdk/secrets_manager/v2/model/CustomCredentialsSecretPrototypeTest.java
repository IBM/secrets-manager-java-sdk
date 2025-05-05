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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CustomCredentialsSecretPrototype model.
 */
public class CustomCredentialsSecretPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCustomCredentialsSecretPrototype() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

    CustomCredentialsSecretPrototype customCredentialsSecretPrototypeModel = new CustomCredentialsSecretPrototype.Builder()
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .name("my-secret-example")
      .rotation(rotationPolicyModel)
      .secretGroupId("default")
      .secretType("custom_credentials")
      .ttl("1d")
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .configuration("testString")
      .parameters(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(customCredentialsSecretPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(customCredentialsSecretPrototypeModel.description(), "Extended description for this secret.");
    assertEquals(customCredentialsSecretPrototypeModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(customCredentialsSecretPrototypeModel.name(), "my-secret-example");
    assertEquals(customCredentialsSecretPrototypeModel.rotation(), rotationPolicyModel);
    assertEquals(customCredentialsSecretPrototypeModel.secretGroupId(), "default");
    assertEquals(customCredentialsSecretPrototypeModel.secretType(), "custom_credentials");
    assertEquals(customCredentialsSecretPrototypeModel.ttl(), "1d");
    assertEquals(customCredentialsSecretPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(customCredentialsSecretPrototypeModel.configuration(), "testString");
    assertEquals(customCredentialsSecretPrototypeModel.parameters(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(customCredentialsSecretPrototypeModel);

    CustomCredentialsSecretPrototype customCredentialsSecretPrototypeModelNew = TestUtilities.deserialize(json, CustomCredentialsSecretPrototype.class);
    assertTrue(customCredentialsSecretPrototypeModelNew instanceof CustomCredentialsSecretPrototype);
    assertEquals(customCredentialsSecretPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(customCredentialsSecretPrototypeModelNew.description(), "Extended description for this secret.");
    assertEquals(customCredentialsSecretPrototypeModelNew.name(), "my-secret-example");
    assertEquals(customCredentialsSecretPrototypeModelNew.rotation().toString(), rotationPolicyModel.toString());
    assertEquals(customCredentialsSecretPrototypeModelNew.secretGroupId(), "default");
    assertEquals(customCredentialsSecretPrototypeModelNew.secretType(), "custom_credentials");
    assertEquals(customCredentialsSecretPrototypeModelNew.ttl(), "1d");
    assertEquals(customCredentialsSecretPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(customCredentialsSecretPrototypeModelNew.configuration(), "testString");
    assertEquals(customCredentialsSecretPrototypeModelNew.parameters().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCustomCredentialsSecretPrototypeError() throws Throwable {
    new CustomCredentialsSecretPrototype.Builder().build();
  }

}