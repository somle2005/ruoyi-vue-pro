package com.jd.open.api.sdk.domain.ware.KeeperAuditResultService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class WareInfoAuditResult implements Serializable {
   private Long auditTime;
   private Map<String, List> detailAuditReason;
   private String wareAuditReason;

   @JsonProperty("auditTime")
   public void setAuditTime(Long auditTime) {
      this.auditTime = auditTime;
   }

   @JsonProperty("auditTime")
   public Long getAuditTime() {
      return this.auditTime;
   }

   @JsonProperty("detailAuditReason")
   public void setDetailAuditReason(Map<String, List> detailAuditReason) {
      this.detailAuditReason = detailAuditReason;
   }

   @JsonProperty("detailAuditReason")
   public Map<String, List> getDetailAuditReason() {
      return this.detailAuditReason;
   }

   @JsonProperty("wareAuditReason")
   public void setWareAuditReason(String wareAuditReason) {
      this.wareAuditReason = wareAuditReason;
   }

   @JsonProperty("wareAuditReason")
   public String getWareAuditReason() {
      return this.wareAuditReason;
   }
}
