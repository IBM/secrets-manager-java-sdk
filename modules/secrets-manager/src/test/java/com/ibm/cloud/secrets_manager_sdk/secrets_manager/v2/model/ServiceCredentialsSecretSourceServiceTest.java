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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsResourceKey;
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
 * Unit test class for the ServiceCredentialsSecretSourceService model.
 */
public class ServiceCredentialsSecretSourceServiceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceCredentialsSecretSourceService() throws Throwable {
    ServiceCredentialsSourceServiceInstance serviceCredentialsSourceServiceInstanceModel = new ServiceCredentialsSourceServiceInstance.Builder()
      .crn("testString")
      .build();
    assertEquals(serviceCredentialsSourceServiceInstanceModel.crn(), "testString");

    ServiceCredentialsSourceServiceParameters serviceCredentialsSourceServiceParametersModel = new ServiceCredentialsSourceServiceParameters.Builder()
      .serviceidCrn("testString")
      .add("foo", "testString")
      .build();
    assertEquals(serviceCredentialsSourceServiceParametersModel.getServiceidCrn(), "testString");
    assertEquals(serviceCredentialsSourceServiceParametersModel.get("foo"), "testString");

    ServiceCredentialsSourceServiceRole serviceCredentialsSourceServiceRoleModel = new ServiceCredentialsSourceServiceRole.Builder()
      .crn("testString")
      .build();
    assertEquals(serviceCredentialsSourceServiceRoleModel.crn(), "testString");

    ServiceCredentialsSourceServiceIamApikey serviceCredentialsSourceServiceIamApikeyModel = new ServiceCredentialsSourceServiceIamApikey.Builder()
      .build();

    ServiceCredentialsSourceServiceIamRole serviceCredentialsSourceServiceIamRoleModel = new ServiceCredentialsSourceServiceIamRole.Builder()
      .build();

    ServiceCredentialsSourceServiceIamServiceid serviceCredentialsSourceServiceIamServiceidModel = new ServiceCredentialsSourceServiceIamServiceid.Builder()
      .build();

    ServiceCredentialsSourceServiceIam serviceCredentialsSourceServiceIamModel = new ServiceCredentialsSourceServiceIam.Builder()
      .apikey(serviceCredentialsSourceServiceIamApikeyModel)
      .role(serviceCredentialsSourceServiceIamRoleModel)
      .serviceid(serviceCredentialsSourceServiceIamServiceidModel)
      .build();
    assertEquals(serviceCredentialsSourceServiceIamModel.apikey(), serviceCredentialsSourceServiceIamApikeyModel);
    assertEquals(serviceCredentialsSourceServiceIamModel.role(), serviceCredentialsSourceServiceIamRoleModel);
    assertEquals(serviceCredentialsSourceServiceIamModel.serviceid(), serviceCredentialsSourceServiceIamServiceidModel);

    ServiceCredentialsResourceKey serviceCredentialsResourceKeyModel = new ServiceCredentialsResourceKey.Builder()
      .build();

    ServiceCredentialsSecretSourceService serviceCredentialsSecretSourceServiceModel = new ServiceCredentialsSecretSourceService.Builder()
      .instance(serviceCredentialsSourceServiceInstanceModel)
      .parameters(serviceCredentialsSourceServiceParametersModel)
      .role(serviceCredentialsSourceServiceRoleModel)
      .iam(serviceCredentialsSourceServiceIamModel)
      .resourceKey(serviceCredentialsResourceKeyModel)
      .build();
    assertEquals(serviceCredentialsSecretSourceServiceModel.instance(), serviceCredentialsSourceServiceInstanceModel);
    assertEquals(serviceCredentialsSecretSourceServiceModel.parameters(), serviceCredentialsSourceServiceParametersModel);
    assertEquals(serviceCredentialsSecretSourceServiceModel.role(), serviceCredentialsSourceServiceRoleModel);
    assertEquals(serviceCredentialsSecretSourceServiceModel.iam(), serviceCredentialsSourceServiceIamModel);
    assertEquals(serviceCredentialsSecretSourceServiceModel.resourceKey(), serviceCredentialsResourceKeyModel);

    String json = TestUtilities.serialize(serviceCredentialsSecretSourceServiceModel);

    ServiceCredentialsSecretSourceService serviceCredentialsSecretSourceServiceModelNew = TestUtilities.deserialize(json, ServiceCredentialsSecretSourceService.class);
    assertTrue(serviceCredentialsSecretSourceServiceModelNew instanceof ServiceCredentialsSecretSourceService);
    assertEquals(serviceCredentialsSecretSourceServiceModelNew.instance().toString(), serviceCredentialsSourceServiceInstanceModel.toString());
    assertEquals(serviceCredentialsSecretSourceServiceModelNew.parameters().toString(), serviceCredentialsSourceServiceParametersModel.toString());
    assertEquals(serviceCredentialsSecretSourceServiceModelNew.role().toString(), serviceCredentialsSourceServiceRoleModel.toString());
    assertEquals(serviceCredentialsSecretSourceServiceModelNew.iam().toString(), serviceCredentialsSourceServiceIamModel.toString());
    assertEquals(serviceCredentialsSecretSourceServiceModelNew.resourceKey().toString(), serviceCredentialsResourceKeyModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testServiceCredentialsSecretSourceServiceError() throws Throwable {
    new ServiceCredentialsSecretSourceService.Builder().build();
  }

}