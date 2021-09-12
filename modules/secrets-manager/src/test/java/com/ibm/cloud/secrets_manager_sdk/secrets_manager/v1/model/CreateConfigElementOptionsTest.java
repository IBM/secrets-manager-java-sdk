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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ConfigElementDefConfigLetsEncryptConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateConfigElementOptions model.
 */
public class CreateConfigElementOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateConfigElementOptions() throws Throwable {
    ConfigElementDefConfigLetsEncryptConfig configElementDefConfigModel = new ConfigElementDefConfigLetsEncryptConfig.Builder()
      .privateKey("testString")
      .build();
    assertEquals(configElementDefConfigModel.privateKey(), "testString");

    CreateConfigElementOptions createConfigElementOptionsModel = new CreateConfigElementOptions.Builder()
      .secretType("public_cert")
      .configElement("certificate_authorities")
      .name("testString")
      .type("letsencrypt")
      .config(configElementDefConfigModel)
      .build();
    assertEquals(createConfigElementOptionsModel.secretType(), "public_cert");
    assertEquals(createConfigElementOptionsModel.configElement(), "certificate_authorities");
    assertEquals(createConfigElementOptionsModel.name(), "testString");
    assertEquals(createConfigElementOptionsModel.type(), "letsencrypt");
    assertEquals(createConfigElementOptionsModel.config(), configElementDefConfigModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigElementOptionsError() throws Throwable {
    new CreateConfigElementOptions.Builder().build();
  }

}