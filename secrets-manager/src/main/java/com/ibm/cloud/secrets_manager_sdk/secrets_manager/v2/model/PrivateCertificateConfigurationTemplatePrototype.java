/*
 * (C) Copyright IBM Corp. 2023.
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
 * Properties that describe a certificate template. You can use a certificate template to control the parameters that
 * are applied to your issued private certificates. For more information, see the
 * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-certificate-templates).
 */
public class PrivateCertificateConfigurationTemplatePrototype extends ConfigurationPrototype {

  /**
   * The configuration type.
   */
  public interface ConfigType {
    /** public_cert_configuration_ca_lets_encrypt. */
    String PUBLIC_CERT_CONFIGURATION_CA_LETS_ENCRYPT = "public_cert_configuration_ca_lets_encrypt";
    /** public_cert_configuration_dns_classic_infrastructure. */
    String PUBLIC_CERT_CONFIGURATION_DNS_CLASSIC_INFRASTRUCTURE = "public_cert_configuration_dns_classic_infrastructure";
    /** public_cert_configuration_dns_cloud_internet_services. */
    String PUBLIC_CERT_CONFIGURATION_DNS_CLOUD_INTERNET_SERVICES = "public_cert_configuration_dns_cloud_internet_services";
    /** iam_credentials_configuration. */
    String IAM_CREDENTIALS_CONFIGURATION = "iam_credentials_configuration";
    /** private_cert_configuration_root_ca. */
    String PRIVATE_CERT_CONFIGURATION_ROOT_CA = "private_cert_configuration_root_ca";
    /** private_cert_configuration_intermediate_ca. */
    String PRIVATE_CERT_CONFIGURATION_INTERMEDIATE_CA = "private_cert_configuration_intermediate_ca";
    /** private_cert_configuration_template. */
    String PRIVATE_CERT_CONFIGURATION_TEMPLATE = "private_cert_configuration_template";
  }

  /**
   * The type of private key to generate.
   */
  public interface KeyType {
    /** rsa. */
    String RSA = "rsa";
    /** ec. */
    String EC = "ec";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String configType;
    private String name;
    private String certificateAuthority;
    private String allowedSecretGroups;
    private String maxTtl;
    private String ttl;
    private Boolean allowLocalhost;
    private List<String> allowedDomains;
    private Boolean allowedDomainsTemplate;
    private Boolean allowBareDomains;
    private Boolean allowSubdomains;
    private Boolean allowGlobDomains;
    private Boolean allowWildcardCertificates;
    private Boolean allowAnyName;
    private Boolean enforceHostnames;
    private Boolean allowIpSans;
    private List<String> allowedUriSans;
    private List<String> allowedOtherSans;
    private Boolean serverFlag;
    private Boolean clientFlag;
    private Boolean codeSigningFlag;
    private Boolean emailProtectionFlag;
    private String keyType;
    private Long keyBits;
    private List<String> keyUsage;
    private List<String> extKeyUsage;
    private List<String> extKeyUsageOids;
    private Boolean useCsrCommonName;
    private Boolean useCsrSans;
    private List<String> ou;
    private List<String> organization;
    private List<String> country;
    private List<String> locality;
    private List<String> province;
    private List<String> streetAddress;
    private List<String> postalCode;
    private String serialNumber;
    private Boolean requireCn;
    private List<String> policyIdentifiers;
    private Boolean basicConstraintsValidForNonCa;
    private String notBeforeDuration;

