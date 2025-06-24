package com.jd.open.api.sdk.domain.supplier.VcStockInJosAPI.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VcInStockSkuDto implements Serializable {
   private String goodsSku;
   private String goodsName;
   private String goodsCount;
   private String companyCode;
   private String distribCenterCode;
   private String warehouseCode;

   @JsonProperty("goodsSku")
   public void setGoodsSku(String goodsSku) {
      this.goodsSku = goodsSku;
   }

   @JsonProperty("goodsSku")
   public String getGoodsSku() {
      return this.goodsSku;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("goodsCount")
   public void setGoodsCount(String goodsCount) {
      this.goodsCount = goodsCount;
   }

   @JsonProperty("goodsCount")
   public String getGoodsCount() {
      return this.goodsCount;
   }

   @JsonProperty("companyCode")
   public void setCompanyCode(String companyCode) {
      this.companyCode = companyCode;
   }

   @JsonProperty("companyCode")
   public String getCompanyCode() {
      return this.companyCode;
   }

   @JsonProperty("distribCenterCode")
   public void setDistribCenterCode(String distribCenterCode) {
      this.distribCenterCode = distribCenterCode;
   }

   @JsonProperty("distribCenterCode")
   public String getDistribCenterCode() {
      return this.distribCenterCode;
   }

   @JsonProperty("warehouseCode")
   public void setWarehouseCode(String warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   @JsonProperty("warehouseCode")
   public String getWarehouseCode() {
      return this.warehouseCode;
   }
}
