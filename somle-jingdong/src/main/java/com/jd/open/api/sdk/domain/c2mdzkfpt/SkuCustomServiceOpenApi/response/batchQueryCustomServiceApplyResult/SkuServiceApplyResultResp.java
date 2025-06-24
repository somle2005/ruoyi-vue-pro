package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.batchQueryCustomServiceApplyResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuServiceApplyResultResp implements Serializable {
   private String rejectReason;
   private int code;
   private String identityId;
   private Integer auditResult;
   private String message;

   @JsonProperty("rejectReason")
   public void setRejectReason(String rejectReason) {
      this.rejectReason = rejectReason;
   }

   @JsonProperty("rejectReason")
   public String getRejectReason() {
      return this.rejectReason;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("identityId")
   public void setIdentityId(String identityId) {
      this.identityId = identityId;
   }

   @JsonProperty("identityId")
   public String getIdentityId() {
      return this.identityId;
   }

   @JsonProperty("auditResult")
   public void setAuditResult(Integer auditResult) {
      this.auditResult = auditResult;
   }

   @JsonProperty("auditResult")
   public Integer getAuditResult() {
      return this.auditResult;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
