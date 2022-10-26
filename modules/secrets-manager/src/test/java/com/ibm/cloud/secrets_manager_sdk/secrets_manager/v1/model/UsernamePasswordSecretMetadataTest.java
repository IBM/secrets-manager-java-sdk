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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.UsernamePasswordSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the UsernamePasswordSecretMetadata model.
 */
public class UsernamePasswordSecretMetadataTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testUsernamePasswordSecretMetadata() throws Throwable {
        UsernamePasswordSecretMetadata usernamePasswordSecretMetadataModel = new UsernamePasswordSecretMetadata.Builder()
                .labels(java.util.Arrays.asList("dev", "us-south"))
                .name("example-secret")
                .description("Extended description for this secret.")
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .build();
        assertEquals(usernamePasswordSecretMetadataModel.labels(), java.util.Arrays.asList("dev", "us-south"));
        assertEquals(usernamePasswordSecretMetadataModel.name(), "example-secret");
        assertEquals(usernamePasswordSecretMetadataModel.description(), "Extended description for this secret.");
        assertEquals(usernamePasswordSecretMetadataModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(usernamePasswordSecretMetadataModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));

        String json = TestUtilities.serialize(usernamePasswordSecretMetadataModel);

        UsernamePasswordSecretMetadata usernamePasswordSecretMetadataModelNew = TestUtilities.deserialize(json, UsernamePasswordSecretMetadata.class);
        assertTrue(usernamePasswordSecretMetadataModelNew instanceof UsernamePasswordSecretMetadata);
        assertEquals(usernamePasswordSecretMetadataModelNew.name(), "example-secret");
        assertEquals(usernamePasswordSecretMetadataModelNew.description(), "Extended description for this secret.");
        assertEquals(usernamePasswordSecretMetadataModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(usernamePasswordSecretMetadataModelNew.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUsernamePasswordSecretMetadataError() throws Throwable {
        new UsernamePasswordSecretMetadata.Builder().build();
    }

}