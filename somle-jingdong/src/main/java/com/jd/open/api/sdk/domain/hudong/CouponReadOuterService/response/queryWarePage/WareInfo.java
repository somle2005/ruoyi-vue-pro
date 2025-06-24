package com.jd.open.api.sdk.domain.hudong.CouponReadOuterService.response.queryWarePage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WareInfo implements Serializable {
   private List<SkuInfo> skuList;
   private Long wareId;
   private String wareImg;
   private Long venderId;
   private String wareName;
   private Long stockNum;
   private String jdPrice;

   @JsonProperty("skuList")
   public void setSkuList(List<SkuInfo> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<SkuInfo> getSkuList() {
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

   @JsonProperty("wareImg")
   public void setWareImg(String wareImg) {
      this.wareImg = wareImg;
   }

   @JsonProperty("wareImg")
   public String getWareImg() {
      return this.wareImg;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public String getJdPrice() {
      return this.jdPrice;
   }
}
