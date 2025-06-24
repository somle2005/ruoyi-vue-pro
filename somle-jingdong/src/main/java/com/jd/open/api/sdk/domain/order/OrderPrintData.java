package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class OrderPrintData {
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
   private String freight;
   private List<OrderPrintDataWare> wList;
   private OrderPrintDataConsignee csnee;
   private String invoiceType;
   private String invoiceContent;
   private String invoiceTitle;
   private String pickUpSign;
   private int pickUpSignType;
   private String orderLevelSign;
   private int orderLevelType;

   @JsonProperty("pickUpSign_Type")
   public int getPickUpSignType() {
      return this.pickUpSignType;
   }

   @JsonProperty("pickUpSign_Type")
   public void setPickUpSignType(int pickUpSignType) {
      this.pickUpSignType = pickUpSignType;
   }

   @JsonProperty("orderLevel_Type")
   public int getOrderLevelType() {
      return this.orderLevelType;
   }

   @JsonProperty("orderLevel_Type")
   public void setOrderLevelType(int orderLevelType) {
      this.orderLevelType = orderLevelType;
   }

   @JsonProperty("invoice_Type")
   public String getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("invoice_Type")
   public void setInvoiceType(String invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoice_Content")
   public String getInvoiceContent() {
      return this.invoiceContent;
   }

   @JsonProperty("invoice_Content")
   public void setInvoiceContent(String invoiceContent) {
      this.invoiceContent = invoiceContent;
   }

   @JsonProperty("invoice_Title")
   public String getInvoiceTitle() {
      return this.invoiceTitle;
   }

   @JsonProperty("invoice_Title")
   public void setInvoiceTitle(String invoiceTitle) {
      this.invoiceTitle = invoiceTitle;
   }

   @JsonProperty("pickUpSign")
   public String getPickUpSign() {
      return this.pickUpSign;
   }

   @JsonProperty("pickUpSign")
   public void setPickUpSign(String pickUpSign) {
      this.pickUpSign = pickUpSign;
   }

   @JsonProperty("orderLevelSign")
   public String getOrderLevelSign() {
      return this.orderLevelSign;
   }

   @JsonProperty("orderLevelSign")
   public void setOrderLevelSign(String orderLevelSign) {
      this.orderLevelSign = orderLevelSign;
   }

   @JsonProperty("freight")
   public String getFreight() {
      return this.freight;
   }

   @JsonProperty("freight")
   public void setFreight(String freight) {
      this.freight = freight;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("out_bound_date")
   public String getOutBoundDate() {
      return this.outBoundDate;
   }

   @JsonProperty("out_bound_date")
   public void setOutBoundDate(String outBoundDate) {
      this.outBoundDate = outBoundDate;
   }

   @JsonProperty("bf_deli_good_glag")
   public String getBfDeliGoodGlag() {
      return this.bfDeliGoodGlag;
   }

   @JsonProperty("bf_deli_good_glag")
   public void setBfDeliGoodGlag(String bfDeliGoodGlag) {
      this.bfDeliGoodGlag = bfDeliGoodGlag;
   }

   @JsonProperty("cod_time_name")
   public String getCodTimeName() {
      return this.codTimeName;
   }

   @JsonProperty("cod_time_name")
   public void setCodTimeName(String codTimeName) {
      this.codTimeName = codTimeName;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("cky2_name")
   public String getCky2Name() {
      return this.cky2Name;
   }

   @JsonProperty("cky2_name")
   public void setCky2Name(String cky2Name) {
      this.cky2Name = cky2Name;
   }

   @JsonProperty("sorting_code")
   public String getSortingCode() {
      return this.sortingCode;
   }

   @JsonProperty("sorting_code")
   public void setSortingCode(String sortingCode) {
      this.sortingCode = sortingCode;
   }

   @JsonProperty("create_date")
   public String getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("create_date")
   public void setCreateDate(String createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("should_pay")
   public String getShouldPay() {
      return this.shouldPay;
   }

   @JsonProperty("should_pay")
   public void setShouldPay(String shouldPay) {
      this.shouldPay = shouldPay;
   }

   @JsonProperty("payment_typeStr")
   public String getPaymentTypeStr() {
      return this.paymentTypeStr;
   }

   @JsonProperty("payment_typeStr")
   public void setPaymentTypeStr(String paymentTypeStr) {
      this.paymentTypeStr = paymentTypeStr;
   }

   @JsonProperty("partner")
   public String getPartner() {
      return this.partner;
   }

   @JsonProperty("partner")
   public void setPartner(String partner) {
      this.partner = partner;
   }

   @JsonProperty("generade")
   public String getGenerade() {
      return this.generade;
   }

   @JsonProperty("generade")
   public void setGenerade(String generade) {
      this.generade = generade;
   }

   @JsonProperty("items_count")
   public String getItemsCount() {
      return this.itemsCount;
   }

   @JsonProperty("items_count")
   public void setItemsCount(String itemsCount) {
      this.itemsCount = itemsCount;
   }

   @JsonProperty("order_item")
   public List<OrderPrintDataWare> getwList() {
      return this.wList;
   }

   @JsonProperty("order_item")
   public void setwList(List<OrderPrintDataWare> wList) {
      this.wList = wList;
   }

   @JsonProperty("Consignee")
   public OrderPrintDataConsignee getCsnee() {
      return this.csnee;
   }

   @JsonProperty("Consignee")
   public void setCsnee(OrderPrintDataConsignee csnee) {
      this.csnee = csnee;
   }
}
