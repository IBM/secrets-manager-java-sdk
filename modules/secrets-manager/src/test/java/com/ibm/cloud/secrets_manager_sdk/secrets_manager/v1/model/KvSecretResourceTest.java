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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.KvSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.*;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the KvSecretResource model.
 */
public class KvSecretResourceTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testKvSecretResource() throws Throwable {
        KvSecretResource kvSecretResourceModel = new KvSecretResource.Builder()
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(java.util.Arrays.asList("testString"))
                .customMetadata(new java.util.HashMap<String, Object>() {
                    {
                        put("foo", "testString");
                    }
                })
                .versionCustomMetadata(new java.util.HashMap<String, Object>() {
                    {
                        put("foo", "testString");
                    }
                })
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .payload(Collections.singletonMap("foo", "testString"))
                .build();
        assertEquals(kvSecretResourceModel.name(), "testString");
        assertEquals(kvSecretResourceModel.description(), "testString");
        assertEquals(kvSecretResourceModel.secretGroupId(), "testString");
        assertEquals(kvSecretResourceModel.labels(), java.util.Arrays.asList("testString"));
        assertEquals(kvSecretResourceModel.customMetadata(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });
        assertEquals(kvSecretResourceModel.versionCustomMetadata(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });
        assertEquals(kvSecretResourceModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
        assertEquals(kvSecretResourceModel.payload(), Collections.singletonMap("foo", "testString"));

        String json = TestUtilities.serialize(kvSecretResourceModel);

        KvSecretResource kvSecretResourceModelNew = TestUtilities.deserialize(json, KvSecretResource.class);
        assertTrue(kvSecretResourceModelNew instanceof KvSecretResource);
        assertEquals(kvSecretResourceModelNew.name(), "testString");
        assertEquals(kvSecretResourceModelNew.description(), "testString");
        assertEquals(kvSecretResourceModelNew.secretGroupId(), "testString");
        assertEquals(kvSecretResourceModelNew.customMetadata().toString(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        }.toString());
        assertEquals(kvSecretResourceModelNew.versionCustomMetadata().toString(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        }.toString());
        assertEquals(kvSecretResourceModelNew.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
        assertEquals(kvSecretResourceModelNew.payload(), Collections.singletonMap("foo", "testString"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testKvSecretResourceError() throws Throwable {
        new KvSecretResource.Builder().build();
    }

}