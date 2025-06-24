package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerPromotionListResponse extends AbstractResponse {
   private Integer totalCount;
   private List<PromotionVO> promotionVOS;

   @JsonProperty("total_count")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("total_count")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("promotion_v_o_s")
   public void setPromotionVOS(List<PromotionVO> promotionVOS) {
      this.promotionVOS = promotionVOS;
   }

   @JsonProperty("promotion_v_o_s")
   public List<PromotionVO> getPromotionVOS() {
      return this.promotionVOS;
   }
}
