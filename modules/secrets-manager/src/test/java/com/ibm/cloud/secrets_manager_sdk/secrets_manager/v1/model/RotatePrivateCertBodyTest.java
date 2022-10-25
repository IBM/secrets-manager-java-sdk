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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.RotatePrivateCertBody;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the RotatePrivateCertBody model.
 */
public class RotatePrivateCertBodyTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testRotatePrivateCertBody() throws Throwable {
        RotatePrivateCertBody rotatePrivateCertBodyModel = new RotatePrivateCertBody.Builder()
                .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
                .build();
        assertEquals(rotatePrivateCertBodyModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
        assertEquals(rotatePrivateCertBodyModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));

        String json = TestUtilities.serialize(rotatePrivateCertBodyModel);

        RotatePrivateCertBody rotatePrivateCertBodyModelNew = TestUtilities.deserialize(json, RotatePrivateCertBody.class);
        assertTrue(rotatePrivateCertBodyModelNew instanceof RotatePrivateCertBody);
        assertEquals(rotatePrivateCertBodyModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
        assertEquals(rotatePrivateCertBodyModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testRotatePrivateCertBodyError() throws Throwable {
        new RotatePrivateCertBody.Builder().build();
    }

}