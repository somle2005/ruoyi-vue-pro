package com.jd.open.api.sdk.domain.hudong.AssetReadService.response.findAccountBalance;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AccountBalance implements Serializable {
   private Integer quantityBalance;
   private Integer giftPrizeType;

   @JsonProperty("quantityBalance")
   public void setQuantityBalance(Integer quantityBalance) {
      this.quantityBalance = quantityBalance;
   }

   @JsonProperty("quantityBalance")
   public Integer getQuantityBalance() {
      return this.quantityBalance;
   }

   @JsonProperty("giftPrizeType")
   public void setGiftPrizeType(Integer giftPrizeType) {
      this.giftPrizeType = giftPrizeType;
   }

   @JsonProperty("giftPrizeType")
   public Integer getGiftPrizeType() {
      return this.giftPrizeType;
   }
}
