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

package com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model;

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretResourceArbitrarySecretResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the SecretResourceArbitrarySecretResource model.
 */
public class SecretResourceArbitrarySecretResourceTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testSecretResourceArbitrarySecretResource() throws Throwable {
        SecretResourceArbitrarySecretResource secretResourceArbitrarySecretResourceModel = new SecretResourceArbitrarySecretResource.Builder()
                .type("testString")
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .payload("testString")
                .build();
        assertEquals(secretResourceArbitrarySecretResourceModel.type(), "testString");
        assertEquals(secretResourceArbitrarySecretResourceModel.name(), "testString");
        assertEquals(secretResourceArbitrarySecretResourceModel.description(), "testString");
        assertEquals(secretResourceArbitrarySecretResourceModel.secretGroupId(), "testString");
        assertEquals(secretResourceArbitrarySecretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(secretResourceArbitrarySecretResourceModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
        assertEquals(secretResourceArbitrarySecretResourceModel.payload(), "testString");

        String json = TestUtilities.serialize(secretResourceArbitrarySecretResourceModel);

        SecretResourceArbitrarySecretResource secretResourceArbitrarySecretResourceModelNew = TestUtilities.deserialize(json, SecretResourceArbitrarySecretResource.class);
        assertTrue(secretResourceArbitrarySecretResourceModelNew instanceof SecretResourceArbitrarySecretResource);
        assertEquals(secretResourceArbitrarySecretResourceModelNew.type(), "testString");
        assertEquals(secretResourceArbitrarySecretResourceModelNew.name(), "testString");
        assertEquals(secretResourceArbitrarySecretResourceModelNew.description(), "testString");
        assertEquals(secretResourceArbitrarySecretResourceModelNew.secretGroupId(), "testString");
        assertEquals(secretResourceArbitrarySecretResourceModelNew.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
        assertEquals(secretResourceArbitrarySecretResourceModelNew.payload(), "testString");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSecretResourceArbitrarySecretResourceError() throws Throwable {
        new SecretResourceArbitrarySecretResource.Builder().build();
    }

}