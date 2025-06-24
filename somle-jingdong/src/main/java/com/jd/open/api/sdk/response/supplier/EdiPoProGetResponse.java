package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get.JosPurchaseOrderProResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiPoProGetResponse extends AbstractResponse {
   private JosPurchaseOrderProResultDTO purchaseOrderProResultDTO;

   @JsonProperty("purchaseOrderProResultDTO")
   public void setPurchaseOrderProResultDTO(JosPurchaseOrderProResultDTO purchaseOrderProResultDTO) {
      this.purchaseOrderProResultDTO = purchaseOrderProResultDTO;
   }

   @JsonProperty("purchaseOrderProResultDTO")
   public JosPurchaseOrderProResultDTO getPurchaseOrderProResultDTO() {
      return this.purchaseOrderProResultDTO;
   }
}
