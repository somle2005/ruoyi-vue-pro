package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FinInvoiceOwnIvcDetail implements Serializable {
   private String id;
   private String orderId;
   private String venderId;
   private Integer status;
   private Integer invoiceType;
   private String receiverTaxNo;
   private String receiverName;
   private String invoiceCode;
   private Integer invoiceNo;
   private String ivcTitle;
   private String totalPrice;
   private String invoiceTime;
   private String pdfInfo;
   private Integer orderType;
   private Integer ivcContentType;
   private String ivcContentName;
   private String eiRemark;
   private String receiverAddress;
   private String receiverPhone;
   private String receiverBankName;
   private String receiverBankAccount;
   private String drawer;
   private String payee;
   private String blueInvoiceCode;
   private Integer blueInvoiceNo;

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("invoiceType")
   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoiceType")
   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("receiverTaxNo")
   public void setReceiverTaxNo(String receiverTaxNo) {
      this.receiverTaxNo = receiverTaxNo;
   }

   @JsonProperty("receiverTaxNo")
   public String getReceiverTaxNo() {
      return this.receiverTaxNo;
   }

   @JsonProperty("receiverName")
   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("receiverName")
   public String getReceiverName() {
      return this.receiverName;
   }

   @JsonProperty("invoiceCode")
   public void setInvoiceCode(String invoiceCode) {
      this.invoiceCode = invoiceCode;
   }

   @JsonProperty("invoiceCode")
   public String getInvoiceCode() {
      return this.invoiceCode;
   }

   @JsonProperty("invoiceNo")
   public void setInvoiceNo(Integer invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   @JsonProperty("invoiceNo")
   public Integer getInvoiceNo() {
      return this.invoiceNo;
   }

   @JsonProperty("ivcTitle")
   public void setIvcTitle(String ivcTitle) {
      this.ivcTitle = ivcTitle;
   }

   @JsonProperty("ivcTitle")
   public String getIvcTitle() {
      return this.ivcTitle;
   }

   @JsonProperty("totalPrice")
   public void setTotalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
   }

   @JsonProperty("totalPrice")
   public String getTotalPrice() {
      return this.totalPrice;
   }

   @JsonProperty("invoiceTime")
   public void setInvoiceTime(String invoiceTime) {
      this.invoiceTime = invoiceTime;
   }

   @JsonProperty("invoiceTime")
   public String getInvoiceTime() {
      return this.invoiceTime;
   }

   @JsonProperty("pdfInfo")
   public void setPdfInfo(String pdfInfo) {
      this.pdfInfo = pdfInfo;
   }

   @JsonProperty("pdfInfo")
   public String getPdfInfo() {
      return this.pdfInfo;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("ivcContentType")
   public void setIvcContentType(Integer ivcContentType) {
      this.ivcContentType = ivcContentType;
   }

   @JsonProperty("ivcContentType")
   public Integer getIvcContentType() {
      return this.ivcContentType;
   }

   @JsonProperty("ivcContentName")
   public void setIvcContentName(String ivcContentName) {
      this.ivcContentName = ivcContentName;
   }

   @JsonProperty("ivcContentName")
   public String getIvcContentName() {
      return this.ivcContentName;
   }

   @JsonProperty("eiRemark")
   public void setEiRemark(String eiRemark) {
      this.eiRemark = eiRemark;
   }

   @JsonProperty("eiRemark")
   public String getEiRemark() {
      return this.eiRemark;
   }

   @JsonProperty("receiverAddress")
   public void setReceiverAddress(String receiverAddress) {
      this.receiverAddress = receiverAddress;
   }

   @JsonProperty("receiverAddress")
   public String getReceiverAddress() {
      return this.receiverAddress;
   }

   @JsonProperty("receiverPhone")
   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   @JsonProperty("receiverPhone")
   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   @JsonProperty("receiverBankName")
   public void setReceiverBankName(String receiverBankName) {
      this.receiverBankName = receiverBankName;
   }

   @JsonProperty("receiverBankName")
   public String getReceiverBankName() {
      return this.receiverBankName;
   }

   @JsonProperty("receiverBankAccount")
   public void setReceiverBankAccount(String receiverBankAccount) {
      this.receiverBankAccount = receiverBankAccount;
   }

   @JsonProperty("receiverBankAccount")
   public String getReceiverBankAccount() {
      return this.receiverBankAccount;
   }

   @JsonProperty("drawer")
   public void setDrawer(String drawer) {
      this.drawer = drawer;
   }

   @JsonProperty("drawer")
   public String getDrawer() {
      return this.drawer;
   }

   @JsonProperty("payee")
   public void setPayee(String payee) {
      this.payee = payee;
   }

   @JsonProperty("payee")
   public String getPayee() {
      return this.payee;
   }

   @JsonProperty("blueInvoiceCode")
   public void setBlueInvoiceCode(String blueInvoiceCode) {
      this.blueInvoiceCode = blueInvoiceCode;
   }

   @JsonProperty("blueInvoiceCode")
   public String getBlueInvoiceCode() {
      return this.blueInvoiceCode;
   }

   @JsonProperty("blueInvoiceNo")
   public void setBlueInvoiceNo(Integer blueInvoiceNo) {
      this.blueInvoiceNo = blueInvoiceNo;
   }

   @JsonProperty("blueInvoiceNo")
   public Integer getBlueInvoiceNo() {
      return this.blueInvoiceNo;
   }
}
