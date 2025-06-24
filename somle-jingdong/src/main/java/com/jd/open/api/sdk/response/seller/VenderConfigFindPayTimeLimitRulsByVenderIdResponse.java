package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.VenderConfigService.response.findPayTimeLimitRulsByVenderId.VenderPayTimeLimitRule;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class VenderConfigFindPayTimeLimitRulsByVenderIdResponse extends AbstractResponse {
   private List<VenderPayTimeLimitRule> returnType;

   @JsonProperty("returnType")
   public void setReturnType(List<VenderPayTimeLimitRule> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public List<VenderPayTimeLimitRule> getReturnType() {
      return this.returnType;
   }
}
