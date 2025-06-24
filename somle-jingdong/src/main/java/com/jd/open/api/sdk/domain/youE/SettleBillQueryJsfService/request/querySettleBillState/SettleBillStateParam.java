package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.request.querySettleBillState;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SettleBillStateParam implements Serializable {
   private String settleNo;

   @JsonProperty("settleNo")
   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   @JsonProperty("settleNo")
   public String getSettleNo() {
      return this.settleNo;
   }
}
