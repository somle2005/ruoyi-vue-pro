package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.enGet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OutPlatformOrderInfo implements Serializable {
   private String ctpOrderId;
   private String ctpParentOrderId;
   private String ctpShopId;
   private String ctpWhere;
   private String ctpName;
   private String ctpMobile;

   @JsonProperty("ctpOrderId")
   public void setCtpOrderId(String ctpOrderId) {
      this.ctpOrderId = ctpOrderId;
   }

   @JsonProperty("ctpOrderId")
   public String getCtpOrderId() {
      return this.ctpOrderId;
   }

   @JsonProperty("ctpParentOrderId")
   public void setCtpParentOrderId(String ctpParentOrderId) {
      this.ctpParentOrderId = ctpParentOrderId;
   }

   @JsonProperty("ctpParentOrderId")
   public String getCtpParentOrderId() {
      return this.ctpParentOrderId;
   }

   @JsonProperty("ctpShopId")
   public void setCtpShopId(String ctpShopId) {
      this.ctpShopId = ctpShopId;
   }

   @JsonProperty("ctpShopId")
   public String getCtpShopId() {
      return this.ctpShopId;
   }

   @JsonProperty("ctpWhere")
   public void setCtpWhere(String ctpWhere) {
      this.ctpWhere = ctpWhere;
   }

   @JsonProperty("ctpWhere")
   public String getCtpWhere() {
      return this.ctpWhere;
   }

   @JsonProperty("ctpName")
   public void setCtpName(String ctpName) {
      this.ctpName = ctpName;
   }

   @JsonProperty("ctpName")
   public String getCtpName() {
      return this.ctpName;
   }

   @JsonProperty("ctpMobile")
   public void setCtpMobile(String ctpMobile) {
      this.ctpMobile = ctpMobile;
   }

   @JsonProperty("ctpMobile")
   public String getCtpMobile() {
      return this.ctpMobile;
   }
}
