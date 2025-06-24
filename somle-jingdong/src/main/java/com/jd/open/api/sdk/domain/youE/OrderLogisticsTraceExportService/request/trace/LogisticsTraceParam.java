package com.jd.open.api.sdk.domain.youE.OrderLogisticsTraceExportService.request.trace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class LogisticsTraceParam implements Serializable {
   private String orderNo;
   private List<LogisticsTraceInfo> logisticsTraceInfoList;
   private String remark;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("logisticsTraceInfoList")
   public void setLogisticsTraceInfoList(List<LogisticsTraceInfo> logisticsTraceInfoList) {
      this.logisticsTraceInfoList = logisticsTraceInfoList;
   }

   @JsonProperty("logisticsTraceInfoList")
   public List<LogisticsTraceInfo> getLogisticsTraceInfoList() {
      return this.logisticsTraceInfoList;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }
}
