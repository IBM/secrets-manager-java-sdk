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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The secret rotation time interval.
 */
public class SecretPolicyRotationRotation extends GenericModel {

    /**
     * Specifies the units for the secret rotation time interval.
     */
    public interface Unit {
        /**
         * day.
         */
        String DAY = "day";
        /**
         * month.
         */
        String MONTH = "month";
    }

    protected Long interval;
    protected String unit;

    /**
     * Builder.
     */
    public static class Builder {
        private Long interval;
        private String unit;

        private Builder(SecretPolicyRotationRotation secretPolicyRotationRotation) {
            this.interval = secretPolicyRotationRotation.interval;
            this.unit = secretPolicyRotationRotation.unit;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param interval the interval
         * @param unit     the unit
         */
        public Builder(Long interval, String unit) {
            this.interval = interval;
            this.unit = unit;
        }

        /**
         * Builds a SecretPolicyRotationRotation.
         *
         * @return the new SecretPolicyRotationRotation instance
         */
        public SecretPolicyRotationRotation build() {
            return new SecretPolicyRotationRotation(this);
        }

        /**
         * Set the interval.
         *
         * @param interval the interval
         * @return the SecretPolicyRotationRotation builder
         */
        public Builder interval(long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Set the unit.
         *
         * @param unit the unit
         * @return the SecretPolicyRotationRotation builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }
    }

    protected SecretPolicyRotationRotation(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.interval,
                "interval cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.unit,
                "unit cannot be null");
        interval = builder.interval;
        unit = builder.unit;
    }

    /**
     * New builder.
     *
     * @return a SecretPolicyRotationRotation builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the interval.
     * <p>
     * Specifies the length of the secret rotation time interval.
     *
     * @return the interval
     */
    public Long interval() {
        return interval;
    }

    /**
     * Gets the unit.
     * <p>
     * Specifies the units for the secret rotation time interval.
     *
     * @return the unit
     */
    public String unit() {
        return unit;
    }
}

