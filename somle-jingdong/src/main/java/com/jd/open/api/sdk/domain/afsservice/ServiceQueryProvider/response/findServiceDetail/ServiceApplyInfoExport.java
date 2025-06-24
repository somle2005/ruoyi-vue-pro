package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceApplyInfoExport implements Serializable {
   private Integer expectPickwareType;
   private Integer customerExpect;

   @JsonProperty("expectPickwareType")
   public void setExpectPickwareType(Integer expectPickwareType) {
      this.expectPickwareType = expectPickwareType;
   }

   @JsonProperty("expectPickwareType")
   public Integer getExpectPickwareType() {
      return this.expectPickwareType;
   }

   @JsonProperty("customerExpect")
   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   @JsonProperty("customerExpect")
   public Integer getCustomerExpect() {
      return this.customerExpect;
   }
}
