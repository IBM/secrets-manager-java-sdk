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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateActionRevokePrototype model.
 */
public class PrivateCertificateActionRevokePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateActionRevokePrototype() throws Throwable {
    PrivateCertificateActionRevokePrototype privateCertificateActionRevokePrototypeModel = new PrivateCertificateActionRevokePrototype.Builder()
      .actionType("private_cert_action_revoke_certificate")
      .build();
    assertEquals(privateCertificateActionRevokePrototypeModel.actionType(), "private_cert_action_revoke_certificate");

    String json = TestUtilities.serialize(privateCertificateActionRevokePrototypeModel);

    PrivateCertificateActionRevokePrototype privateCertificateActionRevokePrototypeModelNew = TestUtilities.deserialize(json, PrivateCertificateActionRevokePrototype.class);
    assertTrue(privateCertificateActionRevokePrototypeModelNew instanceof PrivateCertificateActionRevokePrototype);
    assertEquals(privateCertificateActionRevokePrototypeModelNew.actionType(), "private_cert_action_revoke_certificate");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificateActionRevokePrototypeError() throws Throwable {
    new PrivateCertificateActionRevokePrototype.Builder().build();
  }

}