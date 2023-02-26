/*
 * (C) Copyright IBM Corp. 2023.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationCALetsEncryptPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateConfigurationOptions model.
 */
public class CreateConfigurationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateConfigurationOptions() throws Throwable {
    PublicCertificateConfigurationCALetsEncryptPrototype configurationPrototypeModel = new PublicCertificateConfigurationCALetsEncryptPrototype.Builder()
      .configType("public_cert_configuration_ca_lets_encrypt")
      .name("my-example-engine-config")
      .letsEncryptEnvironment("production")
      .letsEncryptPrivateKey("testString")
      .letsEncryptPreferredChain("testString")
      .build();
    assertEquals(configurationPrototypeModel.configType(), "public_cert_configuration_ca_lets_encrypt");
    assertEquals(configurationPrototypeModel.name(), "my-example-engine-config");
    assertEquals(configurationPrototypeModel.letsEncryptEnvironment(), "production");
    assertEquals(configurationPrototypeModel.letsEncryptPrivateKey(), "testString");
    assertEquals(configurationPrototypeModel.letsEncryptPreferredChain(), "testString");

    CreateConfigurationOptions createConfigurationOptionsModel = new CreateConfigurationOptions.Builder()
      .configurationPrototype(configurationPrototypeModel)
      .build();
    assertEquals(createConfigurationOptionsModel.configurationPrototype(), configurationPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigurationOptionsError() throws Throwable {
    new CreateConfigurationOptions.Builder().build();
  }

}