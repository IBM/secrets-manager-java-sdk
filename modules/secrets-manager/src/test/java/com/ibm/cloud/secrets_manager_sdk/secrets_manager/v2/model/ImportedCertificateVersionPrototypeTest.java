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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the ImportedCertificateVersionPrototype model.
 */
public class ImportedCertificateVersionPrototypeTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testImportedCertificateVersionPrototype() throws Throwable {
        ImportedCertificateVersionPrototype importedCertificateVersionPrototypeModel = new ImportedCertificateVersionPrototype.Builder()
                .certificate("testString")
                .intermediate("testString")
                .privateKey("testString")
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(importedCertificateVersionPrototypeModel.certificate(), "testString");
        assertEquals(importedCertificateVersionPrototypeModel.intermediate(), "testString");
        assertEquals(importedCertificateVersionPrototypeModel.privateKey(), "testString");
        assertEquals(importedCertificateVersionPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(importedCertificateVersionPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

        String json = TestUtilities.serialize(importedCertificateVersionPrototypeModel);

        ImportedCertificateVersionPrototype importedCertificateVersionPrototypeModelNew = TestUtilities.deserialize(json, ImportedCertificateVersionPrototype.class);
        assertTrue(importedCertificateVersionPrototypeModelNew instanceof ImportedCertificateVersionPrototype);
        assertEquals(importedCertificateVersionPrototypeModelNew.certificate(), "testString");
        assertEquals(importedCertificateVersionPrototypeModelNew.intermediate(), "testString");
        assertEquals(importedCertificateVersionPrototypeModelNew.privateKey(), "testString");
        assertEquals(importedCertificateVersionPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(importedCertificateVersionPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testImportedCertificateVersionPrototypeError() throws Throwable {
        new ImportedCertificateVersionPrototype.Builder().build();
    }

}