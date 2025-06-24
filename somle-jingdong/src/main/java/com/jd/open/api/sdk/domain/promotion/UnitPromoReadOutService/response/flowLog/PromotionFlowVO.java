package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.flowLog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class PromotionFlowVO implements Serializable {
   private Date created;
   private String remark;
   private long promoId;
   private Long skuId;

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("promoId")
   public void setPromoId(long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
