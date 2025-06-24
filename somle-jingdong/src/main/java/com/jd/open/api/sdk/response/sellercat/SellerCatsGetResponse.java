package com.jd.open.api.sdk.response.sellercat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.sellercat.ShopCategory;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerCatsGetResponse extends AbstractResponse {
   private List<ShopCategory> shopCatList;

   @JsonProperty("shopCats")
   public List<ShopCategory> getShopCatList() {
      return this.shopCatList;
   }

   @JsonProperty("shopCats")
   public void setShopCatList(List<ShopCategory> shopCatList) {
      this.shopCatList = shopCatList;
   }
}
