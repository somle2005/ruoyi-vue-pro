package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerPromotionOrdermodeListResponse extends AbstractResponse {
   private List<OrderModeVO> promoOrderModeVOs;

   @JsonProperty("promo_order_mode_v_os")
   public void setPromoOrderModeVOs(List<OrderModeVO> promoOrderModeVOs) {
      this.promoOrderModeVOs = promoOrderModeVOs;
   }

   @JsonProperty("promo_order_mode_v_os")
   public List<OrderModeVO> getPromoOrderModeVOs() {
      return this.promoOrderModeVOs;
   }
}
