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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Certificate templates configuration.
 */
public class CertificateTemplatesConfigItem extends GenericModel {

    /**
     * The type of configuration. Value options differ depending on the `config_element` property that you want to define.
     */
    public interface Type {
        /**
         * letsencrypt.
         */
        String LETSENCRYPT = "letsencrypt";
        /**
         * letsencrypt-stage.
         */
        String LETSENCRYPT_STAGE = "letsencrypt-stage";
        /**
         * cis.
         */
        String CIS = "cis";
        /**
         * classic_infrastructure.
         */
        String CLASSIC_INFRASTRUCTURE = "classic_infrastructure";
        /**
         * root_certificate_authority.
         */
        String ROOT_CERTIFICATE_AUTHORITY = "root_certificate_authority";
        /**
         * intermediate_certificate_authority.
         */
        String INTERMEDIATE_CERTIFICATE_AUTHORITY = "intermediate_certificate_authority";
        /**
         * certificate_template.
         */
        String CERTIFICATE_TEMPLATE = "certificate_template";
    }

    protected String name;
    protected String type;
    protected CertificateTemplateConfig config;

    protected CertificateTemplatesConfigItem() {
    }

    /**
     * Gets the name.
     * <p>
     * The human-readable name to assign to your configuration.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type.
     * <p>
     * The type of configuration. Value options differ depending on the `config_element` property that you want to define.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the config.
     * <p>
     * Properties that describe a certificate template. You can use a certificate template to control the parameters that
     * are applied to your issued private certificates. For more information, see the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-certificate-templates).
     *
     * @return the config
     */
    public CertificateTemplateConfig getConfig() {
        return config;
    }
}

