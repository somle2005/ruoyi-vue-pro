package com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.response.getWareAuditDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ViolationInfo implements Serializable {
   private List<AuditReason> auditReasons;
   private ViolationDetail violationDetail;

   @JsonProperty("auditReasons")
   public void setAuditReasons(List<AuditReason> auditReasons) {
      this.auditReasons = auditReasons;
   }

   @JsonProperty("auditReasons")
   public List<AuditReason> getAuditReasons() {
      return this.auditReasons;
   }

   @JsonProperty("violationDetail")
   public void setViolationDetail(ViolationDetail violationDetail) {
      this.violationDetail = violationDetail;
   }

   @JsonProperty("violationDetail")
   public ViolationDetail getViolationDetail() {
      return this.violationDetail;
   }
}
