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

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretResourceUsernamePasswordSecretResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretResourceUsernamePasswordSecretResource model.
 */
public class SecretResourceUsernamePasswordSecretResourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretResourceUsernamePasswordSecretResource() throws Throwable {
    SecretResourceUsernamePasswordSecretResource secretResourceUsernamePasswordSecretResourceModel = new SecretResourceUsernamePasswordSecretResource.Builder()
      .type("testString")
      .name("testString")
      .description("testString")
      .secretGroupId("testString")
      .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .username("user123")
      .password("rainy-cloudy-coffee-book")
      .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
      .build();
    assertEquals(secretResourceUsernamePasswordSecretResourceModel.type(), "testString");
    assertEquals(secretResourceUsernamePasswordSecretResourceModel.name(), "testString");
    assertEquals(secretResourceUsernamePasswordSecretResourceModel.description(), "testString");
    assertEquals(secretResourceUsernamePasswordSecretResourceModel.secretGroupId(), "testString");
    assertEquals(secretResourceUsernamePasswordSecretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(secretResourceUsernamePasswordSecretResourceModel.username(), "user123");
    assertEquals(secretResourceUsernamePasswordSecretResourceModel.password(), "rainy-cloudy-coffee-book");
    assertEquals(secretResourceUsernamePasswordSecretResourceModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));

    String json = TestUtilities.serialize(secretResourceUsernamePasswordSecretResourceModel);

    SecretResourceUsernamePasswordSecretResource secretResourceUsernamePasswordSecretResourceModelNew = TestUtilities.deserialize(json, SecretResourceUsernamePasswordSecretResource.class);
    assertTrue(secretResourceUsernamePasswordSecretResourceModelNew instanceof SecretResourceUsernamePasswordSecretResource);
    assertEquals(secretResourceUsernamePasswordSecretResourceModelNew.type(), "testString");
    assertEquals(secretResourceUsernamePasswordSecretResourceModelNew.name(), "testString");
    assertEquals(secretResourceUsernamePasswordSecretResourceModelNew.description(), "testString");
    assertEquals(secretResourceUsernamePasswordSecretResourceModelNew.secretGroupId(), "testString");
    assertEquals(secretResourceUsernamePasswordSecretResourceModelNew.username(), "user123");
    assertEquals(secretResourceUsernamePasswordSecretResourceModelNew.password(), "rainy-cloudy-coffee-book");
    assertEquals(secretResourceUsernamePasswordSecretResourceModelNew.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecretResourceUsernamePasswordSecretResourceError() throws Throwable {
    new SecretResourceUsernamePasswordSecretResource.Builder().build();
  }

}