package com.jd.open.api.sdk.domain.plgz.BrandCategoryCheckIsvFacade.request.batchCheckBrandCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BrandCategoryIdDto implements Serializable {
   private Long brandId;
   private Long categoryId;

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }
}
