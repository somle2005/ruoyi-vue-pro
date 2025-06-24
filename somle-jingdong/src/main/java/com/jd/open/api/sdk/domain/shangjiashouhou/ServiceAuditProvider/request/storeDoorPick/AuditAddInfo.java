package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.storeDoorPick;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AuditAddInfo implements Serializable {
   private Integer pickwareType;
   private String approveNotes;
   private String pickWareNotes;
   private Integer companyId;
   private Integer auditType;
   private Integer pickwareMethod;
   private Integer afterServiceType;
   private Integer customizedSmsType;
   private Integer customerExpect;

   @JsonProperty("pickwareType")
   public void setPickwareType(Integer pickwareType) {
      this.pickwareType = pickwareType;
   }

   @JsonProperty("pickwareType")
   public Integer getPickwareType() {
      return this.pickwareType;
   }

   @JsonProperty("approveNotes")
   public void setApproveNotes(String approveNotes) {
      this.approveNotes = approveNotes;
   }

   @JsonProperty("approveNotes")
   public String getApproveNotes() {
      return this.approveNotes;
   }

   @JsonProperty("pickWareNotes")
   public void setPickWareNotes(String pickWareNotes) {
      this.pickWareNotes = pickWareNotes;
   }

   @JsonProperty("pickWareNotes")
   public String getPickWareNotes() {
      return this.pickWareNotes;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Integer getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("auditType")
   public void setAuditType(Integer auditType) {
      this.auditType = auditType;
   }

   @JsonProperty("auditType")
   public Integer getAuditType() {
      return this.auditType;
   }

   @JsonProperty("pickwareMethod")
   public void setPickwareMethod(Integer pickwareMethod) {
      this.pickwareMethod = pickwareMethod;
   }

   @JsonProperty("pickwareMethod")
   public Integer getPickwareMethod() {
      return this.pickwareMethod;
   }

   @JsonProperty("afterServiceType")
   public void setAfterServiceType(Integer afterServiceType) {
      this.afterServiceType = afterServiceType;
   }

   @JsonProperty("afterServiceType")
   public Integer getAfterServiceType() {
      return this.afterServiceType;
   }

   @JsonProperty("customizedSmsType")
   public void setCustomizedSmsType(Integer customizedSmsType) {
      this.customizedSmsType = customizedSmsType;
   }

   @JsonProperty("customizedSmsType")
   public Integer getCustomizedSmsType() {
      return this.customizedSmsType;
   }

   @JsonProperty("customerExpect")
   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   @JsonProperty("customerExpect")
   public Integer getCustomerExpect() {
      return this.customerExpect;
   }
}
