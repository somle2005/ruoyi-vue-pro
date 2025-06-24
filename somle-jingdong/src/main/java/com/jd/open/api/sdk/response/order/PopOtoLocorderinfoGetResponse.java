package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.get.LocCodeInfoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOtoLocorderinfoGetResponse extends AbstractResponse {
   private LocCodeInfoResult loccodeinfoResult;

   @JsonProperty("loccodeinfo_result")
   public void setLoccodeinfoResult(LocCodeInfoResult loccodeinfoResult) {
      this.loccodeinfoResult = loccodeinfoResult;
   }

   @JsonProperty("loccodeinfo_result")
   public LocCodeInfoResult getLoccodeinfoResult() {
      return this.loccodeinfoResult;
   }
}
