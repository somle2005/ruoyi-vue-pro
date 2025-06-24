package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get.ProductBase;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class NewWareBaseproductGetResponse extends AbstractResponse {
   private List<ProductBase> listproductbaseResult;

   @JsonProperty("listproductbase_result")
   public void setListproductbaseResult(List<ProductBase> listproductbaseResult) {
      this.listproductbaseResult = listproductbaseResult;
   }

   @JsonProperty("listproductbase_result")
   public List<ProductBase> getListproductbaseResult() {
      return this.listproductbaseResult;
   }
}
