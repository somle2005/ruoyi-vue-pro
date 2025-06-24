package com.jd.open.api.sdk.domain.youE.BizProgressJsfService.response.dispatchOrder2Engineer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BizProgress implements Serializable {
   private String orderNo;
   private Integer state;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }
}
