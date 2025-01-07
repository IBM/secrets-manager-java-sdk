/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateManagedCsr;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the ImportedCertificateManagedCsr model.
 */
public class ImportedCertificateManagedCsrTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testImportedCertificateManagedCsr() throws Throwable {
        ImportedCertificateManagedCsr importedCertificateManagedCsrModel = new ImportedCertificateManagedCsr.Builder()
                .ou(java.util.Arrays.asList("testString"))
                .organization(java.util.Arrays.asList("testString"))
                .country(java.util.Arrays.asList("testString"))
                .locality(java.util.Arrays.asList("testString"))
                .province(java.util.Arrays.asList("testString"))
                .streetAddress(java.util.Arrays.asList("testString"))
                .postalCode(java.util.Arrays.asList("testString"))
                .requireCn(true)
                .commonName("example.com")
                .altNames("alt-name-1,alt-name-2")
                .ipSans("1.1.1.1,2.2.2.2")
                .uriSans("testString")
                .otherSans("2.5.4.5;UTF8:*.example.com")
                .excludeCnFromSans(true)
                .userIds("user-1,user-2")
                .serverFlag(true)
                .clientFlag(true)
                .codeSigningFlag(true)
                .emailProtectionFlag(true)
                .keyType("rsa")
                .keyBits(Long.valueOf("4096"))
                .keyUsage("DigitalSignature,KeyAgreement,KeyEncipherment")
                .extKeyUsage("ServerAuth,ClientAuth,EmailProtection")
                .policyIdentifiers("testString")
                .extKeyUsageOids("testString")
                .rotateKeys(true)
                .csr("testString")
                .privateKey("testString")
                .build();
        assertEquals(importedCertificateManagedCsrModel.ou(), java.util.Arrays.asList("testString"));
        assertEquals(importedCertificateManagedCsrModel.organization(), java.util.Arrays.asList("testString"));
        assertEquals(importedCertificateManagedCsrModel.country(), java.util.Arrays.asList("testString"));
        assertEquals(importedCertificateManagedCsrModel.locality(), java.util.Arrays.asList("testString"));
        assertEquals(importedCertificateManagedCsrModel.province(), java.util.Arrays.asList("testString"));
        assertEquals(importedCertificateManagedCsrModel.streetAddress(), java.util.Arrays.asList("testString"));
        assertEquals(importedCertificateManagedCsrModel.postalCode(), java.util.Arrays.asList("testString"));
        assertEquals(importedCertificateManagedCsrModel.requireCn(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModel.commonName(), "example.com");
        assertEquals(importedCertificateManagedCsrModel.altNames(), "alt-name-1,alt-name-2");
        assertEquals(importedCertificateManagedCsrModel.ipSans(), "1.1.1.1,2.2.2.2");
        assertEquals(importedCertificateManagedCsrModel.uriSans(), "testString");
        assertEquals(importedCertificateManagedCsrModel.otherSans(), "2.5.4.5;UTF8:*.example.com");
        assertEquals(importedCertificateManagedCsrModel.excludeCnFromSans(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModel.userIds(), "user-1,user-2");
        assertEquals(importedCertificateManagedCsrModel.serverFlag(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModel.clientFlag(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModel.codeSigningFlag(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModel.emailProtectionFlag(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModel.keyType(), "rsa");
        assertEquals(importedCertificateManagedCsrModel.keyBits(), Long.valueOf("4096"));
        assertEquals(importedCertificateManagedCsrModel.keyUsage(), "DigitalSignature,KeyAgreement,KeyEncipherment");
        assertEquals(importedCertificateManagedCsrModel.extKeyUsage(), "ServerAuth,ClientAuth,EmailProtection");
        assertEquals(importedCertificateManagedCsrModel.policyIdentifiers(), "testString");
        assertEquals(importedCertificateManagedCsrModel.extKeyUsageOids(), "testString");
        assertEquals(importedCertificateManagedCsrModel.rotateKeys(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModel.csr(), "testString");
        assertEquals(importedCertificateManagedCsrModel.privateKey(), "testString");

        String json = TestUtilities.serialize(importedCertificateManagedCsrModel);

        ImportedCertificateManagedCsr importedCertificateManagedCsrModelNew = TestUtilities.deserialize(json, ImportedCertificateManagedCsr.class);
        assertTrue(importedCertificateManagedCsrModelNew instanceof ImportedCertificateManagedCsr);
        assertEquals(importedCertificateManagedCsrModelNew.requireCn(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModelNew.commonName(), "example.com");
        assertEquals(importedCertificateManagedCsrModelNew.altNames(), "alt-name-1,alt-name-2");
        assertEquals(importedCertificateManagedCsrModelNew.ipSans(), "1.1.1.1,2.2.2.2");
        assertEquals(importedCertificateManagedCsrModelNew.uriSans(), "testString");
        assertEquals(importedCertificateManagedCsrModelNew.otherSans(), "2.5.4.5;UTF8:*.example.com");
        assertEquals(importedCertificateManagedCsrModelNew.excludeCnFromSans(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModelNew.userIds(), "user-1,user-2");
        assertEquals(importedCertificateManagedCsrModelNew.serverFlag(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModelNew.clientFlag(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModelNew.codeSigningFlag(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModelNew.emailProtectionFlag(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModelNew.keyType(), "rsa");
        assertEquals(importedCertificateManagedCsrModelNew.keyBits(), Long.valueOf("4096"));
        assertEquals(importedCertificateManagedCsrModelNew.keyUsage(), "DigitalSignature,KeyAgreement,KeyEncipherment");
        assertEquals(importedCertificateManagedCsrModelNew.extKeyUsage(), "ServerAuth,ClientAuth,EmailProtection");
        assertEquals(importedCertificateManagedCsrModelNew.policyIdentifiers(), "testString");
        assertEquals(importedCertificateManagedCsrModelNew.extKeyUsageOids(), "testString");
        assertEquals(importedCertificateManagedCsrModelNew.rotateKeys(), Boolean.valueOf(true));
        assertEquals(importedCertificateManagedCsrModelNew.csr(), "testString");
        assertEquals(importedCertificateManagedCsrModelNew.privateKey(), "testString");
    }
}