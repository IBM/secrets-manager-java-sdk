/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.KVSecretVersionPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the KVSecretVersionPrototype model.
 */
public class KVSecretVersionPrototypeTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testKVSecretVersionPrototype() throws Throwable {
        KVSecretVersionPrototype kvSecretVersionPrototypeModel = new KVSecretVersionPrototype.Builder()
                .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(kvSecretVersionPrototypeModel.data(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(kvSecretVersionPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(kvSecretVersionPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

        String json = TestUtilities.serialize(kvSecretVersionPrototypeModel);

        KVSecretVersionPrototype kvSecretVersionPrototypeModelNew = TestUtilities.deserialize(json, KVSecretVersionPrototype.class);
        assertTrue(kvSecretVersionPrototypeModelNew instanceof KVSecretVersionPrototype);
        assertEquals(kvSecretVersionPrototypeModelNew.data().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(kvSecretVersionPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(kvSecretVersionPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testKVSecretVersionPrototypeError() throws Throwable {
        new KVSecretVersionPrototype.Builder().build();
    }

}