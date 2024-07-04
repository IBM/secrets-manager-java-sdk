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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRootCAPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationRootCAPatch model.
 */
public class PrivateCertificateConfigurationRootCAPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationRootCAPatch() throws Throwable {
    PrivateCertificateConfigurationRootCAPatch privateCertificateConfigurationRootCaPatchModel = new PrivateCertificateConfigurationRootCAPatch.Builder()
      .maxTtl("8760h")
      .crlExpiry("72h")
      .crlDisable(true)
      .crlDistributionPointsEncoded(true)
      .issuingCertificatesUrlsEncoded(true)
      .build();
    assertEquals(privateCertificateConfigurationRootCaPatchModel.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationRootCaPatchModel.crlExpiry(), "72h");
    assertEquals(privateCertificateConfigurationRootCaPatchModel.crlDisable(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationRootCaPatchModel.crlDistributionPointsEncoded(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationRootCaPatchModel.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(privateCertificateConfigurationRootCaPatchModel);

    PrivateCertificateConfigurationRootCAPatch privateCertificateConfigurationRootCaPatchModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationRootCAPatch.class);
    assertTrue(privateCertificateConfigurationRootCaPatchModelNew instanceof PrivateCertificateConfigurationRootCAPatch);
    assertEquals(privateCertificateConfigurationRootCaPatchModelNew.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationRootCaPatchModelNew.crlExpiry(), "72h");
    assertEquals(privateCertificateConfigurationRootCaPatchModelNew.crlDisable(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationRootCaPatchModelNew.crlDistributionPointsEncoded(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationRootCaPatchModelNew.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));
  }
  @Test
  public void testPrivateCertificateConfigurationRootCAPatchAsPatch() throws Throwable {
    PrivateCertificateConfigurationRootCAPatch privateCertificateConfigurationRootCaPatchModel = new PrivateCertificateConfigurationRootCAPatch.Builder()
      .maxTtl("8760h")
      .crlExpiry("72h")
      .crlDisable(true)
      .crlDistributionPointsEncoded(true)
      .issuingCertificatesUrlsEncoded(true)
      .build();

    Map<String, Object> mergePatch = privateCertificateConfigurationRootCaPatchModel.asPatch();

    assertEquals(mergePatch.get("max_ttl"), "8760h");
    assertEquals(mergePatch.get("crl_expiry"), "72h");
    assertTrue(mergePatch.containsKey("crl_disable"));
    assertTrue(mergePatch.containsKey("crl_distribution_points_encoded"));
    assertTrue(mergePatch.containsKey("issuing_certificates_urls_encoded"));
  }

}