package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ApiOrderPrintData implements Serializable {
   private String id;
   private String outBoundDate;
   private String bfDeliGoodGlag;
   private String codTimeName;
   private String remark;
   private String cky2Name;
   private String sortingCode;
   private String createDate;
   private String shouldPay;
   private String paymentTypeStr;
   private String partner;
   private String generade;
   private String itemsCount;
   private List<OrderPrintDataWare> orderItems;
   private OrderPrintDataConsignee Consignee;
   private String pickUpSign;
   private String orderLevelSign;
   private BigDecimal freight;
   private String codDT;

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("out_bound_date")
   public void setOutBoundDate(String outBoundDate) {
      this.outBoundDate = outBoundDate;
   }

   @JsonProperty("out_bound_date")
   public String getOutBoundDate() {
      return this.outBoundDate;
   }

   @JsonProperty("bf_deli_good_glag")
   public void setBfDeliGoodGlag(String bfDeliGoodGlag) {
      this.bfDeliGoodGlag = bfDeliGoodGlag;
   }

   @JsonProperty("bf_deli_good_glag")
   public String getBfDeliGoodGlag() {
      return this.bfDeliGoodGlag;
   }

   @JsonProperty("cod_time_name")
   public void setCodTimeName(String codTimeName) {
      this.codTimeName = codTimeName;
   }

   @JsonProperty("cod_time_name")
   public String getCodTimeName() {
      return this.codTimeName;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("cky2_name")
   public void setCky2Name(String cky2Name) {
      this.cky2Name = cky2Name;
   }

   @JsonProperty("cky2_name")
   public String getCky2Name() {
      return this.cky2Name;
   }

   @JsonProperty("sorting_code")
   public void setSortingCode(String sortingCode) {
      this.sortingCode = sortingCode;
   }

   @JsonProperty("sorting_code")
   public String getSortingCode() {
      return this.sortingCode;
   }

   @JsonProperty("create_date")
   public void setCreateDate(String createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("create_date")
   public String getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("should_pay")
   public void setShouldPay(String shouldPay) {
      this.shouldPay = shouldPay;
   }

   @JsonProperty("should_pay")
   public String getShouldPay() {
      return this.shouldPay;
   }

   @JsonProperty("payment_typeStr")
   public void setPaymentTypeStr(String paymentTypeStr) {
      this.paymentTypeStr = paymentTypeStr;
   }

   @JsonProperty("payment_typeStr")
   public String getPaymentTypeStr() {
      return this.paymentTypeStr;
   }

   @JsonProperty("partner")
   public void setPartner(String partner) {
      this.partner = partner;
   }

   @JsonProperty("partner")
   public String getPartner() {
      return this.partner;
   }

   @JsonProperty("generade")
   public void setGenerade(String generade) {
      this.generade = generade;
   }

   @JsonProperty("generade")
   public String getGenerade() {
      return this.generade;
   }

   @JsonProperty("items_count")
   public void setItemsCount(String itemsCount) {
      this.itemsCount = itemsCount;
   }

   @JsonProperty("items_count")
   public String getItemsCount() {
      return this.itemsCount;
   }

   @JsonProperty("order_items")
   public void setOrderItems(List<OrderPrintDataWare> orderItems) {
      this.orderItems = orderItems;
   }

   @JsonProperty("order_items")
   public List<OrderPrintDataWare> getOrderItems() {
      return this.orderItems;
   }

   @JsonProperty("Consignee")
   public void setConsignee(OrderPrintDataConsignee Consignee) {
      this.Consignee = Consignee;
   }

   @JsonProperty("Consignee")
   public OrderPrintDataConsignee getConsignee() {
      return this.Consignee;
   }

   @JsonProperty("pickUpSign")
   public void setPickUpSign(String pickUpSign) {
      this.pickUpSign = pickUpSign;
   }

   @JsonProperty("pickUpSign")
   public String getPickUpSign() {
      return this.pickUpSign;
   }

   @JsonProperty("orderLevelSign")
   public void setOrderLevelSign(String orderLevelSign) {
      this.orderLevelSign = orderLevelSign;
   }

   @JsonProperty("orderLevelSign")
   public String getOrderLevelSign() {
      return this.orderLevelSign;
   }

   @JsonProperty("freight")
   public void setFreight(BigDecimal freight) {
      this.freight = freight;
   }

   @JsonProperty("freight")
   public BigDecimal getFreight() {
      return this.freight;
   }

   @JsonProperty("codDT")
   public void setCodDT(String codDT) {
      this.codDT = codDT;
   }

   @JsonProperty("codDT")
   public String getCodDT() {
      return this.codDT;
   }
}
