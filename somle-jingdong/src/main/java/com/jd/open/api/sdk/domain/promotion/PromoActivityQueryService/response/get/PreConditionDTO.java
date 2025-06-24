package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PreConditionDTO implements Serializable {
   private BigDecimal needMoney;
   private BigDecimal addMoney;
   private Integer needNum;

   @JsonProperty("needMoney")
   public void setNeedMoney(BigDecimal needMoney) {
      this.needMoney = needMoney;
   }

   @JsonProperty("needMoney")
   public BigDecimal getNeedMoney() {
      return this.needMoney;
   }

   @JsonProperty("addMoney")
   public void setAddMoney(BigDecimal addMoney) {
      this.addMoney = addMoney;
   }

   @JsonProperty("addMoney")
   public BigDecimal getAddMoney() {
      return this.addMoney;
   }

   @JsonProperty("needNum")
   public void setNeedNum(Integer needNum) {
      this.needNum = needNum;
   }

   @JsonProperty("needNum")
   public Integer getNeedNum() {
      return this.needNum;
   }
}
