package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.evaluateB2BLwbFreightMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DetailFreightsDTO implements Serializable {
   private String[] code1;
   private String[] name;
   private Double[] amount;

   @JsonProperty("code1")
   public void setCode1(String[] code1) {
      this.code1 = code1;
   }

   @JsonProperty("code1")
   public String[] getCode1() {
      return this.code1;
   }

   @JsonProperty("name")
   public void setName(String[] name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String[] getName() {
      return this.name;
   }

   @JsonProperty("amount")
   public void setAmount(Double[] amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public Double[] getAmount() {
      return this.amount;
   }
}
