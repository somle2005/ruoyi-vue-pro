package com.jd.open.api.sdk.response.gongzhonghao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gongzhonghao.JzoneJosService.response.pushCoupon.ResultData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JzonePushCouponResponse extends AbstractResponse {
   private ResultData resultData;

   @JsonProperty("resultData")
   public void setResultData(ResultData resultData) {
      this.resultData = resultData;
   }

   @JsonProperty("resultData")
   public ResultData getResultData() {
      return this.resultData;
   }
}
