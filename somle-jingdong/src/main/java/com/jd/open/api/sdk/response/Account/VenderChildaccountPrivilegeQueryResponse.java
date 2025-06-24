package com.jd.open.api.sdk.response.Account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.Account.VenderAccountSafService.response.query.VenderAccountPermCodeResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderChildaccountPrivilegeQueryResponse extends AbstractResponse {
   private VenderAccountPermCodeResult accountPrivilegeResult;

   @JsonProperty("account_privilege_result")
   public void setAccountPrivilegeResult(VenderAccountPermCodeResult accountPrivilegeResult) {
      this.accountPrivilegeResult = accountPrivilegeResult;
   }

   @JsonProperty("account_privilege_result")
   public VenderAccountPermCodeResult getAccountPrivilegeResult() {
      return this.accountPrivilegeResult;
   }
}
