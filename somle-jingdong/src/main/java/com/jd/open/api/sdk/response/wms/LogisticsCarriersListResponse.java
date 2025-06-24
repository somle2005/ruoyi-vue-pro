package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class LogisticsCarriersListResponse extends AbstractResponse {
   private List<CarriersDetail> carriersDetails;

   @JsonProperty("carriers_details")
   public void setCarriersDetails(List<CarriersDetail> carriersDetails) {
      this.carriersDetails = carriersDetails;
   }

   @JsonProperty("carriers_details")
   public List<CarriersDetail> getCarriersDetails() {
      return this.carriersDetails;
   }
}
