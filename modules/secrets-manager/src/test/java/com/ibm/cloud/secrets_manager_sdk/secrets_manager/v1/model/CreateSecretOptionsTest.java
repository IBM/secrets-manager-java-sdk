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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CollectionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSecretOptions model.
 */
public class CreateSecretOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSecretOptions() throws Throwable {
    CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
      .collectionType("application/vnd.ibm.secrets-manager.config+json")
      .collectionTotal(Long.valueOf("1"))
      .build();
    assertEquals(collectionMetadataModel.collectionType(), "application/vnd.ibm.secrets-manager.config+json");
    assertEquals(collectionMetadataModel.collectionTotal(), Long.valueOf("1"));

    ArbitrarySecretResource secretResourceModel = new ArbitrarySecretResource.Builder()
      .name("testString")
      .description("testString")
      .secretGroupId("testString")
      .labels(java.util.Arrays.asList("testString"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
      .payload("testString")
      .build();
    assertEquals(secretResourceModel.name(), "testString");
    assertEquals(secretResourceModel.description(), "testString");
    assertEquals(secretResourceModel.secretGroupId(), "testString");
    assertEquals(secretResourceModel.labels(), java.util.Arrays.asList("testString"));
    assertEquals(secretResourceModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(secretResourceModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(secretResourceModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
    assertEquals(secretResourceModel.payload(), "testString");

    CreateSecretOptions createSecretOptionsModel = new CreateSecretOptions.Builder()
      .secretType("arbitrary")
      .metadata(collectionMetadataModel)
      .resources(java.util.Arrays.asList(secretResourceModel))
      .build();
    assertEquals(createSecretOptionsModel.secretType(), "arbitrary");
    assertEquals(createSecretOptionsModel.metadata(), collectionMetadataModel);
    assertEquals(createSecretOptionsModel.resources(), java.util.Arrays.asList(secretResourceModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretOptionsError() throws Throwable {
    new CreateSecretOptions.Builder().build();
  }

}