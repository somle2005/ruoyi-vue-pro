package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.JosStatementQueryServiceProvider.response.queryOrderBill.RpcResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JpassJournalQueryOrderBillResponse extends AbstractResponse {
   private RpcResponse queryorderbillbypageResult;

   @JsonProperty("queryorderbillbypage_result")
   public void setQueryorderbillbypageResult(RpcResponse queryorderbillbypageResult) {
      this.queryorderbillbypageResult = queryorderbillbypageResult;
   }

   @JsonProperty("queryorderbillbypage_result")
   public RpcResponse getQueryorderbillbypageResult() {
      return this.queryorderbillbypageResult;
   }
}
