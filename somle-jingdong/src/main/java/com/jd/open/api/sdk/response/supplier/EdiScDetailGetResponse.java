package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ShipmentJosService.response.get.JosShipmentConfirmationDetailResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiScDetailGetResponse extends AbstractResponse {
   private JosShipmentConfirmationDetailResultDTO shipmentConfirmationDetailResultDTO;

   @JsonProperty("shipmentConfirmationDetailResultDTO")
   public void setShipmentConfirmationDetailResultDTO(JosShipmentConfirmationDetailResultDTO shipmentConfirmationDetailResultDTO) {
      this.shipmentConfirmationDetailResultDTO = shipmentConfirmationDetailResultDTO;
   }

   @JsonProperty("shipmentConfirmationDetailResultDTO")
   public JosShipmentConfirmationDetailResultDTO getShipmentConfirmationDetailResultDTO() {
      return this.shipmentConfirmationDetailResultDTO;
   }
}
