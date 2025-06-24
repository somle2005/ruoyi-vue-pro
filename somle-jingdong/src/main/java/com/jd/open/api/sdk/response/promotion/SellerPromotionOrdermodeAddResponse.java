package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerPromotionOrdermodeAddResponse extends AbstractResponse {
   private List<Long> ids;

   @JsonProperty("ids")
   public void setIds(List<Long> ids) {
      this.ids = ids;
   }

   @JsonProperty("ids")
   public List<Long> getIds() {
      return this.ids;
   }
}
