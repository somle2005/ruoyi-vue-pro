package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.RentPhoneSaasService.response.addHotLine.RentHotLineSassResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class NbhouseRentAddHotLineResponse extends AbstractResponse {
   private RentHotLineSassResult addhotlinesaasResult;

   @JsonProperty("addhotlinesaas_result")
   public void setAddhotlinesaasResult(RentHotLineSassResult addhotlinesaasResult) {
      this.addhotlinesaasResult = addhotlinesaasResult;
   }

   @JsonProperty("addhotlinesaas_result")
   public RentHotLineSassResult getAddhotlinesaasResult() {
      return this.addhotlinesaasResult;
   }
}
