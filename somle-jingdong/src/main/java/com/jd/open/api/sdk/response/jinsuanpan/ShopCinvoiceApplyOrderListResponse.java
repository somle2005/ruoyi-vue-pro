package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceApplyOrderProvider.response.list.ResultMO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ShopCinvoiceApplyOrderListResponse extends AbstractResponse {
   private ResultMO response;

   @JsonProperty("response")
   public void setResponse(ResultMO response) {
      this.response = response;
   }

   @JsonProperty("response")
   public ResultMO getResponse() {
      return this.response;
   }
}
