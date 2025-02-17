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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CertificateValidity;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicCertificateMetadata model.
 */
public class PublicCertificateMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicCertificateMetadata() throws Throwable {
    PublicCertificateMetadata publicCertificateMetadataModel = new PublicCertificateMetadata();
    assertNull(publicCertificateMetadataModel.getCreatedBy());
    assertNull(publicCertificateMetadataModel.getCreatedAt());
    assertNull(publicCertificateMetadataModel.getCrn());
    assertNull(publicCertificateMetadataModel.getCustomMetadata());
    assertNull(publicCertificateMetadataModel.getDescription());
    assertNull(publicCertificateMetadataModel.getId());
    assertNull(publicCertificateMetadataModel.getLabels());
    assertNull(publicCertificateMetadataModel.getSecretGroupId());
    assertNull(publicCertificateMetadataModel.getSecretType());
    assertNull(publicCertificateMetadataModel.getUpdatedAt());
    assertNull(publicCertificateMetadataModel.getVersionsTotal());
    assertNull(publicCertificateMetadataModel.getSigningAlgorithm());
    assertNull(publicCertificateMetadataModel.getAltNames());
    assertNull(publicCertificateMetadataModel.getCommonName());
    assertNull(publicCertificateMetadataModel.getExpirationDate());
    assertNull(publicCertificateMetadataModel.getIssuer());
    assertNull(publicCertificateMetadataModel.getKeyAlgorithm());
    assertNull(publicCertificateMetadataModel.getSerialNumber());
    assertNull(publicCertificateMetadataModel.getValidity());
    assertNull(publicCertificateMetadataModel.getRotation());
  }
}