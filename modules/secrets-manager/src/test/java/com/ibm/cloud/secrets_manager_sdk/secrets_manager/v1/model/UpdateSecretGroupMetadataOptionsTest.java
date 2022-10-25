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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CollectionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SecretGroupMetadataUpdatable;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretGroupMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateSecretGroupMetadataOptions model.
 */
public class UpdateSecretGroupMetadataOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testUpdateSecretGroupMetadataOptions() throws Throwable {
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.config+json")
                .collectionTotal(Long.valueOf("1"))
                .build();
        assertEquals(collectionMetadataModel.collectionType(), "application/vnd.ibm.secrets-manager.config+json");
        assertEquals(collectionMetadataModel.collectionTotal(), Long.valueOf("1"));

        SecretGroupMetadataUpdatable secretGroupMetadataUpdatableModel = new SecretGroupMetadataUpdatable.Builder()
                .name("testString")
                .description("testString")
                .build();
        assertEquals(secretGroupMetadataUpdatableModel.name(), "testString");
        assertEquals(secretGroupMetadataUpdatableModel.description(), "testString");

        UpdateSecretGroupMetadataOptions updateSecretGroupMetadataOptionsModel = new UpdateSecretGroupMetadataOptions.Builder()
                .id("testString")
                .metadata(collectionMetadataModel)
                .resources(java.util.Arrays.asList(secretGroupMetadataUpdatableModel))
                .build();
        assertEquals(updateSecretGroupMetadataOptionsModel.id(), "testString");
        assertEquals(updateSecretGroupMetadataOptionsModel.metadata(), collectionMetadataModel);
        assertEquals(updateSecretGroupMetadataOptionsModel.resources(), java.util.Arrays.asList(secretGroupMetadataUpdatableModel));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateSecretGroupMetadataOptionsError() throws Throwable {
        new UpdateSecretGroupMetadataOptions.Builder().build();
    }

}