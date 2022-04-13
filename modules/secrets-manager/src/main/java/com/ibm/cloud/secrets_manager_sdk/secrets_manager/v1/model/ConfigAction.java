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
 * Properties that describe an action on a configuration element.
 * <p>
 * Classes which extend this class:
 * - SignCsrAction
 * - SignIntermediateAction
 * - SetSignedAction
 * - RevokeAction
 */
public class ConfigAction extends GenericModel {

    /**
     * The format of the returned data.
     */
    public interface Format {
        /**
         * pem.
         */
        String PEM = "pem";
        /**
         * der.
         */
        String DER = "der";
        /**
         * pem_bundle.
         */
        String PEM_BUNDLE = "pem_bundle";
    }

    @SerializedName("common_name")
    protected String commonName;
    @SerializedName("alt_names")
    protected String altNames;
    @SerializedName("ip_sans")
    protected String ipSans;
    @SerializedName("uri_sans")
    protected String uriSans;
    @SerializedName("other_sans")
    protected List<String> otherSans;
    protected String ttl;
    protected String format;
    @SerializedName("max_path_length")
    protected Long maxPathLength;
    @SerializedName("exclude_cn_from_sans")
    protected Boolean excludeCnFromSans;
    @SerializedName("permitted_dns_domains")
    protected List<String> permittedDnsDomains;
    @SerializedName("use_csr_values")
    protected Boolean useCsrValues;
    protected List<String> ou;
    protected List<String> organization;
    protected List<String> country;
    protected List<String> locality;
    protected List<String> province;
    @SerializedName("street_address")
    protected List<String> streetAddress;
    @SerializedName("postal_code")
    protected List<String> postalCode;
    @SerializedName("serial_number")
    protected String serialNumber;
    protected String csr;
    @SerializedName("intermediate_certificate_authority")
    protected String intermediateCertificateAuthority;
    protected String certificate;

    protected ConfigAction() {
    }

    /**
     * Gets the commonName.
     * <p>
     * The fully qualified domain name or host domain name for the certificate.
     *
     * @return the commonName
     */
    public String commonName() {
        return commonName;
    }

    /**
     * Gets the altNames.
     * <p>
     * The Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
     * <p>
     * The alternative names can be host names or email addresses.
     *
     * @return the altNames
     */
    public String altNames() {
        return altNames;
    }

    /**
     * Gets the ipSans.
     * <p>
     * The IP Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
     *
     * @return the ipSans
     */
    public String ipSans() {
        return ipSans;
    }

    /**
     * Gets the uriSans.
     * <p>
     * The URI Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
     *
     * @return the uriSans
     */
    public String uriSans() {
        return uriSans;
    }

    /**
     * Gets the otherSans.
     * <p>
     * The custom Object Identifier (OID) or UTF8-string Subject Alternative Names to define for the CA certificate.
     * <p>
     * The alternative names must match the values that are specified in the `allowed_other_sans` field in the associated
     * certificate template. The format is the same as OpenSSL: `&lt;oid&gt;:&lt;type&gt;:&lt;value&gt;` where the current
     * valid type is `UTF8`.
     *
     * @return the otherSans
     */
    public List<String> otherSans() {
        return otherSans;
    }

    /**
     * Gets the ttl.
     * <p>
     * The time-to-live (TTL) or lease duration to assign to a private certificate.
     * <p>
     * The value can be supplied as a string representation of a duration in hours, such as `12h`. The value can't exceed
     * the `max_ttl` that is defined in the associated certificate template.
     *
     * @return the ttl
     */
    public String ttl() {
        return ttl;
    }

    /**
     * Gets the format.
     * <p>
     * The format of the returned data.
     *
     * @return the format
     */
    public String format() {
        return format;
    }

    /**
     * Gets the maxPathLength.
     * <p>
     * The maximum path length to encode in the generated certificate. `-1` means no limit.
     * <p>
     * If the signing certificate has a maximum path length set, the path length is set to one less than that of the
     * signing certificate. A limit of `0` means a literal path length of zero.
     *
     * @return the maxPathLength
     */
    public Long maxPathLength() {
        return maxPathLength;
    }

