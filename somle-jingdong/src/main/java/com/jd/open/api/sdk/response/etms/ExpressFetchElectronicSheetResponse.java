package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.CloudPrintApi.response.sheet.InvokeResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ExpressFetchElectronicSheetResponse extends AbstractResponse {
   private InvokeResult invokeResult;

   @JsonProperty("invokeResult")
   public void setInvokeResult(InvokeResult invokeResult) {
      this.invokeResult = invokeResult;
   }

   @JsonProperty("invokeResult")
   public InvokeResult getInvokeResult() {
      return this.invokeResult;
   }
}
