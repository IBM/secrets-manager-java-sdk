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

import java.util.ArrayList;
import java.util.List;

/**
 * Intermediate certificate authority configuration.
 */
public class IntermediateCertificateAuthorityConfig extends ConfigElementDefConfig {

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
     * The status of the certificate authority. The status of a root certificate authority is either `configured` or
     * `expired`. For intermediate certificate authorities, possible statuses include `signing_required`,
     * `signed_certificate_required`, `certificate_template_required`, `configured`, `expired` or `revoked`.
     */
    public interface Status {
        /**
         * signing_required.
         */
        String SIGNING_REQUIRED = "signing_required";
        /**
         * signed_certificate_required.
         */
        String SIGNED_CERTIFICATE_REQUIRED = "signed_certificate_required";
        /**
         * certificate_template_required.
         */
        String CERTIFICATE_TEMPLATE_REQUIRED = "certificate_template_required";
        /**
         * configured.
         */
        String CONFIGURED = "configured";
        /**
         * expired.
         */
        String EXPIRED = "expired";
        /**
         * revoked.
         */
        String REVOKED = "revoked";
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
        private Object maxTtl;
        private String signingMethod;
        private String issuer;
        private Object crlExpiry;
        private Boolean crlDisable;
        private Boolean crlDistributionPointsEncoded;
        private Boolean issuingCertificatesUrlsEncoded;
        private String commonName;
        private String altNames;
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
         * Instantiates a new Builder from an existing IntermediateCertificateAuthorityConfig instance.
         *
         * @param intermediateCertificateAuthorityConfig the instance to initialize the Builder with
         */
        public Builder(ConfigElementDefConfig intermediateCertificateAuthorityConfig) {
            this.maxTtl = intermediateCertificateAuthorityConfig.maxTtl;
            this.signingMethod = intermediateCertificateAuthorityConfig.signingMethod;
            this.issuer = intermediateCertificateAuthorityConfig.issuer;
            this.crlExpiry = intermediateCertificateAuthorityConfig.crlExpiry;
            this.crlDisable = intermediateCertificateAuthorityConfig.crlDisable;
            this.crlDistributionPointsEncoded = intermediateCertificateAuthorityConfig.crlDistributionPointsEncoded;
            this.issuingCertificatesUrlsEncoded = intermediateCertificateAuthorityConfig.issuingCertificatesUrlsEncoded;
            this.commonName = intermediateCertificateAuthorityConfig.commonName;
            this.altNames = intermediateCertificateAuthorityConfig.altNames;
            this.ipSans = intermediateCertificateAuthorityConfig.ipSans;
            this.uriSans = intermediateCertificateAuthorityConfig.uriSans;
            this.otherSans = intermediateCertificateAuthorityConfig.otherSans;
            this.format = intermediateCertificateAuthorityConfig.format;
            this.privateKeyFormat = intermediateCertificateAuthorityConfig.privateKeyFormat;
            this.keyType = intermediateCertificateAuthorityConfig.keyType;
            this.keyBits = intermediateCertificateAuthorityConfig.keyBits;
            this.excludeCnFromSans = intermediateCertificateAuthorityConfig.excludeCnFromSans;
            this.ou = intermediateCertificateAuthorityConfig.ou;
            this.organization = intermediateCertificateAuthorityConfig.organization;
            this.country = intermediateCertificateAuthorityConfig.country;
            this.locality = intermediateCertificateAuthorityConfig.locality;
            this.province = intermediateCertificateAuthorityConfig.province;
            this.streetAddress = intermediateCertificateAuthorityConfig.streetAddress;
            this.postalCode = intermediateCertificateAuthorityConfig.postalCode;
            this.serialNumber = intermediateCertificateAuthorityConfig.serialNumber;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Instantiates a new builder with required properties.
         *
         * @param maxTtl        the maxTtl
         * @param signingMethod the signingMethod
         * @param commonName    the commonName
         */
        public Builder(Object maxTtl, String signingMethod, String commonName) {
            this.maxTtl = maxTtl;
            this.signingMethod = signingMethod;
            this.commonName = commonName;
        }

        /**
         * Builds a IntermediateCertificateAuthorityConfig.
         *
         * @return the new IntermediateCertificateAuthorityConfig instance
         */
        public IntermediateCertificateAuthorityConfig build() {
            return new IntermediateCertificateAuthorityConfig(this);
        }

        /**
         * Adds an otherSans to otherSans.
         *
         * @param otherSans the new otherSans
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * Adds an ou to ou.
         *
         * @param ou the new ou
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * Set the maxTtl.
         *
         * @param maxTtl the maxTtl
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder maxTtl(Object maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        /**
         * Set the signingMethod.
         *
         * @param signingMethod the signingMethod
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder signingMethod(String signingMethod) {
            this.signingMethod = signingMethod;
            return this;
        }

        /**
         * Set the issuer.
         *
         * @param issuer the issuer
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * Set the crlExpiry.
         *
         * @param crlExpiry the crlExpiry
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder crlExpiry(Object crlExpiry) {
            this.crlExpiry = crlExpiry;
            return this;
        }

        /**
         * Set the crlDisable.
         *
         * @param crlDisable the crlDisable
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder crlDisable(Boolean crlDisable) {
            this.crlDisable = crlDisable;
            return this;
        }

        /**
         * Set the crlDistributionPointsEncoded.
         *
         * @param crlDistributionPointsEncoded the crlDistributionPointsEncoded
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder crlDistributionPointsEncoded(Boolean crlDistributionPointsEncoded) {
            this.crlDistributionPointsEncoded = crlDistributionPointsEncoded;
            return this;
        }

        /**
         * Set the issuingCertificatesUrlsEncoded.
         *
         * @param issuingCertificatesUrlsEncoded the issuingCertificatesUrlsEncoded
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder issuingCertificatesUrlsEncoded(Boolean issuingCertificatesUrlsEncoded) {
            this.issuingCertificatesUrlsEncoded = issuingCertificatesUrlsEncoded;
            return this;
        }

        /**
         * Set the commonName.
         *
         * @param commonName the commonName
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * Set the altNames.
         *
         * @param altNames the altNames
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder altNames(String altNames) {
            this.altNames = altNames;
            return this;
        }

        /**
         * Set the ipSans.
         *
         * @param ipSans the ipSans
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder ipSans(String ipSans) {
            this.ipSans = ipSans;
            return this;
        }

        /**
         * Set the uriSans.
         *
         * @param uriSans the uriSans
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder otherSans(List<String> otherSans) {
            this.otherSans = otherSans;
            return this;
        }

        /**
         * Set the format.
         *
         * @param format the format
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * Set the privateKeyFormat.
         *
         * @param privateKeyFormat the privateKeyFormat
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder privateKeyFormat(String privateKeyFormat) {
            this.privateKeyFormat = privateKeyFormat;
            return this;
        }

        /**
         * Set the keyType.
         *
         * @param keyType the keyType
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder keyType(String keyType) {
            this.keyType = keyType;
            return this;
        }

        /**
         * Set the keyBits.
         *
         * @param keyBits the keyBits
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder keyBits(long keyBits) {
            this.keyBits = keyBits;
            return this;
        }

        /**
         * Set the excludeCnFromSans.
         *
         * @param excludeCnFromSans the excludeCnFromSans
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
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
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder postalCode(List<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Set the serialNumber.
         *
         * @param serialNumber the serialNumber
         * @return the IntermediateCertificateAuthorityConfig builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
    }

    protected IntermediateCertificateAuthorityConfig() {
    }

    protected IntermediateCertificateAuthorityConfig(Builder builder) {
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maxTtl,
                "maxTtl cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.signingMethod,
                "signingMethod cannot be null");
        com.ibm.cloud.sdk.core.util.Validator.notNull(builder.commonName,
                "commonName cannot be null");
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
     * @return a IntermediateCertificateAuthorityConfig builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }
}

