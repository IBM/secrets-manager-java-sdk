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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplatePatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationTemplatePatch model.
 */
public class PrivateCertificateConfigurationTemplatePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationTemplatePatch() throws Throwable {
    PrivateCertificateConfigurationTemplatePatch privateCertificateConfigurationTemplatePatchModel = new PrivateCertificateConfigurationTemplatePatch.Builder()
      .allowedSecretGroups("testString")
      .maxTtl("8760h")
      .ttl("8760h")
      .allowLocalhost(true)
      .allowedDomains(java.util.Arrays.asList("testString"))
      .allowedDomainsTemplate(true)
      .allowBareDomains(true)
      .allowSubdomains(true)
      .allowGlobDomains(true)
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
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowedSecretGroups(), "testString");
    assertEquals(privateCertificateConfigurationTemplatePatchModel.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationTemplatePatchModel.ttl(), "8760h");
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowLocalhost(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowedDomains(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowedDomainsTemplate(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowBareDomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowSubdomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowGlobDomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowAnyName(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.enforceHostnames(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowIpSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowedUriSans(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.allowedOtherSans(), java.util.Arrays.asList("2.5.4.5;UTF8:*"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.serverFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.clientFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.codeSigningFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.emailProtectionFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.keyType(), "rsa");
    assertEquals(privateCertificateConfigurationTemplatePatchModel.keyBits(), Long.valueOf("4096"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.keyUsage(), java.util.Arrays.asList("DigitalSignature", "KeyAgreement", "KeyEncipherment"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.extKeyUsage(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.extKeyUsageOids(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.useCsrCommonName(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.useCsrSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.ou(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.organization(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.country(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.locality(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.province(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.streetAddress(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.postalCode(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertEquals(privateCertificateConfigurationTemplatePatchModel.requireCn(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.policyIdentifiers(), java.util.Arrays.asList("testString"));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.basicConstraintsValidForNonCa(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModel.notBeforeDuration(), "30s");

    String json = TestUtilities.serialize(privateCertificateConfigurationTemplatePatchModel);

    PrivateCertificateConfigurationTemplatePatch privateCertificateConfigurationTemplatePatchModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationTemplatePatch.class);
    assertTrue(privateCertificateConfigurationTemplatePatchModelNew instanceof PrivateCertificateConfigurationTemplatePatch);
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.allowedSecretGroups(), "testString");
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.ttl(), "8760h");
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.allowLocalhost(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.allowedDomainsTemplate(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.allowBareDomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.allowSubdomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.allowGlobDomains(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.allowAnyName(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.enforceHostnames(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.allowIpSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.serverFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.clientFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.codeSigningFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.emailProtectionFlag(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.keyType(), "rsa");
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.keyBits(), Long.valueOf("4096"));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.useCsrCommonName(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.useCsrSans(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.requireCn(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.basicConstraintsValidForNonCa(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationTemplatePatchModelNew.notBeforeDuration(), "30s");
  }
  @Test
  public void testPrivateCertificateConfigurationTemplatePatchAsPatch() throws Throwable {
    PrivateCertificateConfigurationTemplatePatch privateCertificateConfigurationTemplatePatchModel = new PrivateCertificateConfigurationTemplatePatch.Builder()
      .allowedSecretGroups("testString")
      .maxTtl("8760h")
      .ttl("8760h")
      .allowLocalhost(true)
      .allowedDomains(java.util.Arrays.asList("testString"))
      .allowedDomainsTemplate(true)
      .allowBareDomains(true)
      .allowSubdomains(true)
      .allowGlobDomains(true)
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

    Map<String, Object> mergePatch = privateCertificateConfigurationTemplatePatchModel.asPatch();

    assertEquals(mergePatch.get("allowed_secret_groups"), "testString");
    assertEquals(mergePatch.get("max_ttl"), "8760h");
    assertEquals(mergePatch.get("ttl"), "8760h");
    assertTrue(mergePatch.containsKey("allow_localhost"));
    assertTrue(mergePatch.containsKey("allowed_domains"));
    assertTrue(mergePatch.containsKey("allowed_domains_template"));
    assertTrue(mergePatch.containsKey("allow_bare_domains"));
    assertTrue(mergePatch.containsKey("allow_subdomains"));
    assertTrue(mergePatch.containsKey("allow_glob_domains"));
    assertTrue(mergePatch.containsKey("allow_any_name"));
    assertTrue(mergePatch.containsKey("enforce_hostnames"));
    assertTrue(mergePatch.containsKey("allow_ip_sans"));
    assertTrue(mergePatch.containsKey("allowed_uri_sans"));
    assertTrue(mergePatch.containsKey("allowed_other_sans"));
    assertTrue(mergePatch.containsKey("server_flag"));
    assertTrue(mergePatch.containsKey("client_flag"));
    assertTrue(mergePatch.containsKey("code_signing_flag"));
    assertTrue(mergePatch.containsKey("email_protection_flag"));
    assertEquals(mergePatch.get("key_type"), "rsa");
    assertTrue(mergePatch.containsKey("key_bits"));
    assertTrue(mergePatch.containsKey("key_usage"));
    assertTrue(mergePatch.containsKey("ext_key_usage"));
    assertTrue(mergePatch.containsKey("ext_key_usage_oids"));
    assertTrue(mergePatch.containsKey("use_csr_common_name"));
    assertTrue(mergePatch.containsKey("use_csr_sans"));
    assertTrue(mergePatch.containsKey("ou"));
    assertTrue(mergePatch.containsKey("organization"));
    assertTrue(mergePatch.containsKey("country"));
    assertTrue(mergePatch.containsKey("locality"));
    assertTrue(mergePatch.containsKey("province"));
    assertTrue(mergePatch.containsKey("street_address"));
    assertTrue(mergePatch.containsKey("postal_code"));
    assertEquals(mergePatch.get("serial_number"), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    assertTrue(mergePatch.containsKey("require_cn"));
    assertTrue(mergePatch.containsKey("policy_identifiers"));
    assertTrue(mergePatch.containsKey("basic_constraints_valid_for_non_ca"));
    assertEquals(mergePatch.get("not_before_duration"), "30s");
  }

}