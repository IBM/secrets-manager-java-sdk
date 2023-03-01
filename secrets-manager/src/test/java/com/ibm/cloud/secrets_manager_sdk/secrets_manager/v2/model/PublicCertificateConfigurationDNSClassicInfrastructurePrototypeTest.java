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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationDNSClassicInfrastructurePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicCertificateConfigurationDNSClassicInfrastructurePrototype model.
 */
public class PublicCertificateConfigurationDNSClassicInfrastructurePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicCertificateConfigurationDNSClassicInfrastructurePrototype() throws Throwable {
    PublicCertificateConfigurationDNSClassicInfrastructurePrototype publicCertificateConfigurationDnsClassicInfrastructurePrototypeModel = new PublicCertificateConfigurationDNSClassicInfrastructurePrototype.Builder()
      .configType("public_cert_configuration_dns_classic_infrastructure")
      .name("my-example-engine-config")
      .classicInfrastructureUsername("testString")
      .classicInfrastructurePassword("testString")
      .build();
    assertEquals(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModel.configType(), "public_cert_configuration_dns_classic_infrastructure");
    assertEquals(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModel.name(), "my-example-engine-config");
    assertEquals(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModel.classicInfrastructureUsername(), "testString");
    assertEquals(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModel.classicInfrastructurePassword(), "testString");

    String json = TestUtilities.serialize(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModel);

    PublicCertificateConfigurationDNSClassicInfrastructurePrototype publicCertificateConfigurationDnsClassicInfrastructurePrototypeModelNew = TestUtilities.deserialize(json, PublicCertificateConfigurationDNSClassicInfrastructurePrototype.class);
    assertTrue(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModelNew instanceof PublicCertificateConfigurationDNSClassicInfrastructurePrototype);
    assertEquals(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModelNew.configType(), "public_cert_configuration_dns_classic_infrastructure");
    assertEquals(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModelNew.name(), "my-example-engine-config");
    assertEquals(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModelNew.classicInfrastructureUsername(), "testString");
    assertEquals(publicCertificateConfigurationDnsClassicInfrastructurePrototypeModelNew.classicInfrastructurePassword(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublicCertificateConfigurationDNSClassicInfrastructurePrototypeError() throws Throwable {
    new PublicCertificateConfigurationDNSClassicInfrastructurePrototype.Builder().build();
  }

}