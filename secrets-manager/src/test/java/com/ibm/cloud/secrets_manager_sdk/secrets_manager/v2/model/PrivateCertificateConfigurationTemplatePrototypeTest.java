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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationTemplatePrototype model.
 */
public class PrivateCertificateConfigurationTemplatePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationTemplatePrototype() throws Throwable {
    PrivateCertificateConfigurationTemplatePrototype privateCertificateConfigurationTemplatePrototypeModel = new PrivateCertificateConfigurationTemplatePrototype.Builder()
      .configType("private_cert_configuration_template")
      .name("my-example-engine-config")
      .certificateAuthority("testString")
      .allowedSecretGroups("testString")
      .maxTtl("8760h")
      .ttl("8760h")
      .allowLocalhost(true)
      .allowedDomains(java.util.Arrays.asList("testString"))
      .allowedDomainsTemplate(true)
      .allowBareDomains(true)
      .allowSubdomains(true)
      .allowGlobDomains(true)
      .allowWildcardCertificates(true)
      .allowAnyName(true)
      .enforceHostnames(true)
      .allowIpSans(true)
      .allowedUriSans(java.util.Arrays.asList("testString"))
      .allowedOtherSans(java.util.Arrays.asList("2.5.4.5;UTF8:*"))
      .serverFlag(true)
      .clientFlag(true)
      .codeSigningFlag(true)
      .emailProtectionFlag(true)
      .keyType("rsa")
      .keyBits(Long.valueOf("4096"))
      .keyUsage(java.util.Arrays.asList("DigitalSignature", "KeyAgreement", "KeyEncipherment"))
      .extKeyUsage(java.util.Arrays.asList("testString"))
      .extKeyUsageOids(java.util.Arrays.asList("testString"))
      .useCsrCommonName(true)
      .useCsrSans(true)
      .ou(java.util.Arrays.asList("testString"))
      .organization(java.util.Arrays.asList("testString"))
      .country(java.util.Arrays.asList("testString"))
      .locality(java.util.Arrays.asList("testString"))
      .province(java.util.Arrays.asList("testString"))
      .streetAddress(java.util.Arrays.asList("testString"))
      .postalCode(java.util.Arrays.asList("testString"))
      .serialNumber("d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5")
      .requireCn(true)
      .policyIdentifiers(java.util.Arrays.asList("testString"))
      .basicConstraintsValidForNonCa(true)
      .notBeforeDuration("30s")
      .build();
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.configType(), "private_cert_configuration_template");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.name(), "my-example-engine-config");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.certificateAuthority(), "testString");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowedSecretGroups(), "testString");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.ttl(), "8760h");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowLocalhost(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowedDomains(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowedDomainsTemplate(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowBareDomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowSubdomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowGlobDomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowWildcardCertificates(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowAnyName(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.enforceHostnames(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowIpSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowedUriSans(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.allowedOtherSans(), java.util.Arrays.asList("2.5.4.5;UTF8:*"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.serverFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.clientFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.codeSigningFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.emailProtectionFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.keyType(), "rsa");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.keyBits(), Long.valueOf("4096"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.keyUsage(), java.util.Arrays.asList("DigitalSignature", "KeyAgreement", "KeyEncipherment"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.extKeyUsage(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.extKeyUsageOids(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.useCsrCommonName(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.useCsrSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.ou(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.organization(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.country(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.locality(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.province(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.streetAddress(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.postalCode(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.requireCn(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.policyIdentifiers(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.basicConstraintsValidForNonCa(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModel.notBeforeDuration(), "30s");

    String json = TestUtilities.serialize(privateCertificateConfigurationTemplatePrototypeModel);

    PrivateCertificateConfigurationTemplatePrototype privateCertificateConfigurationTemplatePrototypeModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationTemplatePrototype.class);
    assertTrue(privateCertificateConfigurationTemplatePrototypeModelNew instanceof PrivateCertificateConfigurationTemplatePrototype);
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.configType(), "private_cert_configuration_template");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.name(), "my-example-engine-config");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.certificateAuthority(), "testString");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowedSecretGroups(), "testString");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.ttl(), "8760h");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowLocalhost(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowedDomainsTemplate(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowBareDomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowSubdomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowGlobDomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowWildcardCertificates(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowAnyName(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.enforceHostnames(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.allowIpSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.serverFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.clientFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.codeSigningFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.emailProtectionFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.keyType(), "rsa");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.keyBits(), Long.valueOf("4096"));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.useCsrCommonName(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.useCsrSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.requireCn(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.basicConstraintsValidForNonCa(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePrototypeModelNew.notBeforeDuration(), "30s");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificateConfigurationTemplatePrototypeError() throws Throwable {
    new PrivateCertificateConfigurationTemplatePrototype.Builder().build();
  }

}