package com.jd.open.api.sdk.domain.supplier.PoCommonForJosWebService.response.getwaredeliverdistinctlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WarehouseDto implements Serializable {
   private int deliverCenterId;
   private String deliverCenterName;

   @JsonProperty("deliver_center_id")
   public void setDeliverCenterId(int deliverCenterId) {
      this.deliverCenterId = deliverCenterId;
   }

   @JsonProperty("deliver_center_id")
   public int getDeliverCenterId() {
      return this.deliverCenterId;
   }

   @JsonProperty("deliver_center_name")
   public void setDeliverCenterName(String deliverCenterName) {
      this.deliverCenterName = deliverCenterName;
   }

   @JsonProperty("deliver_center_name")
   public String getDeliverCenterName() {
      return this.deliverCenterName;
   }
}
