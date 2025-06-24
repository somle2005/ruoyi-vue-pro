package com.jd.open.api.sdk.domain.youE.BizOrderJxfwJsfService.response.getAdditionalInformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderSupplyInfoVo implements Serializable {
   private String orderNo;
   private String supplyInfo;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("supplyInfo")
   public void setSupplyInfo(String supplyInfo) {
      this.supplyInfo = supplyInfo;
   }

   @JsonProperty("supplyInfo")
   public String getSupplyInfo() {
      return this.supplyInfo;
   }
}
