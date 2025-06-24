package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoPageList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderBandLevel implements Serializable {
   private Integer customerType;

   @JsonProperty("customerType")
   public void setCustomerType(Integer customerType) {
      this.customerType = customerType;
   }

   @JsonProperty("customerType")
   public Integer getCustomerType() {
      return this.customerType;
   }
}
