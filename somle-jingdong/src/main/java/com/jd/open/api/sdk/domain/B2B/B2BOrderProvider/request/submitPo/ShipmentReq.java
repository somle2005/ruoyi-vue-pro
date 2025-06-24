package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ShipmentReq implements Serializable {
   private Date shipmentDate;
   private Integer shipmentType;

   @JsonProperty("shipmentDate")
   public void setShipmentDate(Date shipmentDate) {
      this.shipmentDate = shipmentDate;
   }

   @JsonProperty("shipmentDate")
   public Date getShipmentDate() {
      return this.shipmentDate;
   }

   @JsonProperty("shipmentType")
   public void setShipmentType(Integer shipmentType) {
      this.shipmentType = shipmentType;
   }

   @JsonProperty("shipmentType")
   public Integer getShipmentType() {
      return this.shipmentType;
   }
}
