package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.JosPromotionReadService.response.list.JosPromotionSku;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerPromotionV2SkuListResponse extends AbstractResponse {
   private List<JosPromotionSku> promotionSkuList;

   @JsonProperty("promotion_sku_list")
   public void setPromotionSkuList(List<JosPromotionSku> promotionSkuList) {
      this.promotionSkuList = promotionSkuList;
   }

   @JsonProperty("promotion_sku_list")
   public List<JosPromotionSku> getPromotionSkuList() {
      return this.promotionSkuList;
   }
}
