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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCA;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCACSR;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationIntermediateCA model.
 */
public class PrivateCertificateConfigurationIntermediateCATest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationIntermediateCA() throws Throwable {
    PrivateCertificateConfigurationIntermediateCA privateCertificateConfigurationIntermediateCaModel = new PrivateCertificateConfigurationIntermediateCA();
    assertNull(privateCertificateConfigurationIntermediateCaModel.getConfigType());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getName());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getSecretType());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getCreatedBy());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getCreatedAt());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getUpdatedAt());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getCommonName());
    assertNull(privateCertificateConfigurationIntermediateCaModel.isCrlDistributionPointsEncoded());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getExpirationDate());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getIssuer());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getKeyType());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getKeyBits());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getSigningMethod());
    assertNull(privateCertificateConfigurationIntermediateCaModel.isCrlDisable());
    assertNull(privateCertificateConfigurationIntermediateCaModel.isIssuingCertificatesUrlsEncoded());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getAltNames());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getIpSans());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getUriSans());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getOtherSans());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getFormat());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getPrivateKeyFormat());
    assertNull(privateCertificateConfigurationIntermediateCaModel.isExcludeCnFromSans());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getOu());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getOrganization());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getCountry());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getLocality());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getProvince());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getStreetAddress());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getPostalCode());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getSerialNumber());
    assertNull(privateCertificateConfigurationIntermediateCaModel.getData());
  }
}