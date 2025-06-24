package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerSendStoreApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AuditAddInfo implements Serializable {
   private Integer customerExpect;
   private Integer pickwareType;
   private String approveNotes;
   private String pickWareNotes;

   @JsonProperty("customerExpect")
   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   @JsonProperty("customerExpect")
   public Integer getCustomerExpect() {
      return this.customerExpect;
   }

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
}
