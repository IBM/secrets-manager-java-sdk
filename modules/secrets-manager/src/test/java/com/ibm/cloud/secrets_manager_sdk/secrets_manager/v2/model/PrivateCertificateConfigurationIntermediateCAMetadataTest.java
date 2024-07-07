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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationIntermediateCAMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoKey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoProviderHPCS;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationIntermediateCAMetadata model.
 */
public class PrivateCertificateConfigurationIntermediateCAMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationIntermediateCAMetadata() throws Throwable {
    PrivateCertificateConfigurationIntermediateCAMetadata privateCertificateConfigurationIntermediateCaMetadataModel = new PrivateCertificateConfigurationIntermediateCAMetadata();
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getConfigType());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getName());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getSecretType());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getCreatedBy());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getCreatedAt());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getUpdatedAt());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getCommonName());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.isCrlDistributionPointsEncoded());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getExpirationDate());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getIssuer());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getKeyType());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getKeyBits());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getSigningMethod());
    assertNull(privateCertificateConfigurationIntermediateCaMetadataModel.getCryptoKey());
  }
}