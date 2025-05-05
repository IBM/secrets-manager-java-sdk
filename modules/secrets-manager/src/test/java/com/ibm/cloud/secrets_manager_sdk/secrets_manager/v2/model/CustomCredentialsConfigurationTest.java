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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsConfiguration;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsConfigurationCodeEngine;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsConfigurationSchema;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsConfigurationSchemaCredentials;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CustomCredentialsConfigurationSchemaParameter;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CustomCredentialsConfiguration model.
 */
public class CustomCredentialsConfigurationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCustomCredentialsConfiguration() throws Throwable {
    CustomCredentialsConfiguration customCredentialsConfigurationModel = new CustomCredentialsConfiguration();
    assertNull(customCredentialsConfigurationModel.getConfigType());
    assertNull(customCredentialsConfigurationModel.getName());
    assertNull(customCredentialsConfigurationModel.getSecretType());
    assertNull(customCredentialsConfigurationModel.getCreatedBy());
    assertNull(customCredentialsConfigurationModel.getCreatedAt());
    assertNull(customCredentialsConfigurationModel.getUpdatedAt());
    assertNull(customCredentialsConfigurationModel.getCodeEngineKeyRef());
    assertNull(customCredentialsConfigurationModel.getApiKeyRef());
    assertNull(customCredentialsConfigurationModel.getCodeEngine());
    assertNull(customCredentialsConfigurationModel.getSchema());
    assertNull(customCredentialsConfigurationModel.getTaskTimeout());
  }
}