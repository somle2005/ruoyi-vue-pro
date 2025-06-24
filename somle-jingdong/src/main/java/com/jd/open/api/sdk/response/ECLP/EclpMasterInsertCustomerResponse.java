package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterInsertCustomerResponse extends AbstractResponse {
   private String customerNo;

   @JsonProperty("customerNo")
   public void setCustomerNo(String customerNo) {
      this.customerNo = customerNo;
   }

   @JsonProperty("customerNo")
   public String getCustomerNo() {
      return this.customerNo;
   }
}
