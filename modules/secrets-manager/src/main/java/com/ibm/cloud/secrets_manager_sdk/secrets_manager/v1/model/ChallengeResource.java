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

    /**
     * Builder.
     */
    public static class Builder {

        /**
         * Instantiates a new Builder from an existing ChallengeResource instance.
         *
         * @param challengeResource the instance to initialize the Builder with
         */
        private Builder(ChallengeResource challengeResource) {
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a ChallengeResource.
         *
         * @return the new ChallengeResource instance
         */
        public ChallengeResource build() {
            return new ChallengeResource(this);
        }
    }

    protected ChallengeResource() {
    }

    protected ChallengeResource(Builder builder) {
    }

    /**
     * New builder.
     *
     * @return a ChallengeResource builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the domain.
     * <p>
     * The challenge domain.
     *
     * @return the domain
     */
    public String domain() {
        return domain;
    }

    /**
     * Gets the expiration.
     * <p>
     * The challenge expiration date. The date format follows RFC 3339.
     *
     * @return the expiration
     */
    public Date expiration() {
        return expiration;
    }

    /**
     * Gets the status.
     * <p>
     * The challenge status.
     *
     * @return the status
     */
    public String status() {
        return status;
    }

    /**
     * Gets the txtRecordName.
     * <p>
     * The txt_record_name.
     *
     * @return the txtRecordName
     */
    public String txtRecordName() {
        return txtRecordName;
    }

    /**
     * Gets the txtRecordValue.
     * <p>
     * The txt_record_value.
     *
     * @return the txtRecordValue
     */
    public String txtRecordValue() {
        return txtRecordValue;
    }
}

