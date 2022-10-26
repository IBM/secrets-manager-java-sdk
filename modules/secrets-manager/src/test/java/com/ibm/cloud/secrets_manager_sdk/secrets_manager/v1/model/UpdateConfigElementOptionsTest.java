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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateConfigElementOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateConfigElementOptions model.
 */
public class UpdateConfigElementOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testUpdateConfigElementOptions() throws Throwable {
        UpdateConfigElementOptions updateConfigElementOptionsModel = new UpdateConfigElementOptions.Builder()
                .secretType("public_cert")
                .configElement("certificate_authorities")
                .configName("testString")
                .type("letsencrypt")
                .config(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(updateConfigElementOptionsModel.secretType(), "public_cert");
        assertEquals(updateConfigElementOptionsModel.configElement(), "certificate_authorities");
        assertEquals(updateConfigElementOptionsModel.configName(), "testString");
        assertEquals(updateConfigElementOptionsModel.type(), "letsencrypt");
        assertEquals(updateConfigElementOptionsModel.config(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateConfigElementOptionsError() throws Throwable {
        new UpdateConfigElementOptions.Builder().build();
    }

}