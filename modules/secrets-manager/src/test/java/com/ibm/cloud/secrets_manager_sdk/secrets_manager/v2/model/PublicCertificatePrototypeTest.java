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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificatePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PublicCertificatePrototype model.
 */
public class PublicCertificatePrototypeTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPublicCertificatePrototype() throws Throwable {
        CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
                .autoRotate(true)
                .interval(Long.valueOf("1"))
                .unit("day")
                .build();
        assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
        assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
        assertEquals(rotationPolicyModel.unit(), "day");

        PublicCertificatePrototype publicCertificatePrototypeModel = new PublicCertificatePrototype.Builder()
                .secretType("public_cert")
                .name("my-secret-example")
                .description("Extended description for this secret.")
                .secretGroupId("default")
                .labels(java.util.Arrays.asList("my-label"))
                .commonName("example.com")
                .altNames(java.util.Arrays.asList("s1.example.com", "*.s2.example.com"))
                .keyAlgorithm("RSA2048")
                .ca("my-ca-config")
                .dns("my-dns-config")
                .bundleCerts(true)
                .rotation(rotationPolicyModel)
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(publicCertificatePrototypeModel.secretType(), "public_cert");
        assertEquals(publicCertificatePrototypeModel.name(), "my-secret-example");
        assertEquals(publicCertificatePrototypeModel.description(), "Extended description for this secret.");
        assertEquals(publicCertificatePrototypeModel.secretGroupId(), "default");
        assertEquals(publicCertificatePrototypeModel.labels(), java.util.Arrays.asList("my-label"));
        assertEquals(publicCertificatePrototypeModel.commonName(), "example.com");
        assertEquals(publicCertificatePrototypeModel.altNames(), java.util.Arrays.asList("s1.example.com", "*.s2.example.com"));
        assertEquals(publicCertificatePrototypeModel.keyAlgorithm(), "RSA2048");
        assertEquals(publicCertificatePrototypeModel.ca(), "my-ca-config");
        assertEquals(publicCertificatePrototypeModel.dns(), "my-dns-config");
        assertEquals(publicCertificatePrototypeModel.bundleCerts(), Boolean.valueOf(true));
        assertEquals(publicCertificatePrototypeModel.rotation(), rotationPolicyModel);
        assertEquals(publicCertificatePrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(publicCertificatePrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

        String json = TestUtilities.serialize(publicCertificatePrototypeModel);

        PublicCertificatePrototype publicCertificatePrototypeModelNew = TestUtilities.deserialize(json, PublicCertificatePrototype.class);
        assertTrue(publicCertificatePrototypeModelNew instanceof PublicCertificatePrototype);
        assertEquals(publicCertificatePrototypeModelNew.secretType(), "public_cert");
        assertEquals(publicCertificatePrototypeModelNew.name(), "my-secret-example");
        assertEquals(publicCertificatePrototypeModelNew.description(), "Extended description for this secret.");
        assertEquals(publicCertificatePrototypeModelNew.secretGroupId(), "default");
        assertEquals(publicCertificatePrototypeModelNew.commonName(), "example.com");
        assertEquals(publicCertificatePrototypeModelNew.keyAlgorithm(), "RSA2048");
        assertEquals(publicCertificatePrototypeModelNew.ca(), "my-ca-config");
        assertEquals(publicCertificatePrototypeModelNew.dns(), "my-dns-config");
        assertEquals(publicCertificatePrototypeModelNew.bundleCerts(), Boolean.valueOf(true));
        assertEquals(publicCertificatePrototypeModelNew.rotation().toString(), rotationPolicyModel.toString());
        assertEquals(publicCertificatePrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(publicCertificatePrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPublicCertificatePrototypeError() throws Throwable {
        new PublicCertificatePrototype.Builder().build();
    }

}