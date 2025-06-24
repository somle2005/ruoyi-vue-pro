package com.jd.open.api.sdk.domain.Account.VenderAccountSafService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderAccountPermCodeContent implements Serializable {
   private String[] accountName;
   private String[] codes;

   @JsonProperty("account_name")
   public void setAccountName(String[] accountName) {
      this.accountName = accountName;
   }

   @JsonProperty("account_name")
   public String[] getAccountName() {
      return this.accountName;
   }

   @JsonProperty("codes")
   public void setCodes(String[] codes) {
      this.codes = codes;
   }

   @JsonProperty("codes")
   public String[] getCodes() {
      return this.codes;
   }
}
