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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateConfigurationRotateAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateConfigurationRotateAction model.
 */
public class PrivateCertificateConfigurationRotateActionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateConfigurationRotateAction() throws Throwable {
    PrivateCertificateConfigurationRotateAction privateCertificateConfigurationRotateActionModel = new PrivateCertificateConfigurationRotateAction();
    assertNull(privateCertificateConfigurationRotateActionModel.getCommonName());
    assertNull(privateCertificateConfigurationRotateActionModel.getAltNames());
    assertNull(privateCertificateConfigurationRotateActionModel.getIpSans());
    assertNull(privateCertificateConfigurationRotateActionModel.getUriSans());
    assertNull(privateCertificateConfigurationRotateActionModel.getOtherSans());
    assertNull(privateCertificateConfigurationRotateActionModel.getFormat());
    assertNull(privateCertificateConfigurationRotateActionModel.getMaxPathLength());
    assertNull(privateCertificateConfigurationRotateActionModel.isExcludeCnFromSans());
    assertNull(privateCertificateConfigurationRotateActionModel.getPermittedDnsDomains());
    assertNull(privateCertificateConfigurationRotateActionModel.isUseCsrValues());
    assertNull(privateCertificateConfigurationRotateActionModel.getOu());
    assertNull(privateCertificateConfigurationRotateActionModel.getOrganization());
    assertNull(privateCertificateConfigurationRotateActionModel.getCountry());
    assertNull(privateCertificateConfigurationRotateActionModel.getLocality());
    assertNull(privateCertificateConfigurationRotateActionModel.getProvince());
    assertNull(privateCertificateConfigurationRotateActionModel.getStreetAddress());
    assertNull(privateCertificateConfigurationRotateActionModel.getPostalCode());
    assertNull(privateCertificateConfigurationRotateActionModel.getSerialNumber());
    assertNull(privateCertificateConfigurationRotateActionModel.getCsr());
  }
}