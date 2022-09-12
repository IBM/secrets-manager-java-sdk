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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotateUsernamePasswordSecretBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the RotateUsernamePasswordSecretBody model.
 */
public class RotateUsernamePasswordSecretBodyTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testRotateUsernamePasswordSecretBody() throws Throwable {
        RotateUsernamePasswordSecretBody rotateUsernamePasswordSecretBodyModel = new RotateUsernamePasswordSecretBody.Builder()
                .password("testString")
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
        assertEquals(rotateUsernamePasswordSecretBodyModel.password(), "testString");
        assertEquals(rotateUsernamePasswordSecretBodyModel.customMetadata(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });
        assertEquals(rotateUsernamePasswordSecretBodyModel.versionCustomMetadata(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });

        String json = TestUtilities.serialize(rotateUsernamePasswordSecretBodyModel);

        RotateUsernamePasswordSecretBody rotateUsernamePasswordSecretBodyModelNew = TestUtilities.deserialize(json, RotateUsernamePasswordSecretBody.class);
        assertTrue(rotateUsernamePasswordSecretBodyModelNew instanceof RotateUsernamePasswordSecretBody);
        assertEquals(rotateUsernamePasswordSecretBodyModelNew.password(), "testString");
        assertEquals(rotateUsernamePasswordSecretBodyModelNew.customMetadata().toString(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        }.toString());
        assertEquals(rotateUsernamePasswordSecretBodyModelNew.versionCustomMetadata().toString(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        }.toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testRotateUsernamePasswordSecretBodyError() throws Throwable {
        new RotateUsernamePasswordSecretBody.Builder().build();
    }

}