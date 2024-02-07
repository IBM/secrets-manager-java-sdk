/*
 * (C) Copyright IBM Corp. 2024.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionSignIntermediatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationActionSignIntermediatePrototype model.
 */
public class PrivateCertificateConfigurationActionSignIntermediatePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationActionSignIntermediatePrototype() throws Throwable {
    PrivateCertificateConfigurationActionSignIntermediatePrototype privateCertificateConfigurationActionSignIntermediatePrototypeModel = new PrivateCertificateConfigurationActionSignIntermediatePrototype.Builder()
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
      .actionType("private_cert_configuration_action_sign_intermediate")
      .intermediateCertificateAuthority("example-intermediate-CA")
      .build();
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.commonName(), "localhost");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.altNames(), java.util.Arrays.asList("s1.example.com", "*.s2.example.com"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.uriSans(), "testString");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.otherSans(), java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.ttl(), "12h");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.format(), "pem");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.maxPathLength(), Long.valueOf("26"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.permittedDnsDomains(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.useCsrValues(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.ou(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.organization(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.country(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.locality(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.province(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.streetAddress(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.postalCode(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.actionType(), "private_cert_configuration_action_sign_intermediate");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModel.intermediateCertificateAuthority(), "example-intermediate-CA");

    String json = TestUtilities.serialize(privateCertificateConfigurationActionSignIntermediatePrototypeModel);

    PrivateCertificateConfigurationActionSignIntermediatePrototype privateCertificateConfigurationActionSignIntermediatePrototypeModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationActionSignIntermediatePrototype.class);
    assertTrue(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew instanceof PrivateCertificateConfigurationActionSignIntermediatePrototype);
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.commonName(), "localhost");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.uriSans(), "testString");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.ttl(), "12h");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.format(), "pem");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.maxPathLength(), Long.valueOf("26"));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.useCsrValues(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.actionType(), "private_cert_configuration_action_sign_intermediate");
    assertEquals(privateCertificateConfigurationActionSignIntermediatePrototypeModelNew.intermediateCertificateAuthority(), "example-intermediate-CA");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificateConfigurationActionSignIntermediatePrototypeError() throws Throwable {
    new PrivateCertificateConfigurationActionSignIntermediatePrototype.Builder().build();
  }

}