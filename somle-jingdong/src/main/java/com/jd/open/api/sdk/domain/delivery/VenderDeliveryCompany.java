package com.jd.open.api.sdk.domain.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class VenderDeliveryCompany {
   private long venderId;
   private List<DeliveryCompany> deliveryCompanies;

   @JsonProperty("vender_id")
   public long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("delivery_companies")
   public List<DeliveryCompany> getDeliveryCompanies() {
      return this.deliveryCompanies;
   }

   @JsonProperty("delivery_companies")
   public void setDeliveryCompanies(List<DeliveryCompany> deliveryCompanies) {
      this.deliveryCompanies = deliveryCompanies;
   }
}
