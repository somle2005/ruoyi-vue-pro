package com.jd.open.api.sdk.response.jddingzhi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jddingzhi.CustomOrderInfoOpenService.response.post.OpenAiDataReceiveResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DingzhiSuitAidataPostResponse extends AbstractResponse {
   private OpenAiDataReceiveResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(OpenAiDataReceiveResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public OpenAiDataReceiveResultEntity getReturnType() {
      return this.returnType;
   }
}
