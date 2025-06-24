package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.HouseJosCustomerCluePublishService.response.getHouseXjkDetail.HouseJosXjkClueResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class NewhouseGetHouseXjkDetailResponse extends AbstractResponse {
   private HouseJosXjkClueResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(HouseJosXjkClueResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public HouseJosXjkClueResponse getReturnType() {
      return this.returnType;
   }
}
