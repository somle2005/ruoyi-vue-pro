package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.BizProgressJsfService.response.noFinishBizProgress.ResultInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UeOrderNoFinishBizProgressResponse extends AbstractResponse {
   private ResultInfo returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResultInfo returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResultInfo getReturnType() {
      return this.returnType;
   }
}
