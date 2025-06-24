package com.jd.open.api.sdk.domain.ware.JosStockService.request.set;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosUpdateStockReq implements Serializable {
   private String updateModel;
   private String stockRfId;
   private List<JosSkuStock> skuStocks;

   @JsonProperty("updateModel")
   public void setUpdateModel(String updateModel) {
      this.updateModel = updateModel;
   }

   @JsonProperty("updateModel")
   public String getUpdateModel() {
      return this.updateModel;
   }

   @JsonProperty("stockRfId")
   public void setStockRfId(String stockRfId) {
      this.stockRfId = stockRfId;
   }

   @JsonProperty("stockRfId")
   public String getStockRfId() {
      return this.stockRfId;
   }

   @JsonProperty("skuStocks")
   public void setSkuStocks(List<JosSkuStock> skuStocks) {
      this.skuStocks = skuStocks;
   }

   @JsonProperty("skuStocks")
   public List<JosSkuStock> getSkuStocks() {
      return this.skuStocks;
   }
}
