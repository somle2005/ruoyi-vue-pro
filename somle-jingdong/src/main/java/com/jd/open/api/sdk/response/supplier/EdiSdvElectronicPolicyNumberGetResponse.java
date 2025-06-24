package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiSdvElectronicPolicyNumberGetResponse extends AbstractResponse {
   private int orderNumber;

   @JsonProperty("orderNumber")
   public void setOrderNumber(int orderNumber) {
      this.orderNumber = orderNumber;
   }

   @JsonProperty("orderNumber")
   public int getOrderNumber() {
      return this.orderNumber;
   }
}
