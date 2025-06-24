package com.jd.open.api.sdk.domain.order.OutShipJosService.request.judge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosRequest implements Serializable {
   private PartialShipmentQuery data;
   private Integer belongType;

   @JsonProperty("data")
   public void setData(PartialShipmentQuery data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PartialShipmentQuery getData() {
      return this.data;
   }

   @JsonProperty("belongType")
   public void setBelongType(Integer belongType) {
      this.belongType = belongType;
   }

   @JsonProperty("belongType")
   public Integer getBelongType() {
      return this.belongType;
   }
}
