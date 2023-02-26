/*
 * (C) Copyright IBM Corp. 2023.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CommonRotationPolicy model.
 */
public class CommonRotationPolicyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCommonRotationPolicy() throws Throwable {
    CommonRotationPolicy commonRotationPolicyModel = new CommonRotationPolicy.Builder()
      .autoRotate(true)
      .interval(Long.valueOf("1"))
      .unit("day")
      .build();
    assertEquals(commonRotationPolicyModel.autoRotate(), Boolean.valueOf(true));
    assertEquals(commonRotationPolicyModel.interval(), Long.valueOf("1"));
    assertEquals(commonRotationPolicyModel.unit(), "day");

    String json = TestUtilities.serialize(commonRotationPolicyModel);

    CommonRotationPolicy commonRotationPolicyModelNew = TestUtilities.deserialize(json, CommonRotationPolicy.class);
    assertTrue(commonRotationPolicyModelNew instanceof CommonRotationPolicy);
    assertEquals(commonRotationPolicyModelNew.autoRotate(), Boolean.valueOf(true));
    assertEquals(commonRotationPolicyModelNew.interval(), Long.valueOf("1"));
    assertEquals(commonRotationPolicyModelNew.unit(), "day");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCommonRotationPolicyError() throws Throwable {
    new CommonRotationPolicy.Builder().build();
  }

}