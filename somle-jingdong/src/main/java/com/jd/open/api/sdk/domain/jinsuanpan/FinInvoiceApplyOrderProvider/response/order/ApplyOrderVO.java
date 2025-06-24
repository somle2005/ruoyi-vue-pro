package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceApplyOrderProvider.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ApplyOrderVO implements Serializable {
   private Integer sourceId;
   private String logisticsReceiverAddress;
   private Long orderId;
   private Long venderId;
   private String consumerPhone;
   private String orderCompleteTime;
   private String rejectReason;
   private Integer invoiceTitleType;
   private String consumerTaxId;
   private Integer invoiceType;
   private String applyTime;
   private String invoiceTitle;
   private String consumerAddress;
   private String logisticsReceiverName;
   private String consumerBankAccount;
   private String logisticsReceiverPhone;
   private String auditTime;
   private Integer invoiceStatus;
   private String consumerBankName;
   private Long applyId;
   private Integer ivcContentType;
   private String ivcContentName;
   private String customerEmail;
   private BigDecimal shouldInvoiceAmount;
   private List<OrderShouldInvoiceAmountDetail> orderShouldInvoiceAmountDetailList;
   private Long companyId;
   private String companyName;

   @JsonProperty("sourceId")
   public void setSourceId(Integer sourceId) {
      this.sourceId = sourceId;
   }

   @JsonProperty("sourceId")
   public Integer getSourceId() {
      return this.sourceId;
   }

   @JsonProperty("logisticsReceiverAddress")
   public void setLogisticsReceiverAddress(String logisticsReceiverAddress) {
      this.logisticsReceiverAddress = logisticsReceiverAddress;
   }

   @JsonProperty("logisticsReceiverAddress")
   public String getLogisticsReceiverAddress() {
      return this.logisticsReceiverAddress;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("consumerPhone")
   public void setConsumerPhone(String consumerPhone) {
      this.consumerPhone = consumerPhone;
   }

   @JsonProperty("consumerPhone")
   public String getConsumerPhone() {
      return this.consumerPhone;
   }

   @JsonProperty("orderCompleteTime")
   public void setOrderCompleteTime(String orderCompleteTime) {
      this.orderCompleteTime = orderCompleteTime;
   }

   @JsonProperty("orderCompleteTime")
   public String getOrderCompleteTime() {
      return this.orderCompleteTime;
   }

   @JsonProperty("rejectReason")
   public void setRejectReason(String rejectReason) {
      this.rejectReason = rejectReason;
   }

   @JsonProperty("rejectReason")
   public String getRejectReason() {
      return this.rejectReason;
   }

   @JsonProperty("invoiceTitleType")
   public void setInvoiceTitleType(Integer invoiceTitleType) {
      this.invoiceTitleType = invoiceTitleType;
   }

   @JsonProperty("invoiceTitleType")
   public Integer getInvoiceTitleType() {
      return this.invoiceTitleType;
   }

   @JsonProperty("consumerTaxId")
   public void setConsumerTaxId(String consumerTaxId) {
      this.consumerTaxId = consumerTaxId;
   }

   @JsonProperty("consumerTaxId")
   public String getConsumerTaxId() {
      return this.consumerTaxId;
   }

   @JsonProperty("invoiceType")
   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoiceType")
   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("applyTime")
   public void setApplyTime(String applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public String getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("invoiceTitle")
   public void setInvoiceTitle(String invoiceTitle) {
      this.invoiceTitle = invoiceTitle;
   }

   @JsonProperty("invoiceTitle")
   public String getInvoiceTitle() {
      return this.invoiceTitle;
   }

   @JsonProperty("consumerAddress")
   public void setConsumerAddress(String consumerAddress) {
      this.consumerAddress = consumerAddress;
   }

   @JsonProperty("consumerAddress")
   public String getConsumerAddress() {
      return this.consumerAddress;
   }

   @JsonProperty("logisticsReceiverName")
   public void setLogisticsReceiverName(String logisticsReceiverName) {
      this.logisticsReceiverName = logisticsReceiverName;
   }

   @JsonProperty("logisticsReceiverName")
   public String getLogisticsReceiverName() {
      return this.logisticsReceiverName;
   }

   @JsonProperty("consumerBankAccount")
   public void setConsumerBankAccount(String consumerBankAccount) {
      this.consumerBankAccount = consumerBankAccount;
   }

   @JsonProperty("consumerBankAccount")
   public String getConsumerBankAccount() {
      return this.consumerBankAccount;
   }

   @JsonProperty("logisticsReceiverPhone")
   public void setLogisticsReceiverPhone(String logisticsReceiverPhone) {
      this.logisticsReceiverPhone = logisticsReceiverPhone;
   }

   @JsonProperty("logisticsReceiverPhone")
   public String getLogisticsReceiverPhone() {
      return this.logisticsReceiverPhone;
   }

   @JsonProperty("auditTime")
   public void setAuditTime(String auditTime) {
      this.auditTime = auditTime;
   }

   @JsonProperty("auditTime")
   public String getAuditTime() {
      return this.auditTime;
   }

   @JsonProperty("invoiceStatus")
   public void setInvoiceStatus(Integer invoiceStatus) {
      this.invoiceStatus = invoiceStatus;
   }

   @JsonProperty("invoiceStatus")
   public Integer getInvoiceStatus() {
      return this.invoiceStatus;
   }

   @JsonProperty("consumerBankName")
   public void setConsumerBankName(String consumerBankName) {
      this.consumerBankName = consumerBankName;
   }

   @JsonProperty("consumerBankName")
   public String getConsumerBankName() {
      return this.consumerBankName;
   }

   @JsonProperty("applyId")
   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("applyId")
   public Long getApplyId() {
      return this.applyId;
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

   @JsonProperty("companyId")
   public void setCompanyId(Long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Long getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }
}
