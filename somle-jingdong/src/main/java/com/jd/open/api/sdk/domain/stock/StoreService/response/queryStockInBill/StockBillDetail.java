package com.jd.open.api.sdk.domain.stock.StoreService.response.queryStockInBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StockBillDetail implements Serializable {
   private Long skuId;
   private Long wareId;
   private Double price;
   private Long applyNum;
   private Double applyMoney;
   private Long realNum;
   private Double realMoney;
   private String remark;
   private String title;
   private String attributes;

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("price")
   public void setPrice(Double price) {
      this.price = price;
   }

   @JsonProperty("price")
   public Double getPrice() {
      return this.price;
   }

   @JsonProperty("apply_num")
   public void setApplyNum(Long applyNum) {
      this.applyNum = applyNum;
   }

   @JsonProperty("apply_num")
   public Long getApplyNum() {
      return this.applyNum;
   }

   @JsonProperty("apply_money")
   public void setApplyMoney(Double applyMoney) {
      this.applyMoney = applyMoney;
   }

   @JsonProperty("apply_money")
   public Double getApplyMoney() {
      return this.applyMoney;
   }

   @JsonProperty("real_num")
   public void setRealNum(Long realNum) {
      this.realNum = realNum;
   }

   @JsonProperty("real_num")
   public Long getRealNum() {
      return this.realNum;
   }

   @JsonProperty("real_money")
   public void setRealMoney(Double realMoney) {
      this.realMoney = realMoney;
   }

   @JsonProperty("real_money")
   public Double getRealMoney() {
      return this.realMoney;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("attributes")
   public void setAttributes(String attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("attributes")
   public String getAttributes() {
      return this.attributes;
   }
}
