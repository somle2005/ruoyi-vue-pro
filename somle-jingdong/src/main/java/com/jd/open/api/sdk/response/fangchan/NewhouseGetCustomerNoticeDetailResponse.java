package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.HouseJosCustomerCluePublishService.response.getCustomerNoticeDetail.HouseJosClueNoticeResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class NewhouseGetCustomerNoticeDetailResponse extends AbstractResponse {
   private HouseJosClueNoticeResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(HouseJosClueNoticeResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public HouseJosClueNoticeResponse getReturnType() {
      return this.returnType;
   }
}
