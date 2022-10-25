/*
 * (C) Copyright IBM Corp. 2022.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IAMCredentialsSecretResource model.
 */
public class IAMCredentialsSecretResourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIAMCredentialsSecretResource() throws Throwable {
    IAMCredentialsSecretResource iamCredentialsSecretResourceModel = new IAMCredentialsSecretResource.Builder()
      .name("testString")
      .description("testString")
      .secretGroupId("testString")
      .labels(java.util.Arrays.asList("testString"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ttl("24h")
      .accessGroups(java.util.Arrays.asList("AccessGroupId-45884031-54be-4dd7-86ff-112511e92699", "AccessGroupId-2c190fb5-0d9d-46c5-acf3-78ecd30e24a0"))
      .serviceId("testString")
      .reuseApiKey(false)
      .build();
    assertEquals(iamCredentialsSecretResourceModel.name(), "testString");
    assertEquals(iamCredentialsSecretResourceModel.description(), "testString");
    assertEquals(iamCredentialsSecretResourceModel.secretGroupId(), "testString");
    assertEquals(iamCredentialsSecretResourceModel.labels(), java.util.Arrays.asList("testString"));
    assertEquals(iamCredentialsSecretResourceModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(iamCredentialsSecretResourceModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(iamCredentialsSecretResourceModel.ttl(), "24h");
    assertEquals(iamCredentialsSecretResourceModel.accessGroups(), java.util.Arrays.asList("AccessGroupId-45884031-54be-4dd7-86ff-112511e92699", "AccessGroupId-2c190fb5-0d9d-46c5-acf3-78ecd30e24a0"));
    assertEquals(iamCredentialsSecretResourceModel.serviceId(), "testString");
    assertEquals(iamCredentialsSecretResourceModel.reuseApiKey(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(iamCredentialsSecretResourceModel);

    IAMCredentialsSecretResource iamCredentialsSecretResourceModelNew = TestUtilities.deserialize(json, IAMCredentialsSecretResource.class);
    assertTrue(iamCredentialsSecretResourceModelNew instanceof IAMCredentialsSecretResource);
    assertEquals(iamCredentialsSecretResourceModelNew.name(), "testString");
    assertEquals(iamCredentialsSecretResourceModelNew.description(), "testString");
    assertEquals(iamCredentialsSecretResourceModelNew.secretGroupId(), "testString");
    assertEquals(iamCredentialsSecretResourceModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(iamCredentialsSecretResourceModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(iamCredentialsSecretResourceModelNew.ttl(), "24h");
    assertEquals(iamCredentialsSecretResourceModelNew.serviceId(), "testString");
    assertEquals(iamCredentialsSecretResourceModelNew.reuseApiKey(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testIAMCredentialsSecretResourceError() throws Throwable {
    new IAMCredentialsSecretResource.Builder().build();
  }

}