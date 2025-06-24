package com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryCouponListByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class BearerMo implements Serializable {
   private String contributeParty;
   private BigDecimal money;

   @JsonProperty("contributeParty")
   public void setContributeParty(String contributeParty) {
      this.contributeParty = contributeParty;
   }

   @JsonProperty("contributeParty")
   public String getContributeParty() {
      return this.contributeParty;
   }

   @JsonProperty("money")
   public void setMoney(BigDecimal money) {
      this.money = money;
   }

   @JsonProperty("money")
   public BigDecimal getMoney() {
      return this.money;
   }
}
