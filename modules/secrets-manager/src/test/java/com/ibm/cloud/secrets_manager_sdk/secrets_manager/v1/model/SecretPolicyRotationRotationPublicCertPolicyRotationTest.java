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

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretPolicyRotationRotationPublicCertPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.Warning;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretPolicyRotationRotationPublicCertPolicyRotation model.
 */
public class SecretPolicyRotationRotationPublicCertPolicyRotationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretPolicyRotationRotationPublicCertPolicyRotation() throws Throwable {
    Warning warningModel = new Warning.Builder()
      .code("testString")
      .message("testString")
      .build();
    assertEquals(warningModel.code(), "testString");
    assertEquals(warningModel.message(), "testString");

    SecretPolicyRotationRotationPublicCertPolicyRotation secretPolicyRotationRotationPublicCertPolicyRotationModel = new SecretPolicyRotationRotationPublicCertPolicyRotation.Builder()
      .autoRotate(false)
      .rotateKeys(false)
      .warning(warningModel)
      .build();
    assertEquals(secretPolicyRotationRotationPublicCertPolicyRotationModel.autoRotate(), Boolean.valueOf(false));
    assertEquals(secretPolicyRotationRotationPublicCertPolicyRotationModel.rotateKeys(), Boolean.valueOf(false));
    assertEquals(secretPolicyRotationRotationPublicCertPolicyRotationModel.warning(), warningModel);

    String json = TestUtilities.serialize(secretPolicyRotationRotationPublicCertPolicyRotationModel);

    SecretPolicyRotationRotationPublicCertPolicyRotation secretPolicyRotationRotationPublicCertPolicyRotationModelNew = TestUtilities.deserialize(json, SecretPolicyRotationRotationPublicCertPolicyRotation.class);
    assertTrue(secretPolicyRotationRotationPublicCertPolicyRotationModelNew instanceof SecretPolicyRotationRotationPublicCertPolicyRotation);
    assertEquals(secretPolicyRotationRotationPublicCertPolicyRotationModelNew.autoRotate(), Boolean.valueOf(false));
    assertEquals(secretPolicyRotationRotationPublicCertPolicyRotationModelNew.rotateKeys(), Boolean.valueOf(false));
    assertEquals(secretPolicyRotationRotationPublicCertPolicyRotationModelNew.warning().toString(), warningModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecretPolicyRotationRotationPublicCertPolicyRotationError() throws Throwable {
    new SecretPolicyRotationRotationPublicCertPolicyRotation.Builder().build();
  }

}