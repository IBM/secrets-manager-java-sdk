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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ImportedCertificateManagedCsrResponse;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImportedCertificateManagedCsrResponse model.
 */
public class ImportedCertificateManagedCsrResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportedCertificateManagedCsrResponse() throws Throwable {
    ImportedCertificateManagedCsrResponse importedCertificateManagedCsrResponseModel = new ImportedCertificateManagedCsrResponse();
    assertNull(importedCertificateManagedCsrResponseModel.getOu());
    assertNull(importedCertificateManagedCsrResponseModel.getOrganization());
    assertNull(importedCertificateManagedCsrResponseModel.getCountry());
    assertNull(importedCertificateManagedCsrResponseModel.getLocality());
    assertNull(importedCertificateManagedCsrResponseModel.getProvince());
    assertNull(importedCertificateManagedCsrResponseModel.getStreetAddress());
    assertNull(importedCertificateManagedCsrResponseModel.getPostalCode());
    assertNull(importedCertificateManagedCsrResponseModel.isRequireCn());
    assertNull(importedCertificateManagedCsrResponseModel.getCommonName());
    assertNull(importedCertificateManagedCsrResponseModel.getAltNames());
    assertNull(importedCertificateManagedCsrResponseModel.getIpSans());
    assertNull(importedCertificateManagedCsrResponseModel.getUriSans());
    assertNull(importedCertificateManagedCsrResponseModel.getOtherSans());
    assertNull(importedCertificateManagedCsrResponseModel.isExcludeCnFromSans());
    assertNull(importedCertificateManagedCsrResponseModel.getUserIds());
    assertNull(importedCertificateManagedCsrResponseModel.isServerFlag());
    assertNull(importedCertificateManagedCsrResponseModel.isClientFlag());
    assertNull(importedCertificateManagedCsrResponseModel.isCodeSigningFlag());
    assertNull(importedCertificateManagedCsrResponseModel.isEmailProtectionFlag());
    assertNull(importedCertificateManagedCsrResponseModel.getKeyType());
    assertNull(importedCertificateManagedCsrResponseModel.getKeyBits());
    assertNull(importedCertificateManagedCsrResponseModel.getKeyUsage());
    assertNull(importedCertificateManagedCsrResponseModel.getExtKeyUsage());
    assertNull(importedCertificateManagedCsrResponseModel.getPolicyIdentifiers());
    assertNull(importedCertificateManagedCsrResponseModel.getExtKeyUsageOids());
    assertNull(importedCertificateManagedCsrResponseModel.isRotateKeys());
    assertNull(importedCertificateManagedCsrResponseModel.getCsr());
    assertNull(importedCertificateManagedCsrResponseModel.getPrivateKey());
  }
}