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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.ArbitrarySecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the ArbitrarySecretMetadata model.
 */
public class ArbitrarySecretMetadataTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testArbitrarySecretMetadata() throws Throwable {
        ArbitrarySecretMetadata arbitrarySecretMetadataModel = new ArbitrarySecretMetadata.Builder()
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")))
                .name("example-secret")
                .description("Extended description for this secret.")
                .expirationDate(DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"))
                .build();
        assertEquals(arbitrarySecretMetadataModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")));
        assertEquals(arbitrarySecretMetadataModel.name(), "example-secret");
        assertEquals(arbitrarySecretMetadataModel.description(), "Extended description for this secret.");
        assertEquals(arbitrarySecretMetadataModel.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));

        String json = TestUtilities.serialize(arbitrarySecretMetadataModel);

        ArbitrarySecretMetadata arbitrarySecretMetadataModelNew = TestUtilities.deserialize(json, ArbitrarySecretMetadata.class);
        assertTrue(arbitrarySecretMetadataModelNew instanceof ArbitrarySecretMetadata);
        assertEquals(arbitrarySecretMetadataModelNew.name(), "example-secret");
        assertEquals(arbitrarySecretMetadataModelNew.description(), "Extended description for this secret.");
        assertEquals(arbitrarySecretMetadataModelNew.expirationDate(), DateUtils.parseAsDateTime("2030-04-01T09:30:00.000Z"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testArbitrarySecretMetadataError() throws Throwable {
        new ArbitrarySecretMetadata.Builder().build();
    }

}