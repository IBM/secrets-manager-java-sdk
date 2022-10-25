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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PrivateCertPolicyRotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertPolicyRotation model.
 */
public class PrivateCertPolicyRotationTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPrivateCertPolicyRotation() throws Throwable {
        PrivateCertPolicyRotation privateCertPolicyRotationModel = new PrivateCertPolicyRotation.Builder()
                .autoRotate(false)
                .interval(Long.valueOf("1"))
                .unit("day")
                .build();
        assertEquals(privateCertPolicyRotationModel.autoRotate(), Boolean.valueOf(false));
        assertEquals(privateCertPolicyRotationModel.interval(), Long.valueOf("1"));
        assertEquals(privateCertPolicyRotationModel.unit(), "day");

        String json = TestUtilities.serialize(privateCertPolicyRotationModel);

        PrivateCertPolicyRotation privateCertPolicyRotationModelNew = TestUtilities.deserialize(json, PrivateCertPolicyRotation.class);
        assertTrue(privateCertPolicyRotationModelNew instanceof PrivateCertPolicyRotation);
        assertEquals(privateCertPolicyRotationModelNew.autoRotate(), Boolean.valueOf(false));
        assertEquals(privateCertPolicyRotationModelNew.interval(), Long.valueOf("1"));
        assertEquals(privateCertPolicyRotationModelNew.unit(), "day");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPrivateCertPolicyRotationError() throws Throwable {
        new PrivateCertPolicyRotation.Builder().build();
    }

}