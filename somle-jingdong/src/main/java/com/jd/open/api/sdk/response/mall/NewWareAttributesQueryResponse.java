package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.query.Attribute;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class NewWareAttributesQueryResponse extends AbstractResponse {
   private List<Attribute> resultset;

   @JsonProperty("resultset")
   public void setResultset(List<Attribute> resultset) {
      this.resultset = resultset;
   }

   @JsonProperty("resultset")
   public List<Attribute> getResultset() {
      return this.resultset;
   }
}
