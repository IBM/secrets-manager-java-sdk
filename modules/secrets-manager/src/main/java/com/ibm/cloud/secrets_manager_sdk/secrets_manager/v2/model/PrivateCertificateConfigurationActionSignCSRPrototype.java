/*
 * (C) Copyright IBM Corp. 2024.
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

import java.util.ArrayList;
import java.util.List;

/**
 * The request body to specify the properties of the action to sign a CSR for the private certificate configuration.
 */
public class PrivateCertificateConfigurationActionSignCSRPrototype extends ConfigurationActionPrototype {

  /**
   * The format of the returned data.
   */
  public interface Format {
    /** pem. */
    String PEM = "pem";
    /** pem_bundle. */
    String PEM_BUNDLE = "pem_bundle";
  }

  /**
   * The type of configuration action.
   */
  public interface ActionType {
    /** private_cert_configuration_action_rotate_crl. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_ROTATE_CRL = "private_cert_configuration_action_rotate_crl";
    /** private_cert_configuration_action_sign_intermediate. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_SIGN_INTERMEDIATE = "private_cert_configuration_action_sign_intermediate";
    /** private_cert_configuration_action_sign_csr. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_SIGN_CSR = "private_cert_configuration_action_sign_csr";
    /** private_cert_configuration_action_set_signed. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_SET_SIGNED = "private_cert_configuration_action_set_signed";
    /** private_cert_configuration_action_revoke_ca_certificate. */
    String PRIVATE_CERT_CONFIGURATION_ACTION_REVOKE_CA_CERTIFICATE = "private_cert_configuration_action_revoke_ca_certificate";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String commonName;
    private List<String> altNames;
    private String ipSans;
    private String uriSans;
    private List<String> otherSans;
    private String ttl;
    private String format;
    private Long maxPathLength;
    private Boolean excludeCnFromSans;
    private List<String> permittedDnsDomains;
    private Boolean useCsrValues;
    private List<String> ou;
    private List<String> organization;
    private List<String> country;
    private List<String> locality;
    private List<String> province;
    private List<String> streetAddress;
    private List<String> postalCode;
    private String serialNumber;
    private String actionType;
    private String csr;

