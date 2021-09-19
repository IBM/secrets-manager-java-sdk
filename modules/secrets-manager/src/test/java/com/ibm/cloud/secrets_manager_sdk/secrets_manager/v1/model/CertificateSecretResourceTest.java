/*
 * (C) Copyright IBM Corp. 2021.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateValidity;
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
 * Unit test class for the CertificateSecretResource model.
 */
public class CertificateSecretResourceTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testCertificateSecretResource() throws Throwable {
        CertificateValidity certificateValidityModel = new CertificateValidity.Builder()
                .notBefore(DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"))
                .notAfter(DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"))
                .build();
        assertEquals(certificateValidityModel.notBefore(), DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"));
        assertEquals(certificateValidityModel.notAfter(), DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"));

        CertificateSecretResource certificateSecretResourceModel = new CertificateSecretResource.Builder()
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .certificate("testString")
                .privateKey("testString")
                .intermediate("testString")
                .validity(certificateValidityModel)
                .altNames(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .build();
        assertEquals(certificateSecretResourceModel.name(), "testString");
        assertEquals(certificateSecretResourceModel.description(), "testString");
        assertEquals(certificateSecretResourceModel.secretGroupId(), "testString");
        assertEquals(certificateSecretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(certificateSecretResourceModel.certificate(), "testString");
        assertEquals(certificateSecretResourceModel.privateKey(), "testString");
        assertEquals(certificateSecretResourceModel.intermediate(), "testString");
        assertEquals(certificateSecretResourceModel.validity(), certificateValidityModel);
        assertEquals(certificateSecretResourceModel.altNames(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

        String json = TestUtilities.serialize(certificateSecretResourceModel);

        CertificateSecretResource certificateSecretResourceModelNew = TestUtilities.deserialize(json, CertificateSecretResource.class);
        assertTrue(certificateSecretResourceModelNew instanceof CertificateSecretResource);
        assertEquals(certificateSecretResourceModelNew.name(), "testString");
        assertEquals(certificateSecretResourceModelNew.description(), "testString");
        assertEquals(certificateSecretResourceModelNew.secretGroupId(), "testString");
        assertEquals(certificateSecretResourceModelNew.certificate(), "testString");
        assertEquals(certificateSecretResourceModelNew.privateKey(), "testString");
        assertEquals(certificateSecretResourceModelNew.intermediate(), "testString");
        assertEquals(certificateSecretResourceModelNew.validity().toString(), certificateValidityModel.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCertificateSecretResourceError() throws Throwable {
        new CertificateSecretResource.Builder().build();
    }

}