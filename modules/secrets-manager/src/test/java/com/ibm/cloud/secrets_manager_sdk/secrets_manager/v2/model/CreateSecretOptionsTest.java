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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ArbitrarySecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateSecretOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSecretOptions model.
 */
public class CreateSecretOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testCreateSecretOptions() throws Throwable {
        ArbitrarySecretPrototype secretPrototypeModel = new ArbitrarySecretPrototype.Builder()
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .description("Extended description for this secret.")
                .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
                .labels(java.util.Arrays.asList("my-label"))
                .name("my-secret-example")
                .secretGroupId("default")
                .secretType("arbitrary")
                .payload("secret-credentials")
                .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(secretPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(secretPrototypeModel.description(), "Extended description for this secret.");
        assertEquals(secretPrototypeModel.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));
        assertEquals(secretPrototypeModel.labels(), java.util.Arrays.asList("my-label"));
        assertEquals(secretPrototypeModel.name(), "my-secret-example");
        assertEquals(secretPrototypeModel.secretGroupId(), "default");
        assertEquals(secretPrototypeModel.secretType(), "arbitrary");
        assertEquals(secretPrototypeModel.payload(), "secret-credentials");
        assertEquals(secretPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

        CreateSecretOptions createSecretOptionsModel = new CreateSecretOptions.Builder()
                .secretPrototype(secretPrototypeModel)
                .build();
        assertEquals(createSecretOptionsModel.secretPrototype(), secretPrototypeModel);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCreateSecretOptionsError() throws Throwable {
        new CreateSecretOptions.Builder().build();
    }

}