package com.jd.open.api.sdk.domain.EPT.WareApiClient.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class WareSkuApiVO implements Serializable {
   private Long[] skuId;
   private Long[] wareId;
   private Integer[] status;
   private String[] rfId;
   private String[] attributes;
   private BigDecimal[] supplyPrice;
   private Integer[] stock;
   private String[] imgUri;
   private String[] hsCode;

   @JsonProperty("skuId")
   public void setSkuId(Long[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long[] getSkuId() {
      return this.skuId;
   }

   @JsonProperty("wareId")
   public void setWareId(Long[] wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long[] getWareId() {
      return this.wareId;
   }

   @JsonProperty("status")
   public void setStatus(Integer[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer[] getStatus() {
      return this.status;
   }

   @JsonProperty("rfId")
   public void setRfId(String[] rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public String[] getRfId() {
      return this.rfId;
   }

   @JsonProperty("attributes")
   public void setAttributes(String[] attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("attributes")
   public String[] getAttributes() {
      return this.attributes;
   }

   @JsonProperty("supplyPrice")
   public void setSupplyPrice(BigDecimal[] supplyPrice) {
      this.supplyPrice = supplyPrice;
   }

   @JsonProperty("supplyPrice")
   public BigDecimal[] getSupplyPrice() {
      return this.supplyPrice;
   }

   @JsonProperty("stock")
   public void setStock(Integer[] stock) {
      this.stock = stock;
   }

   @JsonProperty("stock")
   public Integer[] getStock() {
      return this.stock;
   }

   @JsonProperty("imgUri")
   public void setImgUri(String[] imgUri) {
      this.imgUri = imgUri;
   }

   @JsonProperty("imgUri")
   public String[] getImgUri() {
      return this.imgUri;
   }

   @JsonProperty("hsCode")
   public void setHsCode(String[] hsCode) {
      this.hsCode = hsCode;
   }

   @JsonProperty("hsCode")
   public String[] getHsCode() {
      return this.hsCode;
   }
}
