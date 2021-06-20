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
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.IAMCredentialsSecretEngineRootConfig;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.model.PutConfigOptions;
import com.ibm.cloud.secrets_manager_sdk.secrets_manager.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test class for the PutConfigOptions model.
 */
public class PutConfigOptionsTest {
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    @Test
    public void testPutConfigOptions() throws Throwable {
        IAMCredentialsSecretEngineRootConfig engineConfigModel = new IAMCredentialsSecretEngineRootConfig.Builder()
                .apiKey("API_KEY")
                .build();
        assertEquals(engineConfigModel.apiKey(), "API_KEY");

        PutConfigOptions putConfigOptionsModel = new PutConfigOptions.Builder()
                .secretType("iam_credentials")
                .engineConfig(engineConfigModel)
                .build();
        assertEquals(putConfigOptionsModel.secretType(), "iam_credentials");
        assertEquals(putConfigOptionsModel.engineConfig(), engineConfigModel);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPutConfigOptionsError() throws Throwable {
        new PutConfigOptions.Builder().build();
    }

}