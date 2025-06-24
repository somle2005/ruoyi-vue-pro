package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class MarketBdpCartGetPinsBySkuIdResponse extends AbstractResponse {
   private List<String> returnType;

   @JsonProperty("returnType")
   public void setReturnType(List<String> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public List<String> getReturnType() {
      return this.returnType;
   }
}
