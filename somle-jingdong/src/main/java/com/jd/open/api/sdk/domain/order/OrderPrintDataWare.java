package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderPrintDataWare {
   private String wareId;
   private String wareName;
   private String num;
   private String jdPrice;
   private String price;
   private String produceNo;

   @JsonProperty("produce_no")
   public String getProduceNo() {
      return this.produceNo;
   }

   @JsonProperty("produce_no")
   public void setProduceNo(String produceNo) {
      this.produceNo = produceNo;
   }

   @JsonProperty("ware")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_name")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("ware_name")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("num")
   public String getNum() {
      return this.num;
   }

   @JsonProperty("num")
   public void setNum(String num) {
      this.num = num;
   }

   @JsonProperty("jd_price")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("jd_price")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("price")
   public String getPrice() {
      return this.price;
   }

   @JsonProperty("price")
   public void setPrice(String price) {
      this.price = price;
   }
}
