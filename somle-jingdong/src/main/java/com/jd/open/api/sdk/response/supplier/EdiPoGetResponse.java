package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get.JosPurchaseOrderResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiPoGetResponse extends AbstractResponse {
   private JosPurchaseOrderResultDTO purchaseOrderResultDTO;

   @JsonProperty("purchaseOrderResultDTO")
   public void setPurchaseOrderResultDTO(JosPurchaseOrderResultDTO purchaseOrderResultDTO) {
      this.purchaseOrderResultDTO = purchaseOrderResultDTO;
   }

   @JsonProperty("purchaseOrderResultDTO")
   public JosPurchaseOrderResultDTO getPurchaseOrderResultDTO() {
      return this.purchaseOrderResultDTO;
   }
}
