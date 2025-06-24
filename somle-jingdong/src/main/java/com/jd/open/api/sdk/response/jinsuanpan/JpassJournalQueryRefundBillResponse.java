package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.JosStatementQueryServiceProvider.response.queryRefundBill.RpcResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JpassJournalQueryRefundBillResponse extends AbstractResponse {
   private RpcResponse queryrefundbillbypageResult;

   @JsonProperty("queryrefundbillbypage_result")
   public void setQueryrefundbillbypageResult(RpcResponse queryrefundbillbypageResult) {
      this.queryrefundbillbypageResult = queryrefundbillbypageResult;
   }

   @JsonProperty("queryrefundbillbypage_result")
   public RpcResponse getQueryrefundbillbypageResult() {
      return this.queryrefundbillbypageResult;
   }
}
