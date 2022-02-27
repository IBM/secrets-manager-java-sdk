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
 * GetConfigElementsResourcesItem.
 * <p>
 * Classes which extend this class:
 * - GetConfigElementsResourcesItemCertificateAuthoritiesConfig
 * - GetConfigElementsResourcesItemDnsProvidersConfig
 */
public class GetConfigElementsResourcesItem extends GenericModel {

    @SerializedName("certificate_authorities")
    protected List<ConfigElementMetadata> certificateAuthorities;
    @SerializedName("dns_providers")
    protected List<ConfigElementMetadata> dnsProviders;

    protected GetConfigElementsResourcesItem() {
    }

    /**
     * Gets the certificateAuthorities.
     *
     * @return the certificateAuthorities
     */
    public List<ConfigElementMetadata> getCertificateAuthorities() {
        return certificateAuthorities;
    }

    /**
     * Gets the dnsProviders.
     *
     * @return the dnsProviders
     */
    public List<ConfigElementMetadata> getDnsProviders() {
        return dnsProviders;
    }
}
