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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ArbitrarySecretPrototype model.
 */
public class ArbitrarySecretPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testArbitrarySecretPrototype() throws Throwable {
    ArbitrarySecretPrototype arbitrarySecretPrototypeModel = new ArbitrarySecretPrototype.Builder()
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .description("Extended description for this secret.")
      .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
      .labels(java.util.Arrays.asList("my-label"))
      .name("my-secret-example")
      .secretGroupId("default")
      .secretType("arbitrary")
      .payload("secret-credentials")
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(arbitrarySecretPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(arbitrarySecretPrototypeModel.description(), "Extended description for this secret.");
    assertEquals(arbitrarySecretPrototypeModel.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));
    assertEquals(arbitrarySecretPrototypeModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(arbitrarySecretPrototypeModel.name(), "my-secret-example");
    assertEquals(arbitrarySecretPrototypeModel.secretGroupId(), "default");
    assertEquals(arbitrarySecretPrototypeModel.secretType(), "arbitrary");
    assertEquals(arbitrarySecretPrototypeModel.payload(), "secret-credentials");
    assertEquals(arbitrarySecretPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(arbitrarySecretPrototypeModel);

    ArbitrarySecretPrototype arbitrarySecretPrototypeModelNew = TestUtilities.deserialize(json, ArbitrarySecretPrototype.class);
    assertTrue(arbitrarySecretPrototypeModelNew instanceof ArbitrarySecretPrototype);
    assertEquals(arbitrarySecretPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(arbitrarySecretPrototypeModelNew.description(), "Extended description for this secret.");
    assertEquals(arbitrarySecretPrototypeModelNew.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));
    assertEquals(arbitrarySecretPrototypeModelNew.name(), "my-secret-example");
    assertEquals(arbitrarySecretPrototypeModelNew.secretGroupId(), "default");
    assertEquals(arbitrarySecretPrototypeModelNew.secretType(), "arbitrary");
    assertEquals(arbitrarySecretPrototypeModelNew.payload(), "secret-credentials");
    assertEquals(arbitrarySecretPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testArbitrarySecretPrototypeError() throws Throwable {
    new ArbitrarySecretPrototype.Builder().build();
  }

}