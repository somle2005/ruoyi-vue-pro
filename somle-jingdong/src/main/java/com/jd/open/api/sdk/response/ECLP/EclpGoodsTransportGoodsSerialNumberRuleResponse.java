package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpGoodsTransportGoodsSerialNumberRuleResponse extends AbstractResponse {
   private String snNo;

   @JsonProperty("snNo")
   public void setSnNo(String snNo) {
      this.snNo = snNo;
   }

   @JsonProperty("snNo")
   public String getSnNo() {
      return this.snNo;
   }
}
