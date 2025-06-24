package com.jd.open.api.sdk.response.jialilue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jialilue.IsvCouponWriteService.response.sendCoupon.IsvSendCouponRespDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JzoneSendCouponResponse extends AbstractResponse {
   private IsvSendCouponRespDTO returnType;

   @JsonProperty("returnType")
   public void setReturnType(IsvSendCouponRespDTO returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public IsvSendCouponRespDTO getReturnType() {
      return this.returnType;
   }
}
