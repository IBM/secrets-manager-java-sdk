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

import java.util.ArrayList;
import java.util.List;

/**
 * The configuration of the intermediate certificate authority.
 */
public class PrivateCertificateConfigurationIntermediateCAPrototype extends ConfigurationPrototype {

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
     * The signing method to use with this certificate authority to generate private certificates.
     * <p>
     * You can choose between internal or externally signed options. For more information, see the
     * [docs](https://cloud.ibm.com/docs/secrets-manager?topic=secrets-manager-intermediate-certificate-authorities).
     */
    public interface SigningMethod {
        /**
         * internal.
         */
        String INTERNAL = "internal";
        /**
         * external.
         */
        String EXTERNAL = "external";
    }

    /**
     * The format of the returned data.
     */
    public interface Format {
        /**
         * pem.
         */
        String PEM = "pem";
        /**
         * pem_bundle.
         */
        String PEM_BUNDLE = "pem_bundle";
    }

    /**
     * The format of the generated private key.
     */
    public interface PrivateKeyFormat {
        /**
         * der.
         */
        String DER = "der";
        /**
         * pkcs8.
         */
        String PKCS8 = "pkcs8";
    }

    /**
     * The type of private key to generate.
     */
    public interface KeyType {
        /**
         * rsa.
         */
        String RSA = "rsa";
        /**
         * ec.
         */
        String EC = "ec";
    }


    /**
     * Builder.
     */
    public static class Builder {
        private String configType;
        private String name;
        private PrivateCertificateCryptoKey cryptoKey;
        private String maxTtl;
        private String signingMethod;
        private String issuer;
        private String crlExpiry;
        private Boolean crlDisable;
        private Boolean crlDistributionPointsEncoded;
        private Boolean issuingCertificatesUrlsEncoded;
        private String commonName;
        private List<String> altNames;
        private String ipSans;
        private String uriSans;
        private List<String> otherSans;
        private String format;
        private String privateKeyFormat;
        private String keyType;
        private Long keyBits;
        private Boolean excludeCnFromSans;
        private List<String> ou;
        private List<String> organization;
        private List<String> country;
        private List<String> locality;
        private List<String> province;
        private List<String> streetAddress;
        private List<String> postalCode;
        private String serialNumber;

        /**
         * Instantiates a new Builder from an existing PrivateCertificateConfigurationIntermediateCAPrototype instance.
         *
         * @param privateCertificateConfigurationIntermediateCaPrototype the instance to initialize the Builder with
         */
        public Builder(ConfigurationPrototype privateCertificateConfigurationIntermediateCaPrototype) {
            this.configType = privateCertificateConfigurationIntermediateCaPrototype.configType;
            this.name = privateCertificateConfigurationIntermediateCaPrototype.name;
            this.cryptoKey = privateCertificateConfigurationIntermediateCaPrototype.cryptoKey;
            this.maxTtl = privateCertificateConfigurationIntermediateCaPrototype.maxTtl;
            this.signingMethod = privateCertificateConfigurationIntermediateCaPrototype.signingMethod;
            this.issuer = privateCertificateConfigurationIntermediateCaPrototype.issuer;
            this.crlExpiry = privateCertificateConfigurationIntermediateCaPrototype.crlExpiry;
            this.crlDisable = privateCertificateConfigurationIntermediateCaPrototype.crlDisable;
            this.crlDistributionPointsEncoded = privateCertificateConfigurationIntermediateCaPrototype.crlDistributionPointsEncoded;
            this.issuingCertificatesUrlsEncoded = privateCertificateConfigurationIntermediateCaPrototype.issuingCertificatesUrlsEncoded;
            this.commonName = privateCertificateConfigurationIntermediateCaPrototype.commonName;
            this.altNames = privateCertificateConfigurationIntermediateCaPrototype.altNames;
            this.ipSans = privateCertificateConfigurationIntermediateCaPrototype.ipSans;
            this.uriSans = privateCertificateConfigurationIntermediateCaPrototype.uriSans;
            this.otherSans = privateCertificateConfigurationIntermediateCaPrototype.otherSans;
            this.format = privateCertificateConfigurationIntermediateCaPrototype.format;
            this.privateKeyFormat = privateCertificateConfigurationIntermediateCaPrototype.privateKeyFormat;
            this.keyType = privateCertificateConfigurationIntermediateCaPrototype.keyType;
            this.keyBits = privateCertificateConfigurationIntermediateCaPrototype.keyBits;
            this.excludeCnFromSans = privateCertificateConfigurationIntermediateCaPrototype.excludeCnFromSans;
            this.ou = privateCertificateConfigurationIntermediateCaPrototype.ou;
            this.organization = privateCertificateConfigurationIntermediateCaPrototype.organization;
            this.country = privateCertificateConfigurationIntermediateCaPrototype.country;
            this.locality = privateCertificateConfigurationIntermediateCaPrototype.locality;
            this.province = privateCertificateConfigurationIntermediateCaPrototype.province;
            this.streetAddress = privateCertificateConfigurationIntermediateCaPrototype.streetAddress;
            this.postalCode = privateCertificateConfigurationIntermediateCaPrototype.postalCode;
            this.serialNumber = privateCertificateConfigurationIntermediateCaPrototype.serialNumber;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param configType    the configType
         * @param name          the name
         * @param maxTtl        the maxTtl
         * @param signingMethod the signingMethod
         * @param commonName    the commonName
         */
        public Builder(String configType, String name, String maxTtl, String signingMethod, String commonName) {
            this.configType = configType;
            this.name = name;
            this.maxTtl = maxTtl;
            this.signingMethod = signingMethod;
            this.commonName = commonName;
        }

        /**
         * Builds a PrivateCertificateConfigurationIntermediateCAPrototype.
         *
         * @return the new PrivateCertificateConfigurationIntermediateCAPrototype instance
         */
        public PrivateCertificateConfigurationIntermediateCAPrototype build() {
            return new PrivateCertificateConfigurationIntermediateCAPrototype(this);
        }

        /**
         * Adds a new element to altNames.
         *
         * @param altNames the new element to be added
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * Adds a new element to ou.
         *
         * @param ou the new element to be added
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * Set the configType.
         *
         * @param configType the configType
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * Set the name.
         *
         * @param name the name
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the cryptoKey.
         *
         * @param cryptoKey the cryptoKey
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder cryptoKey(PrivateCertificateCryptoKey cryptoKey) {
            this.cryptoKey = cryptoKey;
            return this;
        }

        /**
         * Set the maxTtl.
         *
         * @param maxTtl the maxTtl
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder maxTtl(String maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        /**
         * Set the signingMethod.
         *
         * @param signingMethod the signingMethod
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder signingMethod(String signingMethod) {
            this.signingMethod = signingMethod;
            return this;
        }

        /**
         * Set the issuer.
         *
         * @param issuer the issuer
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * Set the crlExpiry.
         *
         * @param crlExpiry the crlExpiry
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder crlExpiry(String crlExpiry) {
            this.crlExpiry = crlExpiry;
            return this;
        }

        /**
         * Set the crlDisable.
         *
         * @param crlDisable the crlDisable
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder crlDisable(Boolean crlDisable) {
            this.crlDisable = crlDisable;
            return this;
        }

        /**
         * Set the crlDistributionPointsEncoded.
         *
         * @param crlDistributionPointsEncoded the crlDistributionPointsEncoded
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder crlDistributionPointsEncoded(Boolean crlDistributionPointsEncoded) {
            this.crlDistributionPointsEncoded = crlDistributionPointsEncoded;
            return this;
        }

        /**
         * Set the issuingCertificatesUrlsEncoded.
         *
         * @param issuingCertificatesUrlsEncoded the issuingCertificatesUrlsEncoded
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder issuingCertificatesUrlsEncoded(Boolean issuingCertificatesUrlsEncoded) {
            this.issuingCertificatesUrlsEncoded = issuingCertificatesUrlsEncoded;
            return this;
        }

        /**
         * Set the commonName.
         *
         * @param commonName the commonName
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder altNames(List<String> altNames) {
            this.altNames = altNames;
            return this;
        }

        /**
         * Set the ipSans.
         *
         * @param ipSans the ipSans
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder ipSans(String ipSans) {
            this.ipSans = ipSans;
            return this;
        }

        /**
         * Set the uriSans.
         *
         * @param uriSans the uriSans
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder otherSans(List<String> otherSans) {
            this.otherSans = otherSans;
            return this;
        }

        /**
         * Set the format.
         *
         * @param format the format
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * Set the privateKeyFormat.
         *
         * @param privateKeyFormat the privateKeyFormat
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder privateKeyFormat(String privateKeyFormat) {
            this.privateKeyFormat = privateKeyFormat;
            return this;
        }

        /**
         * Set the keyType.
         *
         * @param keyType the keyType
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder keyType(String keyType) {
            this.keyType = keyType;
            return this;
        }

        /**
         * Set the keyBits.
         *
         * @param keyBits the keyBits
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder keyBits(long keyBits) {
            this.keyBits = keyBits;
            return this;
        }

        /**
         * Set the excludeCnFromSans.
         *
         * @param excludeCnFromSans the excludeCnFromSans
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder excludeCnFromSans(Boolean excludeCnFromSans) {
            this.excludeCnFromSans = excludeCnFromSans;
            return this;
        }

        /**
         * Set the ou.
         * Existing ou will be replaced.
         *
         * @param ou the ou
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
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
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder postalCode(List<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Set the serialNumber.
         *
         * @param serialNumber the serialNumber
         * @return the PrivateCertificateConfigurationIntermediateCAPrototype builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
    }

    protected PrivateCertificateConfigurationIntermediateCAPrototype() {
    }

    protected PrivateCertificateConfigurationIntermediateCAPrototype(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configType,
                "configType cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
                "name cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maxTtl,
                "maxTtl cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.signingMethod,
                "signingMethod cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.commonName,
                "commonName cannot be null");
        configType = builder.configType;
        name = builder.name;
        cryptoKey = builder.cryptoKey;
        maxTtl = builder.maxTtl;
        signingMethod = builder.signingMethod;
        issuer = builder.issuer;
        crlExpiry = builder.crlExpiry;
        crlDisable = builder.crlDisable;
        crlDistributionPointsEncoded = builder.crlDistributionPointsEncoded;
        issuingCertificatesUrlsEncoded = builder.issuingCertificatesUrlsEncoded;
        commonName = builder.commonName;
        altNames = builder.altNames;
        ipSans = builder.ipSans;
        uriSans = builder.uriSans;
        otherSans = builder.otherSans;
        format = builder.format;
        privateKeyFormat = builder.privateKeyFormat;
        keyType = builder.keyType;
        keyBits = builder.keyBits;
        excludeCnFromSans = builder.excludeCnFromSans;
        ou = builder.ou;
        organization = builder.organization;
        country = builder.country;
        locality = builder.locality;
        province = builder.province;
        streetAddress = builder.streetAddress;
        postalCode = builder.postalCode;
        serialNumber = builder.serialNumber;
    }

    /**
     * New builder.
     *
     * @return a PrivateCertificateConfigurationIntermediateCAPrototype builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

