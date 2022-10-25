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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CollectionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PutPolicyOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotationRotationPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PutPolicyOptions model.
 */
public class PutPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutPolicyOptions() throws Throwable {
    CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
      .collectionType("application/vnd.ibm.secrets-manager.config+json")
      .collectionTotal(Long.valueOf("1"))
      .build();
    assertEquals(collectionMetadataModel.collectionType(), "application/vnd.ibm.secrets-manager.config+json");
    assertEquals(collectionMetadataModel.collectionTotal(), Long.valueOf("1"));

    SecretPolicyRotationRotationPolicyRotation secretPolicyRotationRotationModel = new SecretPolicyRotationRotationPolicyRotation.Builder()
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(secretPolicyRotationRotationModel.interval(), Long.valueOf("1"));
    assertEquals(secretPolicyRotationRotationModel.unit(), "day");

    SecretPolicyRotation secretPolicyRotationModel = new SecretPolicyRotation.Builder()
      .type("application/vnd.ibm.secrets-manager.secret.policy+json")
      .rotation(secretPolicyRotationRotationModel)
      .build();
    assertEquals(secretPolicyRotationModel.type(), "application/vnd.ibm.secrets-manager.secret.policy+json");
    assertEquals(secretPolicyRotationModel.rotation(), secretPolicyRotationRotationModel);

    PutPolicyOptions putPolicyOptionsModel = new PutPolicyOptions.Builder()
      .secretType("username_password")
      .id("testString")
      .metadata(collectionMetadataModel)
      .resources(java.util.Arrays.asList(secretPolicyRotationModel))
      .policy("rotation")
      .build();
    assertEquals(putPolicyOptionsModel.secretType(), "username_password");
    assertEquals(putPolicyOptionsModel.id(), "testString");
    assertEquals(putPolicyOptionsModel.metadata(), collectionMetadataModel);
    assertEquals(putPolicyOptionsModel.resources(), java.util.Arrays.asList(secretPolicyRotationModel));
    assertEquals(putPolicyOptionsModel.policy(), "rotation");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutPolicyOptionsError() throws Throwable {
    new PutPolicyOptions.Builder().build();
  }

}