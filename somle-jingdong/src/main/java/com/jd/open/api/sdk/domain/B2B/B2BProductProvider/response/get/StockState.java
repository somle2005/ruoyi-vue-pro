package com.jd.open.api.sdk.domain.B2B.B2BProductProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StockState implements Serializable {
   private String areaId;
   private Integer remainNum;
   private String stockStateId;
   private String skuId;
   private String desc;

   @JsonProperty("areaId")
   public void setAreaId(String areaId) {
      this.areaId = areaId;
   }

   @JsonProperty("areaId")
   public String getAreaId() {
      return this.areaId;
   }

   @JsonProperty("remainNum")
   public void setRemainNum(Integer remainNum) {
      this.remainNum = remainNum;
   }

   @JsonProperty("remainNum")
   public Integer getRemainNum() {
      return this.remainNum;
   }

   @JsonProperty("stockStateId")
   public void setStockStateId(String stockStateId) {
      this.stockStateId = stockStateId;
   }

   @JsonProperty("stockStateId")
   public String getStockStateId() {
      return this.stockStateId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }
}
