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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the UsernamePasswordSecretResource model.
 */
public class UsernamePasswordSecretResourceTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testUsernamePasswordSecretResource() throws Throwable {
        UsernamePasswordSecretResource usernamePasswordSecretResourceModel = new UsernamePasswordSecretResource.Builder()
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
                .username("user123")
                .password("rainy-cloudy-coffee-book")
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .build();
        assertEquals(usernamePasswordSecretResourceModel.name(), "testString");
        assertEquals(usernamePasswordSecretResourceModel.description(), "testString");
        assertEquals(usernamePasswordSecretResourceModel.secretGroupId(), "testString");
        assertEquals(usernamePasswordSecretResourceModel.labels(), java.util.Arrays.asList("testString"));
        assertEquals(usernamePasswordSecretResourceModel.customMetadata(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });
        assertEquals(usernamePasswordSecretResourceModel.versionCustomMetadata(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });
        assertEquals(usernamePasswordSecretResourceModel.username(), "user123");
        assertEquals(usernamePasswordSecretResourceModel.password(), "rainy-cloudy-coffee-book");
        assertEquals(usernamePasswordSecretResourceModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));

        String json = TestUtilities.serialize(usernamePasswordSecretResourceModel);

        UsernamePasswordSecretResource usernamePasswordSecretResourceModelNew = TestUtilities.deserialize(json, UsernamePasswordSecretResource.class);
        assertTrue(usernamePasswordSecretResourceModelNew instanceof UsernamePasswordSecretResource);
        assertEquals(usernamePasswordSecretResourceModelNew.name(), "testString");
        assertEquals(usernamePasswordSecretResourceModelNew.description(), "testString");
        assertEquals(usernamePasswordSecretResourceModelNew.secretGroupId(), "testString");
        assertEquals(usernamePasswordSecretResourceModelNew.customMetadata().toString(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        }.toString());
        assertEquals(usernamePasswordSecretResourceModelNew.versionCustomMetadata().toString(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        }.toString());
        assertEquals(usernamePasswordSecretResourceModelNew.username(), "user123");
        assertEquals(usernamePasswordSecretResourceModelNew.password(), "rainy-cloudy-coffee-book");
        assertEquals(usernamePasswordSecretResourceModelNew.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUsernamePasswordSecretResourceError() throws Throwable {
        new UsernamePasswordSecretResource.Builder().build();
    }

}