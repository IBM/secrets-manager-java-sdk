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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCAPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationIntermediateCAPatch model.
 */
public class PrivateCertificateConfigurationIntermediateCAPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationIntermediateCAPatch() throws Throwable {
    PrivateCertificateConfigurationIntermediateCAPatch privateCertificateConfigurationIntermediateCaPatchModel = new PrivateCertificateConfigurationIntermediateCAPatch.Builder()
      .maxTtl("8760h")
      .crlExpiry("72h")
      .crlDisable(true)
      .crlDistributionPointsEncoded(true)
      .issuingCertificatesUrlsEncoded(true)
      .build();
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModel.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModel.crlExpiry(), "72h");
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModel.crlDisable(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModel.crlDistributionPointsEncoded(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModel.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(privateCertificateConfigurationIntermediateCaPatchModel);

    PrivateCertificateConfigurationIntermediateCAPatch privateCertificateConfigurationIntermediateCaPatchModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationIntermediateCAPatch.class);
    assertTrue(privateCertificateConfigurationIntermediateCaPatchModelNew instanceof PrivateCertificateConfigurationIntermediateCAPatch);
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModelNew.maxTtl(), "8760h");
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModelNew.crlExpiry(), "72h");
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModelNew.crlDisable(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModelNew.crlDistributionPointsEncoded(), Boolean.valueOf(true));
    assertEquals(privateCertificateConfigurationIntermediateCaPatchModelNew.issuingCertificatesUrlsEncoded(), Boolean.valueOf(true));
  }
  @Test
  public void testPrivateCertificateConfigurationIntermediateCAPatchAsPatch() throws Throwable {
    PrivateCertificateConfigurationIntermediateCAPatch privateCertificateConfigurationIntermediateCaPatchModel = new PrivateCertificateConfigurationIntermediateCAPatch.Builder()
      .maxTtl("8760h")
      .crlExpiry("72h")
      .crlDisable(true)
      .crlDistributionPointsEncoded(true)
      .issuingCertificatesUrlsEncoded(true)
      .build();

    Map<String, Object> mergePatch = privateCertificateConfigurationIntermediateCaPatchModel.asPatch();

    assertEquals(mergePatch.get("max_ttl"), "8760h");
    assertEquals(mergePatch.get("crl_expiry"), "72h");
    assertTrue(mergePatch.containsKey("crl_disable"));
    assertTrue(mergePatch.containsKey("crl_distribution_points_encoded"));
    assertTrue(mergePatch.containsKey("issuing_certificates_urls_encoded"));
  }

}