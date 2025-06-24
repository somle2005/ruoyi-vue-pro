package com.jd.open.api.sdk.response.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.list.WaitPageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AscProcessListResponse extends AbstractResponse {
   private WaitPageResult pageResult;

   @JsonProperty("pageResult")
   public void setPageResult(WaitPageResult pageResult) {
      this.pageResult = pageResult;
   }

   @JsonProperty("pageResult")
   public WaitPageResult getPageResult() {
      return this.pageResult;
   }
}
