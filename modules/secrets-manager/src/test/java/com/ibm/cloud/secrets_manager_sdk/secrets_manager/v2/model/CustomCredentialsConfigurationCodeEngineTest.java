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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsConfigurationCodeEngine;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CustomCredentialsConfigurationCodeEngine model.
 */
public class CustomCredentialsConfigurationCodeEngineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCustomCredentialsConfigurationCodeEngine() throws Throwable {
    CustomCredentialsConfigurationCodeEngine customCredentialsConfigurationCodeEngineModel = new CustomCredentialsConfigurationCodeEngine.Builder()
      .jobName("sm-custom-cred-job")
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .region("us-south")
      .build();
    assertEquals(customCredentialsConfigurationCodeEngineModel.jobName(), "sm-custom-cred-job");
    assertEquals(customCredentialsConfigurationCodeEngineModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(customCredentialsConfigurationCodeEngineModel.region(), "us-south");

    String json = TestUtilities.serialize(customCredentialsConfigurationCodeEngineModel);

    CustomCredentialsConfigurationCodeEngine customCredentialsConfigurationCodeEngineModelNew = TestUtilities.deserialize(json, CustomCredentialsConfigurationCodeEngine.class);
    assertTrue(customCredentialsConfigurationCodeEngineModelNew instanceof CustomCredentialsConfigurationCodeEngine);
    assertEquals(customCredentialsConfigurationCodeEngineModelNew.jobName(), "sm-custom-cred-job");
    assertEquals(customCredentialsConfigurationCodeEngineModelNew.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(customCredentialsConfigurationCodeEngineModelNew.region(), "us-south");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCustomCredentialsConfigurationCodeEngineError() throws Throwable {
    new CustomCredentialsConfigurationCodeEngine.Builder().build();
  }

}