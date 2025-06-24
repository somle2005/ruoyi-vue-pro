package com.jd.open.api.sdk.response.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ReceiveQueryProvider.response.list.PageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AscReceiveListResponse extends AbstractResponse {
   private PageResult pageResult;

   @JsonProperty("pageResult")
   public void setPageResult(PageResult pageResult) {
      this.pageResult = pageResult;
   }

   @JsonProperty("pageResult")
   public PageResult getPageResult() {
      return this.pageResult;
   }
}
