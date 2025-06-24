package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PreConditionDTO implements Serializable {
   private String needMoney;
   private String addMoney;
   private Integer needNum;

   @JsonProperty("needMoney")
   public void setNeedMoney(String needMoney) {
      this.needMoney = needMoney;
   }

   @JsonProperty("needMoney")
   public String getNeedMoney() {
      return this.needMoney;
   }

   @JsonProperty("addMoney")
   public void setAddMoney(String addMoney) {
      this.addMoney = addMoney;
   }

   @JsonProperty("addMoney")
   public String getAddMoney() {
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
