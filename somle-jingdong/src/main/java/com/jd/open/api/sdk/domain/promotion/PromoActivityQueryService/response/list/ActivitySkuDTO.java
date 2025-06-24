package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class ActivitySkuDTO implements Serializable {
   private Long skuId;
   private String skuName;
   private Long spuId;
   private Integer skuBound;
   private Integer skuBindType;
   private String promoPrice;
   private Integer discountType;
   private String discount;
   private String originPrice;
   private Integer num;
   private Long rfId;
   private Integer deleted;
   private Integer seq;
   private Date created;
   private Date modified;
   private Integer buyType;
   private Map<String, String> extMap;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("skuBound")
   public void setSkuBound(Integer skuBound) {
      this.skuBound = skuBound;
   }

   @JsonProperty("skuBound")
   public Integer getSkuBound() {
      return this.skuBound;
   }

   @JsonProperty("skuBindType")
   public void setSkuBindType(Integer skuBindType) {
      this.skuBindType = skuBindType;
   }

   @JsonProperty("skuBindType")
   public Integer getSkuBindType() {
      return this.skuBindType;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public String getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("discountType")
   public void setDiscountType(Integer discountType) {
      this.discountType = discountType;
   }

   @JsonProperty("discountType")
   public Integer getDiscountType() {
      return this.discountType;
   }

   @JsonProperty("discount")
   public void setDiscount(String discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public String getDiscount() {
      return this.discount;
   }

   @JsonProperty("originPrice")
   public void setOriginPrice(String originPrice) {
      this.originPrice = originPrice;
   }

   @JsonProperty("originPrice")
   public String getOriginPrice() {
      return this.originPrice;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("rfId")
   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public Long getRfId() {
      return this.rfId;
   }

   @JsonProperty("deleted")
   public void setDeleted(Integer deleted) {
      this.deleted = deleted;
   }

   @JsonProperty("deleted")
   public Integer getDeleted() {
      return this.deleted;
   }

   @JsonProperty("seq")
   public void setSeq(Integer seq) {
      this.seq = seq;
   }

   @JsonProperty("seq")
   public Integer getSeq() {
      return this.seq;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("buyType")
   public void setBuyType(Integer buyType) {
      this.buyType = buyType;
   }

   @JsonProperty("buyType")
   public Integer getBuyType() {
      return this.buyType;
   }

   @JsonProperty("extMap")
   public void setExtMap(Map<String, String> extMap) {
      this.extMap = extMap;
   }

   @JsonProperty("extMap")
   public Map<String, String> getExtMap() {
      return this.extMap;
   }
}
