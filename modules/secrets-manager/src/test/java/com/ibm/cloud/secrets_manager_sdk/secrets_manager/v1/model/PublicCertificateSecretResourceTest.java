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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertificateSecretResource;
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
 * Unit test class for the PublicCertificateSecretResource model.
 */
public class PublicCertificateSecretResourceTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPublicCertificateSecretResource() throws Throwable {
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

        IssuanceInfo issuanceInfoModel = new IssuanceInfo.Builder()
                .build();

        CertificateValidity certificateValidityModel = new CertificateValidity.Builder()
                .notBefore(DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"))
                .notAfter(DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"))
                .build();
        assertEquals(certificateValidityModel.notBefore(), DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"));
        assertEquals(certificateValidityModel.notAfter(), DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"));

        PublicCertificateSecretResource publicCertificateSecretResourceModel = new PublicCertificateSecretResource.Builder()
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .bundleCerts(true)
                .ca("testString")
                .dns("testString")
                .keyAlgorithm("RSA2048")
                .altNames("testString")
                .commonName("example.com")
                .rotation(rotationModel)
                .issuanceInfo(issuanceInfoModel)
                .validity(certificateValidityModel)
                .build();
        assertEquals(publicCertificateSecretResourceModel.name(), "testString");
        assertEquals(publicCertificateSecretResourceModel.description(), "testString");
        assertEquals(publicCertificateSecretResourceModel.secretGroupId(), "testString");
        assertEquals(publicCertificateSecretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(publicCertificateSecretResourceModel.bundleCerts(), Boolean.valueOf(true));
        assertEquals(publicCertificateSecretResourceModel.ca(), "testString");
        assertEquals(publicCertificateSecretResourceModel.dns(), "testString");
        assertEquals(publicCertificateSecretResourceModel.keyAlgorithm(), "RSA2048");
        assertEquals(publicCertificateSecretResourceModel.altNames(), "testString");
        assertEquals(publicCertificateSecretResourceModel.commonName(), "example.com");
        assertEquals(publicCertificateSecretResourceModel.rotation(), rotationModel);
        assertEquals(publicCertificateSecretResourceModel.issuanceInfo(), issuanceInfoModel);
        assertEquals(publicCertificateSecretResourceModel.validity(), certificateValidityModel);

        String json = TestUtilities.serialize(publicCertificateSecretResourceModel);

        PublicCertificateSecretResource publicCertificateSecretResourceModelNew = TestUtilities.deserialize(json, PublicCertificateSecretResource.class);
        assertTrue(publicCertificateSecretResourceModelNew instanceof PublicCertificateSecretResource);
        assertEquals(publicCertificateSecretResourceModelNew.name(), "testString");
        assertEquals(publicCertificateSecretResourceModelNew.description(), "testString");
        assertEquals(publicCertificateSecretResourceModelNew.secretGroupId(), "testString");
        assertEquals(publicCertificateSecretResourceModelNew.bundleCerts(), Boolean.valueOf(true));
        assertEquals(publicCertificateSecretResourceModelNew.ca(), "testString");
        assertEquals(publicCertificateSecretResourceModelNew.dns(), "testString");
        assertEquals(publicCertificateSecretResourceModelNew.keyAlgorithm(), "RSA2048");
        assertEquals(publicCertificateSecretResourceModelNew.altNames(), "testString");
        assertEquals(publicCertificateSecretResourceModelNew.commonName(), "example.com");
        assertEquals(publicCertificateSecretResourceModelNew.rotation().toString(), rotationModel.toString());
        assertEquals(publicCertificateSecretResourceModelNew.issuanceInfo().toString(), issuanceInfoModel.toString());
        assertEquals(publicCertificateSecretResourceModelNew.validity().toString(), certificateValidityModel.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPublicCertificateSecretResourceError() throws Throwable {
        new PublicCertificateSecretResource.Builder().build();
    }

}