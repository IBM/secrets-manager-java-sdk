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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateValidity;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertificateSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.Rotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateSecretMetadata model.
 */
public class PrivateCertificateSecretMetadataTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPrivateCertificateSecretMetadata() throws Throwable {
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

        CertificateValidity certificateValidityModel = new CertificateValidity.Builder()
                .notBefore(DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"))
                .notAfter(DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"))
                .build();
        assertEquals(certificateValidityModel.notBefore(), DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"));
        assertEquals(certificateValidityModel.notAfter(), DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"));

        PrivateCertificateSecretMetadata privateCertificateSecretMetadataModel = new PrivateCertificateSecretMetadata.Builder()
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")))
                .name("example-secret")
                .description("Extended description for this secret.")
                .certificateTemplate("cert-template-1")
                .commonName("example.com")
                .altNames(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .ipSans("testString")
                .uriSans("testString")
                .otherSans(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .ttl("12h")
                .format("pem")
                .privateKeyFormat("der")
                .excludeCnFromSans(false)
                .rotation(rotationModel)
                .validity(certificateValidityModel)
                .build();
        assertEquals(privateCertificateSecretMetadataModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")));
        assertEquals(privateCertificateSecretMetadataModel.name(), "example-secret");
        assertEquals(privateCertificateSecretMetadataModel.description(), "Extended description for this secret.");
        assertEquals(privateCertificateSecretMetadataModel.certificateTemplate(), "cert-template-1");
        assertEquals(privateCertificateSecretMetadataModel.commonName(), "example.com");
        assertEquals(privateCertificateSecretMetadataModel.altNames(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(privateCertificateSecretMetadataModel.ipSans(), "testString");
        assertEquals(privateCertificateSecretMetadataModel.uriSans(), "testString");
        assertEquals(privateCertificateSecretMetadataModel.otherSans(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(privateCertificateSecretMetadataModel.ttl(), "12h");
        assertEquals(privateCertificateSecretMetadataModel.format(), "pem");
        assertEquals(privateCertificateSecretMetadataModel.privateKeyFormat(), "der");
        assertEquals(privateCertificateSecretMetadataModel.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(privateCertificateSecretMetadataModel.rotation(), rotationModel);
        assertEquals(privateCertificateSecretMetadataModel.validity(), certificateValidityModel);

        String json = TestUtilities.serialize(privateCertificateSecretMetadataModel);

        PrivateCertificateSecretMetadata privateCertificateSecretMetadataModelNew = TestUtilities.deserialize(json, PrivateCertificateSecretMetadata.class);
        assertTrue(privateCertificateSecretMetadataModelNew instanceof PrivateCertificateSecretMetadata);
        assertEquals(privateCertificateSecretMetadataModelNew.name(), "example-secret");
        assertEquals(privateCertificateSecretMetadataModelNew.description(), "Extended description for this secret.");
        assertEquals(privateCertificateSecretMetadataModelNew.certificateTemplate(), "cert-template-1");
        assertEquals(privateCertificateSecretMetadataModelNew.commonName(), "example.com");
        assertEquals(privateCertificateSecretMetadataModelNew.ipSans(), "testString");
        assertEquals(privateCertificateSecretMetadataModelNew.uriSans(), "testString");
        assertEquals(privateCertificateSecretMetadataModelNew.ttl(), "12h");
        assertEquals(privateCertificateSecretMetadataModelNew.format(), "pem");
        assertEquals(privateCertificateSecretMetadataModelNew.privateKeyFormat(), "der");
        assertEquals(privateCertificateSecretMetadataModelNew.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(privateCertificateSecretMetadataModelNew.rotation().toString(), rotationModel.toString());
        assertEquals(privateCertificateSecretMetadataModelNew.validity().toString(), certificateValidityModel.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPrivateCertificateSecretMetadataError() throws Throwable {
        new PrivateCertificateSecretMetadata.Builder().build();
    }

}