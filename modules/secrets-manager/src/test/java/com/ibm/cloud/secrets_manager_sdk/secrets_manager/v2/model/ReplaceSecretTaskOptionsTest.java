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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsNewCredentials;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ReplaceSecretTaskOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.SecretTaskPrototypeUpdateSecretTaskCredentialsCreated;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceSecretTaskOptions model.
 */
public class ReplaceSecretTaskOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceSecretTaskOptions() throws Throwable {
    CustomCredentialsNewCredentials customCredentialsNewCredentialsModel = new CustomCredentialsNewCredentials.Builder()
      .id("b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5")
      .payload(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(customCredentialsNewCredentialsModel.id(), "b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5");
    assertEquals(customCredentialsNewCredentialsModel.payload(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    SecretTaskPrototypeUpdateSecretTaskCredentialsCreated secretTaskPrototypeModel = new SecretTaskPrototypeUpdateSecretTaskCredentialsCreated.Builder()
      .status("credentials_created")
      .credentials(customCredentialsNewCredentialsModel)
      .build();
    assertEquals(secretTaskPrototypeModel.status(), "credentials_created");
    assertEquals(secretTaskPrototypeModel.credentials(), customCredentialsNewCredentialsModel);

    ReplaceSecretTaskOptions replaceSecretTaskOptionsModel = new ReplaceSecretTaskOptions.Builder()
      .secretId("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .id("sm-task-a436bebd-dbbd-5c0d-ab35-1232f1234f95")
      .taskPut(secretTaskPrototypeModel)
      .build();
    assertEquals(replaceSecretTaskOptionsModel.secretId(), "0b5571f7-21e6-42b7-91c5-3f5ac9793a46");
    assertEquals(replaceSecretTaskOptionsModel.id(), "sm-task-a436bebd-dbbd-5c0d-ab35-1232f1234f95");
    assertEquals(replaceSecretTaskOptionsModel.taskPut(), secretTaskPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSecretTaskOptionsError() throws Throwable {
    new ReplaceSecretTaskOptions.Builder().build();
  }

}