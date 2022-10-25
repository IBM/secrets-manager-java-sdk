/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.SignIntermediateAction;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SignIntermediateAction model.
 */
public class SignIntermediateActionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSignIntermediateAction() throws Throwable {
    SignIntermediateAction signIntermediateActionModel = new SignIntermediateAction.Builder()
      .commonName("example.com")
      .altNames("testString")
      .ipSans("testString")
      .uriSans("testString")
      .otherSans(java.util.Arrays.asList("testString"))
      .ttl("12h")
      .format("pem")
      .maxPathLength(Long.valueOf("26"))
      .excludeCnFromSans(false)
      .permittedDnsDomains(java.util.Arrays.asList("testString"))
      .useCsrValues(false)
      .ou(java.util.Arrays.asList("testString"))
      .organization(java.util.Arrays.asList("testString"))
      .country(java.util.Arrays.asList("testString"))
      .locality(java.util.Arrays.asList("testString"))
      .province(java.util.Arrays.asList("testString"))
      .streetAddress(java.util.Arrays.asList("testString"))
      .postalCode(java.util.Arrays.asList("testString"))
      .serialNumber("d9:be:fe:35:ba:09:42:b5")
      .intermediateCertificateAuthority("testString")
      .build();
    assertEquals(signIntermediateActionModel.commonName(), "example.com");
    assertEquals(signIntermediateActionModel.altNames(), "testString");
    assertEquals(signIntermediateActionModel.ipSans(), "testString");
    assertEquals(signIntermediateActionModel.uriSans(), "testString");
    assertEquals(signIntermediateActionModel.otherSans(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.ttl(), "12h");
    assertEquals(signIntermediateActionModel.format(), "pem");
    assertEquals(signIntermediateActionModel.maxPathLength(), Long.valueOf("26"));
    assertEquals(signIntermediateActionModel.excludeCnFromSans(), Boolean.valueOf(false));
    assertEquals(signIntermediateActionModel.permittedDnsDomains(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.useCsrValues(), Boolean.valueOf(false));
    assertEquals(signIntermediateActionModel.ou(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.organization(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.country(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.locality(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.province(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.streetAddress(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.postalCode(), java.util.Arrays.asList("testString"));
    assertEquals(signIntermediateActionModel.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
    assertEquals(signIntermediateActionModel.intermediateCertificateAuthority(), "testString");

    String json = TestUtilities.serialize(signIntermediateActionModel);

    SignIntermediateAction signIntermediateActionModelNew = TestUtilities.deserialize(json, SignIntermediateAction.class);
    assertTrue(signIntermediateActionModelNew instanceof SignIntermediateAction);
    assertEquals(signIntermediateActionModelNew.commonName(), "example.com");
    assertEquals(signIntermediateActionModelNew.altNames(), "testString");
    assertEquals(signIntermediateActionModelNew.ipSans(), "testString");
    assertEquals(signIntermediateActionModelNew.uriSans(), "testString");
    assertEquals(signIntermediateActionModelNew.ttl(), "12h");
    assertEquals(signIntermediateActionModelNew.format(), "pem");
    assertEquals(signIntermediateActionModelNew.maxPathLength(), Long.valueOf("26"));
    assertEquals(signIntermediateActionModelNew.excludeCnFromSans(), Boolean.valueOf(false));
    assertEquals(signIntermediateActionModelNew.useCsrValues(), Boolean.valueOf(false));
    assertEquals(signIntermediateActionModelNew.serialNumber(), "d9:be:fe:35:ba:09:42:b5");
    assertEquals(signIntermediateActionModelNew.intermediateCertificateAuthority(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSignIntermediateActionError() throws Throwable {
    new SignIntermediateAction.Builder().build();
  }

}