    /**
     * Instantiates a new Builder from an existing PrivateCertificateConfigurationTemplatePrototype instance.
     *
     * @param privateCertificateConfigurationTemplatePrototype the instance to initialize the Builder with
     */
    public Builder(ConfigurationPrototype privateCertificateConfigurationTemplatePrototype) {
      this.configType = privateCertificateConfigurationTemplatePrototype.configType;
      this.name = privateCertificateConfigurationTemplatePrototype.name;
      this.certificateAuthority = privateCertificateConfigurationTemplatePrototype.certificateAuthority;
      this.allowedSecretGroups = privateCertificateConfigurationTemplatePrototype.allowedSecretGroups;
      this.maxTtl = privateCertificateConfigurationTemplatePrototype.maxTtl;
      this.ttl = privateCertificateConfigurationTemplatePrototype.ttl;
      this.allowLocalhost = privateCertificateConfigurationTemplatePrototype.allowLocalhost;
      this.allowedDomains = privateCertificateConfigurationTemplatePrototype.allowedDomains;
      this.allowedDomainsTemplate = privateCertificateConfigurationTemplatePrototype.allowedDomainsTemplate;
      this.allowBareDomains = privateCertificateConfigurationTemplatePrototype.allowBareDomains;
      this.allowSubdomains = privateCertificateConfigurationTemplatePrototype.allowSubdomains;
      this.allowGlobDomains = privateCertificateConfigurationTemplatePrototype.allowGlobDomains;
      this.allowWildcardCertificates = privateCertificateConfigurationTemplatePrototype.allowWildcardCertificates;
      this.allowAnyName = privateCertificateConfigurationTemplatePrototype.allowAnyName;
      this.enforceHostnames = privateCertificateConfigurationTemplatePrototype.enforceHostnames;
      this.allowIpSans = privateCertificateConfigurationTemplatePrototype.allowIpSans;
      this.allowedUriSans = privateCertificateConfigurationTemplatePrototype.allowedUriSans;
      this.allowedOtherSans = privateCertificateConfigurationTemplatePrototype.allowedOtherSans;
      this.serverFlag = privateCertificateConfigurationTemplatePrototype.serverFlag;
      this.clientFlag = privateCertificateConfigurationTemplatePrototype.clientFlag;
      this.codeSigningFlag = privateCertificateConfigurationTemplatePrototype.codeSigningFlag;
      this.emailProtectionFlag = privateCertificateConfigurationTemplatePrototype.emailProtectionFlag;
      this.keyType = privateCertificateConfigurationTemplatePrototype.keyType;
      this.keyBits = privateCertificateConfigurationTemplatePrototype.keyBits;
      this.keyUsage = privateCertificateConfigurationTemplatePrototype.keyUsage;
      this.extKeyUsage = privateCertificateConfigurationTemplatePrototype.extKeyUsage;
      this.extKeyUsageOids = privateCertificateConfigurationTemplatePrototype.extKeyUsageOids;
      this.useCsrCommonName = privateCertificateConfigurationTemplatePrototype.useCsrCommonName;
      this.useCsrSans = privateCertificateConfigurationTemplatePrototype.useCsrSans;
      this.ou = privateCertificateConfigurationTemplatePrototype.ou;
      this.organization = privateCertificateConfigurationTemplatePrototype.organization;
      this.country = privateCertificateConfigurationTemplatePrototype.country;
      this.locality = privateCertificateConfigurationTemplatePrototype.locality;
      this.province = privateCertificateConfigurationTemplatePrototype.province;
      this.streetAddress = privateCertificateConfigurationTemplatePrototype.streetAddress;
      this.postalCode = privateCertificateConfigurationTemplatePrototype.postalCode;
      this.serialNumber = privateCertificateConfigurationTemplatePrototype.serialNumber;
      this.requireCn = privateCertificateConfigurationTemplatePrototype.requireCn;
      this.policyIdentifiers = privateCertificateConfigurationTemplatePrototype.policyIdentifiers;
      this.basicConstraintsValidForNonCa = privateCertificateConfigurationTemplatePrototype.basicConstraintsValidForNonCa;
      this.notBeforeDuration = privateCertificateConfigurationTemplatePrototype.notBeforeDuration;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param configType the configType
     * @param name the name
     * @param certificateAuthority the certificateAuthority
     */
    public Builder(String configType, String name, String certificateAuthority) {
      this.configType = configType;
      this.name = name;
      this.certificateAuthority = certificateAuthority;
    }

    /**
     * Builds a PrivateCertificateConfigurationTemplatePrototype.
     *
     * @return the new PrivateCertificateConfigurationTemplatePrototype instance
     */
    public PrivateCertificateConfigurationTemplatePrototype build() {
      return new PrivateCertificateConfigurationTemplatePrototype(this);
    }

    /**
     * Adds an allowedDomains to allowedDomains.
     *
     * @param allowedDomains the new allowedDomains
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder addAllowedDomains(String allowedDomains) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowedDomains,
        "allowedDomains cannot be null");
      if (this.allowedDomains == null) {
        this.allowedDomains = new ArrayList<String>();
      }
      this.allowedDomains.add(allowedDomains);
      return this;
    }

    /**
     * Adds an allowedUriSans to allowedUriSans.
     *
     * @param allowedUriSans the new allowedUriSans
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder addAllowedUriSans(String allowedUriSans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowedUriSans,
        "allowedUriSans cannot be null");
      if (this.allowedUriSans == null) {
        this.allowedUriSans = new ArrayList<String>();
      }
      this.allowedUriSans.add(allowedUriSans);
      return this;
    }

    /**
     * Adds an allowedOtherSans to allowedOtherSans.
     *
     * @param allowedOtherSans the new allowedOtherSans
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder addAllowedOtherSans(String allowedOtherSans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowedOtherSans,
        "allowedOtherSans cannot be null");
      if (this.allowedOtherSans == null) {
        this.allowedOtherSans = new ArrayList<String>();
      }
      this.allowedOtherSans.add(allowedOtherSans);
      return this;
    }

    /**
     * Adds an keyUsage to keyUsage.
     *
     * @param keyUsage the new keyUsage
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder addKeyUsage(String keyUsage) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(keyUsage,
        "keyUsage cannot be null");
      if (this.keyUsage == null) {
        this.keyUsage = new ArrayList<String>();
      }
      this.keyUsage.add(keyUsage);
      return this;
    }

    /**
     * Adds an extKeyUsage to extKeyUsage.
     *
     * @param extKeyUsage the new extKeyUsage
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder addExtKeyUsage(String extKeyUsage) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(extKeyUsage,
        "extKeyUsage cannot be null");
      if (this.extKeyUsage == null) {
        this.extKeyUsage = new ArrayList<String>();
      }
      this.extKeyUsage.add(extKeyUsage);
      return this;
    }

    /**
     * Adds an extKeyUsageOids to extKeyUsageOids.
     *
     * @param extKeyUsageOids the new extKeyUsageOids
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder addExtKeyUsageOids(String extKeyUsageOids) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(extKeyUsageOids,
        "extKeyUsageOids cannot be null");
      if (this.extKeyUsageOids == null) {
        this.extKeyUsageOids = new ArrayList<String>();
      }
      this.extKeyUsageOids.add(extKeyUsageOids);
      return this;
    }

    /**
     * Adds an ou to ou.
     *
     * @param ou the new ou
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * Adds an organization to organization.
     *
     * @param organization the new organization
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * Adds an country to country.
     *
     * @param country the new country
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * Adds an locality to locality.
     *
     * @param locality the new locality
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * Adds an province to province.
     *
     * @param province the new province
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * Adds an streetAddress to streetAddress.
     *
     * @param streetAddress the new streetAddress
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * Adds an postalCode to postalCode.
     *
     * @param postalCode the new postalCode
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * Adds an policyIdentifiers to policyIdentifiers.
     *
     * @param policyIdentifiers the new policyIdentifiers
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder addPolicyIdentifiers(String policyIdentifiers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(policyIdentifiers,
        "policyIdentifiers cannot be null");
      if (this.policyIdentifiers == null) {
        this.policyIdentifiers = new ArrayList<String>();
      }
      this.policyIdentifiers.add(policyIdentifiers);
      return this;
    }

    /**
     * Set the configType.
     *
     * @param configType the configType
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder configType(String configType) {
      this.configType = configType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the certificateAuthority.
     *
     * @param certificateAuthority the certificateAuthority
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder certificateAuthority(String certificateAuthority) {
      this.certificateAuthority = certificateAuthority;
      return this;
    }

    /**
     * Set the allowedSecretGroups.
     *
     * @param allowedSecretGroups the allowedSecretGroups
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowedSecretGroups(String allowedSecretGroups) {
      this.allowedSecretGroups = allowedSecretGroups;
      return this;
    }

    /**
     * Set the maxTtl.
     *
     * @param maxTtl the maxTtl
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder maxTtl(String maxTtl) {
      this.maxTtl = maxTtl;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder ttl(String ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the allowLocalhost.
     *
     * @param allowLocalhost the allowLocalhost
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowLocalhost(Boolean allowLocalhost) {
      this.allowLocalhost = allowLocalhost;
      return this;
    }

    /**
     * Set the allowedDomains.
     * Existing allowedDomains will be replaced.
     *
     * @param allowedDomains the allowedDomains
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowedDomains(List<String> allowedDomains) {
      this.allowedDomains = allowedDomains;
      return this;
    }

    /**
     * Set the allowedDomainsTemplate.
     *
     * @param allowedDomainsTemplate the allowedDomainsTemplate
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowedDomainsTemplate(Boolean allowedDomainsTemplate) {
      this.allowedDomainsTemplate = allowedDomainsTemplate;
      return this;
    }

    /**
     * Set the allowBareDomains.
     *
     * @param allowBareDomains the allowBareDomains
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowBareDomains(Boolean allowBareDomains) {
      this.allowBareDomains = allowBareDomains;
      return this;
    }

    /**
     * Set the allowSubdomains.
     *
     * @param allowSubdomains the allowSubdomains
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowSubdomains(Boolean allowSubdomains) {
      this.allowSubdomains = allowSubdomains;
      return this;
    }

    /**
     * Set the allowGlobDomains.
     *
     * @param allowGlobDomains the allowGlobDomains
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowGlobDomains(Boolean allowGlobDomains) {
      this.allowGlobDomains = allowGlobDomains;
      return this;
    }

    /**
     * Set the allowWildcardCertificates.
     *
     * @param allowWildcardCertificates the allowWildcardCertificates
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowWildcardCertificates(Boolean allowWildcardCertificates) {
      this.allowWildcardCertificates = allowWildcardCertificates;
      return this;
    }

    /**
     * Set the allowAnyName.
     *
     * @param allowAnyName the allowAnyName
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowAnyName(Boolean allowAnyName) {
      this.allowAnyName = allowAnyName;
      return this;
    }

    /**
     * Set the enforceHostnames.
     *
     * @param enforceHostnames the enforceHostnames
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder enforceHostnames(Boolean enforceHostnames) {
      this.enforceHostnames = enforceHostnames;
      return this;
    }

    /**
     * Set the allowIpSans.
     *
     * @param allowIpSans the allowIpSans
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowIpSans(Boolean allowIpSans) {
      this.allowIpSans = allowIpSans;
      return this;
    }

    /**
     * Set the allowedUriSans.
     * Existing allowedUriSans will be replaced.
     *
     * @param allowedUriSans the allowedUriSans
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowedUriSans(List<String> allowedUriSans) {
      this.allowedUriSans = allowedUriSans;
      return this;
    }

    /**
     * Set the allowedOtherSans.
     * Existing allowedOtherSans will be replaced.
     *
     * @param allowedOtherSans the allowedOtherSans
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder allowedOtherSans(List<String> allowedOtherSans) {
      this.allowedOtherSans = allowedOtherSans;
      return this;
    }

    /**
     * Set the serverFlag.
     *
     * @param serverFlag the serverFlag
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder serverFlag(Boolean serverFlag) {
      this.serverFlag = serverFlag;
      return this;
    }

    /**
     * Set the clientFlag.
     *
     * @param clientFlag the clientFlag
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder clientFlag(Boolean clientFlag) {
      this.clientFlag = clientFlag;
      return this;
    }

    /**
     * Set the codeSigningFlag.
     *
     * @param codeSigningFlag the codeSigningFlag
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder codeSigningFlag(Boolean codeSigningFlag) {
      this.codeSigningFlag = codeSigningFlag;
      return this;
    }

    /**
     * Set the emailProtectionFlag.
     *
     * @param emailProtectionFlag the emailProtectionFlag
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder emailProtectionFlag(Boolean emailProtectionFlag) {
      this.emailProtectionFlag = emailProtectionFlag;
      return this;
    }

    /**
     * Set the keyType.
     *
     * @param keyType the keyType
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder keyType(String keyType) {
      this.keyType = keyType;
      return this;
    }

    /**
     * Set the keyBits.
     *
     * @param keyBits the keyBits
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder keyBits(long keyBits) {
      this.keyBits = keyBits;
      return this;
    }

    /**
     * Set the keyUsage.
     * Existing keyUsage will be replaced.
     *
     * @param keyUsage the keyUsage
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder keyUsage(List<String> keyUsage) {
      this.keyUsage = keyUsage;
      return this;
    }

    /**
     * Set the extKeyUsage.
     * Existing extKeyUsage will be replaced.
     *
     * @param extKeyUsage the extKeyUsage
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder extKeyUsage(List<String> extKeyUsage) {
      this.extKeyUsage = extKeyUsage;
      return this;
    }

    /**
     * Set the extKeyUsageOids.
     * Existing extKeyUsageOids will be replaced.
     *
     * @param extKeyUsageOids the extKeyUsageOids
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder extKeyUsageOids(List<String> extKeyUsageOids) {
      this.extKeyUsageOids = extKeyUsageOids;
      return this;
    }

    /**
     * Set the useCsrCommonName.
     *
     * @param useCsrCommonName the useCsrCommonName
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder useCsrCommonName(Boolean useCsrCommonName) {
      this.useCsrCommonName = useCsrCommonName;
      return this;
    }

    /**
     * Set the useCsrSans.
     *
     * @param useCsrSans the useCsrSans
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder useCsrSans(Boolean useCsrSans) {
      this.useCsrSans = useCsrSans;
      return this;
    }

    /**
     * Set the ou.
     * Existing ou will be replaced.
     *
     * @param ou the ou
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
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
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder postalCode(List<String> postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    /**
     * Set the serialNumber.
     *
     * @param serialNumber the serialNumber
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder serialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
      return this;
    }

    /**
     * Set the requireCn.
     *
     * @param requireCn the requireCn
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder requireCn(Boolean requireCn) {
      this.requireCn = requireCn;
      return this;
    }

    /**
     * Set the policyIdentifiers.
     * Existing policyIdentifiers will be replaced.
     *
     * @param policyIdentifiers the policyIdentifiers
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder policyIdentifiers(List<String> policyIdentifiers) {
      this.policyIdentifiers = policyIdentifiers;
      return this;
    }

    /**
     * Set the basicConstraintsValidForNonCa.
     *
     * @param basicConstraintsValidForNonCa the basicConstraintsValidForNonCa
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder basicConstraintsValidForNonCa(Boolean basicConstraintsValidForNonCa) {
      this.basicConstraintsValidForNonCa = basicConstraintsValidForNonCa;
      return this;
    }

    /**
     * Set the notBeforeDuration.
     *
     * @param notBeforeDuration the notBeforeDuration
     * @return the PrivateCertificateConfigurationTemplatePrototype builder
     */
    public Builder notBeforeDuration(String notBeforeDuration) {
      this.notBeforeDuration = notBeforeDuration;
      return this;
    }
  }

