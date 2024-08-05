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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoKey;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.model.PrivateCertificateCryptoProviderHPCS;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivateCertificateCryptoKey model.
 */
public class PrivateCertificateCryptoKeyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCertificateCryptoKey() throws Throwable {
    PrivateCertificateCryptoProviderHPCS privateCertificateCryptoProviderModel = new PrivateCertificateCryptoProviderHPCS.Builder()
      .type("hyper_protect_crypto_services")
      .instanceCrn("crn:v1:bluemix:public:hs-crypto:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::")
      .pinIamCredentialsSecretId("6ebb80d3-26d1-4e24-81d6-afb0d8e22f54")
      .privateKeystoreId("b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5")
      .build();
    assertEquals(privateCertificateCryptoProviderModel.type(), "hyper_protect_crypto_services");
    assertEquals(privateCertificateCryptoProviderModel.instanceCrn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::");
    assertEquals(privateCertificateCryptoProviderModel.pinIamCredentialsSecretId(), "6ebb80d3-26d1-4e24-81d6-afb0d8e22f54");
    assertEquals(privateCertificateCryptoProviderModel.privateKeystoreId(), "b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5");

    PrivateCertificateCryptoKey privateCertificateCryptoKeyModel = new PrivateCertificateCryptoKey.Builder()
      .id("ad629506-3aca-4191-b8fc-8b295ec7a19c")
      .label("my_key")
      .allowGenerateKey(false)
      .provider(privateCertificateCryptoProviderModel)
      .build();
    assertEquals(privateCertificateCryptoKeyModel.id(), "ad629506-3aca-4191-b8fc-8b295ec7a19c");
    assertEquals(privateCertificateCryptoKeyModel.label(), "my_key");
    assertEquals(privateCertificateCryptoKeyModel.allowGenerateKey(), Boolean.valueOf(false));
    assertEquals(privateCertificateCryptoKeyModel.provider(), privateCertificateCryptoProviderModel);

    String json = TestUtilities.serialize(privateCertificateCryptoKeyModel);

    PrivateCertificateCryptoKey privateCertificateCryptoKeyModelNew = TestUtilities.deserialize(json, PrivateCertificateCryptoKey.class);
    assertTrue(privateCertificateCryptoKeyModelNew instanceof PrivateCertificateCryptoKey);
    assertEquals(privateCertificateCryptoKeyModelNew.id(), "ad629506-3aca-4191-b8fc-8b295ec7a19c");
    assertEquals(privateCertificateCryptoKeyModelNew.label(), "my_key");
    assertEquals(privateCertificateCryptoKeyModelNew.allowGenerateKey(), Boolean.valueOf(false));
    assertEquals(privateCertificateCryptoKeyModelNew.provider().toString(), privateCertificateCryptoProviderModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrivateCertificateCryptoKeyError() throws Throwable {
    new PrivateCertificateCryptoKey.Builder().build();
  }

}