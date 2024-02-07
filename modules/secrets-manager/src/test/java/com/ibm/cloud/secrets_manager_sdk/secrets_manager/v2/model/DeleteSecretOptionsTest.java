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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.DeleteSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteSecretOptions model.
 */
public class DeleteSecretOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteSecretOptions() throws Throwable {
    DeleteSecretOptions deleteSecretOptionsModel = new DeleteSecretOptions.Builder()
      .id("0b5571f7-21e6-42b7-91c5-3f5ac9793a46")
      .build();
    assertEquals(deleteSecretOptionsModel.id(), "0b5571f7-21e6-42b7-91c5-3f5ac9793a46");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecretOptionsError() throws Throwable {
    new DeleteSecretOptions.Builder().build();
  }

}