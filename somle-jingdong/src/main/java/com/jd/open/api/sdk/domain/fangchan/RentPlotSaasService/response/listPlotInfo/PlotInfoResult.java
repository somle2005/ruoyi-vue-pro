package com.jd.open.api.sdk.domain.fangchan.RentPlotSaasService.response.listPlotInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PlotInfoResult implements Serializable {
   private String code;
   private List<PlotInfoSaasVO> plotInfoList;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("plotInfoList")
   public void setPlotInfoList(List<PlotInfoSaasVO> plotInfoList) {
      this.plotInfoList = plotInfoList;
   }

   @JsonProperty("plotInfoList")
   public List<PlotInfoSaasVO> getPlotInfoList() {
      return this.plotInfoList;
   }
}
