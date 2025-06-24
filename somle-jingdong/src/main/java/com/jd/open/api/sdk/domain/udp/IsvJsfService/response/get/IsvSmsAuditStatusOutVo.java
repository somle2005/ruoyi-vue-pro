package com.jd.open.api.sdk.domain.udp.IsvJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class IsvSmsAuditStatusOutVo implements Serializable {
   private Integer status;
   private String auditMsg;

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("auditMsg")
   public void setAuditMsg(String auditMsg) {
      this.auditMsg = auditMsg;
   }

   @JsonProperty("auditMsg")
   public String getAuditMsg() {
      return this.auditMsg;
   }
}
