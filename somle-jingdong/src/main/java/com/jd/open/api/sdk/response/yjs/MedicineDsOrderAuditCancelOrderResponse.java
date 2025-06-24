package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.auditCancelOrder.AuditCancelOrderResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderAuditCancelOrderResponse extends AbstractResponse {
   private AuditCancelOrderResult apiResult;

   @JsonProperty("apiResult")
   public void setApiResult(AuditCancelOrderResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public AuditCancelOrderResult getApiResult() {
      return this.apiResult;
   }
}
