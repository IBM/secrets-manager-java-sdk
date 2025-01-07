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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CommonRotationPolicy;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsResourceKey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSecretSourceServiceRO;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIam;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamApikey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamRole;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceIamServiceid;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceInstance;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceParameters;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.ServiceCredentialsSourceServiceRole;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the ServiceCredentialsSecretMetadata model.
 */
public class ServiceCredentialsSecretMetadataTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testServiceCredentialsSecretMetadata() throws Throwable {
        ServiceCredentialsSecretMetadata serviceCredentialsSecretMetadataModel = new ServiceCredentialsSecretMetadata();
        assertNull(serviceCredentialsSecretMetadataModel.getCreatedBy());
        assertNull(serviceCredentialsSecretMetadataModel.getCreatedAt());
        assertNull(serviceCredentialsSecretMetadataModel.getCrn());
        assertNull(serviceCredentialsSecretMetadataModel.getCustomMetadata());
        assertNull(serviceCredentialsSecretMetadataModel.getDescription());
        assertNull(serviceCredentialsSecretMetadataModel.getId());
        assertNull(serviceCredentialsSecretMetadataModel.getLabels());
        assertNull(serviceCredentialsSecretMetadataModel.getSecretGroupId());
        assertNull(serviceCredentialsSecretMetadataModel.getSecretType());
        assertNull(serviceCredentialsSecretMetadataModel.getUpdatedAt());
        assertNull(serviceCredentialsSecretMetadataModel.getVersionsTotal());
        assertNull(serviceCredentialsSecretMetadataModel.getRotation());
        assertNull(serviceCredentialsSecretMetadataModel.getTtl());
        assertNull(serviceCredentialsSecretMetadataModel.getExpirationDate());
        assertNull(serviceCredentialsSecretMetadataModel.getSourceService());
    }
}