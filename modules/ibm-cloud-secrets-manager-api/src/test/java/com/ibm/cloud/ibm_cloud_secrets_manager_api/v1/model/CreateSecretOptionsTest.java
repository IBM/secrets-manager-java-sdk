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

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.CollectionMetadata;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.CreateSecretOptions;
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
 * Unit test class for the CreateSecretOptions model.
 */
public class CreateSecretOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testCreateSecretOptions() throws Throwable {
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.secret+json")
                .collectionTotal(Long.valueOf("1"))
                .build();
        assertEquals(collectionMetadataModel.collectionType(), "application/vnd.ibm.secrets-manager.secret+json");
        assertEquals(collectionMetadataModel.collectionTotal(), Long.valueOf("1"));

        SecretResourceArbitrarySecretResource secretResourceModel = new SecretResourceArbitrarySecretResource.Builder()
                .type("testString")
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .payload("testString")
                .build();
        assertEquals(secretResourceModel.type(), "testString");
        assertEquals(secretResourceModel.name(), "testString");
        assertEquals(secretResourceModel.description(), "testString");
        assertEquals(secretResourceModel.secretGroupId(), "testString");
        assertEquals(secretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(secretResourceModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
        assertEquals(secretResourceModel.payload(), "testString");

        CreateSecretOptions createSecretOptionsModel = new CreateSecretOptions.Builder()
                .secretType("arbitrary")
                .metadata(collectionMetadataModel)
                .resources(new java.util.ArrayList<SecretResource>(java.util.Arrays.asList(secretResourceModel)))
                .build();
        assertEquals(createSecretOptionsModel.secretType(), "arbitrary");
        assertEquals(createSecretOptionsModel.metadata(), collectionMetadataModel);
        assertEquals(createSecretOptionsModel.resources(), new java.util.ArrayList<SecretResource>(java.util.Arrays.asList(secretResourceModel)));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCreateSecretOptionsError() throws Throwable {
        new CreateSecretOptions.Builder().build();
    }

}