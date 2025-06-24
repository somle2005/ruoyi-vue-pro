package com.jd.open.api.sdk.response.hddy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hddy.AppleOrderJsfService.response.findListByParam.BaseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AppleOrderFindListByParamResponse extends AbstractResponse {
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
