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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The data specified to create the CSR and the private key.
 */
public class ImportedCertificateManagedCsrResponse extends GenericModel {

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

    protected ImportedCertificateManagedCsrResponse() {
    }

    /**
     * Gets the ou.
     * <p>
     * The Organizational Unit (OU) values to define in the subject field of the resulting certificate.
     *
     * @return the ou
     */
    public List<String> getOu() {
        return ou;
    }

    /**
     * Gets the organization.
     * <p>
     * The Organization (O) values to define in the subject field of the resulting certificate.
     *
     * @return the organization
     */
    public List<String> getOrganization() {
        return organization;
    }

    /**
     * Gets the country.
     * <p>
     * The Country (C) values to define in the subject field of the resulting certificate.
     *
     * @return the country
     */
    public List<String> getCountry() {
        return country;
    }

    /**
     * Gets the locality.
     * <p>
     * The Locality (L) values to define in the subject field of the resulting certificate.
     *
     * @return the locality
     */
    public List<String> getLocality() {
        return locality;
    }

    /**
     * Gets the province.
     * <p>
     * The Province (ST) values to define in the subject field of the resulting certificate.
     *
     * @return the province
     */
    public List<String> getProvince() {
        return province;
    }

    /**
     * Gets the streetAddress.
     * <p>
     * The street address values to define in the subject field of the resulting certificate.
     *
     * @return the streetAddress
     */
    public List<String> getStreetAddress() {
        return streetAddress;
    }

    /**
     * Gets the postalCode.
     * <p>
     * The postal code values to define in the subject field of the resulting certificate.
     *
     * @return the postalCode
     */
    public List<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Gets the requireCn.
     * <p>
     * If set to false, makes the common_name field optional while generating a certificate.
     *
     * @return the requireCn
     */
    public Boolean isRequireCn() {
        return requireCn;
    }

    /**
     * Gets the commonName.
     * <p>
     * The Common Name (CN) represents the server name protected by the SSL certificate.
     *
     * @return the commonName
     */
    public String getCommonName() {
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
    public String getAltNames() {
        return altNames;
    }

    /**
     * Gets the ipSans.
     * <p>
     * The IP Subject Alternative Names to define for the certificate, in a comma-delimited list.
     *
     * @return the ipSans
     */
    public String getIpSans() {
        return ipSans;
    }

    /**
     * Gets the uriSans.
     * <p>
     * The URI Subject Alternative Names to define for the certificate, in a comma-delimited list.
     *
     * @return the uriSans
     */
    public String getUriSans() {
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
    public String getOtherSans() {
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
    public Boolean isExcludeCnFromSans() {
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
    public String getUserIds() {
        return userIds;
    }

    /**
     * Gets the serverFlag.
     * <p>
     * This field indicates whether certificate is flagged for server use.
     *
     * @return the serverFlag
     */
    public Boolean isServerFlag() {
        return serverFlag;
    }

    /**
     * Gets the clientFlag.
     * <p>
     * This field indicates whether certificate is flagged for client use.
     *
     * @return the clientFlag
     */
    public Boolean isClientFlag() {
        return clientFlag;
    }

    /**
     * Gets the codeSigningFlag.
     * <p>
     * This field indicates whether certificate is flagged for code signing use.
     *
     * @return the codeSigningFlag
     */
    public Boolean isCodeSigningFlag() {
        return codeSigningFlag;
    }

    /**
     * Gets the emailProtectionFlag.
     * <p>
     * This field indicates whether certificate is flagged for email protection use.
     *
     * @return the emailProtectionFlag
     */
    public Boolean isEmailProtectionFlag() {
        return emailProtectionFlag;
    }

    /**
     * Gets the keyType.
     * <p>
     * The type of private key to generate.
     *
     * @return the keyType
     */
    public String getKeyType() {
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
    public Long getKeyBits() {
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
    public String getKeyUsage() {
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
    public String getExtKeyUsage() {
        return extKeyUsage;
    }

    /**
     * Gets the policyIdentifiers.
     * <p>
     * A comma-delimited list of policy Object Identifiers (OIDs).
     *
     * @return the policyIdentifiers
     */
    public String getPolicyIdentifiers() {
        return policyIdentifiers;
    }

    /**
     * Gets the extKeyUsageOids.
     * <p>
     * A comma-delimited list of extended key usage Object Identifiers (OIDs).
     *
     * @return the extKeyUsageOids
     */
    public String getExtKeyUsageOids() {
        return extKeyUsageOids;
    }

    /**
     * Gets the rotateKeys.
     * <p>
     * This field indicates whether the private key will be rotated.
     *
     * @return the rotateKeys
     */
    public Boolean isRotateKeys() {
        return rotateKeys;
    }

    /**
     * Gets the csr.
     * <p>
     * The certificate signing request.
     *
     * @return the csr
     */
    public String getCsr() {
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
    public String getPrivateKey() {
        return privateKey;
    }
}

