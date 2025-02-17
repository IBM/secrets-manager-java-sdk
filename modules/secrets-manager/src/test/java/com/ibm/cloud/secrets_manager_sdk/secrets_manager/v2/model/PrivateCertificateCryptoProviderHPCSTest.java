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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoProviderHPCS;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateCryptoProviderHPCS model.
 */
public class PrivateCertificateCryptoProviderHPCSTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateCryptoProviderHPCS() throws Throwable {
    PrivateCertificateCryptoProviderHPCS privateCertificateCryptoProviderHpcsModel = new PrivateCertificateCryptoProviderHPCS.Builder()
      .type("hyper_protect_crypto_services")
      .instanceCrn("crn:v1:bluemix:public:hs-crypto:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::")
      .pinIamCredentialsSecretId("6ebb80d3-26d1-4e24-81d6-afb0d8e22f54")
      .privateKeystoreId("b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5")
      .build();
    assertEquals(privateCertificateCryptoProviderHpcsModel.type(), "hyper_protect_crypto_services");
    assertEquals(privateCertificateCryptoProviderHpcsModel.instanceCrn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::");
    assertEquals(privateCertificateCryptoProviderHpcsModel.pinIamCredentialsSecretId(), "6ebb80d3-26d1-4e24-81d6-afb0d8e22f54");
    assertEquals(privateCertificateCryptoProviderHpcsModel.privateKeystoreId(), "b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5");

    String json = TestUtilities.serialize(privateCertificateCryptoProviderHpcsModel);

    PrivateCertificateCryptoProviderHPCS privateCertificateCryptoProviderHpcsModelNew = TestUtilities.deserialize(json, PrivateCertificateCryptoProviderHPCS.class);
    assertTrue(privateCertificateCryptoProviderHpcsModelNew instanceof PrivateCertificateCryptoProviderHPCS);
    assertEquals(privateCertificateCryptoProviderHpcsModelNew.type(), "hyper_protect_crypto_services");
    assertEquals(privateCertificateCryptoProviderHpcsModelNew.instanceCrn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::");
    assertEquals(privateCertificateCryptoProviderHpcsModelNew.pinIamCredentialsSecretId(), "6ebb80d3-26d1-4e24-81d6-afb0d8e22f54");
    assertEquals(privateCertificateCryptoProviderHpcsModelNew.privateKeystoreId(), "b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificateCryptoProviderHPCSError() throws Throwable {
    new PrivateCertificateCryptoProviderHPCS.Builder().build();
  }

}