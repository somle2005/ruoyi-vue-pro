package com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.response.getWareAuditDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AuditDetailInfoVO implements Serializable {
   private List<AuditReason> auditReasons;
   private List<AuditModuleInfoVO> moduleInfoVOList;
   private String wareId;

   @JsonProperty("auditReasons")
   public void setAuditReasons(List<AuditReason> auditReasons) {
      this.auditReasons = auditReasons;
   }

   @JsonProperty("auditReasons")
   public List<AuditReason> getAuditReasons() {
      return this.auditReasons;
   }

   @JsonProperty("moduleInfoVOList")
   public void setModuleInfoVOList(List<AuditModuleInfoVO> moduleInfoVOList) {
      this.moduleInfoVOList = moduleInfoVOList;
   }

   @JsonProperty("moduleInfoVOList")
   public List<AuditModuleInfoVO> getModuleInfoVOList() {
      return this.moduleInfoVOList;
   }

   @JsonProperty("wareId")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public String getWareId() {
      return this.wareId;
   }
}
