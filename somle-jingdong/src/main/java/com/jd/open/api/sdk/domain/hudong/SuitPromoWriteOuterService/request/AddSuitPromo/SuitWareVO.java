package com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.AddSuitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SuitWareVO implements Serializable {
   private Integer isNeedToBuy;
   private List<Map> skuList;
   private Long wareId;

   @JsonProperty("isNeedToBuy")
   public void setIsNeedToBuy(Integer isNeedToBuy) {
      this.isNeedToBuy = isNeedToBuy;
   }

   @JsonProperty("isNeedToBuy")
   public Integer getIsNeedToBuy() {
      return this.isNeedToBuy;
   }

   @JsonProperty("skuList")
   public void setSkuList(List<Map> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<Map> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }
}
