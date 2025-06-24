package com.jd.open.api.sdk.domain.supplier.WarePerformanceDataJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosWarePerformanceResultDTO implements Serializable {
   private List<WarePerformanceData> warePerformanceDatas;
   private boolean success;
   private String resultMessage;

   @JsonProperty("warePerformanceDatas")
   public void setWarePerformanceDatas(List<WarePerformanceData> warePerformanceDatas) {
      this.warePerformanceDatas = warePerformanceDatas;
   }

   @JsonProperty("warePerformanceDatas")
   public List<WarePerformanceData> getWarePerformanceDatas() {
      return this.warePerformanceDatas;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
