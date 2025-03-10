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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretRestoreFromVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IAMCredentialsSecretRestoreFromVersionPrototype model.
 */
public class IAMCredentialsSecretRestoreFromVersionPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIAMCredentialsSecretRestoreFromVersionPrototype() throws Throwable {
    IAMCredentialsSecretRestoreFromVersionPrototype iamCredentialsSecretRestoreFromVersionPrototypeModel = new IAMCredentialsSecretRestoreFromVersionPrototype.Builder()
      .restoreFromVersion("current")
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(iamCredentialsSecretRestoreFromVersionPrototypeModel.restoreFromVersion(), "current");
    assertEquals(iamCredentialsSecretRestoreFromVersionPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(iamCredentialsSecretRestoreFromVersionPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(iamCredentialsSecretRestoreFromVersionPrototypeModel);

    IAMCredentialsSecretRestoreFromVersionPrototype iamCredentialsSecretRestoreFromVersionPrototypeModelNew = TestUtilities.deserialize(json, IAMCredentialsSecretRestoreFromVersionPrototype.class);
    assertTrue(iamCredentialsSecretRestoreFromVersionPrototypeModelNew instanceof IAMCredentialsSecretRestoreFromVersionPrototype);
    assertEquals(iamCredentialsSecretRestoreFromVersionPrototypeModelNew.restoreFromVersion(), "current");
    assertEquals(iamCredentialsSecretRestoreFromVersionPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(iamCredentialsSecretRestoreFromVersionPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testIAMCredentialsSecretRestoreFromVersionPrototypeError() throws Throwable {
    new IAMCredentialsSecretRestoreFromVersionPrototype.Builder().build();
  }

}