package com.jd.open.api.sdk.response.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.delivery.DeliveryCompany;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class GetVenderAllDeliveryCompanyResponse extends AbstractResponse {
   private static final long serialVersionUID = -9069393802737193803L;
   private long venderId;
   private List<DeliveryCompany> deliveryList;

   public GetVenderAllDeliveryCompanyResponse() {
   }

   public GetVenderAllDeliveryCompanyResponse(List<DeliveryCompany> listCompany, long vendId) {
      this.venderId = vendId;
      this.deliveryList = listCompany;
   }

   @JsonProperty("delivery_companies")
   public List<DeliveryCompany> getDeliveryList() {
      return this.deliveryList;
   }

   @JsonProperty("delivery_companies")
   public void setDeliveryList(List<DeliveryCompany> deliveryList) {
      this.deliveryList = deliveryList;
   }

   @JsonProperty("vender_id")
   public long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(long venderId) {
      this.venderId = venderId;
   }
}
