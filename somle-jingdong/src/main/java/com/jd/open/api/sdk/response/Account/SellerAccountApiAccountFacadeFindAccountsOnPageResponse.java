package com.jd.open.api.sdk.response.Account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.Account.AccountFacade.response.findAccountsOnPage.Page;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerAccountApiAccountFacadeFindAccountsOnPageResponse extends AbstractResponse {
   private Page page;

   @JsonProperty("page")
   public void setPage(Page page) {
      this.page = page;
   }

   @JsonProperty("page")
   public Page getPage() {
      return this.page;
   }
}
