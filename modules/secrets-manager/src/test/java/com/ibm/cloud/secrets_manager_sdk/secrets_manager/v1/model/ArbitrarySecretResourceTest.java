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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the ArbitrarySecretResource model.
 */
public class ArbitrarySecretResourceTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testArbitrarySecretResource() throws Throwable {
        ArbitrarySecretResource arbitrarySecretResourceModel = new ArbitrarySecretResource.Builder()
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(java.util.Arrays.asList("testString"))
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .payload("testString")
                .build();
        assertEquals(arbitrarySecretResourceModel.name(), "testString");
        assertEquals(arbitrarySecretResourceModel.description(), "testString");
        assertEquals(arbitrarySecretResourceModel.secretGroupId(), "testString");
        assertEquals(arbitrarySecretResourceModel.labels(), java.util.Arrays.asList("testString"));
        assertEquals(arbitrarySecretResourceModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(arbitrarySecretResourceModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(arbitrarySecretResourceModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
        assertEquals(arbitrarySecretResourceModel.payload(), "testString");

        String json = TestUtilities.serialize(arbitrarySecretResourceModel);

        ArbitrarySecretResource arbitrarySecretResourceModelNew = TestUtilities.deserialize(json, ArbitrarySecretResource.class);
        assertTrue(arbitrarySecretResourceModelNew instanceof ArbitrarySecretResource);
        assertEquals(arbitrarySecretResourceModelNew.name(), "testString");
        assertEquals(arbitrarySecretResourceModelNew.description(), "testString");
        assertEquals(arbitrarySecretResourceModelNew.secretGroupId(), "testString");
        assertEquals(arbitrarySecretResourceModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(arbitrarySecretResourceModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(arbitrarySecretResourceModelNew.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
        assertEquals(arbitrarySecretResourceModelNew.payload(), "testString");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testArbitrarySecretResourceError() throws Throwable {
        new ArbitrarySecretResource.Builder().build();
    }

}