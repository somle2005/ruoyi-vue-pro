package com.jd.open.api.sdk.domain.crm.CrmMemberService.response.searchNew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CrmMemberResult implements Serializable {
   private CrmMember[] crmMembers;
   private int totalResult;

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
}
