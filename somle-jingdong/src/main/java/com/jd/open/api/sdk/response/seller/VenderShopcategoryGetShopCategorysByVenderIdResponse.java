package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.ShopCategorySafService.response.getShopCategorysByVenderId.ShopCategoryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderShopcategoryGetShopCategorysByVenderIdResponse extends AbstractResponse {
   private ShopCategoryResult getshopcategorysbyvenderidResult;

   @JsonProperty("getshopcategorysbyvenderid_result")
   public void setGetshopcategorysbyvenderidResult(ShopCategoryResult getshopcategorysbyvenderidResult) {
      this.getshopcategorysbyvenderidResult = getshopcategorysbyvenderidResult;
   }

   @JsonProperty("getshopcategorysbyvenderid_result")
   public ShopCategoryResult getGetshopcategorysbyvenderidResult() {
      return this.getshopcategorysbyvenderidResult;
   }
}
