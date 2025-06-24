package com.jd.open.api.sdk.domain.youE.BizProgressJsfService.response.getCustomerBookTimePage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CustomerBookTime implements Serializable {
   private String orderNo;
   private String lastBookDate;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("lastBookDate")
   public void setLastBookDate(String lastBookDate) {
      this.lastBookDate = lastBookDate;
   }

   @JsonProperty("lastBookDate")
   public String getLastBookDate() {
      return this.lastBookDate;
   }
}
