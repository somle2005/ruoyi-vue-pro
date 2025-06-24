package com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.request.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SubsidyAuditParam implements Serializable {
   private Long orderId;
   private Integer auditStatus;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("auditStatus")
   public void setAuditStatus(Integer auditStatus) {
      this.auditStatus = auditStatus;
   }

   @JsonProperty("auditStatus")
   public Integer getAuditStatus() {
      return this.auditStatus;
   }
}
