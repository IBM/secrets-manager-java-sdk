/*
 * (C) Copyright IBM Corp. 2022.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.LockSecretBodyLocksItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.LockSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LockSecretOptions model.
 */
public class LockSecretOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLockSecretOptions() throws Throwable {
    LockSecretBodyLocksItem lockSecretBodyLocksItemModel = new LockSecretBodyLocksItem.Builder()
      .name("testString")
      .description("testString")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(lockSecretBodyLocksItemModel.name(), "testString");
    assertEquals(lockSecretBodyLocksItemModel.description(), "testString");
    assertEquals(lockSecretBodyLocksItemModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    LockSecretOptions lockSecretOptionsModel = new LockSecretOptions.Builder()
      .secretType("arbitrary")
      .id("testString")
      .locks(java.util.Arrays.asList(lockSecretBodyLocksItemModel))
      .mode("exclusive")
      .build();
    assertEquals(lockSecretOptionsModel.secretType(), "arbitrary");
    assertEquals(lockSecretOptionsModel.id(), "testString");
    assertEquals(lockSecretOptionsModel.locks(), java.util.Arrays.asList(lockSecretBodyLocksItemModel));
    assertEquals(lockSecretOptionsModel.mode(), "exclusive");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLockSecretOptionsError() throws Throwable {
    new LockSecretOptions.Builder().build();
  }

}