package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerPromotionSkuListResponse extends AbstractResponse {
   private Integer totalCount;
   private List<PromoSkuVO> promoSkuVOS;

   @JsonProperty("total_count")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("total_count")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("promo_sku_v_o_s")
   public void setPromoSkuVOS(List<PromoSkuVO> promoSkuVOS) {
      this.promoSkuVOS = promoSkuVOS;
   }

   @JsonProperty("promo_sku_v_o_s")
   public List<PromoSkuVO> getPromoSkuVOS() {
      return this.promoSkuVOS;
   }
}
