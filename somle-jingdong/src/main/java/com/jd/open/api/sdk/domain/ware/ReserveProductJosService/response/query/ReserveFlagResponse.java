package com.jd.open.api.sdk.domain.ware.ReserveProductJosService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReserveFlagResponse implements Serializable {
   private String advancePromise;
   private Integer bookFlag;
   private Long timeTemplateId;
   private Integer advanceType;
   private Integer storeId;
   private Long skuId;

   @JsonProperty("advancePromise")
   public void setAdvancePromise(String advancePromise) {
      this.advancePromise = advancePromise;
   }

   @JsonProperty("advancePromise")
   public String getAdvancePromise() {
      return this.advancePromise;
   }

   @JsonProperty("bookFlag")
   public void setBookFlag(Integer bookFlag) {
      this.bookFlag = bookFlag;
   }

   @JsonProperty("bookFlag")
   public Integer getBookFlag() {
      return this.bookFlag;
   }

   @JsonProperty("timeTemplateId")
   public void setTimeTemplateId(Long timeTemplateId) {
      this.timeTemplateId = timeTemplateId;
   }

   @JsonProperty("timeTemplateId")
   public Long getTimeTemplateId() {
      return this.timeTemplateId;
   }

   @JsonProperty("advanceType")
   public void setAdvanceType(Integer advanceType) {
      this.advanceType = advanceType;
   }

   @JsonProperty("advanceType")
   public Integer getAdvanceType() {
      return this.advanceType;
   }

   @JsonProperty("storeId")
   public void setStoreId(Integer storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Integer getStoreId() {
      return this.storeId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
