package com.jd.open.api.sdk.domain.promotion.JosPromotionReadService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosPromotionSku implements Serializable {
   private Long[] promoSkuId;
   private Long[] wareId;
   private Long[] skuId;
   private String[] skuName;
   private Integer[] bindType;
   private String[] jdPrice;
   private String[] promoPrice;
   private String[] itemNum;
   private Integer[] limitNum;
   private Integer[] skuStatus;
   private Integer[] seq;
   private Integer[] display;
   private Integer[] isNeedToBuy;
   private Date[] created;
   private Date[] modified;
   private Long[] rfId;

   @JsonProperty("promo_sku_id")
   public void setPromoSkuId(Long[] promoSkuId) {
      this.promoSkuId = promoSkuId;
   }

   @JsonProperty("promo_sku_id")
   public Long[] getPromoSkuId() {
      return this.promoSkuId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long[] wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public Long[] getWareId() {
      return this.wareId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(Long[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long[] getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_name")
   public void setSkuName(String[] skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("sku_name")
   public String[] getSkuName() {
      return this.skuName;
   }

   @JsonProperty("bind_type")
   public void setBindType(Integer[] bindType) {
      this.bindType = bindType;
   }

   @JsonProperty("bind_type")
   public Integer[] getBindType() {
      return this.bindType;
   }

   @JsonProperty("jd_price")
   public void setJdPrice(String[] jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jd_price")
   public String[] getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("promo_price")
   public void setPromoPrice(String[] promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promo_price")
   public String[] getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("item_num")
   public void setItemNum(String[] itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("item_num")
   public String[] getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("limit_num")
   public void setLimitNum(Integer[] limitNum) {
      this.limitNum = limitNum;
   }

   @JsonProperty("limit_num")
   public Integer[] getLimitNum() {
      return this.limitNum;
   }

   @JsonProperty("sku_status")
   public void setSkuStatus(Integer[] skuStatus) {
      this.skuStatus = skuStatus;
   }

   @JsonProperty("sku_status")
   public Integer[] getSkuStatus() {
      return this.skuStatus;
   }

   @JsonProperty("seq")
   public void setSeq(Integer[] seq) {
      this.seq = seq;
   }

   @JsonProperty("seq")
   public Integer[] getSeq() {
      return this.seq;
   }

   @JsonProperty("display")
   public void setDisplay(Integer[] display) {
      this.display = display;
   }

   @JsonProperty("display")
   public Integer[] getDisplay() {
      return this.display;
   }

   @JsonProperty("is_need_to_buy")
   public void setIsNeedToBuy(Integer[] isNeedToBuy) {
      this.isNeedToBuy = isNeedToBuy;
   }

   @JsonProperty("is_need_to_buy")
   public Integer[] getIsNeedToBuy() {
      return this.isNeedToBuy;
   }

   @JsonProperty("created")
   public void setCreated(Date[] created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date[] getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date[] modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date[] getModified() {
      return this.modified;
   }

   @JsonProperty("rfId")
   public void setRfId(Long[] rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public Long[] getRfId() {
      return this.rfId;
   }
}
