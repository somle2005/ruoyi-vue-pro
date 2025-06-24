package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.response.queryOrderLogisticsStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class LogisticsStatusResult implements Serializable {
   private List<LogisticsStatusInfo> logisticsStatusInfoList;

   @JsonProperty("logisticsStatusInfoList")
   public void setLogisticsStatusInfoList(List<LogisticsStatusInfo> logisticsStatusInfoList) {
      this.logisticsStatusInfoList = logisticsStatusInfoList;
   }

   @JsonProperty("logisticsStatusInfoList")
   public List<LogisticsStatusInfo> getLogisticsStatusInfoList() {
      return this.logisticsStatusInfoList;
   }
}
