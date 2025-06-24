package com.jd.open.api.sdk.domain.supplier.IDpsSearchAllOrdersInterface.response.searchAllOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class QueryListOrderDetailInfo implements Serializable {
   private String sku;
   private String wareName;
   private String upc;
   private Integer wareNum;
   private BigDecimal jdPrice;
   private BigDecimal discount;
   private BigDecimal cost;
   private Long poId;
   private Long roId;
   private String extInfo;

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("wareNum")
   public void setWareNum(Integer wareNum) {
      this.wareNum = wareNum;
   }

   @JsonProperty("wareNum")
   public Integer getWareNum() {
      return this.wareNum;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("cost")
   public void setCost(BigDecimal cost) {
      this.cost = cost;
   }

   @JsonProperty("cost")
   public BigDecimal getCost() {
      return this.cost;
   }

   @JsonProperty("poId")
   public void setPoId(Long poId) {
      this.poId = poId;
   }

   @JsonProperty("poId")
   public Long getPoId() {
      return this.poId;
   }

   @JsonProperty("roId")
   public void setRoId(Long roId) {
      this.roId = roId;
   }

   @JsonProperty("roId")
   public Long getRoId() {
      return this.roId;
   }

   @JsonProperty("extInfo")
   public void setExtInfo(String extInfo) {
      this.extInfo = extInfo;
   }

   @JsonProperty("extInfo")
   public String getExtInfo() {
      return this.extInfo;
   }
}
