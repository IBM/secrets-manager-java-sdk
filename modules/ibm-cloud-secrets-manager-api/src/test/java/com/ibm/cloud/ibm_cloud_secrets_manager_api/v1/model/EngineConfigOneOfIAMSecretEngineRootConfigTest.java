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

package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model;

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.EngineConfigOneOfIAMSecretEngineRootConfig;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EngineConfigOneOfIAMSecretEngineRootConfig model.
 */
public class EngineConfigOneOfIAMSecretEngineRootConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEngineConfigOneOfIAMSecretEngineRootConfig() throws Throwable {
    EngineConfigOneOfIAMSecretEngineRootConfig engineConfigOneOfIamSecretEngineRootConfigModel = new EngineConfigOneOfIAMSecretEngineRootConfig.Builder()
      .apiKey("API_KEY")
      .build();
    assertEquals(engineConfigOneOfIamSecretEngineRootConfigModel.apiKey(), "API_KEY");

    String json = TestUtilities.serialize(engineConfigOneOfIamSecretEngineRootConfigModel);

    EngineConfigOneOfIAMSecretEngineRootConfig engineConfigOneOfIamSecretEngineRootConfigModelNew = TestUtilities.deserialize(json, EngineConfigOneOfIAMSecretEngineRootConfig.class);
    assertTrue(engineConfigOneOfIamSecretEngineRootConfigModelNew instanceof EngineConfigOneOfIAMSecretEngineRootConfig);
    assertEquals(engineConfigOneOfIamSecretEngineRootConfigModelNew.apiKey(), "API_KEY");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEngineConfigOneOfIAMSecretEngineRootConfigError() throws Throwable {
    new EngineConfigOneOfIAMSecretEngineRootConfig.Builder().build();
  }

}