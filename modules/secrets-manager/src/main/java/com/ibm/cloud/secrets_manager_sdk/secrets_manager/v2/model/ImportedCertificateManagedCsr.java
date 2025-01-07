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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The data specified to create the CSR and the private key.
 */
public class ImportedCertificateManagedCsr extends GenericModel {

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
        /**
         * ed25519.
         */
        String ED25519 = "ed25519";
    }

    protected List<String> ou;
    protected List<String> organization;
    protected List<String> country;
    protected List<String> locality;
    protected List<String> province;
    @SerializedName("street_address")
    protected List<String> streetAddress;
    @SerializedName("postal_code")
    protected List<String> postalCode;
    @SerializedName("require_cn")
    protected Boolean requireCn;
    @SerializedName("common_name")
    protected String commonName;
    @SerializedName("alt_names")
    protected String altNames;
    @SerializedName("ip_sans")
    protected String ipSans;
    @SerializedName("uri_sans")
    protected String uriSans;
    @SerializedName("other_sans")
    protected String otherSans;
    @SerializedName("exclude_cn_from_sans")
    protected Boolean excludeCnFromSans;
    @SerializedName("user_ids")
    protected String userIds;
    @SerializedName("server_flag")
    protected Boolean serverFlag;
    @SerializedName("client_flag")
    protected Boolean clientFlag;
    @SerializedName("code_signing_flag")
    protected Boolean codeSigningFlag;
    @SerializedName("email_protection_flag")
    protected Boolean emailProtectionFlag;
    @SerializedName("key_type")
    protected String keyType;
    @SerializedName("key_bits")
    protected Long keyBits;
    @SerializedName("key_usage")
    protected String keyUsage;
    @SerializedName("ext_key_usage")
    protected String extKeyUsage;
    @SerializedName("policy_identifiers")
    protected String policyIdentifiers;
    @SerializedName("ext_key_usage_oids")
    protected String extKeyUsageOids;
    @SerializedName("rotate_keys")
    protected Boolean rotateKeys;
    protected String csr;
    @SerializedName("private_key")
    protected String privateKey;

    /**
     * Builder.
     */
    public static class Builder {
        private List<String> ou;
        private List<String> organization;
        private List<String> country;
        private List<String> locality;
        private List<String> province;
        private List<String> streetAddress;
        private List<String> postalCode;
        private Boolean requireCn;
        private String commonName;
        private String altNames;
        private String ipSans;
        private String uriSans;
        private String otherSans;
        private Boolean excludeCnFromSans;
        private String userIds;
        private Boolean serverFlag;
        private Boolean clientFlag;
        private Boolean codeSigningFlag;
        private Boolean emailProtectionFlag;
        private String keyType;
        private Long keyBits;
        private String keyUsage;
        private String extKeyUsage;
        private String policyIdentifiers;
        private String extKeyUsageOids;
        private Boolean rotateKeys;
        private String csr;
        private String privateKey;

        /**
         * Instantiates a new Builder from an existing ImportedCertificateManagedCsr instance.
         *
         * @param importedCertificateManagedCsr the instance to initialize the Builder with
         */
        private Builder(ImportedCertificateManagedCsr importedCertificateManagedCsr) {
            this.ou = importedCertificateManagedCsr.ou;
            this.organization = importedCertificateManagedCsr.organization;
            this.country = importedCertificateManagedCsr.country;
            this.locality = importedCertificateManagedCsr.locality;
            this.province = importedCertificateManagedCsr.province;
            this.streetAddress = importedCertificateManagedCsr.streetAddress;
            this.postalCode = importedCertificateManagedCsr.postalCode;
            this.requireCn = importedCertificateManagedCsr.requireCn;
            this.commonName = importedCertificateManagedCsr.commonName;
            this.altNames = importedCertificateManagedCsr.altNames;
            this.ipSans = importedCertificateManagedCsr.ipSans;
            this.uriSans = importedCertificateManagedCsr.uriSans;
            this.otherSans = importedCertificateManagedCsr.otherSans;
            this.excludeCnFromSans = importedCertificateManagedCsr.excludeCnFromSans;
            this.userIds = importedCertificateManagedCsr.userIds;
            this.serverFlag = importedCertificateManagedCsr.serverFlag;
            this.clientFlag = importedCertificateManagedCsr.clientFlag;
            this.codeSigningFlag = importedCertificateManagedCsr.codeSigningFlag;
            this.emailProtectionFlag = importedCertificateManagedCsr.emailProtectionFlag;
            this.keyType = importedCertificateManagedCsr.keyType;
            this.keyBits = importedCertificateManagedCsr.keyBits;
            this.keyUsage = importedCertificateManagedCsr.keyUsage;
            this.extKeyUsage = importedCertificateManagedCsr.extKeyUsage;
            this.policyIdentifiers = importedCertificateManagedCsr.policyIdentifiers;
            this.extKeyUsageOids = importedCertificateManagedCsr.extKeyUsageOids;
            this.rotateKeys = importedCertificateManagedCsr.rotateKeys;
            this.csr = importedCertificateManagedCsr.csr;
            this.privateKey = importedCertificateManagedCsr.privateKey;
        }

        /**
         * Instantiates a new builder.
         */
        public Builder() {
        }

        /**
         * Builds a ImportedCertificateManagedCsr.
         *
         * @return the new ImportedCertificateManagedCsr instance
         */
        public ImportedCertificateManagedCsr build() {
            return new ImportedCertificateManagedCsr(this);
        }

        /**
         * Adds a new element to ou.
         *
         * @param ou the new element to be added
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * Set the ou.
         * Existing ou will be replaced.
         *
         * @param ou the ou
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
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
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder postalCode(List<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Set the requireCn.
         *
         * @param requireCn the requireCn
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder requireCn(Boolean requireCn) {
            this.requireCn = requireCn;
            return this;
        }

        /**
         * Set the commonName.
         *
         * @param commonName the commonName
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * Set the altNames.
         *
         * @param altNames the altNames
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder altNames(String altNames) {
            this.altNames = altNames;
            return this;
        }

        /**
         * Set the ipSans.
         *
         * @param ipSans the ipSans
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder ipSans(String ipSans) {
            this.ipSans = ipSans;
            return this;
        }

        /**
         * Set the uriSans.
         *
         * @param uriSans the uriSans
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder uriSans(String uriSans) {
            this.uriSans = uriSans;
            return this;
        }

        /**
         * Set the otherSans.
         *
         * @param otherSans the otherSans
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder otherSans(String otherSans) {
            this.otherSans = otherSans;
            return this;
        }

        /**
         * Set the excludeCnFromSans.
         *
         * @param excludeCnFromSans the excludeCnFromSans
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder excludeCnFromSans(Boolean excludeCnFromSans) {
            this.excludeCnFromSans = excludeCnFromSans;
            return this;
        }

        /**
         * Set the userIds.
         *
         * @param userIds the userIds
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder userIds(String userIds) {
            this.userIds = userIds;
            return this;
        }

        /**
         * Set the serverFlag.
         *
         * @param serverFlag the serverFlag
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder serverFlag(Boolean serverFlag) {
            this.serverFlag = serverFlag;
            return this;
        }

        /**
         * Set the clientFlag.
         *
         * @param clientFlag the clientFlag
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder clientFlag(Boolean clientFlag) {
            this.clientFlag = clientFlag;
            return this;
        }

        /**
         * Set the codeSigningFlag.
         *
         * @param codeSigningFlag the codeSigningFlag
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder codeSigningFlag(Boolean codeSigningFlag) {
            this.codeSigningFlag = codeSigningFlag;
            return this;
        }

        /**
         * Set the emailProtectionFlag.
         *
         * @param emailProtectionFlag the emailProtectionFlag
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder emailProtectionFlag(Boolean emailProtectionFlag) {
            this.emailProtectionFlag = emailProtectionFlag;
            return this;
        }

        /**
         * Set the keyType.
         *
         * @param keyType the keyType
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder keyType(String keyType) {
            this.keyType = keyType;
            return this;
        }

        /**
         * Set the keyBits.
         *
         * @param keyBits the keyBits
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder keyBits(long keyBits) {
            this.keyBits = keyBits;
            return this;
        }

        /**
         * Set the keyUsage.
         *
         * @param keyUsage the keyUsage
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * Set the extKeyUsage.
         *
         * @param extKeyUsage the extKeyUsage
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder extKeyUsage(String extKeyUsage) {
            this.extKeyUsage = extKeyUsage;
            return this;
        }

        /**
         * Set the policyIdentifiers.
         *
         * @param policyIdentifiers the policyIdentifiers
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder policyIdentifiers(String policyIdentifiers) {
            this.policyIdentifiers = policyIdentifiers;
            return this;
        }

        /**
         * Set the extKeyUsageOids.
         *
         * @param extKeyUsageOids the extKeyUsageOids
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder extKeyUsageOids(String extKeyUsageOids) {
            this.extKeyUsageOids = extKeyUsageOids;
            return this;
        }

        /**
         * Set the rotateKeys.
         *
         * @param rotateKeys the rotateKeys
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder rotateKeys(Boolean rotateKeys) {
            this.rotateKeys = rotateKeys;
            return this;
        }

        /**
         * Set the csr.
         *
         * @param csr the csr
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * Set the privateKey.
         *
         * @param privateKey the privateKey
         * @return the ImportedCertificateManagedCsr builder
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
    }

    protected ImportedCertificateManagedCsr() {
    }

    protected ImportedCertificateManagedCsr(Builder builder) {
        ou = builder.ou;
        organization = builder.organization;
        country = builder.country;
        locality = builder.locality;
        province = builder.province;
        streetAddress = builder.streetAddress;
        postalCode = builder.postalCode;
        requireCn = builder.requireCn;
        commonName = builder.commonName;
        altNames = builder.altNames;
        ipSans = builder.ipSans;
        uriSans = builder.uriSans;
        otherSans = builder.otherSans;
        excludeCnFromSans = builder.excludeCnFromSans;
        userIds = builder.userIds;
        serverFlag = builder.serverFlag;
        clientFlag = builder.clientFlag;
        codeSigningFlag = builder.codeSigningFlag;
        emailProtectionFlag = builder.emailProtectionFlag;
        keyType = builder.keyType;
        keyBits = builder.keyBits;
        keyUsage = builder.keyUsage;
        extKeyUsage = builder.extKeyUsage;
        policyIdentifiers = builder.policyIdentifiers;
        extKeyUsageOids = builder.extKeyUsageOids;
        rotateKeys = builder.rotateKeys;
        csr = builder.csr;
        privateKey = builder.privateKey;
    }

    /**
     * New builder.
     *
     * @return a ImportedCertificateManagedCsr builder
     */
    public Builder newBuilder() {
        return new Builder(this);
    }

    /**
     * Gets the ou.
     * <p>
     * The Organizational Unit (OU) values to define in the subject field of the resulting certificate.
     *
     * @return the ou
     */
    public List<String> ou() {
        return ou;
    }

    /**
     * Gets the organization.
     * <p>
     * The Organization (O) values to define in the subject field of the resulting certificate.
     *
     * @return the organization
     */
    public List<String> organization() {
        return organization;
    }

    /**
     * Gets the country.
     * <p>
     * The Country (C) values to define in the subject field of the resulting certificate.
     *
     * @return the country
     */
    public List<String> country() {
        return country;
    }

    /**
     * Gets the locality.
     * <p>
     * The Locality (L) values to define in the subject field of the resulting certificate.
     *
     * @return the locality
     */
    public List<String> locality() {
        return locality;
    }

    /**
     * Gets the province.
     * <p>
     * The Province (ST) values to define in the subject field of the resulting certificate.
     *
     * @return the province
     */
    public List<String> province() {
        return province;
    }

    /**
     * Gets the streetAddress.
     * <p>
     * The street address values to define in the subject field of the resulting certificate.
     *
     * @return the streetAddress
     */
    public List<String> streetAddress() {
        return streetAddress;
    }

    /**
     * Gets the postalCode.
     * <p>
     * The postal code values to define in the subject field of the resulting certificate.
     *
     * @return the postalCode
     */
    public List<String> postalCode() {
        return postalCode;
    }

    /**
     * Gets the requireCn.
     * <p>
     * If set to false, makes the common_name field optional while generating a certificate.
     *
     * @return the requireCn
     */
    public Boolean requireCn() {
        return requireCn;
    }

    /**
     * Gets the commonName.
     * <p>
     * The Common Name (CN) represents the server name protected by the SSL certificate.
     *
     * @return the commonName
     */
    public String commonName() {
        return commonName;
    }

    /**
     * Gets the altNames.
     * <p>
     * With the Subject Alternative Name field, you can specify additional hostnames to be protected by a single SSL
     * certificate.
     *
     * @return the altNames
     */
    public String altNames() {
        return altNames;
    }

    /**
     * Gets the ipSans.
     * <p>
     * The IP Subject Alternative Names to define for the certificate, in a comma-delimited list.
     *
     * @return the ipSans
     */
    public String ipSans() {
        return ipSans;
    }

    /**
     * Gets the uriSans.
     * <p>
     * The URI Subject Alternative Names to define for the certificate, in a comma-delimited list.
     *
     * @return the uriSans
     */
    public String uriSans() {
        return uriSans;
    }

    /**
     * Gets the otherSans.
     * <p>
     * The custom Object Identifier (OID) or UTF8-string Subject Alternative Names to define for the certificate, in a
     * comma-delimited list.
     * <p>
     * The alternative names must The format is the same as OpenSSL: `&lt;oid&gt;:&lt;type&gt;:&lt;value&gt;` where the
     * current valid type is `UTF8`.
     *
     * @return the otherSans
     */
    public String otherSans() {
        return otherSans;
    }

    /**
     * Gets the excludeCnFromSans.
     * <p>
     * This parameter controls whether the common name is excluded from Subject Alternative Names (SANs).
     * <p>
     * If the common name is set to `true`, it is not included in DNS, or email SANs if they apply. This field can be
     * useful if the common name is a human-readable identifier, instead of a hostname or an email address.
     *
     * @return the excludeCnFromSans
     */
    public Boolean excludeCnFromSans() {
        return excludeCnFromSans;
    }

    /**
     * Gets the userIds.
     * <p>
     * Specifies the list of requested User ID (OID 0.9.2342.19200300.100.1.1) Subject values to be placed on the signed
     * certificate.
     *
     * @return the userIds
     */
    public String userIds() {
        return userIds;
    }

    /**
     * Gets the serverFlag.
     * <p>
     * This field indicates whether certificate is flagged for server use.
     *
     * @return the serverFlag
     */
    public Boolean serverFlag() {
        return serverFlag;
    }

    /**
     * Gets the clientFlag.
     * <p>
     * This field indicates whether certificate is flagged for client use.
     *
     * @return the clientFlag
     */
    public Boolean clientFlag() {
        return clientFlag;
    }

    /**
     * Gets the codeSigningFlag.
     * <p>
     * This field indicates whether certificate is flagged for code signing use.
     *
     * @return the codeSigningFlag
     */
    public Boolean codeSigningFlag() {
        return codeSigningFlag;
    }

    /**
     * Gets the emailProtectionFlag.
     * <p>
     * This field indicates whether certificate is flagged for email protection use.
     *
     * @return the emailProtectionFlag
     */
    public Boolean emailProtectionFlag() {
        return emailProtectionFlag;
    }

    /**
     * Gets the keyType.
     * <p>
     * The type of private key to generate.
     *
     * @return the keyType
     */
    public String keyType() {
        return keyType;
    }

    /**
     * Gets the keyBits.
     * <p>
     * The number of bits to use to generate the private key.
     * <p>
     * Allowable values for RSA keys are: `2048`, `3072`, `4096` and `8192`. Allowable values for EC keys are: `224`,
     * `256`, `384`, and `521`. The default for RSA keys is `2048`. The default for EC keys is `256`. Ignored for ed25519
     * key.
     *
     * @return the keyBits
     */
    public Long keyBits() {
        return keyBits;
    }

    /**
     * Gets the keyUsage.
     * <p>
     * The allowed key usage constraint to define for certificate, in a comma-delimited list.
     * <p>
     * You can find valid values in the [Go x509 package documentation](https://pkg.go.dev/crypto/x509#KeyUsage). Omit the
     * `KeyUsage` part of the value. Values are not case-sensitive. To specify no key usage constraints, set this field to
     * an empty string.
     *
     * @return the keyUsage
     */
    public String keyUsage() {
        return keyUsage;
    }

    /**
     * Gets the extKeyUsage.
     * <p>
     * The allowed extended key usage constraint on certificate, in a comma-delimited list.
     * <p>
     * You can find valid values in the [Go x509 package documentation](https://golang.org/pkg/crypto/x509/#ExtKeyUsage).
     * Omit the `ExtKeyUsage` part of the value. Values are not case-sensitive. To specify no key usage constraints, set
     * this field to an empty string.
     *
     * @return the extKeyUsage
     */
    public String extKeyUsage() {
        return extKeyUsage;
    }

    /**
     * Gets the policyIdentifiers.
     * <p>
     * A comma-delimited list of policy Object Identifiers (OIDs).
     *
     * @return the policyIdentifiers
     */
    public String policyIdentifiers() {
        return policyIdentifiers;
    }

    /**
     * Gets the extKeyUsageOids.
     * <p>
     * A comma-delimited list of extended key usage Object Identifiers (OIDs).
     *
     * @return the extKeyUsageOids
     */
    public String extKeyUsageOids() {
        return extKeyUsageOids;
    }

    /**
     * Gets the rotateKeys.
     * <p>
     * This field indicates whether the private key will be rotated.
     *
     * @return the rotateKeys
     */
    public Boolean rotateKeys() {
        return rotateKeys;
    }

    /**
     * Gets the csr.
     * <p>
     * The certificate signing request.
     *
     * @return the csr
     */
    public String csr() {
        return csr;
    }

    /**
     * Gets the privateKey.
     * <p>
     * The PEM-encoded private key that is associated with the certificate. The data must be formatted on a single line
     * with embedded newline characters.
     *
     * @return the privateKey
     */
    public String privateKey() {
        return privateKey;
    }
}

