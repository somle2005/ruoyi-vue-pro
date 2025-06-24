package com.jd.open.api.sdk.response.Account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.Account.VenderAccountSafService.response.query.VenderAccountResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderChildAccountQueryResponse extends AbstractResponse {
   private VenderAccountResult childAccountResult;

   @JsonProperty("child_account_result")
   public void setChildAccountResult(VenderAccountResult childAccountResult) {
      this.childAccountResult = childAccountResult;
   }

   @JsonProperty("child_account_result")
   public VenderAccountResult getChildAccountResult() {
      return this.childAccountResult;
   }
}
