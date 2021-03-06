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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecretAction.
 * <p>
 * Classes which extend this class:
 * - RotateArbitrarySecretBody
 * - RotateUsernamePasswordSecretBody
 * - RotateCertificateBody
 * - DeleteCredentialsForIAMCredentialsSecret
 */
public class SecretAction extends GenericModel {

    protected String payload;
    protected String password;
    protected String certificate;
    @SerializedName("private_key")
    protected String privateKey;
    protected String intermediate;
    @SerializedName("service_id")
    protected String serviceId;

    protected SecretAction() {
    }

    /**
     * Gets the payload.
     * <p>
     * The new secret data to assign to an `arbitrary` secret.
     *
     * @return the payload
     */
    public String payload() {
        return payload;
    }

    /**
     * Gets the password.
     * <p>
     * The new password to assign to a `username_password` secret.
     *
     * @return the password
     */
    public String password() {
        return password;
    }

    /**
     * Gets the certificate.
     * <p>
     * The new data to associate with the certificate.
     *
     * @return the certificate
     */
    public String certificate() {
        return certificate;
    }

    /**
     * Gets the privateKey.
     * <p>
     * The new private key to associate with the certificate.
     *
     * @return the privateKey
     */
    public String privateKey() {
        return privateKey;
    }

    /**
     * Gets the intermediate.
     * <p>
     * The new intermediate certificate to associate with the certificate.
     *
     * @return the intermediate
     */
    public String intermediate() {
        return intermediate;
    }

    /**
     * Gets the serviceId.
     * <p>
     * The service ID that you want to delete. It is deleted together with its API key.
     *
     * @return the serviceId
     */
    public String serviceId() {
        return serviceId;
    }
}

