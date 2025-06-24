package com.jd.open.api.sdk.domain.stock.StoreService.response.createStockInBillForSam;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ItemInfo implements Serializable {
   private Long[] itemId;
   private Long[] num;
   private Double[] price;
   private Double[] money;
   private String[] remark;

   @JsonProperty("item_id")
   public void setItemId(Long[] itemId) {
      this.itemId = itemId;
   }

   @JsonProperty("item_id")
   public Long[] getItemId() {
      return this.itemId;
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
