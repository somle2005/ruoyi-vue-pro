package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.RentPlotSaasService.response.listPlotInfo.PlotInfoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class NbhouseRentListPlotInfoResponse extends AbstractResponse {
   private PlotInfoResult listplotinfoResult;

   @JsonProperty("listplotinfo_result")
   public void setListplotinfoResult(PlotInfoResult listplotinfoResult) {
      this.listplotinfoResult = listplotinfoResult;
   }

   @JsonProperty("listplotinfo_result")
   public PlotInfoResult getListplotinfoResult() {
      return this.listplotinfoResult;
   }
}
