package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getUnitFlowLogList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class PromotionFlowVO implements Serializable {
   private Date created;
   private String remark;
   private long id;
   private long promoId;
   private int type;
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

   @JsonProperty("id")
   public void setId(long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public long getId() {
      return this.id;
   }

   @JsonProperty("promoId")
   public void setPromoId(long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("type")
   public void setType(int type) {
      this.type = type;
   }

   @JsonProperty("type")
   public int getType() {
      return this.type;
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
