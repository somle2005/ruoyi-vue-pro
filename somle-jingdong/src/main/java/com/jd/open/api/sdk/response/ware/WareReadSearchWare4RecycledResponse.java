package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.WareReadService.response.searchWare4Recycled.Page;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareReadSearchWare4RecycledResponse extends AbstractResponse {
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
