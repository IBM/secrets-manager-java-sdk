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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsResourceKey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretCredentials;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretVersion;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ServiceCredentialsSecretVersion model.
 */
public class ServiceCredentialsSecretVersionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceCredentialsSecretVersion() throws Throwable {
    ServiceCredentialsSecretVersion serviceCredentialsSecretVersionModel = new ServiceCredentialsSecretVersion();
    assertNull(serviceCredentialsSecretVersionModel.isAutoRotated());
    assertNull(serviceCredentialsSecretVersionModel.getCreatedBy());
    assertNull(serviceCredentialsSecretVersionModel.getCreatedAt());
    assertNull(serviceCredentialsSecretVersionModel.getId());
    assertNull(serviceCredentialsSecretVersionModel.getSecretType());
    assertNull(serviceCredentialsSecretVersionModel.getSecretGroupId());
    assertNull(serviceCredentialsSecretVersionModel.isPayloadAvailable());
    assertNull(serviceCredentialsSecretVersionModel.getAlias());
    assertNull(serviceCredentialsSecretVersionModel.getVersionCustomMetadata());
    assertNull(serviceCredentialsSecretVersionModel.getSecretId());
    assertNull(serviceCredentialsSecretVersionModel.getExpirationDate());
    assertNull(serviceCredentialsSecretVersionModel.getResourceKey());
    assertNull(serviceCredentialsSecretVersionModel.getCredentials());
  }
}