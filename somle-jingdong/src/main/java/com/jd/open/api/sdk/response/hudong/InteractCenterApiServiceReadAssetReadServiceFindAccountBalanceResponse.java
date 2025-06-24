package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.AssetReadService.response.findAccountBalance.AccountBalance;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class InteractCenterApiServiceReadAssetReadServiceFindAccountBalanceResponse extends AbstractResponse {
   private List<AccountBalance> returnType;

   @JsonProperty("returnType")
   public void setReturnType(List<AccountBalance> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public List<AccountBalance> getReturnType() {
      return this.returnType;
   }
}
