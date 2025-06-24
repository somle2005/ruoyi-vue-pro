package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderSoplPrintData extends OrderPrintData {
   private String pickUpSign;
   private int pickUpSignType;
   private String orderLevelSign;
   private int orderLevelType;

   @JsonProperty("orderLevelSign")
   public String getOrderLevelSign() {
      return this.orderLevelSign;
   }

   @JsonProperty("orderLevelSign")
   public void setOrderLevelSign(String orderLevelSign) {
      this.orderLevelSign = orderLevelSign;
   }

   @JsonProperty("orderLevel_Type")
   public int getOrderLevelType() {
      return this.orderLevelType;
   }

   @JsonProperty("orderLevel_Type")
   public void setOrderLevelType(int orderLevelType) {
      this.orderLevelType = orderLevelType;
   }

   @JsonProperty("pickUpSign")
   public String getPickUpSign() {
      return this.pickUpSign;
   }

   @JsonProperty("pickUpSign")
   public void setPickUpSign(String pickUpSign) {
      this.pickUpSign = pickUpSign;
   }

   @JsonProperty("pickUpSign_type")
   public int getPickUpSignType() {
      return this.pickUpSignType;
   }

   @JsonProperty("pickUpSign_type")
   public void setPickUpSignType(int pickUpSignType) {
      this.pickUpSignType = pickUpSignType;
   }
}
