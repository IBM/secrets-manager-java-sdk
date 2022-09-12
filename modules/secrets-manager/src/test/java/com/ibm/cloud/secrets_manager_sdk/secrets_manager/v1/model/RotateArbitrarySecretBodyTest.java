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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateArbitrarySecretBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the RotateArbitrarySecretBody model.
 */
public class RotateArbitrarySecretBodyTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testRotateArbitrarySecretBody() throws Throwable {
        RotateArbitrarySecretBody rotateArbitrarySecretBodyModel = new RotateArbitrarySecretBody.Builder()
                .payload("testString")
                .customMetadata(new java.util.HashMap<String, Object>() {
                    {
                        put("foo", "testString");
                    }
                })
                .versionCustomMetadata(new java.util.HashMap<String, Object>() {
                    {
                        put("foo", "testString");
                    }
                })
                .build();
        assertEquals(rotateArbitrarySecretBodyModel.payload(), "testString");
        assertEquals(rotateArbitrarySecretBodyModel.customMetadata(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });
        assertEquals(rotateArbitrarySecretBodyModel.versionCustomMetadata(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });

        String json = TestUtilities.serialize(rotateArbitrarySecretBodyModel);

        RotateArbitrarySecretBody rotateArbitrarySecretBodyModelNew = TestUtilities.deserialize(json, RotateArbitrarySecretBody.class);
        assertTrue(rotateArbitrarySecretBodyModelNew instanceof RotateArbitrarySecretBody);
        assertEquals(rotateArbitrarySecretBodyModelNew.payload(), "testString");
        assertEquals(rotateArbitrarySecretBodyModelNew.customMetadata().toString(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        }.toString());
        assertEquals(rotateArbitrarySecretBodyModelNew.versionCustomMetadata().toString(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        }.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testRotateArbitrarySecretBodyError() throws Throwable {
        new RotateArbitrarySecretBody.Builder().build();
    }

}