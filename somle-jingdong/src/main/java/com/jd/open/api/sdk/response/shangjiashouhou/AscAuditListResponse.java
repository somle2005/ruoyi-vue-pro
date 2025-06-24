package com.jd.open.api.sdk.response.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.list.WaitAuditApplyPage;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AscAuditListResponse extends AbstractResponse {
   private WaitAuditApplyPage pageResult;

   @JsonProperty("pageResult")
   public void setPageResult(WaitAuditApplyPage pageResult) {
      this.pageResult = pageResult;
   }

   @JsonProperty("pageResult")
   public WaitAuditApplyPage getPageResult() {
      return this.pageResult;
   }
}
