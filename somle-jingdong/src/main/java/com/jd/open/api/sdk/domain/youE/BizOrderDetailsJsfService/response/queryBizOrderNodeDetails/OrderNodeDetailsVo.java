package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderNodeDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderNodeDetailsVo implements Serializable {
   private String fixMethod;
   private Date firstOperationDate;
   private String bookDateLast;
   private Date cancelSubmitTime;
   private String orderNo;
   private Date orgAcceptTime;
   private Date pointAcceptTime;
   private String remark;
   private Date lastOperationDate;
   private String barcode2;
   private String barcode1;
   private String failureDesc;
   private Date nodeServceTime;
   private Date completeSubmitTime;
   private String orderNodeDescribe;
   private String failureReason;
   private String state;
   private String bookDateFirst;
   private String cancelReason;
   private String serviceTypeName;

   @JsonProperty("fixMethod")
   public void setFixMethod(String fixMethod) {
      this.fixMethod = fixMethod;
   }

   @JsonProperty("fixMethod")
   public String getFixMethod() {
      return this.fixMethod;
   }

   @JsonProperty("firstOperationDate")
   public void setFirstOperationDate(Date firstOperationDate) {
      this.firstOperationDate = firstOperationDate;
   }

   @JsonProperty("firstOperationDate")
   public Date getFirstOperationDate() {
      return this.firstOperationDate;
   }

   @JsonProperty("bookDateLast")
   public void setBookDateLast(String bookDateLast) {
      this.bookDateLast = bookDateLast;
   }

   @JsonProperty("bookDateLast")
   public String getBookDateLast() {
      return this.bookDateLast;
   }

   @JsonProperty("cancelSubmitTime")
   public void setCancelSubmitTime(Date cancelSubmitTime) {
      this.cancelSubmitTime = cancelSubmitTime;
   }

   @JsonProperty("cancelSubmitTime")
   public Date getCancelSubmitTime() {
      return this.cancelSubmitTime;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("orgAcceptTime")
   public void setOrgAcceptTime(Date orgAcceptTime) {
      this.orgAcceptTime = orgAcceptTime;
   }

   @JsonProperty("orgAcceptTime")
   public Date getOrgAcceptTime() {
      return this.orgAcceptTime;
   }

   @JsonProperty("pointAcceptTime")
   public void setPointAcceptTime(Date pointAcceptTime) {
      this.pointAcceptTime = pointAcceptTime;
   }

   @JsonProperty("pointAcceptTime")
   public Date getPointAcceptTime() {
      return this.pointAcceptTime;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("lastOperationDate")
   public void setLastOperationDate(Date lastOperationDate) {
      this.lastOperationDate = lastOperationDate;
   }

   @JsonProperty("lastOperationDate")
   public Date getLastOperationDate() {
      return this.lastOperationDate;
   }

   @JsonProperty("barcode2")
   public void setBarcode2(String barcode2) {
      this.barcode2 = barcode2;
   }

   @JsonProperty("barcode2")
   public String getBarcode2() {
      return this.barcode2;
   }

   @JsonProperty("barcode1")
   public void setBarcode1(String barcode1) {
      this.barcode1 = barcode1;
   }

   @JsonProperty("barcode1")
   public String getBarcode1() {
      return this.barcode1;
   }

   @JsonProperty("failureDesc")
   public void setFailureDesc(String failureDesc) {
      this.failureDesc = failureDesc;
   }

   @JsonProperty("failureDesc")
   public String getFailureDesc() {
      return this.failureDesc;
   }

   @JsonProperty("nodeServceTime")
   public void setNodeServceTime(Date nodeServceTime) {
      this.nodeServceTime = nodeServceTime;
   }

   @JsonProperty("nodeServceTime")
   public Date getNodeServceTime() {
      return this.nodeServceTime;
   }

   @JsonProperty("completeSubmitTime")
   public void setCompleteSubmitTime(Date completeSubmitTime) {
      this.completeSubmitTime = completeSubmitTime;
   }

   @JsonProperty("completeSubmitTime")
   public Date getCompleteSubmitTime() {
      return this.completeSubmitTime;
   }

   @JsonProperty("orderNodeDescribe")
   public void setOrderNodeDescribe(String orderNodeDescribe) {
      this.orderNodeDescribe = orderNodeDescribe;
   }

   @JsonProperty("orderNodeDescribe")
   public String getOrderNodeDescribe() {
      return this.orderNodeDescribe;
   }

   @JsonProperty("failureReason")
   public void setFailureReason(String failureReason) {
      this.failureReason = failureReason;
   }

   @JsonProperty("failureReason")
   public String getFailureReason() {
      return this.failureReason;
   }

   @JsonProperty("state")
   public void setState(String state) {
      this.state = state;
   }

   @JsonProperty("state")
   public String getState() {
      return this.state;
   }

   @JsonProperty("bookDateFirst")
   public void setBookDateFirst(String bookDateFirst) {
      this.bookDateFirst = bookDateFirst;
   }

   @JsonProperty("bookDateFirst")
   public String getBookDateFirst() {
      return this.bookDateFirst;
   }

   @JsonProperty("cancelReason")
   public void setCancelReason(String cancelReason) {
      this.cancelReason = cancelReason;
   }

   @JsonProperty("cancelReason")
   public String getCancelReason() {
      return this.cancelReason;
   }

   @JsonProperty("serviceTypeName")
   public void setServiceTypeName(String serviceTypeName) {
      this.serviceTypeName = serviceTypeName;
   }

   @JsonProperty("serviceTypeName")
   public String getServiceTypeName() {
      return this.serviceTypeName;
   }
}
