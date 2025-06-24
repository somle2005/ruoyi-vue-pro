package com.jd.open.api.sdk.domain.plgz.BrandCategoryCheckIsvFacade.response.batchCheckBrandCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CheckResultDto implements Serializable {
   private Boolean passed;
   private List<BrandCategoryCheckDto> brandCategoryCheckDtoList;

   @JsonProperty("passed")
   public void setPassed(Boolean passed) {
      this.passed = passed;
   }

   @JsonProperty("passed")
   public Boolean getPassed() {
      return this.passed;
   }

   @JsonProperty("brandCategoryCheckDtoList")
   public void setBrandCategoryCheckDtoList(List<BrandCategoryCheckDto> brandCategoryCheckDtoList) {
      this.brandCategoryCheckDtoList = brandCategoryCheckDtoList;
   }

   @JsonProperty("brandCategoryCheckDtoList")
   public List<BrandCategoryCheckDto> getBrandCategoryCheckDtoList() {
      return this.brandCategoryCheckDtoList;
   }
}
