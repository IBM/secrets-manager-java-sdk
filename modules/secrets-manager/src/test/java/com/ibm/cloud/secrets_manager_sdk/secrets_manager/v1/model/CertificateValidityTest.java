/*
 * (C) Copyright IBM Corp. 2021.
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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.CertificateValidity;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CertificateValidity model.
 */
public class CertificateValidityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCertificateValidity() throws Throwable {
    CertificateValidity certificateValidityModel = new CertificateValidity.Builder()
      .notBefore(DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"))
      .notAfter(DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"))
      .build();
    assertEquals(certificateValidityModel.notBefore(), DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"));
    assertEquals(certificateValidityModel.notAfter(), DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"));

    String json = TestUtilities.serialize(certificateValidityModel);

    CertificateValidity certificateValidityModelNew = TestUtilities.deserialize(json, CertificateValidity.class);
    assertTrue(certificateValidityModelNew instanceof CertificateValidity);
    assertEquals(certificateValidityModelNew.notBefore(), DateUtils.parseAsDateTime("2020-10-05T21:33:11.000Z"));
    assertEquals(certificateValidityModelNew.notAfter(), DateUtils.parseAsDateTime("2021-01-01T00:00:00.000Z"));
  }
}