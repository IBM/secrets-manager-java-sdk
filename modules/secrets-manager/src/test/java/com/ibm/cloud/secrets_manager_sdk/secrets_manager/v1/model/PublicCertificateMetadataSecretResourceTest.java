/*
 * (C) Copyright IBM Corp. 2021.
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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IssuanceInfo;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PublicCertificateMetadataSecretResource;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.Rotation;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicCertificateMetadataSecretResource model.
 */
public class PublicCertificateMetadataSecretResourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicCertificateMetadataSecretResource() throws Throwable {
    Rotation rotationModel = new Rotation.Builder()
      .autoRotate(false)
      .rotateKeys(false)
      .build();
    assertEquals(rotationModel.autoRotate(), Boolean.valueOf(false));
    assertEquals(rotationModel.rotateKeys(), Boolean.valueOf(false));

    IssuanceInfo issuanceInfoModel = new IssuanceInfo.Builder()
      .build();

    PublicCertificateMetadataSecretResource publicCertificateMetadataSecretResourceModel = new PublicCertificateMetadataSecretResource.Builder()
      .labels(new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")))
      .name("example-secret")
      .description("Extended description for this secret.")
      .bundleCerts(true)
      .keyAlgorithm("RSA2048")
      .altNames(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .commonName("example.com")
      .rotation(rotationModel)
      .issuanceInfo(issuanceInfoModel)
      .build();
    assertEquals(publicCertificateMetadataSecretResourceModel.labels(), new java.util.ArrayList<String>(java.util.Arrays.asList("dev", "us-south")));
    assertEquals(publicCertificateMetadataSecretResourceModel.name(), "example-secret");
    assertEquals(publicCertificateMetadataSecretResourceModel.description(), "Extended description for this secret.");
    assertEquals(publicCertificateMetadataSecretResourceModel.bundleCerts(), Boolean.valueOf(true));
    assertEquals(publicCertificateMetadataSecretResourceModel.keyAlgorithm(), "RSA2048");
    assertEquals(publicCertificateMetadataSecretResourceModel.altNames(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(publicCertificateMetadataSecretResourceModel.commonName(), "example.com");
    assertEquals(publicCertificateMetadataSecretResourceModel.rotation(), rotationModel);
    assertEquals(publicCertificateMetadataSecretResourceModel.issuanceInfo(), issuanceInfoModel);

    String json = TestUtilities.serialize(publicCertificateMetadataSecretResourceModel);

    PublicCertificateMetadataSecretResource publicCertificateMetadataSecretResourceModelNew = TestUtilities.deserialize(json, PublicCertificateMetadataSecretResource.class);
    assertTrue(publicCertificateMetadataSecretResourceModelNew instanceof PublicCertificateMetadataSecretResource);
    assertEquals(publicCertificateMetadataSecretResourceModelNew.name(), "example-secret");
    assertEquals(publicCertificateMetadataSecretResourceModelNew.description(), "Extended description for this secret.");
    assertEquals(publicCertificateMetadataSecretResourceModelNew.bundleCerts(), Boolean.valueOf(true));
    assertEquals(publicCertificateMetadataSecretResourceModelNew.keyAlgorithm(), "RSA2048");
    assertEquals(publicCertificateMetadataSecretResourceModelNew.commonName(), "example.com");
    assertEquals(publicCertificateMetadataSecretResourceModelNew.rotation().toString(), rotationModel.toString());
    assertEquals(publicCertificateMetadataSecretResourceModelNew.issuanceInfo().toString(), issuanceInfoModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublicCertificateMetadataSecretResourceError() throws Throwable {
    new PublicCertificateMetadataSecretResource.Builder().build();
  }

}