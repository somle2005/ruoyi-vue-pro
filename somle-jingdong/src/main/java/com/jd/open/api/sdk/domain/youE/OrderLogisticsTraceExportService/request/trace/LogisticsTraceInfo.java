package com.jd.open.api.sdk.domain.youE.OrderLogisticsTraceExportService.request.trace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LogisticsTraceInfo implements Serializable {
   private String traceDesc;
   private String operateTime;
   private String logisticsNo;

   @JsonProperty("traceDesc")
   public void setTraceDesc(String traceDesc) {
      this.traceDesc = traceDesc;
   }

   @JsonProperty("traceDesc")
   public String getTraceDesc() {
      return this.traceDesc;
   }

   @JsonProperty("operateTime")
   public void setOperateTime(String operateTime) {
      this.operateTime = operateTime;
   }

   @JsonProperty("operateTime")
   public String getOperateTime() {
      return this.operateTime;
   }

   @JsonProperty("logisticsNo")
   public void setLogisticsNo(String logisticsNo) {
      this.logisticsNo = logisticsNo;
   }

   @JsonProperty("logisticsNo")
   public String getLogisticsNo() {
      return this.logisticsNo;
   }
}
