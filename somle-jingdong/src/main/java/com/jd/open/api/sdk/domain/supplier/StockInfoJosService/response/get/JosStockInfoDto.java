package com.jd.open.api.sdk.domain.supplier.StockInfoJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosStockInfoDto implements Serializable {
   private String[] vendorCode;
   private String[] deliverCenterCode;
   private String[] jdSku;
   private String[] stockNum;

   @JsonProperty("vendorCode")
   public void setVendorCode(String[] vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String[] getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("deliverCenterCode")
   public void setDeliverCenterCode(String[] deliverCenterCode) {
      this.deliverCenterCode = deliverCenterCode;
   }

   @JsonProperty("deliverCenterCode")
   public String[] getDeliverCenterCode() {
      return this.deliverCenterCode;
   }

   @JsonProperty("jdSku")
   public void setJdSku(String[] jdSku) {
      this.jdSku = jdSku;
   }

   @JsonProperty("jdSku")
   public String[] getJdSku() {
      return this.jdSku;
   }

   @JsonProperty("stockNum")
   public void setStockNum(String[] stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public String[] getStockNum() {
      return this.stockNum;
   }
}
