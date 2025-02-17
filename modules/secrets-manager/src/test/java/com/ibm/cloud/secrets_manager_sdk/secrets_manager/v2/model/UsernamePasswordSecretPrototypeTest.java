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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PasswordGenerationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.UsernamePasswordSecretPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UsernamePasswordSecretPrototype model.
 */
public class UsernamePasswordSecretPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUsernamePasswordSecretPrototype() throws Throwable {
    CommonRotationPolicy rotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(rotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(rotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(rotationPolicyModel.unit(), "day");

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

    UsernamePasswordSecretPrototype usernamePasswordSecretPrototypeModel = new UsernamePasswordSecretPrototype.Builder()
      .secretType("username_password")
      .name("my-secret-example")
      .description("Extended description for this secret.")
      .secretGroupId("default")
      .labels(java.util.Arrays.asList("my-label"))
      .username("testString")
      .password("testString")
      .expirationDate(DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"))
      .customMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .versionCustomMetadata(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .rotation(rotationPolicyModel)
      .passwordGenerationPolicy(passwordGenerationPolicyModel)
      .build();
    assertEquals(usernamePasswordSecretPrototypeModel.secretType(), "username_password");
    assertEquals(usernamePasswordSecretPrototypeModel.name(), "my-secret-example");
    assertEquals(usernamePasswordSecretPrototypeModel.description(), "Extended description for this secret.");
    assertEquals(usernamePasswordSecretPrototypeModel.secretGroupId(), "default");
    assertEquals(usernamePasswordSecretPrototypeModel.labels(), java.util.Arrays.asList("my-label"));
    assertEquals(usernamePasswordSecretPrototypeModel.username(), "testString");
    assertEquals(usernamePasswordSecretPrototypeModel.password(), "testString");
    assertEquals(usernamePasswordSecretPrototypeModel.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));
    assertEquals(usernamePasswordSecretPrototypeModel.customMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(usernamePasswordSecretPrototypeModel.versionCustomMetadata(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(usernamePasswordSecretPrototypeModel.rotation(), rotationPolicyModel);
    assertEquals(usernamePasswordSecretPrototypeModel.passwordGenerationPolicy(), passwordGenerationPolicyModel);

    String json = TestUtilities.serialize(usernamePasswordSecretPrototypeModel);

    UsernamePasswordSecretPrototype usernamePasswordSecretPrototypeModelNew = TestUtilities.deserialize(json, UsernamePasswordSecretPrototype.class);
    assertTrue(usernamePasswordSecretPrototypeModelNew instanceof UsernamePasswordSecretPrototype);
    assertEquals(usernamePasswordSecretPrototypeModelNew.secretType(), "username_password");
    assertEquals(usernamePasswordSecretPrototypeModelNew.name(), "my-secret-example");
    assertEquals(usernamePasswordSecretPrototypeModelNew.description(), "Extended description for this secret.");
    assertEquals(usernamePasswordSecretPrototypeModelNew.secretGroupId(), "default");
    assertEquals(usernamePasswordSecretPrototypeModelNew.username(), "testString");
    assertEquals(usernamePasswordSecretPrototypeModelNew.password(), "testString");
    assertEquals(usernamePasswordSecretPrototypeModelNew.expirationDate(), DateUtils.parseAsDateTime("2033-04-12T23:20:50.520Z"));
    assertEquals(usernamePasswordSecretPrototypeModelNew.customMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(usernamePasswordSecretPrototypeModelNew.versionCustomMetadata().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(usernamePasswordSecretPrototypeModelNew.rotation().toString(), rotationPolicyModel.toString());
    assertEquals(usernamePasswordSecretPrototypeModelNew.passwordGenerationPolicy().toString(), passwordGenerationPolicyModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUsernamePasswordSecretPrototypeError() throws Throwable {
    new UsernamePasswordSecretPrototype.Builder().build();
  }

}