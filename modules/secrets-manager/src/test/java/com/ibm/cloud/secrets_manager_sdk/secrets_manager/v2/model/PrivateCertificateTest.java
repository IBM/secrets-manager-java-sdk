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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CertificateValidity;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificate model.
 */
public class PrivateCertificateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificate() throws Throwable {
    PrivateCertificate privateCertificateModel = new PrivateCertificate();
    assertNull(privateCertificateModel.getCreatedBy());
    assertNull(privateCertificateModel.getCreatedAt());
    assertNull(privateCertificateModel.getCrn());
    assertNull(privateCertificateModel.getCustomMetadata());
    assertNull(privateCertificateModel.getDescription());
    assertNull(privateCertificateModel.getId());
    assertNull(privateCertificateModel.getLabels());
    assertNull(privateCertificateModel.getSecretGroupId());
    assertNull(privateCertificateModel.getSecretType());
    assertNull(privateCertificateModel.getUpdatedAt());
    assertNull(privateCertificateModel.getVersionsTotal());
    assertNull(privateCertificateModel.getSigningAlgorithm());
    assertNull(privateCertificateModel.getAltNames());
    assertNull(privateCertificateModel.getCertificateTemplate());
    assertNull(privateCertificateModel.getCommonName());
    assertNull(privateCertificateModel.getExpirationDate());
    assertNull(privateCertificateModel.getIssuer());
    assertNull(privateCertificateModel.getRotation());
    assertNull(privateCertificateModel.getSerialNumber());
    assertNull(privateCertificateModel.getValidity());
    assertNull(privateCertificateModel.getCertificate());
    assertNull(privateCertificateModel.getPrivateKey());
  }
}