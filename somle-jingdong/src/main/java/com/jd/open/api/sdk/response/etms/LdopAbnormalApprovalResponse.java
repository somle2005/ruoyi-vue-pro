package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.AbnormalOrderRequestApi.response.approval.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopAbnormalApprovalResponse extends AbstractResponse {
   private ResponseDTO approvalResult;

   @JsonProperty("approval_result")
   public void setApprovalResult(ResponseDTO approvalResult) {
      this.approvalResult = approvalResult;
   }

   @JsonProperty("approval_result")
   public ResponseDTO getApprovalResult() {
      return this.approvalResult;
   }
}
