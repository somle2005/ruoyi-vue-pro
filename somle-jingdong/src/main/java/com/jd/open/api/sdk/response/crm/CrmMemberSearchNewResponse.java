package com.jd.open.api.sdk.response.crm;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.crm.CrmMemberService.response.searchNew.CrmMemberResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CrmMemberSearchNewResponse extends AbstractResponse {
   private CrmMemberResult crmMemberResult;

   @JsonProperty("crm_member_result")
   public void setCrmMemberResult(CrmMemberResult crmMemberResult) {
      this.crmMemberResult = crmMemberResult;
   }

   @JsonProperty("crm_member_result")
   public CrmMemberResult getCrmMemberResult() {
      return this.crmMemberResult;
   }
}
