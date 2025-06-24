package com.jd.open.api.sdk.domain.promotion.UnitPromotionWriteService.request.addSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromotionSku implements Serializable {
   private Long[] skuId;
   private Integer[] bindType;
   private String[] promoPrice;
   private Integer[] num;
   private Long[] wareId;
   private String[] skuName;
   private String[] jdPrice;
   private String[] itemNum;
   private Long[] storeId;
   private Integer[] discountType;
   private Integer[] promoType;
   private Double[] discount;
   private Double[] discountRate;
   private Integer[] seq;
   private Integer[] isNeedToBuy;
   private Boolean overlyingSuit;
   private Integer[] maxNumLimit;

   @JsonProperty("skuId")
   public void setSkuId(Long[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long[] getSkuId() {
      return this.skuId;
   }

   @JsonProperty("bindType")
   public void setBindType(Integer[] bindType) {
      this.bindType = bindType;
   }

   @JsonProperty("bindType")
   public Integer[] getBindType() {
      return this.bindType;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(String[] promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public String[] getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("num")
   public void setNum(Integer[] num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer[] getNum() {
      return this.num;
   }

   @JsonProperty("wareId")
   public void setWareId(Long[] wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long[] getWareId() {
      return this.wareId;
   }

   @JsonProperty("skuName")
   public void setSkuName(String[] skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String[] getSkuName() {
      return this.skuName;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(String[] jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public String[] getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String[] itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String[] getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long[] storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long[] getStoreId() {
      return this.storeId;
   }

   @JsonProperty("discountType")
   public void setDiscountType(Integer[] discountType) {
      this.discountType = discountType;
   }

   @JsonProperty("discountType")
   public Integer[] getDiscountType() {
      return this.discountType;
   }

   @JsonProperty("promoType")
   public void setPromoType(Integer[] promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promoType")
   public Integer[] getPromoType() {
      return this.promoType;
   }

   @JsonProperty("discount")
   public void setDiscount(Double[] discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public Double[] getDiscount() {
      return this.discount;
   }

   @JsonProperty("discountRate")
   public void setDiscountRate(Double[] discountRate) {
      this.discountRate = discountRate;
   }

   @JsonProperty("discountRate")
   public Double[] getDiscountRate() {
      return this.discountRate;
   }

   @JsonProperty("seq")
   public void setSeq(Integer[] seq) {
      this.seq = seq;
   }

   @JsonProperty("seq")
   public Integer[] getSeq() {
      return this.seq;
   }

   @JsonProperty("isNeedToBuy")
   public void setIsNeedToBuy(Integer[] isNeedToBuy) {
      this.isNeedToBuy = isNeedToBuy;
   }

   @JsonProperty("isNeedToBuy")
   public Integer[] getIsNeedToBuy() {
      return this.isNeedToBuy;
   }

   @JsonProperty("overlyingSuit")
   public void setOverlyingSuit(Boolean overlyingSuit) {
      this.overlyingSuit = overlyingSuit;
   }

   @JsonProperty("overlyingSuit")
   public Boolean getOverlyingSuit() {
      return this.overlyingSuit;
   }

   @JsonProperty("maxNumLimit")
   public void setMaxNumLimit(Integer[] maxNumLimit) {
      this.maxNumLimit = maxNumLimit;
   }

   @JsonProperty("maxNumLimit")
   public Integer[] getMaxNumLimit() {
      return this.maxNumLimit;
   }
}
