package com.jd.open.api.sdk.domain.ware.ReserveProductJosService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReserveFlagResponse implements Serializable {
   private Integer bookFlag;
   private Long timeTemplateId;
   private Long skuId;
   private Integer advanceType;
   private String advancePromise;

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

   @JsonProperty("advancePromise")
   public void setAdvancePromise(String advancePromise) {
      this.advancePromise = advancePromise;
   }

   @JsonProperty("advancePromise")
   public String getAdvancePromise() {
      return this.advancePromise;
   }
}
