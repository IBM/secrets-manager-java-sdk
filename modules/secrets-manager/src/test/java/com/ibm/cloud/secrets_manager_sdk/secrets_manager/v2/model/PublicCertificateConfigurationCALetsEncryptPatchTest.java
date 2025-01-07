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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PublicCertificateConfigurationCALetsEncryptPatch;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PublicCertificateConfigurationCALetsEncryptPatch model.
 */
public class PublicCertificateConfigurationCALetsEncryptPatchTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPublicCertificateConfigurationCALetsEncryptPatch() throws Throwable {
        PublicCertificateConfigurationCALetsEncryptPatch publicCertificateConfigurationCaLetsEncryptPatchModel = new PublicCertificateConfigurationCALetsEncryptPatch.Builder()
                .letsEncryptEnvironment("production")
                .letsEncryptPrivateKey("testString")
                .letsEncryptPreferredChain("testString")
                .build();
        assertEquals(publicCertificateConfigurationCaLetsEncryptPatchModel.letsEncryptEnvironment(), "production");
        assertEquals(publicCertificateConfigurationCaLetsEncryptPatchModel.letsEncryptPrivateKey(), "testString");
        assertEquals(publicCertificateConfigurationCaLetsEncryptPatchModel.letsEncryptPreferredChain(), "testString");

        String json = TestUtilities.serialize(publicCertificateConfigurationCaLetsEncryptPatchModel);

        PublicCertificateConfigurationCALetsEncryptPatch publicCertificateConfigurationCaLetsEncryptPatchModelNew = TestUtilities.deserialize(json, PublicCertificateConfigurationCALetsEncryptPatch.class);
        assertTrue(publicCertificateConfigurationCaLetsEncryptPatchModelNew instanceof PublicCertificateConfigurationCALetsEncryptPatch);
        assertEquals(publicCertificateConfigurationCaLetsEncryptPatchModelNew.letsEncryptEnvironment(), "production");
        assertEquals(publicCertificateConfigurationCaLetsEncryptPatchModelNew.letsEncryptPrivateKey(), "testString");
        assertEquals(publicCertificateConfigurationCaLetsEncryptPatchModelNew.letsEncryptPreferredChain(), "testString");
    }

    @Test
    public void testPublicCertificateConfigurationCALetsEncryptPatchAsPatch() throws Throwable {
        PublicCertificateConfigurationCALetsEncryptPatch publicCertificateConfigurationCaLetsEncryptPatchModel = new PublicCertificateConfigurationCALetsEncryptPatch.Builder()
                .letsEncryptEnvironment("production")
                .letsEncryptPrivateKey("testString")
                .letsEncryptPreferredChain("testString")
                .build();

        Map<String, Object> mergePatch = publicCertificateConfigurationCaLetsEncryptPatchModel.asPatch();

        assertEquals(mergePatch.get("lets_encrypt_environment"), "production");
        assertEquals(mergePatch.get("lets_encrypt_private_key"), "testString");
        assertEquals(mergePatch.get("lets_encrypt_preferred_chain"), "testString");
    }


    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPublicCertificateConfigurationCALetsEncryptPatchError() throws Throwable {
        new PublicCertificateConfigurationCALetsEncryptPatch.Builder().build();
    }

}