package com.jd.open.api.sdk.domain.order.OutShipJosService.response.judge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PartialShipmentDto implements Serializable {
   private List<PartialShipmentItemDto> partialShipmentItemList;

   @JsonProperty("partialShipmentItemList")
   public void setPartialShipmentItemList(List<PartialShipmentItemDto> partialShipmentItemList) {
      this.partialShipmentItemList = partialShipmentItemList;
   }

   @JsonProperty("partialShipmentItemList")
   public List<PartialShipmentItemDto> getPartialShipmentItemList() {
      return this.partialShipmentItemList;
   }
}
