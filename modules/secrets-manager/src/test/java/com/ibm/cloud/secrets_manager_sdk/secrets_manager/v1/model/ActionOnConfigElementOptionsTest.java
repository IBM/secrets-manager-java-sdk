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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ActionOnConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignCsrAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the ActionOnConfigElementOptions model.
 */
public class ActionOnConfigElementOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testActionOnConfigElementOptions() throws Throwable {
        SignCsrAction configActionModel = new SignCsrAction.Builder()
                .commonName("example.com")
                .altNames(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .ipSans("testString")
                .uriSans("testString")
                .otherSans(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .ttl("12h")
                .format("pem")
                .maxPathLength(Long.valueOf("26"))
                .excludeCnFromSans(false)
                .permittedDnsDomains(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .useCsrValues(false)
                .ou(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .organization(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .country(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .locality(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .province(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .streetAddress(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .postalCode(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .serialNumber("d9:be:fe:35:ba:09:42:b5")
                .csr("testString")
                .build();
        assertEquals(configActionModel.commonName(), "example.com");
        assertEquals(configActionModel.altNames(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.ipSans(), "testString");
        assertEquals(configActionModel.uriSans(), "testString");
        assertEquals(configActionModel.otherSans(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.ttl(), "12h");
        assertEquals(configActionModel.format(), "pem");
        assertEquals(configActionModel.maxPathLength(), Long.valueOf("26"));
        assertEquals(configActionModel.excludeCnFromSans(), Boolean.valueOf(false));
        assertEquals(configActionModel.permittedDnsDomains(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.useCsrValues(), Boolean.valueOf(false));
        assertEquals(configActionModel.ou(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.organization(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.country(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.locality(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.province(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.streetAddress(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.postalCode(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(configActionModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
        assertEquals(configActionModel.csr(), "testString");

        ActionOnConfigElementOptions actionOnConfigElementOptionsModel = new ActionOnConfigElementOptions.Builder()
                .secretType("private_cert")
                .configElement("root_certificate_authorities")
                .configName("testString")
                .action("sign_intermediate")
                .config(configActionModel)
                .build();
        assertEquals(actionOnConfigElementOptionsModel.secretType(), "private_cert");
        assertEquals(actionOnConfigElementOptionsModel.configElement(), "root_certificate_authorities");
        assertEquals(actionOnConfigElementOptionsModel.configName(), "testString");
        assertEquals(actionOnConfigElementOptionsModel.action(), "sign_intermediate");
        assertEquals(actionOnConfigElementOptionsModel.config(), configActionModel);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testActionOnConfigElementOptionsError() throws Throwable {
        new ActionOnConfigElementOptions.Builder().build();
    }

}