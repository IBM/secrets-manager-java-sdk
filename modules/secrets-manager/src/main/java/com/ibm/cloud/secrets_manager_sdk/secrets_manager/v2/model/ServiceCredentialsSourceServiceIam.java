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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The source service IAM data is returned in case IAM credentials where created for this secret.
 */
public class ServiceCredentialsSourceServiceIam extends GenericModel {

    protected ServiceCredentialsSourceServiceIamApikey apikey;
    protected ServiceCredentialsSourceServiceIamRole role;
    protected ServiceCredentialsSourceServiceIamServiceid serviceid;

    protected ServiceCredentialsSourceServiceIam() {
    }

    /**
     * Gets the apikey.
     * <p>
     * The IAM apikey metadata for the IAM credentials that were generated.
     *
     * @return the apikey
     */
    public ServiceCredentialsSourceServiceIamApikey getApikey() {
        return apikey;
    }

    /**
     * Gets the role.
     * <p>
     * The IAM role for the generate service credentials.
     *
     * @return the role
     */
    public ServiceCredentialsSourceServiceIamRole getRole() {
        return role;
    }

    /**
     * Gets the serviceid.
     * <p>
     * The IAM serviceid for the generated service credentials.
     *
     * @return the serviceid
     */
    public ServiceCredentialsSourceServiceIamServiceid getServiceid() {
        return serviceid;
    }
}

