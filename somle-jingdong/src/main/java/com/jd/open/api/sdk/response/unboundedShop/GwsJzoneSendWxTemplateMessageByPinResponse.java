package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.JzoneMedicineJsfService.response.sendWxTemplateMessageByPin.ResultData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GwsJzoneSendWxTemplateMessageByPinResponse extends AbstractResponse {
   private ResultData returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResultData returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResultData getReturnType() {
      return this.returnType;
   }
}