    /**
     * Gets the excludeCnFromSans.
     * <p>
     * Controls whether the common name is excluded from Subject Alternative Names (SANs).
     * <p>
     * If set to `true`, the common name is is not included in DNS or Email SANs if they apply. This field can be useful
     * if the common name is not a hostname or an email address, but is instead a human-readable identifier.
     *
     * @return the excludeCnFromSans
     */
    public Boolean excludeCnFromSans() {
        return excludeCnFromSans;
    }

    /**
     * Gets the permittedDnsDomains.
     * <p>
     * The allowed DNS domains or subdomains for the certificates to be signed and issued by this CA certificate.
     *
     * @return the permittedDnsDomains
     */
    public List<String> permittedDnsDomains() {
        return permittedDnsDomains;
    }

    /**
     * Gets the useCsrValues.
     * <p>
     * Determines whether to use values from a certificate signing request (CSR) to complete a `sign_csr` action. If set
     * to `true`, then:
     * <p>
     * 1) Subject information, including names and alternate names, are preserved from the CSR rather than using the
     * values provided in the other parameters to this operation.
     * <p>
     * 2) Any key usages (for example, non-repudiation) that are requested in the CSR are added to the basic set of key
     * usages used for CA certs signed by this intermediate authority.
     * <p>
     * 3) Extensions that are requested in the CSR are copied into the issued private certificate.
     *
     * @return the useCsrValues
     */
    public Boolean useCsrValues() {
        return useCsrValues;
    }

    /**
     * Gets the ou.
     * <p>
     * The Organizational Unit (OU) values to define in the subject field of the resulting CA certificate.
     *
     * @return the ou
     */
    public List<String> ou() {
        return ou;
    }

    /**
     * Gets the organization.
     * <p>
     * The Organization (O) values to define in the subject field of the resulting CA certificate.
     *
     * @return the organization
     */
    public List<String> organization() {
        return organization;
    }

    /**
     * Gets the country.
     * <p>
     * The Country (C) values to define in the subject field of the resulting CA certificate.
     *
     * @return the country
     */
    public List<String> country() {
        return country;
    }

    /**
     * Gets the locality.
     * <p>
     * The Locality (L) values to define in the subject field of the resulting CA certificate.
     *
     * @return the locality
     */
    public List<String> locality() {
        return locality;
    }

    /**
     * Gets the province.
     * <p>
     * The Province (ST) values to define in the subject field of the resulting CA certificate.
     *
     * @return the province
     */
    public List<String> province() {
        return province;
    }

    /**
     * Gets the streetAddress.
     * <p>
     * The Street Address values in the subject field of the resulting CA certificate.
     *
     * @return the streetAddress
     */
    public List<String> streetAddress() {
        return streetAddress;
    }

    /**
     * Gets the postalCode.
     * <p>
     * The Postal Code values in the subject field of the resulting CA certificate.
     *
     * @return the postalCode
     */
    public List<String> postalCode() {
        return postalCode;
    }

    /**
     * Gets the serialNumber.
     * <p>
     * The serial number to assign to the generated private certificate. To assign a random serial number, you can omit
     * this field.
     *
     * @return the serialNumber
     */
    public String serialNumber() {
        return serialNumber;
    }

    /**
     * Gets the csr.
     * <p>
     * The PEM-encoded certificate signing request (CSR). This field is required for the `sign_csr` action.
     *
     * @return the csr
     */
    public String csr() {
        return csr;
    }

    /**
     * Gets the intermediateCertificateAuthority.
     * <p>
     * The intermediate certificate authority to be signed. The name must match one of the pre-configured intermediate
     * certificate authorities.
     *
     * @return the intermediateCertificateAuthority
     */
    public String intermediateCertificateAuthority() {
        return intermediateCertificateAuthority;
    }

    /**
     * Gets the certificate.
     * <p>
     * The PEM-encoded certificate.
     *
     * @return the certificate
     */
    public String certificate() {
        return certificate;
    }
}

