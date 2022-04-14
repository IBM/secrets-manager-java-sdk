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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertificateSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.Rotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateSecretResource model.
 */
public class PrivateCertificateSecretResourceTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPrivateCertificateSecretResource() throws Throwable {
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

        PrivateCertificateSecretResource privateCertificateSecretResourceModel = new PrivateCertificateSecretResource.Builder()
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
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
        assertEquals(privateCertificateSecretResourceModel.name(), "testString");
        assertEquals(privateCertificateSecretResourceModel.description(), "testString");
        assertEquals(privateCertificateSecretResourceModel.secretGroupId(), "testString");
        assertEquals(privateCertificateSecretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(privateCertificateSecretResourceModel.certificateTemplate(), "cert-template-1");
        assertEquals(privateCertificateSecretResourceModel.commonName(), "example.com");
        assertEquals(privateCertificateSecretResourceModel.altNames(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(privateCertificateSecretResourceModel.ipSans(), "testString");
        assertEquals(privateCertificateSecretResourceModel.uriSans(), "testString");
        assertEquals(privateCertificateSecretResourceModel.otherSans(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(privateCertificateSecretResourceModel.ttl(), "12h");
        assertEquals(privateCertificateSecretResourceModel.format(), "pem");
        assertEquals(privateCertificateSecretResourceModel.privateKeyFormat(), "der");
        assertEquals(privateCertificateSecretResourceModel.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(privateCertificateSecretResourceModel.rotation(), rotationModel);
        assertEquals(privateCertificateSecretResourceModel.validity(), certificateValidityModel);

        String json = TestUtilities.serialize(privateCertificateSecretResourceModel);

        PrivateCertificateSecretResource privateCertificateSecretResourceModelNew = TestUtilities.deserialize(json, PrivateCertificateSecretResource.class);
        assertTrue(privateCertificateSecretResourceModelNew instanceof PrivateCertificateSecretResource);
        assertEquals(privateCertificateSecretResourceModelNew.name(), "testString");
        assertEquals(privateCertificateSecretResourceModelNew.description(), "testString");
        assertEquals(privateCertificateSecretResourceModelNew.secretGroupId(), "testString");
        assertEquals(privateCertificateSecretResourceModelNew.certificateTemplate(), "cert-template-1");
        assertEquals(privateCertificateSecretResourceModelNew.commonName(), "example.com");
        assertEquals(privateCertificateSecretResourceModelNew.ipSans(), "testString");
        assertEquals(privateCertificateSecretResourceModelNew.uriSans(), "testString");
        assertEquals(privateCertificateSecretResourceModelNew.ttl(), "12h");
        assertEquals(privateCertificateSecretResourceModelNew.format(), "pem");
        assertEquals(privateCertificateSecretResourceModelNew.privateKeyFormat(), "der");
        assertEquals(privateCertificateSecretResourceModelNew.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(privateCertificateSecretResourceModelNew.rotation().toString(), rotationModel.toString());
        assertEquals(privateCertificateSecretResourceModelNew.validity().toString(), certificateValidityModel.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPrivateCertificateSecretResourceError() throws Throwable {
        new PrivateCertificateSecretResource.Builder().build();
    }

}