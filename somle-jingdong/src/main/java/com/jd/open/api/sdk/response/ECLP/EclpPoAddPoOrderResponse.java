package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpPoAddPoOrderResponse extends AbstractResponse {
   private String poOrderNo;

   @JsonProperty("poOrderNo")
   public void setPoOrderNo(String poOrderNo) {
      this.poOrderNo = poOrderNo;
   }

   @JsonProperty("poOrderNo")
   public String getPoOrderNo() {
      return this.poOrderNo;
   }
}
