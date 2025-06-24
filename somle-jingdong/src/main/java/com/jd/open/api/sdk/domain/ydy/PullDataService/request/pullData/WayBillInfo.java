package com.jd.open.api.sdk.domain.ydy.PullDataService.request.pullData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WayBillInfo implements Serializable {
   private String orderNo;
   private Integer popFlag;
   private String wayBillCode;
   private String jdWayBillCode;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("popFlag")
   public void setPopFlag(Integer popFlag) {
      this.popFlag = popFlag;
   }

   @JsonProperty("popFlag")
   public Integer getPopFlag() {
      return this.popFlag;
   }

   @JsonProperty("wayBillCode")
   public void setWayBillCode(String wayBillCode) {
      this.wayBillCode = wayBillCode;
   }

   @JsonProperty("wayBillCode")
   public String getWayBillCode() {
      return this.wayBillCode;
   }

   @JsonProperty("jdWayBillCode")
   public void setJdWayBillCode(String jdWayBillCode) {
      this.jdWayBillCode = jdWayBillCode;
   }

   @JsonProperty("jdWayBillCode")
   public String getJdWayBillCode() {
      return this.jdWayBillCode;
   }
}
