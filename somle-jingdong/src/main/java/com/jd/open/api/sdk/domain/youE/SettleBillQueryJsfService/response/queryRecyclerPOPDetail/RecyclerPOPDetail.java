package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.response.queryRecyclerPOPDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class RecyclerPOPDetail implements Serializable {
   private BigDecimal withholdAmount;
   private String orderNo;
   private Integer newOrderState;
   private Integer withholdState;
   private String recyclerName;
   private String newOrderId;
   private BigDecimal oldPayoutAmount;
   private Integer oldPayoutState;
   private String withholdOrderId;
   private Integer newOrderReturnState;
   private String settleNo;

   @JsonProperty("withholdAmount")
   public void setWithholdAmount(BigDecimal withholdAmount) {
      this.withholdAmount = withholdAmount;
   }

   @JsonProperty("withholdAmount")
   public BigDecimal getWithholdAmount() {
      return this.withholdAmount;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("newOrderState")
   public void setNewOrderState(Integer newOrderState) {
      this.newOrderState = newOrderState;
   }

   @JsonProperty("newOrderState")
   public Integer getNewOrderState() {
      return this.newOrderState;
   }

   @JsonProperty("withholdState")
   public void setWithholdState(Integer withholdState) {
      this.withholdState = withholdState;
   }

   @JsonProperty("withholdState")
   public Integer getWithholdState() {
      return this.withholdState;
   }

   @JsonProperty("recyclerName")
   public void setRecyclerName(String recyclerName) {
      this.recyclerName = recyclerName;
   }

   @JsonProperty("recyclerName")
   public String getRecyclerName() {
      return this.recyclerName;
   }

   @JsonProperty("newOrderId")
   public void setNewOrderId(String newOrderId) {
      this.newOrderId = newOrderId;
   }

   @JsonProperty("newOrderId")
   public String getNewOrderId() {
      return this.newOrderId;
   }

   @JsonProperty("oldPayoutAmount")
   public void setOldPayoutAmount(BigDecimal oldPayoutAmount) {
      this.oldPayoutAmount = oldPayoutAmount;
   }

   @JsonProperty("oldPayoutAmount")
   public BigDecimal getOldPayoutAmount() {
      return this.oldPayoutAmount;
   }

   @JsonProperty("oldPayoutState")
   public void setOldPayoutState(Integer oldPayoutState) {
      this.oldPayoutState = oldPayoutState;
   }

   @JsonProperty("oldPayoutState")
   public Integer getOldPayoutState() {
      return this.oldPayoutState;
   }

   @JsonProperty("withholdOrderId")
   public void setWithholdOrderId(String withholdOrderId) {
      this.withholdOrderId = withholdOrderId;
   }

   @JsonProperty("withholdOrderId")
   public String getWithholdOrderId() {
      return this.withholdOrderId;
   }

   @JsonProperty("newOrderReturnState")
   public void setNewOrderReturnState(Integer newOrderReturnState) {
      this.newOrderReturnState = newOrderReturnState;
   }

   @JsonProperty("newOrderReturnState")
   public Integer getNewOrderReturnState() {
      return this.newOrderReturnState;
   }

   @JsonProperty("settleNo")
   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   @JsonProperty("settleNo")
   public String getSettleNo() {
      return this.settleNo;
   }
}
