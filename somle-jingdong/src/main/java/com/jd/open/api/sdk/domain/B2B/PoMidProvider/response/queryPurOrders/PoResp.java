package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PoResp implements Serializable {
   private String poVenderCode;
   private Integer poValidState;
   private String companyName;
   private Long popVenderId;
   private Integer orderState;
   private BigDecimal poRealAmount;
   private Long industryId;
   private Integer invoiceType;
   private Date modified;
   private String thirdPoId;
   private Date created;
   private Integer ignoreAudit;
   private String submitFailMsg;
   private Date submitPoTime;
   private Integer splitFlag;
   private Integer poSource;
   private Long popShopId;
   private BigDecimal poAmount;
   private Integer poAfterSalesStatus;
   private Long poId;
   private Integer paymentType;
   private Integer shipmentType;
   private Long jbeanNumber;
   private String poShopName;
   private Integer submitResultFlag;
   private String poRemark;
   private Integer poStatus;
   private String userClientIp;
   private Integer poTier;
   private Date submitOrderTime;
   private String userName;
   private Long userId;
   private String poUserShopName;
   private Long parentId;
   private String userPin;
   private BigDecimal freightFee;
   private Long jdOrderId;
   private Integer jdOrderStatus;
   private CartResp cartResp;
   private PoDetailResp poDetailResp;

   @JsonProperty("poVenderCode")
   public void setPoVenderCode(String poVenderCode) {
      this.poVenderCode = poVenderCode;
   }

   @JsonProperty("poVenderCode")
   public String getPoVenderCode() {
      return this.poVenderCode;
   }

   @JsonProperty("poValidState")
   public void setPoValidState(Integer poValidState) {
      this.poValidState = poValidState;
   }

   @JsonProperty("poValidState")
   public Integer getPoValidState() {
      return this.poValidState;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("popVenderId")
   public void setPopVenderId(Long popVenderId) {
      this.popVenderId = popVenderId;
   }

   @JsonProperty("popVenderId")
   public Long getPopVenderId() {
      return this.popVenderId;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("poRealAmount")
   public void setPoRealAmount(BigDecimal poRealAmount) {
      this.poRealAmount = poRealAmount;
   }

   @JsonProperty("poRealAmount")
   public BigDecimal getPoRealAmount() {
      return this.poRealAmount;
   }

   @JsonProperty("industryId")
   public void setIndustryId(Long industryId) {
      this.industryId = industryId;
   }

   @JsonProperty("industryId")
   public Long getIndustryId() {
      return this.industryId;
   }

   @JsonProperty("invoiceType")
   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoiceType")
   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("thirdPoId")
   public void setThirdPoId(String thirdPoId) {
      this.thirdPoId = thirdPoId;
   }

   @JsonProperty("thirdPoId")
   public String getThirdPoId() {
      return this.thirdPoId;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("ignoreAudit")
   public void setIgnoreAudit(Integer ignoreAudit) {
      this.ignoreAudit = ignoreAudit;
   }

   @JsonProperty("ignoreAudit")
   public Integer getIgnoreAudit() {
      return this.ignoreAudit;
   }

   @JsonProperty("submitFailMsg")
   public void setSubmitFailMsg(String submitFailMsg) {
      this.submitFailMsg = submitFailMsg;
   }

   @JsonProperty("submitFailMsg")
   public String getSubmitFailMsg() {
      return this.submitFailMsg;
   }

   @JsonProperty("submitPoTime")
   public void setSubmitPoTime(Date submitPoTime) {
      this.submitPoTime = submitPoTime;
   }

   @JsonProperty("submitPoTime")
   public Date getSubmitPoTime() {
      return this.submitPoTime;
   }

   @JsonProperty("splitFlag")
   public void setSplitFlag(Integer splitFlag) {
      this.splitFlag = splitFlag;
   }

   @JsonProperty("splitFlag")
   public Integer getSplitFlag() {
      return this.splitFlag;
   }

   @JsonProperty("poSource")
   public void setPoSource(Integer poSource) {
      this.poSource = poSource;
   }

   @JsonProperty("poSource")
   public Integer getPoSource() {
      return this.poSource;
   }

   @JsonProperty("popShopId")
   public void setPopShopId(Long popShopId) {
      this.popShopId = popShopId;
   }

   @JsonProperty("popShopId")
   public Long getPopShopId() {
      return this.popShopId;
   }

   @JsonProperty("poAmount")
   public void setPoAmount(BigDecimal poAmount) {
      this.poAmount = poAmount;
   }

   @JsonProperty("poAmount")
   public BigDecimal getPoAmount() {
      return this.poAmount;
   }

   @JsonProperty("poAfterSalesStatus")
   public void setPoAfterSalesStatus(Integer poAfterSalesStatus) {
      this.poAfterSalesStatus = poAfterSalesStatus;
   }

   @JsonProperty("poAfterSalesStatus")
   public Integer getPoAfterSalesStatus() {
      return this.poAfterSalesStatus;
   }

   @JsonProperty("poId")
   public void setPoId(Long poId) {
      this.poId = poId;
   }

   @JsonProperty("poId")
   public Long getPoId() {
      return this.poId;
   }

   @JsonProperty("paymentType")
   public void setPaymentType(Integer paymentType) {
      this.paymentType = paymentType;
   }

   @JsonProperty("paymentType")
   public Integer getPaymentType() {
      return this.paymentType;
   }

   @JsonProperty("shipmentType")
   public void setShipmentType(Integer shipmentType) {
      this.shipmentType = shipmentType;
   }

   @JsonProperty("shipmentType")
   public Integer getShipmentType() {
      return this.shipmentType;
   }

   @JsonProperty("jbeanNumber")
   public void setJbeanNumber(Long jbeanNumber) {
      this.jbeanNumber = jbeanNumber;
   }

   @JsonProperty("jbeanNumber")
   public Long getJbeanNumber() {
      return this.jbeanNumber;
   }

   @JsonProperty("poShopName")
   public void setPoShopName(String poShopName) {
      this.poShopName = poShopName;
   }

   @JsonProperty("poShopName")
   public String getPoShopName() {
      return this.poShopName;
   }

   @JsonProperty("submitResultFlag")
   public void setSubmitResultFlag(Integer submitResultFlag) {
      this.submitResultFlag = submitResultFlag;
   }

   @JsonProperty("submitResultFlag")
   public Integer getSubmitResultFlag() {
      return this.submitResultFlag;
   }

   @JsonProperty("poRemark")
   public void setPoRemark(String poRemark) {
      this.poRemark = poRemark;
   }

   @JsonProperty("poRemark")
   public String getPoRemark() {
      return this.poRemark;
   }

   @JsonProperty("poStatus")
   public void setPoStatus(Integer poStatus) {
      this.poStatus = poStatus;
   }

   @JsonProperty("poStatus")
   public Integer getPoStatus() {
      return this.poStatus;
   }

   @JsonProperty("userClientIp")
   public void setUserClientIp(String userClientIp) {
      this.userClientIp = userClientIp;
   }

   @JsonProperty("userClientIp")
   public String getUserClientIp() {
      return this.userClientIp;
   }

   @JsonProperty("poTier")
   public void setPoTier(Integer poTier) {
      this.poTier = poTier;
   }

   @JsonProperty("poTier")
   public Integer getPoTier() {
      return this.poTier;
   }

   @JsonProperty("submitOrderTime")
   public void setSubmitOrderTime(Date submitOrderTime) {
      this.submitOrderTime = submitOrderTime;
   }

   @JsonProperty("submitOrderTime")
   public Date getSubmitOrderTime() {
      return this.submitOrderTime;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("userId")
   public void setUserId(Long userId) {
      this.userId = userId;
   }

   @JsonProperty("userId")
   public Long getUserId() {
      return this.userId;
   }

   @JsonProperty("poUserShopName")
   public void setPoUserShopName(String poUserShopName) {
      this.poUserShopName = poUserShopName;
   }

   @JsonProperty("poUserShopName")
   public String getPoUserShopName() {
      return this.poUserShopName;
   }

   @JsonProperty("parentId")
   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Long getParentId() {
      return this.parentId;
   }

   @JsonProperty("userPin")
   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   @JsonProperty("userPin")
   public String getUserPin() {
      return this.userPin;
   }

   @JsonProperty("freightFee")
   public void setFreightFee(BigDecimal freightFee) {
      this.freightFee = freightFee;
   }

   @JsonProperty("freightFee")
   public BigDecimal getFreightFee() {
      return this.freightFee;
   }

   @JsonProperty("jdOrderId")
   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   @JsonProperty("jdOrderId")
   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   @JsonProperty("jdOrderStatus")
   public void setJdOrderStatus(Integer jdOrderStatus) {
      this.jdOrderStatus = jdOrderStatus;
   }

   @JsonProperty("jdOrderStatus")
   public Integer getJdOrderStatus() {
      return this.jdOrderStatus;
   }

   @JsonProperty("cartResp")
   public void setCartResp(CartResp cartResp) {
      this.cartResp = cartResp;
   }

   @JsonProperty("cartResp")
   public CartResp getCartResp() {
      return this.cartResp;
   }

   @JsonProperty("poDetailResp")
   public void setPoDetailResp(PoDetailResp poDetailResp) {
      this.poDetailResp = poDetailResp;
   }

   @JsonProperty("poDetailResp")
   public PoDetailResp getPoDetailResp() {
      return this.poDetailResp;
   }
}
