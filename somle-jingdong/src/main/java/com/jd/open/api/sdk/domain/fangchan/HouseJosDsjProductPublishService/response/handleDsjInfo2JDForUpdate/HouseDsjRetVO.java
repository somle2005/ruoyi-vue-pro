package com.jd.open.api.sdk.domain.fangchan.HouseJosDsjProductPublishService.response.handleDsjInfo2JDForUpdate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class HouseDsjRetVO implements Serializable {
   private Long spuId;
   private List<Long[]> skuIds;

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(List<Long[]> skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public List<Long[]> getSkuIds() {
      return this.skuIds;
   }
}
