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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificatePrototype model.
 */
public class PrivateCertificatePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificatePrototype() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

    PrivateCertificatePrototype privateCertificatePrototypeModel = new PrivateCertificatePrototype.Builder()
      .secretType("private_cert")
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .secretGroupId("default")
      .labels(java.util.Arrays.asList("my-label"))
      .certificateTemplate("cert-template-1")
      .commonName("localhost")
      .altNames(java.util.Arrays.asList("s1.example.com", "*.s2.example.com"))
      .ipSans("1.1.1.1, 2.2.2.2")
      .uriSans("testString")
      .otherSans(java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"))
      .csr("testString")
      .format("pem")
      .privateKeyFormat("der")
      .excludeCnFromSans(true)
      .ttl("12h")
      .rotation(rotationPolicyModel)
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(privateCertificatePrototypeModel.secretType(), "private_cert");
    assertEquals(privateCertificatePrototypeModel.name(), "my-secret-example");
    assertEquals(privateCertificatePrototypeModel.description(), "Extended description for this secret.");
    assertEquals(privateCertificatePrototypeModel.secretGroupId(), "default");
    assertEquals(privateCertificatePrototypeModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(privateCertificatePrototypeModel.certificateTemplate(), "cert-template-1");
    assertEquals(privateCertificatePrototypeModel.commonName(), "localhost");
    assertEquals(privateCertificatePrototypeModel.altNames(), java.util.Arrays.asList("s1.example.com", "*.s2.example.com"));
    assertEquals(privateCertificatePrototypeModel.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(privateCertificatePrototypeModel.uriSans(), "testString");
    assertEquals(privateCertificatePrototypeModel.otherSans(), java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"));
    assertEquals(privateCertificatePrototypeModel.csr(), "testString");
    assertEquals(privateCertificatePrototypeModel.format(), "pem");
    assertEquals(privateCertificatePrototypeModel.privateKeyFormat(), "der");
    assertEquals(privateCertificatePrototypeModel.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(privateCertificatePrototypeModel.ttl(), "12h");
    assertEquals(privateCertificatePrototypeModel.rotation(), rotationPolicyModel);
    assertEquals(privateCertificatePrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(privateCertificatePrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(privateCertificatePrototypeModel);

    PrivateCertificatePrototype privateCertificatePrototypeModelNew = TestUtilities.deserialize(json, PrivateCertificatePrototype.class);
    assertTrue(privateCertificatePrototypeModelNew instanceof PrivateCertificatePrototype);
    assertEquals(privateCertificatePrototypeModelNew.secretType(), "private_cert");
    assertEquals(privateCertificatePrototypeModelNew.name(), "my-secret-example");
    assertEquals(privateCertificatePrototypeModelNew.description(), "Extended description for this secret.");
    assertEquals(privateCertificatePrototypeModelNew.secretGroupId(), "default");
    assertEquals(privateCertificatePrototypeModelNew.certificateTemplate(), "cert-template-1");
    assertEquals(privateCertificatePrototypeModelNew.commonName(), "localhost");
    assertEquals(privateCertificatePrototypeModelNew.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(privateCertificatePrototypeModelNew.uriSans(), "testString");
    assertEquals(privateCertificatePrototypeModelNew.csr(), "testString");
    assertEquals(privateCertificatePrototypeModelNew.format(), "pem");
    assertEquals(privateCertificatePrototypeModelNew.privateKeyFormat(), "der");
    assertEquals(privateCertificatePrototypeModelNew.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(privateCertificatePrototypeModelNew.ttl(), "12h");
    assertEquals(privateCertificatePrototypeModelNew.rotation().toString(), rotationPolicyModel.toString());
    assertEquals(privateCertificatePrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(privateCertificatePrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificatePrototypeError() throws Throwable {
    new PrivateCertificatePrototype.Builder().build();
  }

}