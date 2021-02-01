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

import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.model.SecretActionOneOfRotateArbitrarySecretBody;
import com.ibm.cloud.ibm_cloud_secrets_manager_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the SecretActionOneOfRotateArbitrarySecretBody model.
 */
public class SecretActionOneOfRotateArbitrarySecretBodyTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testSecretActionOneOfRotateArbitrarySecretBody() throws Throwable {
        SecretActionOneOfRotateArbitrarySecretBody secretActionOneOfRotateArbitrarySecretBodyModel = new SecretActionOneOfRotateArbitrarySecretBody.Builder()
                .payload("testString")
                .build();
        assertEquals(secretActionOneOfRotateArbitrarySecretBodyModel.payload(), "testString");

        String json = TestUtilities.serialize(secretActionOneOfRotateArbitrarySecretBodyModel);

        SecretActionOneOfRotateArbitrarySecretBody secretActionOneOfRotateArbitrarySecretBodyModelNew = TestUtilities.deserialize(json, SecretActionOneOfRotateArbitrarySecretBody.class);
        assertTrue(secretActionOneOfRotateArbitrarySecretBodyModelNew instanceof SecretActionOneOfRotateArbitrarySecretBody);
        assertEquals(secretActionOneOfRotateArbitrarySecretBodyModelNew.payload(), "testString");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSecretActionOneOfRotateArbitrarySecretBodyError() throws Throwable {
        new SecretActionOneOfRotateArbitrarySecretBody.Builder().build();
    }

}