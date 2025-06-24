package com.jd.open.api.sdk.domain.xny.EquipmentService.response.queryEquipmentsPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TWQueryEquipmentsRpcResponse implements Serializable {
   private List<TWEquipmentListDTO> equipmentList;

   @JsonProperty("equipmentList")
   public void setEquipmentList(List<TWEquipmentListDTO> equipmentList) {
      this.equipmentList = equipmentList;
   }

   @JsonProperty("equipmentList")
   public List<TWEquipmentListDTO> getEquipmentList() {
      return this.equipmentList;
   }
}
