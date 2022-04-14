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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RootCertificateAuthorityConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the RootCertificateAuthorityConfig model.
 */
public class RootCertificateAuthorityConfigTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testRootCertificateAuthorityConfig() throws Throwable {
        RootCertificateAuthorityConfig rootCertificateAuthorityConfigModel = new RootCertificateAuthorityConfig.Builder()
                .maxTtl("8760h")
                .crlExpiry("72h")
                .crlDisable(false)
                .crlDistributionPointsEncoded(false)
                .issuingCertificatesUrlsEncoded(false)
                .commonName("example.com")
                .altNames(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .ipSans("testString")
                .uriSans("testString")
                .otherSans(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .ttl("testString")
                .format("pem")
                .privateKeyFormat("der")
                .keyType("rsa")
                .keyBits(Long.valueOf("26"))
                .maxPathLength(Long.valueOf("26"))
                .excludeCnFromSans(false)
                .permittedDnsDomains(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .ou(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .organization(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .country(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .locality(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .province(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .streetAddress(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .postalCode(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .serialNumber("d9:be:fe:35:ba:09:42:b5")
                .build();
        assertEquals(rootCertificateAuthorityConfigModel.maxTtl(), "8760h");
        assertEquals(rootCertificateAuthorityConfigModel.crlExpiry(), "72h");
        assertEquals(rootCertificateAuthorityConfigModel.crlDisable(), Boolean.valueOf(false));
        assertEquals(rootCertificateAuthorityConfigModel.crlDistributionPointsEncoded(), Boolean.valueOf(false));
        assertEquals(rootCertificateAuthorityConfigModel.issuingCertificatesUrlsEncoded(), Boolean.valueOf(false));
        assertEquals(rootCertificateAuthorityConfigModel.commonName(), "example.com");
        assertEquals(rootCertificateAuthorityConfigModel.altNames(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.ipSans(), "testString");
        assertEquals(rootCertificateAuthorityConfigModel.uriSans(), "testString");
        assertEquals(rootCertificateAuthorityConfigModel.otherSans(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.ttl(), "testString");
        assertEquals(rootCertificateAuthorityConfigModel.format(), "pem");
        assertEquals(rootCertificateAuthorityConfigModel.privateKeyFormat(), "der");
        assertEquals(rootCertificateAuthorityConfigModel.keyType(), "rsa");
        assertEquals(rootCertificateAuthorityConfigModel.keyBits(), Long.valueOf("26"));
        assertEquals(rootCertificateAuthorityConfigModel.maxPathLength(), Long.valueOf("26"));
        assertEquals(rootCertificateAuthorityConfigModel.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(rootCertificateAuthorityConfigModel.permittedDnsDomains(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.ou(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.organization(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.country(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.locality(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.province(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.streetAddress(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.postalCode(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(rootCertificateAuthorityConfigModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5");

        String json = TestUtilities.serialize(rootCertificateAuthorityConfigModel);

        RootCertificateAuthorityConfig rootCertificateAuthorityConfigModelNew = TestUtilities.deserialize(json, RootCertificateAuthorityConfig.class);
        assertTrue(rootCertificateAuthorityConfigModelNew instanceof RootCertificateAuthorityConfig);
        assertEquals(rootCertificateAuthorityConfigModelNew.maxTtl(), "8760h");
        assertEquals(rootCertificateAuthorityConfigModelNew.crlExpiry(), "72h");
        assertEquals(rootCertificateAuthorityConfigModelNew.crlDisable(), Boolean.valueOf(false));
        assertEquals(rootCertificateAuthorityConfigModelNew.crlDistributionPointsEncoded(), Boolean.valueOf(false));
        assertEquals(rootCertificateAuthorityConfigModelNew.issuingCertificatesUrlsEncoded(), Boolean.valueOf(false));
        assertEquals(rootCertificateAuthorityConfigModelNew.commonName(), "example.com");
        assertEquals(rootCertificateAuthorityConfigModelNew.ipSans(), "testString");
        assertEquals(rootCertificateAuthorityConfigModelNew.uriSans(), "testString");
        assertEquals(rootCertificateAuthorityConfigModelNew.ttl(), "testString");
        assertEquals(rootCertificateAuthorityConfigModelNew.format(), "pem");
        assertEquals(rootCertificateAuthorityConfigModelNew.privateKeyFormat(), "der");
        assertEquals(rootCertificateAuthorityConfigModelNew.keyType(), "rsa");
        assertEquals(rootCertificateAuthorityConfigModelNew.keyBits(), Long.valueOf("26"));
        assertEquals(rootCertificateAuthorityConfigModelNew.maxPathLength(), Long.valueOf("26"));
        assertEquals(rootCertificateAuthorityConfigModelNew.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(rootCertificateAuthorityConfigModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testRootCertificateAuthorityConfigError() throws Throwable {
        new RootCertificateAuthorityConfig.Builder().build();
    }

}