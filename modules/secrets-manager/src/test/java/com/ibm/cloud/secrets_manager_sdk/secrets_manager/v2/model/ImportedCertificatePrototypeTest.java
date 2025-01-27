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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the ImportedCertificatePrototype model.
 */
public class ImportedCertificatePrototypeTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testImportedCertificatePrototype() throws Throwable {
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

        ImportedCertificatePrototype importedCertificatePrototypeModel = new ImportedCertificatePrototype.Builder()
                .secretType("imported_cert")
                .name("my-secret-example")
                .description("Extended description for this secret.")
                .secretGroupId("default")
                .labels(java.util.Arrays.asList("my-label"))
                .certificate("testString")
                .intermediate("testString")
                .privateKey("testString")
                .managedCsr(importedCertificateManagedCsrModel)
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(importedCertificatePrototypeModel.secretType(), "imported_cert");
        assertEquals(importedCertificatePrototypeModel.name(), "my-secret-example");
        assertEquals(importedCertificatePrototypeModel.description(), "Extended description for this secret.");
        assertEquals(importedCertificatePrototypeModel.secretGroupId(), "default");
        assertEquals(importedCertificatePrototypeModel.labels(), java.util.Arrays.asList("my-label"));
        assertEquals(importedCertificatePrototypeModel.certificate(), "testString");
        assertEquals(importedCertificatePrototypeModel.intermediate(), "testString");
        assertEquals(importedCertificatePrototypeModel.privateKey(), "testString");
        assertEquals(importedCertificatePrototypeModel.managedCsr(), importedCertificateManagedCsrModel);
        assertEquals(importedCertificatePrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(importedCertificatePrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

        String json = TestUtilities.serialize(importedCertificatePrototypeModel);

        ImportedCertificatePrototype importedCertificatePrototypeModelNew = TestUtilities.deserialize(json, ImportedCertificatePrototype.class);
        assertTrue(importedCertificatePrototypeModelNew instanceof ImportedCertificatePrototype);
        assertEquals(importedCertificatePrototypeModelNew.secretType(), "imported_cert");
        assertEquals(importedCertificatePrototypeModelNew.name(), "my-secret-example");
        assertEquals(importedCertificatePrototypeModelNew.description(), "Extended description for this secret.");
        assertEquals(importedCertificatePrototypeModelNew.secretGroupId(), "default");
        assertEquals(importedCertificatePrototypeModelNew.certificate(), "testString");
        assertEquals(importedCertificatePrototypeModelNew.intermediate(), "testString");
        assertEquals(importedCertificatePrototypeModelNew.privateKey(), "testString");
        assertEquals(importedCertificatePrototypeModelNew.managedCsr().toString(), importedCertificateManagedCsrModel.toString());
        assertEquals(importedCertificatePrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(importedCertificatePrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testImportedCertificatePrototypeError() throws Throwable {
        new ImportedCertificatePrototype.Builder().build();
    }

}