package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.UserBehaviorService.response.getUserClickSku.SkuBehavior;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class MarketBdpUserBehaviorGetUserClickSkuResponse extends AbstractResponse {
   private List<SkuBehavior> returnType;

   @JsonProperty("returnType")
   public void setReturnType(List<SkuBehavior> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public List<SkuBehavior> getReturnType() {
      return this.returnType;
   }
}
