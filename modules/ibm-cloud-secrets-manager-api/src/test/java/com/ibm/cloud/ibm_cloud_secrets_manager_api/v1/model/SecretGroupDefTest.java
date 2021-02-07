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

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.CollectionMetadata;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretGroupDef;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretGroupResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretGroupDef model.
 */
public class SecretGroupDefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretGroupDef() throws Throwable {
    CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
      .collectionType("application/vnd.ibm.secrets-manager.secret+json")
      .collectionTotal(Long.valueOf("1"))
      .build();
    assertEquals(collectionMetadataModel.collectionType(), "application/vnd.ibm.secrets-manager.secret+json");
    assertEquals(collectionMetadataModel.collectionTotal(), Long.valueOf("1"));

    SecretGroupResource secretGroupResourceModel = new SecretGroupResource.Builder()
      .name("my-secret-group")
      .description("Extended description for this group.")
      .add("foo", "testString")
      .build();
    assertEquals(secretGroupResourceModel.getName(), "my-secret-group");
    assertEquals(secretGroupResourceModel.getDescription(), "Extended description for this group.");
    assertEquals(secretGroupResourceModel.get("foo"), "testString");

    SecretGroupDef secretGroupDefModel = new SecretGroupDef.Builder()
      .metadata(collectionMetadataModel)
      .resources(new java.util.ArrayList<SecretGroupResource>(java.util.Arrays.asList(secretGroupResourceModel)))
      .build();
    assertEquals(secretGroupDefModel.metadata(), collectionMetadataModel);
    assertEquals(secretGroupDefModel.resources(), new java.util.ArrayList<SecretGroupResource>(java.util.Arrays.asList(secretGroupResourceModel)));

    String json = TestUtilities.serialize(secretGroupDefModel);

    SecretGroupDef secretGroupDefModelNew = TestUtilities.deserialize(json, SecretGroupDef.class);
    assertTrue(secretGroupDefModelNew instanceof SecretGroupDef);
    assertEquals(secretGroupDefModelNew.metadata().toString(), collectionMetadataModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecretGroupDefError() throws Throwable {
    new SecretGroupDef.Builder().build();
  }

}