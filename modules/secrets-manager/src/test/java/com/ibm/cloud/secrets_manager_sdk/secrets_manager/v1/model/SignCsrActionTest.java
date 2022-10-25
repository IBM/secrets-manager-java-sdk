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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignCsrAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the SignCsrAction model.
 */
public class SignCsrActionTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testSignCsrAction() throws Throwable {
        SignCsrAction signCsrActionModel = new SignCsrAction.Builder()
                .commonName("example.com")
                .altNames("testString")
                .ipSans("testString")
                .uriSans("testString")
                .otherSans(java.util.Arrays.asList("testString"))
                .ttl("12h")
                .format("pem")
                .maxPathLength(Long.valueOf("26"))
                .excludeCnFromSans(false)
                .permittedDnsDomains(java.util.Arrays.asList("testString"))
                .useCsrValues(false)
                .ou(java.util.Arrays.asList("testString"))
                .organization(java.util.Arrays.asList("testString"))
                .country(java.util.Arrays.asList("testString"))
                .locality(java.util.Arrays.asList("testString"))
                .province(java.util.Arrays.asList("testString"))
                .streetAddress(java.util.Arrays.asList("testString"))
                .postalCode(java.util.Arrays.asList("testString"))
                .serialNumber("d9:be:fe:35:ba:09:42:b5")
                .csr("testString")
                .build();
        assertEquals(signCsrActionModel.commonName(), "example.com");
        assertEquals(signCsrActionModel.altNames(), "testString");
        assertEquals(signCsrActionModel.ipSans(), "testString");
        assertEquals(signCsrActionModel.uriSans(), "testString");
        assertEquals(signCsrActionModel.otherSans(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.ttl(), "12h");
        assertEquals(signCsrActionModel.format(), "pem");
        assertEquals(signCsrActionModel.maxPathLength(), Long.valueOf("26"));
        assertEquals(signCsrActionModel.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(signCsrActionModel.permittedDnsDomains(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.useCsrValues(), Boolean.valueOf(false));
        assertEquals(signCsrActionModel.ou(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.organization(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.country(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.locality(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.province(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.streetAddress(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.postalCode(), java.util.Arrays.asList("testString"));
        assertEquals(signCsrActionModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
        assertEquals(signCsrActionModel.csr(), "testString");

        String json = TestUtilities.serialize(signCsrActionModel);

        SignCsrAction signCsrActionModelNew = TestUtilities.deserialize(json, SignCsrAction.class);
        assertTrue(signCsrActionModelNew instanceof SignCsrAction);
        assertEquals(signCsrActionModelNew.commonName(), "example.com");
        assertEquals(signCsrActionModelNew.altNames(), "testString");
        assertEquals(signCsrActionModelNew.ipSans(), "testString");
        assertEquals(signCsrActionModelNew.uriSans(), "testString");
        assertEquals(signCsrActionModelNew.ttl(), "12h");
        assertEquals(signCsrActionModelNew.format(), "pem");
        assertEquals(signCsrActionModelNew.maxPathLength(), Long.valueOf("26"));
        assertEquals(signCsrActionModelNew.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(signCsrActionModelNew.useCsrValues(), Boolean.valueOf(false));
        assertEquals(signCsrActionModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
        assertEquals(signCsrActionModelNew.csr(), "testString");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSignCsrActionError() throws Throwable {
        new SignCsrAction.Builder().build();
    }

}