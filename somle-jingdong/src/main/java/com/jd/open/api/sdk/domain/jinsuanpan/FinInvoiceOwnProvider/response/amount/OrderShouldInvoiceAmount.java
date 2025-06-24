package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.amount;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class OrderShouldInvoiceAmount implements Serializable {
   private String orderId;
   private String venderId;
   private String ivcTitle;
   private String customerTaxNo;
   private Integer ivcContentType;
   private String ivcContentName;
   private String customerEmail;
   private BigDecimal shouldInvoiceAmount;
   private List<OrderShouldInvoiceAmountDetail> orderShouldInvoiceAmountDetailList;

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

   @JsonProperty("ivcTitle")
   public void setIvcTitle(String ivcTitle) {
      this.ivcTitle = ivcTitle;
   }

   @JsonProperty("ivcTitle")
   public String getIvcTitle() {
      return this.ivcTitle;
   }

   @JsonProperty("customerTaxNo")
   public void setCustomerTaxNo(String customerTaxNo) {
      this.customerTaxNo = customerTaxNo;
   }

   @JsonProperty("customerTaxNo")
   public String getCustomerTaxNo() {
      return this.customerTaxNo;
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

   @JsonProperty("customerEmail")
   public void setCustomerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
   }

   @JsonProperty("customerEmail")
   public String getCustomerEmail() {
      return this.customerEmail;
   }

   @JsonProperty("shouldInvoiceAmount")
   public void setShouldInvoiceAmount(BigDecimal shouldInvoiceAmount) {
      this.shouldInvoiceAmount = shouldInvoiceAmount;
   }

   @JsonProperty("shouldInvoiceAmount")
   public BigDecimal getShouldInvoiceAmount() {
      return this.shouldInvoiceAmount;
   }

   @JsonProperty("orderShouldInvoiceAmountDetailList")
   public void setOrderShouldInvoiceAmountDetailList(List<OrderShouldInvoiceAmountDetail> orderShouldInvoiceAmountDetailList) {
      this.orderShouldInvoiceAmountDetailList = orderShouldInvoiceAmountDetailList;
   }

   @JsonProperty("orderShouldInvoiceAmountDetailList")
   public List<OrderShouldInvoiceAmountDetail> getOrderShouldInvoiceAmountDetailList() {
      return this.orderShouldInvoiceAmountDetailList;
   }
}
