/*
 * (C) Copyright IBM Corp. 2024.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PasswordGenerationPolicyPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PasswordGenerationPolicyPatch model.
 */
public class PasswordGenerationPolicyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPasswordGenerationPolicyPatch() throws Throwable {
    PasswordGenerationPolicyPatch passwordGenerationPolicyPatchModel = new PasswordGenerationPolicyPatch.Builder()
      .length(Long.valueOf("12"))
      .includeDigits(true)
      .includeSymbols(true)
      .includeUppercase(true)
      .build();
    assertEquals(passwordGenerationPolicyPatchModel.length(), Long.valueOf("12"));
    assertEquals(passwordGenerationPolicyPatchModel.includeDigits(), Boolean.valueOf(true));
    assertEquals(passwordGenerationPolicyPatchModel.includeSymbols(), Boolean.valueOf(true));
    assertEquals(passwordGenerationPolicyPatchModel.includeUppercase(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(passwordGenerationPolicyPatchModel);

    PasswordGenerationPolicyPatch passwordGenerationPolicyPatchModelNew = TestUtilities.deserialize(json, PasswordGenerationPolicyPatch.class);
    assertTrue(passwordGenerationPolicyPatchModelNew instanceof PasswordGenerationPolicyPatch);
    assertEquals(passwordGenerationPolicyPatchModelNew.length(), Long.valueOf("12"));
    assertEquals(passwordGenerationPolicyPatchModelNew.includeDigits(), Boolean.valueOf(true));
    assertEquals(passwordGenerationPolicyPatchModelNew.includeSymbols(), Boolean.valueOf(true));
    assertEquals(passwordGenerationPolicyPatchModelNew.includeUppercase(), Boolean.valueOf(true));
  }
}