package com.jd.open.api.sdk.domain.supplier.ISupplierStockSoaService.request.batchAddOrUpdateSupplierStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SupplierStockDto implements Serializable {
   private String wareHouseCode;
   private BigDecimal comingStockNum;
   private BigDecimal stockNum;
   private Date futureStockDate;
   private BigDecimal availableStockNum;
   private String thirdSkuId;
   private Date comingStockDate;
   private BigDecimal maxStockNum;
   private BigDecimal futureStockNum;

   @JsonProperty("wareHouseCode")
   public void setWareHouseCode(String wareHouseCode) {
      this.wareHouseCode = wareHouseCode;
   }

   @JsonProperty("wareHouseCode")
   public String getWareHouseCode() {
      return this.wareHouseCode;
   }

   @JsonProperty("comingStockNum")
   public void setComingStockNum(BigDecimal comingStockNum) {
      this.comingStockNum = comingStockNum;
   }

   @JsonProperty("comingStockNum")
   public BigDecimal getComingStockNum() {
      return this.comingStockNum;
   }

   @JsonProperty("stockNum")
   public void setStockNum(BigDecimal stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public BigDecimal getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("futureStockDate")
   public void setFutureStockDate(Date futureStockDate) {
      this.futureStockDate = futureStockDate;
   }

   @JsonProperty("futureStockDate")
   public Date getFutureStockDate() {
      return this.futureStockDate;
   }

   @JsonProperty("availableStockNum")
   public void setAvailableStockNum(BigDecimal availableStockNum) {
      this.availableStockNum = availableStockNum;
   }

   @JsonProperty("availableStockNum")
   public BigDecimal getAvailableStockNum() {
      return this.availableStockNum;
   }

   @JsonProperty("thirdSkuId")
   public void setThirdSkuId(String thirdSkuId) {
      this.thirdSkuId = thirdSkuId;
   }

   @JsonProperty("thirdSkuId")
   public String getThirdSkuId() {
      return this.thirdSkuId;
   }

   @JsonProperty("comingStockDate")
   public void setComingStockDate(Date comingStockDate) {
      this.comingStockDate = comingStockDate;
   }

   @JsonProperty("comingStockDate")
   public Date getComingStockDate() {
      return this.comingStockDate;
   }

   @JsonProperty("maxStockNum")
   public void setMaxStockNum(BigDecimal maxStockNum) {
      this.maxStockNum = maxStockNum;
   }

   @JsonProperty("maxStockNum")
   public BigDecimal getMaxStockNum() {
      return this.maxStockNum;
   }

   @JsonProperty("futureStockNum")
   public void setFutureStockNum(BigDecimal futureStockNum) {
      this.futureStockNum = futureStockNum;
   }

   @JsonProperty("futureStockNum")
   public BigDecimal getFutureStockNum() {
      return this.futureStockNum;
   }
}
