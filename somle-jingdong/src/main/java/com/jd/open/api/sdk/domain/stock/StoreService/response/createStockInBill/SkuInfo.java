package com.jd.open.api.sdk.domain.stock.StoreService.response.createStockInBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuInfo implements Serializable {
   private Long[] skuCode;
   private Long[] num;
   private Double[] price;
   private Double[] money;
   private String[] remark;

   @JsonProperty("sku_code")
   public void setSkuCode(Long[] skuCode) {
      this.skuCode = skuCode;
   }

   @JsonProperty("sku_code")
   public Long[] getSkuCode() {
      return this.skuCode;
   }

   @JsonProperty("num")
   public void setNum(Long[] num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Long[] getNum() {
      return this.num;
   }

   @JsonProperty("price")
   public void setPrice(Double[] price) {
      this.price = price;
   }

   @JsonProperty("price")
   public Double[] getPrice() {
      return this.price;
   }

   @JsonProperty("money")
   public void setMoney(Double[] money) {
      this.money = money;
   }

   @JsonProperty("money")
   public Double[] getMoney() {
      return this.money;
   }

   @JsonProperty("remark")
   public void setRemark(String[] remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String[] getRemark() {
      return this.remark;
   }
}
