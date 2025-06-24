package com.jd.open.api.sdk.domain.plgz.BrandCategoryCheckIsvFacade.request.batchCheckBrandCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class BrandCategoryBatchCheckParam implements Serializable {
   private Long venderId;
   private Set<BrandCategoryIdDto> brandCategoryIds;
   private String appKey;

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("brandCategoryIds")
   public void setBrandCategoryIds(Set<BrandCategoryIdDto> brandCategoryIds) {
      this.brandCategoryIds = brandCategoryIds;
   }

   @JsonProperty("brandCategoryIds")
   public Set<BrandCategoryIdDto> getBrandCategoryIds() {
      return this.brandCategoryIds;
   }

   @JsonProperty("appKey")
   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   @JsonProperty("appKey")
   public String getAppKey() {
      return this.appKey;
   }
}
