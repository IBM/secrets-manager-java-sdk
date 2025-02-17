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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretSourceService;
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
 * Unit test class for the ServiceCredentialsSecretPrototype model.
 */
public class ServiceCredentialsSecretPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceCredentialsSecretPrototype() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

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

    ServiceCredentialsSecretSourceService serviceCredentialsSecretSourceServiceModel = new ServiceCredentialsSecretSourceService.Builder()
      .instance(serviceCredentialsSourceServiceInstanceModel)
      .parameters(serviceCredentialsSourceServiceParametersModel)
      .role(serviceCredentialsSourceServiceRoleModel)
      .build();
    assertEquals(serviceCredentialsSecretSourceServiceModel.instance(), serviceCredentialsSourceServiceInstanceModel);
    assertEquals(serviceCredentialsSecretSourceServiceModel.parameters(), serviceCredentialsSourceServiceParametersModel);
    assertEquals(serviceCredentialsSecretSourceServiceModel.role(), serviceCredentialsSourceServiceRoleModel);

    ServiceCredentialsSecretPrototype serviceCredentialsSecretPrototypeModel = new ServiceCredentialsSecretPrototype.Builder()
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .name("my-secret-example")
      .rotation(rotationPolicyModel)
      .secretGroupId("default")
      .secretType("service_credentials")
      .sourceService(serviceCredentialsSecretSourceServiceModel)
      .ttl("1d")
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(serviceCredentialsSecretPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(serviceCredentialsSecretPrototypeModel.description(), "Extended description for this secret.");
    assertEquals(serviceCredentialsSecretPrototypeModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(serviceCredentialsSecretPrototypeModel.name(), "my-secret-example");
    assertEquals(serviceCredentialsSecretPrototypeModel.rotation(), rotationPolicyModel);
    assertEquals(serviceCredentialsSecretPrototypeModel.secretGroupId(), "default");
    assertEquals(serviceCredentialsSecretPrototypeModel.secretType(), "service_credentials");
    assertEquals(serviceCredentialsSecretPrototypeModel.sourceService(), serviceCredentialsSecretSourceServiceModel);
    assertEquals(serviceCredentialsSecretPrototypeModel.ttl(), "1d");
    assertEquals(serviceCredentialsSecretPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(serviceCredentialsSecretPrototypeModel);

    ServiceCredentialsSecretPrototype serviceCredentialsSecretPrototypeModelNew = TestUtilities.deserialize(json, ServiceCredentialsSecretPrototype.class);
    assertTrue(serviceCredentialsSecretPrototypeModelNew instanceof ServiceCredentialsSecretPrototype);
    assertEquals(serviceCredentialsSecretPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(serviceCredentialsSecretPrototypeModelNew.description(), "Extended description for this secret.");
    assertEquals(serviceCredentialsSecretPrototypeModelNew.name(), "my-secret-example");
    assertEquals(serviceCredentialsSecretPrototypeModelNew.rotation().toString(), rotationPolicyModel.toString());
    assertEquals(serviceCredentialsSecretPrototypeModelNew.secretGroupId(), "default");
    assertEquals(serviceCredentialsSecretPrototypeModelNew.secretType(), "service_credentials");
    assertEquals(serviceCredentialsSecretPrototypeModelNew.sourceService().toString(), serviceCredentialsSecretSourceServiceModel.toString());
    assertEquals(serviceCredentialsSecretPrototypeModelNew.ttl(), "1d");
    assertEquals(serviceCredentialsSecretPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testServiceCredentialsSecretPrototypeError() throws Throwable {
    new ServiceCredentialsSecretPrototype.Builder().build();
  }

}