package com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.request.batchPushGoodsStoreRel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ThirdGoodsStoreRel implements Serializable {
   private Integer vipType;
   private Integer settlePrice;
   private String storeId;

   @JsonProperty("vipType")
   public void setVipType(Integer vipType) {
      this.vipType = vipType;
   }

   @JsonProperty("vipType")
   public Integer getVipType() {
      return this.vipType;
   }

   @JsonProperty("settlePrice")
   public void setSettlePrice(Integer settlePrice) {
      this.settlePrice = settlePrice;
   }

   @JsonProperty("settlePrice")
   public Integer getSettlePrice() {
      return this.settlePrice;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }
}
