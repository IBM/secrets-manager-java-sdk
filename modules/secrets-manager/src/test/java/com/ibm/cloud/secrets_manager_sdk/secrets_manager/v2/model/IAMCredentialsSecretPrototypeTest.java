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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.IAMCredentialsSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IAMCredentialsSecretPrototype model.
 */
public class IAMCredentialsSecretPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIAMCredentialsSecretPrototype() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

    IAMCredentialsSecretPrototype iamCredentialsSecretPrototypeModel = new IAMCredentialsSecretPrototype.Builder()
      .secretType("iam_credentials")
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .secretGroupId("default")
      .labels(java.util.Arrays.asList("my-label"))
      .ttl("1d")
      .accessGroups(java.util.Arrays.asList("AccessGroupId-45884031-54be-4dd7-86ff-112511e92699"))
      .serviceId("ServiceId-bb4ccc31-bd31-493a-bb58-52ec399800be")
      .reuseApiKey(true)
      .rotation(rotationPolicyModel)
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(iamCredentialsSecretPrototypeModel.secretType(), "iam_credentials");
    assertEquals(iamCredentialsSecretPrototypeModel.name(), "my-secret-example");
    assertEquals(iamCredentialsSecretPrototypeModel.description(), "Extended description for this secret.");
    assertEquals(iamCredentialsSecretPrototypeModel.secretGroupId(), "default");
    assertEquals(iamCredentialsSecretPrototypeModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(iamCredentialsSecretPrototypeModel.ttl(), "1d");
    assertEquals(iamCredentialsSecretPrototypeModel.accessGroups(), java.util.Arrays.asList("AccessGroupId-45884031-54be-4dd7-86ff-112511e92699"));
    assertEquals(iamCredentialsSecretPrototypeModel.serviceId(), "ServiceId-bb4ccc31-bd31-493a-bb58-52ec399800be");
    assertEquals(iamCredentialsSecretPrototypeModel.reuseApiKey(), Boolean.valueOf(true));
    assertEquals(iamCredentialsSecretPrototypeModel.rotation(), rotationPolicyModel);
    assertEquals(iamCredentialsSecretPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(iamCredentialsSecretPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(iamCredentialsSecretPrototypeModel);

    IAMCredentialsSecretPrototype iamCredentialsSecretPrototypeModelNew = TestUtilities.deserialize(json, IAMCredentialsSecretPrototype.class);
    assertTrue(iamCredentialsSecretPrototypeModelNew instanceof IAMCredentialsSecretPrototype);
    assertEquals(iamCredentialsSecretPrototypeModelNew.secretType(), "iam_credentials");
    assertEquals(iamCredentialsSecretPrototypeModelNew.name(), "my-secret-example");
    assertEquals(iamCredentialsSecretPrototypeModelNew.description(), "Extended description for this secret.");
    assertEquals(iamCredentialsSecretPrototypeModelNew.secretGroupId(), "default");
    assertEquals(iamCredentialsSecretPrototypeModelNew.ttl(), "1d");
    assertEquals(iamCredentialsSecretPrototypeModelNew.serviceId(), "ServiceId-bb4ccc31-bd31-493a-bb58-52ec399800be");
    assertEquals(iamCredentialsSecretPrototypeModelNew.reuseApiKey(), Boolean.valueOf(true));
    assertEquals(iamCredentialsSecretPrototypeModelNew.rotation().toString(), rotationPolicyModel.toString());
    assertEquals(iamCredentialsSecretPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(iamCredentialsSecretPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testIAMCredentialsSecretPrototypeError() throws Throwable {
    new IAMCredentialsSecretPrototype.Builder().build();
  }

}