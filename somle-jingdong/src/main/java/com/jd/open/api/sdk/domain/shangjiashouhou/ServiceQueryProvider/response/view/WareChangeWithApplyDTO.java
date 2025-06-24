package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class WareChangeWithApplyDTO implements Serializable {
   private Long changeWareSku;
   private String changeWareName;
   private BigDecimal changeWarePrice;

   @JsonProperty("changeWareSku")
   public void setChangeWareSku(Long changeWareSku) {
      this.changeWareSku = changeWareSku;
   }

   @JsonProperty("changeWareSku")
   public Long getChangeWareSku() {
      return this.changeWareSku;
   }

   @JsonProperty("changeWareName")
   public void setChangeWareName(String changeWareName) {
      this.changeWareName = changeWareName;
   }

   @JsonProperty("changeWareName")
   public String getChangeWareName() {
      return this.changeWareName;
   }

   @JsonProperty("changeWarePrice")
   public void setChangeWarePrice(BigDecimal changeWarePrice) {
      this.changeWarePrice = changeWarePrice;
   }

   @JsonProperty("changeWarePrice")
   public BigDecimal getChangeWarePrice() {
      return this.changeWarePrice;
   }
}
