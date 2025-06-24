package com.jd.open.api.sdk.domain.xny.EquipmentService.request.queryEquipmentDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TWEquipmentsDetailRpcRequest implements Serializable {
   private Long jdVenderId;
   private String communityId;
   private String equipmentId;
   private String source;

   @JsonProperty("jdVenderId")
   public void setJdVenderId(Long jdVenderId) {
      this.jdVenderId = jdVenderId;
   }

   @JsonProperty("jdVenderId")
   public Long getJdVenderId() {
      return this.jdVenderId;
   }

   @JsonProperty("communityId")
   public void setCommunityId(String communityId) {
      this.communityId = communityId;
   }

   @JsonProperty("communityId")
   public String getCommunityId() {
      return this.communityId;
   }

   @JsonProperty("equipmentId")
   public void setEquipmentId(String equipmentId) {
      this.equipmentId = equipmentId;
   }

   @JsonProperty("equipmentId")
   public String getEquipmentId() {
      return this.equipmentId;
   }

   @JsonProperty("source")
   public void setSource(String source) {
      this.source = source;
   }

   @JsonProperty("source")
   public String getSource() {
      return this.source;
   }
}
