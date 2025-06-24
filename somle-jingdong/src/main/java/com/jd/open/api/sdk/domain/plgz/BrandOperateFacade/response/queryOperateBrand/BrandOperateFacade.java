package com.jd.open.api.sdk.domain.plgz.BrandOperateFacade.response.queryOperateBrand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BrandOperateFacade implements Serializable {
   private String brandZhName;
   private String brandName;
   private String brandEnName;
   private Long erpBrandId;

   @JsonProperty("brandZhName")
   public void setBrandZhName(String brandZhName) {
      this.brandZhName = brandZhName;
   }

   @JsonProperty("brandZhName")
   public String getBrandZhName() {
      return this.brandZhName;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("brandEnName")
   public void setBrandEnName(String brandEnName) {
      this.brandEnName = brandEnName;
   }

   @JsonProperty("brandEnName")
   public String getBrandEnName() {
      return this.brandEnName;
   }

   @JsonProperty("erpBrandId")
   public void setErpBrandId(Long erpBrandId) {
      this.erpBrandId = erpBrandId;
   }

   @JsonProperty("erpBrandId")
   public Long getErpBrandId() {
      return this.erpBrandId;
   }
}
