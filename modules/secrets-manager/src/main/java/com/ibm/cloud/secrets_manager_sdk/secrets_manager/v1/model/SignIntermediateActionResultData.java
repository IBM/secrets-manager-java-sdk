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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties that are returned with a successful `sign` action.
 */
public class SignIntermediateActionResultData extends GenericModel {

    protected String certificate;
    @SerializedName("serial_number")
    protected String serialNumber;
    @SerializedName("issuing_ca")
    protected String issuingCa;
    @SerializedName("ca_chain")
    protected List<String> caChain;
    protected Long expiration;

    protected SignIntermediateActionResultData() {
    }

    /**
     * Gets the certificate.
     * <p>
     * The PEM-encoded certificate.
     *
     * @return the certificate
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Gets the serialNumber.
     * <p>
     * The unique serial number that was assigned to the certificate by the issuing certificate authority.
     *
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Gets the issuingCa.
     * <p>
     * The PEM-encoded certificate of the certificate authority that signed and issued this certificate.
     *
     * @return the issuingCa
     */
    public String getIssuingCa() {
        return issuingCa;
    }

    /**
     * Gets the caChain.
     * <p>
     * The chain of certificate authorities that are associated with the certificate.
     *
     * @return the caChain
     */
    public List<String> getCaChain() {
        return caChain;
    }

    /**
     * Gets the expiration.
     * <p>
     * The time until the certificate expires.
     *
     * @return the expiration
     */
    public Long getExpiration() {
        return expiration;
    }
}

