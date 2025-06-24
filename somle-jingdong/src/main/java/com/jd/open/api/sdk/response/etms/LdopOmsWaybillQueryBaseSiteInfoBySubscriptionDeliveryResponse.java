package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.BaseSiteQueryApi.response.queryBaseSiteInfoBySubscriptionDelivery.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopOmsWaybillQueryBaseSiteInfoBySubscriptionDeliveryResponse extends AbstractResponse {
   private ResponseDTO returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResponseDTO returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResponseDTO getReturnType() {
      return this.returnType;
   }
}
