package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get.JosPurchaseOrderDetailProResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiPoDetailProGetResponse extends AbstractResponse {
   private JosPurchaseOrderDetailProResultDTO purchaseOrderDetailProResultDTO;

   @JsonProperty("purchaseOrderDetailProResultDTO")
   public void setPurchaseOrderDetailProResultDTO(JosPurchaseOrderDetailProResultDTO purchaseOrderDetailProResultDTO) {
      this.purchaseOrderDetailProResultDTO = purchaseOrderDetailProResultDTO;
   }

   @JsonProperty("purchaseOrderDetailProResultDTO")
   public JosPurchaseOrderDetailProResultDTO getPurchaseOrderDetailProResultDTO() {
      return this.purchaseOrderDetailProResultDTO;
   }
}
