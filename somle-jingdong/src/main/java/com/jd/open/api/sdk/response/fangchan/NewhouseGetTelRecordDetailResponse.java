package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.HouseJosCustomerCluePublishService.response.getTelRecordDetail.HouseJosClue400Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class NewhouseGetTelRecordDetailResponse extends AbstractResponse {
   private HouseJosClue400Response returnType;

   @JsonProperty("returnType")
   public void setReturnType(HouseJosClue400Response returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public HouseJosClue400Response getReturnType() {
      return this.returnType;
   }
}
