package com.jd.open.api.sdk.domain.order.WaybillJosService.request.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosRequest implements Serializable {
   private WayBillInfoDto data;
   private Integer belongType;

   @JsonProperty("data")
   public void setData(WayBillInfoDto data) {
      this.data = data;
   }

   @JsonProperty("data")
   public WayBillInfoDto getData() {
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
