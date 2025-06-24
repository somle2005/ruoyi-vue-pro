package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoDtail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SuitWareVO implements Serializable {
   private Boolean loc;
   private Integer blackWhite;
   private Integer isNeedToBuy;
   private Boolean tiedSale;
   private List<Map> skuList;
   private String wareImg;
   private Boolean xnzt;
   private String wareName;
   private String itemNum;
   private Integer synchStatus;
   private Integer colType;
   private Long stockNum;
   private Long wareId;
   private String promoPrice;
   private String jdPrice;
   private Long categoryId;

   @JsonProperty("loc")
   public void setLoc(Boolean loc) {
      this.loc = loc;
   }

   @JsonProperty("loc")
   public Boolean getLoc() {
      return this.loc;
   }

   @JsonProperty("blackWhite")
   public void setBlackWhite(Integer blackWhite) {
      this.blackWhite = blackWhite;
   }

   @JsonProperty("blackWhite")
   public Integer getBlackWhite() {
      return this.blackWhite;
   }

   @JsonProperty("isNeedToBuy")
   public void setIsNeedToBuy(Integer isNeedToBuy) {
      this.isNeedToBuy = isNeedToBuy;
   }

   @JsonProperty("isNeedToBuy")
   public Integer getIsNeedToBuy() {
      return this.isNeedToBuy;
   }

   @JsonProperty("tiedSale")
   public void setTiedSale(Boolean tiedSale) {
      this.tiedSale = tiedSale;
   }

   @JsonProperty("tiedSale")
   public Boolean getTiedSale() {
      return this.tiedSale;
   }

   @JsonProperty("skuList")
   public void setSkuList(List<Map> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<Map> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("wareImg")
   public void setWareImg(String wareImg) {
      this.wareImg = wareImg;
   }

   @JsonProperty("wareImg")
   public String getWareImg() {
      return this.wareImg;
   }

   @JsonProperty("xnzt")
   public void setXnzt(Boolean xnzt) {
      this.xnzt = xnzt;
   }

   @JsonProperty("xnzt")
   public Boolean getXnzt() {
      return this.xnzt;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("synchStatus")
   public void setSynchStatus(Integer synchStatus) {
      this.synchStatus = synchStatus;
   }

   @JsonProperty("synchStatus")
   public Integer getSynchStatus() {
      return this.synchStatus;
   }

   @JsonProperty("colType")
   public void setColType(Integer colType) {
      this.colType = colType;
   }

   @JsonProperty("colType")
   public Integer getColType() {
      return this.colType;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public String getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }
}
