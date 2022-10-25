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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignCsrActionResult;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the SignCsrActionResult model.
 */
public class SignCsrActionResultTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testSignCsrActionResult() throws Throwable {
        SignCsrActionResult signCsrActionResultModel = new SignCsrActionResult();
        assertNull(signCsrActionResultModel.getCommonName());
        assertNull(signCsrActionResultModel.getAltNames());
        assertNull(signCsrActionResultModel.getIpSans());
        assertNull(signCsrActionResultModel.getUriSans());
        assertNull(signCsrActionResultModel.getOtherSans());
        assertNull(signCsrActionResultModel.getTtl());
        assertNull(signCsrActionResultModel.getFormat());
        assertNull(signCsrActionResultModel.getMaxPathLength());
        assertNull(signCsrActionResultModel.isExcludeCnFromSans());
        assertNull(signCsrActionResultModel.getPermittedDnsDomains());
        assertNull(signCsrActionResultModel.isUseCsrValues());
        assertNull(signCsrActionResultModel.getOu());
        assertNull(signCsrActionResultModel.getOrganization());
        assertNull(signCsrActionResultModel.getCountry());
        assertNull(signCsrActionResultModel.getLocality());
        assertNull(signCsrActionResultModel.getProvince());
        assertNull(signCsrActionResultModel.getStreetAddress());
        assertNull(signCsrActionResultModel.getPostalCode());
        assertNull(signCsrActionResultModel.getSerialNumber());
        assertNull(signCsrActionResultModel.getCsr());
    }
}