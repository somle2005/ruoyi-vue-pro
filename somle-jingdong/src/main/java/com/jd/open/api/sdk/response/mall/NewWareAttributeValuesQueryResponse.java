package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.query.AttributeValue;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class NewWareAttributeValuesQueryResponse extends AbstractResponse {
   private List<AttributeValue> resultset;

   @JsonProperty("resultset")
   public void setResultset(List<AttributeValue> resultset) {
      this.resultset = resultset;
   }

   @JsonProperty("resultset")
   public List<AttributeValue> getResultset() {
      return this.resultset;
   }
}
