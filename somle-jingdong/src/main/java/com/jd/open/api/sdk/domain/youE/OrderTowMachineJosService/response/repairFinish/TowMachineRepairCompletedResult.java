package com.jd.open.api.sdk.domain.youE.OrderTowMachineJosService.response.repairFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TowMachineRepairCompletedResult implements Serializable {
   private String orderNo;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }
}
