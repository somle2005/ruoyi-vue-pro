package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.OrderInfoOperateSaf.response.update.OrderInfoOperateResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EtmsPackageUpdateResponse extends AbstractResponse {
   private OrderInfoOperateResponse response;

   @JsonProperty("response")
   public void setResponse(OrderInfoOperateResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public OrderInfoOperateResponse getResponse() {
      return this.response;
   }
}
