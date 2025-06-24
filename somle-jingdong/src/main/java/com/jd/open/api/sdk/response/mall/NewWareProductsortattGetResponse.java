package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get.AttributeSetting;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class NewWareProductsortattGetResponse extends AbstractResponse {
   private List<AttributeSetting> resultset;

   @JsonProperty("resultset")
   public void setResultset(List<AttributeSetting> resultset) {
      this.resultset = resultset;
   }

   @JsonProperty("resultset")
   public List<AttributeSetting> getResultset() {
      return this.resultset;
   }
}
