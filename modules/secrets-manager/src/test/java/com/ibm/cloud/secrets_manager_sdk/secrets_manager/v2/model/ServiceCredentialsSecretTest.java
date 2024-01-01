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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CosHmacKeys;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsResourceKey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecret;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretCredentials;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretSourceService;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIam;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamApikey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamRole;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamServiceid;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceInstance;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceParameters;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceRole;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ServiceCredentialsSecret model.
 */
public class ServiceCredentialsSecretTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceCredentialsSecret() throws Throwable {
    ServiceCredentialsSecret serviceCredentialsSecretModel = new ServiceCredentialsSecret();
    assertNull(serviceCredentialsSecretModel.getCreatedBy());
    assertNull(serviceCredentialsSecretModel.getCreatedAt());
    assertNull(serviceCredentialsSecretModel.getCrn());
    assertNull(serviceCredentialsSecretModel.getCustomMetadata());
    assertNull(serviceCredentialsSecretModel.getDescription());
    assertNull(serviceCredentialsSecretModel.getId());
    assertNull(serviceCredentialsSecretModel.getLabels());
    assertNull(serviceCredentialsSecretModel.getSecretGroupId());
    assertNull(serviceCredentialsSecretModel.getSecretType());
    assertNull(serviceCredentialsSecretModel.getUpdatedAt());
    assertNull(serviceCredentialsSecretModel.getVersionsTotal());
    assertNull(serviceCredentialsSecretModel.getRotation());
    assertNull(serviceCredentialsSecretModel.getTtl());
    assertNull(serviceCredentialsSecretModel.getSourceService());
    assertNull(serviceCredentialsSecretModel.getCredentials());
  }
}