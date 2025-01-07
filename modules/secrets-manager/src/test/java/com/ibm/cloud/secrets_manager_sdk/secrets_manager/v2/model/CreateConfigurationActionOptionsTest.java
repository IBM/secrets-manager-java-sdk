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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.CreateConfigurationActionOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationActionRotateCRLPrototype;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the CreateConfigurationActionOptions model.
 */
public class CreateConfigurationActionOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testCreateConfigurationActionOptions() throws Throwable {
        PrivateCertificateConfigurationActionRotateCRLPrototype configurationActionPrototypeModel = new PrivateCertificateConfigurationActionRotateCRLPrototype.Builder()
                .actionType("private_cert_configuration_action_rotate_crl")
                .build();
        assertEquals(configurationActionPrototypeModel.actionType(), "private_cert_configuration_action_rotate_crl");

        CreateConfigurationActionOptions createConfigurationActionOptionsModel = new CreateConfigurationActionOptions.Builder()
                .name("configuration-name")
                .configActionPrototype(configurationActionPrototypeModel)
                .xSmAcceptConfigurationType("public_cert_configuration_dns_cloud_internet_services")
                .build();
        assertEquals(createConfigurationActionOptionsModel.name(), "configuration-name");
        assertEquals(createConfigurationActionOptionsModel.configActionPrototype(), configurationActionPrototypeModel);
        assertEquals(createConfigurationActionOptionsModel.xSmAcceptConfigurationType(), "public_cert_configuration_dns_cloud_internet_services");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCreateConfigurationActionOptionsError() throws Throwable {
        new CreateConfigurationActionOptions.Builder().build();
    }

}