package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.response.batchquery.BaseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DigitalSubsidyOrderImgBatchqueryResponse extends AbstractResponse {
   private BaseResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(BaseResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public BaseResult getReturnType() {
      return this.returnType;
   }
}
