package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.queryBrand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartBrandInfo implements Serializable {
   private String brandName;
   private Integer brandId;

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }
}
