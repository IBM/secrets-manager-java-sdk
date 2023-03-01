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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCAPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationIntermediateCAPrototype model.
 */
public class PrivateCertificateConfigurationIntermediateCAPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationIntermediateCAPrototype() throws Throwable {
    PrivateCertificateConfigurationIntermediateCAPrototype privateCertificateConfigurationIntermediateCaPrototypeModel = new PrivateCertificateConfigurationIntermediateCAPrototype.Builder()
      .configType("private_cert_configuration_intermediate_ca")
      .name("my-example-engine-config")
      .maxTtl("8760h")
      .signingMethod("internal")
      .issuer("Lets Encrypt")
      .crlExpiry("72h")
      .crlDisable(true)
      .crlDistributionPointsEncoded(true)
      .issuingCertificatesUrlsEncoded(true)
      .commonName("localhost")
      .altNames(java.util.Arrays.asList("s1.example.com", "*.s2.example.com"))
      .ipSans("1.1.1.1, 2.2.2.2")
      .uriSans("testString")
      .otherSans(java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"))
      .format("pem")
      .privateKeyFormat("der")
      .keyType("rsa")
      .keyBits(Long.valueOf("4096"))
      .excludeCnFromSans(true)
      .ou(java.util.Arrays.asList("testString"))
      .organization(java.util.Arrays.asList("testString"))
      .country(java.util.Arrays.asList("testString"))
      .locality(java.util.Arrays.asList("testString"))
      .province(java.util.Arrays.asList("testString"))
      .streetAddress(java.util.Arrays.asList("testString"))
      .postalCode(java.util.Arrays.asList("testString"))
      .serialNumber("d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5")
      .build();
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.configType(), "private_cert_configuration_intermediate_ca");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.name(), "my-example-engine-config");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.signingMethod(), "internal");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.issuer(), "Lets Encrypt");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.crlExpiry(), "72h");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.crlDisable(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.crlDistributionPointsEncoded(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.commonName(), "localhost");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.altNames(), java.util.Arrays.asList("s1.example.com", "*.s2.example.com"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.uriSans(), "testString");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.otherSans(), java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.format(), "pem");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.privateKeyFormat(), "der");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.keyType(), "rsa");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.keyBits(), Long.valueOf("4096"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.ou(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.organization(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.country(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.locality(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.province(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.streetAddress(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.postalCode(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");

    String json = TestUtilities.serialize(privateCertificateConfigurationIntermediateCaPrototypeModel);

    PrivateCertificateConfigurationIntermediateCAPrototype privateCertificateConfigurationIntermediateCaPrototypeModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationIntermediateCAPrototype.class);
    assertTrue(privateCertificateConfigurationIntermediateCaPrototypeModelNew instanceof PrivateCertificateConfigurationIntermediateCAPrototype);
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.configType(), "private_cert_configuration_intermediate_ca");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.name(), "my-example-engine-config");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.signingMethod(), "internal");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.issuer(), "Lets Encrypt");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.crlExpiry(), "72h");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.crlDisable(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.crlDistributionPointsEncoded(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.commonName(), "localhost");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.uriSans(), "testString");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.format(), "pem");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.privateKeyFormat(), "der");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.keyType(), "rsa");
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.keyBits(), Long.valueOf("4096"));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPrototypeModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificateConfigurationIntermediateCAPrototypeError() throws Throwable {
    new PrivateCertificateConfigurationIntermediateCAPrototype.Builder().build();
  }

}