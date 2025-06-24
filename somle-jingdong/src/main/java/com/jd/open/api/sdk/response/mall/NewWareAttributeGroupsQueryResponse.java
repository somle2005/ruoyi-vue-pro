package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.query.AttributeGroup;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class NewWareAttributeGroupsQueryResponse extends AbstractResponse {
   private List<AttributeGroup> resultset;

   @JsonProperty("resultset")
   public void setResultset(List<AttributeGroup> resultset) {
      this.resultset = resultset;
   }

   @JsonProperty("resultset")
   public List<AttributeGroup> getResultset() {
      return this.resultset;
   }
}
