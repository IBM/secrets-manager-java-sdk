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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The configuration to define for the specified secret type.
 * <p>
 * Classes which extend this class:
 * - ConfigElementDefConfigLetsEncryptConfig
 * - ConfigElementDefConfigCloudInternetServicesConfig
 * - ConfigElementDefConfigClassicInfrastructureConfig
 */
public class ConfigElementDefConfig extends GenericModel {

    @SerializedName("private_key")
    protected String privateKey;
    @SerializedName("cis_crn")
    protected String cisCrn;
    @SerializedName("cis_apikey")
    protected String cisApikey;
    @SerializedName("classic_infrastructure_username")
    protected String classicInfrastructureUsername;
    @SerializedName("classic_infrastructure_password")
    protected String classicInfrastructurePassword;

    protected ConfigElementDefConfig() {
    }

    /**
     * Gets the privateKey.
     * <p>
     * The private key that is associated with your Automatic Certificate Management Environment (ACME) account.
     * <p>
     * If you have a working ACME client or account for Let's Encrypt, you can use the existing private key to enable
     * communications with Secrets Manager. If you don't have an account yet, you can create one. For more information,
     * see the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-prepare-order-certificates#create-acme-account).
     *
     * @return the privateKey
     */
    public String privateKey() {
        return privateKey;
    }

    /**
     * Gets the cisCrn.
     * <p>
     * The Cloud Resource Name (CRN) that is associated with the CIS instance.
     *
     * @return the cisCrn
     */
    public String cisCrn() {
        return cisCrn;
    }

    /**
     * Gets the cisApikey.
     * <p>
     * An IBM Cloud API key that can to list domains in your CIS instance.
     * <p>
     * To grant Secrets Manager the ability to view the CIS instance and all of its domains, the API key must be assigned
     * the Reader service role on Internet Services (`internet-svcs`).
     * <p>
     * If you need to manage specific domains, you can assign the Manager role. For production environments, it is
     * recommended that you assign the Reader access role, and then use the
     * [IAM Policy Management API](https://cloud.ibm.com/apidocs/iam-policy-management#create-policy) to control specific
     * domains. For more information, see the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-prepare-order-certificates#authorize-specific-domains).
     *
     * @return the cisApikey
     */
    public String cisApikey() {
        return cisApikey;
    }

    /**
     * Gets the classicInfrastructureUsername.
     * <p>
     * The username that is associated with your classic infrastructure account.
     * <p>
     * In most cases, your classic infrastructure username is your `&lt;account_id&gt;_&lt;email_address&gt;`. For more
     * information, see the [docs](https://cloud.ibm.com/docs/account?topic=account-classic_keys).
     *
     * @return the classicInfrastructureUsername
     */
    public String classicInfrastructureUsername() {
        return classicInfrastructureUsername;
    }

    /**
     * Gets the classicInfrastructurePassword.
     * <p>
     * Your classic infrastructure API key.
     * <p>
     * For information about viewing and accessing your classic infrastructure API key, see the
     * [docs](https://cloud.ibm.com/docs/account?topic=account-classic_keys).
     *
     * @return the classicInfrastructurePassword
     */
    public String classicInfrastructurePassword() {
        return classicInfrastructurePassword;
    }
}

