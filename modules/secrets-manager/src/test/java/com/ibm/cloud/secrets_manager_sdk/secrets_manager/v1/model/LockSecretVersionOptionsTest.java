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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.LockSecretBodyLocksItem;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.LockSecretVersionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the LockSecretVersionOptions model.
 */
public class LockSecretVersionOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testLockSecretVersionOptions() throws Throwable {
        LockSecretBodyLocksItem lockSecretBodyLocksItemModel = new LockSecretBodyLocksItem.Builder()
                .name("testString")
                .description("testString")
                .attributes(new java.util.HashMap<String, Object>() {
                    {
                        put("foo", "testString");
                    }
                })
                .build();
        assertEquals(lockSecretBodyLocksItemModel.name(), "testString");
        assertEquals(lockSecretBodyLocksItemModel.description(), "testString");
        assertEquals(lockSecretBodyLocksItemModel.attributes(), new java.util.HashMap<String, Object>() {
            {
                put("foo", "testString");
            }
        });

        LockSecretVersionOptions lockSecretVersionOptionsModel = new LockSecretVersionOptions.Builder()
                .secretType("arbitrary")
                .id("testString")
                .versionId("testString")
                .locks(new java.util.ArrayList<LockSecretBodyLocksItem>(java.util.Arrays.asList(lockSecretBodyLocksItemModel)))
                .mode("exclusive")
                .build();
        assertEquals(lockSecretVersionOptionsModel.secretType(), "arbitrary");
        assertEquals(lockSecretVersionOptionsModel.id(), "testString");
        assertEquals(lockSecretVersionOptionsModel.versionId(), "testString");
        assertEquals(lockSecretVersionOptionsModel.locks(), new java.util.ArrayList<LockSecretBodyLocksItem>(java.util.Arrays.asList(lockSecretBodyLocksItemModel)));
        assertEquals(lockSecretVersionOptionsModel.mode(), "exclusive");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testLockSecretVersionOptionsError() throws Throwable {
        new LockSecretVersionOptions.Builder().build();
    }

}