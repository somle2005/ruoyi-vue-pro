package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.get.CheckNumberResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOtoChecknumberinfoGetResponse extends AbstractResponse {
   private CheckNumberResult cknumberResult;

   @JsonProperty("cknumber_result")
   public void setCknumberResult(CheckNumberResult cknumberResult) {
      this.cknumberResult = cknumberResult;
   }

   @JsonProperty("cknumber_result")
   public CheckNumberResult getCknumberResult() {
      return this.cknumberResult;
   }
}
