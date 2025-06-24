package com.jd.open.api.sdk.domain.seller.VenderAvailableBrandQueryService.response.serachVenderAvailableBrandByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderAvailableBrandVo implements Serializable {
   private Long brandId;
   private String brandName;

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }
}
