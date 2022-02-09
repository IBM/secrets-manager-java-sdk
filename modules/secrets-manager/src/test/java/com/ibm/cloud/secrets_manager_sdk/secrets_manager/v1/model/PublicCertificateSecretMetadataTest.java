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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IssuanceInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertificateSecretMetadata;
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
                .build();
        assertEquals(rotationModel.autoRotate(), Boolean.valueOf(false));
        assertEquals(rotationModel.rotateKeys(), Boolean.valueOf(false));

        IssuanceInfo issuanceInfoModel = new IssuanceInfo.Builder()
                .build();

        CertificateValidity certificateValidityModel = new CertificateValidity.Builder()
                .notBefore(DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"))
                .notAfter(DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"))
                .build();
        assertEquals(certificateValidityModel.notBefore(), DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"));
        assertEquals(certificateValidityModel.notAfter(), DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"));

        PublicCertificateSecretMetadata publicCertificateSecretMetadataModel = new PublicCertificateSecretMetadata.Builder()
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")))
                .name("example-secret")
                .description("Extended description for this secret.")
                .bundleCerts(true)
                .keyAlgorithm("RSA2048")
                .altNames(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .commonName("example.com")
                .rotation(rotationModel)
                .issuanceInfo(issuanceInfoModel)
                .validity(certificateValidityModel)
                .build();
        assertEquals(publicCertificateSecretMetadataModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")));
        assertEquals(publicCertificateSecretMetadataModel.name(), "example-secret");
        assertEquals(publicCertificateSecretMetadataModel.description(), "Extended description for this secret.");
        assertEquals(publicCertificateSecretMetadataModel.bundleCerts(), Boolean.valueOf(true));
        assertEquals(publicCertificateSecretMetadataModel.keyAlgorithm(), "RSA2048");
        assertEquals(publicCertificateSecretMetadataModel.altNames(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(publicCertificateSecretMetadataModel.commonName(), "example.com");
        assertEquals(publicCertificateSecretMetadataModel.rotation(), rotationModel);
        assertEquals(publicCertificateSecretMetadataModel.issuanceInfo(), issuanceInfoModel);
        assertEquals(publicCertificateSecretMetadataModel.validity(), certificateValidityModel);

        String json = TestUtilities.serialize(publicCertificateSecretMetadataModel);

        PublicCertificateSecretMetadata publicCertificateSecretMetadataModelNew = TestUtilities.deserialize(json, PublicCertificateSecretMetadata.class);
        assertTrue(publicCertificateSecretMetadataModelNew instanceof PublicCertificateSecretMetadata);
        assertEquals(publicCertificateSecretMetadataModelNew.name(), "example-secret");
        assertEquals(publicCertificateSecretMetadataModelNew.description(), "Extended description for this secret.");
        assertEquals(publicCertificateSecretMetadataModelNew.bundleCerts(), Boolean.valueOf(true));
        assertEquals(publicCertificateSecretMetadataModelNew.keyAlgorithm(), "RSA2048");
        assertEquals(publicCertificateSecretMetadataModelNew.commonName(), "example.com");
        assertEquals(publicCertificateSecretMetadataModelNew.rotation().toString(), rotationModel.toString());
        assertEquals(publicCertificateSecretMetadataModelNew.issuanceInfo().toString(), issuanceInfoModel.toString());
        assertEquals(publicCertificateSecretMetadataModelNew.validity().toString(), certificateValidityModel.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPublicCertificateSecretMetadataError() throws Throwable {
        new PublicCertificateSecretMetadata.Builder().build();
    }

}