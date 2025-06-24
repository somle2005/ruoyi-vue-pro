package com.jd.open.api.sdk.domain.ware.JosStockService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosQueryStockVo implements Serializable {
   private List<JosSkuStock> skuStockInfos;
   private Long skuId;
   private String stockModel;

   @JsonProperty("skuStockInfos")
   public void setSkuStockInfos(List<JosSkuStock> skuStockInfos) {
      this.skuStockInfos = skuStockInfos;
   }

   @JsonProperty("skuStockInfos")
   public List<JosSkuStock> getSkuStockInfos() {
      return this.skuStockInfos;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("stockModel")
   public void setStockModel(String stockModel) {
      this.stockModel = stockModel;
   }

   @JsonProperty("stockModel")
   public String getStockModel() {
      return this.stockModel;
   }
}
