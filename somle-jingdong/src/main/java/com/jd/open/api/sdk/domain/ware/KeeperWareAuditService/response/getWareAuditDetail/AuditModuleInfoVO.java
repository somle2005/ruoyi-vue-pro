package com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.response.getWareAuditDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AuditModuleInfoVO implements Serializable {
   private List<AuditReason> auditReasons;
   private String auditModuleName;
   private List<CommonInfoVO> currentCommonInfoVoS;
   private String auditModuleCode;
   private List<AuditModuleInfoVO> auditModuleInfoVoS;

   @JsonProperty("auditReasons")
   public void setAuditReasons(List<AuditReason> auditReasons) {
      this.auditReasons = auditReasons;
   }

   @JsonProperty("auditReasons")
   public List<AuditReason> getAuditReasons() {
      return this.auditReasons;
   }

   @JsonProperty("auditModuleName")
   public void setAuditModuleName(String auditModuleName) {
      this.auditModuleName = auditModuleName;
   }

   @JsonProperty("auditModuleName")
   public String getAuditModuleName() {
      return this.auditModuleName;
   }

   @JsonProperty("currentCommonInfoVoS")
   public void setCurrentCommonInfoVoS(List<CommonInfoVO> currentCommonInfoVoS) {
      this.currentCommonInfoVoS = currentCommonInfoVoS;
   }

   @JsonProperty("currentCommonInfoVoS")
   public List<CommonInfoVO> getCurrentCommonInfoVoS() {
      return this.currentCommonInfoVoS;
   }

   @JsonProperty("auditModuleCode")
   public void setAuditModuleCode(String auditModuleCode) {
      this.auditModuleCode = auditModuleCode;
   }

   @JsonProperty("auditModuleCode")
   public String getAuditModuleCode() {
      return this.auditModuleCode;
   }

   @JsonProperty("auditModuleInfoVoS")
   public void setAuditModuleInfoVoS(List<AuditModuleInfoVO> auditModuleInfoVoS) {
      this.auditModuleInfoVoS = auditModuleInfoVoS;
   }

   @JsonProperty("auditModuleInfoVoS")
   public List<AuditModuleInfoVO> getAuditModuleInfoVoS() {
      return this.auditModuleInfoVoS;
   }
}
