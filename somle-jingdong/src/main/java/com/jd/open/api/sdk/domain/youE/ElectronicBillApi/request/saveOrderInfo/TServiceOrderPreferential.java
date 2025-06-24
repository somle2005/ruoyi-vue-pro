package com.jd.open.api.sdk.domain.youE.ElectronicBillApi.request.saveOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TServiceOrderPreferential implements Serializable {
   private BigDecimal singlePreferentialPrice;
   private String singlePreferentialName;

   @JsonProperty("singlePreferentialPrice")
   public void setSinglePreferentialPrice(BigDecimal singlePreferentialPrice) {
      this.singlePreferentialPrice = singlePreferentialPrice;
   }

   @JsonProperty("singlePreferentialPrice")
   public BigDecimal getSinglePreferentialPrice() {
      return this.singlePreferentialPrice;
   }

   @JsonProperty("singlePreferentialName")
   public void setSinglePreferentialName(String singlePreferentialName) {
      this.singlePreferentialName = singlePreferentialName;
   }

   @JsonProperty("singlePreferentialName")
   public String getSinglePreferentialName() {
      return this.singlePreferentialName;
   }
}
