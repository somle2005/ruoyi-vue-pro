package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.refuse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WareDetailInfo implements Serializable {
   private Long wareId;
   private Integer wareNum;
   private String wareName;
   private Long afsApplyDetailId;
   private Integer wareType;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareNum")
   public void setWareNum(Integer wareNum) {
      this.wareNum = wareNum;
   }

   @JsonProperty("wareNum")
   public Integer getWareNum() {
      return this.wareNum;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("afsApplyDetailId")
   public void setAfsApplyDetailId(Long afsApplyDetailId) {
      this.afsApplyDetailId = afsApplyDetailId;
   }

   @JsonProperty("afsApplyDetailId")
   public Long getAfsApplyDetailId() {
      return this.afsApplyDetailId;
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
