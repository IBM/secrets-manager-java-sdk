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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ListConfigurationsOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListConfigurationsOptions model.
 */
public class ListConfigurationsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListConfigurationsOptions() throws Throwable {
    ListConfigurationsOptions listConfigurationsOptionsModel = new ListConfigurationsOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("200"))
      .sort("config_type")
      .search("example")
      .secretTypes(java.util.Arrays.asList("iam_credentials", "public_cert", "private_cert", "custom_credentials"))
      .build();
    assertEquals(listConfigurationsOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(listConfigurationsOptionsModel.limit(), Long.valueOf("200"));
    assertEquals(listConfigurationsOptionsModel.sort(), "config_type");
    assertEquals(listConfigurationsOptionsModel.search(), "example");
    assertEquals(listConfigurationsOptionsModel.secretTypes(), java.util.Arrays.asList("iam_credentials", "public_cert", "private_cert", "custom_credentials"));
  }
}