    /**
     * Instantiates a new Builder from an existing PrivateCertificateConfigurationActionSignCSRPrototype instance.
     *
     * @param privateCertificateConfigurationActionSignCsrPrototype the instance to initialize the Builder with
     */
    public Builder(ConfigurationActionPrototype privateCertificateConfigurationActionSignCsrPrototype) {
      this.commonName = privateCertificateConfigurationActionSignCsrPrototype.commonName;
      this.altNames = privateCertificateConfigurationActionSignCsrPrototype.altNames;
      this.ipSans = privateCertificateConfigurationActionSignCsrPrototype.ipSans;
      this.uriSans = privateCertificateConfigurationActionSignCsrPrototype.uriSans;
      this.otherSans = privateCertificateConfigurationActionSignCsrPrototype.otherSans;
      this.ttl = privateCertificateConfigurationActionSignCsrPrototype.ttl;
      this.format = privateCertificateConfigurationActionSignCsrPrototype.format;
      this.maxPathLength = privateCertificateConfigurationActionSignCsrPrototype.maxPathLength;
      this.excludeCnFromSans = privateCertificateConfigurationActionSignCsrPrototype.excludeCnFromSans;
      this.permittedDnsDomains = privateCertificateConfigurationActionSignCsrPrototype.permittedDnsDomains;
      this.useCsrValues = privateCertificateConfigurationActionSignCsrPrototype.useCsrValues;
      this.ou = privateCertificateConfigurationActionSignCsrPrototype.ou;
      this.organization = privateCertificateConfigurationActionSignCsrPrototype.organization;
      this.country = privateCertificateConfigurationActionSignCsrPrototype.country;
      this.locality = privateCertificateConfigurationActionSignCsrPrototype.locality;
      this.province = privateCertificateConfigurationActionSignCsrPrototype.province;
      this.streetAddress = privateCertificateConfigurationActionSignCsrPrototype.streetAddress;
      this.postalCode = privateCertificateConfigurationActionSignCsrPrototype.postalCode;
      this.serialNumber = privateCertificateConfigurationActionSignCsrPrototype.serialNumber;
      this.actionType = privateCertificateConfigurationActionSignCsrPrototype.actionType;
      this.csr = privateCertificateConfigurationActionSignCsrPrototype.csr;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actionType the actionType
     * @param csr the csr
     */
    public Builder(String actionType, String csr) {
      this.actionType = actionType;
      this.csr = csr;
    }

    /**
     * Builds a PrivateCertificateConfigurationActionSignCSRPrototype.
     *
     * @return the new PrivateCertificateConfigurationActionSignCSRPrototype instance
     */
    public PrivateCertificateConfigurationActionSignCSRPrototype build() {
      return new PrivateCertificateConfigurationActionSignCSRPrototype(this);
    }

    /**
     * Adds a new element to altNames.
     *
     * @param altNames the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addAltNames(String altNames) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(altNames,
        "altNames cannot be null");
      if (this.altNames == null) {
        this.altNames = new ArrayList<String>();
      }
      this.altNames.add(altNames);
      return this;
    }

    /**
     * Adds a new element to otherSans.
     *
     * @param otherSans the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addOtherSans(String otherSans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(otherSans,
        "otherSans cannot be null");
      if (this.otherSans == null) {
        this.otherSans = new ArrayList<String>();
      }
      this.otherSans.add(otherSans);
      return this;
    }

    /**
     * Adds a new element to permittedDnsDomains.
     *
     * @param permittedDnsDomains the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addPermittedDnsDomains(String permittedDnsDomains) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(permittedDnsDomains,
        "permittedDnsDomains cannot be null");
      if (this.permittedDnsDomains == null) {
        this.permittedDnsDomains = new ArrayList<String>();
      }
      this.permittedDnsDomains.add(permittedDnsDomains);
      return this;
    }

    /**
     * Adds a new element to ou.
     *
     * @param ou the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addOu(String ou) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(ou,
        "ou cannot be null");
      if (this.ou == null) {
        this.ou = new ArrayList<String>();
      }
      this.ou.add(ou);
      return this;
    }

    /**
     * Adds a new element to organization.
     *
     * @param organization the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addOrganization(String organization) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(organization,
        "organization cannot be null");
      if (this.organization == null) {
        this.organization = new ArrayList<String>();
      }
      this.organization.add(organization);
      return this;
    }

    /**
     * Adds a new element to country.
     *
     * @param country the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addCountry(String country) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(country,
        "country cannot be null");
      if (this.country == null) {
        this.country = new ArrayList<String>();
      }
      this.country.add(country);
      return this;
    }

    /**
     * Adds a new element to locality.
     *
     * @param locality the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addLocality(String locality) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(locality,
        "locality cannot be null");
      if (this.locality == null) {
        this.locality = new ArrayList<String>();
      }
      this.locality.add(locality);
      return this;
    }

    /**
     * Adds a new element to province.
     *
     * @param province the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addProvince(String province) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(province,
        "province cannot be null");
      if (this.province == null) {
        this.province = new ArrayList<String>();
      }
      this.province.add(province);
      return this;
    }

    /**
     * Adds a new element to streetAddress.
     *
     * @param streetAddress the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addStreetAddress(String streetAddress) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(streetAddress,
        "streetAddress cannot be null");
      if (this.streetAddress == null) {
        this.streetAddress = new ArrayList<String>();
      }
      this.streetAddress.add(streetAddress);
      return this;
    }

    /**
     * Adds a new element to postalCode.
     *
     * @param postalCode the new element to be added
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder addPostalCode(String postalCode) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(postalCode,
        "postalCode cannot be null");
      if (this.postalCode == null) {
        this.postalCode = new ArrayList<String>();
      }
      this.postalCode.add(postalCode);
      return this;
    }

    /**
     * Set the commonName.
     *
     * @param commonName the commonName
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder commonName(String commonName) {
      this.commonName = commonName;
      return this;
    }

    /**
     * Set the altNames.
     * Existing altNames will be replaced.
     *
     * @param altNames the altNames
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder altNames(List<String> altNames) {
      this.altNames = altNames;
      return this;
    }

    /**
     * Set the ipSans.
     *
     * @param ipSans the ipSans
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder ipSans(String ipSans) {
      this.ipSans = ipSans;
      return this;
    }

    /**
     * Set the uriSans.
     *
     * @param uriSans the uriSans
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder uriSans(String uriSans) {
      this.uriSans = uriSans;
      return this;
    }

    /**
     * Set the otherSans.
     * Existing otherSans will be replaced.
     *
     * @param otherSans the otherSans
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder otherSans(List<String> otherSans) {
      this.otherSans = otherSans;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder ttl(String ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the maxPathLength.
     *
     * @param maxPathLength the maxPathLength
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder maxPathLength(long maxPathLength) {
      this.maxPathLength = maxPathLength;
      return this;
    }

    /**
     * Set the excludeCnFromSans.
     *
     * @param excludeCnFromSans the excludeCnFromSans
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder excludeCnFromSans(Boolean excludeCnFromSans) {
      this.excludeCnFromSans = excludeCnFromSans;
      return this;
    }

    /**
     * Set the permittedDnsDomains.
     * Existing permittedDnsDomains will be replaced.
     *
     * @param permittedDnsDomains the permittedDnsDomains
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder permittedDnsDomains(List<String> permittedDnsDomains) {
      this.permittedDnsDomains = permittedDnsDomains;
      return this;
    }

    /**
     * Set the useCsrValues.
     *
     * @param useCsrValues the useCsrValues
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder useCsrValues(Boolean useCsrValues) {
      this.useCsrValues = useCsrValues;
      return this;
    }

    /**
     * Set the ou.
     * Existing ou will be replaced.
     *
     * @param ou the ou
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder ou(List<String> ou) {
      this.ou = ou;
      return this;
    }

    /**
     * Set the organization.
     * Existing organization will be replaced.
     *
     * @param organization the organization
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder organization(List<String> organization) {
      this.organization = organization;
      return this;
    }

    /**
     * Set the country.
     * Existing country will be replaced.
     *
     * @param country the country
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder country(List<String> country) {
      this.country = country;
      return this;
    }

    /**
     * Set the locality.
     * Existing locality will be replaced.
     *
     * @param locality the locality
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder locality(List<String> locality) {
      this.locality = locality;
      return this;
    }

    /**
     * Set the province.
     * Existing province will be replaced.
     *
     * @param province the province
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder province(List<String> province) {
      this.province = province;
      return this;
    }

    /**
     * Set the streetAddress.
     * Existing streetAddress will be replaced.
     *
     * @param streetAddress the streetAddress
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder streetAddress(List<String> streetAddress) {
      this.streetAddress = streetAddress;
      return this;
    }

    /**
     * Set the postalCode.
     * Existing postalCode will be replaced.
     *
     * @param postalCode the postalCode
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder postalCode(List<String> postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    /**
     * Set the serialNumber.
     *
     * @param serialNumber the serialNumber
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder serialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
      return this;
    }

    /**
     * Set the actionType.
     *
     * @param actionType the actionType
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder actionType(String actionType) {
      this.actionType = actionType;
      return this;
    }

    /**
     * Set the csr.
     *
     * @param csr the csr
     * @return the PrivateCertificateConfigurationActionSignCSRPrototype builder
     */
    public Builder csr(String csr) {
      this.csr = csr;
      return this;
    }
  }

  protected PrivateCertificateConfigurationActionSignCSRPrototype() { }

  protected PrivateCertificateConfigurationActionSignCSRPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actionType,
      "actionType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.csr,
      "csr cannot be null");
    commonName = builder.commonName;
    altNames = builder.altNames;
    ipSans = builder.ipSans;
    uriSans = builder.uriSans;
    otherSans = builder.otherSans;
    ttl = builder.ttl;
    format = builder.format;
    maxPathLength = builder.maxPathLength;
    excludeCnFromSans = builder.excludeCnFromSans;
    permittedDnsDomains = builder.permittedDnsDomains;
    useCsrValues = builder.useCsrValues;
    ou = builder.ou;
    organization = builder.organization;
    country = builder.country;
    locality = builder.locality;
    province = builder.province;
    streetAddress = builder.streetAddress;
    postalCode = builder.postalCode;
    serialNumber = builder.serialNumber;
    actionType = builder.actionType;
    csr = builder.csr;
  }

  /**
   * New builder.
   *
   * @return a PrivateCertificateConfigurationActionSignCSRPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

