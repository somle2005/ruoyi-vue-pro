package com.jd.open.api.sdk.domain.ware.SpuRuleReadService.response.getSpuCategoryRule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SpuCategoryRule implements Serializable {
   private Long categoryId;
   private Integer spuType;
   private Integer dim;
   private List<String> brandIds;

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("spuType")
   public void setSpuType(Integer spuType) {
      this.spuType = spuType;
   }

   @JsonProperty("spuType")
   public Integer getSpuType() {
      return this.spuType;
   }

   @JsonProperty("dim")
   public void setDim(Integer dim) {
      this.dim = dim;
   }

   @JsonProperty("dim")
   public Integer getDim() {
      return this.dim;
   }

   @JsonProperty("brandIds")
   public void setBrandIds(List<String> brandIds) {
      this.brandIds = brandIds;
   }

   @JsonProperty("brandIds")
   public List<String> getBrandIds() {
      return this.brandIds;
   }
}
