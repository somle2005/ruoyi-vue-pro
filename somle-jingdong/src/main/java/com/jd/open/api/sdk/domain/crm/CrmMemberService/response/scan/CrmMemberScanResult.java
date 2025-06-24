package com.jd.open.api.sdk.domain.crm.CrmMemberService.response.scan;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CrmMemberScanResult implements Serializable {
   private CrmMember[] crmMembers;
   private int totalResult;
   private String scrollId;

   @JsonProperty("crm_members")
   public void setCrmMembers(CrmMember[] crmMembers) {
      this.crmMembers = crmMembers;
   }

   @JsonProperty("crm_members")
   public CrmMember[] getCrmMembers() {
      return this.crmMembers;
   }

   @JsonProperty("total_result")
   public void setTotalResult(int totalResult) {
      this.totalResult = totalResult;
   }

   @JsonProperty("total_result")
   public int getTotalResult() {
      return this.totalResult;
   }

   @JsonProperty("scroll_id")
   public void setScrollId(String scrollId) {
      this.scrollId = scrollId;
   }

   @JsonProperty("scroll_id")
   public String getScrollId() {
      return this.scrollId;
   }
}
