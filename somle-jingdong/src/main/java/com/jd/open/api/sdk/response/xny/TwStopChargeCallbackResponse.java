package com.jd.open.api.sdk.response.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.TwoWheelCallbackService.response.callback.TwoWheelLvChongChongEndChargeNotifyResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class TwStopChargeCallbackResponse extends AbstractResponse {
   private TwoWheelLvChongChongEndChargeNotifyResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(TwoWheelLvChongChongEndChargeNotifyResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public TwoWheelLvChongChongEndChargeNotifyResponse getReturnType() {
      return this.returnType;
   }
}
