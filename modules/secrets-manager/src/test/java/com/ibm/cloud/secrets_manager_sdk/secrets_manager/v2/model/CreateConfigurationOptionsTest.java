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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateConfigurationOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRootCAPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateConfigurationOptions model.
 */
public class CreateConfigurationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateConfigurationOptions() throws Throwable {
    PrivateCertificateConfigurationRootCAPrototype configurationPrototypeModel = new PrivateCertificateConfigurationRootCAPrototype.Builder()
      .configType("private_cert_configuration_root_ca")
      .name("my-example-engine-config")
      .maxTtl("8760h")
      .crlExpiry("72h")
      .crlDisable(true)
      .crlDistributionPointsEncoded(true)
      .issuingCertificatesUrlsEncoded(true)
      .commonName("localhost")
      .altNames(java.util.Arrays.asList("s1.example.com", "*.s2.example.com"))
      .ipSans("1.1.1.1, 2.2.2.2")
      .uriSans("testString")
      .otherSans(java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"))
      .ttl("8760h")
      .format("pem")
      .privateKeyFormat("der")
      .keyType("rsa")
      .keyBits(Long.valueOf("4096"))
      .maxPathLength(Long.valueOf("26"))
      .excludeCnFromSans(true)
      .permittedDnsDomains(java.util.Arrays.asList("testString"))
      .ou(java.util.Arrays.asList("testString"))
      .organization(java.util.Arrays.asList("testString"))
      .country(java.util.Arrays.asList("testString"))
      .locality(java.util.Arrays.asList("testString"))
      .province(java.util.Arrays.asList("testString"))
      .streetAddress(java.util.Arrays.asList("testString"))
      .postalCode(java.util.Arrays.asList("testString"))
      .serialNumber("d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5")
      .build();
    assertEquals(configurationPrototypeModel.configType(), "private_cert_configuration_root_ca");
    assertEquals(configurationPrototypeModel.name(), "my-example-engine-config");
    assertEquals(configurationPrototypeModel.maxTtl(), "8760h");
    assertEquals(configurationPrototypeModel.crlExpiry(), "72h");
    assertEquals(configurationPrototypeModel.crlDisable(), Boolean.valueOf(true));
    assertEquals(configurationPrototypeModel.crlDistributionPointsEncoded(), Boolean.valueOf(true));
    assertEquals(configurationPrototypeModel.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));
    assertEquals(configurationPrototypeModel.commonName(), "localhost");
    assertEquals(configurationPrototypeModel.altNames(), java.util.Arrays.asList("s1.example.com", "*.s2.example.com"));
    assertEquals(configurationPrototypeModel.ipSans(), "1.1.1.1, 2.2.2.2");
    assertEquals(configurationPrototypeModel.uriSans(), "testString");
    assertEquals(configurationPrototypeModel.otherSans(), java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"));
    assertEquals(configurationPrototypeModel.ttl(), "8760h");
    assertEquals(configurationPrototypeModel.format(), "pem");
    assertEquals(configurationPrototypeModel.privateKeyFormat(), "der");
    assertEquals(configurationPrototypeModel.keyType(), "rsa");
    assertEquals(configurationPrototypeModel.keyBits(), Long.valueOf("4096"));
    assertEquals(configurationPrototypeModel.maxPathLength(), Long.valueOf("26"));
    assertEquals(configurationPrototypeModel.excludeCnFromSans(), Boolean.valueOf(true));
    assertEquals(configurationPrototypeModel.permittedDnsDomains(), java.util.Arrays.asList("testString"));
    assertEquals(configurationPrototypeModel.ou(), java.util.Arrays.asList("testString"));
    assertEquals(configurationPrototypeModel.organization(), java.util.Arrays.asList("testString"));
    assertEquals(configurationPrototypeModel.country(), java.util.Arrays.asList("testString"));
    assertEquals(configurationPrototypeModel.locality(), java.util.Arrays.asList("testString"));
    assertEquals(configurationPrototypeModel.province(), java.util.Arrays.asList("testString"));
    assertEquals(configurationPrototypeModel.streetAddress(), java.util.Arrays.asList("testString"));
    assertEquals(configurationPrototypeModel.postalCode(), java.util.Arrays.asList("testString"));
    assertEquals(configurationPrototypeModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");

    CreateConfigurationOptions createConfigurationOptionsModel = new CreateConfigurationOptions.Builder()
      .configurationPrototype(configurationPrototypeModel)
      .build();
    assertEquals(createConfigurationOptionsModel.configurationPrototype(), configurationPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigurationOptionsError() throws Throwable {
    new CreateConfigurationOptions.Builder().build();
  }

}