package com.jd.open.api.sdk.response.Account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.Account.VenderAccountSafService.response.query.VenderAccountRoleResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderChildaccountRoleQueryResponse extends AbstractResponse {
   private VenderAccountRoleResult accountRoleResult;

   @JsonProperty("account_role_result")
   public void setAccountRoleResult(VenderAccountRoleResult accountRoleResult) {
      this.accountRoleResult = accountRoleResult;
   }

   @JsonProperty("account_role_result")
   public VenderAccountRoleResult getAccountRoleResult() {
      return this.accountRoleResult;
   }
}
