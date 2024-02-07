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

/**
 * This field indicates whether Secrets Manager rotates your secrets automatically.
 */
public class CommonRotationPolicy extends RotationPolicy {

  /**
   * The units for the secret rotation time interval.
   */
  public interface Unit {
    /** day. */
    String DAY = "day";
    /** month. */
    String MONTH = "month";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean autoRotate;
    private Long interval;
    private String unit;

    /**
     * Instantiates a new Builder from an existing CommonRotationPolicy instance.
     *
     * @param commonRotationPolicy the instance to initialize the Builder with
     */
    public Builder(RotationPolicy commonRotationPolicy) {
      this.autoRotate = commonRotationPolicy.autoRotate;
      this.interval = commonRotationPolicy.interval;
      this.unit = commonRotationPolicy.unit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param autoRotate the autoRotate
     */
    public Builder(Boolean autoRotate) {
      this.autoRotate = autoRotate;
    }

    /**
     * Builds a CommonRotationPolicy.
     *
     * @return the new CommonRotationPolicy instance
     */
    public CommonRotationPolicy build() {
      return new CommonRotationPolicy(this);
    }

    /**
     * Set the autoRotate.
     *
     * @param autoRotate the autoRotate
     * @return the CommonRotationPolicy builder
     */
    public Builder autoRotate(Boolean autoRotate) {
      this.autoRotate = autoRotate;
      return this;
    }

    /**
     * Set the interval.
     *
     * @param interval the interval
     * @return the CommonRotationPolicy builder
     */
    public Builder interval(long interval) {
      this.interval = interval;
      return this;
    }

    /**
     * Set the unit.
     *
     * @param unit the unit
     * @return the CommonRotationPolicy builder
     */
    public Builder unit(String unit) {
      this.unit = unit;
      return this;
    }
  }

  protected CommonRotationPolicy() { }

  protected CommonRotationPolicy(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.autoRotate,
      "autoRotate cannot be null");
    autoRotate = builder.autoRotate;
    interval = builder.interval;
    unit = builder.unit;
  }

  /**
   * New builder.
   *
   * @return a CommonRotationPolicy builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

