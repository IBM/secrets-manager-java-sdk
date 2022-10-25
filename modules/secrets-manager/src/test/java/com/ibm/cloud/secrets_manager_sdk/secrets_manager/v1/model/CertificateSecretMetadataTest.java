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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the CertificateSecretMetadata model.
 */
public class CertificateSecretMetadataTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testCertificateSecretMetadata() throws Throwable {
        CertificateSecretMetadata certificateSecretMetadataModel = new CertificateSecretMetadata.Builder()
                .labels(java.util.Arrays.asList("dev", "us-south"))
                .name("example-secret")
                .description("Extended description for this secret.")
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(certificateSecretMetadataModel.labels(), java.util.Arrays.asList("dev", "us-south"));
        assertEquals(certificateSecretMetadataModel.name(), "example-secret");
        assertEquals(certificateSecretMetadataModel.description(), "Extended description for this secret.");
        assertEquals(certificateSecretMetadataModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

        String json = TestUtilities.serialize(certificateSecretMetadataModel);

        CertificateSecretMetadata certificateSecretMetadataModelNew = TestUtilities.deserialize(json, CertificateSecretMetadata.class);
        assertTrue(certificateSecretMetadataModelNew instanceof CertificateSecretMetadata);
        assertEquals(certificateSecretMetadataModelNew.name(), "example-secret");
        assertEquals(certificateSecretMetadataModelNew.description(), "Extended description for this secret.");
        assertEquals(certificateSecretMetadataModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCertificateSecretMetadataError() throws Throwable {
        new CertificateSecretMetadata.Builder().build();
    }

}