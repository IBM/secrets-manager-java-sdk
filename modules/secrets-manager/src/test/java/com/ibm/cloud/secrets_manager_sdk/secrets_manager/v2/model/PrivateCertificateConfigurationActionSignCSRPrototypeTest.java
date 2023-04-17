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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionSignCSRPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationActionSignCSRPrototype model.
 */
public class PrivateCertificateConfigurationActionSignCSRPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationActionSignCSRPrototype() throws Throwable {
    PrivateCertificateConfigurationActionSignCSRPrototype privateCertificateConfigurationActionSignCsrPrototypeModel = new PrivateCertificateConfigurationActionSignCSRPrototype.Builder()
      .commonName("localhost")
      .altNames(java.util.Arrays.asList("s1.example.com", "*.s2.example.com"))
      .ipSans("1.1.1.1, 2.2.2.2")
      .uriSans("testString")
      .otherSans(java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"))
      .ttl("12h")
      .format("pem")
      .maxPathLength(Long.valueOf("26"))
      .excludeCnFromSans(true)
      .permittedDnsDomains(java.util.Arrays.asList("testString"))
      .useCsrValues(true)
      .ou(java.util.Arrays.asList("testString"))
      .organization(java.util.Arrays.asList("testString"))
      .country(java.util.Arrays.asList("testString"))
      .locality(java.util.Arrays.asList("testString"))
      .province(java.util.Arrays.asList("testString"))
      .streetAddress(java.util.Arrays.asList("testString"))
      .postalCode(java.util.Arrays.asList("testString"))
      .serialNumber("d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5")
      .actionType("private_cert_configuration_action_sign_csr")
      .csr("testString")
      .build();
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.commonName(), "localhost");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.altNames(), java.util.Arrays.asList("s1.example.com", "*.s2.example.com"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.uriSans(), "testString");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.otherSans(), java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.ttl(), "12h");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.format(), "pem");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.maxPathLength(), Long.valueOf("26"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.permittedDnsDomains(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.useCsrValues(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.ou(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.organization(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.country(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.locality(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.province(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.streetAddress(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.postalCode(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.actionType(), "private_cert_configuration_action_sign_csr");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModel.csr(), "testString");

    String json = TestUtilities.serialize(privateCertificateConfigurationActionSignCsrPrototypeModel);

    PrivateCertificateConfigurationActionSignCSRPrototype privateCertificateConfigurationActionSignCsrPrototypeModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationActionSignCSRPrototype.class);
    assertTrue(privateCertificateConfigurationActionSignCsrPrototypeModelNew instanceof PrivateCertificateConfigurationActionSignCSRPrototype);
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.commonName(), "localhost");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.uriSans(), "testString");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.ttl(), "12h");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.format(), "pem");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.maxPathLength(), Long.valueOf("26"));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.useCsrValues(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.actionType(), "private_cert_configuration_action_sign_csr");
    assertEquals(privateCertificateConfigurationActionSignCsrPrototypeModelNew.csr(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificateConfigurationActionSignCSRPrototypeError() throws Throwable {
    new PrivateCertificateConfigurationActionSignCSRPrototype.Builder().build();
  }

}