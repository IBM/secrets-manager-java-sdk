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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PasswordGenerationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PasswordGenerationPolicy model.
 */
public class PasswordGenerationPolicyTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPasswordGenerationPolicy() throws Throwable {
        PasswordGenerationPolicy passwordGenerationPolicyModel = new PasswordGenerationPolicy.Builder()
                .length(Long.valueOf("32"))
                .includeDigits(true)
                .includeSymbols(true)
                .includeUppercase(true)
                .build();
        assertEquals(passwordGenerationPolicyModel.length(), Long.valueOf("32"));
        assertEquals(passwordGenerationPolicyModel.includeDigits(), Boolean.valueOf(true));
        assertEquals(passwordGenerationPolicyModel.includeSymbols(), Boolean.valueOf(true));
        assertEquals(passwordGenerationPolicyModel.includeUppercase(), Boolean.valueOf(true));

        String json = TestUtilities.serialize(passwordGenerationPolicyModel);

        PasswordGenerationPolicy passwordGenerationPolicyModelNew = TestUtilities.deserialize(json, PasswordGenerationPolicy.class);
        assertTrue(passwordGenerationPolicyModelNew instanceof PasswordGenerationPolicy);
        assertEquals(passwordGenerationPolicyModelNew.length(), Long.valueOf("32"));
        assertEquals(passwordGenerationPolicyModelNew.includeDigits(), Boolean.valueOf(true));
        assertEquals(passwordGenerationPolicyModelNew.includeSymbols(), Boolean.valueOf(true));
        assertEquals(passwordGenerationPolicyModelNew.includeUppercase(), Boolean.valueOf(true));
    }
}