package com.jd.open.api.sdk.response.fapiao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fapiao.InvoiceDetailReadProvider.response.getInvoiceDetailListByDailyIdOrApplyId.ResultMO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ScfInvoiceDetailGetInvoiceDetailListByDailyIdOrApplyIdResponse extends AbstractResponse {
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
