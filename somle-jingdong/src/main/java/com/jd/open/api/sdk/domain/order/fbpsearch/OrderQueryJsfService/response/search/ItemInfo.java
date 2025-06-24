package com.jd.open.api.sdk.domain.order.fbpsearch.OrderQueryJsfService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ItemInfo implements Serializable {
   private String skuId;
   private String outerSkuId;
   private String skuName;
   private String jdPrice;
   private String giftPoint;
   private String wareId;
   private String itemTotal;
   private String serviceName;
   private String invoiceContentId;

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("outerSkuId")
   public void setOuterSkuId(String outerSkuId) {
      this.outerSkuId = outerSkuId;
   }

   @JsonProperty("outerSkuId")
   public String getOuterSkuId() {
      return this.outerSkuId;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("giftPoint")
   public void setGiftPoint(String giftPoint) {
      this.giftPoint = giftPoint;
   }

   @JsonProperty("giftPoint")
   public String getGiftPoint() {
      return this.giftPoint;
   }

   @JsonProperty("wareId")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("itemTotal")
   public void setItemTotal(String itemTotal) {
      this.itemTotal = itemTotal;
   }

   @JsonProperty("itemTotal")
   public String getItemTotal() {
      return this.itemTotal;
   }

   @JsonProperty("serviceName")
   public void setServiceName(String serviceName) {
      this.serviceName = serviceName;
   }

   @JsonProperty("serviceName")
   public String getServiceName() {
      return this.serviceName;
   }

   @JsonProperty("invoiceContentId")
   public void setInvoiceContentId(String invoiceContentId) {
      this.invoiceContentId = invoiceContentId;
   }

   @JsonProperty("invoiceContentId")
   public String getInvoiceContentId() {
      return this.invoiceContentId;
   }
}
