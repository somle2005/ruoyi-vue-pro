package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerDeliveryStoreApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WareDetailInfo implements Serializable {
   private Long afsApplyDetailId;
   private Long wareId;
   private String wareName;
   private Integer wareType;

   @JsonProperty("afsApplyDetailId")
   public void setAfsApplyDetailId(Long afsApplyDetailId) {
      this.afsApplyDetailId = afsApplyDetailId;
   }

   @JsonProperty("afsApplyDetailId")
   public Long getAfsApplyDetailId() {
      return this.afsApplyDetailId;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("wareType")
   public void setWareType(Integer wareType) {
      this.wareType = wareType;
   }

   @JsonProperty("wareType")
   public Integer getWareType() {
      return this.wareType;
   }
}
