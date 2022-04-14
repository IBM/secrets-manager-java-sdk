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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateTemplateConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the CertificateTemplateConfig model.
 */
public class CertificateTemplateConfigTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testCertificateTemplateConfig() throws Throwable {
        CertificateTemplateConfig certificateTemplateConfigModel = new CertificateTemplateConfig.Builder()
                .certificateAuthority("testString")
                .allowedSecretGroups("testString")
                .maxTtl("8760h")
                .ttl("12h")
                .allowLocalhost(true)
                .allowedDomains(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .allowedDomainsTemplate(false)
                .allowBareDomains(false)
                .allowSubdomains(false)
                .allowGlobDomains(false)
                .allowAnyName(false)
                .enforceHostnames(true)
                .allowIpSans(true)
                .allowedUriSans(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .allowedOtherSans(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .serverFlag(true)
                .clientFlag(true)
                .codeSigningFlag(false)
                .emailProtectionFlag(false)
                .keyType("rsa")
                .keyBits(Long.valueOf("26"))
                .keyUsage(new java.util.ArrayList<String>(java.util.Arrays.asList("DigitalSignature", "KeyAgreement", "KeyEncipherment")))
                .extKeyUsage(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .extKeyUsageOids(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .useCsrCommonName(true)
                .useCsrSans(true)
                .ou(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .organization(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .country(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .locality(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .province(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .streetAddress(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .postalCode(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .serialNumber("d9:be:fe:35:ba:09:42:b5")
                .requireCn(true)
                .policyIdentifiers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .basicConstraintsValidForNonCa(true)
                .notBeforeDuration("30s")
                .build();
        assertEquals(certificateTemplateConfigModel.certificateAuthority(), "testString");
        assertEquals(certificateTemplateConfigModel.allowedSecretGroups(), "testString");
        assertEquals(certificateTemplateConfigModel.maxTtl(), "8760h");
        assertEquals(certificateTemplateConfigModel.ttl(), "12h");
        assertEquals(certificateTemplateConfigModel.allowLocalhost(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.allowedDomains(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.allowedDomainsTemplate(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModel.allowBareDomains(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModel.allowSubdomains(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModel.allowGlobDomains(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModel.allowAnyName(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModel.enforceHostnames(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.allowIpSans(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.allowedUriSans(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.allowedOtherSans(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.serverFlag(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.clientFlag(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.codeSigningFlag(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModel.emailProtectionFlag(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModel.keyType(), "rsa");
        assertEquals(certificateTemplateConfigModel.keyBits(), Long.valueOf("26"));
        assertEquals(certificateTemplateConfigModel.keyUsage(), new java.util.ArrayList<String>(java.util.Arrays.asList("DigitalSignature", "KeyAgreement", "KeyEncipherment")));
        assertEquals(certificateTemplateConfigModel.extKeyUsage(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.extKeyUsageOids(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.useCsrCommonName(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.useCsrSans(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.ou(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.organization(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.country(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.locality(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.province(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.streetAddress(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.postalCode(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
        assertEquals(certificateTemplateConfigModel.requireCn(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.policyIdentifiers(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateTemplateConfigModel.basicConstraintsValidForNonCa(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModel.notBeforeDuration(), "30s");

        String json = TestUtilities.serialize(certificateTemplateConfigModel);

        CertificateTemplateConfig certificateTemplateConfigModelNew = TestUtilities.deserialize(json, CertificateTemplateConfig.class);
        assertTrue(certificateTemplateConfigModelNew instanceof CertificateTemplateConfig);
        assertEquals(certificateTemplateConfigModelNew.certificateAuthority(), "testString");
        assertEquals(certificateTemplateConfigModelNew.allowedSecretGroups(), "testString");
        assertEquals(certificateTemplateConfigModelNew.maxTtl(), "8760h");
        assertEquals(certificateTemplateConfigModelNew.ttl(), "12h");
        assertEquals(certificateTemplateConfigModelNew.allowLocalhost(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.allowedDomainsTemplate(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModelNew.allowBareDomains(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModelNew.allowSubdomains(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModelNew.allowGlobDomains(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModelNew.allowAnyName(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModelNew.enforceHostnames(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.allowIpSans(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.serverFlag(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.clientFlag(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.codeSigningFlag(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModelNew.emailProtectionFlag(), Boolean.valueOf(false));
        assertEquals(certificateTemplateConfigModelNew.keyType(), "rsa");
        assertEquals(certificateTemplateConfigModelNew.keyBits(), Long.valueOf("26"));
        assertEquals(certificateTemplateConfigModelNew.useCsrCommonName(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.useCsrSans(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
        assertEquals(certificateTemplateConfigModelNew.requireCn(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.basicConstraintsValidForNonCa(), Boolean.valueOf(true));
        assertEquals(certificateTemplateConfigModelNew.notBeforeDuration(), "30s");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCertificateTemplateConfigError() throws Throwable {
        new CertificateTemplateConfig.Builder().build();
    }

}