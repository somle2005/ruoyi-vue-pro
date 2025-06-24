package com.jd.open.api.sdk.response.fapiao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fapiao.FinanceInvoiceApplyProvider.response.submitApply.ResultMO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ScfInvoiceApplySubmitApplyResponse extends AbstractResponse {
   private ResultMO ResultMO;

   @JsonProperty("ResultMO")
   public void setResultMO(ResultMO ResultMO) {
      this.ResultMO = ResultMO;
   }

   @JsonProperty("ResultMO")
   public ResultMO getResultMO() {
      return this.ResultMO;
   }
}
