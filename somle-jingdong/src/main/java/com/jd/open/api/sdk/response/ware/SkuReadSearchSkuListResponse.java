package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.SkuReadService.response.searchSkuList.Page;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SkuReadSearchSkuListResponse extends AbstractResponse {
   private Page page;

   @JsonProperty("page")
   public void setPage(Page page) {
      this.page = page;
   }

   @JsonProperty("page")
   public Page getPage() {
      return this.page;
   }
}
