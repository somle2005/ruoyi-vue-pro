package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getFlowPromoInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FullCouponFlowInfo implements Serializable {
   private Long skuId;
   private String remark;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }
}
