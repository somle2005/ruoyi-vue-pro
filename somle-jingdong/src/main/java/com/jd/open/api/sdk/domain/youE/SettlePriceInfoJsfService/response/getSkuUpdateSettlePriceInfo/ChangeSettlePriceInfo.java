package com.jd.open.api.sdk.domain.youE.SettlePriceInfoJsfService.response.getSkuUpdateSettlePriceInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ChangeSettlePriceInfo implements Serializable {
   private String skuName;
   private Date modifyDate;
   private BigDecimal afterChangeSettleprice;
   private Long id;
   private BigDecimal beforeChangeSettleprice;
   private String sku;
   private Integer type;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("modifyDate")
   public void setModifyDate(Date modifyDate) {
      this.modifyDate = modifyDate;
   }

   @JsonProperty("modifyDate")
   public Date getModifyDate() {
      return this.modifyDate;
   }

   @JsonProperty("afterChangeSettleprice")
   public void setAfterChangeSettleprice(BigDecimal afterChangeSettleprice) {
      this.afterChangeSettleprice = afterChangeSettleprice;
   }

   @JsonProperty("afterChangeSettleprice")
   public BigDecimal getAfterChangeSettleprice() {
      return this.afterChangeSettleprice;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("beforeChangeSettleprice")
   public void setBeforeChangeSettleprice(BigDecimal beforeChangeSettleprice) {
      this.beforeChangeSettleprice = beforeChangeSettleprice;
   }

   @JsonProperty("beforeChangeSettleprice")
   public BigDecimal getBeforeChangeSettleprice() {
      return this.beforeChangeSettleprice;
   }

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }
}
