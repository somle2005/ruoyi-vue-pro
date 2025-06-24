package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.IOrderService.response.encryptMobileNum.ResponseData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderEncryptMobileNumResponse extends AbstractResponse {
   private ResponseData result;

   @JsonProperty("result")
   public void setResult(ResponseData result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseData getResult() {
      return this.result;
   }
}
