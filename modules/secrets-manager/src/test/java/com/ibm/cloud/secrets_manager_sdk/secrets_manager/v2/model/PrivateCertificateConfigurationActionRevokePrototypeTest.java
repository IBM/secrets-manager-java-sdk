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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRevokePrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationActionRevokePrototype model.
 */
public class PrivateCertificateConfigurationActionRevokePrototypeTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPrivateCertificateConfigurationActionRevokePrototype() throws Throwable {
        PrivateCertificateConfigurationActionRevokePrototype privateCertificateConfigurationActionRevokePrototypeModel = new PrivateCertificateConfigurationActionRevokePrototype.Builder()
                .actionType("private_cert_configuration_action_revoke_ca_certificate")
                .build();
        assertEquals(privateCertificateConfigurationActionRevokePrototypeModel.actionType(), "private_cert_configuration_action_revoke_ca_certificate");

        String json = TestUtilities.serialize(privateCertificateConfigurationActionRevokePrototypeModel);

        PrivateCertificateConfigurationActionRevokePrototype privateCertificateConfigurationActionRevokePrototypeModelNew = TestUtilities.deserialize(json, PrivateCertificateConfigurationActionRevokePrototype.class);
        assertTrue(privateCertificateConfigurationActionRevokePrototypeModelNew instanceof PrivateCertificateConfigurationActionRevokePrototype);
        assertEquals(privateCertificateConfigurationActionRevokePrototypeModelNew.actionType(), "private_cert_configuration_action_revoke_ca_certificate");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPrivateCertificateConfigurationActionRevokePrototypeError() throws Throwable {
        new PrivateCertificateConfigurationActionRevokePrototype.Builder().build();
    }

}