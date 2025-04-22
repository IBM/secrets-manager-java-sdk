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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretTaskError;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretTaskPrototypeUpdateSecretTaskFailed;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretTaskPrototypeUpdateSecretTaskFailed model.
 */
public class SecretTaskPrototypeUpdateSecretTaskFailedTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretTaskPrototypeUpdateSecretTaskFailed() throws Throwable {
    SecretTaskError secretTaskErrorModel = new SecretTaskError.Builder()
      .code("testString")
      .description("Failed to create credentials")
      .build();
    assertEquals(secretTaskErrorModel.code(), "testString");
    assertEquals(secretTaskErrorModel.description(), "Failed to create credentials");

    SecretTaskPrototypeUpdateSecretTaskFailed secretTaskPrototypeUpdateSecretTaskFailedModel = new SecretTaskPrototypeUpdateSecretTaskFailed.Builder()
      .status("failed")
      .errors(java.util.Arrays.asList(secretTaskErrorModel))
      .build();
    assertEquals(secretTaskPrototypeUpdateSecretTaskFailedModel.status(), "failed");
    assertEquals(secretTaskPrototypeUpdateSecretTaskFailedModel.errors(), java.util.Arrays.asList(secretTaskErrorModel));

    String json = TestUtilities.serialize(secretTaskPrototypeUpdateSecretTaskFailedModel);

    SecretTaskPrototypeUpdateSecretTaskFailed secretTaskPrototypeUpdateSecretTaskFailedModelNew = TestUtilities.deserialize(json, SecretTaskPrototypeUpdateSecretTaskFailed.class);
    assertTrue(secretTaskPrototypeUpdateSecretTaskFailedModelNew instanceof SecretTaskPrototypeUpdateSecretTaskFailed);
    assertEquals(secretTaskPrototypeUpdateSecretTaskFailedModelNew.status(), "failed");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecretTaskPrototypeUpdateSecretTaskFailedError() throws Throwable {
    new SecretTaskPrototypeUpdateSecretTaskFailed.Builder().build();
  }

}