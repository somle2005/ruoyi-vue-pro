package com.jd.open.api.sdk.response.jjfw;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jjfw.SiteService.response.appoint.ResultInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HomefwTaskAppointResponse extends AbstractResponse {
   private ResultInfo ResultInfo;

   @JsonProperty("ResultInfo")
   public void setResultInfo(ResultInfo ResultInfo) {
      this.ResultInfo = ResultInfo;
   }

   @JsonProperty("ResultInfo")
   public ResultInfo getResultInfo() {
      return this.ResultInfo;
   }
}
