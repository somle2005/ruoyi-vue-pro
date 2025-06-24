package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderPrintDataWare implements Serializable {
   private String wareId;
   private String wareName;
   private String num;
   private String jdPrice;
   private String price;
   private String produceNo;

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_name")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("ware_name")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("num")
   public void setNum(String num) {
      this.num = num;
   }

   @JsonProperty("num")
   public String getNum() {
      return this.num;
   }

   @JsonProperty("jd_price")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jd_price")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty("price")
   public String getPrice() {
      return this.price;
   }

   @JsonProperty("produce_no")
   public void setProduceNo(String produceNo) {
      this.produceNo = produceNo;
   }

   @JsonProperty("produce_no")
   public String getProduceNo() {
      return this.produceNo;
   }
}
