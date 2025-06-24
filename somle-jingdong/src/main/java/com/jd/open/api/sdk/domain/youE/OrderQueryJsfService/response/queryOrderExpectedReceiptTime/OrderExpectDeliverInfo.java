package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryOrderExpectedReceiptTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderExpectDeliverInfo implements Serializable {
   private String orderNo;
   private String expectDeliverDate;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("expectDeliverDate")
   public void setExpectDeliverDate(String expectDeliverDate) {
      this.expectDeliverDate = expectDeliverDate;
   }

   @JsonProperty("expectDeliverDate")
   public String getExpectDeliverDate() {
      return this.expectDeliverDate;
   }
}
