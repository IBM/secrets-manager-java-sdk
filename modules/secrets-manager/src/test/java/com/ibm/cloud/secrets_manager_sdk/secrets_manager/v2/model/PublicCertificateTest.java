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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificate;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PublicCertificate model.
 */
public class PublicCertificateTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPublicCertificate() throws Throwable {
        PublicCertificate publicCertificateModel = new PublicCertificate();
        assertNull(publicCertificateModel.getCreatedBy());
        assertNull(publicCertificateModel.getCreatedAt());
        assertNull(publicCertificateModel.getCrn());
        assertNull(publicCertificateModel.getCustomMetadata());
        assertNull(publicCertificateModel.getDescription());
        assertNull(publicCertificateModel.getId());
        assertNull(publicCertificateModel.getLabels());
        assertNull(publicCertificateModel.getSecretGroupId());
        assertNull(publicCertificateModel.getSecretType());
        assertNull(publicCertificateModel.getUpdatedAt());
        assertNull(publicCertificateModel.getVersionsTotal());
        assertNull(publicCertificateModel.getSigningAlgorithm());
        assertNull(publicCertificateModel.getAltNames());
        assertNull(publicCertificateModel.getCommonName());
        assertNull(publicCertificateModel.getExpirationDate());
        assertNull(publicCertificateModel.getIssuer());
        assertNull(publicCertificateModel.getKeyAlgorithm());
        assertNull(publicCertificateModel.getSerialNumber());
        assertNull(publicCertificateModel.getValidity());
        assertNull(publicCertificateModel.getRotation());
        assertNull(publicCertificateModel.getCertificate());
        assertNull(publicCertificateModel.getIntermediate());
        assertNull(publicCertificateModel.getPrivateKey());
    }
}