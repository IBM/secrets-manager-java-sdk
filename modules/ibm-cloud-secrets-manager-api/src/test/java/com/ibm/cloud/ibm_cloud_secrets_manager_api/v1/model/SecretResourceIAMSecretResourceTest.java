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

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretResourceIAMSecretResource;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the SecretResourceIAMSecretResource model.
 */
public class SecretResourceIAMSecretResourceTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testSecretResourceIAMSecretResource() throws Throwable {
        SecretResourceIAMSecretResource secretResourceIamSecretResourceModel = new SecretResourceIAMSecretResource.Builder()
                .type("testString")
                .name("testString")
                .description("testString")
                .secretGroupId("testString")
                .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .ttl("24h")
                .accessGroups(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
                .build();
        assertEquals(secretResourceIamSecretResourceModel.type(), "testString");
        assertEquals(secretResourceIamSecretResourceModel.name(), "testString");
        assertEquals(secretResourceIamSecretResourceModel.description(), "testString");
        assertEquals(secretResourceIamSecretResourceModel.secretGroupId(), "testString");
        assertEquals(secretResourceIamSecretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
        assertEquals(secretResourceIamSecretResourceModel.ttl(), "24h");
        assertEquals(secretResourceIamSecretResourceModel.accessGroups(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

        String json = TestUtilities.serialize(secretResourceIamSecretResourceModel);

        SecretResourceIAMSecretResource secretResourceIamSecretResourceModelNew = TestUtilities.deserialize(json, SecretResourceIAMSecretResource.class);
        assertTrue(secretResourceIamSecretResourceModelNew instanceof SecretResourceIAMSecretResource);
        assertEquals(secretResourceIamSecretResourceModelNew.type(), "testString");
        assertEquals(secretResourceIamSecretResourceModelNew.name(), "testString");
        assertEquals(secretResourceIamSecretResourceModelNew.description(), "testString");
        assertEquals(secretResourceIamSecretResourceModelNew.secretGroupId(), "testString");
        assertEquals(secretResourceIamSecretResourceModelNew.ttl(), "24h");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSecretResourceIAMSecretResourceError() throws Throwable {
        new SecretResourceIAMSecretResource.Builder().build();
    }

}