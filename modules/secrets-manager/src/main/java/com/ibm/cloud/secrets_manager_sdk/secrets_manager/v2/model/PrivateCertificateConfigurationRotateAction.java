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
 * The response body of the action to rotate an intermediate certificate authority for the private certificate
 * configuration.
 */
public class PrivateCertificateConfigurationRotateAction extends GenericModel {

  /**
   * The format of the returned data.
   */
  public interface Format {
    /** pem. */
    String PEM = "pem";
    /** pem_bundle. */
    String PEM_BUNDLE = "pem_bundle";
  }

  @SerializedName("common_name")
  protected String commonName;
  @SerializedName("alt_names")
  protected List<String> altNames;
  @SerializedName("ip_sans")
  protected String ipSans;
  @SerializedName("uri_sans")
  protected String uriSans;
  @SerializedName("other_sans")
  protected List<String> otherSans;
  protected Long ttl;
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
  protected PrivateCertificateConfigurationCACertificate data;

  protected PrivateCertificateConfigurationRotateAction() { }

  /**
   * Gets the commonName.
   *
   * The Common Name (CN) represents the server name that is protected by the SSL certificate.
   *
   * @return the commonName
   */
  public String getCommonName() {
    return commonName;
  }

  /**
   * Gets the altNames.
   *
   * With the Subject Alternative Name field, you can specify additional hostnames to be protected by a single SSL
   * certificate.
   *
   * @return the altNames
   */
  public List<String> getAltNames() {
    return altNames;
  }

  /**
   * Gets the ipSans.
   *
   * The IP Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
   *
   * @return the ipSans
   */
  public String getIpSans() {
    return ipSans;
  }

  /**
   * Gets the uriSans.
   *
   * The URI Subject Alternative Names to define for the CA certificate, in a comma-delimited list.
   *
   * @return the uriSans
   */
  public String getUriSans() {
    return uriSans;
  }

  /**
   * Gets the otherSans.
   *
   * The custom Object Identifier (OID) or UTF8-string Subject Alternative Names to define for the CA certificate.
   *
   * The alternative names must match the values that are specified in the `allowed_other_sans` field in the associated
   * certificate template. The format is the same as OpenSSL: `&lt;oid&gt;:&lt;type&gt;:&lt;value&gt;` where the current
   * valid type is `UTF8`.
   *
   * @return the otherSans
   */
  public List<String> getOtherSans() {
    return otherSans;
  }

  /**
   * Gets the ttl.
   *
   * he requested TTL, after which the certificate expires.
   *
   * @return the ttl
   */
  public Long getTtl() {
    return ttl;
  }

  /**
   * Gets the format.
   *
   * The format of the returned data.
   *
   * @return the format
   */
  public String getFormat() {
    return format;
  }

  /**
   * Gets the maxPathLength.
   *
   * The maximum path length to encode in the generated certificate. `-1` means no limit.
   *
   * If the signing certificate has a maximum path length set, the path length is set to one less than that of the
   * signing certificate. A limit of `0` means a literal path length of zero.
   *
   * @return the maxPathLength
   */
  public Long getMaxPathLength() {
    return maxPathLength;
  }

  /**
   * Gets the excludeCnFromSans.
   *
   * This parameter controls whether the common name is excluded from Subject Alternative Names (SANs).
   *
   * If the common name is set to `true`, it is not included in DNS, or email SANs if they apply. This field can be
   * useful if the common name is a human-readable identifier, instead of a hostname or an email address.
   *
   * @return the excludeCnFromSans
   */
  public Boolean isExcludeCnFromSans() {
    return excludeCnFromSans;
  }

  /**
   * Gets the permittedDnsDomains.
   *
   * The allowed DNS domains or subdomains for the certificates that are to be signed and issued by this CA certificate.
   *
   * @return the permittedDnsDomains
   */
  public List<String> getPermittedDnsDomains() {
    return permittedDnsDomains;
  }

  /**
   * Gets the useCsrValues.
   *
   * This field indicates whether to use values from a certificate signing request (CSR) to complete a
   * `private_cert_configuration_action_sign_csr` action. If it is set to `true`, then:
   *
   * 1) Subject information, including names and alternate names, are preserved from the CSR rather than by using the
   * values that are provided in the other parameters to this operation.
   *
   * 2) Any key usage, for example, non-repudiation, that is requested in the CSR are added to the basic set of key
   * usages used for CA certificates that are signed by the intermediate authority.
   *
   * 3) Extensions that are requested in the CSR are copied into the issued private certificate.
   *
   * @return the useCsrValues
   */
  public Boolean isUseCsrValues() {
    return useCsrValues;
  }

  /**
   * Gets the ou.
   *
   * The Organizational Unit (OU) values to define in the subject field of the resulting certificate.
   *
   * @return the ou
   */
  public List<String> getOu() {
    return ou;
  }

  /**
   * Gets the organization.
   *
   * The Organization (O) values to define in the subject field of the resulting certificate.
   *
   * @return the organization
   */
  public List<String> getOrganization() {
    return organization;
  }

  /**
   * Gets the country.
   *
   * The Country (C) values to define in the subject field of the resulting certificate.
   *
   * @return the country
   */
  public List<String> getCountry() {
    return country;
  }

  /**
   * Gets the locality.
   *
   * The Locality (L) values to define in the subject field of the resulting certificate.
   *
   * @return the locality
   */
  public List<String> getLocality() {
    return locality;
  }

  /**
   * Gets the province.
   *
   * The Province (ST) values to define in the subject field of the resulting certificate.
   *
   * @return the province
   */
  public List<String> getProvince() {
    return province;
  }

  /**
   * Gets the streetAddress.
   *
   * The street address values to define in the subject field of the resulting certificate.
   *
   * @return the streetAddress
   */
  public List<String> getStreetAddress() {
    return streetAddress;
  }

  /**
   * Gets the postalCode.
   *
   * The postal code values to define in the subject field of the resulting certificate.
   *
   * @return the postalCode
   */
  public List<String> getPostalCode() {
    return postalCode;
  }

  /**
   * Gets the serialNumber.
   *
   * The requested value for the [`serialNumber`](https://datatracker.ietf.org/doc/html/rfc4519#section-2.31) attribute
   * that is in the certificate's distinguished name (DN).
   *
   * **Note:** This field is not related to the `serial_number` field that is returned in the API response. The
   * `serial_number` field represents the certificate's randomly assigned serial number.
   *
   * @return the serialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Gets the csr.
   *
   * The certificate signing request.
   *
   * @return the csr
   */
  public String getCsr() {
    return csr;
  }

  /**
   * Gets the data.
   *
   * The data that is associated with the root certificate authority.
   *
   * @return the data
   */
  public PrivateCertificateConfigurationCACertificate getData() {
    return data;
  }
}

