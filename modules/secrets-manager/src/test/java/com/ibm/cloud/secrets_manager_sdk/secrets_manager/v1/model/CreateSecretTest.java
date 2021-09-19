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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CollectionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CreateSecret;
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
 * Unit test class for the CreateSecret model.
 */
public class CreateSecretTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testCreateSecret() throws Throwable {
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.config+json")
                .collectionTotal(Long.valueOf("1"))
                .build();
        assertEquals(collectionMetadataModel.collectionType(), "application/vnd.ibm.secrets-manager.config+json");
        assertEquals(collectionMetadataModel.collectionTotal(), Long.valueOf("1"));

        ArbitrarySecretResource secretResourceModel = new ArbitrarySecretResource.Builder()
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .payload("testString")
                .build();
        assertEquals(secretResourceModel.name(), "testString");
        assertEquals(secretResourceModel.description(), "testString");
        assertEquals(secretResourceModel.secretGroupId(), "testString");
        assertEquals(secretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(secretResourceModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
        assertEquals(secretResourceModel.payload(), "testString");

        CreateSecret createSecretModel = new CreateSecret.Builder()
                .metadata(collectionMetadataModel)
                .resources(new java.util.ArrayList<SecretResource>(java.util.Arrays.asList(secretResourceModel)))
                .build();
        assertEquals(createSecretModel.metadata(), collectionMetadataModel);
        assertEquals(createSecretModel.resources(), new java.util.ArrayList<SecretResource>(java.util.Arrays.asList(secretResourceModel)));

        String json = TestUtilities.serialize(createSecretModel);

        CreateSecret createSecretModelNew = TestUtilities.deserialize(json, CreateSecret.class);
        assertTrue(createSecretModelNew instanceof CreateSecret);
        assertEquals(createSecretModelNew.metadata().toString(), collectionMetadataModel.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCreateSecretError() throws Throwable {
        new CreateSecret.Builder().build();
    }

}