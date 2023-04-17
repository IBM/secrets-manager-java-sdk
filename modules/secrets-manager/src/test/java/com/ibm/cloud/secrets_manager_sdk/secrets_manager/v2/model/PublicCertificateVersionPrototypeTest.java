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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateRotationObject;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicCertificateVersionPrototype model.
 */
public class PublicCertificateVersionPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicCertificateVersionPrototype() throws Throwable {
    PublicCertificateRotationObject publicCertificateRotationObjectModel = new PublicCertificateRotationObject.Builder()
      .rotateKeys(true)
      .build();
    assertEquals(publicCertificateRotationObjectModel.rotateKeys(), Boolean.valueOf(true));

    PublicCertificateVersionPrototype publicCertificateVersionPrototypeModel = new PublicCertificateVersionPrototype.Builder()
      .rotation(publicCertificateRotationObjectModel)
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(publicCertificateVersionPrototypeModel.rotation(), publicCertificateRotationObjectModel);
    assertEquals(publicCertificateVersionPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(publicCertificateVersionPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(publicCertificateVersionPrototypeModel);

    PublicCertificateVersionPrototype publicCertificateVersionPrototypeModelNew = TestUtilities.deserialize(json, PublicCertificateVersionPrototype.class);
    assertTrue(publicCertificateVersionPrototypeModelNew instanceof PublicCertificateVersionPrototype);
    assertEquals(publicCertificateVersionPrototypeModelNew.rotation().toString(), publicCertificateRotationObjectModel.toString());
    assertEquals(publicCertificateVersionPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(publicCertificateVersionPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublicCertificateVersionPrototypeError() throws Throwable {
    new PublicCertificateVersionPrototype.Builder().build();
  }

}