package com.jd.open.api.sdk.response.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.request.delivery.AddVenderDeliveryCompanyRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AddVenderDeliveryCompanyResponse extends AbstractResponse {
   private static final long serialVersionUID = -9069393802737193803L;
   public long venderId;
   public AddVenderDeliveryCompanyRequest addVenderDeliveryCompanyReq;

   public AddVenderDeliveryCompanyResponse() {
   }

   public AddVenderDeliveryCompanyResponse(AddVenderDeliveryCompanyRequest addVenderDeliveryCompanyRequest) {
      this.addVenderDeliveryCompanyReq = addVenderDeliveryCompanyRequest;
   }

   @JsonProperty("vender_id")
   public long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("delivery_company")
   public AddVenderDeliveryCompanyRequest getAddVenderDeliveryCompanyReq() {
      return this.addVenderDeliveryCompanyReq;
   }

   @JsonProperty("delivery_company")
   public void setAddVenderDeliveryCompanyReq(AddVenderDeliveryCompanyRequest addVenderDeliveryCompanyReq) {
      this.addVenderDeliveryCompanyReq = addVenderDeliveryCompanyReq;
   }
}
