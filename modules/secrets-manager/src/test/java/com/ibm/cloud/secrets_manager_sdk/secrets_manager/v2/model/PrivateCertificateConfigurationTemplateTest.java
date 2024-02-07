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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationTemplate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationTemplate model.
 */
public class PrivateCertificateConfigurationTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationTemplate() throws Throwable {
    PrivateCertificateConfigurationTemplate privateCertificateConfigurationTemplateModel = new PrivateCertificateConfigurationTemplate();
    assertNull(privateCertificateConfigurationTemplateModel.getConfigType());
    assertNull(privateCertificateConfigurationTemplateModel.getName());
    assertNull(privateCertificateConfigurationTemplateModel.getSecretType());
    assertNull(privateCertificateConfigurationTemplateModel.getCreatedBy());
    assertNull(privateCertificateConfigurationTemplateModel.getCreatedAt());
    assertNull(privateCertificateConfigurationTemplateModel.getUpdatedAt());
    assertNull(privateCertificateConfigurationTemplateModel.getCertificateAuthority());
    assertNull(privateCertificateConfigurationTemplateModel.getAllowedSecretGroups());
    assertNull(privateCertificateConfigurationTemplateModel.isAllowLocalhost());
    assertNull(privateCertificateConfigurationTemplateModel.getAllowedDomains());
    assertNull(privateCertificateConfigurationTemplateModel.isAllowedDomainsTemplate());
    assertNull(privateCertificateConfigurationTemplateModel.isAllowBareDomains());
    assertNull(privateCertificateConfigurationTemplateModel.isAllowSubdomains());
    assertNull(privateCertificateConfigurationTemplateModel.isAllowGlobDomains());
    assertNull(privateCertificateConfigurationTemplateModel.isAllowAnyName());
    assertNull(privateCertificateConfigurationTemplateModel.isEnforceHostnames());
    assertNull(privateCertificateConfigurationTemplateModel.isAllowIpSans());
    assertNull(privateCertificateConfigurationTemplateModel.getAllowedUriSans());
    assertNull(privateCertificateConfigurationTemplateModel.getAllowedOtherSans());
    assertNull(privateCertificateConfigurationTemplateModel.isServerFlag());
    assertNull(privateCertificateConfigurationTemplateModel.isClientFlag());
    assertNull(privateCertificateConfigurationTemplateModel.isCodeSigningFlag());
    assertNull(privateCertificateConfigurationTemplateModel.isEmailProtectionFlag());
    assertNull(privateCertificateConfigurationTemplateModel.getKeyType());
    assertNull(privateCertificateConfigurationTemplateModel.getKeyBits());
    assertNull(privateCertificateConfigurationTemplateModel.getKeyUsage());
    assertNull(privateCertificateConfigurationTemplateModel.getExtKeyUsage());
    assertNull(privateCertificateConfigurationTemplateModel.getExtKeyUsageOids());
    assertNull(privateCertificateConfigurationTemplateModel.isUseCsrCommonName());
    assertNull(privateCertificateConfigurationTemplateModel.isUseCsrSans());
    assertNull(privateCertificateConfigurationTemplateModel.getOu());
    assertNull(privateCertificateConfigurationTemplateModel.getOrganization());
    assertNull(privateCertificateConfigurationTemplateModel.getCountry());
    assertNull(privateCertificateConfigurationTemplateModel.getLocality());
    assertNull(privateCertificateConfigurationTemplateModel.getProvince());
    assertNull(privateCertificateConfigurationTemplateModel.getStreetAddress());
    assertNull(privateCertificateConfigurationTemplateModel.getPostalCode());
    assertNull(privateCertificateConfigurationTemplateModel.getSerialNumber());
    assertNull(privateCertificateConfigurationTemplateModel.isRequireCn());
    assertNull(privateCertificateConfigurationTemplateModel.getPolicyIdentifiers());
    assertNull(privateCertificateConfigurationTemplateModel.isBasicConstraintsValidForNonCa());
  }
}