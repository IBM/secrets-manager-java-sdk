/*
 * (C) Copyright IBM Corp. 2021.
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

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementDef;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigElementDef model.
 */
public class ConfigElementDefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigElementDef() throws Throwable {
    ConfigElementDef configElementDefModel = new ConfigElementDef.Builder()
      .name("testString")
      .type("testString")
      .config(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(configElementDefModel.name(), "testString");
    assertEquals(configElementDefModel.type(), "testString");
    assertEquals(configElementDefModel.config(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    String json = TestUtilities.serialize(configElementDefModel);

    ConfigElementDef configElementDefModelNew = TestUtilities.deserialize(json, ConfigElementDef.class);
    assertTrue(configElementDefModelNew instanceof ConfigElementDef);
    assertEquals(configElementDefModelNew.name(), "testString");
    assertEquals(configElementDefModelNew.type(), "testString");
    assertEquals(configElementDefModelNew.config().toString(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } }.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigElementDefError() throws Throwable {
    new ConfigElementDef.Builder().build();
  }

}