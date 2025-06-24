package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get.JosPurchaseOrderDetailResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiPoDetailGetResponse extends AbstractResponse {
   private JosPurchaseOrderDetailResultDTO purchaseOrderDetailResultDTO;

   @JsonProperty("purchaseOrderDetailResultDTO")
   public void setPurchaseOrderDetailResultDTO(JosPurchaseOrderDetailResultDTO purchaseOrderDetailResultDTO) {
      this.purchaseOrderDetailResultDTO = purchaseOrderDetailResultDTO;
   }

   @JsonProperty("purchaseOrderDetailResultDTO")
   public JosPurchaseOrderDetailResultDTO getPurchaseOrderDetailResultDTO() {
      return this.purchaseOrderDetailResultDTO;
   }
}
