package com.jd.open.api.sdk.response.crm;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.crm.CrmMemberService.response.scan.CrmMemberScanResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CrmMemberScanResponse extends AbstractResponse {
   private CrmMemberScanResult crmMemberScanResult;

   @JsonProperty("crm_member_scan_result")
   public void setCrmMemberScanResult(CrmMemberScanResult crmMemberScanResult) {
      this.crmMemberScanResult = crmMemberScanResult;
   }

   @JsonProperty("crm_member_scan_result")
   public CrmMemberScanResult getCrmMemberScanResult() {
      return this.crmMemberScanResult;
   }
}
