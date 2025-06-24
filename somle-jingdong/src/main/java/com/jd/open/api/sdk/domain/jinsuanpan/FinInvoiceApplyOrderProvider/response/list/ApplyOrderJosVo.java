package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceApplyOrderProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ApplyOrderJosVo implements Serializable {
   private String invoiceTypeName;
   private Integer sourceId;
   private String invoiceStatusName;
   private String logisticsReceiverAddress;
   private String invoiceContentTypeName;
   private Long orderId;
   private Integer invoiceContentType;
   private String companyName;
   private Long venderId;
   private String consumerPhone;
   private BigDecimal invoiceAmount;
   private Date orderCompleteTime;
   private String rejectReason;
   private Integer invoiceTitleType;
   private String consumerTaxId;
   private Integer invoiceType;
   private String invoiceTitleTypeName;
   private Integer ivcContentType;
   private Date applyTime;
   private String invoiceTitle;
   private String consumerAddress;
   private String logisticsReceiverName;
   private String ivcContentName;
   private Long companyId;
   private String consumerBankAccount;
   private String logisticsReceiverPhone;
   private Date auditTime;
   private List<OrderAmountDetailJosVo> amountDetail;
   private String sourceName;
   private Integer userType;
   private Integer invoiceStatus;
   private String consumerBankName;
   private String oaid;

   @JsonProperty("invoiceTypeName")
   public void setInvoiceTypeName(String invoiceTypeName) {
      this.invoiceTypeName = invoiceTypeName;
   }

   @JsonProperty("invoiceTypeName")
   public String getInvoiceTypeName() {
      return this.invoiceTypeName;
   }

   @JsonProperty("sourceId")
   public void setSourceId(Integer sourceId) {
      this.sourceId = sourceId;
   }

   @JsonProperty("sourceId")
   public Integer getSourceId() {
      return this.sourceId;
   }

   @JsonProperty("invoiceStatusName")
   public void setInvoiceStatusName(String invoiceStatusName) {
      this.invoiceStatusName = invoiceStatusName;
   }

   @JsonProperty("invoiceStatusName")
   public String getInvoiceStatusName() {
      return this.invoiceStatusName;
   }

   @JsonProperty("logisticsReceiverAddress")
   public void setLogisticsReceiverAddress(String logisticsReceiverAddress) {
      this.logisticsReceiverAddress = logisticsReceiverAddress;
   }

   @JsonProperty("logisticsReceiverAddress")
   public String getLogisticsReceiverAddress() {
      return this.logisticsReceiverAddress;
   }

   @JsonProperty("invoiceContentTypeName")
   public void setInvoiceContentTypeName(String invoiceContentTypeName) {
      this.invoiceContentTypeName = invoiceContentTypeName;
   }

   @JsonProperty("invoiceContentTypeName")
   public String getInvoiceContentTypeName() {
      return this.invoiceContentTypeName;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("invoiceContentType")
   public void setInvoiceContentType(Integer invoiceContentType) {
      this.invoiceContentType = invoiceContentType;
   }

   @JsonProperty("invoiceContentType")
   public Integer getInvoiceContentType() {
      return this.invoiceContentType;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
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

   @JsonProperty("invoiceAmount")
   public void setInvoiceAmount(BigDecimal invoiceAmount) {
      this.invoiceAmount = invoiceAmount;
   }

   @JsonProperty("invoiceAmount")
   public BigDecimal getInvoiceAmount() {
      return this.invoiceAmount;
   }

   @JsonProperty("orderCompleteTime")
   public void setOrderCompleteTime(Date orderCompleteTime) {
      this.orderCompleteTime = orderCompleteTime;
   }

   @JsonProperty("orderCompleteTime")
   public Date getOrderCompleteTime() {
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

   @JsonProperty("invoiceTitleTypeName")
   public void setInvoiceTitleTypeName(String invoiceTitleTypeName) {
      this.invoiceTitleTypeName = invoiceTitleTypeName;
   }

   @JsonProperty("invoiceTitleTypeName")
   public String getInvoiceTitleTypeName() {
      return this.invoiceTitleTypeName;
   }

   @JsonProperty("ivcContentType")
   public void setIvcContentType(Integer ivcContentType) {
      this.ivcContentType = ivcContentType;
   }

   @JsonProperty("ivcContentType")
   public Integer getIvcContentType() {
      return this.ivcContentType;
   }

   @JsonProperty("applyTime")
   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public Date getApplyTime() {
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

   @JsonProperty("ivcContentName")
   public void setIvcContentName(String ivcContentName) {
      this.ivcContentName = ivcContentName;
   }

   @JsonProperty("ivcContentName")
   public String getIvcContentName() {
      return this.ivcContentName;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Long getCompanyId() {
      return this.companyId;
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
   public void setAuditTime(Date auditTime) {
      this.auditTime = auditTime;
   }

   @JsonProperty("auditTime")
   public Date getAuditTime() {
      return this.auditTime;
   }

   @JsonProperty("amountDetail")
   public void setAmountDetail(List<OrderAmountDetailJosVo> amountDetail) {
      this.amountDetail = amountDetail;
   }

   @JsonProperty("amountDetail")
   public List<OrderAmountDetailJosVo> getAmountDetail() {
      return this.amountDetail;
   }

   @JsonProperty("sourceName")
   public void setSourceName(String sourceName) {
      this.sourceName = sourceName;
   }

   @JsonProperty("sourceName")
   public String getSourceName() {
      return this.sourceName;
   }

   @JsonProperty("userType")
   public void setUserType(Integer userType) {
      this.userType = userType;
   }

   @JsonProperty("userType")
   public Integer getUserType() {
      return this.userType;
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

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
