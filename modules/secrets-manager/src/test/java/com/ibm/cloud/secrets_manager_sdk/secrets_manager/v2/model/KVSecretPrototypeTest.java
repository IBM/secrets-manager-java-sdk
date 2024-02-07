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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KVSecretPrototype model.
 */
public class KVSecretPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKVSecretPrototype() throws Throwable {
    KVSecretPrototype kvSecretPrototypeModel = new KVSecretPrototype.Builder()
      .secretType("kv")
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .secretGroupId("default")
      .labels(java.util.Arrays.asList("my-label"))
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(kvSecretPrototypeModel.secretType(), "kv");
    assertEquals(kvSecretPrototypeModel.name(), "my-secret-example");
    assertEquals(kvSecretPrototypeModel.description(), "Extended description for this secret.");
    assertEquals(kvSecretPrototypeModel.secretGroupId(), "default");
    assertEquals(kvSecretPrototypeModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(kvSecretPrototypeModel.data(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(kvSecretPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(kvSecretPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(kvSecretPrototypeModel);

    KVSecretPrototype kvSecretPrototypeModelNew = TestUtilities.deserialize(json, KVSecretPrototype.class);
    assertTrue(kvSecretPrototypeModelNew instanceof KVSecretPrototype);
    assertEquals(kvSecretPrototypeModelNew.secretType(), "kv");
    assertEquals(kvSecretPrototypeModelNew.name(), "my-secret-example");
    assertEquals(kvSecretPrototypeModelNew.description(), "Extended description for this secret.");
    assertEquals(kvSecretPrototypeModelNew.secretGroupId(), "default");
    assertEquals(kvSecretPrototypeModelNew.data().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(kvSecretPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(kvSecretPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testKVSecretPrototypeError() throws Throwable {
    new KVSecretPrototype.Builder().build();
  }

}