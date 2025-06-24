package com.jd.open.api.sdk.domain.xny.EquipmentService.response.queryEquipmentsPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Boolean status;
   private TWQueryEquipmentsRpcResponse data;

   @JsonProperty("status")
   public void setStatus(Boolean status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Boolean getStatus() {
      return this.status;
   }

   @JsonProperty("data")
   public void setData(TWQueryEquipmentsRpcResponse data) {
      this.data = data;
   }

   @JsonProperty("data")
   public TWQueryEquipmentsRpcResponse getData() {
      return this.data;
   }
}
