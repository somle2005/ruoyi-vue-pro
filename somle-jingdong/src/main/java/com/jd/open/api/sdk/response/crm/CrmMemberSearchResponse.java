package com.jd.open.api.sdk.response.crm;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.crm.CrmMemberService.response.search.CrmMemberResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CrmMemberSearchResponse extends AbstractResponse {
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
