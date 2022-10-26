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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretVersionMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UpdateSecretVersionMetadataOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateSecretVersionMetadataOptions model.
 */
public class UpdateSecretVersionMetadataOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testUpdateSecretVersionMetadataOptions() throws Throwable {
        CollectionMetadata collectionMetadataModel = new CollectionMetadata.Builder()
                .collectionType("application/vnd.ibm.secrets-manager.config+json")
                .collectionTotal(Long.valueOf("1"))
                .build();
        assertEquals(collectionMetadataModel.collectionType(), "application/vnd.ibm.secrets-manager.config+json");
        assertEquals(collectionMetadataModel.collectionTotal(), Long.valueOf("1"));

        UpdateSecretVersionMetadata updateSecretVersionMetadataModel = new UpdateSecretVersionMetadata.Builder()
                .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(updateSecretVersionMetadataModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

        UpdateSecretVersionMetadataOptions updateSecretVersionMetadataOptionsModel = new UpdateSecretVersionMetadataOptions.Builder()
                .secretType("arbitrary")
                .id("testString")
                .versionId("testString")
                .metadata(collectionMetadataModel)
                .resources(java.util.Arrays.asList(updateSecretVersionMetadataModel))
                .build();
        assertEquals(updateSecretVersionMetadataOptionsModel.secretType(), "arbitrary");
        assertEquals(updateSecretVersionMetadataOptionsModel.id(), "testString");
        assertEquals(updateSecretVersionMetadataOptionsModel.versionId(), "testString");
        assertEquals(updateSecretVersionMetadataOptionsModel.metadata(), collectionMetadataModel);
        assertEquals(updateSecretVersionMetadataOptionsModel.resources(), java.util.Arrays.asList(updateSecretVersionMetadataModel));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateSecretVersionMetadataOptionsError() throws Throwable {
        new UpdateSecretVersionMetadataOptions.Builder().build();
    }

}