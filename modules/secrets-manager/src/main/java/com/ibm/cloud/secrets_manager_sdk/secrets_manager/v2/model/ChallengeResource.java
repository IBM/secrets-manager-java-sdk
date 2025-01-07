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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties that describe a challenge.
 */
public class ChallengeResource extends GenericModel {

    protected String domain;
    protected Date expiration;
    protected String status;
    @SerializedName("txt_record_name")
    protected String txtRecordName;
    @SerializedName("txt_record_value")
    protected String txtRecordValue;

    protected ChallengeResource() {
    }

    /**
     * Gets the domain.
     * <p>
     * The challenge domain.
     *
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Gets the expiration.
     * <p>
     * The challenge expiration date. The date format follows `RFC 3339`.
     *
     * @return the expiration
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * Gets the status.
     * <p>
     * The challenge status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Gets the txtRecordName.
     * <p>
     * The TXT record name.
     *
     * @return the txtRecordName
     */
    public String getTxtRecordName() {
        return txtRecordName;
    }

    /**
     * Gets the txtRecordValue.
     * <p>
     * The TXT record value.
     *
     * @return the txtRecordValue
     */
    public String getTxtRecordValue() {
        return txtRecordValue;
    }
}

