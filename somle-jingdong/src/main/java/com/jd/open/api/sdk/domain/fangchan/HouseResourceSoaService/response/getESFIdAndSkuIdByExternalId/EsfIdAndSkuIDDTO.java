package com.jd.open.api.sdk.domain.fangchan.HouseResourceSoaService.response.getESFIdAndSkuIdByExternalId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class EsfIdAndSkuIDDTO implements Serializable {
   private Long houseResourceId;
   private Long skuId;
   private Long wareId;

   @JsonProperty("houseResourceId")
   public void setHouseResourceId(Long houseResourceId) {
      this.houseResourceId = houseResourceId;
   }

   @JsonProperty("houseResourceId")
   public Long getHouseResourceId() {
      return this.houseResourceId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
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
