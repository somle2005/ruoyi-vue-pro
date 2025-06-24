package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.CustomerOrderJosService.response.search.CustomerOrderDTO;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EdiSdvCustomerOrderSearchResponse extends AbstractResponse {
   private List<CustomerOrderDTO> customerOrders;

   @JsonProperty("customerOrders")
   public void setCustomerOrders(List<CustomerOrderDTO> customerOrders) {
      this.customerOrders = customerOrders;
   }

   @JsonProperty("customerOrders")
   public List<CustomerOrderDTO> getCustomerOrders() {
      return this.customerOrders;
   }
}
