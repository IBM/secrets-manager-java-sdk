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
 * Your Let's Encrypt CA metadata properties.
 */
public class PublicCertificateConfigurationCALetsEncryptMetadata extends ConfigurationMetadata {

    /**
     * The configuration type. Can be one of: iam_credentials_configuration, public_cert_configuration_ca_lets_encrypt,
     * public_cert_configuration_dns_classic_infrastructure, public_cert_configuration_dns_cloud_internet_services,
     * private_cert_configuration_root_ca, private_cert_configuration_intermediate_ca,
     * private_cert_configuration_template.
     */
    public interface ConfigType {
        /**
         * public_cert_configuration_dns_cloud_internet_services.
         */
        String PUBLIC_CERT_CONFIGURATION_DNS_CLOUD_INTERNET_SERVICES = "public_cert_configuration_dns_cloud_internet_services";
        /**
         * public_cert_configuration_dns_classic_infrastructure.
         */
        String PUBLIC_CERT_CONFIGURATION_DNS_CLASSIC_INFRASTRUCTURE = "public_cert_configuration_dns_classic_infrastructure";
        /**
         * public_cert_configuration_ca_lets_encrypt.
         */
        String PUBLIC_CERT_CONFIGURATION_CA_LETS_ENCRYPT = "public_cert_configuration_ca_lets_encrypt";
        /**
         * private_cert_configuration_root_ca.
         */
        String PRIVATE_CERT_CONFIGURATION_ROOT_CA = "private_cert_configuration_root_ca";
        /**
         * private_cert_configuration_intermediate_ca.
         */
        String PRIVATE_CERT_CONFIGURATION_INTERMEDIATE_CA = "private_cert_configuration_intermediate_ca";
        /**
         * private_cert_configuration_template.
         */
        String PRIVATE_CERT_CONFIGURATION_TEMPLATE = "private_cert_configuration_template";
        /**
         * iam_credentials_configuration.
         */
        String IAM_CREDENTIALS_CONFIGURATION = "iam_credentials_configuration";
    }

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
     * The configuration of the Let's Encrypt CA environment.
     */
    public interface LetsEncryptEnvironment {
        /**
         * production.
         */
        String PRODUCTION = "production";
        /**
         * staging.
         */
        String STAGING = "staging";
    }


    protected PublicCertificateConfigurationCALetsEncryptMetadata() {
    }
}

