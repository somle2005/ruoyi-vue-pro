package com.jd.open.api.sdk.domain.supplier.ProductConfigSdkService.request.setProductConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductConfigInfoDto implements Serializable {
   private Integer skuStockNum;
   private Integer promiseDays;
   private Integer czFlag;
   private Long skuId;

   @JsonProperty("skuStockNum")
   public void setSkuStockNum(Integer skuStockNum) {
      this.skuStockNum = skuStockNum;
   }

   @JsonProperty("skuStockNum")
   public Integer getSkuStockNum() {
      return this.skuStockNum;
   }

   @JsonProperty("promiseDays")
   public void setPromiseDays(Integer promiseDays) {
      this.promiseDays = promiseDays;
   }

   @JsonProperty("promiseDays")
   public Integer getPromiseDays() {
      return this.promiseDays;
   }

   @JsonProperty("czFlag")
   public void setCzFlag(Integer czFlag) {
      this.czFlag = czFlag;
   }

   @JsonProperty("czFlag")
   public Integer getCzFlag() {
      return this.czFlag;
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
