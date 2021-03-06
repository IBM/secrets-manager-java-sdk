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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the IAMCredentialsSecretMetadata model.
 */
public class IAMCredentialsSecretMetadataTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testIAMCredentialsSecretMetadata() throws Throwable {
        IAMCredentialsSecretMetadata iamCredentialsSecretMetadataModel = new IAMCredentialsSecretMetadata.Builder()
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")))
                .name("example-secret")
                .description("Extended description for this secret.")
                .ttl("24h")
                .build();
        assertEquals(iamCredentialsSecretMetadataModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")));
        assertEquals(iamCredentialsSecretMetadataModel.name(), "example-secret");
        assertEquals(iamCredentialsSecretMetadataModel.description(), "Extended description for this secret.");
        assertEquals(iamCredentialsSecretMetadataModel.ttl(), "24h");

        String json = TestUtilities.serialize(iamCredentialsSecretMetadataModel);

        IAMCredentialsSecretMetadata iamCredentialsSecretMetadataModelNew = TestUtilities.deserialize(json, IAMCredentialsSecretMetadata.class);
        assertTrue(iamCredentialsSecretMetadataModelNew instanceof IAMCredentialsSecretMetadata);
        assertEquals(iamCredentialsSecretMetadataModelNew.name(), "example-secret");
        assertEquals(iamCredentialsSecretMetadataModelNew.description(), "Extended description for this secret.");
        assertEquals(iamCredentialsSecretMetadataModelNew.ttl(), "24h");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testIAMCredentialsSecretMetadataError() throws Throwable {
        new IAMCredentialsSecretMetadata.Builder().build();
    }

}