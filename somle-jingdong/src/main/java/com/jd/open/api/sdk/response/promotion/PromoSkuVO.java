package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromoSkuVO implements Serializable {
   private Long wareId;
   private String itemNum;
   private Long skuId;
   private String skuName;
   private Long promoId;
   private String jdPrice;
   private String promoPrice;
   private Integer seq;
   private Integer num;
   private Integer bindType;
   private Long rfId;

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("item_num")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("item_num")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_name")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("sku_name")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("promo_id")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promo_id")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("jd_price")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jd_price")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("promo_price")
   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promo_price")
   public String getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("seq")
   public void setSeq(Integer seq) {
      this.seq = seq;
   }

   @JsonProperty("seq")
   public Integer getSeq() {
      return this.seq;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("bind_type")
   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   @JsonProperty("bind_type")
   public Integer getBindType() {
      return this.bindType;
   }

   @JsonProperty("rfId")
   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public Long getRfId() {
      return this.rfId;
   }
}
