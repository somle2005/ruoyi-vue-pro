package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.VenderShopCategoryJosService.response.getShopCategoryByCid.JosResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderShopcategoryGetShopCategoryByCidResponse extends AbstractResponse {
   private JosResult shopCategoryResult;

   @JsonProperty("shopCategoryResult")
   public void setShopCategoryResult(JosResult shopCategoryResult) {
      this.shopCategoryResult = shopCategoryResult;
   }

   @JsonProperty("shopCategoryResult")
   public JosResult getShopCategoryResult() {
      return this.shopCategoryResult;
   }
}
