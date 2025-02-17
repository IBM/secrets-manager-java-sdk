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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PasswordGenerationPolicyPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecretMetadataPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UsernamePasswordSecretMetadataPatch model.
 */
public class UsernamePasswordSecretMetadataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUsernamePasswordSecretMetadataPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

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

    UsernamePasswordSecretMetadataPatch usernamePasswordSecretMetadataPatchModel = new UsernamePasswordSecretMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .rotation(rotationPolicyModel)
      .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
      .passwordGenerationPolicy(passwordGenerationPolicyPatchModel)
      .build();
    assertEquals(usernamePasswordSecretMetadataPatchModel.name(), "my-secret-example");
    assertEquals(usernamePasswordSecretMetadataPatchModel.description(), "Extended description for this secret.");
    assertEquals(usernamePasswordSecretMetadataPatchModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(usernamePasswordSecretMetadataPatchModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(usernamePasswordSecretMetadataPatchModel.rotation(), rotationPolicyModel);
    assertEquals(usernamePasswordSecretMetadataPatchModel.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));
    assertEquals(usernamePasswordSecretMetadataPatchModel.passwordGenerationPolicy(), passwordGenerationPolicyPatchModel);

    String json = TestUtilities.serialize(usernamePasswordSecretMetadataPatchModel);

    UsernamePasswordSecretMetadataPatch usernamePasswordSecretMetadataPatchModelNew = TestUtilities.deserialize(json, UsernamePasswordSecretMetadataPatch.class);
    assertTrue(usernamePasswordSecretMetadataPatchModelNew instanceof UsernamePasswordSecretMetadataPatch);
    assertEquals(usernamePasswordSecretMetadataPatchModelNew.name(), "my-secret-example");
    assertEquals(usernamePasswordSecretMetadataPatchModelNew.description(), "Extended description for this secret.");
    assertEquals(usernamePasswordSecretMetadataPatchModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(usernamePasswordSecretMetadataPatchModelNew.rotation().toString(), rotationPolicyModel.toString());
    assertEquals(usernamePasswordSecretMetadataPatchModelNew.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));
    assertEquals(usernamePasswordSecretMetadataPatchModelNew.passwordGenerationPolicy().toString(), passwordGenerationPolicyPatchModel.toString());
  }
  @Test
  public void testUsernamePasswordSecretMetadataPatchAsPatch() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();

    PasswordGenerationPolicyPatch passwordGenerationPolicyPatchModel = new PasswordGenerationPolicyPatch.Builder()
      .length(Long.valueOf("12"))
      .includeDigits(true)
      .includeSymbols(true)
      .includeUppercase(true)
      .build();

    UsernamePasswordSecretMetadataPatch usernamePasswordSecretMetadataPatchModel = new UsernamePasswordSecretMetadataPatch.Builder()
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .labels(java.util.Arrays.asList("my-label"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .rotation(rotationPolicyModel)
      .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
      .passwordGenerationPolicy(passwordGenerationPolicyPatchModel)
      .build();

    Map<String, Object> mergePatch = usernamePasswordSecretMetadataPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-secret-example");
    assertEquals(mergePatch.get("description"), "Extended description for this secret.");
    assertTrue(mergePatch.containsKey("labels"));
    assertTrue(mergePatch.containsKey("custom_metadata"));
    assertTrue(mergePatch.containsKey("rotation"));
    assertTrue(mergePatch.containsKey("expiration_date"));
    assertTrue(mergePatch.containsKey("password_generation_policy"));
  }

}