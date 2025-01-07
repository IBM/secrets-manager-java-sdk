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

/**
 * Your imported certificate.
 */
public class ImportedCertificate extends Secret {

    /**
     * The secret type. Supported types are arbitrary, imported_cert, public_cert, private_cert, iam_credentials,
     * service_credentials, kv, and username_password.
     */
    public interface SecretType {
        /**
         * arbitrary.
         */
        String ARBITRARY = "arbitrary";
        /**
         * iam_credentials.
         */
        String IAM_CREDENTIALS = "iam_credentials";
        /**
         * imported_cert.
         */
        String IMPORTED_CERT = "imported_cert";
        /**
         * kv.
         */
        String KV = "kv";
        /**
         * private_cert.
         */
        String PRIVATE_CERT = "private_cert";
        /**
         * public_cert.
         */
        String PUBLIC_CERT = "public_cert";
        /**
         * service_credentials.
         */
        String SERVICE_CREDENTIALS = "service_credentials";
        /**
         * username_password.
         */
        String USERNAME_PASSWORD = "username_password";
    }

    /**
     * A text representation of the secret state.
     */
    public interface StateDescription {
        /**
         * pre_activation.
         */
        String PRE_ACTIVATION = "pre_activation";
        /**
         * active.
         */
        String ACTIVE = "active";
        /**
         * suspended.
         */
        String SUSPENDED = "suspended";
        /**
         * deactivated.
         */
        String DEACTIVATED = "deactivated";
        /**
         * destroyed.
         */
        String DESTROYED = "destroyed";
    }


    protected ImportedCertificate() {
    }
}

