package com.jd.open.api.sdk.response.plgz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.plgz.BrandOperateIsvFacade.response.queryOperateBrandPage.DataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerQuaCenterBrandOperateIsvFacadeQueryOperateBrandPageResponse extends AbstractResponse {
   private DataResult dataResult;

   @JsonProperty("dataResult")
   public void setDataResult(DataResult dataResult) {
      this.dataResult = dataResult;
   }

   @JsonProperty("dataResult")
   public DataResult getDataResult() {
      return this.dataResult;
   }
}
