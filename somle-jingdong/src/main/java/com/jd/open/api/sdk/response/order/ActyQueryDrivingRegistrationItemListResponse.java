package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.DrivingInfoService.response.queryDrivingRegistrationItemList.DrivingResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ActyQueryDrivingRegistrationItemListResponse extends AbstractResponse {
   private DrivingResult querydrivingregistrationdatacountResult;

   @JsonProperty("querydrivingregistrationdatacount_result")
   public void setQuerydrivingregistrationdatacountResult(DrivingResult querydrivingregistrationdatacountResult) {
      this.querydrivingregistrationdatacountResult = querydrivingregistrationdatacountResult;
   }

   @JsonProperty("querydrivingregistrationdatacount_result")
   public DrivingResult getQuerydrivingregistrationdatacountResult() {
      return this.querydrivingregistrationdatacountResult;
   }
}
