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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IntermediateCertificateAuthorityConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the IntermediateCertificateAuthorityConfig model.
 */
public class IntermediateCertificateAuthorityConfigTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testIntermediateCertificateAuthorityConfig() throws Throwable {
        IntermediateCertificateAuthorityConfig intermediateCertificateAuthorityConfigModel = new IntermediateCertificateAuthorityConfig.Builder()
                .maxTtl("8760h")
                .signingMethod("internal")
                .issuer("example-ca")
                .crlExpiry("72h")
                .crlDisable(false)
                .crlDistributionPointsEncoded(false)
                .issuingCertificatesUrlsEncoded(false)
                .commonName("example.com")
                .altNames("testString")
                .ipSans("testString")
                .uriSans("testString")
                .otherSans(java.util.Arrays.asList("testString"))
                .format("pem")
                .privateKeyFormat("der")
                .keyType("rsa")
                .keyBits(Long.valueOf("26"))
                .excludeCnFromSans(false)
                .ou(java.util.Arrays.asList("testString"))
                .organization(java.util.Arrays.asList("testString"))
                .country(java.util.Arrays.asList("testString"))
                .locality(java.util.Arrays.asList("testString"))
                .province(java.util.Arrays.asList("testString"))
                .streetAddress(java.util.Arrays.asList("testString"))
                .postalCode(java.util.Arrays.asList("testString"))
                .serialNumber("d9:be:fe:35:ba:09:42:b5")
                .build();
        assertEquals(intermediateCertificateAuthorityConfigModel.maxTtl(), "8760h");
        assertEquals(intermediateCertificateAuthorityConfigModel.signingMethod(), "internal");
        assertEquals(intermediateCertificateAuthorityConfigModel.issuer(), "example-ca");
        assertEquals(intermediateCertificateAuthorityConfigModel.crlExpiry(), "72h");
        assertEquals(intermediateCertificateAuthorityConfigModel.crlDisable(), Boolean.valueOf(false));
        assertEquals(intermediateCertificateAuthorityConfigModel.crlDistributionPointsEncoded(), Boolean.valueOf(false));
        assertEquals(intermediateCertificateAuthorityConfigModel.issuingCertificatesUrlsEncoded(), Boolean.valueOf(false));
        assertEquals(intermediateCertificateAuthorityConfigModel.commonName(), "example.com");
        assertEquals(intermediateCertificateAuthorityConfigModel.altNames(), "testString");
        assertEquals(intermediateCertificateAuthorityConfigModel.ipSans(), "testString");
        assertEquals(intermediateCertificateAuthorityConfigModel.uriSans(), "testString");
        assertEquals(intermediateCertificateAuthorityConfigModel.otherSans(), java.util.Arrays.asList("testString"));
        assertEquals(intermediateCertificateAuthorityConfigModel.format(), "pem");
        assertEquals(intermediateCertificateAuthorityConfigModel.privateKeyFormat(), "der");
        assertEquals(intermediateCertificateAuthorityConfigModel.keyType(), "rsa");
        assertEquals(intermediateCertificateAuthorityConfigModel.keyBits(), Long.valueOf("26"));
        assertEquals(intermediateCertificateAuthorityConfigModel.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(intermediateCertificateAuthorityConfigModel.ou(), java.util.Arrays.asList("testString"));
        assertEquals(intermediateCertificateAuthorityConfigModel.organization(), java.util.Arrays.asList("testString"));
        assertEquals(intermediateCertificateAuthorityConfigModel.country(), java.util.Arrays.asList("testString"));
        assertEquals(intermediateCertificateAuthorityConfigModel.locality(), java.util.Arrays.asList("testString"));
        assertEquals(intermediateCertificateAuthorityConfigModel.province(), java.util.Arrays.asList("testString"));
        assertEquals(intermediateCertificateAuthorityConfigModel.streetAddress(), java.util.Arrays.asList("testString"));
        assertEquals(intermediateCertificateAuthorityConfigModel.postalCode(), java.util.Arrays.asList("testString"));
        assertEquals(intermediateCertificateAuthorityConfigModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5");

        String json = TestUtilities.serialize(intermediateCertificateAuthorityConfigModel);

        IntermediateCertificateAuthorityConfig intermediateCertificateAuthorityConfigModelNew = TestUtilities.deserialize(json, IntermediateCertificateAuthorityConfig.class);
        assertTrue(intermediateCertificateAuthorityConfigModelNew instanceof IntermediateCertificateAuthorityConfig);
        assertEquals(intermediateCertificateAuthorityConfigModelNew.maxTtl(), "8760h");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.signingMethod(), "internal");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.issuer(), "example-ca");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.crlExpiry(), "72h");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.crlDisable(), Boolean.valueOf(false));
        assertEquals(intermediateCertificateAuthorityConfigModelNew.crlDistributionPointsEncoded(), Boolean.valueOf(false));
        assertEquals(intermediateCertificateAuthorityConfigModelNew.issuingCertificatesUrlsEncoded(), Boolean.valueOf(false));
        assertEquals(intermediateCertificateAuthorityConfigModelNew.commonName(), "example.com");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.altNames(), "testString");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.ipSans(), "testString");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.uriSans(), "testString");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.format(), "pem");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.privateKeyFormat(), "der");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.keyType(), "rsa");
        assertEquals(intermediateCertificateAuthorityConfigModelNew.keyBits(), Long.valueOf("26"));
        assertEquals(intermediateCertificateAuthorityConfigModelNew.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(intermediateCertificateAuthorityConfigModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testIntermediateCertificateAuthorityConfigError() throws Throwable {
        new IntermediateCertificateAuthorityConfig.Builder().build();
    }

}