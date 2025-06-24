package com.jd.open.api.sdk.domain.ware.ReserveProductJosService.request.commit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SetReserveProductParam implements Serializable {
   private Long skuId;
   private Integer advanceType;
   private Integer pickDays;
   private Date pickDate;
   private Long productId;
   private Integer storeId;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("advanceType")
   public void setAdvanceType(Integer advanceType) {
      this.advanceType = advanceType;
   }

   @JsonProperty("advanceType")
   public Integer getAdvanceType() {
      return this.advanceType;
   }

   @JsonProperty("pickDays")
   public void setPickDays(Integer pickDays) {
      this.pickDays = pickDays;
   }

   @JsonProperty("pickDays")
   public Integer getPickDays() {
      return this.pickDays;
   }

   @JsonProperty("pickDate")
   public void setPickDate(Date pickDate) {
      this.pickDate = pickDate;
   }

   @JsonProperty("pickDate")
   public Date getPickDate() {
      return this.pickDate;
   }

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("storeId")
   public void setStoreId(Integer storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Integer getStoreId() {
      return this.storeId;
   }
}
