package com.jd.open.api.sdk.domain.user.CrmCustomerService.response.getMemberInVender;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CommonResult implements Serializable {
   private CustomerInfoEs customerInfoEs;

   @JsonProperty("customerInfoEs")
   public void setCustomerInfoEs(CustomerInfoEs customerInfoEs) {
      this.customerInfoEs = customerInfoEs;
   }

   @JsonProperty("customerInfoEs")
   public CustomerInfoEs getCustomerInfoEs() {
      return this.customerInfoEs;
   }
}
