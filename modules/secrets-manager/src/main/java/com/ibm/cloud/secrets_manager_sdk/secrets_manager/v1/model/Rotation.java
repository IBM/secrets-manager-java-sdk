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
 * Rotation.
 */
public class Rotation extends GenericModel {

    /**
     * The time unit of the rotation interval.
     * <p>
     * **Note:** Use this field only for private certificates. It is ignored for public certificates.
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

    @SerializedName("auto_rotate")
    protected Boolean autoRotate;
    @SerializedName("rotate_keys")
    protected Boolean rotateKeys;
    protected Long interval;
    protected String unit;

    /**
     * Builder.
     */
    public static class Builder {
        private Boolean autoRotate;
        private Boolean rotateKeys;
        private Long interval;
        private String unit;

        /**
         * Instantiates a new Builder from an existing Rotation instance.
         *
         * @param rotation the instance to initialize the Builder with
         */
        private Builder(Rotation rotation) {
            this.autoRotate = rotation.autoRotate;
            this.rotateKeys = rotation.rotateKeys;
            this.interval = rotation.interval;
            this.unit = rotation.unit;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a Rotation.
         *
         * @return the new Rotation instance
         */
        public Rotation build() {
            return new Rotation(this);
        }

        /**
         * Set the autoRotate.
         *
         * @param autoRotate the autoRotate
         * @return the Rotation builder
         */
        public Builder autoRotate(Boolean autoRotate) {
            this.autoRotate = autoRotate;
            return this;
        }

        /**
         * Set the rotateKeys.
         *
         * @param rotateKeys the rotateKeys
         * @return the Rotation builder
         */
        public Builder rotateKeys(Boolean rotateKeys) {
            this.rotateKeys = rotateKeys;
            return this;
        }

        /**
         * Set the interval.
         *
         * @param interval the interval
         * @return the Rotation builder
         */
        public Builder interval(long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Set the unit.
         *
         * @param unit the unit
         * @return the Rotation builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }
    }

    protected Rotation() {
    }

    protected Rotation(Builder builder) {
        autoRotate = builder.autoRotate;
        rotateKeys = builder.rotateKeys;
        interval = builder.interval;
        unit = builder.unit;
    }

    /**
     * New builder.
     *
     * @return a Rotation builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the autoRotate.
     * <p>
     * Determines whether Secrets Manager rotates your certificate automatically.
     * <p>
     * For public certificates, if `auto_rotate` is set to `true` the service reorders your certificate 31 days before it
     * expires. For private certificates, the certificate is rotated according to the time interval specified in the
     * `interval` and `unit` fields.
     * <p>
     * To access the previous version of the certificate, you can use the
     * [Get a version of a secret](#get-secret-version) method.
     *
     * @return the autoRotate
     */
    public Boolean autoRotate() {
        return autoRotate;
    }

    /**
     * Gets the rotateKeys.
     * <p>
     * Determines whether Secrets Manager rotates the private key for your certificate automatically.
     * <p>
     * If set to `true`, the service generates and stores a new private key for your rotated certificate.
     * <p>
     * **Note:** Use this field only for public certificates. It is ignored for private certificates.
     *
     * @return the rotateKeys
     */
    public Boolean rotateKeys() {
        return rotateKeys;
    }

    /**
     * Gets the interval.
     * <p>
     * Used together with the `unit` field to specify the rotation interval. The minimum interval is one day, and the
     * maximum interval is 3 years (1095 days). Required in case `auto_rotate` is set to `true`.
     * <p>
     * **Note:** Use this field only for private certificates. It is ignored for public certificates.
     *
     * @return the interval
     */
    public Long interval() {
        return interval;
    }

    /**
     * Gets the unit.
     * <p>
     * The time unit of the rotation interval.
     * <p>
     * **Note:** Use this field only for private certificates. It is ignored for public certificates.
     *
     * @return the unit
     */
    public String unit() {
        return unit;
    }
}

