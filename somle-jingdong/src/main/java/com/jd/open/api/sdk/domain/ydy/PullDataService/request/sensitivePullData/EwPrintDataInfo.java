package com.jd.open.api.sdk.domain.ydy.PullDataService.request.sensitivePullData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class EwPrintDataInfo implements Serializable {
   private String orderNo;
   private String ewPrintData;
   private String wayBillNo;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("ewPrintData")
   public void setEwPrintData(String ewPrintData) {
      this.ewPrintData = ewPrintData;
   }

   @JsonProperty("ewPrintData")
   public String getEwPrintData() {
      return this.ewPrintData;
   }

   @JsonProperty("wayBillNo")
   public void setWayBillNo(String wayBillNo) {
      this.wayBillNo = wayBillNo;
   }

   @JsonProperty("wayBillNo")
   public String getWayBillNo() {
      return this.wayBillNo;
   }
}
