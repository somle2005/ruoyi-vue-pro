package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.updateProduct;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosUpdateProductReq implements Serializable {
   private String productInfo;
   private Long productId;

   @JsonProperty("productInfo")
   public void setProductInfo(String productInfo) {
      this.productInfo = productInfo;
   }

   @JsonProperty("productInfo")
   public String getProductInfo() {
      return this.productInfo;
   }

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }
}
