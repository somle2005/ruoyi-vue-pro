package com.jd.open.api.sdk.domain.B2B.BrandInfoService.response.queryBrandInfoByBid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BrandVO implements Serializable {
   private Long catId;
   private String brandName;
   private String code;
   private String cnName;
   private Long brandId;
   private String enName;

   @JsonProperty("catId")
   public void setCatId(Long catId) {
      this.catId = catId;
   }

   @JsonProperty("catId")
   public Long getCatId() {
      return this.catId;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("cnName")
   public void setCnName(String cnName) {
      this.cnName = cnName;
   }

   @JsonProperty("cnName")
   public String getCnName() {
      return this.cnName;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("enName")
   public void setEnName(String enName) {
      this.enName = enName;
   }

   @JsonProperty("enName")
   public String getEnName() {
      return this.enName;
   }
}
