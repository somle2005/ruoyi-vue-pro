package com.jd.open.api.sdk.response.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.delivery.LogisticsCompanies;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DeliveryLogisticsGetResponse extends AbstractResponse {
   private static final long serialVersionUID = -8157517044392408319L;
   private LogisticsCompanies logisticsCompanies;

   public DeliveryLogisticsGetResponse() {
   }

   public DeliveryLogisticsGetResponse(LogisticsCompanies logisticsCompanies) {
      this.logisticsCompanies = logisticsCompanies;
   }

   @JsonProperty("logistics_companies")
   public LogisticsCompanies getLogisticsCompanies() {
      return this.logisticsCompanies;
   }

   @JsonProperty("logistics_companies")
   public void setLogisticsCompanies(LogisticsCompanies logisticsCompanies) {
      this.logisticsCompanies = logisticsCompanies;
   }
}
