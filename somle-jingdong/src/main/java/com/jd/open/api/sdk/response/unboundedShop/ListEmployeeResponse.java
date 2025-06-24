package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.EmployeeServiceProvider.response.listEmployee.ResultMessage;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ListEmployeeResponse extends AbstractResponse {
   private ResultMessage resultMessage;

   @JsonProperty("resultMessage")
   public void setResultMessage(ResultMessage resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public ResultMessage getResultMessage() {
      return this.resultMessage;
   }
}
