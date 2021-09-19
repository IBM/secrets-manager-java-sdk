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
 * Warning response.
 */
public class Warning extends GenericModel {

    protected String code;
    protected String message;

    /**
     * Builder.
     */
    public static class Builder {
        private String code;
        private String message;

        private Builder(Warning warning) {
            this.code = warning.code;
            this.message = warning.message;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param code    the code
         * @param message the message
         */
        public Builder(String code, String message) {
            this.code = code;
            this.message = message;
        }

        /**
         * Builds a Warning.
         *
         * @return the new Warning instance
         */
        public Warning build() {
            return new Warning(this);
        }

        /**
         * Set the code.
         *
         * @param code the code
         * @return the Warning builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Set the message.
         *
         * @param message the message
         * @return the Warning builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }
    }

    protected Warning(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.code,
                "code cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.message,
                "message cannot be null");
        code = builder.code;
        message = builder.message;
    }

    /**
     * New builder.
     *
     * @return a Warning builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the code.
     * <p>
     * A warning code identifier.
     *
     * @return the code
     */
    public String code() {
        return code;
    }

    /**
     * Gets the message.
     * <p>
     * A human-readable message that provides details about the warning.
     *
     * @return the message
     */
    public String message() {
        return message;
    }
}

