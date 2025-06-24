package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get.ProductSort;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareProductsortGetResponse extends AbstractResponse {
   private List<ProductSort> productSorts;

   @JsonProperty("product_sorts")
   public void setProductSorts(List<ProductSort> productSorts) {
      this.productSorts = productSorts;
   }

   @JsonProperty("product_sorts")
   public List<ProductSort> getProductSorts() {
      return this.productSorts;
   }
}
