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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRootCAPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoKey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoProviderHPCS;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationRootCAPrototype model.
 */
public class PrivateCertificateConfigurationRootCAPrototypeTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPrivateCertificateConfigurationRootCAPrototype() throws Throwable {
        PrivateCertificateCryptoProviderHPCS privateCertificateCryptoProviderModel = new PrivateCertificateCryptoProviderHPCS.Builder()
                .type("hyper_protect_crypto_services")
                .instanceCrn("crn:v1:bluemix:public:hs-crypto:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::")
                .pinIamCredentialsSecretId("6ebb80d3-26d1-4e24-81d6-afb0d8e22f54")
                .privateKeystoreId("b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5")
                .build();
        assertEquals(privateCertificateCryptoProviderModel.type(), "hyper_protect_crypto_services");
        assertEquals(privateCertificateCryptoProviderModel.instanceCrn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::");
        assertEquals(privateCertificateCryptoProviderModel.pinIamCredentialsSecretId(), "6ebb80d3-26d1-4e24-81d6-afb0d8e22f54");
        assertEquals(privateCertificateCryptoProviderModel.privateKeystoreId(), "b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5");

        PrivateCertificateCryptoKey privateCertificateCryptoKeyModel = new PrivateCertificateCryptoKey.Builder()
                .id("ad629506-3aca-4191-b8fc-8b295ec7a19c")
                .label("my_key")
                .allowGenerateKey(false)
                .provider(privateCertificateCryptoProviderModel)
                .build();
        assertEquals(privateCertificateCryptoKeyModel.id(), "ad629506-3aca-4191-b8fc-8b295ec7a19c");
        assertEquals(privateCertificateCryptoKeyModel.label(), "my_key");
        assertEquals(privateCertificateCryptoKeyModel.allowGenerateKey(), Boolean.valueOf(false));
        assertEquals(privateCertificateCryptoKeyModel.provider(), privateCertificateCryptoProviderModel);

        PrivateCertificateConfigurationRootCAPrototype privateCertificateConfigurationRootCaPrototypeModel = new PrivateCertificateConfigurationRootCAPrototype.Builder()
                .configType("private_cert_configuration_root_ca")
                .name("my-example-engine-config")
                .cryptoKey(privateCertificateCryptoKeyModel)
                .maxTtl("8760h")
                .crlExpiry("72h")
                .crlDisable(true)
                .crlDistributionPointsEncoded(true)
                .issuingCertificatesUrlsEncoded(true)
                .commonName("localhost")
                .altNames(java.util.Arrays.asList("s1.example.com", "*.s2.example.com"))
                .ipSans("1.1.1.1, 2.2.2.2")
                .uriSans("testString")
                .otherSans(java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"))
                .ttl("8760h")
                .format("pem")
                .privateKeyFormat("der")
                .keyType("rsa")
                .keyBits(Long.valueOf("4096"))
                .maxPathLength(Long.valueOf("26"))
                .excludeCnFromSans(true)
                .permittedDnsDomains(java.util.Arrays.asList("testString"))
                .ou(java.util.Arrays.asList("testString"))
                .organization(java.util.Arrays.asList("testString"))
                .country(java.util.Arrays.asList("testString"))
                .locality(java.util.Arrays.asList("testString"))
                .province(java.util.Arrays.asList("testString"))
                .streetAddress(java.util.Arrays.asList("testString"))
                .postalCode(java.util.Arrays.asList("testString"))
                .serialNumber("d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5")
                .build();
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.configType(), "private_cert_configuration_root_ca");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.name(), "my-example-engine-config");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.cryptoKey(), privateCertificateCryptoKeyModel);
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.maxTtl(), "8760h");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.crlExpiry(), "72h");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.crlDisable(), Boolean.valueOf(true));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.crlDistributionPointsEncoded(), Boolean.valueOf(true));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.commonName(), "localhost");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.altNames(), java.util.Arrays.asList("s1.example.com", "*.s2.example.com"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.ipSans(), "1.1.1.1, 2.2.2.2");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.uriSans(), "testString");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.otherSans(), java.util.Arrays.asList("2.5.4.5;UTF8:*.example.com"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.ttl(), "8760h");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.format(), "pem");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.privateKeyFormat(), "der");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.keyType(), "rsa");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.keyBits(), Long.valueOf("4096"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.maxPathLength(), Long.valueOf("26"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.excludeCnFromSans(), Boolean.valueOf(true));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.permittedDnsDomains(), java.util.Arrays.asList("testString"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.ou(), java.util.Arrays.asList("testString"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.organization(), java.util.Arrays.asList("testString"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.country(), java.util.Arrays.asList("testString"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.locality(), java.util.Arrays.asList("testString"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.province(), java.util.Arrays.asList("testString"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.streetAddress(), java.util.Arrays.asList("testString"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.postalCode(), java.util.Arrays.asList("testString"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");

        String json = TestUtilities.serialize(privateCertificateConfigurationRootCaPrototypeModel);

        PrivateCertificateConfigurationRootCAPrototype privateCertificateConfigurationRootCaPrototypeModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationRootCAPrototype.class);
        assertTrue(privateCertificateConfigurationRootCaPrototypeModelNew instanceof PrivateCertificateConfigurationRootCAPrototype);
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.configType(), "private_cert_configuration_root_ca");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.name(), "my-example-engine-config");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.cryptoKey().toString(), privateCertificateCryptoKeyModel.toString());
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.maxTtl(), "8760h");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.crlExpiry(), "72h");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.crlDisable(), Boolean.valueOf(true));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.crlDistributionPointsEncoded(), Boolean.valueOf(true));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.commonName(), "localhost");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.ipSans(), "1.1.1.1, 2.2.2.2");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.uriSans(), "testString");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.ttl(), "8760h");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.format(), "pem");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.privateKeyFormat(), "der");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.keyType(), "rsa");
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.keyBits(), Long.valueOf("4096"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.maxPathLength(), Long.valueOf("26"));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.excludeCnFromSans(), Boolean.valueOf(true));
        assertEquals(privateCertificateConfigurationRootCaPrototypeModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5:35:ba:09:42:b5");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPrivateCertificateConfigurationRootCAPrototypeError() throws Throwable {
        new PrivateCertificateConfigurationRootCAPrototype.Builder().build();
    }

}