  protected PrivateCertificateConfigurationTemplatePrototype() { }

  protected PrivateCertificateConfigurationTemplatePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configType,
      "configType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificateAuthority,
      "certificateAuthority cannot be null");
    configType = builder.configType;
    name = builder.name;
    certificateAuthority = builder.certificateAuthority;
    allowedSecretGroups = builder.allowedSecretGroups;
    maxTtl = builder.maxTtl;
    ttl = builder.ttl;
    allowLocalhost = builder.allowLocalhost;
    allowedDomains = builder.allowedDomains;
    allowedDomainsTemplate = builder.allowedDomainsTemplate;
    allowBareDomains = builder.allowBareDomains;
    allowSubdomains = builder.allowSubdomains;
    allowGlobDomains = builder.allowGlobDomains;
    allowWildcardCertificates = builder.allowWildcardCertificates;
    allowAnyName = builder.allowAnyName;
    enforceHostnames = builder.enforceHostnames;
    allowIpSans = builder.allowIpSans;
    allowedUriSans = builder.allowedUriSans;
    allowedOtherSans = builder.allowedOtherSans;
    serverFlag = builder.serverFlag;
    clientFlag = builder.clientFlag;
    codeSigningFlag = builder.codeSigningFlag;
    emailProtectionFlag = builder.emailProtectionFlag;
    keyType = builder.keyType;
    keyBits = builder.keyBits;
    keyUsage = builder.keyUsage;
    extKeyUsage = builder.extKeyUsage;
    extKeyUsageOids = builder.extKeyUsageOids;
    useCsrCommonName = builder.useCsrCommonName;
    useCsrSans = builder.useCsrSans;
    ou = builder.ou;
    organization = builder.organization;
    country = builder.country;
    locality = builder.locality;
    province = builder.province;
    streetAddress = builder.streetAddress;
    postalCode = builder.postalCode;
    serialNumber = builder.serialNumber;
    requireCn = builder.requireCn;
    policyIdentifiers = builder.policyIdentifiers;
    basicConstraintsValidForNonCa = builder.basicConstraintsValidForNonCa;
    notBeforeDuration = builder.notBeforeDuration;
  }

  /**
   * New builder.
   *
   * @return a PrivateCertificateConfigurationTemplatePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

