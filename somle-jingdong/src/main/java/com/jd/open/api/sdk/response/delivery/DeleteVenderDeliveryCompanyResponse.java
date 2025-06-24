package com.jd.open.api.sdk.response.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.request.delivery.DeleteVenderDeliveryCompanyRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DeleteVenderDeliveryCompanyResponse extends AbstractResponse {
   private static final long serialVersionUID = -9069393802737193803L;
   public long venderId;
   public DeleteVenderDeliveryCompanyRequest deleteVenderDeliveryCompanyReq;

   public DeleteVenderDeliveryCompanyResponse() {
   }

   public DeleteVenderDeliveryCompanyResponse(DeleteVenderDeliveryCompanyRequest deleteVenderDeliveryCompanyRequest) {
      this.deleteVenderDeliveryCompanyReq = deleteVenderDeliveryCompanyRequest;
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
   public DeleteVenderDeliveryCompanyRequest getDeleteVenderDeliveryCompanyReq() {
      return this.deleteVenderDeliveryCompanyReq;
   }

   @JsonProperty("delivery_company")
   public void setDeleteVenderDeliveryCompanyReq(DeleteVenderDeliveryCompanyRequest deleteVenderDeliveryCompanyReq) {
      this.deleteVenderDeliveryCompanyReq = deleteVenderDeliveryCompanyReq;
   }
}
