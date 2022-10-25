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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertificateSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.Rotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PublicCertificateSecretMetadata model.
 */
public class PublicCertificateSecretMetadataTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPublicCertificateSecretMetadata() throws Throwable {
        Rotation rotationModel = new Rotation.Builder()
                .autoRotate(false)
                .rotateKeys(false)
                .interval(Long.valueOf("26"))
                .unit("day")
                .build();
        assertEquals(rotationModel.autoRotate(), Boolean.valueOf(false));
        assertEquals(rotationModel.rotateKeys(), Boolean.valueOf(false));
        assertEquals(rotationModel.interval(), Long.valueOf("26"));
        assertEquals(rotationModel.unit(), "day");

        PublicCertificateSecretMetadata publicCertificateSecretMetadataModel = new PublicCertificateSecretMetadata.Builder()
                .labels(java.util.Arrays.asList("dev", "us-south"))
                .name("example-secret")
                .description("Extended description for this secret.")
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .bundleCerts(true)
                .keyAlgorithm("RSA2048")
                .altNames(java.util.Arrays.asList("testString"))
                .commonName("example.com")
                .rotation(rotationModel)
                .build();
        assertEquals(publicCertificateSecretMetadataModel.labels(), java.util.Arrays.asList("dev", "us-south"));
        assertEquals(publicCertificateSecretMetadataModel.name(), "example-secret");
        assertEquals(publicCertificateSecretMetadataModel.description(), "Extended description for this secret.");
        assertEquals(publicCertificateSecretMetadataModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(publicCertificateSecretMetadataModel.bundleCerts(), Boolean.valueOf(true));
        assertEquals(publicCertificateSecretMetadataModel.keyAlgorithm(), "RSA2048");
        assertEquals(publicCertificateSecretMetadataModel.altNames(), java.util.Arrays.asList("testString"));
        assertEquals(publicCertificateSecretMetadataModel.commonName(), "example.com");
        assertEquals(publicCertificateSecretMetadataModel.rotation(), rotationModel);

        String json = TestUtilities.serialize(publicCertificateSecretMetadataModel);

        PublicCertificateSecretMetadata publicCertificateSecretMetadataModelNew = TestUtilities.deserialize(json, PublicCertificateSecretMetadata.class);
        assertTrue(publicCertificateSecretMetadataModelNew instanceof PublicCertificateSecretMetadata);
        assertEquals(publicCertificateSecretMetadataModelNew.name(), "example-secret");
        assertEquals(publicCertificateSecretMetadataModelNew.description(), "Extended description for this secret.");
        assertEquals(publicCertificateSecretMetadataModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(publicCertificateSecretMetadataModelNew.bundleCerts(), Boolean.valueOf(true));
        assertEquals(publicCertificateSecretMetadataModelNew.keyAlgorithm(), "RSA2048");
        assertEquals(publicCertificateSecretMetadataModelNew.commonName(), "example.com");
        assertEquals(publicCertificateSecretMetadataModelNew.rotation().toString(), rotationModel.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPublicCertificateSecretMetadataError() throws Throwable {
        new PublicCertificateSecretMetadata.Builder().build();
    }

}