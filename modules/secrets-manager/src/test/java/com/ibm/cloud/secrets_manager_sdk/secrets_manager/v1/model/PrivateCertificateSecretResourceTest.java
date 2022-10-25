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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertificateSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.Rotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateSecretResource model.
 */
public class PrivateCertificateSecretResourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateSecretResource() throws Throwable {
    Rotation rotationModel = new Rotation.Builder()
      .autoRotate(false)
      .rotateKeys(false)
      .interval(Long.valueOf("26"))
      .unit("day")
      .build();
    assertEquals(rotationModel.autoRotate(), Boolean.valueOf(false));
    assertEquals(rotationModel.rotateKeys(), Boolean.valueOf(false));
    assertEquals(rotationModel.interval(), Long.valueOf("26"));
    assertEquals(rotationModel.unit(), "day");

    PrivateCertificateSecretResource privateCertificateSecretResourceModel = new PrivateCertificateSecretResource.Builder()
      .name("testString")
      .description("testString")
      .secretGroupId("testString")
      .labels(java.util.Arrays.asList("testString"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .certificateTemplate("cert-template-1")
      .commonName("example.com")
      .altNames("testString")
      .ipSans("testString")
      .uriSans("testString")
      .otherSans(java.util.Arrays.asList("testString"))
      .ttl("12h")
      .format("pem")
      .privateKeyFormat("der")
      .excludeCnFromSans(false)
      .rotation(rotationModel)
      .build();
    assertEquals(privateCertificateSecretResourceModel.name(), "testString");
    assertEquals(privateCertificateSecretResourceModel.description(), "testString");
    assertEquals(privateCertificateSecretResourceModel.secretGroupId(), "testString");
    assertEquals(privateCertificateSecretResourceModel.labels(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateSecretResourceModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(privateCertificateSecretResourceModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(privateCertificateSecretResourceModel.certificateTemplate(), "cert-template-1");
    assertEquals(privateCertificateSecretResourceModel.commonName(), "example.com");
    assertEquals(privateCertificateSecretResourceModel.altNames(), "testString");
    assertEquals(privateCertificateSecretResourceModel.ipSans(), "testString");
    assertEquals(privateCertificateSecretResourceModel.uriSans(), "testString");
    assertEquals(privateCertificateSecretResourceModel.otherSans(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateSecretResourceModel.ttl(), "12h");
    assertEquals(privateCertificateSecretResourceModel.format(), "pem");
    assertEquals(privateCertificateSecretResourceModel.privateKeyFormat(), "der");
    assertEquals(privateCertificateSecretResourceModel.excludeCnFromSans(), Boolean.valueOf(false));
    assertEquals(privateCertificateSecretResourceModel.rotation(), rotationModel);

    String json = TestUtilities.serialize(privateCertificateSecretResourceModel);

    PrivateCertificateSecretResource privateCertificateSecretResourceModelNew = TestUtilities.deserialize(json, PrivateCertificateSecretResource.class);
    assertTrue(privateCertificateSecretResourceModelNew instanceof PrivateCertificateSecretResource);
    assertEquals(privateCertificateSecretResourceModelNew.name(), "testString");
    assertEquals(privateCertificateSecretResourceModelNew.description(), "testString");
    assertEquals(privateCertificateSecretResourceModelNew.secretGroupId(), "testString");
    assertEquals(privateCertificateSecretResourceModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(privateCertificateSecretResourceModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(privateCertificateSecretResourceModelNew.certificateTemplate(), "cert-template-1");
    assertEquals(privateCertificateSecretResourceModelNew.commonName(), "example.com");
    assertEquals(privateCertificateSecretResourceModelNew.altNames(), "testString");
    assertEquals(privateCertificateSecretResourceModelNew.ipSans(), "testString");
    assertEquals(privateCertificateSecretResourceModelNew.uriSans(), "testString");
    assertEquals(privateCertificateSecretResourceModelNew.ttl(), "12h");
    assertEquals(privateCertificateSecretResourceModelNew.format(), "pem");
    assertEquals(privateCertificateSecretResourceModelNew.privateKeyFormat(), "der");
    assertEquals(privateCertificateSecretResourceModelNew.excludeCnFromSans(), Boolean.valueOf(false));
    assertEquals(privateCertificateSecretResourceModelNew.rotation().toString(), rotationModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificateSecretResourceError() throws Throwable {
    new PrivateCertificateSecretResource.Builder().build();
  }

}