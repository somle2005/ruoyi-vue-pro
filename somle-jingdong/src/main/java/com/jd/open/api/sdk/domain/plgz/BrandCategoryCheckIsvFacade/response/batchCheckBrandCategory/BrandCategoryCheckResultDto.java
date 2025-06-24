package com.jd.open.api.sdk.domain.plgz.BrandCategoryCheckIsvFacade.response.batchCheckBrandCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BrandCategoryCheckResultDto implements Serializable {
   private BrandCategoryIdDto brandCategoryId;
   private DataResult checkResult;

   @JsonProperty("brandCategoryId")
   public void setBrandCategoryId(BrandCategoryIdDto brandCategoryId) {
      this.brandCategoryId = brandCategoryId;
   }

   @JsonProperty("brandCategoryId")
   public BrandCategoryIdDto getBrandCategoryId() {
      return this.brandCategoryId;
   }

   @JsonProperty("checkResult")
   public void setCheckResult(DataResult checkResult) {
      this.checkResult = checkResult;
   }

   @JsonProperty("checkResult")
   public DataResult getCheckResult() {
      return this.checkResult;
   }
}
